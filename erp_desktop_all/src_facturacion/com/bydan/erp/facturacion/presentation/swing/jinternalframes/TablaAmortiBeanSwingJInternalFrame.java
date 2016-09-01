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

import com.bydan.erp.facturacion.util.TablaAmortiConstantesFunciones;
import com.bydan.erp.facturacion.util.TablaAmortiParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TablaAmortiParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TablaAmortiBean;
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
public class TablaAmortiBeanSwingJInternalFrame extends TablaAmortiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TablaAmortiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TablaAmorti> tablaamortiValidator = new ClassValidator<TablaAmorti>(TablaAmorti.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TablaAmorti tablaamorti;	
	public TablaAmorti tablaamortiAux;
	public TablaAmorti tablaamortiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TablaAmorti tablaamortiTotales;
	public Long idTablaAmortiActual;
	public Long iIdNuevoTablaAmorti=0L;
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
	
	

	public Boolean isTienePermisosDetalleTablaAmorti=false;

	public Boolean getIsTienePermisosDetalleTablaAmorti() {
		return isTienePermisosDetalleTablaAmorti;
	}

	public void setIsTienePermisosDetalleTablaAmorti(Boolean isTienePermisosDetalleTablaAmorti) {
		this.isTienePermisosDetalleTablaAmorti= isTienePermisosDetalleTablaAmorti;
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
	
	public Boolean isPermisoTodoTablaAmorti;
	public Boolean isPermisoNuevoTablaAmorti;
	public Boolean isPermisoActualizarTablaAmorti;
	public Boolean isPermisoActualizarOriginalTablaAmorti;
	public Boolean isPermisoEliminarTablaAmorti;
	public Boolean isPermisoGuardarCambiosTablaAmorti;
	public Boolean isPermisoConsultaTablaAmorti;
	public Boolean isPermisoBusquedaTablaAmorti;
	public Boolean isPermisoReporteTablaAmorti;
	public Boolean isPermisoPaginacionMedioTablaAmorti;
	public Boolean isPermisoPaginacionAltoTablaAmorti;
	public Boolean isPermisoPaginacionTodoTablaAmorti;
	public Boolean isPermisoCopiarTablaAmorti;
	public Boolean isPermisoVerFormTablaAmorti;
	public Boolean isPermisoDuplicarTablaAmorti;
	public Boolean isPermisoOrdenTablaAmorti;
	
	
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
	
	public TablaAmortiParameterReturnGeneral tablaamortiReturnGeneral;
	public TablaAmortiParameterReturnGeneral tablaamortiParameterGeneral;
	
	

	public DetalleTablaAmortiLogic detalletablaamortiLogic=null;

	public DetalleTablaAmortiLogic getDetalleTablaAmortiLogic() {
		return detalletablaamortiLogic;
	}

	public void setDetalleTablaAmortiLogic(DetalleTablaAmortiLogic detalletablaamortiLogic) {
		this.detalletablaamortiLogic = detalletablaamortiLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTablaAmorti=false;
	public Boolean esParaAccionDesdeFormularioTablaAmorti=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TablaAmortiSessionBeanAdditional tablaamortiSessionBeanAdditional=null;
	
	public TablaAmortiSessionBeanAdditional getTablaAmortiSessionBeanAdditional() {
		return this.tablaamortiSessionBeanAdditional;
	}
	
	public void setTablaAmortiSessionBeanAdditional(TablaAmortiSessionBeanAdditional tablaamortiSessionBeanAdditional) {
		try {
			this.tablaamortiSessionBeanAdditional=tablaamortiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TablaAmortiBeanSwingJInternalFrameAdditional tablaamortiBeanSwingJInternalFrameAdditional=null;
	//public class TablaAmortiBeanSwingJInternalFrame
	
	public TablaAmortiBeanSwingJInternalFrameAdditional getTablaAmortiBeanSwingJInternalFrameAdditional() {
		return this.tablaamortiBeanSwingJInternalFrameAdditional;
	}
	
	public void setTablaAmortiBeanSwingJInternalFrameAdditional(TablaAmortiBeanSwingJInternalFrameAdditional tablaamortiBeanSwingJInternalFrameAdditional) {
		try {
			this.tablaamortiBeanSwingJInternalFrameAdditional=tablaamortiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TablaAmortiLogic tablaamortiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TablaAmorti tablaamortiBean;
	public TablaAmortiConstantesFunciones tablaamortiConstantesFunciones;
	//public TablaAmortiParameterReturnGeneral tablaamortiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public TasaLogic tasaLogic;
	public FacturaLogic facturaLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<TablaAmorti> tablaamortis;	
	//public List<TablaAmorti> tablaamortisEliminados;
	//public List<TablaAmorti> tablaamortisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTablaAmorti=false;
	public Boolean isVisibilidadCeldaDuplicarTablaAmorti=true;
	public Boolean isVisibilidadCeldaCopiarTablaAmorti=true;
	public Boolean isVisibilidadCeldaVerFormTablaAmorti=true;
	public Boolean isVisibilidadCeldaOrdenTablaAmorti=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
	public Boolean isVisibilidadCeldaModificarTablaAmorti=false;
	public Boolean isVisibilidadCeldaActualizarTablaAmorti=false;
	public Boolean isVisibilidadCeldaEliminarTablaAmorti=false;
	public Boolean isVisibilidadCeldaCancelarTablaAmorti=false;
	public Boolean isVisibilidadCeldaGuardarTablaAmorti=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTablaAmorti=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTasa=false;
	
	public Long getiIdNuevoTablaAmorti() {
		return this.iIdNuevoTablaAmorti;
	}

	public void setiIdNuevoTablaAmorti(Long iIdNuevoTablaAmorti) {
		this.iIdNuevoTablaAmorti = iIdNuevoTablaAmorti;
	}
	
	public Long getidTablaAmortiActual() {
		return this.idTablaAmortiActual;
	}

	public void setidTablaAmortiActual(Long idTablaAmortiActual) {
		this.idTablaAmortiActual = idTablaAmortiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TablaAmorti gettablaamorti() {
		return this.tablaamorti;
	}

	public void settablaamorti(TablaAmorti tablaamorti) {
		this.tablaamorti = tablaamorti;
	}
	
	public TablaAmorti gettablaamortiAux() {
		return this.tablaamortiAux;
	}

	public void settablaamortiAux(TablaAmorti tablaamortiAux) {
		this.tablaamortiAux = tablaamortiAux;
	}				
	
	public TablaAmorti gettablaamortiAnterior() {
		return this.tablaamortiAnterior;
	}

	public void settablaamortiAnterior(TablaAmorti tablaamortiAnterior) {
		this.tablaamortiAnterior = tablaamortiAnterior;
	}	
	
	public TablaAmorti gettablaamortiTotales() {
		return this.tablaamortiTotales;
	}

	public void settablaamortiTotales(TablaAmorti tablaamortiTotales) {
		this.tablaamortiTotales = tablaamortiTotales;
	}	
	
	public TablaAmorti gettablaamortiBean() {
		return this.tablaamortiBean;
	}

	public void settablaamortiBean(TablaAmorti tablaamortiBean) {
		this.tablaamortiBean = tablaamortiBean;
	}	
	
	public TablaAmortiParameterReturnGeneral gettablaamortiReturnGeneral() {
		return this.tablaamortiReturnGeneral;
	}

	public void settablaamortiReturnGeneral(TablaAmortiParameterReturnGeneral tablaamortiReturnGeneral) {
		this.tablaamortiReturnGeneral = tablaamortiReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TablaAmortiLogic getTablaAmortiLogic()	{		
		return tablaamortiLogic;
	}

	public void setTablaAmortiLogic(TablaAmortiLogic tablaamortiLogic) {
		this.tablaamortiLogic = tablaamortiLogic;
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
	
	public Boolean getIsEsNuevoTablaAmorti() {
		return isEsNuevoTablaAmorti;
	}

	public void setIsEsNuevoTablaAmorti(Boolean isEsNuevoTablaAmorti) {
		this.isEsNuevoTablaAmorti = isEsNuevoTablaAmorti;
	}

	public Boolean getEsParaAccionDesdeFormularioTablaAmorti() {
		return esParaAccionDesdeFormularioTablaAmorti;
	}
	
	public void setEsParaAccionDesdeFormularioTablaAmorti(Boolean esParaAccionDesdeFormularioTablaAmorti) {
		this.esParaAccionDesdeFormularioTablaAmorti = esParaAccionDesdeFormularioTablaAmorti;
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tablaamortiSessionBean.getlidEmpresaActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(tablaamortiSessionBean.getlidSucursalActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(tablaamortiSessionBean.getlidEjercicioActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(tablaamortiSessionBean.getlidPeriodoActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {
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
					tasaLogic.getEntityWithConnection(tablaamortiSessionBean.getlidTasaActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
					facturaLogic.getEntityWithConnection(tablaamortiSessionBean.getlidFacturaActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(tablaamortiSessionBean.getlidAnioActual());
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

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(tablaamortiSessionBean.getlidMesActual());
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTablaAmorti.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTablaAmortiGenerico)throws Exception
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
				jComboBoxid_empresaTablaAmortiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTablaAmortiGenerico!=null && jComboBoxid_empresaTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_empresaTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTablaAmorti.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTablaAmortiGenerico)throws Exception
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
				jComboBoxid_sucursalTablaAmortiGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTablaAmortiGenerico!=null && jComboBoxid_sucursalTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioTablaAmorti.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioTablaAmortiGenerico)throws Exception
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
				jComboBoxid_ejercicioTablaAmortiGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioTablaAmortiGenerico!=null && jComboBoxid_ejercicioTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoTablaAmorti.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoTablaAmortiGenerico)throws Exception
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
				jComboBoxid_periodoTablaAmortiGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoTablaAmortiGenerico!=null && jComboBoxid_periodoTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_periodoTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setTasa(tasaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setSelectedItem(tasaTemp);
					}
				} else {
					//jComboBoxid_tasaTablaAmorti.setSelectedItem(tasaTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTasa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tasaTemp!=null && jComboBoxid_tasaFK_IdTasaTablaAmorti!=null) {
						jComboBoxid_tasaFK_IdTasaTablaAmorti.setSelectedItem(tasaTemp);
					} else {
						if(jComboBoxid_tasaFK_IdTasaTablaAmorti!=null) {
							//jComboBoxid_tasaFK_IdTasaTablaAmorti.setSelectedItem(tasaTemp);
							if(jComboBoxid_tasaFK_IdTasaTablaAmorti.getItemCount()>0) {
								jComboBoxid_tasaFK_IdTasaTablaAmorti.setSelectedIndex(0);
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
	public void setActualTasaForeignKeyGenerico(Long idTasaSeleccionado,JComboBox jComboBoxid_tasaTablaAmortiGenerico)throws Exception
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
				jComboBoxid_tasaTablaAmortiGenerico.setSelectedItem(tasaTemp);
			} else {
				if(jComboBoxid_tasaTablaAmortiGenerico!=null && jComboBoxid_tasaTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_tasaTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaTablaAmorti.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaTablaAmorti!=null) {
						jComboBoxid_facturaFK_IdFacturaTablaAmorti.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaTablaAmorti!=null) {
							//jComboBoxid_facturaFK_IdFacturaTablaAmorti.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaTablaAmorti.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaTablaAmorti.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaTablaAmortiGenerico)throws Exception
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
				jComboBoxid_facturaTablaAmortiGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaTablaAmortiGenerico!=null && jComboBoxid_facturaTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_facturaTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioTablaAmorti.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioTablaAmortiGenerico)throws Exception
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
				jComboBoxid_anioTablaAmortiGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioTablaAmortiGenerico!=null && jComboBoxid_anioTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_anioTablaAmortiGenerico.setSelectedIndex(0);
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

					if(this.tablaamorti!=null) {
						this.tablaamorti.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesTablaAmorti.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
						if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.getItemCount()>0) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesTablaAmortiGenerico)throws Exception
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
				jComboBoxid_mesTablaAmortiGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesTablaAmortiGenerico!=null && jComboBoxid_mesTablaAmortiGenerico.getItemCount()>0) {
					jComboBoxid_mesTablaAmortiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_empresaTablaAmortiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTablaAmortiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTablaAmortiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tablaamorti.setid_empresa(empresaAux.getId());
				tablaamorti.setempresa_descripcion(TablaAmortiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tablaamorti.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_sucursalTablaAmortiGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTablaAmortiGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTablaAmortiGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				tablaamorti.setid_sucursal(sucursalAux.getId());
				tablaamorti.setsucursal_descripcion(TablaAmortiConstantesFunciones.getSucursalDescripcion(sucursalAux));
				tablaamorti.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_ejercicioTablaAmortiGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioTablaAmortiGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioTablaAmortiGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				tablaamorti.setid_ejercicio(ejercicioAux.getId());
				tablaamorti.setejercicio_descripcion(TablaAmortiConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				tablaamorti.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_periodoTablaAmortiGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoTablaAmortiGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoTablaAmortiGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				tablaamorti.setid_periodo(periodoAux.getId());
				tablaamorti.setperiodo_descripcion(TablaAmortiConstantesFunciones.getPeriodoDescripcion(periodoAux));
				tablaamorti.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTasaForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_tasaTablaAmortiGenerico)throws Exception
	{
		try
		{
			Tasa  tasaAux=new Tasa();

			if(jComboBoxid_tasaTablaAmortiGenerico==null) {
				tasaAux=(Tasa)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.getSelectedItem();
			} else {
				tasaAux=(Tasa)jComboBoxid_tasaTablaAmortiGenerico.getSelectedItem();
			}

			if(tasaAux!=null && tasaAux.getId()!=null) {
				tablaamorti.setid_tasa(tasaAux.getId());
				tablaamorti.settasa_descripcion(TablaAmortiConstantesFunciones.getTasaDescripcion(tasaAux));
				tablaamorti.setTasa(tasaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_facturaTablaAmortiGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaTablaAmortiGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaTablaAmortiGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				tablaamorti.setid_factura(facturaAux.getId());
				tablaamorti.setfactura_descripcion(TablaAmortiConstantesFunciones.getFacturaDescripcion(facturaAux));
				tablaamorti.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_anioTablaAmortiGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioTablaAmortiGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioTablaAmortiGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				tablaamorti.setid_anio(anioAux.getId());
				tablaamorti.setanio_descripcion(TablaAmortiConstantesFunciones.getAnioDescripcion(anioAux));
				tablaamorti.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(TablaAmorti tablaamorti,JComboBox jComboBoxid_mesTablaAmortiGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesTablaAmortiGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesTablaAmortiGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				tablaamorti.setid_mes(mesAux.getId());
				tablaamorti.setmes_descripcion(TablaAmortiConstantesFunciones.getMesDescripcion(mesAux));
				tablaamorti.setMes(mesAux);			}
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.removeAllItems();

							for(Tasa tasa:this.tasasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.addItem(tasa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTasa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tasaFK_IdTasaTablaAmorti.removeAllItems();

							for(Tasa tasa:this.tasasForeignKey) {
								this.jComboBoxid_tasaFK_IdTasaTablaAmorti.addItem(tasa);
							}
						}

						if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.addItem(factura);
							}
						}

						if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTablaAmorti!=null) { 
					}

					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setSelectedItem(tasa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tasaFK_IdTasaTablaAmorti.setSelectedItem(tasa);
						} else {
							this.jComboBoxid_tasaFK_IdTasaTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTablaAmorti() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TablaAmortiConstantesFunciones.refrescarForeignKeysDescripcionesTablaAmorti(this.tablaamortiLogic.getTablaAmortis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TablaAmortiConstantesFunciones.refrescarForeignKeysDescripcionesTablaAmorti(this.tablaamortis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Tasa.class));
		classes.add(new Classe(Factura.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tablaamortiLogic.setTablaAmortis(this.tablaamortis);
			tablaamortiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TablaAmortiParameterReturnGeneral getTablaAmortiParameterGeneral() {
		return this.tablaamortiParameterGeneral;
	}
	
	public void setTablaAmortiParameterGeneral(TablaAmortiParameterReturnGeneral tablaamortiParameterGeneral) {
		this.tablaamortiParameterGeneral = tablaamortiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTablaAmorti() {
		return isPermisoTodoTablaAmorti;
	}

	public void setIsPermisoTodoTablaAmorti(Boolean isPermisoTodoTablaAmorti) {
		this.isPermisoTodoTablaAmorti = isPermisoTodoTablaAmorti;
	}

	public Boolean getIsPermisoNuevoTablaAmorti() {
		return isPermisoNuevoTablaAmorti;
	}

	public void setIsPermisoNuevoTablaAmorti(Boolean isPermisoNuevoTablaAmorti) {
		this.isPermisoNuevoTablaAmorti = isPermisoNuevoTablaAmorti;
	}

	public Boolean getIsPermisoActualizarTablaAmorti() {
		return isPermisoActualizarTablaAmorti;
	}

	public void setIsPermisoActualizarTablaAmorti(Boolean isPermisoActualizarTablaAmorti) {
		this.isPermisoActualizarTablaAmorti = isPermisoActualizarTablaAmorti;
	}

	public Boolean getIsPermisoEliminarTablaAmorti() {
		return isPermisoEliminarTablaAmorti;
	}

	public void setIsPermisoEliminarTablaAmorti(Boolean isPermisoEliminarTablaAmorti) {
		this.isPermisoEliminarTablaAmorti = isPermisoEliminarTablaAmorti;
	}

	public Boolean getIsPermisoGuardarCambiosTablaAmorti() {
		return isPermisoGuardarCambiosTablaAmorti;
	}

	public void setIsPermisoGuardarCambiosTablaAmorti(Boolean isPermisoGuardarCambiosTablaAmorti) {
		this.isPermisoGuardarCambiosTablaAmorti = isPermisoGuardarCambiosTablaAmorti;
	}
	
	public Boolean getIsPermisoConsultaTablaAmorti() {
		return isPermisoConsultaTablaAmorti;
	}

	public void setIsPermisoConsultaTablaAmorti(Boolean isPermisoConsultaTablaAmorti) {
		this.isPermisoConsultaTablaAmorti = isPermisoConsultaTablaAmorti;
	}

	public Boolean getIsPermisoBusquedaTablaAmorti() {
		return isPermisoBusquedaTablaAmorti;
	}

	public void setIsPermisoBusquedaTablaAmorti(Boolean isPermisoBusquedaTablaAmorti) {
		this.isPermisoBusquedaTablaAmorti = isPermisoBusquedaTablaAmorti;
	}

	public Boolean getIsPermisoReporteTablaAmorti() {
		return isPermisoReporteTablaAmorti;
	}

	public void setIsPermisoReporteTablaAmorti(Boolean isPermisoReporteTablaAmorti) {
		this.isPermisoReporteTablaAmorti = isPermisoReporteTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionMedioTablaAmorti() {
		return isPermisoPaginacionMedioTablaAmorti;
	}

	public void setIsPermisoPaginacionMedioTablaAmorti(Boolean isPermisoPaginacionMedioTablaAmorti) {
		this.isPermisoPaginacionMedioTablaAmorti = isPermisoPaginacionMedioTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionTodoTablaAmorti() {
		return isPermisoPaginacionTodoTablaAmorti;
	}

	public void setIsPermisoPaginacionTodoTablaAmorti(Boolean isPermisoPaginacionTodoTablaAmorti) {
		this.isPermisoPaginacionTodoTablaAmorti = isPermisoPaginacionTodoTablaAmorti;
	}
	
	public Boolean getIsPermisoPaginacionAltoTablaAmorti() {
		return isPermisoPaginacionAltoTablaAmorti;
	}

	public void setIsPermisoPaginacionAltoTablaAmorti(Boolean isPermisoPaginacionAltoTablaAmorti) {
		this.isPermisoPaginacionAltoTablaAmorti = isPermisoPaginacionAltoTablaAmorti;
	}
	
	public Boolean getIsPermisoCopiarTablaAmorti() {
		return isPermisoCopiarTablaAmorti;
	}

	public void setIsPermisoCopiarTablaAmorti(Boolean isPermisoCopiarTablaAmorti) {
		this.isPermisoCopiarTablaAmorti = isPermisoCopiarTablaAmorti;
	}
	
	public Boolean getIsPermisoVerFormTablaAmorti() {
		return isPermisoVerFormTablaAmorti;
	}

	public void setIsPermisoVerFormTablaAmorti(Boolean isPermisoVerFormTablaAmorti) {
		this.isPermisoVerFormTablaAmorti = isPermisoVerFormTablaAmorti;
	}
	
	public Boolean getIsPermisoDuplicarTablaAmorti() {
		return isPermisoDuplicarTablaAmorti;
	}

	public void setIsPermisoDuplicarTablaAmorti(Boolean isPermisoDuplicarTablaAmorti) {
		this.isPermisoDuplicarTablaAmorti = isPermisoDuplicarTablaAmorti;
	}
	
	public Boolean getIsPermisoOrdenTablaAmorti() {
		return isPermisoOrdenTablaAmorti;
	}

	public void setIsPermisoOrdenTablaAmorti(Boolean isPermisoOrdenTablaAmorti) {
		this.isPermisoOrdenTablaAmorti = isPermisoOrdenTablaAmorti;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTablaAmorti() {
		return isVisibilidadCeldaNuevoTablaAmorti;
	}

	public void setIsVisibilidadCeldaNuevoTablaAmorti(Boolean isVisibilidadCeldaNuevoTablaAmorti) {
		this.isVisibilidadCeldaNuevoTablaAmorti = isVisibilidadCeldaNuevoTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTablaAmorti() {
		return isVisibilidadCeldaDuplicarTablaAmorti;
	}

	public void setIsVisibilidadCeldaDuplicarTablaAmorti(Boolean isVisibilidadCeldaDuplicarTablaAmorti) {
		this.isVisibilidadCeldaDuplicarTablaAmorti = isVisibilidadCeldaDuplicarTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTablaAmorti() {
		return isVisibilidadCeldaCopiarTablaAmorti;
	}

	public void setIsVisibilidadCeldaCopiarTablaAmorti(Boolean isVisibilidadCeldaCopiarTablaAmorti) {
		this.isVisibilidadCeldaCopiarTablaAmorti = isVisibilidadCeldaCopiarTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTablaAmorti() {
		return isVisibilidadCeldaVerFormTablaAmorti;
	}

	public void setIsVisibilidadCeldaVerFormTablaAmorti(Boolean isVisibilidadCeldaVerFormTablaAmorti) {
		this.isVisibilidadCeldaVerFormTablaAmorti = isVisibilidadCeldaVerFormTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTablaAmorti() {
		return isVisibilidadCeldaOrdenTablaAmorti;
	}

	public void setIsVisibilidadCeldaOrdenTablaAmorti(Boolean isVisibilidadCeldaOrdenTablaAmorti) {
		this.isVisibilidadCeldaOrdenTablaAmorti = isVisibilidadCeldaOrdenTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTablaAmorti() {
		return isVisibilidadCeldaNuevoRelacionesTablaAmorti;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTablaAmorti(Boolean isVisibilidadCeldaNuevoRelacionesTablaAmorti) {
		this.isVisibilidadCeldaNuevoRelacionesTablaAmorti = isVisibilidadCeldaNuevoRelacionesTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTablaAmorti() {
		return isVisibilidadCeldaModificarTablaAmorti;
	}

	public void setIsVisibilidadCeldaModificarTablaAmorti(Boolean isVisibilidadCeldaModificarTablaAmorti) {
		this.isVisibilidadCeldaModificarTablaAmorti = isVisibilidadCeldaModificarTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTablaAmorti() {
		return isVisibilidadCeldaActualizarTablaAmorti;
	}

	public void setIsVisibilidadCeldaActualizarTablaAmorti(Boolean isVisibilidadCeldaActualizarTablaAmorti) {
		this.isVisibilidadCeldaActualizarTablaAmorti = isVisibilidadCeldaActualizarTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaEliminarTablaAmorti() {
		return isVisibilidadCeldaEliminarTablaAmorti;
	}

	public void setIsVisibilidadCeldaEliminarTablaAmorti(Boolean isVisibilidadCeldaEliminarTablaAmorti) {
		this.isVisibilidadCeldaEliminarTablaAmorti = isVisibilidadCeldaEliminarTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaCancelarTablaAmorti() {
		return isVisibilidadCeldaCancelarTablaAmorti;
	}

	public void setIsVisibilidadCeldaCancelarTablaAmorti(Boolean isVisibilidadCeldaCancelarTablaAmorti) {
		this.isVisibilidadCeldaCancelarTablaAmorti = isVisibilidadCeldaCancelarTablaAmorti;
	}

	public Boolean getIsVisibilidadCeldaGuardarTablaAmorti() {
		return isVisibilidadCeldaGuardarTablaAmorti;
	}

	public void setIsVisibilidadCeldaGuardarTablaAmorti(Boolean isVisibilidadCeldaGuardarTablaAmorti) {
		this.isVisibilidadCeldaGuardarTablaAmorti = isVisibilidadCeldaGuardarTablaAmorti;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTablaAmorti() {
		return isVisibilidadCeldaGuardarCambiosTablaAmorti;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTablaAmorti(Boolean isVisibilidadCeldaGuardarCambiosTablaAmorti) {
		this.isVisibilidadCeldaGuardarCambiosTablaAmorti = isVisibilidadCeldaGuardarCambiosTablaAmorti;
	}
		
	public TablaAmortiSessionBean gettablaamortiSessionBean() {
		return this.tablaamortiSessionBean;
	}
	
	public void settablaamortiSessionBean(TablaAmortiSessionBean tablaamortiSessionBean) {
		this.tablaamortiSessionBean=tablaamortiSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(TablaAmorti tablaamorti)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tablaamorti,null);
				this.setActualParaGuardarSucursalForeignKey(tablaamorti,null);
				this.setActualParaGuardarEjercicioForeignKey(tablaamorti,null);
				this.setActualParaGuardarPeriodoForeignKey(tablaamorti,null);
				this.setActualParaGuardarTasaForeignKey(tablaamorti,null);
				this.setActualParaGuardarFacturaForeignKey(tablaamorti,null);
				this.setActualParaGuardarAnioForeignKey(tablaamorti,null);
				this.setActualParaGuardarMesForeignKey(tablaamorti,null);
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
	
	public void bugActualizarReferenciaActual(TablaAmorti tablaamorti,TablaAmorti tablaamortiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTablaAmorti(tablaamorti);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tablaamortiAux.setId(tablaamorti.getId());
		tablaamortiAux.setVersionRow(tablaamorti.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTablaAmorti();
		
			int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tablaamortiValidator.getInvalidValues(this.tablaamorti);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tablaamortiLogic.setDatosCliente(datosCliente);
			tablaamortiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tablaamortiAux=new  TablaAmorti();
				
				tablaamortiAux.setIsNew(true);
				tablaamortiAux.setIsChanged(true);
				
				tablaamortiAux.setTablaAmortiOriginal(this.tablaamorti);
				
				tablaamortiAux.setId(this.tablaamorti.getId());	
				tablaamortiAux.setVersionRow(this.tablaamorti.getVersionRow());	
				tablaamortiAux.setid_empresa(this.tablaamorti.getid_empresa());	
				tablaamortiAux.setid_sucursal(this.tablaamorti.getid_sucursal());	
				tablaamortiAux.setid_ejercicio(this.tablaamorti.getid_ejercicio());	
				tablaamortiAux.setid_periodo(this.tablaamorti.getid_periodo());	
				tablaamortiAux.setid_tasa(this.tablaamorti.getid_tasa());	
				tablaamortiAux.setid_factura(this.tablaamorti.getid_factura());	
				tablaamortiAux.setfecha_emision(this.tablaamorti.getfecha_emision());	
				tablaamortiAux.setfecha_vencimiento(this.tablaamorti.getfecha_vencimiento());	
				tablaamortiAux.setvalor_prestamo(this.tablaamorti.getvalor_prestamo());	
				tablaamortiAux.setnumero_cuotas(this.tablaamorti.getnumero_cuotas());	
				tablaamortiAux.setid_anio(this.tablaamorti.getid_anio());	
				tablaamortiAux.setid_mes(this.tablaamorti.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortiAux,tablaamortis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.saveTablaAmortis();//WithConnection
						//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);
					
					this.refrescarForeignKeysDescripcionesTablaAmorti();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis().addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis.addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortiLogic.saveTablaAmortiRelaciones(tablaamortiAux,this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());//WithConnection
								//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis= new ArrayList<DetalleTablaAmorti>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();}
							tablaamortiAux.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaamortiAux,tablaamortis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tablaamortiAux=new  TablaAmorti();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tablaamortiSessionBean.getEsGuardarRelacionado() 
					|| (this.tablaamortiSessionBean.getEsGuardarRelacionado() && this.tablaamorti.getId()>=0)) {
						
					tablaamortiAux.setIsNew(false);
				}
				
				tablaamortiAux.setIsDeleted(false);
			
				tablaamortiAux.setId(this.tablaamorti.getId());	
				tablaamortiAux.setVersionRow(this.tablaamorti.getVersionRow());	
				tablaamortiAux.setid_empresa(this.tablaamorti.getid_empresa());	
				tablaamortiAux.setid_sucursal(this.tablaamorti.getid_sucursal());	
				tablaamortiAux.setid_ejercicio(this.tablaamorti.getid_ejercicio());	
				tablaamortiAux.setid_periodo(this.tablaamorti.getid_periodo());	
				tablaamortiAux.setid_tasa(this.tablaamorti.getid_tasa());	
				tablaamortiAux.setid_factura(this.tablaamorti.getid_factura());	
				tablaamortiAux.setfecha_emision(this.tablaamorti.getfecha_emision());	
				tablaamortiAux.setfecha_vencimiento(this.tablaamorti.getfecha_vencimiento());	
				tablaamortiAux.setvalor_prestamo(this.tablaamorti.getvalor_prestamo());	
				tablaamortiAux.setnumero_cuotas(this.tablaamorti.getnumero_cuotas());	
				tablaamortiAux.setid_anio(this.tablaamorti.getid_anio());	
				tablaamortiAux.setid_mes(this.tablaamorti.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortiAux,tablaamortis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.saveTablaAmortis();//WithConnection
						//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);
					
					this.refrescarForeignKeysDescripcionesTablaAmorti();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis().addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis.addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortiLogic.saveTablaAmortiRelaciones(tablaamortiAux,this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());//WithConnection
								//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis= new ArrayList<DetalleTablaAmorti>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();}
							tablaamortiAux.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tablaamortiAux,tablaamortis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tablaamorti,tablaamortiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tablaamortiAux=new  TablaAmorti();
				
				tablaamortiAux.setIsNew(false);
				tablaamortiAux.setIsChanged(false);
				
				tablaamortiAux.setIsDeleted(true);
				
				tablaamortiAux.setId(this.tablaamorti.getId());	
				tablaamortiAux.setVersionRow(this.tablaamorti.getVersionRow());	
				tablaamortiAux.setid_empresa(this.tablaamorti.getid_empresa());	
				tablaamortiAux.setid_sucursal(this.tablaamorti.getid_sucursal());	
				tablaamortiAux.setid_ejercicio(this.tablaamorti.getid_ejercicio());	
				tablaamortiAux.setid_periodo(this.tablaamorti.getid_periodo());	
				tablaamortiAux.setid_tasa(this.tablaamorti.getid_tasa());	
				tablaamortiAux.setid_factura(this.tablaamorti.getid_factura());	
				tablaamortiAux.setfecha_emision(this.tablaamorti.getfecha_emision());	
				tablaamortiAux.setfecha_vencimiento(this.tablaamorti.getfecha_vencimiento());	
				tablaamortiAux.setvalor_prestamo(this.tablaamorti.getvalor_prestamo());	
				tablaamortiAux.setnumero_cuotas(this.tablaamorti.getnumero_cuotas());	
				tablaamortiAux.setid_anio(this.tablaamorti.getid_anio());	
				tablaamortiAux.setid_mes(this.tablaamorti.getid_mes());	
				
				if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tablaamortiAux.getId()>=0) {	
						this.tablaamortisEliminados.add(tablaamortiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortiAux,tablaamortis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.saveTablaAmortis();//WithConnection
						//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis().addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis.addAll(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortisEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tablaamortiLogic.saveTablaAmortiRelaciones(tablaamortiAux,this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());//WithConnection
								//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.setDetalleTablaAmortis(new ArrayList<DetalleTablaAmorti>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis= new ArrayList<DetalleTablaAmorti>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.quitarFilaTotales();}
							tablaamortiAux.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tablaamortiAux,tablaamortiLogic.getTablaAmortis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tablaamortiAux,tablaamortis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getTablaAmortis().addAll(this.tablaamortisEliminados);
					
					tablaamortiLogic.saveTablaAmortis();//WithConnection
					//tablaamortiLogic.getSetVersionRowTablaAmortis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTablaAmorti();
				
				this.tablaamortisEliminados= new ArrayList<TablaAmorti>();		
			}
			
			if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tabla Amorti GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tablaamorti=tablaamortiAux;
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
      		//this.finishProcessTablaAmorti();
      	}
		
	}	
	
	public void actualizarRelaciones(TablaAmorti tablaamortiLocal) throws Exception {
		
		if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tablaamortiLocal.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());
			
			} else {
			
				tablaamortiLocal.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortis);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TablaAmorti tablaamortiLocal) throws Exception {	
		if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tablaamortiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				tablaamortiLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				tablaamortiLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				tablaamortiLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TasaDetalleFormJInternalFrame.class)) {
				TasaBeanSwingJInternalFrame tasaBeanSwingJInternalFrameLocal=(TasaBeanSwingJInternalFrame) ((TasaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tasaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTasa(tasaBeanSwingJInternalFrameLocal.gettasa(),true);
				tasaBeanSwingJInternalFrameLocal.actualizarLista(tasaBeanSwingJInternalFrameLocal.tasa,this.tasasForeignKey);

				tasaBeanSwingJInternalFrameLocal.actualizarRelaciones(tasaBeanSwingJInternalFrameLocal.tasa);

				tablaamortiLocal.setTasa(tasaBeanSwingJInternalFrameLocal.tasa);

				this.addItemDefectoCombosForeignKeyTasa();
				this.cargarCombosFrameTasasForeignKey("Formulario");
				this.setActualTasaForeignKey(tasaBeanSwingJInternalFrameLocal.tasa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				tablaamortiLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				tablaamortiLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				tablaamortiLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTablaAmortiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tablaamortiValidator.getInvalidValues(this.tablaamorti);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TablaAmorti tablaamorti,List<TablaAmorti> tablaamortis) throws Exception {
		try	{		
			TablaAmortiConstantesFunciones.actualizarLista(tablaamorti,tablaamortis,this.tablaamortiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TablaAmorti tablaamorti,List<TablaAmorti> tablaamortis) throws Exception {
		try	{			
			TablaAmortiConstantesFunciones.actualizarSelectedLista(tablaamorti,tablaamortis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TablaAmorti> tablaamortisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tablaamortisLocal=this.tablaamortiLogic.getTablaAmortis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tablaamortisLocal=this.tablaamortis;
			}
			//ARCHITECTURE
		
			for(TablaAmorti tablaamortiLocal:tablaamortisLocal) {
				if(this.permiteMantenimiento(tablaamortiLocal) && tablaamortiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TablaAmortiConstantesFunciones.getTablaAmortiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_empresaTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_sucursalTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_ejercicioTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_periodoTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDTASA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_tasaTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_facturaTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_emisionTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_vencimientoTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.VALORPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelvalor_prestamoTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.NUMEROCUOTAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelnumero_cuotasTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_anioTablaAmorti,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TablaAmortiConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_mesTablaAmorti,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_empresaTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_sucursalTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_ejercicioTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_periodoTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_tasaTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_facturaTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_emisionTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_vencimientoTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelvalor_prestamoTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelnumero_cuotasTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_anioTablaAmorti,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTablaAmorti.jLabelid_mesTablaAmorti,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleTablaAmorti")) {
			if(this.tablaamorti==null) {
				this.tablaamorti= new TablaAmorti();
			}

			if(this.tablaamortiSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTablaAmorti
				this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.getdetalletablaamorti().setTablaAmorti(this.tablaamorti);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTablaAmorti--;	
		
		
		this.tablaamortiAux=new TablaAmorti();
		
		this.tablaamortiAux.setId(this.iIdNuevoTablaAmorti);
		this.tablaamortiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tablaamortiLogic.getTablaAmortis().add(this.tablaamortiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tablaamortis.add(this.tablaamortiAux);
		}
		//ARCHITECTURE
		
		this.tablaamorti=this.tablaamortiAux;
		
		if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTablaAmorti(this.tablaamorti);
			this.setVariablesObjetoActualToFormularioForeignKeyTablaAmorti(this.tablaamorti);
		}
				
		//this.setDefaultControlesTablaAmorti();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTablaAmorti();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTablaAmorti();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmorti();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaAmorti(this.tablaamortiBean,this.tablaamorti,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TablaAmortiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
			classes=TablaAmortiConstantesFunciones.getClassesRelationshipsOfTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tablaamortiReturnGeneral=tablaamortiLogic.procesarEventosTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamortiLogic.getTablaAmortis(),this.tablaamorti,this.tablaamortiParameterGeneral,this.isEsNuevoTablaAmorti,classes);//this.tablaamortiLogic.getTablaAmorti()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTablaAmorti(this.tablaamortiReturnGeneral,this.tablaamortiBean,false);
		
		if(this.tablaamortiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti());
		}
		
		if(this.tablaamortiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti(),classes);//this.tablaamortiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTablaAmorti();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTablaAmorti();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaAmortiBeanSwingJInternalFrameAdditional.RecargarFormTablaAmorti(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTablaAmorti(false);
						
			if(tablaamortiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.getEsGuardarRelacionado() && DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTablaAmortiActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmorti();
			}
			
			this.actualizarVisualTableDatosTablaAmorti();
			
			this.jTableDatosTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoTablaAmorti(), this.getIndiceNuevoTablaAmorti());
			
			this.seleccionarFilaTablaTablaAmortiActual();
						
			this.actualizarEstadoCeldasBotonesTablaAmorti("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTablaAmorti(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarfecha_emisionTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarfecha_vencimientoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarvalor_prestamoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarnumero_cuotasTablaAmorti);	
		//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_empresaTablaAmorti);//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_sucursalTablaAmorti);//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_ejercicioTablaAmorti);//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_periodoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_tasaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_facturaTablaAmorti);//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_anioTablaAmorti);//
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setEnabled(isHabilitar && this.tablaamortiConstantesFunciones.activarid_mesTablaAmorti);
	};
	
	public void setDefaultControlesTablaAmorti() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTablaAmorti(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tablaamortiSessionBean.setConGuardarRelaciones(true);			
			this.tablaamortiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tablaamortiSessionBean.setConGuardarRelaciones(false);			
			this.tablaamortiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTablaAmorti() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
				if(tablaamortiAux.getId().equals(this.iIdNuevoTablaAmorti)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmorti tablaamortiAux:this.tablaamortis) {
				if(tablaamortiAux.getId().equals(this.iIdNuevoTablaAmorti)) {
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
	
	public int getIndiceActualTablaAmorti(TablaAmorti tablaamorti,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
				if(tablaamortiAux.getId().equals(tablaamorti.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmorti tablaamortiAux:this.tablaamortis) {
				if(tablaamortiAux.getId().equals(tablaamorti.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTablaAmorti(TablaAmorti tablaamortiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
				if(tablaamortiAux.getTablaAmortiOriginal().getId().equals(tablaamortiOriginal.getId())) {
					existe=true;
					tablaamortiOriginal.setId(tablaamortiAux.getId());
					tablaamortiOriginal.setVersionRow(tablaamortiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmorti tablaamortiAux:this.tablaamortis) {
				if(tablaamortiAux.getTablaAmortiOriginal().getId().equals(tablaamortiOriginal.getId())) {
					existe=true;
					tablaamortiOriginal.setId(tablaamortiAux.getId());
					tablaamortiOriginal.setVersionRow(tablaamortiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTablaAmorti(Boolean esParaCancelar) throws Exception {
		tablaamortisAux=new ArrayList<TablaAmorti>();
		tablaamortiAux=new TablaAmorti();
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
					if(tablaamortiAux.getId()<0) {
						tablaamortisAux.add(tablaamortiAux);
					}		
				}
				this.iIdNuevoTablaAmorti=0L;
				this.tablaamortiLogic.getTablaAmortis().removeAll(tablaamortisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmorti tablaamortiAux:this.tablaamortis) {
					if(tablaamortiAux.getId()<0) {
						tablaamortisAux.add(tablaamortiAux);
					}		
				}
				this.iIdNuevoTablaAmorti=0L;
				this.tablaamortis.removeAll(tablaamortisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTablaAmorti 
					&& this.tablaamortiLogic.getTablaAmortis().size()>0
					) {
					tablaamortiAux=this.tablaamortiLogic.getTablaAmortis().get(this.tablaamortiLogic.getTablaAmortis().size() - 1);
				
					if(tablaamortiAux.getId()<0) {
						this.tablaamortiLogic.getTablaAmortis().remove(tablaamortiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTablaAmorti && this.tablaamortis.size()>0) {
					tablaamortiAux=this.tablaamortis.get(this.tablaamortis.size() - 1);
				
					if(tablaamortiAux.getId()<0) {
						this.tablaamortis.remove(tablaamortiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTablaAmorti(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tablaamorti.getId()<0) {
				this.tablaamortiLogic.getTablaAmortis().remove(this.tablaamorti);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tablaamorti.getId()<0) {
				this.tablaamortis.remove(this.tablaamorti);
			}
		}			
	}
	
	public void setEstadosInicialesTablaAmorti(List<TablaAmorti> tablaamortisAux) throws Exception {
		TablaAmortiConstantesFunciones.setEstadosInicialesTablaAmorti(tablaamortisAux);
	}
	
	public void setEstadosInicialesTablaAmorti(TablaAmorti tablaamortiAux) throws Exception {
		TablaAmortiConstantesFunciones.setEstadosInicialesTablaAmorti(tablaamortiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTablaAmortiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTablaAmortiActual()) {
				if(!this.isEsNuevoTablaAmorti) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTablaAmorti=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTablaAmortiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tabla Amorti ?", "MANTENIMIENTO DE Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TablaAmorti tablaamorti) throws Exception {
		TablaAmortiConstantesFunciones.seleccionarAsignar(this.tablaamorti,tablaamorti);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTablaAmorti=this.isPermisoActualizarOriginalTablaAmorti;
			
			
			this.seleccionarAsignar(tablaamorti);
			
			

			idFacturaActual=tablaamorti.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TablaAmortiConstantesFunciones.quitarEspaciosTablaAmorti(this.tablaamorti,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tablaamortiSessionBean.setsFuncionBusquedaRapida(this.tablaamortiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoTablaAmorti) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTablaAmorti(esParaCancelar);				
				this.cancelarNuevoTablaAmorti(esParaCancelar);								
			}
			
			this.tablaamorti=new TablaAmorti();
			
			this.inicializarTablaAmorti();
			
			this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTablaAmorti() throws Exception {
		try {
			TablaAmortiConstantesFunciones.inicializarTablaAmorti(this.tablaamorti);
			
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
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tablaamortiLogic.getTablaAmortis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTablaAmortis(String sAccionBusqueda,List<TablaAmorti> tablaamortisParaReportes) throws Exception {
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
					sPathReporteFinal="TablaAmorti"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TablaAmortiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TablaAmortiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TablaAmorti"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tabla Amortis");		
		parameters.put("busquedapor", TablaAmortiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleTablaAmorti.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TablaAmortiLogic tablaamortiLogicAuxiliar=new TablaAmortiLogic();
					tablaamortiLogicAuxiliar.setDatosCliente(tablaamortiLogic.getDatosCliente());				
					tablaamortiLogicAuxiliar.setTablaAmortis(tablaamortisParaReportes);
					
					tablaamortiLogicAuxiliar.cargarRelacionesLoteForeignKeyTablaAmortiWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tablaamortisParaReportes=tablaamortiLogicAuxiliar.getTablaAmortis();
					
					//tablaamortiLogic.getNewConnexionToDeep();
					
					//for (TablaAmorti tablaamorti:tablaamortisParaReportes) {
					//	tablaamortiLogic.deepLoad(tablaamorti, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tablaamortiLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tablaamortiLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleTablaAmorti = AuxiliarReportes.class.getResourceAsStream("DetalleTablaAmortiDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalletablaamorti", reportFileDetalleTablaAmorti);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTablaAmorti=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TablaAmortiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTablaAmorti=new JRBeanArrayDataSource(TablaAmortiJInternalFrame.TraerTablaAmortiBeans(tablaamortisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTablaAmorti);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TablaAmortiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TablaAmortiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TablaAmortiBean.TraerTablaAmortiBeans(tablaamortisParaReportes).toArray()));
							
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
				this.generarExcelReporteTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTablaAmortiActionPerformed(null);
					//this.generarExcelReporteTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTablaAmortis(sAccionBusqueda,sTipoArchivoReporte,tablaamortisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmorti> tablaamortisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaAmorti("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TablaAmorti tablaamorti : tablaamortisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TablaAmortiConstantesFunciones.generarExcelReporteDataTablaAmorti("NORMAL",row,workbook,tablaamorti,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTablaAmorti(String sTipo,Row row,Workbook workbook) {
		
		TablaAmortiConstantesFunciones.generarExcelReporteHeaderTablaAmorti(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmorti> tablaamortisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TablaAmorti tablaamorti : tablaamortisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TablaAmortiConstantesFunciones.getTablaAmortiDescripcion(tablaamorti));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDTASA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDTASA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.gettasa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getvalor_prestamo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getnumero_cuotas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TablaAmortiConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tablaamorti.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTablaAmortis(String sAccionBusqueda,String sTipoArchivoReporte,List<TablaAmorti> tablaamortisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TablaAmorti> tablaamortisRespaldo=null;
		
		classes=TablaAmortiConstantesFunciones.getClassesRelationshipsOfTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tablaamortiLogic.setDatosCliente(this.datosCliente);
		this.tablaamortiLogic.setDatosDeep(this.datosDeep);
		this.tablaamortiLogic.setIsConDeep(true);
		
		tablaamortisRespaldo=this.tablaamortiLogic.getTablaAmortis();
		
		this.tablaamortiLogic.setTablaAmortis(tablaamortisParaReportes);	
		this.tablaamortiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tablaamortisParaReportes=this.tablaamortiLogic.getTablaAmortis();
		this.tablaamortiLogic.setTablaAmortis(tablaamortisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TablaAmortis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTablaAmorti("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TablaAmorti tablaamorti : tablaamortisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTablaAmorti("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TablaAmortiConstantesFunciones.generarExcelReporteDataTablaAmorti("NORMAL",row,workbook,tablaamorti,cellStyleDataAux);
		
			
			


				//DetalleTablaAmorti
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO))) {

				if(tablaamorti.getDetalleTablaAmortis()!=null && tablaamorti.getDetalleTablaAmortis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleTablaAmortiConstantesFunciones.generarExcelReporteHeaderDetalleTablaAmorti("RELACIONADO",row,workbook);
				}

				if(tablaamorti.getDetalleTablaAmortis()!=null) {
					i2=0;
					for(DetalleTablaAmorti detalletablaamorti : tablaamorti.getDetalleTablaAmortis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleTablaAmortiConstantesFunciones.generarExcelReporteDataDetalleTablaAmorti("RELACIONADO",row,workbook,detalletablaamorti,cellStyleDataAuxHijo);
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
		cell.setCellValue(TablaAmortiConstantesFunciones.getTablaAmortiDescripcion(tablaamorti));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmorti.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTablaAmorti() throws Exception {		
		this.startProcessTablaAmorti(true);
	}
	
	public void startProcessTablaAmorti(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTablaAmorti ,this.jPanelParametrosReportesTablaAmorti, this.jScrollPanelDatosTablaAmorti,this.jPanelPaginacionTablaAmorti, this.jScrollPanelDatosEdicionTablaAmorti, this.jPanelAccionesTablaAmorti,this.jPanelAccionesFormularioTablaAmorti,this.jmenuBarTablaAmorti,this.jmenuBarDetalleTablaAmorti,this.jTtoolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaAmorti=this.jTabbedPaneBusquedasTablaAmorti; 
		
		final JPanel jPanelParametrosReportesTablaAmorti=this.jPanelParametrosReportesTablaAmorti;
		//final JScrollPane jScrollPanelDatosTablaAmorti=this.jScrollPanelDatosTablaAmorti;
		final JTable jTableDatosTablaAmorti=this.jTableDatosTablaAmorti;		
		final JPanel jPanelPaginacionTablaAmorti=this.jPanelPaginacionTablaAmorti;
		//final JScrollPane jScrollPanelDatosEdicionTablaAmorti=this.jScrollPanelDatosEdicionTablaAmorti;
		final JPanel jPanelAccionesTablaAmorti=this.jPanelAccionesTablaAmorti;
		
		JPanel jPanelCamposAuxiliarTablaAmorti=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTablaAmorti=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			jPanelCamposAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jPanelCamposTablaAmorti;
			jPanelAccionesFormularioAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jPanelAccionesFormularioTablaAmorti;
		}
		
		final JPanel jPanelCamposTablaAmorti=jPanelCamposAuxiliarTablaAmorti;
		final JPanel jPanelAccionesFormularioTablaAmorti=jPanelAccionesFormularioAuxiliarTablaAmorti;
		
		
		final JMenuBar jmenuBarTablaAmorti=this.jmenuBarTablaAmorti;
		final JToolBar jTtoolBarTablaAmorti=this.jTtoolBarTablaAmorti;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTablaAmorti=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaAmorti=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			jmenuBarDetalleAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jmenuBarDetalleTablaAmorti;
			jTtoolBarDetalleAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jTtoolBarDetalleTablaAmorti;
		}
		
		final JMenuBar jmenuBarDetalleTablaAmorti=jmenuBarDetalleAuxiliarTablaAmorti;
		final JToolBar jTtoolBarDetalleTablaAmorti=jTtoolBarDetalleAuxiliarTablaAmorti;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaAmorti;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaAmorti;
			processRunnable.jTableDatos=jTableDatosTablaAmorti;
			processRunnable.jPanelCampos=jPanelCamposTablaAmorti;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaAmorti;
			processRunnable.jPanelAcciones=jPanelAccionesTablaAmorti;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaAmorti;
			
			
			processRunnable.jmenuBar=jmenuBarTablaAmorti;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaAmorti;
			processRunnable.jTtoolBar=jTtoolBarTablaAmorti;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaAmorti;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaAmorti ,jPanelParametrosReportesTablaAmorti,jTableDatosTablaAmorti, /*jScrollPanelDatosTablaAmorti,*/jPanelCamposTablaAmorti,jPanelPaginacionTablaAmorti, /*jScrollPanelDatosEdicionTablaAmorti,*/ jPanelAccionesTablaAmorti,jPanelAccionesFormularioTablaAmorti,jmenuBarTablaAmorti,jmenuBarDetalleTablaAmorti,jTtoolBarTablaAmorti,jTtoolBarDetalleTablaAmorti);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTablaAmorti ,jPanelParametrosReportesTablaAmorti, jScrollPanelDatosTablaAmorti,jPanelPaginacionTablaAmorti, jScrollPanelDatosEdicionTablaAmorti, jPanelAccionesTablaAmorti,jPanelAccionesFormularioTablaAmorti,jmenuBarTablaAmorti,jmenuBarDetalleTablaAmorti,jTtoolBarTablaAmorti,jTtoolBarDetalleTablaAmorti);
						
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
	
	public void finishProcessTablaAmorti() {// throws Exception 
		this.finishProcessTablaAmorti(true);
	}
	
	public void finishProcessTablaAmorti(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTablaAmorti ,this.jPanelParametrosReportesTablaAmorti, this.jScrollPanelDatosTablaAmorti,this.jPanelPaginacionTablaAmorti, this.jScrollPanelDatosEdicionTablaAmorti, this.jPanelAccionesTablaAmorti,this.jPanelAccionesFormularioTablaAmorti,this.jmenuBarTablaAmorti,this.jmenuBarDetalleTablaAmorti,this.jTtoolBarTablaAmorti,this.jTtoolBarDetalleTablaAmorti);		
		
		final JTabbedPane jTabbedPaneBusquedasTablaAmorti=this.jTabbedPaneBusquedasTablaAmorti; 
		
		final JPanel jPanelParametrosReportesTablaAmorti=this.jPanelParametrosReportesTablaAmorti;
		//final JScrollPane jScrollPanelDatosTablaAmorti=this.jScrollPanelDatosTablaAmorti;
		final JTable jTableDatosTablaAmorti=this.jTableDatosTablaAmorti;		
		final JPanel jPanelPaginacionTablaAmorti=this.jPanelPaginacionTablaAmorti;
		//final JScrollPane jScrollPanelDatosEdicionTablaAmorti=this.jScrollPanelDatosEdicionTablaAmorti;
		final JPanel jPanelAccionesTablaAmorti=this.jPanelAccionesTablaAmorti;
		
		JPanel jPanelCamposAuxiliarTablaAmorti=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTablaAmorti=new JPanel();
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			jPanelCamposAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jPanelCamposTablaAmorti;
			jPanelAccionesFormularioAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jPanelAccionesFormularioTablaAmorti;
		}
		
		final JPanel jPanelCamposTablaAmorti=jPanelCamposAuxiliarTablaAmorti;
		final JPanel jPanelAccionesFormularioTablaAmorti=jPanelAccionesFormularioAuxiliarTablaAmorti;
		
		
		final JMenuBar jmenuBarTablaAmorti=this.jmenuBarTablaAmorti;		
		final JToolBar jTtoolBarTablaAmorti=this.jTtoolBarTablaAmorti;
				
		JMenuBar jmenuBarDetalleAuxiliarTablaAmorti=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTablaAmorti=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			jmenuBarDetalleAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jmenuBarDetalleTablaAmorti;
			jTtoolBarDetalleAuxiliarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jTtoolBarDetalleTablaAmorti;		
		}
		
		final JMenuBar jmenuBarDetalleTablaAmorti=jmenuBarDetalleAuxiliarTablaAmorti;
		final JToolBar jTtoolBarDetalleTablaAmorti=jTtoolBarDetalleAuxiliarTablaAmorti;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTablaAmorti;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTablaAmorti;
			processRunnable.jTableDatos=jTableDatosTablaAmorti;
			processRunnable.jPanelCampos=jPanelCamposTablaAmorti;
			processRunnable.jPanelPaginacion=jPanelPaginacionTablaAmorti;
			processRunnable.jPanelAcciones=jPanelAccionesTablaAmorti;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTablaAmorti;
			
			
			processRunnable.jmenuBar=jmenuBarTablaAmorti;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTablaAmorti;
			processRunnable.jTtoolBar=jTtoolBarTablaAmorti;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTablaAmorti;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTablaAmorti ,jPanelParametrosReportesTablaAmorti, jTableDatosTablaAmorti,/*jScrollPanelDatosTablaAmorti,*/jPanelCamposTablaAmorti,jPanelPaginacionTablaAmorti, /*jScrollPanelDatosEdicionTablaAmorti,*/ jPanelAccionesTablaAmorti,jPanelAccionesFormularioTablaAmorti,jmenuBarTablaAmorti,jmenuBarDetalleTablaAmorti,jTtoolBarTablaAmorti,jTtoolBarDetalleTablaAmorti));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTablaAmorti(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTablaAmorti(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTablaAmorti,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTablaAmorti,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTablaAmorti(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTablaAmorti,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTablaAmorti,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tablaamortiConstantesFunciones.getsFinalQueryTablaAmorti();
		String  finalQueryPaginacionTodos=this.tablaamortiConstantesFunciones.getsFinalQueryTablaAmorti();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TablaAmortiConstantesFunciones.getArrayColumnasGlobalesNoTablaAmorti(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TablaAmortiConstantesFunciones.getArrayColumnasGlobalesTablaAmorti(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TablaAmortiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tablaamortisEliminados= new ArrayList<TablaAmorti>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTablaAmorti();
		
				///*TablaAmortiSessionBean*/this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			
			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
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
					this.iNumeroPaginacion=TablaAmortiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TablaAmortiConstantesFunciones.getClassesForeignKeysOfTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tablaamorti."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tablaamortisAux= new ArrayList<TablaAmorti>();
			
				
			tablaamortiLogic.setDatosCliente(this.datosCliente);
			tablaamortiLogic.setDatosDeep(this.datosDeep);
			tablaamortiLogic.setIsConDeep(true);
			
			
			tablaamortiLogic.getTablaAmortiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tablaamortiLogic.getTodosTablaAmortis(finalQueryGlobal,pagination);
					
					//tablaamortiLogic.getTodosTablaAmortisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tablaamortiLogic.getTablaAmortis()==null|| tablaamortiLogic.getTablaAmortis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortisAux= new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux= new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortiLogic.getTodosTablaAmortis(finalQueryGlobal+"",this.pagination);												
							
							//tablaamortiLogic.getTodosTablaAmortisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTablaAmortis("Todos",tablaamortiLogic.getTablaAmortis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());					
							tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTablaAmorti=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTablaAmorti=this.idActual;
				
				} else if(this.idTablaAmortiActual!=null && this.idTablaAmortiActual!=0L) {
					idTablaAmorti=idTablaAmortiActual;
				}
				
					
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndicePorId(idTablaAmorti);
				
				this.tablaamortis=new ArrayList<TablaAmorti>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tablaamortiLogic.getEntity(idTablaAmorti);
					
					//tablaamortiLogic.getEntityWithConnection(idTablaAmorti);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
					tablaamortiLogic.getTablaAmortis().add(tablaamortiLogic.getTablaAmorti());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamortis=new ArrayList<TablaAmorti>();
					this.tablaamortis.add(tablaamorti);
				}
				
				if(tablaamortiLogic.getTablaAmorti()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdEjercicio",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdEjercicio",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdEmpresa",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdEmpresa",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdFactura",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdFactura",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdPeriodo",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdPeriodo",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdSucursal",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdSucursal",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTasa")) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tablaamortiLogic.getTablaAmortisFK_IdTasa(finalQueryGlobal,pagination,id_tasaFK_IdTasa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tablaamortiLogic.getTablaAmortis()==null||tablaamortiLogic.getTablaAmortis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tablaamortis==null|| tablaamortis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortisAux=new ArrayList<TablaAmorti>();
						tablaamortisAux.addAll(tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortisAux=new ArrayList<TablaAmorti>();
							tablaamortisAux.addAll(tablaamortis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tablaamortiLogic.getTablaAmortisFK_IdTasa(finalQueryGlobal,pagination,id_tasaFK_IdTasa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TablaAmortiConstantesFunciones.getDetalleIndiceFK_IdTasa(id_tasaFK_IdTasa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTablaAmortis("FK_IdTasa",tablaamortiLogic.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTablaAmortis("FK_IdTasa",tablaamortis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiLogic.setTablaAmortis(new ArrayList<TablaAmorti>());
						tablaamortiLogic.getTablaAmortis().addAll(tablaamortisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortis=new ArrayList<TablaAmorti>();
							tablaamortis.addAll(tablaamortisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTablaAmorti();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTablaAmorti();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaamortiLogic.getTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tablaamortiLogic.getTablaAmortis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tablaamortis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TablaAmorti tablaamorti) {
		Boolean permite=true;
		
		if(this.tablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TablaAmortiConstantesFunciones.getOrderByListaTablaAmorti();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TablaAmortiConstantesFunciones.getOrderByListaTablaAmorti();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmorti tablaamorti:tablaamortiLogic.getTablaAmortis()) {
				if(tablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortiTotales=tablaamorti;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmorti tablaamorti:this.tablaamortis) {
				if(tablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortiTotales=tablaamorti;
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
			this.tablaamortiAux=new TablaAmorti();
			this.tablaamortiAux.setsType(Constantes2.S_TOTALES);
			this.tablaamortiAux.setIsNew(false);
			this.tablaamortiAux.setIsChanged(false);
			this.tablaamortiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TablaAmortiConstantesFunciones.TotalizarValoresFilaTablaAmorti(this.tablaamortiLogic.getTablaAmortis(),this.tablaamortiAux);
				
				this.tablaamortiLogic.getTablaAmortis().add(this.tablaamortiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TablaAmortiConstantesFunciones.TotalizarValoresFilaTablaAmorti(this.tablaamortis,this.tablaamortiAux);
				
				this.tablaamortis.add(this.tablaamortiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tablaamortiTotales=new TablaAmorti();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaamortiLogic.getTablaAmortis().remove(tablaamortiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tablaamortis.remove(tablaamortiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tablaamortiTotales=new TablaAmorti();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TablaAmorti tablaamorti:tablaamortiLogic.getTablaAmortis()) {
				if(tablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortiTotales=tablaamorti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaAmortiConstantesFunciones.TotalizarValoresFilaTablaAmorti(this.tablaamortiLogic.getTablaAmortis(),tablaamortiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TablaAmorti tablaamorti:this.tablaamortis) {
				if(tablaamorti.getsType().equals(Constantes2.S_TOTALES)) {
					tablaamortiTotales=tablaamorti;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TablaAmortiConstantesFunciones.TotalizarValoresFilaTablaAmorti(this.tablaamortis,tablaamortiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTablaAmortisFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTablaAmortisFK_IdTasa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTasa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTablaAmortisFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTablaAmortisFK_IdTasa(String sFinalQuery,Long id_tasa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLogic.getTablaAmortisFK_IdTasa(sFinalQuery,this.pagination,id_tasa);
				
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
	
	public void inicializarPermisosTablaAmorti() {
		this.isPermisoTodoTablaAmorti=false;
		this.isPermisoNuevoTablaAmorti=false;
		this.isPermisoActualizarTablaAmorti=false;
		this.isPermisoActualizarOriginalTablaAmorti=false;
		this.isPermisoEliminarTablaAmorti=false;
		this.isPermisoGuardarCambiosTablaAmorti=false;
		this.isPermisoConsultaTablaAmorti=false;
		this.isPermisoBusquedaTablaAmorti=false;
		this.isPermisoReporteTablaAmorti=false;		
		this.isPermisoOrdenTablaAmorti=false;		
		this.isPermisoPaginacionMedioTablaAmorti=false;		
		this.isPermisoPaginacionAltoTablaAmorti=false;
		this.isPermisoPaginacionTodoTablaAmorti=false;
		this.isPermisoCopiarTablaAmorti=false;		
		this.isPermisoVerFormTablaAmorti=false;		
		this.isPermisoDuplicarTablaAmorti=false;		
		this.isPermisoOrdenTablaAmorti=false;		
	}
	
	public void setPermisosUsuarioTablaAmorti(Boolean isPermiso) {
		this.isPermisoTodoTablaAmorti=isPermiso;
		this.isPermisoNuevoTablaAmorti=isPermiso;
		this.isPermisoActualizarTablaAmorti=isPermiso;
		this.isPermisoActualizarOriginalTablaAmorti=isPermiso;
		this.isPermisoEliminarTablaAmorti=isPermiso;
		this.isPermisoGuardarCambiosTablaAmorti=isPermiso;
		this.isPermisoConsultaTablaAmorti=isPermiso;
		this.isPermisoBusquedaTablaAmorti=isPermiso;
		this.isPermisoReporteTablaAmorti=isPermiso;
		this.isPermisoOrdenTablaAmorti=isPermiso;		
		this.isPermisoPaginacionMedioTablaAmorti=isPermiso;		
		this.isPermisoPaginacionAltoTablaAmorti=isPermiso;		
		this.isPermisoPaginacionTodoTablaAmorti=isPermiso;		
		this.isPermisoCopiarTablaAmorti=isPermiso;		
		this.isPermisoVerFormTablaAmorti=isPermiso;		
		this.isPermisoDuplicarTablaAmorti=isPermiso;
		this.isPermisoOrdenTablaAmorti=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTablaAmorti(Boolean isPermiso) {
		//this.isPermisoTodoTablaAmorti=isPermiso;
		this.isPermisoNuevoTablaAmorti=isPermiso;
		this.isPermisoActualizarTablaAmorti=isPermiso;
		this.isPermisoActualizarOriginalTablaAmorti=isPermiso;
		this.isPermisoEliminarTablaAmorti=isPermiso;
		this.isPermisoGuardarCambiosTablaAmorti=isPermiso;
		//this.isPermisoConsultaTablaAmorti=isPermiso;
		//this.isPermisoBusquedaTablaAmorti=isPermiso;
		//this.isPermisoReporteTablaAmorti=isPermiso;
		//this.isPermisoOrdenTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionMedioTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionAltoTablaAmorti=isPermiso;		
		//this.isPermisoPaginacionTodoTablaAmorti=isPermiso;		
		//this.isPermisoCopiarTablaAmorti=isPermiso;		
		//this.isPermisoDuplicarTablaAmorti=isPermiso;
		//this.isPermisoOrdenTablaAmorti=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTablaAmortiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION);
		
		if(TablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleTablaAmorti=false;
		this.isTienePermisosDetalleTablaAmorti=this.verificarGetPermisosUsuarioOpcionTablaAmortiClaseRelacionada(this.opcionsRelacionadas,DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTablaAmorti(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTablaAmortiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleTablaAmorti=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTablaAmortiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTablaAmortiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTablaAmortiClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleTablaAmorti && this.jInternalFrameDetalleFormTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.remove(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTablaAmorti() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TablaAmortiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTablaAmorti=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTablaAmorti=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTablaAmorti=this.isPermisoActualizarTablaAmorti;
			this.isPermisoEliminarTablaAmorti=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTablaAmorti=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTablaAmorti=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTablaAmorti=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTablaAmorti=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTablaAmorti=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaAmorti=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTablaAmorti=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTablaAmorti=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTablaAmorti=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTablaAmorti=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTablaAmorti=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTablaAmorti=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTablaAmorti=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTablaAmorti.setToolTipText(this.jTableDatosTablaAmorti.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTablaAmorti(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTablaAmorti(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTablaAmorti() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleTablaAmorti && this.tablaamortiConstantesFunciones.mostrarDetalleTablaAmortiTablaAmorti && !TablaAmortiConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Tabla Amorti");
			reporte.setsDescripcion("Detalle Tabla Amorti");
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
	public void inicializarCombosForeignKeyTablaAmortiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.tasasForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTablaAmortiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TablaAmortiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTablaAmortiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTasaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTablaAmortiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TablaAmortiParameterReturnGeneral tablaamortiReturnGeneral=new TablaAmortiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_empresaTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_empresaTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_sucursalTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_sucursalTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_ejercicioTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_ejercicioTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_periodoTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_periodoTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalTasa="";

				if(((this.tasasForeignKey==null||this.tasasForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_tasaTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_tasaTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TasaConstantesFunciones.getArrayColumnasGlobalesTasa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTasa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TasaConstantesFunciones.TABLENAME);

						finalQueryGlobalTasa=Funciones.GetFinalQueryAppend(finalQueryGlobalTasa, "");
						finalQueryGlobalTasa+=TasaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTasasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTasa=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidTasaActual();
					}
				} else {
					finalQueryGlobalTasa="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_facturaTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_facturaTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_anioTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_anioTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.tablaamortiConstantesFunciones.cargarid_mesTablaAmorti)
					 || (this.esRecargarFks && this.tablaamortiConstantesFunciones.cargarid_mesTablaAmorti)) {

					if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+tablaamortiSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tablaamortiReturnGeneral=tablaamortiLogic.cargarCombosLoteForeignKeyTablaAmorti(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalTasa,finalQueryGlobalFactura,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tablaamortiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=tablaamortiReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=tablaamortiReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=tablaamortiReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalTasa.equals("NONE")) {
				this.tasasForeignKey=tablaamortiReturnGeneral.gettasasForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=tablaamortiReturnGeneral.getfacturasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=tablaamortiReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=tablaamortiReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTablaAmorti()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyTasa();
			this.addItemDefectoCombosForeignKeyFactura();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionTasa()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.tablaamortiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyTablaAmorti()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTablaAmorti(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTablaAmorti()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.tablaamorti.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.tablaamorti.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmorti();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTablaAmorti(TablaAmorti tablaamorti)throws Exception {	
		try {
			
			this.setActualTasaForeignKey(tablaamorti.getid_tasa(),false,"Formulario");
			this.setActualFacturaForeignKey(tablaamorti.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTablaAmorti(TablaAmorti tablaamorti,String sTipoEvento)throws Exception {	
		try {
			
			

				if(tablaamorti.getFactura()!=null && !sTipoEvento.equals("id_facturaTablaAmorti")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(tablaamorti.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTablaAmorti()throws Exception {	
		try {
			
			this.setActualTasaForeignKey(this.tablaamortiConstantesFunciones.getid_tasa(),false,"Formulario");
			this.setActualFacturaForeignKey(this.tablaamortiConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTablaAmorti()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.getSelectedItem();
					this.setActualAnioForeignKey(ejercicioActual.getid_anio(),false,"Formulario");
				}

				if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.getSelectedItem();
					this.setActualMesForeignKey(periodoActual.getid_mes(),false,"Formulario");
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTablaAmorti()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTablaAmorti()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTablaAmorti()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTablaAmorti()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameTasasForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTablaAmorti(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTasasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTablaAmorti()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.getItemCount()>0) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public TablaAmortiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TablaAmortiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TablaAmortiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tablaamortiSessionBean=new TablaAmortiSessionBean(); 
		this.tablaamortiConstantesFunciones=new TablaAmortiConstantesFunciones(); 
		this.tablaamortiBean=new TablaAmorti();//(this.tablaamortiConstantesFunciones); 		
		this.tablaamortiReturnGeneral=new TablaAmortiParameterReturnGeneral(); 
		
		this.tablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TablaAmortiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTablaAmorti(true);
			
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
			
			this.tablaamortiConstantesFunciones=new TablaAmortiConstantesFunciones(); 
			this.tablaamortiBean=new TablaAmorti();//this.tablaamortiConstantesFunciones); 			
			this.tablaamortiReturnGeneral=new TablaAmortiParameterReturnGeneral(); 
		
			TablaAmortiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tabla Amorti Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.tablaamorti=new TablaAmorti();
			this.tablaamortis = new ArrayList<TablaAmorti>();
			this.tablaamortisAux = new ArrayList<TablaAmorti>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic=new TablaAmortiLogic();
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			//this.tablaamortiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tablaamortiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTablaAmorti);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaAmorti);	
					}
					
					if(this.jInternalFrameImportacionTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaAmorti);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTablaAmorti!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTablaAmorti);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaAmorti);
				this.jInternalFrameDetalleFormTablaAmorti.setVisible(false);
				this.jInternalFrameDetalleFormTablaAmorti.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaAmorti);
					this.jInternalFrameReporteDinamicoTablaAmorti.setVisible(false);
					this.jInternalFrameReporteDinamicoTablaAmorti.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTablaAmorti);
					this.jInternalFrameImportacionTablaAmorti.setVisible(false);
					this.jInternalFrameImportacionTablaAmorti.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTablaAmorti!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTablaAmorti);
					this.jInternalFrameOrderByTablaAmorti.setVisible(false);
					this.jInternalFrameOrderByTablaAmorti.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTablaAmortiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TablaAmortiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tablaamortiReturnGeneral=new TablaAmortiParameterReturnGeneral();
			
			this.tablaamortiParameterGeneral=new TablaAmortiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tablaamortiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TablaAmortiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleTablaAmortiConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaAmortiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaamortiSessionBean.getEsGuardarRelacionado(),this.tablaamortiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TablaAmortiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tablaamortiSessionBean.getEsGuardarRelacionado(),this.tablaamortiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaDuplicarTablaAmorti=true;
			this.isVisibilidadCeldaCopiarTablaAmorti=true;
			this.isVisibilidadCeldaVerFormTablaAmorti=true;
			this.isVisibilidadCeldaOrdenTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=false;
			this.isVisibilidadCeldaGuardarTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTasa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTablaAmorti();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTablaAmorti(false);
			
			this.setPermisosUsuarioTablaAmorti();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado() 
				|| (this.tablaamortiSessionBean.getEsGuardarRelacionado() && this.tablaamortiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTablaAmortiClasesRelacionadas();
			}
			
			if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTablaAmortiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTablaAmorti();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTablaAmorti();
			}
			
			if(!this.isPermisoBusquedaTablaAmorti) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTablaAmorti,this.isPermisoPaginacionMedioTablaAmorti,this.isPermisoPaginacionTodoTablaAmorti);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TablaAmortiConstantesFunciones.getTiposSeleccionarTablaAmorti());
				
				this.tiposColumnasSelect=TablaAmortiConstantesFunciones.getTiposSeleccionarTablaAmorti(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTablaAmorti();				
				//this.tiposRelacionesSelect=TablaAmortiConstantesFunciones.getTiposRelacionesTablaAmorti(true);
				
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
			//if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTablaAmorti();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioTablaAmorti(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioTablaAmorti(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmorti() ;
			
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
			
			
			this.detalletablaamortiLogic=new DetalleTablaAmortiLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.tasaLogic=new TasaLogic();
			this.facturaLogic=new FacturaLogic();
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
				tablaamortiImplementable= (TablaAmortiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaAmortiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tablaamortiImplementableHome= (TablaAmortiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TablaAmortiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tablaamortis= new ArrayList<TablaAmorti>();
			this.tablaamortisEliminados= new ArrayList<TablaAmorti>();
						
			this.isEsNuevoTablaAmorti=false;
			this.esParaAccionDesdeFormularioTablaAmorti=false;
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
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTablaAmorti(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTablaAmorti();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TablaAmortiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TablaAmortiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTablaAmorti("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTablaAmorti(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTablaAmorti();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTablaAmorti();
			}
			
			TablaAmortiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTablaAmorti.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTablaAmorti.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTablaAmorti.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTablaAmorti(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TablaAmorti: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTablaAmorti() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTablaAmorti")) {
				iIndex=this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Tabla Amortis")) {
					if(!DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTablaAmorti();

						this.cargarParteTabPanelRelacionadaDetalleTablaAmorti(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTablaAmorti();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleTablaAmorti(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTablaAmorti.cargarSessionConBeanSwingJInternalFrameDetalleTablaAmorti(false,true,iIndex);
		this.jButtonDetalleTablaAmortiActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleTablaAmorti();

		//this.jTabbedPaneRelacionesTablaAmorti.updateUI();
		//this.jTabbedPaneRelacionesTablaAmorti.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTablaAmorti.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleTablaAmorti")) {
				int row=this.jTableDatosTablaAmorti.getSelectedRow();
				jButtonDetalleTablaAmortiActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Tabla Amorti")) {

					if(this.isTienePermisosDetalleTablaAmorti && this.tablaamortiConstantesFunciones.mostrarDetalleTablaAmortiTablaAmorti && !TablaAmortiConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Tabla Amortis"+"("+DetalleTablaAmortiConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Tabla Amortis");

						if(tablaamortiConstantesFunciones.resaltarDetalleTablaAmortiTablaAmorti!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tablaamortiConstantesFunciones.resaltarDetalleTablaAmortiTablaAmorti);
						}

						jmenuItem.setEnabled(this.tablaamortiConstantesFunciones.activarDetalleTablaAmortiTablaAmorti);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleTablaAmorti"));

						

						this.jInternalFrameDetalleFormTablaAmorti.jmenuDetalleTablaAmorti.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTablaAmorti(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTablaAmorti(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTablaAmorti(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTablaAmortiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTablaAmorti();
		
		this.cargarCombosFrameForeignKeyTablaAmorti();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTablaAmorti();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTablaAmorti();
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
	
	public void jButtonNuevoTablaAmortiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			
			if(jTableDatosTablaAmorti.getRowCount()>=1) {
				jTableDatosTablaAmorti.removeRowSelectionInterval(0, jTableDatosTablaAmorti.getRowCount()-1);						
			}
			
			this.isEsNuevoTablaAmorti=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTablaAmorti(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTablaAmorti(true);			
			//this.tablaamorti=new TablaAmorti();
			//this.tablaamorti.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmorti(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmorti() ;
			
			if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmorti(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tablaamorti);	
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);				
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TablaAmorti: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTablaAmortiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTablaAmorti.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTablaAmorti.getSelectedRows().length;			
			}
			
			tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTablaAmorti--;			
				//TablaAmorti tablaamortiAux= new TablaAmorti();			
				//tablaamortiAux.setId(this.iIdNuevoTablaAmorti);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TablaAmorti tablaamortiOrigen=new TablaAmorti();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TablaAmorti tablaamortiOrigen : tablaamortisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tablaamortiOrigen =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tablaamortiOrigen =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTablaAmorti();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tablaamorti.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTablaAmorti(tablaamortiOrigen,this.tablaamorti,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaamortiLogic.getTablaAmortis().add(this.tablaamortiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaamortis.add(this.tablaamortiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTablaAmorti(false);
				
				this.jTableDatosTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoTablaAmorti(), this.getIndiceNuevoTablaAmorti());
				
				int iLastRow =  this.jTableDatosTablaAmorti.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaAmorti.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaAmorti.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmorti(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();									
		
			TablaAmorti tablaamortiOrigen=new TablaAmorti();
			TablaAmorti tablaamortiDestino=new TablaAmorti();
				
			tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTablaAmorti.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tablaamortisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTablaAmorti.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiOrigen =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaamortiOrigen =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tablaamortiDestino =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tablaamortiDestino =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tablaamortiOrigen =tablaamortisSeleccionados.get(0);
				tablaamortiDestino =tablaamortisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTablaAmorti(tablaamortiOrigen,tablaamortiDestino,true,false);
				
				tablaamortiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tablaamortiDestino,tablaamortiLogic.getTablaAmortis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tablaamortiDestino,tablaamortis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTablaAmorti(false);
				
				//this.jTableDatosTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoTablaAmorti(), this.getIndiceNuevoTablaAmorti());
				
				int iLastRow =  this.jTableDatosTablaAmorti.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTablaAmorti.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTablaAmorti.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmorti(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTablaAmorti.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTablaAmorti.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTablaAmorti.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTablaAmorti.setVisible(!isVisible);
			this.jPanelPaginacionTablaAmorti.setVisible(!isVisible);
			this.jPanelAccionesTablaAmorti.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTablaAmorti();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTablaAmorti();
			
			this.abrirFrameOrderByTablaAmorti();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTablaAmorti();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTablaAmorti(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaAmorti);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTablaAmorti.isMaximum()) {
					this.jInternalFrameDetalleFormTablaAmorti.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTablaAmorti.setSize(this.jInternalFrameDetalleFormTablaAmorti.iWidthFormulario,this.jInternalFrameDetalleFormTablaAmorti.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTablaAmorti.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTablaAmorti.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTablaAmorti.isMaximum()) {
						this.jInternalFrameDetalleFormTablaAmorti.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTablaAmorti.jContentPaneDetalleTablaAmorti.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTablaAmorti.jContentPaneDetalleTablaAmorti.getWidth(),TablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTablaAmorti.jContentPaneDetalleTablaAmorti.getWidth(),TablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTablaAmorti.jContentPaneDetalleTablaAmorti.getWidth(),TablaAmortiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleTablaAmorti();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTablaAmorti.setVisible(true);
	        this.jInternalFrameDetalleFormTablaAmorti.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTablaAmorti() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTablaAmorti==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmorti,false,this);
				} else {
					this.jInternalFrameOrderByTablaAmorti=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTablaAmorti,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTablaAmorti);
				this.jInternalFrameOrderByTablaAmorti.setVisible(false);
				this.jInternalFrameOrderByTablaAmorti.setSelected(false);
				
				this.jInternalFrameOrderByTablaAmorti.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaAmorti"));
				
				this.inicializarActualizarBindingTablaOrderByTablaAmorti();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTablaAmorti() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTablaAmorti==null) {
				
				this.jInternalFrameImportacionTablaAmorti=new ImportacionJInternalFrame(TablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTablaAmorti);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTablaAmorti);
				this.jInternalFrameImportacionTablaAmorti.setVisible(false);
				this.jInternalFrameImportacionTablaAmorti.setSelected(false);


				this.jInternalFrameImportacionTablaAmorti.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaAmorti"));
				this.jInternalFrameImportacionTablaAmorti.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaAmorti"));
				this.jInternalFrameImportacionTablaAmorti.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaAmorti"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTablaAmorti() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTablaAmorti==null) {
				this.jInternalFrameReporteDinamicoTablaAmorti=new ReporteDinamicoJInternalFrame(TablaAmortiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTablaAmorti);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTablaAmorti);
				this.jInternalFrameReporteDinamicoTablaAmorti.setVisible(false);
				this.jInternalFrameReporteDinamicoTablaAmorti.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmorti"));
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmorti"));
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmorti"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmorti();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleTablaAmorti() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.jScrollPanelDatosDetalleTablaAmorti.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTablaAmorti.jContentPaneDetalleTablaAmorti.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.jScrollPanelDatosDetalleTablaAmorti.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.jScrollPanelDatosDetalleTablaAmorti.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.jScrollPanelDatosDetalleTablaAmorti.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTablaAmorti() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTablaAmorti);
			
	       	this.jInternalFrameDetalleFormTablaAmorti.setVisible(false);
	        this.jInternalFrameDetalleFormTablaAmorti.setSelected(false);
			
			//this.jInternalFrameDetalleFormTablaAmorti.dispose();
			//this.jInternalFrameDetalleFormTablaAmorti=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTablaAmorti() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTablaAmorti.setVisible(true);
	        this.jInternalFrameReporteDinamicoTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTablaAmorti() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTablaAmorti.setVisible(true);
	        this.jInternalFrameImportacionTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTablaAmorti() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTablaAmorti.setVisible(true);
	        this.jInternalFrameOrderByTablaAmorti.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTablaAmorti() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTablaAmorti.setVisible(false);
	        this.jInternalFrameOrderByTablaAmorti.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTablaAmorti() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTablaAmorti.setVisible(false);
	        this.jInternalFrameReporteDinamicoTablaAmorti.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTablaAmorti() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTablaAmorti.setVisible(false);
	        this.jInternalFrameImportacionTablaAmorti.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTablaAmorti(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTablaAmorti(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTablaAmorti(true);
			//this.isEsNuevoTablaAmorti=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmorti(false) ;
			
			if(tablaamortiSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.getEsGuardarRelacionado() && DetalleTablaAmortiJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTablaAmortiActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmorti(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmorti(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTablaAmortiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTablaAmorti(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTablaAmorti(true);
			//this.isEsNuevoTablaAmorti=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tablaamorti.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTablaAmorti("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTablaAmorti(false) ;
			
			if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTablaAmorti(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmorti(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.tablaamortiConstantesFunciones.cargarid_facturaTablaAmorti) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTablaAmorti(false,false);
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
		TableColumn tableColumnTasa=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDTASA));
		TableCellEditor tableCellEditorTasa =tableColumnTasa.getCellEditor();

		TasaTableCell tasaTableCellFk=(TasaTableCell)tableCellEditorTasa;

		if(tasaTableCellFk!=null) {
			tasaTableCellFk.settasasForeignKey(tasasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();

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
		TableColumn tableColumnFactura=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();

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
	
	public void jButtonActualizarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTablaAmorti(false);
			
			//if(!this.isEsNuevoTablaAmorti) {								
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				
			}
			
			if(this.permiteMantenimiento(this.tablaamorti)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTablaAmorti=true;
					this.inicializarActualizarBindingTablaTablaAmorti(false);
					this.isEsNuevoTablaAmorti=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTablaAmorti=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTablaAmorti=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaAmorti(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmorti(false);
				
				this.habilitarDeshabilitarControlesTablaAmorti(false);
			
												
				
				if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTablaAmorti();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTablaAmortiActionPerformed(evt,tablaamortiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTablaAmorti(this.tablaamorti,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tablaamortiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tablaamorti.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				this.tablaamorti.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				this.tablaamorti.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tablaamorti)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TablaAmortiModel) this.jTableDatosTablaAmorti.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTablaAmorti=true;
				this.inicializarActualizarBindingTablaTablaAmorti(false);
				this.isEsNuevoTablaAmorti=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTablaAmorti(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmorti(false);
				
				this.habilitarDeshabilitarControlesTablaAmorti(false);
				
				
				
				if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTablaAmorti();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTablaAmortiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTablaAmorti.getRowCount()>=1) {
				jTableDatosTablaAmorti.removeRowSelectionInterval(0, jTableDatosTablaAmorti.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTablaAmorti(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTablaAmorti(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTablaAmorti(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTablaAmorti(false) ;
			
			this.isEsNuevoTablaAmorti=false;
			
			if(TablaAmortiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTablaAmorti();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTablaAmorti(false);
				
				//SI ES MANUAL
				if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTablaAmorti();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTablaAmorti--;			
			//TablaAmorti tablaamortiAux= new TablaAmorti();			
			//tablaamortiAux.setId(this.iIdNuevoTablaAmorti);
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTablaAmorti();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
			
			this.tablaamorti.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tablaamortiLogic.getTablaAmortis().add(this.tablaamortiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tablaamortis.add(this.tablaamortiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTablaAmorti(false);
			
			this.jTableDatosTablaAmorti.setRowSelectionInterval(this.getIndiceNuevoTablaAmorti(), this.getIndiceNuevoTablaAmorti());
			
			int iLastRow =  this.jTableDatosTablaAmorti.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTablaAmorti.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTablaAmorti.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTablaAmorti(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmorti(false);
			
			//SI ES MANUAL
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmorti();
			}
			
			//this.abrirFrameTreeTablaAmorti();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tabla AmortiS ?", "MANTENIMIENTO DE Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTablaAmorti.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTablaAmorti();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tablaamortiReturnGeneral=tablaamortiLogic.procesarImportacionTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tablaamortiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTablaAmortiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTablaAmorti.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTablaAmorti.setFileImportacion(this.jInternalFrameImportacionTablaAmorti.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTablaAmorti.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTablaAmorti.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTablaAmorti.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTablaAmorti.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		

		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TablaAmortiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TablaAmortiBaseDesign.jrxml";
			
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
			
			this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDTASA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Tasa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Tasa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Tasa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Tasa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPrestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPrestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPrestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPrestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuotas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuotas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuotas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuotas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TablaAmortiConstantesFunciones.LABEL_IDMES:
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
		
		if(this.jInternalFrameReporteDinamicoTablaAmorti.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDTASA:
					sNombreCampoCategoria="id_tasa";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoria="valor_prestamo";
					break;

				case TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoria="numero_cuotas";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDTASA:
					sNombreCampoCategoriaValor="id_tasa";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO:
					sNombreCampoCategoriaValor="valor_prestamo";
					break;

				case TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS:
					sNombreCampoCategoriaValor="numero_cuotas";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDTASA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tasa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tasa");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Prestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_prestamo");
					break;

				case TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuotas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuotas");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDMES:
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
	
	public void jButtonGenerarExcelReporteDinamicoTablaAmortiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TablaAmortis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TablaAmortiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDTASA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDTASA);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.gettasa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getvalor_prestamo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getnumero_cuotas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TablaAmortiConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(TablaAmorti tablaamorti:tablaamortisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tablaamorti.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelTablaAmorti(row);				
			//	iRow++;
			//}				
			
			//for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTablaAmorti(tablaamortiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
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
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmorti(false);
			
			//SI ES MANUAL
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTablaAmorti();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmorti(false);
			
			//SI ES MANUAL
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaAmorti();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTablaAmortiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTablaAmorti(false);
			
			//SI ES MANUAL
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTablaAmorti();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTablaAmorti() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTablaAmorti.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTablaAmorti.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTablaAmorti.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTablaAmorti.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTablaAmorti.setMinimumSize(dimensionMinimum);
		this.jTableDatosTablaAmorti.setMaximumSize(dimensionMaximum);
		this.jTableDatosTablaAmorti.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTablaAmorti(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTablaAmorti(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTablaAmorti(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTablaAmorti(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTablaAmorti(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTablaAmorti(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmorti(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTablaAmorti(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTablaAmorti() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTablaAmorti();
		
		this.inicializarActualizarBindingBotonesManualTablaAmorti(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTablaAmorti();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmorti() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmorti(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmorti(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTablaAmorti.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTablaAmorti.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTablaAmorti.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionNuevoTablaAmorti.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionSinCerrarTablaAmorti.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionSinMensajeTablaAmorti.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTablaAmorti.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTablaAmorti.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTablaAmorti.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
				this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionNuevoTablaAmorti.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionSinCerrarTablaAmorti.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTablaAmorti.jCheckBoxPostAccionSinMensajeTablaAmorti.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTablaAmorti.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTablaAmorti.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTablaAmorti.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTablaAmorti.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTablaAmorti.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTablaAmorti.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTablaAmorti.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTablaAmorti.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTablaAmorti.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTablaAmorti(Boolean esInicializar) throws Exception {
		try	{	
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTablaAmorti(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTablaAmorti() throws Exception {
		try	{
			if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaAmorti();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaAmorti() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTablaAmorti() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTablaAmorti.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTablaAmorti.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTablaAmorti.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTablaAmorti.addItem(reporte);
			}
			
			
			if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTablaAmorti.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTablaAmorti.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTablaAmorti.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTablaAmorti.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTablaAmorti.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTablaAmorti.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTablaAmorti.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmorti();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTablaAmorti() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
				
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=TablaAmortiConstantesFunciones.getTiposSeleccionarTablaAmorti(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=TablaAmortiConstantesFunciones.getTiposSeleccionarTablaAmorti(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=TablaAmortiConstantesFunciones.getTiposSeleccionarTablaAmorti(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTablaAmorti.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoTablaAmorti.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTablaAmorti()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaTablaAmorti.getSelectedItem()).getId();}
		if(this.jComboBoxid_tasaFK_IdTasaTablaAmorti.getSelectedItem()!=null){this.id_tasaFK_IdTasa=((Tasa)this.jComboBoxid_tasaFK_IdTasaTablaAmorti.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTablaAmorti(Boolean esInicializar) throws Exception {				
		if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTablaAmorti();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTablaAmorti() throws Exception {
		this.inicializarActualizarBindingTablaTablaAmorti(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTablaAmorti() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTablaAmortiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmortiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTablaAmorti(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tablaamortiLogic.getTablaAmortis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tablaamortis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTablaAmorti.setModel(new TablaAmortiModel(this.tablaamortiLogic.getTablaAmortis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTablaAmorti.setModel(new TablaAmortiModel(this.tablaamortis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTablaAmorti!=null && this.jInternalFrameOrderByTablaAmorti.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTablaAmorti();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO,tablaamortiConstantesFunciones.resaltarSeleccionarTablaAmorti,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TablaAmortiConstantesFunciones.SCLASSWEBTITULO,tablaamortiConstantesFunciones.resaltarSeleccionarTablaAmorti,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_ID));

		if(this.tablaamortiConstantesFunciones.mostraridTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortiConstantesFunciones.resaltaridTablaAmorti,this.tablaamortiConstantesFunciones.activaridTablaAmorti,iSizeTabla,this,true,"idTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortiConstantesFunciones.resaltaridTablaAmorti,this.tablaamortiConstantesFunciones.activaridTablaAmorti,this,true,"idTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tablaamortiConstantesFunciones.mostrarid_empresaTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_empresaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_empresaTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_empresaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_empresaTablaAmorti,false,"id_empresaTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.tablaamortiConstantesFunciones.mostrarid_sucursalTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.tablaamortiConstantesFunciones.resaltarid_sucursalTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_sucursalTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.tablaamortiConstantesFunciones.resaltarid_sucursalTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_sucursalTablaAmorti,false,"id_sucursalTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.tablaamortiConstantesFunciones.mostrarid_ejercicioTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_ejercicioTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_ejercicioTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_ejercicioTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_ejercicioTablaAmorti,false,"id_ejercicioTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDPERIODO));

		if(this.tablaamortiConstantesFunciones.mostrarid_periodoTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_periodoTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_periodoTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_periodoTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_periodoTablaAmorti,false,"id_periodoTablaAmorti","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDTASA));

		if(this.tablaamortiConstantesFunciones.mostrarid_tasaTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDTASA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TasaTableCell(this.tasasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_tasaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_tasaTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new TasaTableCell(this.tasasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_tasaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_tasaTablaAmorti,true,"id_tasaTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDFACTURA));

		if(this.tablaamortiConstantesFunciones.mostrarid_facturaTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_facturaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_facturaTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.tablaamortiConstantesFunciones.resaltarid_facturaTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_facturaTablaAmorti,true,"id_facturaTablaAmorti","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_FECHAEMISION));

		if(this.tablaamortiConstantesFunciones.mostrarfecha_emisionTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortiConstantesFunciones.resaltarfecha_emisionTablaAmorti,this.tablaamortiConstantesFunciones.activarfecha_emisionTablaAmorti,iSizeTabla,this,true,"fecha_emisionTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortiConstantesFunciones.resaltarfecha_emisionTablaAmorti,this.tablaamortiConstantesFunciones.activarfecha_emisionTablaAmorti,this,true,"fecha_emisionTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.tablaamortiConstantesFunciones.mostrarfecha_vencimientoTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tablaamortiConstantesFunciones.resaltarfecha_vencimientoTablaAmorti,this.tablaamortiConstantesFunciones.activarfecha_vencimientoTablaAmorti,iSizeTabla,this,true,"fecha_vencimientoTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tablaamortiConstantesFunciones.resaltarfecha_vencimientoTablaAmorti,this.tablaamortiConstantesFunciones.activarfecha_vencimientoTablaAmorti,this,true,"fecha_vencimientoTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO));

		if(this.tablaamortiConstantesFunciones.mostrarvalor_prestamoTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortiConstantesFunciones.resaltarvalor_prestamoTablaAmorti,this.tablaamortiConstantesFunciones.activarvalor_prestamoTablaAmorti,iSizeTabla,this,true,"valor_prestamoTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortiConstantesFunciones.resaltarvalor_prestamoTablaAmorti,this.tablaamortiConstantesFunciones.activarvalor_prestamoTablaAmorti,this,true,"valor_prestamoTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS));

		if(this.tablaamortiConstantesFunciones.mostrarnumero_cuotasTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tablaamortiConstantesFunciones.resaltarnumero_cuotasTablaAmorti,this.tablaamortiConstantesFunciones.activarnumero_cuotasTablaAmorti,iSizeTabla,this,true,"numero_cuotasTablaAmorti","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tablaamortiConstantesFunciones.resaltarnumero_cuotasTablaAmorti,this.tablaamortiConstantesFunciones.activarnumero_cuotasTablaAmorti,this,true,"numero_cuotasTablaAmorti","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDANIO));

		if(this.tablaamortiConstantesFunciones.mostrarid_anioTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_anioTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_anioTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.tablaamortiConstantesFunciones.resaltarid_anioTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_anioTablaAmorti,true,"id_anioTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,TablaAmortiConstantesFunciones.LABEL_IDMES));

		if(this.tablaamortiConstantesFunciones.mostrarid_mesTablaAmorti && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TablaAmortiConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.tablaamortiConstantesFunciones.resaltarid_mesTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_mesTablaAmorti,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.tablaamortiConstantesFunciones.resaltarid_mesTablaAmorti,this,this.tablaamortiConstantesFunciones.activarid_mesTablaAmorti,true,"id_mesTablaAmorti","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TablaAmortiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleTablaAmorti && this.tablaamortiConstantesFunciones.mostrarDetalleTablaAmortiTablaAmorti && !TablaAmortiConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Tabla Amortis");
				tableColumn.setHeaderValue("Detalle Tabla Amortis");
				tableColumn.setCellRenderer(new DetalleTablaAmortiTableCell(tablaamortiConstantesFunciones.resaltarDetalleTablaAmortiTablaAmorti,this,this.tablaamortiConstantesFunciones.activarDetalleTablaAmortiTablaAmorti));
				tableColumn.setCellEditor(new DetalleTablaAmortiTableCell(tablaamortiConstantesFunciones.resaltarDetalleTablaAmortiTablaAmorti,this,this.tablaamortiConstantesFunciones.activarDetalleTablaAmortiTablaAmorti));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTablaAmorti.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaAmorti.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTablaAmorti.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tablaamortiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTablaAmorti.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tablaamortiSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTablaAmorti.addColumn(tableColumn);
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
			
			this.jTableDatosTablaAmorti.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tablaamortiSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTablaAmorti.moveColumn(this.jTableDatosTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTablaAmorti.moveColumn(this.jTableDatosTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tablaamortiSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTablaAmorti.moveColumn(this.jTableDatosTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTablaAmorti.moveColumn(this.jTableDatosTablaAmorti.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTablaAmorti.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTablaAmorti.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTablaAmorti,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTablaAmorti.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTablaAmorti.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTablaAmorti.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTablaAmorti.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTablaAmorti.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tablaamortiLogic.getTablaAmortis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tablaamortis.size()-1;
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
		//this.jTableDatosTablaAmorti.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTablaAmorti.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTablaAmorti();
			
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
				
				//this.isEsNuevoTablaAmorti=false;
					
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
				if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTablaAmorti==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaAmorti.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tablaamorti.getsType().equals("DUPLICADO")
				   || this.tablaamorti.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTablaAmorti=true;
				
				} else {
					this.isEsNuevoTablaAmorti=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					if(this.tablaamorti.getId()>=0 && !this.tablaamorti.getIsNew()) {						
						this.isEsNuevoTablaAmorti=false;
						
					} else {
						this.isEsNuevoTablaAmorti=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTablaAmorti(esRelaciones);						
				
				this.seleccionarTablaAmorti(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tablaamorti.getId()<0) {
					this.isEsNuevoTablaAmorti=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTablaAmorti(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTablaAmorti(evt,rowIndex);
				}	
				
				if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TablaAmorti: " + this.dDif); 
					}
				}								
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTablaAmorti(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tablaamorti)) {
					if(this.tablaamorti.getId()>0) {
						this.tablaamorti.setIsDeleted(true);
						
						this.tablaamortisEliminados.add(this.tablaamorti);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tablaamortiLogic.getTablaAmortis().remove(this.tablaamorti);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tablaamortis.remove(this.tablaamorti);				
					}
					
					
					((TablaAmortiModel) this.jTableDatosTablaAmorti.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTablaAmorti(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTablaAmorti(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTablaAmorti) {
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTablaAmorti.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTablaAmorti.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTablaAmorti(this.tablaamorti);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tablaamortiConstantesFunciones.cargarid_empresaTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_empresaTablaAmorti) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tablaamorti.getid_empresa());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tablaamorti.getEmpresa()!=null) {
							this.empresasForeignKey.add(tablaamorti.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tablaamorti.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.tablaamortiConstantesFunciones.cargarid_sucursalTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_sucursalTablaAmorti) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.tablaamorti.getid_sucursal());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(tablaamorti.getSucursal()!=null) {
							this.sucursalsForeignKey.add(tablaamorti.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.tablaamorti.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.tablaamortiConstantesFunciones.cargarid_ejercicioTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_ejercicioTablaAmorti) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.tablaamorti.getid_ejercicio());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(tablaamorti.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(tablaamorti.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.tablaamorti.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.tablaamortiConstantesFunciones.cargarid_periodoTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_periodoTablaAmorti) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.tablaamorti.getid_periodo());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(tablaamorti.getPeriodo()!=null) {
							this.periodosForeignKey.add(tablaamorti.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.tablaamorti.getid_periodo(),false,"Formulario");

					//Tasa
					if(!this.tablaamortiConstantesFunciones.cargarid_tasaTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_tasaTablaAmorti) {
						//this.cargarCombosTasasForeignKeyLista(" where id="+this.tablaamorti.getid_tasa());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.tasasForeignKey=new ArrayList<Tasa>();

						if(tablaamorti.getTasa()!=null) {
							this.tasasForeignKey.add(tablaamorti.getTasa());
						}

						this.addItemDefectoCombosForeignKeyTasa();
						this.cargarCombosFrameTasasForeignKey("Todos");
					}
					this.setActualTasaForeignKey(this.tablaamorti.getid_tasa(),false,"Formulario");

					//Factura
					if(!this.tablaamortiConstantesFunciones.cargarid_facturaTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_facturaTablaAmorti) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.tablaamorti.getid_factura());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(tablaamorti.getFactura()!=null) {
							this.facturasForeignKey.add(tablaamorti.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.tablaamorti.getid_factura(),false,"Formulario");

					//Anio
					if(!this.tablaamortiConstantesFunciones.cargarid_anioTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_anioTablaAmorti) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.tablaamorti.getid_anio());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(tablaamorti.getAnio()!=null) {
							this.aniosForeignKey.add(tablaamorti.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.tablaamorti.getid_anio(),false,"Formulario");

					//Mes
					if(!this.tablaamortiConstantesFunciones.cargarid_mesTablaAmorti || this.tablaamortiConstantesFunciones.event_dependid_mesTablaAmorti) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.tablaamorti.getid_mes());
									//this.inicializarActualizarBindingTablaAmorti(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(tablaamorti.getMes()!=null) {
							this.messForeignKey.add(tablaamorti.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.tablaamorti.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTablaAmorti("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTablaAmorti(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTablaAmorti() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaAmorti(TablaAmorti tablaamorti) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTablaAmorti(tablaamorti,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTablaAmorti(TablaAmorti tablaamorti,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTablaAmorti(tablaamorti);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTablaAmorti(tablaamorti,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTablaAmorti(tablaamorti);
	}
	
	public void setVariablesObjetoActualToFormularioTablaAmorti(TablaAmorti tablaamorti) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setText(tablaamorti.getId().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setDate(tablaamorti.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setDate(tablaamorti.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setText(tablaamorti.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setText(tablaamorti.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TablaAmorti tablaamortiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tablaamortiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TablaAmorti tablaamortiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tablaamortiLocal=this.tablaamorti;
			} else {
				tablaamortiLocal=this.tablaamortiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tablaamortiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTablaAmorti(tablaamortiLocal,true);
					
					if(tablaamortiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tablaamortiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tablaamortiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTablaAmorti(TablaAmorti tablaamorti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaAmorti(tablaamorti,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(tablaamorti);
	}
	
	public void setVariablesFormularioToObjetoActualTablaAmorti(TablaAmorti tablaamorti,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTablaAmorti(tablaamorti,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTablaAmorti(TablaAmorti tablaamorti,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.getText()==null || this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.getText()=="" || this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.getText()=="Id") {
				this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setText("0");
			}

			if(conColumnasBase) {tablaamorti.setId(Long.parseLong(this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelIdTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamorti.setfecha_emision(this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_emisionTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamorti.setfecha_vencimiento(this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelfecha_vencimientoTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamorti.setvalor_prestamo(Double.parseDouble(this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelvalor_prestamoTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tablaamorti.setnumero_cuotas(Integer.parseInt(this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTablaAmorti.jLabelnumero_cuotasTablaAmorti,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTablaAmorti(TablaAmorti tablaamortiBean,TablaAmorti tablaamorti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTablaAmorti(TablaAmorti tablaamortiOrigen,TablaAmorti tablaamorti,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaamortiOrigen.getId()!=null && !tablaamortiOrigen.getId().equals(0L))) {tablaamorti.setId(tablaamortiOrigen.getId());}}
			if(conDefault || (!conDefault && tablaamortiOrigen.getfecha_emision()!=null && !tablaamortiOrigen.getfecha_emision().equals(new Date()))) {tablaamorti.setfecha_emision(tablaamortiOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && tablaamortiOrigen.getfecha_vencimiento()!=null && !tablaamortiOrigen.getfecha_vencimiento().equals(new Date()))) {tablaamorti.setfecha_vencimiento(tablaamortiOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && tablaamortiOrigen.getvalor_prestamo()!=null && !tablaamortiOrigen.getvalor_prestamo().equals(0.0))) {tablaamorti.setvalor_prestamo(tablaamortiOrigen.getvalor_prestamo());}
			if(conDefault || (!conDefault && tablaamortiOrigen.getnumero_cuotas()!=null && !tablaamortiOrigen.getnumero_cuotas().equals(0))) {tablaamorti.setnumero_cuotas(tablaamortiOrigen.getnumero_cuotas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaAmorti(TablaAmorti tablaamorti) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setText(tablaamorti.getId().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setDate(tablaamorti.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setDate(tablaamorti.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setText(tablaamorti.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setText(tablaamorti.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTablaAmorti(TablaAmortiBean tablaamortiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setText(tablaamortiBean.getId().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setDate(tablaamortiBean.getfecha_emision());
			this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setDate(tablaamortiBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setText(tablaamortiBean.getvalor_prestamo().toString());
			this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setText(tablaamortiBean.getnumero_cuotas().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTablaAmorti(TablaAmortiParameterReturnGeneral tablaamortiReturnGeneral,TablaAmortiBean tablaamortiBean,Boolean conDefault) throws Exception { 
		try {
			TablaAmorti tablaamortiLocal=new TablaAmorti();
			
			tablaamortiLocal=tablaamortiReturnGeneral.getTablaAmorti();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tablaamortiLocal.getId()!=null && !tablaamortiLocal.getId().equals(0L))) {tablaamortiBean.setId(tablaamortiLocal.getId());}}
			if(conDefault || (!conDefault && tablaamortiLocal.getfecha_emision()!=null && !tablaamortiLocal.getfecha_emision().equals(new Date()))) {tablaamortiBean.setfecha_emision(tablaamortiLocal.getfecha_emision());}
			if(conDefault || (!conDefault && tablaamortiLocal.getfecha_vencimiento()!=null && !tablaamortiLocal.getfecha_vencimiento().equals(new Date()))) {tablaamortiBean.setfecha_vencimiento(tablaamortiLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && tablaamortiLocal.getvalor_prestamo()!=null && !tablaamortiLocal.getvalor_prestamo().equals(0.0))) {tablaamortiBean.setvalor_prestamo(tablaamortiLocal.getvalor_prestamo());}
			if(conDefault || (!conDefault && tablaamortiLocal.getnumero_cuotas()!=null && !tablaamortiLocal.getnumero_cuotas().equals(0))) {tablaamortiBean.setnumero_cuotas(tablaamortiLocal.getnumero_cuotas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTablaAmortiGenerico(Long idTablaAmortiSeleccionado,JComboBox jComboBoxTablaAmorti,List<TablaAmorti> tablaamortisLocal)throws Exception {
		try {
			TablaAmorti  tablaamortiTemp=null;

			for(TablaAmorti tablaamortiAux:tablaamortisLocal) {
				if(tablaamortiAux.getId()!=null && tablaamortiAux.getId().equals(idTablaAmortiSeleccionado)) {
					tablaamortiTemp=tablaamortiAux;
					break;
				}
			}

			jComboBoxTablaAmorti.setSelectedItem(tablaamortiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTablaAmortiGenerico(JComboBox jComboBoxTablaAmorti,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaAmorti.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTablaAmorti.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTablaAmorti.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTablaAmorti.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTablaAmorti.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTablaAmorti.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleTablaAmorti")) {
			jButtonDetalleTablaAmortiActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamorti=(TablaAmorti) tablaamortiLogic.getTablaAmortis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaamorti =(TablaAmorti) tablaamortis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Tasa")) {
			//sDescripcion=this.getActualTasaForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.gettasa_descripcion();
			} else {
				//sDescripcion=this.getActualTasaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.gettasa_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getfactura_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!tablaamorti.getIsNew() && !tablaamorti.getIsChanged() && !tablaamorti.getIsDeleted()) {
				sDescripcion=tablaamorti.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=tablaamorti.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TablaAmorti tablaamortiRow=new TablaAmorti();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamortiRow=(TablaAmorti) tablaamortiLogic.getTablaAmortis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tablaamortiRow=(TablaAmorti) tablaamortis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleTablaAmortiActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TablaAmorti tablaamorti) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTablaAmorti==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti = (TablaAmorti)this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tablaamorti = (TablaAmorti)this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tablaamorti!=null) {
						this.tablaamorti = tablaamorti;
					} else {
						this.tablaamorti = new TablaAmorti();
					}
				}

				if(this.isTienePermisosDetalleTablaAmorti && this.permiteMantenimiento(this.tablaamorti)) {
					DetalleTablaAmortiBeanSwingJInternalFrame detalletablaamortiBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup=new DetalleTablaAmortiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalletablaamortiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup;
					} else {
						detalletablaamortiBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame;
					}

					List<TablaAmorti> tablaamortis=new ArrayList<TablaAmorti>();
					tablaamortis.add(this.tablaamorti);
					if(!esRelacionado) {
						//detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setConGuardarRelaciones(false);
						//detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalletablaamortiBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTablaAmorti.cargarDetalleTablaAmortiBeanSwingJInternalFrame(tablaamortis,this.tablaamorti,detalletablaamortiBeanSwingJInternalFrame,/*conInicializar,*/detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.getConGuardarRelaciones(),detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiSessionBean.getEsGuardarRelacionado());
					detalletablaamortiBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalletablaamortiBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTablaAmorti("no_relacionado");

						detalletablaamortiBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleTablaAmortiConstantesFunciones.ITAMANIOFILATABLA + (DetalleTablaAmortiConstantesFunciones.ITAMANIOFILATABLA/2));

						detalletablaamortiBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
						TitledBorder titledBorderDetalleTablaAmorti=(TitledBorder)detalletablaamortiBeanSwingJInternalFrame.jScrollPanelDatosDetalleTablaAmorti.getBorder();

						titledBorderDetalleTablaAmorti.setTitle(titledBorderTablaAmorti.getTitle() + " -> Detalle Tabla Amorti");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalletablaamortiBeanSwingJInternalFrame);
						}

						detalletablaamortiBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalletablaamortiBeanSwingJInternalFrame);

						detalletablaamortiBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tablaamortiSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Tabla Amorti",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTablaAmorti(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti));			
			this.jButtonDuplicarTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarTablaAmorti && this.isPermisoDuplicarTablaAmorti));			
			this.jButtonCopiarTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarTablaAmorti && this.isPermisoCopiarTablaAmorti));
			this.jButtonVerFormTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormTablaAmorti && this.isPermisoVerFormTablaAmorti));
			
			this.jButtonAbrirOrderByTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));			
			
			this.jButtonNuevoRelacionesTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmorti && this.isPermisoNuevoTablaAmorti));			
			this.jButtonNuevoGuardarCambiosTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarTablaAmorti.setVisible((this.isVisibilidadCeldaModificarTablaAmorti && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarTablaAmorti && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarTablaAmorti && this.isPermisoEliminarTablaAmorti));
			this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarTablaAmorti);							
			this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));			
			
			}
						
			this.jButtonGuardarCambiosTablaTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti));						
			this.jButtonDuplicarToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarTablaAmorti && this.isPermisoDuplicarTablaAmorti));						
			this.jButtonCopiarToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarTablaAmorti && this.isPermisoCopiarTablaAmorti));			
			this.jButtonVerFormToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormTablaAmorti && this.isPermisoVerFormTablaAmorti));			
			this.jButtonAbrirOrderByToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));
			this.jButtonNuevoRelacionesToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmorti && this.isPermisoNuevoTablaAmorti));			
			this.jButtonNuevoGuardarCambiosToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));			
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaModificarTablaAmorti && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarTablaAmorti  && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarTablaAmorti && this.isPermisoEliminarTablaAmorti));
			this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarToolBarTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarTablaAmorti);				
			this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti));			
			this.jMenuItemDuplicarTablaAmorti.setVisible((this.isVisibilidadCeldaDuplicarTablaAmorti && this.isPermisoDuplicarTablaAmorti));			
			this.jMenuItemCopiarTablaAmorti.setVisible((this.isVisibilidadCeldaCopiarTablaAmorti && this.isPermisoCopiarTablaAmorti));			
			this.jMenuItemVerFormTablaAmorti.setVisible((this.isVisibilidadCeldaVerFormTablaAmorti && this.isPermisoVerFormTablaAmorti));			
			this.jMenuItemAbrirOrderByTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));			
			//this.jMenuItemMostrarOcultarTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));
			this.jMenuItemDetalleAbrirOrderByTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));			
			//this.jMenuItemDetalleMostrarOcultarTablaAmorti.setVisible((this.isVisibilidadCeldaOrdenTablaAmorti && this.isPermisoOrdenTablaAmorti));			
			this.jMenuItemNuevoRelacionesTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoRelacionesTablaAmorti && this.isPermisoNuevoTablaAmorti));			
			this.jMenuItemNuevoGuardarCambiosTablaAmorti.setVisible((this.isVisibilidadCeldaNuevoTablaAmorti && this.isPermisoNuevoTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));									
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemModificarTablaAmorti.setVisible((this.isVisibilidadCeldaModificarTablaAmorti && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemActualizarTablaAmorti.setVisible((this.isVisibilidadCeldaActualizarTablaAmorti && this.isPermisoActualizarTablaAmorti));	
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemEliminarTablaAmorti.setVisible((this.isVisibilidadCeldaEliminarTablaAmorti && this.isPermisoEliminarTablaAmorti));
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemCancelarTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarTablaAmorti);				
			}
			
			this.jMenuItemGuardarCambiosTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));						
			this.jMenuItemGuardarCambiosTablaTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarCambiosTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTablaAmorti=this.jButtonNuevoTablaAmorti.isVisible();
			this.isVisibilidadCeldaDuplicarTablaAmorti=this.jButtonDuplicarTablaAmorti.isVisible();
			this.isVisibilidadCeldaCopiarTablaAmorti=this.jButtonCopiarTablaAmorti.isVisible();
			this.isVisibilidadCeldaVerFormTablaAmorti=this.jButtonVerFormTablaAmorti.isVisible();
			
			this.isVisibilidadCeldaOrdenTablaAmorti=this.jButtonAbrirOrderByTablaAmorti.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=this.jButtonNuevoRelacionesTablaAmorti.isVisible();
			this.isVisibilidadCeldaModificarTablaAmorti=this.jButtonModificarTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.isVisibilidadCeldaActualizarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=this.jButtonGuardarCambiosTablaTablaAmorti.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTablaAmorti=this.jButtonNuevoToolBarTablaAmorti.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=this.jButtonNuevoRelacionesToolBarTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.isVisibilidadCeldaModificarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarToolBarTablaAmorti.isVisible();
			this.isVisibilidadCeldaActualizarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarToolBarTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarToolBarTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarToolBarTablaAmorti.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaAmorti=this.jButtonGuardarCambiosToolBarTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=this.jButtonGuardarCambiosTablaToolBarTablaAmorti.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTablaAmorti=this.jMenuItemNuevoTablaAmorti.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=this.jMenuItemNuevoRelacionesTablaAmorti.isVisible();
			
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.isVisibilidadCeldaModificarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jMenuItemModificarTablaAmorti.isVisible();
			this.isVisibilidadCeldaActualizarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jMenuItemActualizarTablaAmorti.isVisible();
			this.isVisibilidadCeldaEliminarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jMenuItemEliminarTablaAmorti.isVisible();
			this.isVisibilidadCeldaCancelarTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.jMenuItemCancelarTablaAmorti.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTablaAmorti=this.jMenuItemGuardarCambiosTablaAmorti.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=this.jMenuItemGuardarCambiosTablaTablaAmorti.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTablaAmorti(Boolean esInicializar) {
		if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
				//if(this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTablaAmorti();
			}
			
			this.inicializarActualizarBindingBotonesManualTablaAmorti(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTablaAmorti() {
		this.jButtonNuevoTablaAmorti.setVisible(this.isPermisoNuevoTablaAmorti);			
		this.jButtonDuplicarTablaAmorti.setVisible(this.isPermisoDuplicarTablaAmorti);			
		this.jButtonCopiarTablaAmorti.setVisible(this.isPermisoCopiarTablaAmorti);			
		this.jButtonVerFormTablaAmorti.setVisible(this.isPermisoVerFormTablaAmorti);			
		
		this.jButtonAbrirOrderByTablaAmorti.setVisible(this.isPermisoOrdenTablaAmorti);					
		
		this.jButtonNuevoRelacionesTablaAmorti.setVisible(this.isPermisoNuevoTablaAmorti);			
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarTablaAmorti.setVisible(this.isPermisoActualizarTablaAmorti);	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.setVisible(this.isPermisoActualizarTablaAmorti);	
			this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.setVisible(this.isPermisoEliminarTablaAmorti);
			this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarTablaAmorti);						
			this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.setVisible(this.isPermisoGuardarCambiosTablaAmorti);							
		}
		
		this.jButtonGuardarCambiosTablaTablaAmorti.setVisible(this.isPermisoActualizarTablaAmorti);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaAmorti() {
		this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarTablaAmorti.setVisible(this.isPermisoActualizarTablaAmorti);	
		this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.setVisible(this.isPermisoActualizarTablaAmorti);	
		this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.setVisible(this.isPermisoEliminarTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.setVisible(this.isVisibilidadCeldaCancelarTablaAmorti);							
		this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.setVisible((this.isVisibilidadCeldaGuardarTablaAmorti && this.isPermisoGuardarCambiosTablaAmorti));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTablaAmorti() {
		if(TablaAmortiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTablaAmorti();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTablaAmorti() {
	}
	
	public void jTableDatosTablaAmortiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTablaAmorti(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tablaamorti.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTablaAmorti.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tablaamorti.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTablaAmorti.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.tablaamorti.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderTablaAmorti.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.tablaamorti.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderTablaAmorti.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.tablaamorti.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tasaTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotasa=true;

			idTienePermisotasa=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(TasaConstantesFunciones.CLASSNAME);

			if(idTienePermisotasa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.tasaBeanSwingJInternalFrame=new TasaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tasaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tasaBeanSwingJInternalFrame.getTasaLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_tasa()!=null) {
					this.tasaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tasaBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_tasa());
					this.tasaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tasaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tasaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTasa();
				}

				JInternalFrameBase jinternalFrame =this.tasaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBordertasa=(TitledBorder)this.tasaBeanSwingJInternalFrame.jScrollPanelDatosTasa.getBorder();

				titledBordertasa.setTitle(titledBorderTablaAmorti.getTitle() + " -> Tasa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tasaTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_tasa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tasa = "+this.tablaamorti.getid_tasa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaTablaAmortiActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderTablaAmorti=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosTablaAmorti.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTablaAmorti.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderTablaAmorti.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.tablaamorti.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.tablaamorti.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.tablaamorti.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_prestamoTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getvalor_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_prestamo = "+this.tablaamorti.getvalor_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuotasTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getnumero_cuotas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuotas = "+this.tablaamorti.getnumero_cuotas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderTablaAmorti.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.tablaamorti.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesTablaAmortiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebTablaAmorti(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTablaAmorti.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTablaAmorti.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.tablaamortiLogic.getConnexion());

				if(this.tablaamorti.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.tablaamorti.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTablaAmorti=(TitledBorder)this.jScrollPanelDatosTablaAmorti.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderTablaAmorti.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesTablaAmortiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.gettablaamorti(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tablaamorti==null) {
						this.tablaamorti = new TablaAmorti();
					}

					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);
				}

				if(this.tablaamorti.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.tablaamorti.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTablaAmorti(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdAnio();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdEjercicio();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdEmpresa();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdFactura();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdMes();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdPeriodo();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdSucursal();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTasaTablaAmortiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTablaAmorti(false,false);

			this.getTablaAmortisFK_IdTasa();

			this.inicializarActualizarBindingTablaAmorti(false);

			//if(TablaAmortiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTablaAmorti(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tablaamortiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTablaAmorti() {
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
		

		if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
			this.jInternalFrameDetalleFormTablaAmorti.setVisible(false);	    			
			this.jInternalFrameDetalleFormTablaAmorti.dispose();
			this.jInternalFrameDetalleFormTablaAmorti=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
			this.jInternalFrameReporteDinamicoTablaAmorti.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTablaAmorti.dispose();
			this.jInternalFrameReporteDinamicoTablaAmorti=null;
		}
		
		if(this.jInternalFrameImportacionTablaAmorti!=null) {
			this.jInternalFrameImportacionTablaAmorti.setVisible(false);	    			
			this.jInternalFrameImportacionTablaAmorti.dispose();
			this.jInternalFrameImportacionTablaAmorti=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTablaAmorti();
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			
			if(sTipo.equals("NuevoTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTablaAmorti")) {
				jButtonDuplicarTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTablaAmorti")) {
				jButtonCopiarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("VerFormTablaAmorti")) {
				jButtonVerFormTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTablaAmorti")) {
				jButtonDuplicarTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTablaAmorti")) {
				jButtonDuplicarTablaAmortiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTablaAmorti")) {
				jButtonModificarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTablaAmorti")) {
				jButtonModificarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTablaAmorti")) {
				jButtonModificarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTablaAmorti")) {
				jButtonActualizarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTablaAmorti")) {
				jButtonActualizarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTablaAmorti")) {
				jButtonActualizarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("EliminarTablaAmorti")) {
				jButtonEliminarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTablaAmorti")) {
				jButtonEliminarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTablaAmorti")) {
				jButtonEliminarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CancelarTablaAmorti")) {
				jButtonCancelarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTablaAmorti")) {
				jButtonCancelarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTablaAmorti")) {
				jButtonCancelarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CerrarTablaAmorti")) {
				jButtonCerrarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTablaAmorti")) {
				jButtonCerrarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTablaAmorti")) {
				jButtonCerrarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTablaAmorti")) {
				jButtonMostrarOcultarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTablaAmorti")) {
				jButtonCancelarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTablaAmorti")) {
				jButtonCopiarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTablaAmorti")) {
				jButtonVerFormTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTablaAmorti")) {
				jButtonCopiarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTablaAmorti")) {
				jButtonVerFormTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTablaAmorti")) {
				jButtonRecargarInformacionTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTablaAmorti")) {
				jButtonRecargarInformacionTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTablaAmorti")) {
				jButtonRecargarInformacionTablaAmortiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTablaAmorti")) {
				jButtonAnterioresTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTablaAmorti")) {
				jButtonAnterioresTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTablaAmorti")) {
				jButtonAnterioresTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTablaAmorti")) {
				jButtonSiguientesTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTablaAmorti")) {
				jButtonSiguientesTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTablaAmorti")) {
				jButtonSiguientesTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTablaAmorti") || sTipo.equals("MenuItemDetalleAbrirOrderByTablaAmorti")) {
				jButtonAbrirOrderByTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTablaAmorti") || sTipo.equals("MenuItemDetalleMostrarOcultarTablaAmorti")) {
				jButtonMostrarOcultarTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTablaAmorti")) {
				jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTablaAmorti")) {
				jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTablaAmorti")) {
				jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTablaAmorti")) {
				jButtonCerrarReporteDinamicoTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTablaAmorti")) {
				jButtonGenerarReporteDinamicoTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTablaAmorti")) {
				
				jButtonGenerarExcelReporteDinamicoTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTablaAmorti")) {
				jButtonCerrarImportacionTablaAmortiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTablaAmorti")) {
				
				jButtonGenerarImportacionTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTablaAmorti")) {
				
				jButtonAbrirImportacionTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTablaAmorti")) {
				jComboBoxTiposAccionesTablaAmortiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTablaAmorti")) {
				jComboBoxTiposRelacionesTablaAmortiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTablaAmorti")) {
				jComboBoxTiposAccionesTablaAmortiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTablaAmorti")) {
				
				jComboBoxTiposSeleccionarTablaAmortiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTablaAmorti")) {
				jTextFieldValorCampoGeneralTablaAmortiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTablaAmorti")) {
				jButtonAbrirOrderByTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTablaAmorti")) {
				jButtonAbrirOrderByTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTablaAmorti")) {
				jButtonCerrarOrderByTablaAmortiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaAmortiBusqueda")) {
				this.jButtonidTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiUpdate")) {
				this.jButtonid_empresaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiBusqueda")) {
				this.jButtonid_empresaTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiUpdate")) {
				this.jButtonid_sucursalTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiBusqueda")) {
				this.jButtonid_sucursalTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiUpdate")) {
				this.jButtonid_ejercicioTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiBusqueda")) {
				this.jButtonid_ejercicioTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiUpdate")) {
				this.jButtonid_periodoTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiBusqueda")) {
				this.jButtonid_periodoTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiUpdate")) {
				this.jButtonid_tasaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiBusqueda")) {
				this.jButtonid_tasaTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTablaAmorti")) {
				this.jButtonid_facturaTablaAmortiActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiUpdate")) {
				this.jButtonid_facturaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiBusqueda")) {
				this.jButtonid_facturaTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionTablaAmortiBusqueda")) {
				this.jButtonfecha_emisionTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoTablaAmortiBusqueda")) {
				this.jButtonfecha_vencimientoTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoTablaAmortiBusqueda")) {
				this.jButtonvalor_prestamoTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasTablaAmortiBusqueda")) {
				this.jButtonnumero_cuotasTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioTablaAmortiUpdate")) {
				this.jButtonid_anioTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioTablaAmortiBusqueda")) {
				this.jButtonid_anioTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesTablaAmortiUpdate")) {
				this.jButtonid_mesTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesTablaAmortiBusqueda")) {
				this.jButtonid_mesTablaAmortiBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_facturaTablaAmorti")) {
				this.jButtonid_facturaTablaAmortiActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdFacturaTablaAmorti")) {
				this.jButtonFK_IdFacturaTablaAmortiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTasaTablaAmorti")) {
				this.jButtonFK_IdTasaTablaAmortiActionPerformed(evt);
			}
			
			;
			
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTablaAmorti();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TablaAmorti tablaamortiLocal=null;
			
			if(!this.getEsControlTabla()) {
				tablaamortiLocal=this.tablaamorti;
			} else {
				tablaamortiLocal=this.tablaamortiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
							
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
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
			
			


			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
								
						
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
								
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
							
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
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
			
			


			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
								
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTablaAmorti")) {
					jCheckBoxSeleccionarTodosTablaAmortiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTablaAmorti")) {
					jCheckBoxSeleccionadosTablaAmortiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTablaAmorti")) {
					
				}
				
				


				
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
												
				
				


				
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
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
			
			


			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTablaAmortiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tablaamorti);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tablaamorti);
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
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
				
				


				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TablaAmorti.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TablaAmorti.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTablaAmortiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tablaamortiAnterior =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTablaAmorti")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTablaAmortiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTablaAmorti.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tablaamorti =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tablaamorti =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tablaamorti);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTablaAmorti")) {
				
				}
				
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTablaAmorti")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTablaAmorti.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTablaAmorti")) {
			
			}
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTablaAmorti();
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			if(sTipo.equals("NuevoTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTablaAmorti")) {
				jButtonDuplicarTablaAmortiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTablaAmorti")) {
				jButtonCopiarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTablaAmorti")) {
				jButtonVerFormTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTablaAmorti")) {
				jButtonNuevoTablaAmortiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTablaAmorti")) {
				jButtonModificarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTablaAmorti")) {
				jButtonActualizarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTablaAmorti")) {
				jButtonEliminarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTablaAmorti")) {
				jButtonCancelarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTablaAmorti")) {
				jButtonCerrarTablaAmortiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAmorti")) {
				jButtonGuardarCambiosTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTablaAmorti")) {
				jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTablaAmorti")) {
				jButtonAbrirOrderByTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTablaAmorti")) {
				jButtonRecargarInformacionTablaAmortiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTablaAmorti")) {
				jButtonAnterioresTablaAmortiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTablaAmorti")) {
				jButtonSiguientesTablaAmortiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTablaAmortiBusqueda")) {
				this.jButtonidTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiUpdate")) {
				this.jButtonid_empresaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTablaAmortiBusqueda")) {
				this.jButtonid_empresaTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiUpdate")) {
				this.jButtonid_sucursalTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTablaAmortiBusqueda")) {
				this.jButtonid_sucursalTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiUpdate")) {
				this.jButtonid_ejercicioTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioTablaAmortiBusqueda")) {
				this.jButtonid_ejercicioTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiUpdate")) {
				this.jButtonid_periodoTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoTablaAmortiBusqueda")) {
				this.jButtonid_periodoTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiUpdate")) {
				this.jButtonid_tasaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tasaTablaAmortiBusqueda")) {
				this.jButtonid_tasaTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaTablaAmorti")) {
				this.jButtonid_facturaTablaAmortiActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiUpdate")) {
				this.jButtonid_facturaTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaTablaAmortiBusqueda")) {
				this.jButtonid_facturaTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionTablaAmortiBusqueda")) {
				this.jButtonfecha_emisionTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoTablaAmortiBusqueda")) {
				this.jButtonfecha_vencimientoTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_prestamoTablaAmortiBusqueda")) {
				this.jButtonvalor_prestamoTablaAmortiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuotasTablaAmortiBusqueda")) {
				this.jButtonnumero_cuotasTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioTablaAmortiUpdate")) {
				this.jButtonid_anioTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioTablaAmortiBusqueda")) {
				this.jButtonid_anioTablaAmortiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesTablaAmortiUpdate")) {
				this.jButtonid_mesTablaAmortiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesTablaAmortiBusqueda")) {
				this.jButtonid_mesTablaAmortiBusquedaActionPerformed(evt);
			}
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTablaAmorti();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTablaAmorti")) {
				closingInternalFrameTablaAmorti();
				
			} else if(sTipo.equals("jButtonCancelarTablaAmorti")) {
				JInternalFrameBase jInternalFrameDetalleFormTablaAmorti = (JInternalFrameBase)evt.getSource();
	            	
	            TablaAmortiBeanSwingJInternalFrame jInternalFrameParent=(TablaAmortiBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaAmorti.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTablaAmortiActionPerformed(null);
			}
			
			TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tablaamorti,new Object(),this.tablaamortiParameterGeneral,this.tablaamortiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTablaAmorti(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTablaAmorti(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTablaAmorti(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tablaamorti)) {
			if(!esControlTabla) {
				if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);			
				}
				
				if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTablaAmorti(this.tablaamorti,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaamortiReturnGeneral=tablaamortiLogic.procesarEventosTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortiLogic.getTablaAmortis(),this.tablaamorti,this.tablaamortiParameterGeneral,this.isEsNuevoTablaAmorti,classes);//this.tablaamortiLogic.getTablaAmorti()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTablaAmorti(this.tablaamortiReturnGeneral,this.tablaamortiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTablaAmorti(classes,this.tablaamortiReturnGeneral,this.tablaamortiBean,false);
					}
						
					if(this.tablaamortiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti());	
					}
						
					if(this.tablaamortiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti(),classes);//this.tablaamortiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTablaAmorti(this.tablaamorti,classes);//this.tablaamortiBean);									
				}
			
				if(TablaAmortiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTablaAmorti(this.tablaamorti,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTablaAmorti(this.tablaamorti);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tablaamortiAnterior!=null) {
						this.tablaamorti=this.tablaamortiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tablaamortiReturnGeneral=tablaamortiLogic.procesarEventosTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamortiLogic.getTablaAmortis(),this.tablaamorti,this.tablaamortiParameterGeneral,this.isEsNuevoTablaAmorti,classes);//this.tablaamortiLogic.getTablaAmorti()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tablaamortiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tablaamortiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tablaamortiReturnGeneral.getTablaAmorti(),tablaamortiLogic.getTablaAmortis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tablaamortiReturnGeneral.getTablaAmorti(),this.tablaamortis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTablaAmorti.repaint();
				
				//((AbstractTableModel) this.jTableDatosTablaAmorti.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTablaAmorti();
			}
		}
	}
	
	public void actualizarVisualTableDatosTablaAmorti() throws Exception {
		
		TablaAmortiModel tablaamortiModel=(TablaAmortiModel)this.jTableDatosTablaAmorti.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tablaamortiModel.tablaamortis=this.tablaamortiLogic.getTablaAmortis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tablaamortiModel.tablaamortis=this.tablaamortis;
		}
		
		
		((TablaAmortiModel) this.jTableDatosTablaAmorti.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTablaAmorti() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettablaamortiAnterior(),this.tablaamortiLogic.getTablaAmortis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettablaamortiAnterior(),this.tablaamortis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTablaAmorti();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTablaAmorti(TablaAmorti tablaamorti,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTablaAmorti.class)) {
					this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.setDetalleTablaAmortis(tablaamorti.getDetalleTablaAmortis());
					this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
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
										
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamorti,new Object(),generalEntityParameterGeneral,this.tablaamortiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tablaamortiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TablaAmortiConstantesFunciones.getClassesRelationshipsOfTablaAmorti(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TablaAmortiConstantesFunciones.getClassesRelationshipsFromStringsOfTablaAmorti(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTablaAmorti(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TablaAmortiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tablaamorti,new Object(),generalEntityParameterGeneral,this.tablaamortiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTablaAmorti(TablaAmortiBean tablaamortiBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTablaAmorti.class)) {
					this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.setDetalleTablaAmortis(tablaamorti.getDetalleTablaAmortis());
					this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTablaAmorti(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTablaAmorti(ArrayList<Classe> classes,TablaAmortiReturnGeneral tablaamortiReturnGeneral,TablaAmortiBean tablaamortiBean,Boolean conDefault) throws Exception {
		
			this.tablaamortiBean.setDetalleTablaAmortis(tablaamortiReturnGeneral.getTablaAmorti().getDetalleTablaAmortis());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTablaAmorti(TablaAmorti tablaamorti,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTablaAmorti.class)) {
					tablaamorti.setDetalleTablaAmortis(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiBeanSwingJInternalFrame.detalletablaamortiLogic.getDetalleTablaAmortis());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tablaamorti)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTablaAmorti = new TablaAmortiDetalleFormJInternalFrame(jDesktopPane,this.tablaamortiSessionBean.getConGuardarRelaciones(),this.tablaamortiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.setVisible(false);
		this.jInternalFrameDetalleFormTablaAmorti.setSelected(false);						
		
		this.jInternalFrameDetalleFormTablaAmorti.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTablaAmorti.tablaamortiLogic=this.tablaamortiLogic;
		
		this.cargarCombosFrameForeignKeyTablaAmorti("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTablaAmorti();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTablaAmorti();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTablaAmorti("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTablaAmorti();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTablaAmorti.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaAmorti"));
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarTablaAmorti"));

		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaAmorti"));
					
		this.jInternalFrameDetalleFormTablaAmorti.jMenuItemModificarTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.addActionListener (new ButtonActionListener(this,"ActualizarTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaAmorti"));
						
		this.jInternalFrameDetalleFormTablaAmorti.jMenuItemActualizarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaAmorti"));
								
		this.jInternalFrameDetalleFormTablaAmorti.jMenuItemEliminarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarTablaAmorti"));
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaAmorti"));
					
		this.jInternalFrameDetalleFormTablaAmorti.jMenuItemCancelarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaAmorti"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jMenuItemDetalleCerrarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaAmorti"));		
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmorti"));
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmorti"));
		
		
		
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaAmorti"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonidTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiBusqueda"));
		//jButtonid_facturaTablaAmorti.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmorti.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmorti"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_emisionTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_vencimientoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonvalor_prestamoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonnumero_cuotasTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaAmorti"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTablaAmorti"));
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTablaAmorti"));
		}
		
		this.jTableDatosTablaAmorti.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTablaAmorti"));
		
		this.jTableDatosTablaAmorti.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTablaAmorti"));
		
		this.jButtonNuevoTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoTablaAmorti"));
		
		this.jButtonDuplicarTablaAmorti.addActionListener(new ButtonActionListener(this,"DuplicarTablaAmorti"));
		
		this.jButtonCopiarTablaAmorti.addActionListener(new ButtonActionListener(this,"CopiarTablaAmorti"));
		
		this.jButtonVerFormTablaAmorti.addActionListener(new ButtonActionListener(this,"VerFormTablaAmorti"));
		
		
		this.jButtonNuevoToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoToolBarTablaAmorti"));
			
		this.jButtonDuplicarToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTablaAmorti"));
			
		this.jMenuItemNuevoTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTablaAmorti"));
			
		this.jMenuItemDuplicarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTablaAmorti"));		
		
		
		this.jButtonNuevoRelacionesTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTablaAmorti"));
		
		
		this.jButtonNuevoRelacionesToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTablaAmorti"));
			
		this.jMenuItemNuevoRelacionesTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTablaAmorti"));		
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonModificarToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"ModificarToolBarTablaAmorti"));
			
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemModificarTablaAmorti.addActionListener(new ButtonActionListener(this,"MenuItemModificarTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarTablaAmorti.addActionListener (new ButtonActionListener(this,"ActualizarTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonActualizarToolBarTablaAmorti.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTablaAmorti"));
				
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemActualizarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonEliminarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"EliminarToolBarTablaAmorti"));
						
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemEliminarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonCancelarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"CancelarToolBarTablaAmorti"));
			
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemCancelarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTablaAmorti"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTablaAmorti"));		
		
		
		this.jButtonCerrarTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarTablaAmorti"));
		
		
		this.jButtonCerrarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarToolBarTablaAmorti"));
			
		this.jMenuItemCerrarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTablaAmorti"));
			
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jMenuItemDetalleCerrarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTablaAmorti"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAmorti"));
		}
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTablaAmorti"));
		}
		
		this.jButtonCopiarToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"CopiarToolBarTablaAmorti"));
			
		this.jButtonVerFormToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"VerFormToolBarTablaAmorti"));
		
		this.jMenuItemGuardarCambiosTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTablaAmorti"));
			
		this.jMenuItemCopiarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTablaAmorti"));		
		
		this.jMenuItemVerFormTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTablaAmorti"));		
		
		
		this.jButtonGuardarCambiosTablaTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaAmorti"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTablaAmorti"));
			
		this.jMenuItemGuardarCambiosTablaTablaAmorti.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTablaAmorti"));		
		
		
		
		this.jButtonRecargarInformacionTablaAmorti.addActionListener (new ButtonActionListener(this,"RecargarInformacionTablaAmorti"));
					
		this.jButtonRecargarInformacionToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTablaAmorti"));
		
		this.jMenuItemRecargarInformacionTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTablaAmorti"));		
		
		
		
		this.jButtonAnterioresTablaAmorti.addActionListener (new ButtonActionListener(this,"AnterioresTablaAmorti"));
		
		
		this.jButtonAnterioresToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTablaAmorti"));
		
		this.jMenuItemAnterioresTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTablaAmorti"));		
		
		
		this.jButtonSiguientesTablaAmorti.addActionListener (new ButtonActionListener(this,"SiguientesTablaAmorti"));
		
		
		this.jButtonSiguientesToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTablaAmorti"));
			
		this.jMenuItemSiguientesTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTablaAmorti"));
			
		this.jMenuItemAbrirOrderByTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTablaAmorti"));
			
		this.jMenuItemMostrarOcultarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTablaAmorti"));
			
		this.jMenuItemDetalleAbrirOrderByTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTablaAmorti"));
			
		this.jMenuItemDetalleMostarOcultarTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTablaAmorti"));		
		
		
		this.jButtonNuevoGuardarCambiosTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTablaAmorti"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTablaAmorti"));
			
		this.jMenuItemNuevoGuardarCambiosTablaAmorti.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTablaAmorti"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTablaAmorti.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTablaAmorti"));

		this.jCheckBoxSeleccionadosTablaAmorti.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTablaAmorti"));
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTablaAmorti"));
		}
		
		
		this.jComboBoxTiposRelacionesTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposRelacionesTablaAmorti"));
			
		this.jComboBoxTiposAccionesTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposAccionesTablaAmorti"));
					
		this.jComboBoxTiposSeleccionarTablaAmorti.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTablaAmorti"));
			
		this.jTextFieldValorCampoGeneralTablaAmorti.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTablaAmorti"));		
		
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonidTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiBusqueda"));
		//jButtonid_facturaTablaAmorti.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmorti.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmorti"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_emisionTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_vencimientoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonvalor_prestamoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonnumero_cuotasTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdFacturaTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTablaAmorti"));

			this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmorti"));

			this.jButtonFK_IdTasaTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdTasaTablaAmorti"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTablaAmorti!=null) {
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmorti"));
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmorti"));
				this.jInternalFrameReporteDinamicoTablaAmorti.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmorti"));
			}
			
			//this.jButtonCerrarReporteDinamicoTablaAmorti.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTablaAmorti"));				
			//this.jButtonGenerarReporteDinamicoTablaAmorti.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTablaAmorti"));
			//this.jButtonGenerarExcelReporteDinamicoTablaAmorti.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTablaAmorti"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTablaAmorti!=null) {
				this.jInternalFrameImportacionTablaAmorti.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTablaAmorti"));
				this.jInternalFrameImportacionTablaAmorti.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTablaAmorti"));
				this.jInternalFrameImportacionTablaAmorti.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTablaAmorti"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTablaAmorti.addActionListener (new ButtonActionListener(this,"AbrirOrderByTablaAmorti"));
			
			this.jButtonAbrirOrderByToolBarTablaAmorti.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTablaAmorti"));			
			
			if(this.jInternalFrameOrderByTablaAmorti!=null) {
				this.jInternalFrameOrderByTablaAmorti.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTablaAmorti"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTablaAmorti.jTabbedPaneRelacionesTablaAmorti.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTablaAmorti"));
		
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
            		closingInternalFrameTablaAmorti();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTablaAmorti.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTablaAmorti = (JInternalFrameBase)event.getSource();
	            	
	            TablaAmortiBeanSwingJInternalFrame jInternalFrameParent=(TablaAmortiBeanSwingJInternalFrame)jInternalFrameDetalleFormTablaAmorti.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTablaAmortiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTablaAmorti.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTablaAmortiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTablaAmorti.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTablaAmorti.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTablaAmorti";
		inputMap = this.jButtonNuevoTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaAmortiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTablaAmortiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTablaAmorti";
		inputMap = this.jButtonNuevoRelacionesTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTablaAmortiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTablaAmorti";
		inputMap = this.jButtonModificarTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTablaAmorti";
		inputMap = this.jButtonActualizarTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTablaAmorti";
		inputMap = this.jButtonEliminarTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTablaAmorti";
		inputMap = this.jButtonCancelarTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTablaAmorti";
		inputMap = this.jButtonCerrarTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTablaAmorti";
		inputMap = this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTablaAmorti.jButtonGuardarCambiosTablaAmorti.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTablaAmortiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTablaAmorti.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTablaAmortiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTablaAmorti.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTablaAmortiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonidTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"idTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_empresaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_sucursalTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_ejercicioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_periodoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_tasaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_tasaTablaAmortiBusqueda"));
		//jButtonid_facturaTablaAmorti.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaTablaAmortiActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmorti.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmorti"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_emisionTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonfecha_vencimientoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonvalor_prestamoTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"valor_prestamoTablaAmortiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonnumero_cuotasTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuotasTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_anioTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioTablaAmortiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiUpdate.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTablaAmorti.jButtonid_mesTablaAmortiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesTablaAmortiBusqueda"));
		
		
		this.jButtonFK_IdFacturaTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdFacturaTablaAmorti"));

		this.jButtonBuscarFK_IdFacturaid_facturaTablaAmorti.addActionListener(new ButtonActionListener(this,"id_facturaTablaAmorti"));

		this.jButtonFK_IdTasaTablaAmorti.addActionListener(new ButtonActionListener(this,"FK_IdTasaTablaAmorti"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTablaAmorti.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTablaAmortiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTablaAmortiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTablaAmorti.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTablaAmorti(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
					tablaamortiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmorti tablaamortiAux:tablaamortis) {
					tablaamortiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTablaAmortiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
						tablaamortiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmorti tablaamortiAux:tablaamortis) {
						tablaamortiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmorti tablaamortiAux:tablaamortis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTablaAmorti(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaAmorti.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaAmorti.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTablaAmortiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTablaAmorti.getSelectedRows();
			
			TablaAmorti tablaamortiLocal=new TablaAmorti();
			
			//this.seleccionarTodosTablaAmorti(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tablaamortiLocal =(TablaAmorti) this.tablaamortiLogic.getTablaAmortis().toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tablaamortiLocal =(TablaAmorti) this.tablaamortis.toArray()[this.jTableDatosTablaAmorti.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tablaamortiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
						tablaamortiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TablaAmorti tablaamortiAux:tablaamortis) {
						tablaamortiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTablaAmorti(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTablaAmorti.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTablaAmorti.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTablaAmorti,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTablaAmortiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTablaAmortiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTablaAmortiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTablaAmorti.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TablaAmorti tablaamortiAux:this.tablaamortiLogic.getTablaAmortis()) {
				
						if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							tablaamortiAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							tablaamortiAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							tablaamortiAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							tablaamortiAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmorti tablaamortiAux:tablaamortis) {
					
						if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							tablaamortiAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							tablaamortiAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO)) {
							existe=true;
							tablaamortiAux.setvalor_prestamo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS)) {
							existe=true;
							tablaamortiAux.setnumero_cuotas(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTablaAmorti(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTablaAmortiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTablaAmorti=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTablaAmorti.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTablaAmorti) {				
					conSplash=true;//false;										
					
					//this.startProcessTablaAmorti(conSplash);
				
					this.generarReporteTablaAmortisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTablaAmortisSeleccionados();
				//this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaAmortisSeleccionados(false);
				//this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTablaAmortisSeleccionados(true);
				//this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaAmorti();
				
				this.exportarTablaAmortisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTablaAmortis();
				//this.importarTablaAmortis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTablaAmorti();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTablaAmortisSeleccionados();
				//this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTablaAmorti();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTablaAmorti)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTablaAmorti(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
				}	
			} 			
			else if(TablaAmortiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTablaAmorti) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTablaAmorti(conSplash);
					
						//this.actualizarParametrosGeneralTablaAmorti();
						
						this.generarReporteProcesoAccionTablaAmortisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TablaAmortiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tabla AmortiS SELECCIONADOS?", "MANTENIMIENTO DE Tabla Amorti", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTablaAmorti();
				
						this.actualizarParametrosGeneralTablaAmorti();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tablaamortiReturnGeneral=tablaamortiLogic.procesarAccionTablaAmortisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tablaamortiLogic.getTablaAmortis(),this.tablaamortiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTablaAmortiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTablaAmorti();
					
					TablaAmortiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTablaAmortiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTablaAmorti.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTablaAmorti.jComboBoxTiposAccionesFormularioTablaAmorti.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTablaAmorti(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTablaAmortiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTablaAmorti();
			
			if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
			TablaAmorti tablaamorti=new TablaAmorti();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTablaAmorti(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTablaAmorti.getSelectedItem();
			
			
			
			
			tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
			//this.sTipoAccion;
			
			if(tablaamortisSeleccionados.size()==1) {
				for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
					tablaamorti=tablaamortiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Tabla Amorti")) {
					jButtonDetalleTablaAmortiActionPerformed(null,rowIndex,true,false,tablaamorti);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTablaAmorti();
			
      		//this.finishProcessTablaAmorti(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTablaAmortiReturnGeneral() throws Exception {
		if(this.tablaamortiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tablaamortiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tablaamortiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tablaamortiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tablaamortiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tablaamortiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTablaAmorti(false);
		}
		
		if(this.tablaamortiReturnGeneral.getConRetornoLista() || this.tablaamortiReturnGeneral.getConRetornoObjeto()) {
			if(this.tablaamortiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaamortiLogic.setTablaAmortis(this.tablaamortiReturnGeneral.getTablaAmortis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tablaamortiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tablaamortiLogic.setTablaAmorti(this.tablaamortiReturnGeneral.getTablaAmorti());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTablaAmorti(false);
		}
	}
	
	public void actualizarParametrosGeneralTablaAmorti() throws Exception {
		
		
	}
	
	public ArrayList<TablaAmorti> getTablaAmortisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTablaAmorti) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TablaAmorti tablaamortiAux:tablaamortiLogic.getTablaAmortis()) {
					if(tablaamortiAux.getIsSelected()) {
						tablaamortisSeleccionados.add(tablaamortiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TablaAmorti tablaamortiAux:this.tablaamortis) {
					if(tablaamortiAux.getIsSelected()) {
						tablaamortisSeleccionados.add(tablaamortiAux);				
					}
				}
			}
			
			if(tablaamortisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tablaamortisSeleccionados.addAll(this.tablaamortiLogic.getTablaAmortis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tablaamortisSeleccionados.addAll(this.tablaamortis);				
					}
				}
			}
		} else {
			tablaamortisSeleccionados.add(this.tablaamorti);
		}
		
		return tablaamortisSeleccionados;
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
	
	public void generarReporteTablaAmortisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTablaAmortisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTablaAmortisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaAmortisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTablaAmortisSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTablaAmortisSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tabla Amorti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados);
		
	}	
	
	public void generarReporteNormalTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTablaAmortisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTablaAmorti();
		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTablaAmorti();
		
		
		//this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados ,tablaamortiImplementable,tablaamortiImplementableHome);
	}
	
	public void mostrarImportacionTablaAmortis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTablaAmorti();
		
		this.abrirFrameImportacionTablaAmorti();		
		
			
		//this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados ,tablaamortiImplementable,tablaamortiImplementableHome);
	}
	
	public void importarTablaAmortis() throws Exception {		
	
	}
	
	public void exportarTablaAmortisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTablaAmortisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTablaAmortisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTablaAmortisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tabla Amorti",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTablaAmorti(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTablaAmorti(tablaamortiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tablaamortiAux.setsDetalleGeneralEntityReporte(tablaamortiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTablaAmorti(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDTASA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TablaAmortiConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTablaAmorti(TablaAmorti tablaamorti,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tablaamorti.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.gettasa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getvalor_prestamo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getnumero_cuotas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tablaamorti.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TablaAmortis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTablaAmorti(row);				
				iRow++;
			}				
			
			for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTablaAmorti(tablaamortiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTablaAmortisSeleccionados() throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();		
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tablaamorti.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tablaamortis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tablaamorti");
			//elementRoot.appendChild(element);
		
			for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
				element = document.createElement("tablaamorti");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTablaAmorti(tablaamortiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tabla Amorti",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTablaAmorti(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDTASA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_VALORPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TablaAmortiConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTablaAmorti(TablaAmorti tablaamorti,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.gettasa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getvalor_prestamo());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getnumero_cuotas());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tablaamorti.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlTablaAmorti(TablaAmorti tablaamorti,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TablaAmortiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tablaamorti.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TablaAmortiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tablaamorti.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tablaamorti.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(tablaamorti.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(tablaamorti.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(tablaamorti.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementtasa_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDTASA);
		elementtasa_descripcion.appendChild(document.createTextNode(tablaamorti.gettasa_descripcion()));
		element.appendChild(elementtasa_descripcion);

		Element elementfactura_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(tablaamorti.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementfecha_emision = document.createElement(TablaAmortiConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(tablaamorti.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(TablaAmortiConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(tablaamorti.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementvalor_prestamo = document.createElement(TablaAmortiConstantesFunciones.VALORPRESTAMO);
		elementvalor_prestamo.appendChild(document.createTextNode(tablaamorti.getvalor_prestamo().toString().trim()));
		element.appendChild(elementvalor_prestamo);

		Element elementnumero_cuotas = document.createElement(TablaAmortiConstantesFunciones.NUMEROCUOTAS);
		elementnumero_cuotas.appendChild(document.createTextNode(tablaamorti.getnumero_cuotas().toString().trim()));
		element.appendChild(elementnumero_cuotas);

		Element elementanio_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(tablaamorti.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(TablaAmortiConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(tablaamorti.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoTablaAmortisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TablaAmorti> tablaamortisSeleccionados=new ArrayList<TablaAmorti>();
		
		tablaamortisSeleccionados=this.getTablaAmortisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTablaAmorti(tablaamortisSeleccionados);
		
		this.generarReporteTablaAmortis("Todos",tablaamortisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTablaAmorti(ArrayList<TablaAmorti> tablaamortisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TablaAmorti tablaamortiAux:tablaamortisSeleccionados) {
				tablaamortiAux.setsDetalleGeneralEntityReporte(tablaamortiAux.toString());
			
				if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDTASA)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.gettasa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortiAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tablaamortiAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_NUMEROCUOTAS)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getnumero_cuotas().toString());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TablaAmortiConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					tablaamortiAux.setsDescripcionGeneralEntityReporte1(tablaamortiAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TablaAmortiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTablaAmorti(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTablaAmorti=true;
				this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=true;
				this.isVisibilidadCeldaGuardarCambiosTablaAmorti=true;
			}
			
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=true;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=true;
			this.isVisibilidadCeldaEliminarTablaAmorti=true;
			this.isVisibilidadCeldaCancelarTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=true;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=true;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=true;
			this.isVisibilidadCeldaModificarTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=true;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
			this.isVisibilidadCeldaModificarTablaAmorti=true;
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
			this.isVisibilidadCeldaCancelarTablaAmorti=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				} else {
					this.isVisibilidadCeldaGuardarTablaAmorti=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TablaAmortiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTablaAmorti=true;
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=true;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=true;
		} else {
			this.actualizarEstadoPanelsTablaAmorti(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTablaAmorti=false;
			//this.isVisibilidadCeldaVerFormTablaAmorti=false;
			this.isVisibilidadCeldaDuplicarTablaAmorti=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tablaamortiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
		} else {
			this.isVisibilidadCeldaNuevoTablaAmorti=false;
			this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(!tablaamortiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;												
			}
			
			this.jButtonCerrarTablaAmorti.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTablaAmorti=false;
		}
		
		if(!this.permiteMantenimiento(this.tablaamorti)) {
			this.isVisibilidadCeldaActualizarTablaAmorti=false;
			this.isVisibilidadCeldaEliminarTablaAmorti=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTablaAmorti() {
		this.isVisibilidadCeldaNuevoTablaAmorti=false;
		this.isVisibilidadCeldaGuardarCambiosTablaAmorti=false;
	}
	
	public void actualizarEstadoPanelsTablaAmorti(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTablaAmorti!=null) {
				this.jScrollPanelDatosEdicionTablaAmorti.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTablaAmorti!=null) {
				this.jScrollPanelDatosTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelPaginacionTablaAmorti!=null) {
				this.jPanelPaginacionTablaAmorti.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
					this.jTabbedPaneBusquedasTablaAmorti.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tablaamortiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTablaAmorti!=null) {
				this.jTabbedPaneBusquedasTablaAmorti.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTablaAmorti!=null) {
				this.jPanelParametrosReportesTablaAmorti.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdFactura=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdFactura=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaTasa(Boolean isParaTasa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTasaNegation=!isParaTasa;

			this.isVisibilidadFK_IdFactura=isParaTasaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaTasa;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdFactura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdFactura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdFacturaTablaAmorti);}

			this.isVisibilidadFK_IdTasa=isParaMesNegation;
			if(!this.isVisibilidadFK_IdTasa) {this.jTabbedPaneBusquedasTablaAmorti.remove(jPanelFK_IdTasaTablaAmorti);}
		}
		
	}
	
	

	public String registrarSesionTablaAmortiParaDetalleTablaAmortis() throws Exception {
		Boolean isPaginaPopupDetalleTablaAmorti=false;

		try {

			if(this.tablaamortiSessionBean==null) {
				this.tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean==null) {
				this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean=new DetalleTablaAmortiSessionBean();
			}

			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setsPathNavegacionActual(tablaamortiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleTablaAmortiConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleTablaAmorti=this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleTablaAmorti(true);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTablaAmorti(TablaAmortiConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setisBusquedaDesdeForeignKeySesionTablaAmorti(true);
			this.jInternalFrameDetalleFormTablaAmorti.detalletablaamortiSessionBean.setlidTablaAmortiActual(this.idTablaAmortiActual);

			tablaamortiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTablaAmorti(true);
			tablaamortiSessionBean.setlIdTablaAmortiActualForeignKey(this.idTablaAmortiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionTablaAmortiParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(tablaamortiSessionBean==null) {
				tablaamortiSessionBean=new TablaAmortiSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(tablaamortiSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.tablaamortiFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(TablaAmortiConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionTablaAmorti(true);
			//facturaSessionBean.setlidTablaAmortiActual(this.idTablaAmortiActual);

			tablaamortiSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTablaAmorti(true);
			tablaamortiSessionBean.setlIdTablaAmortiActualForeignKey(this.idTablaAmortiActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TablaAmortiSessionBean tablaamortiSessionBean=new TablaAmortiSessionBean();
		
		if(this.tablaamortiSessionBean==null) {
			this.tablaamortiSessionBean=new TablaAmortiSessionBean();
		}
		
		this.tablaamortiSessionBean.setsUltimaBusquedaTablaAmorti(this.getsAccionBusqueda());
		this.tablaamortiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tablaamortiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			tablaamortiSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tablaamortiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			tablaamortiSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			tablaamortiSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			tablaamortiSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTasa")) {
			tablaamortiSessionBean.setid_tasa(this.getid_tasaFK_IdTasa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TablaAmortiSessionBean tablaamortiSessionBean=new TablaAmortiSessionBean();
		
		if(this.tablaamortiSessionBean==null) {
			this.tablaamortiSessionBean=new TablaAmortiSessionBean();
		}
		
		if(this.tablaamortiSessionBean.getsUltimaBusquedaTablaAmorti()!=null&&!this.tablaamortiSessionBean.getsUltimaBusquedaTablaAmorti().equals("")) {
			this.setsAccionBusqueda(tablaamortiSessionBean.getsUltimaBusquedaTablaAmorti());
			this.setiNumeroPaginacion(tablaamortiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tablaamortiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(tablaamortiSessionBean.getid_ejercicio());
				tablaamortiSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tablaamortiSessionBean.getid_empresa());
				tablaamortiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(tablaamortiSessionBean.getid_factura());
				tablaamortiSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(tablaamortiSessionBean.getid_periodo());
				tablaamortiSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(tablaamortiSessionBean.getid_sucursal());
				tablaamortiSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTasa")) {
				this.setid_tasaFK_IdTasa(tablaamortiSessionBean.getid_tasa());
				tablaamortiSessionBean.setid_tasa(-1L);
			}
		}
		
		this.tablaamortiSessionBean.setsUltimaBusquedaTablaAmorti("");
		this.tablaamortiSessionBean.setiNumeroPaginacion(TablaAmortiConstantesFunciones.INUMEROPAGINACION);
		this.tablaamortiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTablaAmorti(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTablaAmorti() {
		this.updateBorderResaltarBusquedasFormularioTablaAmorti();
		this.updateVisibilidadBusquedasFormularioTablaAmorti();
		this.updateHabilitarBusquedasFormularioTablaAmorti();
	}
	
	public void updateBorderResaltarBusquedasFormularioTablaAmorti() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTablaAmorti.getComponents().length>0) {
	

		if(this.tablaamortiConstantesFunciones.resaltarFK_IdFacturaTablaAmorti!=null) {
			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdFacturaTablaAmorti);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
				jPanel.setBorder(this.tablaamortiConstantesFunciones.resaltarFK_IdFacturaTablaAmorti);
			}
		}

		if(this.tablaamortiConstantesFunciones.resaltarFK_IdTasaTablaAmorti!=null) {
			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdTasaTablaAmorti);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
				jPanel.setBorder(this.tablaamortiConstantesFunciones.resaltarFK_IdTasaTablaAmorti);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTablaAmorti() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTablaAmorti.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdFacturaTablaAmorti);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaamortiConstantesFunciones.mostrarFK_IdFacturaTablaAmorti);
			if(!this.tablaamortiConstantesFunciones.mostrarFK_IdFacturaTablaAmorti && index>-1) {
				this.jTabbedPaneBusquedasTablaAmorti.remove(index);
			}

			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdTasaTablaAmorti);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tablaamortiConstantesFunciones.mostrarFK_IdTasaTablaAmorti);
			if(!this.tablaamortiConstantesFunciones.mostrarFK_IdTasaTablaAmorti && index>-1) {
				this.jTabbedPaneBusquedasTablaAmorti.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTablaAmorti() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTablaAmorti.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdFacturaTablaAmorti);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaamortiConstantesFunciones.activarFK_IdFacturaTablaAmorti);
				this.jTabbedPaneBusquedasTablaAmorti.setEnabledAt(index,this.tablaamortiConstantesFunciones.activarFK_IdFacturaTablaAmorti);
			}

			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdTasaTablaAmorti);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tablaamortiConstantesFunciones.activarFK_IdTasaTablaAmorti);
				this.jTabbedPaneBusquedasTablaAmorti.setEnabledAt(index,this.tablaamortiConstantesFunciones.activarFK_IdTasaTablaAmorti);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTablaAmorti(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdFacturaTablaAmorti);

			this.jTabbedPaneBusquedasTablaAmorti.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);

			this.tablaamortiConstantesFunciones.setResaltarFK_IdFacturaTablaAmorti(resaltar);

			jPanel.setBorder(this.tablaamortiConstantesFunciones.resaltarFK_IdFacturaTablaAmorti);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTasa")) {
			index= this.jTabbedPaneBusquedasTablaAmorti.indexOfComponent(this.jPanelFK_IdTasaTablaAmorti);

			this.jTabbedPaneBusquedasTablaAmorti.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTablaAmorti.getComponent(index);

			this.tablaamortiConstantesFunciones.setResaltarFK_IdTasaTablaAmorti(resaltar);

			jPanel.setBorder(this.tablaamortiConstantesFunciones.resaltarFK_IdTasaTablaAmorti);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTablaAmorti.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTablaAmorti() throws Exception {

		if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTablaAmorti();
		this.updateVisibilidadResaltarControlesFormularioTablaAmorti();
		this.updateHabilitarResaltarControlesFormularioTablaAmorti();
		
	}
	
	public void updateBorderResaltarControlesFormularioTablaAmorti() throws Exception {
		if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tablaamortiConstantesFunciones.resaltaridTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltaridTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_empresaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_empresaTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_sucursalTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_sucursalTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_ejercicioTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_ejercicioTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_periodoTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_periodoTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_tasaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_tasaTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_facturaTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_facturaTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarfecha_emisionTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarfecha_emisionTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarfecha_vencimientoTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarfecha_vencimientoTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarvalor_prestamoTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarvalor_prestamoTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarnumero_cuotasTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarnumero_cuotasTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_anioTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_anioTablaAmorti);}
		if(this.tablaamortiConstantesFunciones.resaltarid_mesTablaAmorti!=null && this.jInternalFrameDetalleFormTablaAmorti!=null) {this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setBorder(this.tablaamortiConstantesFunciones.resaltarid_mesTablaAmorti);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTablaAmorti() throws Exception {		
		if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
	
		//this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostraridTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelidTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostraridTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_empresaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_empresaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_empresaTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_sucursalTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_sucursalTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_sucursalTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_ejercicioTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_ejercicioTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_ejercicioTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_periodoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_periodoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_periodoTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_tasaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_tasaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_tasaTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_facturaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_facturaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_facturaTablaAmorti);
			this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_facturaTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarfecha_emisionTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelfecha_emisionTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarfecha_emisionTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarfecha_vencimientoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelfecha_vencimientoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarfecha_vencimientoTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarvalor_prestamoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelvalor_prestamoTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarvalor_prestamoTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarnumero_cuotasTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelnumero_cuotasTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarnumero_cuotasTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_anioTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_anioTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_anioTablaAmorti);
		//this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_mesTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jPanelid_mesTablaAmorti.setVisible(this.tablaamortiConstantesFunciones.mostrarid_mesTablaAmorti);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTablaAmorti() throws Exception {
		if(this.jInternalFrameDetalleFormTablaAmorti==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTablaAmorti!=null) {
	
		this.jInternalFrameDetalleFormTablaAmorti.jLabelidTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activaridTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_empresaTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_empresaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_sucursalTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_sucursalTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_ejercicioTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_ejercicioTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_periodoTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_periodoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_tasaTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_tasaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_facturaTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_facturaTablaAmorti);
			this.jInternalFrameDetalleFormTablaAmorti.jButtonid_facturaTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_facturaTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_emisionTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarfecha_emisionTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jDateChooserfecha_vencimientoTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarfecha_vencimientoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jTextFieldvalor_prestamoTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarvalor_prestamoTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jTextFieldnumero_cuotasTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarnumero_cuotasTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_anioTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_anioTablaAmorti);
		this.jInternalFrameDetalleFormTablaAmorti.jComboBoxid_mesTablaAmorti.setEnabled(this.tablaamortiConstantesFunciones.activarid_mesTablaAmorti);
		}
	}
	
		
}