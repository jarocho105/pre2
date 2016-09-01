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

//import com.bydan.erp.contabilidad.util.ComprobantesAnuladosConstantesFunciones;
import com.bydan.erp.contabilidad.util.report.ComprobantesAnuladosParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.report.ComprobantesAnuladosParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.report.ComprobantesAnuladosBean;
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
public class ComprobantesAnuladosBeanSwingJInternalFrame extends ComprobantesAnuladosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComprobantesAnuladosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComprobantesAnulados> comprobantesanuladosValidator = new ClassValidator<ComprobantesAnulados>(ComprobantesAnulados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComprobantesAnulados comprobantesanulados;	
	public ComprobantesAnulados comprobantesanuladosAux;
	public ComprobantesAnulados comprobantesanuladosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComprobantesAnulados comprobantesanuladosTotales;
	public Long idComprobantesAnuladosActual;
	public Long iIdNuevoComprobantesAnulados=0L;
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

	public String sFinalQueryComboTipoDocumento="";

	public List<TipoDocumento> tipodocumentosForeignKey;

	public List<TipoDocumento> gettipodocumentosForeignKey() {
		return tipodocumentosForeignKey;
	}

	public void settipodocumentosForeignKey(List<TipoDocumento> tipodocumentosForeignKey) {
		this.tipodocumentosForeignKey = tipodocumentosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumento tipodocumentoForeignKey;

	public TipoDocumento gettipodocumentoForeignKey() {
		return tipodocumentoForeignKey;
	}

	public void settipodocumentoForeignKey(TipoDocumento tipodocumentoForeignKey) {
		this.tipodocumentoForeignKey = tipodocumentoForeignKey;
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
	
	public Boolean isPermisoTodoComprobantesAnulados;
	public Boolean isPermisoNuevoComprobantesAnulados;
	public Boolean isPermisoActualizarComprobantesAnulados;
	public Boolean isPermisoActualizarOriginalComprobantesAnulados;
	public Boolean isPermisoEliminarComprobantesAnulados;
	public Boolean isPermisoGuardarCambiosComprobantesAnulados;
	public Boolean isPermisoConsultaComprobantesAnulados;
	public Boolean isPermisoBusquedaComprobantesAnulados;
	public Boolean isPermisoReporteComprobantesAnulados;
	public Boolean isPermisoPaginacionMedioComprobantesAnulados;
	public Boolean isPermisoPaginacionAltoComprobantesAnulados;
	public Boolean isPermisoPaginacionTodoComprobantesAnulados;
	public Boolean isPermisoCopiarComprobantesAnulados;
	public Boolean isPermisoVerFormComprobantesAnulados;
	public Boolean isPermisoDuplicarComprobantesAnulados;
	public Boolean isPermisoOrdenComprobantesAnulados;
	
	
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
	
	public ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosReturnGeneral;
	public ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComprobantesAnulados=false;
	public Boolean esParaAccionDesdeFormularioComprobantesAnulados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComprobantesAnuladosSessionBeanAdditional comprobantesanuladosSessionBeanAdditional=null;
	
	public ComprobantesAnuladosSessionBeanAdditional getComprobantesAnuladosSessionBeanAdditional() {
		return this.comprobantesanuladosSessionBeanAdditional;
	}
	
	public void setComprobantesAnuladosSessionBeanAdditional(ComprobantesAnuladosSessionBeanAdditional comprobantesanuladosSessionBeanAdditional) {
		try {
			this.comprobantesanuladosSessionBeanAdditional=comprobantesanuladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComprobantesAnuladosBeanSwingJInternalFrameAdditional comprobantesanuladosBeanSwingJInternalFrameAdditional=null;
	//public class ComprobantesAnuladosBeanSwingJInternalFrame
	
	public ComprobantesAnuladosBeanSwingJInternalFrameAdditional getComprobantesAnuladosBeanSwingJInternalFrameAdditional() {
		return this.comprobantesanuladosBeanSwingJInternalFrameAdditional;
	}
	
	public void setComprobantesAnuladosBeanSwingJInternalFrameAdditional(ComprobantesAnuladosBeanSwingJInternalFrameAdditional comprobantesanuladosBeanSwingJInternalFrameAdditional) {
		try {
			this.comprobantesanuladosBeanSwingJInternalFrameAdditional=comprobantesanuladosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComprobantesAnuladosLogic comprobantesanuladosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComprobantesAnulados comprobantesanuladosBean;
	public ComprobantesAnuladosConstantesFunciones comprobantesanuladosConstantesFunciones;
	//public ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoDocumentoLogic tipodocumentoLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<ComprobantesAnulados> comprobantesanuladoss;	
	//public List<ComprobantesAnulados> comprobantesanuladossEliminados;
	//public List<ComprobantesAnulados> comprobantesanuladossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaDuplicarComprobantesAnulados=true;
	public Boolean isVisibilidadCeldaCopiarComprobantesAnulados=true;
	public Boolean isVisibilidadCeldaVerFormComprobantesAnulados=true;
	public Boolean isVisibilidadCeldaOrdenComprobantesAnulados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaModificarComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaActualizarComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaEliminarComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaCancelarComprobantesAnulados=false;
	public Boolean isVisibilidadCeldaGuardarComprobantesAnulados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;	
	
	
	public Boolean isVisibilidadBusquedaComprobantesAnulados=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoDocumento=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoComprobantesAnulados() {
		return this.iIdNuevoComprobantesAnulados;
	}

	public void setiIdNuevoComprobantesAnulados(Long iIdNuevoComprobantesAnulados) {
		this.iIdNuevoComprobantesAnulados = iIdNuevoComprobantesAnulados;
	}
	
	public Long getidComprobantesAnuladosActual() {
		return this.idComprobantesAnuladosActual;
	}

	public void setidComprobantesAnuladosActual(Long idComprobantesAnuladosActual) {
		this.idComprobantesAnuladosActual = idComprobantesAnuladosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComprobantesAnulados getcomprobantesanulados() {
		return this.comprobantesanulados;
	}

	public void setcomprobantesanulados(ComprobantesAnulados comprobantesanulados) {
		this.comprobantesanulados = comprobantesanulados;
	}
	
	public ComprobantesAnulados getcomprobantesanuladosAux() {
		return this.comprobantesanuladosAux;
	}

	public void setcomprobantesanuladosAux(ComprobantesAnulados comprobantesanuladosAux) {
		this.comprobantesanuladosAux = comprobantesanuladosAux;
	}				
	
	public ComprobantesAnulados getcomprobantesanuladosAnterior() {
		return this.comprobantesanuladosAnterior;
	}

	public void setcomprobantesanuladosAnterior(ComprobantesAnulados comprobantesanuladosAnterior) {
		this.comprobantesanuladosAnterior = comprobantesanuladosAnterior;
	}	
	
	public ComprobantesAnulados getcomprobantesanuladosTotales() {
		return this.comprobantesanuladosTotales;
	}

	public void setcomprobantesanuladosTotales(ComprobantesAnulados comprobantesanuladosTotales) {
		this.comprobantesanuladosTotales = comprobantesanuladosTotales;
	}	
	
	public ComprobantesAnulados getcomprobantesanuladosBean() {
		return this.comprobantesanuladosBean;
	}

	public void setcomprobantesanuladosBean(ComprobantesAnulados comprobantesanuladosBean) {
		this.comprobantesanuladosBean = comprobantesanuladosBean;
	}	
	
	public ComprobantesAnuladosParameterReturnGeneral getcomprobantesanuladosReturnGeneral() {
		return this.comprobantesanuladosReturnGeneral;
	}

	public void setcomprobantesanuladosReturnGeneral(ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosReturnGeneral) {
		this.comprobantesanuladosReturnGeneral = comprobantesanuladosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaComprobantesAnulados=-1L;

	public Long getid_ejercicioBusquedaComprobantesAnulados() {
		return this.id_ejercicioBusquedaComprobantesAnulados;
	}

	public void setid_ejercicioBusquedaComprobantesAnulados(Long id_ejercicioBusquedaComprobantesAnulados) {
		this.id_ejercicioBusquedaComprobantesAnulados = id_ejercicioBusquedaComprobantesAnulados;
	}

;
	public Long id_tipo_documentoBusquedaComprobantesAnulados=-1L;

	public Long getid_tipo_documentoBusquedaComprobantesAnulados() {
		return this.id_tipo_documentoBusquedaComprobantesAnulados;
	}

	public void setid_tipo_documentoBusquedaComprobantesAnulados(Long id_tipo_documentoBusquedaComprobantesAnulados) {
		this.id_tipo_documentoBusquedaComprobantesAnulados = id_tipo_documentoBusquedaComprobantesAnulados;
	}

;
	public Long id_tipo_movimientoBusquedaComprobantesAnulados=-1L;

	public Long getid_tipo_movimientoBusquedaComprobantesAnulados() {
		return this.id_tipo_movimientoBusquedaComprobantesAnulados;
	}

	public void setid_tipo_movimientoBusquedaComprobantesAnulados(Long id_tipo_movimientoBusquedaComprobantesAnulados) {
		this.id_tipo_movimientoBusquedaComprobantesAnulados = id_tipo_movimientoBusquedaComprobantesAnulados;
	}

;
	public String numero_mayorBusquedaComprobantesAnulados="";

	public String getnumero_mayorBusquedaComprobantesAnulados() {
		return this.numero_mayorBusquedaComprobantesAnulados;
	}

	public void setnumero_mayorBusquedaComprobantesAnulados(String numero_mayorBusquedaComprobantesAnulados) {
		this.numero_mayorBusquedaComprobantesAnulados = numero_mayorBusquedaComprobantesAnulados;
	}

;
	public Date fecha_emision_desdeBusquedaComprobantesAnulados=new Date();

	public Date getfecha_emision_desdeBusquedaComprobantesAnulados() {
		return this.fecha_emision_desdeBusquedaComprobantesAnulados;
	}

	public void setfecha_emision_desdeBusquedaComprobantesAnulados(Date fecha_emision_desdeBusquedaComprobantesAnulados) {
		this.fecha_emision_desdeBusquedaComprobantesAnulados = fecha_emision_desdeBusquedaComprobantesAnulados;
	}

;
	public Date fecha_emision_hastaBusquedaComprobantesAnulados=new Date();

	public Date getfecha_emision_hastaBusquedaComprobantesAnulados() {
		return this.fecha_emision_hastaBusquedaComprobantesAnulados;
	}

	public void setfecha_emision_hastaBusquedaComprobantesAnulados(Date fecha_emision_hastaBusquedaComprobantesAnulados) {
		this.fecha_emision_hastaBusquedaComprobantesAnulados = fecha_emision_hastaBusquedaComprobantesAnulados;
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

	public Long id_tipo_documentoFK_IdTipoDocumento=-1L;

	public Long getid_tipo_documentoFK_IdTipoDocumento() {
		return this.id_tipo_documentoFK_IdTipoDocumento;
	}

	public void setid_tipo_documentoFK_IdTipoDocumento(Long id_tipo_documentoFK_IdTipoDocumento) {
		this.id_tipo_documentoFK_IdTipoDocumento = id_tipo_documentoFK_IdTipoDocumento;
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
	
	
	public ComprobantesAnuladosLogic getComprobantesAnuladosLogic()	{		
		return comprobantesanuladosLogic;
	}

	public void setComprobantesAnuladosLogic(ComprobantesAnuladosLogic comprobantesanuladosLogic) {
		this.comprobantesanuladosLogic = comprobantesanuladosLogic;
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
	
	public Boolean getIsEsNuevoComprobantesAnulados() {
		return isEsNuevoComprobantesAnulados;
	}

	public void setIsEsNuevoComprobantesAnulados(Boolean isEsNuevoComprobantesAnulados) {
		this.isEsNuevoComprobantesAnulados = isEsNuevoComprobantesAnulados;
	}

	public Boolean getEsParaAccionDesdeFormularioComprobantesAnulados() {
		return esParaAccionDesdeFormularioComprobantesAnulados;
	}
	
	public void setEsParaAccionDesdeFormularioComprobantesAnulados(Boolean esParaAccionDesdeFormularioComprobantesAnulados) {
		this.esParaAccionDesdeFormularioComprobantesAnulados = esParaAccionDesdeFormularioComprobantesAnulados;
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

			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comprobantesanuladosSessionBean.getlidEmpresaActual());
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

			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(comprobantesanuladosSessionBean.getlidSucursalActual());
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

			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(comprobantesanuladosSessionBean.getlidEjercicioActual());
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

	public void cargarCombosTipoDocumentosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoLogic tipodocumentoLogic=new TipoDocumentoLogic();

			//tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodocumentoLogic.getTipoDocumentoDataAccess().setIsForForeingKeyData(true);

					tipodocumentoLogic.getTodosTipoDocumentosWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentosForeignKey=tipodocumentoLogic.getTipoDocumentos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumento(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentoLogic.getEntityWithConnection(comprobantesanuladosSessionBean.getlidTipoDocumentoActual());
					this.tipodocumentosForeignKey.add(tipodocumentoLogic.getTipoDocumento());
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

			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(comprobantesanuladosSessionBean.getlidTipoMovimientoActual());
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

					if(this.comprobantesanulados!=null) {
						this.comprobantesanulados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComprobantesAnulados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComprobantesAnuladosGenerico)throws Exception
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
				jComboBoxid_empresaComprobantesAnuladosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComprobantesAnuladosGenerico!=null && jComboBoxid_empresaComprobantesAnuladosGenerico.getItemCount()>0) {
					jComboBoxid_empresaComprobantesAnuladosGenerico.setSelectedIndex(0);
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

					if(this.comprobantesanulados!=null) {
						this.comprobantesanulados.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalComprobantesAnulados.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalComprobantesAnuladosGenerico)throws Exception
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
				jComboBoxid_sucursalComprobantesAnuladosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalComprobantesAnuladosGenerico!=null && jComboBoxid_sucursalComprobantesAnuladosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalComprobantesAnuladosGenerico.setSelectedIndex(0);
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

					if(this.comprobantesanulados!=null) {
						this.comprobantesanulados.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioComprobantesAnulados.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
						jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
							//jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioComprobantesAnuladosGenerico)throws Exception
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
				jComboBoxid_ejercicioComprobantesAnuladosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioComprobantesAnuladosGenerico!=null && jComboBoxid_ejercicioComprobantesAnuladosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioComprobantesAnuladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoForeignKey(Long idTipoDocumentoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentoTemp!=null) {

					if(this.comprobantesanulados!=null) {
						this.comprobantesanulados.setTipoDocumento(tipodocumentoTemp);
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedItem(tipodocumentoTemp);
					}
				} else {
					//jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedItem(tipodocumentoTemp);
					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentoTemp!=null && jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
						jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipodocumentoTemp);
					} else {
						if(jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
							//jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipodocumentoTemp);
							if(jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.getItemCount()>0) {
								jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(0);
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

	public String getActualTipoDocumentoForeignKeyDescripcion(Long idTipoDocumentoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoForeignKeyGenerico(Long idTipoDocumentoSeleccionado,JComboBox jComboBoxid_tipo_documentoComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoTemp=null;

			for(TipoDocumento tipodocumentoAux:tipodocumentosForeignKey) {
				if(tipodocumentoAux.getId()!=null && tipodocumentoAux.getId().equals(idTipoDocumentoSeleccionado)) {
					tipodocumentoTemp=tipodocumentoAux;
					break;
				}
			}

			if(tipodocumentoTemp!=null) {
				jComboBoxid_tipo_documentoComprobantesAnuladosGenerico.setSelectedItem(tipodocumentoTemp);
			} else {
				if(jComboBoxid_tipo_documentoComprobantesAnuladosGenerico!=null && jComboBoxid_tipo_documentoComprobantesAnuladosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documentoComprobantesAnuladosGenerico.setSelectedIndex(0);
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

					if(this.comprobantesanulados!=null) {
						this.comprobantesanulados.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
						jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
							//jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico!=null && jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComprobantesAnulados comprobantesanulados,JComboBox jComboBoxid_empresaComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComprobantesAnuladosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComprobantesAnuladosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comprobantesanulados.setid_empresa(empresaAux.getId());
				comprobantesanulados.setempresa_descripcion(ComprobantesAnuladosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comprobantesanulados.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ComprobantesAnulados comprobantesanulados,JComboBox jComboBoxid_sucursalComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalComprobantesAnuladosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalComprobantesAnuladosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				comprobantesanulados.setid_sucursal(sucursalAux.getId());
				comprobantesanulados.setsucursal_descripcion(ComprobantesAnuladosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				comprobantesanulados.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ComprobantesAnulados comprobantesanulados,JComboBox jComboBoxid_ejercicioComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioComprobantesAnuladosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioComprobantesAnuladosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				comprobantesanulados.setid_ejercicio(ejercicioAux.getId());
				comprobantesanulados.setejercicio_descripcion(ComprobantesAnuladosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				comprobantesanulados.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoForeignKey(ComprobantesAnulados comprobantesanulados,JComboBox jComboBoxid_tipo_documentoComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			TipoDocumento  tipodocumentoAux=new TipoDocumento();

			if(jComboBoxid_tipo_documentoComprobantesAnuladosGenerico==null) {
				tipodocumentoAux=(TipoDocumento)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.getSelectedItem();
			} else {
				tipodocumentoAux=(TipoDocumento)jComboBoxid_tipo_documentoComprobantesAnuladosGenerico.getSelectedItem();
			}

			if(tipodocumentoAux!=null && tipodocumentoAux.getId()!=null) {
				comprobantesanulados.setid_tipo_documento(tipodocumentoAux.getId());
				comprobantesanulados.settipodocumento_descripcion(ComprobantesAnuladosConstantesFunciones.getTipoDocumentoDescripcion(tipodocumentoAux));
				comprobantesanulados.setTipoDocumento(tipodocumentoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(ComprobantesAnulados comprobantesanulados,JComboBox jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoComprobantesAnuladosGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				comprobantesanulados.setid_tipo_movimiento(tipomovimientoAux.getId());
				comprobantesanulados.settipomovimiento_descripcion(ComprobantesAnuladosConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				comprobantesanulados.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
					}

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
					}

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
					}

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.addItem(ejercicio);
							}
						}

						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumento=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.addItem(tipodocumento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
					}

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.removeAllItems();

							for(TipoDocumento tipodocumento:this.tipodocumentosForeignKey) {
								this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.addItem(tipodocumento);
							}
						}

						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { 
					}

					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaComprobantesAnulados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.addItem(tipomovimiento);
							}
						}

						if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoDocumentoForeignKey(TipoDocumento tipodocumento,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedItem(tipodocumento);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipodocumento);
						} else {
							this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesComprobantesAnulados() throws Exception {
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
		
	public ComprobantesAnuladosParameterReturnGeneral getComprobantesAnuladosParameterGeneral() {
		return this.comprobantesanuladosParameterGeneral;
	}
	
	public void setComprobantesAnuladosParameterGeneral(ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosParameterGeneral) {
		this.comprobantesanuladosParameterGeneral = comprobantesanuladosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComprobantesAnulados() {
		return isPermisoTodoComprobantesAnulados;
	}

	public void setIsPermisoTodoComprobantesAnulados(Boolean isPermisoTodoComprobantesAnulados) {
		this.isPermisoTodoComprobantesAnulados = isPermisoTodoComprobantesAnulados;
	}

	public Boolean getIsPermisoNuevoComprobantesAnulados() {
		return isPermisoNuevoComprobantesAnulados;
	}

	public void setIsPermisoNuevoComprobantesAnulados(Boolean isPermisoNuevoComprobantesAnulados) {
		this.isPermisoNuevoComprobantesAnulados = isPermisoNuevoComprobantesAnulados;
	}

	public Boolean getIsPermisoActualizarComprobantesAnulados() {
		return isPermisoActualizarComprobantesAnulados;
	}

	public void setIsPermisoActualizarComprobantesAnulados(Boolean isPermisoActualizarComprobantesAnulados) {
		this.isPermisoActualizarComprobantesAnulados = isPermisoActualizarComprobantesAnulados;
	}

	public Boolean getIsPermisoEliminarComprobantesAnulados() {
		return isPermisoEliminarComprobantesAnulados;
	}

	public void setIsPermisoEliminarComprobantesAnulados(Boolean isPermisoEliminarComprobantesAnulados) {
		this.isPermisoEliminarComprobantesAnulados = isPermisoEliminarComprobantesAnulados;
	}

	public Boolean getIsPermisoGuardarCambiosComprobantesAnulados() {
		return isPermisoGuardarCambiosComprobantesAnulados;
	}

	public void setIsPermisoGuardarCambiosComprobantesAnulados(Boolean isPermisoGuardarCambiosComprobantesAnulados) {
		this.isPermisoGuardarCambiosComprobantesAnulados = isPermisoGuardarCambiosComprobantesAnulados;
	}
	
	public Boolean getIsPermisoConsultaComprobantesAnulados() {
		return isPermisoConsultaComprobantesAnulados;
	}

	public void setIsPermisoConsultaComprobantesAnulados(Boolean isPermisoConsultaComprobantesAnulados) {
		this.isPermisoConsultaComprobantesAnulados = isPermisoConsultaComprobantesAnulados;
	}

	public Boolean getIsPermisoBusquedaComprobantesAnulados() {
		return isPermisoBusquedaComprobantesAnulados;
	}

	public void setIsPermisoBusquedaComprobantesAnulados(Boolean isPermisoBusquedaComprobantesAnulados) {
		this.isPermisoBusquedaComprobantesAnulados = isPermisoBusquedaComprobantesAnulados;
	}

	public Boolean getIsPermisoReporteComprobantesAnulados() {
		return isPermisoReporteComprobantesAnulados;
	}

	public void setIsPermisoReporteComprobantesAnulados(Boolean isPermisoReporteComprobantesAnulados) {
		this.isPermisoReporteComprobantesAnulados = isPermisoReporteComprobantesAnulados;
	}
	
	public Boolean getIsPermisoPaginacionMedioComprobantesAnulados() {
		return isPermisoPaginacionMedioComprobantesAnulados;
	}

	public void setIsPermisoPaginacionMedioComprobantesAnulados(Boolean isPermisoPaginacionMedioComprobantesAnulados) {
		this.isPermisoPaginacionMedioComprobantesAnulados = isPermisoPaginacionMedioComprobantesAnulados;
	}
	
	public Boolean getIsPermisoPaginacionTodoComprobantesAnulados() {
		return isPermisoPaginacionTodoComprobantesAnulados;
	}

	public void setIsPermisoPaginacionTodoComprobantesAnulados(Boolean isPermisoPaginacionTodoComprobantesAnulados) {
		this.isPermisoPaginacionTodoComprobantesAnulados = isPermisoPaginacionTodoComprobantesAnulados;
	}
	
	public Boolean getIsPermisoPaginacionAltoComprobantesAnulados() {
		return isPermisoPaginacionAltoComprobantesAnulados;
	}

	public void setIsPermisoPaginacionAltoComprobantesAnulados(Boolean isPermisoPaginacionAltoComprobantesAnulados) {
		this.isPermisoPaginacionAltoComprobantesAnulados = isPermisoPaginacionAltoComprobantesAnulados;
	}
	
	public Boolean getIsPermisoCopiarComprobantesAnulados() {
		return isPermisoCopiarComprobantesAnulados;
	}

	public void setIsPermisoCopiarComprobantesAnulados(Boolean isPermisoCopiarComprobantesAnulados) {
		this.isPermisoCopiarComprobantesAnulados = isPermisoCopiarComprobantesAnulados;
	}
	
	public Boolean getIsPermisoVerFormComprobantesAnulados() {
		return isPermisoVerFormComprobantesAnulados;
	}

	public void setIsPermisoVerFormComprobantesAnulados(Boolean isPermisoVerFormComprobantesAnulados) {
		this.isPermisoVerFormComprobantesAnulados = isPermisoVerFormComprobantesAnulados;
	}
	
	public Boolean getIsPermisoDuplicarComprobantesAnulados() {
		return isPermisoDuplicarComprobantesAnulados;
	}

	public void setIsPermisoDuplicarComprobantesAnulados(Boolean isPermisoDuplicarComprobantesAnulados) {
		this.isPermisoDuplicarComprobantesAnulados = isPermisoDuplicarComprobantesAnulados;
	}
	
	public Boolean getIsPermisoOrdenComprobantesAnulados() {
		return isPermisoOrdenComprobantesAnulados;
	}

	public void setIsPermisoOrdenComprobantesAnulados(Boolean isPermisoOrdenComprobantesAnulados) {
		this.isPermisoOrdenComprobantesAnulados = isPermisoOrdenComprobantesAnulados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComprobantesAnulados() {
		return isVisibilidadCeldaNuevoComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaNuevoComprobantesAnulados(Boolean isVisibilidadCeldaNuevoComprobantesAnulados) {
		this.isVisibilidadCeldaNuevoComprobantesAnulados = isVisibilidadCeldaNuevoComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComprobantesAnulados() {
		return isVisibilidadCeldaDuplicarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaDuplicarComprobantesAnulados(Boolean isVisibilidadCeldaDuplicarComprobantesAnulados) {
		this.isVisibilidadCeldaDuplicarComprobantesAnulados = isVisibilidadCeldaDuplicarComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComprobantesAnulados() {
		return isVisibilidadCeldaCopiarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaCopiarComprobantesAnulados(Boolean isVisibilidadCeldaCopiarComprobantesAnulados) {
		this.isVisibilidadCeldaCopiarComprobantesAnulados = isVisibilidadCeldaCopiarComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComprobantesAnulados() {
		return isVisibilidadCeldaVerFormComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaVerFormComprobantesAnulados(Boolean isVisibilidadCeldaVerFormComprobantesAnulados) {
		this.isVisibilidadCeldaVerFormComprobantesAnulados = isVisibilidadCeldaVerFormComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComprobantesAnulados() {
		return isVisibilidadCeldaOrdenComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaOrdenComprobantesAnulados(Boolean isVisibilidadCeldaOrdenComprobantesAnulados) {
		this.isVisibilidadCeldaOrdenComprobantesAnulados = isVisibilidadCeldaOrdenComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComprobantesAnulados() {
		return isVisibilidadCeldaNuevoRelacionesComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComprobantesAnulados(Boolean isVisibilidadCeldaNuevoRelacionesComprobantesAnulados) {
		this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados = isVisibilidadCeldaNuevoRelacionesComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComprobantesAnulados() {
		return isVisibilidadCeldaModificarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaModificarComprobantesAnulados(Boolean isVisibilidadCeldaModificarComprobantesAnulados) {
		this.isVisibilidadCeldaModificarComprobantesAnulados = isVisibilidadCeldaModificarComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComprobantesAnulados() {
		return isVisibilidadCeldaActualizarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaActualizarComprobantesAnulados(Boolean isVisibilidadCeldaActualizarComprobantesAnulados) {
		this.isVisibilidadCeldaActualizarComprobantesAnulados = isVisibilidadCeldaActualizarComprobantesAnulados;
	}

	public Boolean getIsVisibilidadCeldaEliminarComprobantesAnulados() {
		return isVisibilidadCeldaEliminarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaEliminarComprobantesAnulados(Boolean isVisibilidadCeldaEliminarComprobantesAnulados) {
		this.isVisibilidadCeldaEliminarComprobantesAnulados = isVisibilidadCeldaEliminarComprobantesAnulados;
	}

	public Boolean getIsVisibilidadCeldaCancelarComprobantesAnulados() {
		return isVisibilidadCeldaCancelarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaCancelarComprobantesAnulados(Boolean isVisibilidadCeldaCancelarComprobantesAnulados) {
		this.isVisibilidadCeldaCancelarComprobantesAnulados = isVisibilidadCeldaCancelarComprobantesAnulados;
	}

	public Boolean getIsVisibilidadCeldaGuardarComprobantesAnulados() {
		return isVisibilidadCeldaGuardarComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaGuardarComprobantesAnulados(Boolean isVisibilidadCeldaGuardarComprobantesAnulados) {
		this.isVisibilidadCeldaGuardarComprobantesAnulados = isVisibilidadCeldaGuardarComprobantesAnulados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComprobantesAnulados() {
		return isVisibilidadCeldaGuardarCambiosComprobantesAnulados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComprobantesAnulados(Boolean isVisibilidadCeldaGuardarCambiosComprobantesAnulados) {
		this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados = isVisibilidadCeldaGuardarCambiosComprobantesAnulados;
	}
		
	public ComprobantesAnuladosSessionBean getcomprobantesanuladosSessionBean() {
		return this.comprobantesanuladosSessionBean;
	}
	
	public void setcomprobantesanuladosSessionBean(ComprobantesAnuladosSessionBean comprobantesanuladosSessionBean) {
		this.comprobantesanuladosSessionBean=comprobantesanuladosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComprobantesAnulados() {
		return this.isVisibilidadBusquedaComprobantesAnulados;
	}

	public void setisVisibilidadBusquedaComprobantesAnulados(Boolean isVisibilidadBusquedaComprobantesAnulados) {
		this.isVisibilidadBusquedaComprobantesAnulados=isVisibilidadBusquedaComprobantesAnulados;
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

	public Boolean getisVisibilidadFK_IdTipoDocumento() {
		return this.isVisibilidadFK_IdTipoDocumento;
	}

	public void setisVisibilidadFK_IdTipoDocumento(Boolean isVisibilidadFK_IdTipoDocumento) {
		this.isVisibilidadFK_IdTipoDocumento=isVisibilidadFK_IdTipoDocumento;
	}

	public Boolean getisVisibilidadFK_IdTipoMovimiento() {
		return this.isVisibilidadFK_IdTipoMovimiento;
	}

	public void setisVisibilidadFK_IdTipoMovimiento(Boolean isVisibilidadFK_IdTipoMovimiento) {
		this.isVisibilidadFK_IdTipoMovimiento=isVisibilidadFK_IdTipoMovimiento;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(ComprobantesAnulados comprobantesanulados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comprobantesanulados,null);
				this.setActualParaGuardarSucursalForeignKey(comprobantesanulados,null);
				this.setActualParaGuardarEjercicioForeignKey(comprobantesanulados,null);
				this.setActualParaGuardarTipoDocumentoForeignKey(comprobantesanulados,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(comprobantesanulados,null);
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
	
	public void bugActualizarReferenciaActual(ComprobantesAnulados comprobantesanulados,ComprobantesAnulados comprobantesanuladosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComprobantesAnulados(comprobantesanulados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comprobantesanuladosAux.setId(comprobantesanulados.getId());
		comprobantesanuladosAux.setVersionRow(comprobantesanulados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComprobantesAnulados comprobantesanuladosLocal) throws Exception {
		
		if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComprobantesAnulados comprobantesanuladosLocal) throws Exception {	
		if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comprobantesanuladosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				comprobantesanuladosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				comprobantesanuladosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoDetalleFormJInternalFrame.class)) {
				TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrameLocal=(TipoDocumentoBeanSwingJInternalFrame) ((TipoDocumentoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.gettipodocumento(),true);
				tipodocumentoBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento,this.tipodocumentosForeignKey);

				tipodocumentoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				comprobantesanuladosLocal.setTipoDocumento(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento);

				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey("Formulario");
				this.setActualTipoDocumentoForeignKey(tipodocumentoBeanSwingJInternalFrameLocal.tipodocumento.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				comprobantesanuladosLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComprobantesAnuladosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comprobantesanuladosValidator.getInvalidValues(this.comprobantesanulados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComprobantesAnulados comprobantesanulados,List<ComprobantesAnulados> comprobantesanuladoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComprobantesAnulados comprobantesanulados,List<ComprobantesAnulados> comprobantesanuladoss) throws Exception {
		try	{			
			ComprobantesAnuladosConstantesFunciones.actualizarSelectedLista(comprobantesanulados,comprobantesanuladoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComprobantesAnulados> comprobantesanuladossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comprobantesanuladossLocal=this.comprobantesanuladosLogic.getComprobantesAnuladoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comprobantesanuladossLocal=this.comprobantesanuladoss;
			}
			//ARCHITECTURE
		
			for(ComprobantesAnulados comprobantesanuladosLocal:comprobantesanuladossLocal) {
				if(this.permiteMantenimiento(comprobantesanuladosLocal) && comprobantesanuladosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComprobantesAnuladosConstantesFunciones.getComprobantesAnuladosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.USERNAMEUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeluser_name_usuarioComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.NOMBREMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_moduloComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigoComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelbeneficiarioComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldetalleComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelfecha_emisionComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.CODIGOTIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_tipo_movimientoComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.NUMEROMAYORDATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnumero_mayor_datoComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.NOMBRECUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_cuenta_contableComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.DEBITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldebito_localComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.CREDITOLOCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcredito_localComprobantesAnulados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobantesAnuladosConstantesFunciones.CODIGOCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_cuenta_contableComprobantesAnulados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeluser_name_usuarioComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_moduloComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigoComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelbeneficiarioComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldetalleComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelfecha_emisionComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_tipo_movimientoComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnumero_mayor_datoComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_cuenta_contableComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldebito_localComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcredito_localComprobantesAnulados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_cuenta_contableComprobantesAnulados,"");
		
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
		this.iIdNuevoComprobantesAnulados--;	
		
		
		this.comprobantesanuladosAux=new ComprobantesAnulados();
		
		this.comprobantesanuladosAux.setId(this.iIdNuevoComprobantesAnulados);
		this.comprobantesanuladosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantesanuladosLogic.getComprobantesAnuladoss().add(this.comprobantesanuladosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comprobantesanuladoss.add(this.comprobantesanuladosAux);
		}
		//ARCHITECTURE
		
		this.comprobantesanulados=this.comprobantesanuladosAux;
		
		if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanulados);
			this.setVariablesObjetoActualToFormularioForeignKeyComprobantesAnulados(this.comprobantesanulados);
		}
				
		//this.setDefaultControlesComprobantesAnulados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComprobantesAnulados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComprobantesAnulados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobantesAnulados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobantesAnulados(this.comprobantesanuladosBean,this.comprobantesanulados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComprobantesAnulados(this.comprobantesanuladosReturnGeneral,this.comprobantesanuladosBean,false);
		
		if(this.comprobantesanuladosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados());
		}
		
		if(this.comprobantesanuladosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados(),classes);//this.comprobantesanuladosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComprobantesAnulados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComprobantesAnulados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.RecargarFormComprobantesAnulados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComprobantesAnulados(false);
						
			if(comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobantesAnulados();
			}
			
			this.actualizarVisualTableDatosComprobantesAnulados();
			
			this.jTableDatosComprobantesAnulados.setRowSelectionInterval(this.getIndiceNuevoComprobantesAnulados(), this.getIndiceNuevoComprobantesAnulados());
			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
						
			this.actualizarEstadoCeldasBotonesComprobantesAnulados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComprobantesAnulados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayorComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarnumero_mayorComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_desdeComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarfecha_emision_desdeComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_hastaComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarfecha_emision_hastaComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activaruser_name_usuarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarnombre_moduloComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarcodigoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarbeneficiarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activardetalleComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarfecha_emisionComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarcodigo_tipo_movimientoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarnumero_mayor_datoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarnombre_cuenta_contableComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activardebito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarcredito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarcodigo_cuenta_contableComprobantesAnulados);	
		//
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarid_empresaComprobantesAnulados);//
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarid_sucursalComprobantesAnulados);//
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarid_ejercicioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarid_tipo_documentoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setEnabled(isHabilitar && this.comprobantesanuladosConstantesFunciones.activarid_tipo_movimientoComprobantesAnulados);
	};
	
	public void setDefaultControlesComprobantesAnulados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComprobantesAnulados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comprobantesanuladosSessionBean.setConGuardarRelaciones(true);			
			this.comprobantesanuladosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.setVisible(true);
			
					
		} else {
			//this.comprobantesanuladosSessionBean.setConGuardarRelaciones(false);			
			this.comprobantesanuladosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComprobantesAnulados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				if(comprobantesanuladosAux.getId().equals(this.iIdNuevoComprobantesAnulados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladoss) {
				if(comprobantesanuladosAux.getId().equals(this.iIdNuevoComprobantesAnulados)) {
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
	
	public int getIndiceActualComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				if(comprobantesanuladosAux.getId().equals(comprobantesanulados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladoss) {
				if(comprobantesanuladosAux.getId().equals(comprobantesanulados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComprobantesAnulados(ComprobantesAnulados comprobantesanuladosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				if(comprobantesanuladosAux.getComprobantesAnuladosOriginal().getId().equals(comprobantesanuladosOriginal.getId())) {
					existe=true;
					comprobantesanuladosOriginal.setId(comprobantesanuladosAux.getId());
					comprobantesanuladosOriginal.setVersionRow(comprobantesanuladosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladoss) {
				if(comprobantesanuladosAux.getComprobantesAnuladosOriginal().getId().equals(comprobantesanuladosOriginal.getId())) {
					existe=true;
					comprobantesanuladosOriginal.setId(comprobantesanuladosAux.getId());
					comprobantesanuladosOriginal.setVersionRow(comprobantesanuladosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComprobantesAnulados(Boolean esParaCancelar) throws Exception {
		comprobantesanuladossAux=new ArrayList<ComprobantesAnulados>();
		comprobantesanuladosAux=new ComprobantesAnulados();
		
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
					if(comprobantesanuladosAux.getId()<0) {
						comprobantesanuladossAux.add(comprobantesanuladosAux);
					}		
				}
				this.iIdNuevoComprobantesAnulados=0L;
				this.comprobantesanuladosLogic.getComprobantesAnuladoss().removeAll(comprobantesanuladossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladoss) {
					if(comprobantesanuladosAux.getId()<0) {
						comprobantesanuladossAux.add(comprobantesanuladosAux);
					}		
				}
				this.iIdNuevoComprobantesAnulados=0L;
				this.comprobantesanuladoss.removeAll(comprobantesanuladossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComprobantesAnulados 
					&& this.comprobantesanuladosLogic.getComprobantesAnuladoss().size()>0
					) {
					comprobantesanuladosAux=this.comprobantesanuladosLogic.getComprobantesAnuladoss().get(this.comprobantesanuladosLogic.getComprobantesAnuladoss().size() - 1);
				
					if(comprobantesanuladosAux.getId()<0) {
						this.comprobantesanuladosLogic.getComprobantesAnuladoss().remove(comprobantesanuladosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComprobantesAnulados && this.comprobantesanuladoss.size()>0) {
					comprobantesanuladosAux=this.comprobantesanuladoss.get(this.comprobantesanuladoss.size() - 1);
				
					if(comprobantesanuladosAux.getId()<0) {
						this.comprobantesanuladoss.remove(comprobantesanuladosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComprobantesAnulados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comprobantesanulados.getId()<0) {
				this.comprobantesanuladosLogic.getComprobantesAnuladoss().remove(this.comprobantesanulados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comprobantesanulados.getId()<0) {
				this.comprobantesanuladoss.remove(this.comprobantesanulados);
			}
		}			
	}
	
	public void setEstadosInicialesComprobantesAnulados(List<ComprobantesAnulados> comprobantesanuladossAux) throws Exception {
		ComprobantesAnuladosConstantesFunciones.setEstadosInicialesComprobantesAnulados(comprobantesanuladossAux);
	}
	
	public void setEstadosInicialesComprobantesAnulados(ComprobantesAnulados comprobantesanuladosAux) throws Exception {
		ComprobantesAnuladosConstantesFunciones.setEstadosInicialesComprobantesAnulados(comprobantesanuladosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComprobantesAnuladosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComprobantesAnuladosActual()) {
				if(!this.isEsNuevoComprobantesAnulados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComprobantesAnulados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComprobantesAnuladosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comprobantes Anulados ?", "MANTENIMIENTO DE Comprobantes Anulados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComprobantesAnulados comprobantesanulados) throws Exception {
		ComprobantesAnuladosConstantesFunciones.seleccionarAsignar(this.comprobantesanulados,comprobantesanulados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComprobantesAnulados=this.isPermisoActualizarOriginalComprobantesAnulados;
			
			
			this.seleccionarAsignar(comprobantesanulados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComprobantesAnulados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comprobantesanuladosSessionBean.setsFuncionBusquedaRapida(this.comprobantesanuladosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComprobantesAnulados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComprobantesAnulados(esParaCancelar);				
				this.cancelarNuevoComprobantesAnulados(esParaCancelar);								
			}
			
			this.comprobantesanulados=new ComprobantesAnulados();
			
			this.inicializarComprobantesAnulados();
			
			this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComprobantesAnulados() throws Exception {
		try {
			ComprobantesAnuladosConstantesFunciones.inicializarComprobantesAnulados(this.comprobantesanulados);
			
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
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comprobantesanuladosLogic.getComprobantesAnuladoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComprobantesAnuladoss(String sAccionBusqueda,List<ComprobantesAnulados> comprobantesanuladossParaReportes) throws Exception {
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
					sPathReporteFinal="ComprobantesAnulados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComprobantesAnuladosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComprobantesAnuladosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComprobantesAnulados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comprobantes Anuladoses");		
		parameters.put("busquedapor", ComprobantesAnuladosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComprobantesAnulados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComprobantesAnuladosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComprobantesAnuladosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComprobantesAnulados=new JRBeanArrayDataSource(ComprobantesAnuladosJInternalFrame.TraerComprobantesAnuladosBeans(comprobantesanuladossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComprobantesAnulados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComprobantesAnuladosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComprobantesAnuladosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComprobantesAnuladosBean.TraerComprobantesAnuladosBeans(comprobantesanuladossParaReportes).toArray()));
							
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
				this.generarExcelReporteComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComprobantesAnuladosActionPerformed(null);
					//this.generarExcelReporteComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComprobantesAnuladoss(sAccionBusqueda,sTipoArchivoReporte,comprobantesanuladossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComprobantesAnuladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobantesAnulados> comprobantesanuladossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobantesAnuladoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobantesAnulados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComprobantesAnulados comprobantesanulados : comprobantesanuladossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComprobantesAnuladosConstantesFunciones.generarExcelReporteDataComprobantesAnulados("NORMAL",row,workbook,comprobantesanulados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComprobantesAnulados(String sTipo,Row row,Workbook workbook) {
		
		ComprobantesAnuladosConstantesFunciones.generarExcelReporteHeaderComprobantesAnulados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComprobantesAnuladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobantesAnulados> comprobantesanuladossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobantesAnuladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComprobantesAnulados comprobantesanulados : comprobantesanuladossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComprobantesAnuladosConstantesFunciones.getComprobantesAnuladosDescripcion(comprobantesanulados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.gettipodocumento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getuser_name_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getnombre_modulo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getcodigo_tipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getnumero_mayor_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getnombre_cuenta_contable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getdebito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getcredito_local());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantesanulados.getcodigo_cuenta_contable());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComprobantesAnuladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobantesAnulados> comprobantesanuladossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComprobantesAnulados> comprobantesanuladossRespaldo=null;
		
		classes=ComprobantesAnuladosConstantesFunciones.getClassesRelationshipsOfComprobantesAnulados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comprobantesanuladosLogic.setDatosCliente(this.datosCliente);
		this.comprobantesanuladosLogic.setDatosDeep(this.datosDeep);
		this.comprobantesanuladosLogic.setIsConDeep(true);
		
		comprobantesanuladossRespaldo=this.comprobantesanuladosLogic.getComprobantesAnuladoss();
		
		this.comprobantesanuladosLogic.setComprobantesAnuladoss(comprobantesanuladossParaReportes);	
		this.comprobantesanuladosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comprobantesanuladossParaReportes=this.comprobantesanuladosLogic.getComprobantesAnuladoss();
		this.comprobantesanuladosLogic.setComprobantesAnuladoss(comprobantesanuladossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobantesAnuladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobantesAnulados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComprobantesAnulados comprobantesanulados : comprobantesanuladossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComprobantesAnulados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComprobantesAnuladosConstantesFunciones.generarExcelReporteDataComprobantesAnulados("NORMAL",row,workbook,comprobantesanulados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComprobantesAnuladosConstantesFunciones.getComprobantesAnuladosDescripcion(comprobantesanulados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComprobantesAnulados() throws Exception {		
		this.startProcessComprobantesAnulados(true);
	}
	
	public void startProcessComprobantesAnulados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComprobantesAnulados ,this.jPanelParametrosReportesComprobantesAnulados, this.jScrollPanelDatosComprobantesAnulados,this.jPanelPaginacionComprobantesAnulados, this.jScrollPanelDatosEdicionComprobantesAnulados, this.jPanelAccionesComprobantesAnulados,this.jPanelAccionesFormularioComprobantesAnulados,this.jmenuBarComprobantesAnulados,this.jmenuBarDetalleComprobantesAnulados,this.jTtoolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobantesAnulados=this.jTabbedPaneBusquedasComprobantesAnulados; 
		
		final JPanel jPanelParametrosReportesComprobantesAnulados=this.jPanelParametrosReportesComprobantesAnulados;
		//final JScrollPane jScrollPanelDatosComprobantesAnulados=this.jScrollPanelDatosComprobantesAnulados;
		final JTable jTableDatosComprobantesAnulados=this.jTableDatosComprobantesAnulados;		
		final JPanel jPanelPaginacionComprobantesAnulados=this.jPanelPaginacionComprobantesAnulados;
		//final JScrollPane jScrollPanelDatosEdicionComprobantesAnulados=this.jScrollPanelDatosEdicionComprobantesAnulados;
		final JPanel jPanelAccionesComprobantesAnulados=this.jPanelAccionesComprobantesAnulados;
		
		JPanel jPanelCamposAuxiliarComprobantesAnulados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComprobantesAnulados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			jPanelCamposAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jPanelCamposComprobantesAnulados;
			jPanelAccionesFormularioAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jPanelAccionesFormularioComprobantesAnulados;
		}
		
		final JPanel jPanelCamposComprobantesAnulados=jPanelCamposAuxiliarComprobantesAnulados;
		final JPanel jPanelAccionesFormularioComprobantesAnulados=jPanelAccionesFormularioAuxiliarComprobantesAnulados;
		
		
		final JMenuBar jmenuBarComprobantesAnulados=this.jmenuBarComprobantesAnulados;
		final JToolBar jTtoolBarComprobantesAnulados=this.jTtoolBarComprobantesAnulados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComprobantesAnulados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobantesAnulados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			jmenuBarDetalleAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jmenuBarDetalleComprobantesAnulados;
			jTtoolBarDetalleAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jTtoolBarDetalleComprobantesAnulados;
		}
		
		final JMenuBar jmenuBarDetalleComprobantesAnulados=jmenuBarDetalleAuxiliarComprobantesAnulados;
		final JToolBar jTtoolBarDetalleComprobantesAnulados=jTtoolBarDetalleAuxiliarComprobantesAnulados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobantesAnulados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobantesAnulados;
			processRunnable.jTableDatos=jTableDatosComprobantesAnulados;
			processRunnable.jPanelCampos=jPanelCamposComprobantesAnulados;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobantesAnulados;
			processRunnable.jPanelAcciones=jPanelAccionesComprobantesAnulados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobantesAnulados;
			
			
			processRunnable.jmenuBar=jmenuBarComprobantesAnulados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobantesAnulados;
			processRunnable.jTtoolBar=jTtoolBarComprobantesAnulados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobantesAnulados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobantesAnulados ,jPanelParametrosReportesComprobantesAnulados,jTableDatosComprobantesAnulados, /*jScrollPanelDatosComprobantesAnulados,*/jPanelCamposComprobantesAnulados,jPanelPaginacionComprobantesAnulados, /*jScrollPanelDatosEdicionComprobantesAnulados,*/ jPanelAccionesComprobantesAnulados,jPanelAccionesFormularioComprobantesAnulados,jmenuBarComprobantesAnulados,jmenuBarDetalleComprobantesAnulados,jTtoolBarComprobantesAnulados,jTtoolBarDetalleComprobantesAnulados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobantesAnulados ,jPanelParametrosReportesComprobantesAnulados, jScrollPanelDatosComprobantesAnulados,jPanelPaginacionComprobantesAnulados, jScrollPanelDatosEdicionComprobantesAnulados, jPanelAccionesComprobantesAnulados,jPanelAccionesFormularioComprobantesAnulados,jmenuBarComprobantesAnulados,jmenuBarDetalleComprobantesAnulados,jTtoolBarComprobantesAnulados,jTtoolBarDetalleComprobantesAnulados);
						
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
	
	public void finishProcessComprobantesAnulados() {// throws Exception 
		this.finishProcessComprobantesAnulados(true);
	}
	
	public void finishProcessComprobantesAnulados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComprobantesAnulados ,this.jPanelParametrosReportesComprobantesAnulados, this.jScrollPanelDatosComprobantesAnulados,this.jPanelPaginacionComprobantesAnulados, this.jScrollPanelDatosEdicionComprobantesAnulados, this.jPanelAccionesComprobantesAnulados,this.jPanelAccionesFormularioComprobantesAnulados,this.jmenuBarComprobantesAnulados,this.jmenuBarDetalleComprobantesAnulados,this.jTtoolBarComprobantesAnulados,this.jTtoolBarDetalleComprobantesAnulados);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobantesAnulados=this.jTabbedPaneBusquedasComprobantesAnulados; 
		
		final JPanel jPanelParametrosReportesComprobantesAnulados=this.jPanelParametrosReportesComprobantesAnulados;
		//final JScrollPane jScrollPanelDatosComprobantesAnulados=this.jScrollPanelDatosComprobantesAnulados;
		final JTable jTableDatosComprobantesAnulados=this.jTableDatosComprobantesAnulados;		
		final JPanel jPanelPaginacionComprobantesAnulados=this.jPanelPaginacionComprobantesAnulados;
		//final JScrollPane jScrollPanelDatosEdicionComprobantesAnulados=this.jScrollPanelDatosEdicionComprobantesAnulados;
		final JPanel jPanelAccionesComprobantesAnulados=this.jPanelAccionesComprobantesAnulados;
		
		JPanel jPanelCamposAuxiliarComprobantesAnulados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComprobantesAnulados=new JPanel();
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			jPanelCamposAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jPanelCamposComprobantesAnulados;
			jPanelAccionesFormularioAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jPanelAccionesFormularioComprobantesAnulados;
		}
		
		final JPanel jPanelCamposComprobantesAnulados=jPanelCamposAuxiliarComprobantesAnulados;
		final JPanel jPanelAccionesFormularioComprobantesAnulados=jPanelAccionesFormularioAuxiliarComprobantesAnulados;
		
		
		final JMenuBar jmenuBarComprobantesAnulados=this.jmenuBarComprobantesAnulados;		
		final JToolBar jTtoolBarComprobantesAnulados=this.jTtoolBarComprobantesAnulados;
				
		JMenuBar jmenuBarDetalleAuxiliarComprobantesAnulados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobantesAnulados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			jmenuBarDetalleAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jmenuBarDetalleComprobantesAnulados;
			jTtoolBarDetalleAuxiliarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jTtoolBarDetalleComprobantesAnulados;		
		}
		
		final JMenuBar jmenuBarDetalleComprobantesAnulados=jmenuBarDetalleAuxiliarComprobantesAnulados;
		final JToolBar jTtoolBarDetalleComprobantesAnulados=jTtoolBarDetalleAuxiliarComprobantesAnulados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobantesAnulados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobantesAnulados;
			processRunnable.jTableDatos=jTableDatosComprobantesAnulados;
			processRunnable.jPanelCampos=jPanelCamposComprobantesAnulados;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobantesAnulados;
			processRunnable.jPanelAcciones=jPanelAccionesComprobantesAnulados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobantesAnulados;
			
			
			processRunnable.jmenuBar=jmenuBarComprobantesAnulados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobantesAnulados;
			processRunnable.jTtoolBar=jTtoolBarComprobantesAnulados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobantesAnulados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComprobantesAnulados ,jPanelParametrosReportesComprobantesAnulados, jTableDatosComprobantesAnulados,/*jScrollPanelDatosComprobantesAnulados,*/jPanelCamposComprobantesAnulados,jPanelPaginacionComprobantesAnulados, /*jScrollPanelDatosEdicionComprobantesAnulados,*/ jPanelAccionesComprobantesAnulados,jPanelAccionesFormularioComprobantesAnulados,jmenuBarComprobantesAnulados,jmenuBarDetalleComprobantesAnulados,jTtoolBarComprobantesAnulados,jTtoolBarDetalleComprobantesAnulados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComprobantesAnulados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComprobantesAnulados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComprobantesAnulados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComprobantesAnulados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComprobantesAnulados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComprobantesAnulados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComprobantesAnulados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComprobantesAnulados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComprobantesAnulados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comprobantesanuladosConstantesFunciones.getsFinalQueryComprobantesAnulados();
		String  finalQueryPaginacionTodos=this.comprobantesanuladosConstantesFunciones.getsFinalQueryComprobantesAnulados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComprobantesAnuladosConstantesFunciones.getArrayColumnasGlobalesNoComprobantesAnulados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComprobantesAnuladosConstantesFunciones.getArrayColumnasGlobalesComprobantesAnulados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComprobantesAnuladosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comprobantesanuladossEliminados= new ArrayList<ComprobantesAnulados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComprobantesAnulados();
		
				///*ComprobantesAnuladosSessionBean*/this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			
			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
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
					this.iNumeroPaginacion=ComprobantesAnuladosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComprobantesAnuladosConstantesFunciones.getClassesForeignKeysOfComprobantesAnulados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comprobantesanulados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comprobantesanuladossAux= new ArrayList<ComprobantesAnulados>();
			
				
			comprobantesanuladosLogic.setDatosCliente(this.datosCliente);
			comprobantesanuladosLogic.setDatosDeep(this.datosDeep);
			comprobantesanuladosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComprobantesAnulados")) {
				this.sDetalleReporte=ComprobantesAnuladosConstantesFunciones.getDetalleIndiceBusquedaComprobantesAnulados(id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comprobantesanuladosLogic.getComprobantesAnuladossBusquedaComprobantesAnulados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobantesAnuladosConstantesFunciones.getDetalleIndiceBusquedaComprobantesAnulados(id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobantesAnuladosConstantesFunciones.getDetalleIndiceBusquedaComprobantesAnulados(id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comprobantesanuladosLogic.getComprobantesAnuladoss()==null||comprobantesanuladosLogic.getComprobantesAnuladoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comprobantesanuladoss==null|| comprobantesanuladoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantesanuladossAux=new ArrayList<ComprobantesAnulados>();
						comprobantesanuladossAux.addAll(comprobantesanuladosLogic.getComprobantesAnuladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantesanuladossAux=new ArrayList<ComprobantesAnulados>();
							comprobantesanuladossAux.addAll(comprobantesanuladoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comprobantesanuladosLogic.getComprobantesAnuladossBusquedaComprobantesAnulados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobantesAnuladosConstantesFunciones.getDetalleIndiceBusquedaComprobantesAnulados(id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobantesAnuladosConstantesFunciones.getDetalleIndiceBusquedaComprobantesAnulados(id_ejercicioBusquedaComprobantesAnulados,id_tipo_documentoBusquedaComprobantesAnulados,id_tipo_movimientoBusquedaComprobantesAnulados,numero_mayorBusquedaComprobantesAnulados,fecha_emision_desdeBusquedaComprobantesAnulados,fecha_emision_hastaBusquedaComprobantesAnulados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComprobantesAnuladoss("BusquedaComprobantesAnulados",comprobantesanuladosLogic.getComprobantesAnuladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComprobantesAnuladoss("BusquedaComprobantesAnulados",comprobantesanuladoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantesanuladosLogic.setComprobantesAnuladoss(new ArrayList<ComprobantesAnulados>());
						comprobantesanuladosLogic.getComprobantesAnuladoss().addAll(comprobantesanuladossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantesanuladoss=new ArrayList<ComprobantesAnulados>();
							comprobantesanuladoss.addAll(comprobantesanuladossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComprobantesAnulados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComprobantesAnulados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantesanuladosLogic.getComprobantesAnuladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantesanuladoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantesanuladosLogic.getComprobantesAnuladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantesanuladoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComprobantesAnulados comprobantesanulados) {
		Boolean permite=true;
		
		if(this.comprobantesanulados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComprobantesAnuladosConstantesFunciones.getOrderByListaComprobantesAnulados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComprobantesAnuladosConstantesFunciones.getOrderByListaComprobantesAnulados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobantesAnulados comprobantesanulados:comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				if(comprobantesanulados.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantesanuladosTotales=comprobantesanulados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobantesAnulados comprobantesanulados:this.comprobantesanuladoss) {
				if(comprobantesanulados.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantesanuladosTotales=comprobantesanulados;
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
			this.comprobantesanuladosAux=new ComprobantesAnulados();
			this.comprobantesanuladosAux.setsType(Constantes2.S_TOTALES);
			this.comprobantesanuladosAux.setIsNew(false);
			this.comprobantesanuladosAux.setIsChanged(false);
			this.comprobantesanuladosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComprobantesAnuladosConstantesFunciones.TotalizarValoresFilaComprobantesAnulados(this.comprobantesanuladosLogic.getComprobantesAnuladoss(),this.comprobantesanuladosAux);
				
				//this.comprobantesanuladosLogic.getComprobantesAnuladoss().add(this.comprobantesanuladosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComprobantesAnuladosConstantesFunciones.TotalizarValoresFilaComprobantesAnulados(this.comprobantesanuladoss,this.comprobantesanuladosAux);
				
				this.comprobantesanuladoss.add(this.comprobantesanuladosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comprobantesanuladosTotales=new ComprobantesAnulados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantesanuladosLogic.getComprobantesAnuladoss().remove(comprobantesanuladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantesanuladoss.remove(comprobantesanuladosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comprobantesanuladosTotales=new ComprobantesAnulados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobantesAnulados comprobantesanulados:comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				if(comprobantesanulados.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantesanuladosTotales=comprobantesanulados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobantesAnuladosConstantesFunciones.TotalizarValoresFilaComprobantesAnulados(this.comprobantesanuladosLogic.getComprobantesAnuladoss(),comprobantesanuladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobantesAnulados comprobantesanulados:this.comprobantesanuladoss) {
				if(comprobantesanulados.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantesanuladosTotales=comprobantesanulados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobantesAnuladosConstantesFunciones.TotalizarValoresFilaComprobantesAnulados(this.comprobantesanuladoss,comprobantesanuladosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComprobantesAnuladossBusquedaComprobantesAnulados()throws Exception {
		try {
			sAccionBusqueda="BusquedaComprobantesAnulados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobantesAnuladossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobantesAnuladossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobantesAnuladossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobantesAnuladossFK_IdTipoDocumento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobantesAnuladossFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComprobantesAnuladossBusquedaComprobantesAnulados(String sFinalQuery,Long id_ejercicio,Long id_tipo_documento,Long id_tipo_movimiento,String numero_mayor,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossBusquedaComprobantesAnulados(sFinalQuery,this.pagination,id_ejercicio,id_tipo_documento,id_tipo_movimiento,numero_mayor,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobantesAnuladossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobantesAnuladossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobantesAnuladossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobantesAnuladossFK_IdTipoDocumento(String sFinalQuery,Long id_tipo_documento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossFK_IdTipoDocumento(sFinalQuery,this.pagination,id_tipo_documento);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobantesAnuladossFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantesanuladosLogic.getComprobantesAnuladossFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosComprobantesAnulados() {
		this.isPermisoTodoComprobantesAnulados=false;
		this.isPermisoNuevoComprobantesAnulados=false;
		this.isPermisoActualizarComprobantesAnulados=false;
		this.isPermisoActualizarOriginalComprobantesAnulados=false;
		this.isPermisoEliminarComprobantesAnulados=false;
		this.isPermisoGuardarCambiosComprobantesAnulados=false;
		this.isPermisoConsultaComprobantesAnulados=true;
		this.isPermisoBusquedaComprobantesAnulados=true;
		this.isPermisoReporteComprobantesAnulados=true;
		this.isPermisoOrdenComprobantesAnulados=false;		
		this.isPermisoPaginacionMedioComprobantesAnulados=false;		
		this.isPermisoPaginacionAltoComprobantesAnulados=false;		
		this.isPermisoPaginacionTodoComprobantesAnulados=false;		
		this.isPermisoCopiarComprobantesAnulados=false;		
		this.isPermisoVerFormComprobantesAnulados=false;		
		this.isPermisoDuplicarComprobantesAnulados=false;
		this.isPermisoOrdenComprobantesAnulados=false;
	}
	
	public void setPermisosUsuarioComprobantesAnulados(Boolean isPermiso) {
		this.isPermisoTodoComprobantesAnulados=isPermiso;
		this.isPermisoNuevoComprobantesAnulados=isPermiso;
		this.isPermisoActualizarComprobantesAnulados=isPermiso;
		this.isPermisoActualizarOriginalComprobantesAnulados=isPermiso;
		this.isPermisoEliminarComprobantesAnulados=isPermiso;
		this.isPermisoGuardarCambiosComprobantesAnulados=isPermiso;
		this.isPermisoConsultaComprobantesAnulados=isPermiso;
		this.isPermisoBusquedaComprobantesAnulados=isPermiso;
		this.isPermisoReporteComprobantesAnulados=isPermiso;
		this.isPermisoOrdenComprobantesAnulados=isPermiso;		
		this.isPermisoPaginacionMedioComprobantesAnulados=isPermiso;		
		this.isPermisoPaginacionAltoComprobantesAnulados=isPermiso;		
		this.isPermisoPaginacionTodoComprobantesAnulados=isPermiso;		
		this.isPermisoCopiarComprobantesAnulados=isPermiso;		
		this.isPermisoVerFormComprobantesAnulados=isPermiso;		
		this.isPermisoDuplicarComprobantesAnulados=isPermiso;
		this.isPermisoOrdenComprobantesAnulados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComprobantesAnulados(Boolean isPermiso) {
		//this.isPermisoTodoComprobantesAnulados=isPermiso;
		this.isPermisoNuevoComprobantesAnulados=isPermiso;
		this.isPermisoActualizarComprobantesAnulados=isPermiso;
		this.isPermisoActualizarOriginalComprobantesAnulados=isPermiso;
		this.isPermisoEliminarComprobantesAnulados=isPermiso;
		this.isPermisoGuardarCambiosComprobantesAnulados=isPermiso;
		//this.isPermisoConsultaComprobantesAnulados=isPermiso;
		//this.isPermisoBusquedaComprobantesAnulados=isPermiso;
		//this.isPermisoReporteComprobantesAnulados=isPermiso;
		//this.isPermisoOrdenComprobantesAnulados=isPermiso;		
		//this.isPermisoPaginacionMedioComprobantesAnulados=isPermiso;		
		//this.isPermisoPaginacionAltoComprobantesAnulados=isPermiso;		
		//this.isPermisoPaginacionTodoComprobantesAnulados=isPermiso;		
		//this.isPermisoCopiarComprobantesAnulados=isPermiso;		
		//this.isPermisoDuplicarComprobantesAnulados=isPermiso;
		//this.isPermisoOrdenComprobantesAnulados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComprobantesAnuladosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComprobantesAnuladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComprobantesAnulados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComprobantesAnuladosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComprobantesAnuladosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComprobantesAnuladosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComprobantesAnuladosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComprobantesAnulados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComprobantesAnuladosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComprobantesAnuladosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComprobantesAnulados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComprobantesAnulados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComprobantesAnulados=this.isPermisoActualizarComprobantesAnulados;
			this.isPermisoEliminarComprobantesAnulados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComprobantesAnulados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComprobantesAnulados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComprobantesAnulados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComprobantesAnulados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComprobantesAnulados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobantesAnulados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComprobantesAnulados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComprobantesAnulados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComprobantesAnulados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComprobantesAnulados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComprobantesAnulados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComprobantesAnulados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobantesAnulados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComprobantesAnulados.setToolTipText(this.jTableDatosComprobantesAnulados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComprobantesAnulados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComprobantesAnulados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComprobantesAnuladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComprobantesAnuladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComprobantesAnulados() throws Exception {
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
	public void inicializarCombosForeignKeyComprobantesAnuladosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipodocumentosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComprobantesAnuladosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComprobantesAnuladosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoDocumentoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentosForeignKey==null||this.tipodocumentosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoConstantesFunciones.getArrayColumnasGlobalesTipoDocumento(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentosForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyComprobantesAnulados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyTipoDocumento();
			this.addItemDefectoCombosForeignKeyTipoMovimiento();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comprobantesanuladosSessionBean==null) {
				this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean();
			}

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

	public void addItemDefectoCombosForeignKeyTipoDocumento()throws Exception {
		try {

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumento()) {
				TipoDocumento tipodocumento=new TipoDocumento();
				TipoDocumentoConstantesFunciones.setTipoDocumentoDescripcion(tipodocumento,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumento.setId(null);

				if(!TipoDocumentoConstantesFunciones.ExisteEnLista(this.tipodocumentosForeignKey,tipodocumento,true)) {

					this.tipodocumentosForeignKey.add(0,tipodocumento);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoMovimiento()throws Exception {
		try {

			if(!this.comprobantesanuladosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
	
	public void initActionsCombosTodosForeignKeyComprobantesAnulados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComprobantesAnulados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComprobantesAnulados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobantesAnulados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComprobantesAnulados(ComprobantesAnulados comprobantesanulados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComprobantesAnulados(ComprobantesAnulados comprobantesanulados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComprobantesAnulados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComprobantesAnulados()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComprobantesAnulados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComprobantesAnulados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComprobantesAnulados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComprobantesAnulados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComprobantesAnulados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComprobantesAnulados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ComprobantesAnuladosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComprobantesAnuladosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComprobantesAnuladosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comprobantesanuladosSessionBean=new ComprobantesAnuladosSessionBean(); 
		this.comprobantesanuladosConstantesFunciones=new ComprobantesAnuladosConstantesFunciones(); 
		this.comprobantesanuladosBean=new ComprobantesAnulados();//(this.comprobantesanuladosConstantesFunciones); 		
		this.comprobantesanuladosReturnGeneral=new ComprobantesAnuladosParameterReturnGeneral(); 
		
		this.comprobantesanuladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantesanuladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComprobantesAnuladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComprobantesAnuladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComprobantesAnuladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComprobantesAnulados(true);
			
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
			
			this.comprobantesanuladosConstantesFunciones=new ComprobantesAnuladosConstantesFunciones(); 
			this.comprobantesanuladosBean=new ComprobantesAnulados();//this.comprobantesanuladosConstantesFunciones); 			
			this.comprobantesanuladosReturnGeneral=new ComprobantesAnuladosParameterReturnGeneral(); 
		
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobantes Anulados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comprobantesanulados=new ComprobantesAnulados();
			this.comprobantesanuladoss = new ArrayList<ComprobantesAnulados>();
			this.comprobantesanuladossAux = new ArrayList<ComprobantesAnulados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic=new ComprobantesAnuladosLogic();
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			//this.comprobantesanuladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comprobantesanuladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComprobantesAnulados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobantesAnulados);	
					}
					
					if(this.jInternalFrameImportacionComprobantesAnulados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobantesAnulados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComprobantesAnulados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComprobantesAnulados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobantesAnulados);
				this.jInternalFrameDetalleFormComprobantesAnulados.setVisible(false);
				this.jInternalFrameDetalleFormComprobantesAnulados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobantesAnulados);
					this.jInternalFrameReporteDinamicoComprobantesAnulados.setVisible(false);
					this.jInternalFrameReporteDinamicoComprobantesAnulados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComprobantesAnulados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComprobantesAnulados);
					this.jInternalFrameImportacionComprobantesAnulados.setVisible(false);
					this.jInternalFrameImportacionComprobantesAnulados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComprobantesAnulados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComprobantesAnulados);
					this.jInternalFrameOrderByComprobantesAnulados.setVisible(false);
					this.jInternalFrameOrderByComprobantesAnulados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComprobantesAnuladosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComprobantesAnuladosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comprobantesanuladosReturnGeneral=new ComprobantesAnuladosParameterReturnGeneral();
			
			this.comprobantesanuladosParameterGeneral=new ComprobantesAnuladosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comprobantesanuladosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComprobantesAnuladosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobantesAnuladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),this.comprobantesanuladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobantesAnuladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),this.comprobantesanuladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaDuplicarComprobantesAnulados=true;
			this.isVisibilidadCeldaCopiarComprobantesAnulados=true;
			this.isVisibilidadCeldaVerFormComprobantesAnulados=true;
			this.isVisibilidadCeldaOrdenComprobantesAnulados=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			
			
			this.isVisibilidadBusquedaComprobantesAnulados=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoDocumento=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComprobantesAnulados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComprobantesAnulados(false);
			
			this.setPermisosUsuarioComprobantesAnulados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() 
				|| (this.comprobantesanuladosSessionBean.getEsGuardarRelacionado() && this.comprobantesanuladosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComprobantesAnuladosClasesRelacionadas();
			}
			
			if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComprobantesAnuladosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComprobantesAnulados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComprobantesAnulados();
			}
			
			if(!this.isPermisoBusquedaComprobantesAnulados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComprobantesAnuladosConstantesFunciones.getTiposSeleccionarComprobantesAnulados());
				
				this.tiposColumnasSelect=ComprobantesAnuladosConstantesFunciones.getTiposSeleccionarComprobantesAnulados(true);
				
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
			//if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComprobantesAnulados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComprobantesAnulados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComprobantesAnulados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobantesAnulados() ;
			
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
			this.tipodocumentoLogic=new TipoDocumentoLogic();
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
				comprobantesanuladosImplementable= (ComprobantesAnuladosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobantesAnuladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comprobantesanuladosImplementableHome= (ComprobantesAnuladosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobantesAnuladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comprobantesanuladoss= new ArrayList<ComprobantesAnulados>();
			this.comprobantesanuladossEliminados= new ArrayList<ComprobantesAnulados>();
						
			this.isEsNuevoComprobantesAnulados=false;
			this.esParaAccionDesdeFormularioComprobantesAnulados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.tipodocumentosForeignKey=new ArrayList<TipoDocumento>() ;
			this.tipomovimientosForeignKey=new ArrayList<TipoMovimiento>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComprobantesAnulados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComprobantesAnulados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComprobantesAnuladosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComprobantesAnulados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComprobantesAnulados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComprobantesAnulados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComprobantesAnulados();
			}
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComprobantesAnulados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComprobantesAnulados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComprobantesAnulados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComprobantesAnulados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComprobantesAnulados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComprobantesAnulados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComprobantesAnulados")) {
				iIndex=this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComprobantesAnulados();	
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
	
	public void cargarCombosForeignKeyComprobantesAnulados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComprobantesAnulados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComprobantesAnulados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComprobantesAnuladosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComprobantesAnulados();
		
		this.cargarCombosFrameForeignKeyComprobantesAnulados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComprobantesAnulados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComprobantesAnulados();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoDocumento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumento();
				this.cargarCombosFrameTipoDocumentosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumento(this.tipodocumentosForeignKey);

		} catch(Exception e) {
			throw e;
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
	
	public void jButtonNuevoComprobantesAnuladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			
			if(jTableDatosComprobantesAnulados.getRowCount()>=1) {
				jTableDatosComprobantesAnulados.removeRowSelectionInterval(0, jTableDatosComprobantesAnulados.getRowCount()-1);						
			}
			
			this.isEsNuevoComprobantesAnulados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComprobantesAnulados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComprobantesAnulados(true);			
			//this.comprobantesanulados=new ComprobantesAnulados();
			//this.comprobantesanulados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobantesAnulados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobantesAnulados() ;
			
			if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobantesAnulados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comprobantesanulados);	
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);				
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComprobantesAnulados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComprobantesAnuladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComprobantesAnulados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComprobantesAnulados.getSelectedRows().length;			
			}
			
			comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComprobantesAnulados--;			
				//ComprobantesAnulados comprobantesanuladosAux= new ComprobantesAnulados();			
				//comprobantesanuladosAux.setId(this.iIdNuevoComprobantesAnulados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComprobantesAnulados comprobantesanuladosOrigen=new ComprobantesAnulados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComprobantesAnulados comprobantesanuladosOrigen : comprobantesanuladossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comprobantesanuladosOrigen =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantesanuladosOrigen =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComprobantesAnulados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comprobantesanulados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComprobantesAnulados(comprobantesanuladosOrigen,this.comprobantesanulados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantesanuladosLogic.getComprobantesAnuladoss().add(this.comprobantesanuladosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantesanuladoss.add(this.comprobantesanuladosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
				
				this.jTableDatosComprobantesAnulados.setRowSelectionInterval(this.getIndiceNuevoComprobantesAnulados(), this.getIndiceNuevoComprobantesAnulados());
				
				int iLastRow =  this.jTableDatosComprobantesAnulados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobantesAnulados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobantesAnulados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobantesAnulados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();									
		
			ComprobantesAnulados comprobantesanuladosOrigen=new ComprobantesAnulados();
			ComprobantesAnulados comprobantesanuladosDestino=new ComprobantesAnulados();
				
			comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComprobantesAnulados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comprobantesanuladossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComprobantesAnulados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantesanuladosOrigen =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantesanuladosOrigen =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantesanuladosDestino =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantesanuladosDestino =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comprobantesanuladosOrigen =comprobantesanuladossSeleccionados.get(0);
				comprobantesanuladosDestino =comprobantesanuladossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComprobantesAnulados(comprobantesanuladosOrigen,comprobantesanuladosDestino,true,false);
				
				comprobantesanuladosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comprobantesanuladosDestino,comprobantesanuladosLogic.getComprobantesAnuladoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comprobantesanuladosDestino,comprobantesanuladoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
				
				//this.jTableDatosComprobantesAnulados.setRowSelectionInterval(this.getIndiceNuevoComprobantesAnulados(), this.getIndiceNuevoComprobantesAnulados());
				
				int iLastRow =  this.jTableDatosComprobantesAnulados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobantesAnulados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobantesAnulados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobantesAnulados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComprobantesAnulados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComprobantesAnulados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComprobantesAnulados.setVisible(!isVisible);
			this.jPanelPaginacionComprobantesAnulados.setVisible(!isVisible);
			this.jPanelAccionesComprobantesAnulados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComprobantesAnulados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComprobantesAnulados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComprobantesAnulados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComprobantesAnulados();
			
			this.abrirFrameOrderByComprobantesAnulados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComprobantesAnulados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComprobantesAnulados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobantesAnulados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComprobantesAnulados.isMaximum()) {
					this.jInternalFrameDetalleFormComprobantesAnulados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComprobantesAnulados.setSize(this.jInternalFrameDetalleFormComprobantesAnulados.iWidthFormulario,this.jInternalFrameDetalleFormComprobantesAnulados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComprobantesAnulados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComprobantesAnulados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComprobantesAnulados.isMaximum()) {
						this.jInternalFrameDetalleFormComprobantesAnulados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComprobantesAnulados.jContentPaneDetalleComprobantesAnulados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComprobantesAnulados.jContentPaneDetalleComprobantesAnulados.getWidth(),ComprobantesAnuladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComprobantesAnulados.jContentPaneDetalleComprobantesAnulados.getWidth(),ComprobantesAnuladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComprobantesAnulados.jContentPaneDetalleComprobantesAnulados.getWidth(),ComprobantesAnuladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComprobantesAnulados.setVisible(true);
	        this.jInternalFrameDetalleFormComprobantesAnulados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComprobantesAnulados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComprobantesAnulados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComprobantesAnulados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobantesAnulados,false,this);
				} else {
					this.jInternalFrameOrderByComprobantesAnulados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobantesAnulados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComprobantesAnulados);
				this.jInternalFrameOrderByComprobantesAnulados.setVisible(false);
				this.jInternalFrameOrderByComprobantesAnulados.setSelected(false);
				
				this.jInternalFrameOrderByComprobantesAnulados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobantesAnulados"));
				
				this.inicializarActualizarBindingTablaOrderByComprobantesAnulados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComprobantesAnulados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComprobantesAnulados==null) {
				
				this.jInternalFrameImportacionComprobantesAnulados=new ImportacionJInternalFrame(ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobantesAnulados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComprobantesAnulados);
				this.jInternalFrameImportacionComprobantesAnulados.setVisible(false);
				this.jInternalFrameImportacionComprobantesAnulados.setSelected(false);


				this.jInternalFrameImportacionComprobantesAnulados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobantesAnulados"));
				this.jInternalFrameImportacionComprobantesAnulados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobantesAnulados"));
				this.jInternalFrameImportacionComprobantesAnulados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobantesAnulados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComprobantesAnulados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComprobantesAnulados==null) {
				this.jInternalFrameReporteDinamicoComprobantesAnulados=new ReporteDinamicoJInternalFrame(ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobantesAnulados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobantesAnulados);
				this.jInternalFrameReporteDinamicoComprobantesAnulados.setVisible(false);
				this.jInternalFrameReporteDinamicoComprobantesAnulados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobantesAnulados"));
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobantesAnulados"));
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobantesAnulados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobantesAnulados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComprobantesAnulados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobantesAnulados);
			
	       	this.jInternalFrameDetalleFormComprobantesAnulados.setVisible(false);
	        this.jInternalFrameDetalleFormComprobantesAnulados.setSelected(false);
			
			//this.jInternalFrameDetalleFormComprobantesAnulados.dispose();
			//this.jInternalFrameDetalleFormComprobantesAnulados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComprobantesAnulados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComprobantesAnulados.setVisible(true);
	        this.jInternalFrameReporteDinamicoComprobantesAnulados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComprobantesAnulados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComprobantesAnulados.setVisible(true);
	        this.jInternalFrameImportacionComprobantesAnulados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComprobantesAnulados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComprobantesAnulados.setVisible(true);
	        this.jInternalFrameOrderByComprobantesAnulados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComprobantesAnulados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComprobantesAnulados.setVisible(false);
	        this.jInternalFrameOrderByComprobantesAnulados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComprobantesAnulados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComprobantesAnulados.setVisible(false);
	        this.jInternalFrameReporteDinamicoComprobantesAnulados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComprobantesAnulados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComprobantesAnulados.setVisible(false);
	        this.jInternalFrameImportacionComprobantesAnulados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComprobantesAnulados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComprobantesAnulados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComprobantesAnulados(true);
			//this.isEsNuevoComprobantesAnulados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComprobantesAnulados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobantesAnulados(false) ;
			
			if(comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobantesAnulados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobantesAnulados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComprobantesAnuladosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComprobantesAnulados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComprobantesAnulados(true);
			//this.isEsNuevoComprobantesAnulados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comprobantesanulados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComprobantesAnulados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComprobantesAnulados(false) ;
			
			if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobantesAnulados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobantesAnulados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoDocumento(List<TipoDocumento> tipodocumentosForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumento=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO));
		TableCellEditor tableCellEditorTipoDocumento =tableColumnTipoDocumento.getCellEditor();

		TipoDocumentoTableCell tipodocumentoTableCellFk=(TipoDocumentoTableCell)tableCellEditorTipoDocumento;

		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.settipodocumentosForeignKey(tipodocumentosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobantesAnulados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentoTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentoTableCellFk.settipodocumentosForeignKeyActual(tipodocumentosForeignKey);
		//}


		if(tipodocumentoTableCellFk!=null) {
			tipodocumentoTableCellFk.RecargarTipoDocumentosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobantesAnulados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComprobantesAnulados(false);
			
			//if(!this.isEsNuevoComprobantesAnulados) {								
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				
			}
			
			if(this.permiteMantenimiento(this.comprobantesanulados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComprobantesAnulados=true;
					this.inicializarActualizarBindingTablaComprobantesAnulados(false);
					this.isEsNuevoComprobantesAnulados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComprobantesAnulados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComprobantesAnulados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobantesAnulados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobantesAnulados(false);
				
				this.habilitarDeshabilitarControlesComprobantesAnulados(false);
			
												
				
				if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComprobantesAnulados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComprobantesAnuladosActionPerformed(evt,comprobantesanuladosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComprobantesAnulados(this.comprobantesanulados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comprobantesanuladosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comprobantesanulados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				this.comprobantesanulados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				this.comprobantesanulados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comprobantesanulados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComprobantesAnuladosModel) this.jTableDatosComprobantesAnulados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComprobantesAnulados=true;
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
				this.isEsNuevoComprobantesAnulados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobantesAnulados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobantesAnulados(false);
				
				this.habilitarDeshabilitarControlesComprobantesAnulados(false);
				
				
				
				if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComprobantesAnulados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComprobantesAnulados.getRowCount()>=1) {
				jTableDatosComprobantesAnulados.removeRowSelectionInterval(0, jTableDatosComprobantesAnulados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComprobantesAnulados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobantesAnulados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobantesAnulados(false) ;
			
			this.isEsNuevoComprobantesAnulados=false;
			
			if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComprobantesAnulados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComprobantesAnulados(false);
				
				//SI ES MANUAL
				if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComprobantesAnulados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComprobantesAnulados--;			
			//ComprobantesAnulados comprobantesanuladosAux= new ComprobantesAnulados();			
			//comprobantesanuladosAux.setId(this.iIdNuevoComprobantesAnulados);
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComprobantesAnulados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
			
			this.comprobantesanulados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comprobantesanuladosLogic.getComprobantesAnuladoss().add(this.comprobantesanuladosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comprobantesanuladoss.add(this.comprobantesanuladosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			
			this.jTableDatosComprobantesAnulados.setRowSelectionInterval(this.getIndiceNuevoComprobantesAnulados(), this.getIndiceNuevoComprobantesAnulados());
			
			int iLastRow =  this.jTableDatosComprobantesAnulados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComprobantesAnulados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComprobantesAnulados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobantesAnulados(false);
			
			//SI ES MANUAL
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobantesAnulados();
			}
			
			//this.abrirFrameTreeComprobantesAnulados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComprobantesAnulados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComprobantesAnulados.setFileImportacion(this.jInternalFrameImportacionComprobantesAnulados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComprobantesAnulados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComprobantesAnulados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComprobantesAnulados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComprobantesAnulados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		

		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComprobantesAnuladosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComprobantesAnuladosBaseDesign.jrxml";
			
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
			
			this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_erNameUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_erNameUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_erNameUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_erNameUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreModulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreModulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreModulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreModulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoTipoMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoTipoMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoTipoMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoTipoMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayorDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayorDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayorDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayorDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_bitoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_bitoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_bitoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_bitoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_editoLocal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_editoLocal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_editoLocal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_editoLocal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCuentaContable_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO:
					sNombreCampoCategoria="user_name_usuario";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoria="nombre_modulo";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoria="codigo_tipo_movimiento";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO:
					sNombreCampoCategoria="numero_mayor_dato";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoria="nombre_cuenta_contable";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoria="debito_local";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoria="credito_local";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoria="codigo_cuenta_contable";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO:
					sNombreCampoCategoriaValor="user_name_usuario";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO:
					sNombreCampoCategoriaValor="nombre_modulo";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="codigo_tipo_movimiento";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO:
					sNombreCampoCategoriaValor="numero_mayor_dato";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					sNombreCampoCategoriaValor="nombre_cuenta_contable";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL:
					sNombreCampoCategoriaValor="debito_local";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL:
					sNombreCampoCategoriaValor="credito_local";
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					sNombreCampoCategoriaValor="codigo_cuenta_contable";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"User Name Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"user_name_usuario");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_modulo");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_tipo_movimiento");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor_dato");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cuenta_contable");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Debito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"debito_local");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Credito Local",sNombreCampoCategoria,sNombreCampoCategoriaValor,"credito_local");
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cuenta_contable");
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
	
	public void jButtonGenerarExcelReporteDinamicoComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComprobantesAnuladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.gettipodocumento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getuser_name_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getnombre_modulo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getcodigo_tipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getnumero_mayor_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getnombre_cuenta_contable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getdebito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getcredito_local());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
					iRow++;

					for(ComprobantesAnulados comprobantesanulados:comprobantesanuladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantesanulados.getcodigo_cuenta_contable());
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
			//	this.getFilaCabeceraExportarExcelComprobantesAnulados(row);				
			//	iRow++;
			//}				
			
			//for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComprobantesAnulados(comprobantesanuladosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
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
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobantesAnulados(false);
			
			//SI ES MANUAL
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobantesAnulados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobantesAnulados(false);
			
			//SI ES MANUAL
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobantesAnulados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobantesAnulados(false);
			
			//SI ES MANUAL
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobantesAnulados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComprobantesAnulados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComprobantesAnulados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComprobantesAnulados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComprobantesAnulados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComprobantesAnulados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComprobantesAnulados.setMinimumSize(dimensionMinimum);
		this.jTableDatosComprobantesAnulados.setMaximumSize(dimensionMaximum);
		this.jTableDatosComprobantesAnulados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComprobantesAnulados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComprobantesAnulados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComprobantesAnulados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComprobantesAnulados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComprobantesAnulados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComprobantesAnulados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobantesAnulados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComprobantesAnulados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComprobantesAnulados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComprobantesAnulados();
		
		this.inicializarActualizarBindingBotonesManualComprobantesAnulados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComprobantesAnulados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobantesAnulados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComprobantesAnulados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComprobantesAnulados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComprobantesAnulados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComprobantesAnulados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComprobantesAnulados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionNuevoComprobantesAnulados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionSinCerrarComprobantesAnulados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionSinMensajeComprobantesAnulados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComprobantesAnulados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComprobantesAnulados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComprobantesAnulados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionNuevoComprobantesAnulados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionSinCerrarComprobantesAnulados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComprobantesAnulados.jCheckBoxPostAccionSinMensajeComprobantesAnulados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComprobantesAnulados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComprobantesAnulados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComprobantesAnulados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComprobantesAnulados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComprobantesAnulados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComprobantesAnulados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComprobantesAnulados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComprobantesAnulados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComprobantesAnulados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComprobantesAnulados(Boolean esInicializar) throws Exception {
		try	{	
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComprobantesAnulados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComprobantesAnulados() throws Exception {
		try	{
			if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobantesAnulados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobantesAnulados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobantesAnulados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComprobantesAnulados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComprobantesAnulados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComprobantesAnulados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComprobantesAnulados.addItem(reporte);
			}
			
			
			if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComprobantesAnulados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComprobantesAnulados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComprobantesAnulados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComprobantesAnulados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComprobantesAnulados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComprobantesAnulados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComprobantesAnulados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobantesAnulados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobantesAnulados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
				
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComprobantesAnuladosConstantesFunciones.getTiposSeleccionarComprobantesAnulados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComprobantesAnuladosConstantesFunciones.getTiposSeleccionarComprobantesAnulados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComprobantesAnuladosConstantesFunciones.getTiposSeleccionarComprobantesAnulados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComprobantesAnulados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComprobantesAnulados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()!=null){this.id_ejercicioBusquedaComprobantesAnulados=((Ejercicio)this.jComboBoxid_ejercicioBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()!=null){this.id_tipo_documentoBusquedaComprobantesAnulados=((TipoDocumento)this.jComboBoxid_tipo_documentoBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaComprobantesAnulados=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaComprobantesAnuladosComprobantesAnulados.getSelectedItem()).getId();}
		this.numero_mayorBusquedaComprobantesAnulados=this.jTextAreanumero_mayorBusquedaComprobantesAnuladosComprobantesAnulados.getText();
		this.fecha_emision_desdeBusquedaComprobantesAnulados=new Date(this.jDateChooserfecha_emision_desdeBusquedaComprobantesAnuladosComprobantesAnulados.getDate().getTime());
		this.fecha_emision_hastaBusquedaComprobantesAnulados=new Date(this.jDateChooserfecha_emision_hastaBusquedaComprobantesAnuladosComprobantesAnulados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComprobantesAnulados(Boolean esInicializar) throws Exception {				
		if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComprobantesAnulados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComprobantesAnulados() throws Exception {
		this.inicializarActualizarBindingTablaComprobantesAnulados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComprobantesAnulados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComprobantesAnuladosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnuladosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComprobantesAnulados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comprobantesanuladosLogic.getComprobantesAnuladoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comprobantesanuladoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComprobantesAnulados.setModel(new ComprobantesAnuladosModel(this.comprobantesanuladosLogic.getComprobantesAnuladoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComprobantesAnulados.setModel(new ComprobantesAnuladosModel(this.comprobantesanuladoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComprobantesAnulados!=null && this.jInternalFrameOrderByComprobantesAnulados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComprobantesAnulados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,comprobantesanuladosConstantesFunciones.resaltarSeleccionarComprobantesAnulados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComprobantesAnuladosConstantesFunciones.SCLASSWEBTITULO,comprobantesanuladosConstantesFunciones.resaltarSeleccionarComprobantesAnulados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_ID));

		if(this.comprobantesanuladosConstantesFunciones.mostraridComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantesanuladosConstantesFunciones.resaltaridComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activaridComprobantesAnulados,iSizeTabla,this,true,"idComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltaridComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activaridComprobantesAnulados,this,true,"idComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO));

		if(this.comprobantesanuladosConstantesFunciones.mostraruser_name_usuarioComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltaruser_name_usuarioComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activaruser_name_usuarioComprobantesAnulados,iSizeTabla,this,true,"user_name_usuarioComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltaruser_name_usuarioComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activaruser_name_usuarioComprobantesAnulados,this,true,"user_name_usuarioComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO));

		if(this.comprobantesanuladosConstantesFunciones.mostrarnombre_moduloComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnombre_moduloComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnombre_moduloComprobantesAnulados,iSizeTabla,this,true,"nombre_moduloComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnombre_moduloComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnombre_moduloComprobantesAnulados,this,true,"nombre_moduloComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO));

		if(this.comprobantesanuladosConstantesFunciones.mostrarcodigoComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigoComprobantesAnulados,iSizeTabla,this,true,"codigoComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigoComprobantesAnulados,this,true,"codigoComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.comprobantesanuladosConstantesFunciones.mostrarbeneficiarioComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarbeneficiarioComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarbeneficiarioComprobantesAnulados,iSizeTabla,this,true,"beneficiarioComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarbeneficiarioComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarbeneficiarioComprobantesAnulados,this,true,"beneficiarioComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE));

		if(this.comprobantesanuladosConstantesFunciones.mostrardetalleComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltardetalleComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activardetalleComprobantesAnulados,iSizeTabla,this,true,"detalleComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltardetalleComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activardetalleComprobantesAnulados,this,true,"detalleComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emisionComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emisionComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarfecha_emisionComprobantesAnulados,iSizeTabla,this,true,"fecha_emisionComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emisionComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarfecha_emisionComprobantesAnulados,this,true,"fecha_emisionComprobantesAnulados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO));

		if(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_tipo_movimientoComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_tipo_movimientoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigo_tipo_movimientoComprobantesAnulados,iSizeTabla,this,true,"codigo_tipo_movimientoComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_tipo_movimientoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigo_tipo_movimientoComprobantesAnulados,this,true,"codigo_tipo_movimientoComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO));

		if(this.comprobantesanuladosConstantesFunciones.mostrarnumero_mayor_datoComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayor_datoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnumero_mayor_datoComprobantesAnulados,iSizeTabla,this,true,"numero_mayor_datoComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayor_datoComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnumero_mayor_datoComprobantesAnulados,this,true,"numero_mayor_datoComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE));

		if(this.comprobantesanuladosConstantesFunciones.mostrarnombre_cuenta_contableComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnombre_cuenta_contableComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnombre_cuenta_contableComprobantesAnulados,iSizeTabla,this,true,"nombre_cuenta_contableComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarnombre_cuenta_contableComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarnombre_cuenta_contableComprobantesAnulados,this,true,"nombre_cuenta_contableComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL));

		if(this.comprobantesanuladosConstantesFunciones.mostrardebito_localComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantesanuladosConstantesFunciones.resaltardebito_localComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activardebito_localComprobantesAnulados,iSizeTabla,this,true,"debito_localComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltardebito_localComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activardebito_localComprobantesAnulados,this,true,"debito_localComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL));

		if(this.comprobantesanuladosConstantesFunciones.mostrarcredito_localComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcredito_localComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcredito_localComprobantesAnulados,iSizeTabla,this,true,"credito_localComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcredito_localComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcredito_localComprobantesAnulados,this,true,"credito_localComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE));

		if(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_cuenta_contableComprobantesAnulados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_cuenta_contableComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigo_cuenta_contableComprobantesAnulados,iSizeTabla,this,true,"codigo_cuenta_contableComprobantesAnulados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_cuenta_contableComprobantesAnulados,this.comprobantesanuladosConstantesFunciones.activarcodigo_cuenta_contableComprobantesAnulados,this,true,"codigo_cuenta_contableComprobantesAnulados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobantesAnuladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobantesAnulados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobantesAnulados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComprobantesAnulados.addColumn(tableColumn);
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
			
			this.jTableDatosComprobantesAnulados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComprobantesAnulados.moveColumn(this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComprobantesAnulados.moveColumn(this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComprobantesAnulados.moveColumn(this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComprobantesAnulados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComprobantesAnulados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComprobantesAnulados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComprobantesAnulados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComprobantesAnulados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComprobantesAnulados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComprobantesAnulados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comprobantesanuladosLogic.getComprobantesAnuladoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comprobantesanuladoss.size()-1;
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
		//this.jTableDatosComprobantesAnulados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComprobantesAnulados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComprobantesAnulados();
			
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
				
				//this.isEsNuevoComprobantesAnulados=false;
					
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
				if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComprobantesAnulados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobantesAnulados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobantesAnulados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comprobantesanulados.getsType().equals("DUPLICADO")
				   || this.comprobantesanulados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComprobantesAnulados=true;
				
				} else {
					this.isEsNuevoComprobantesAnulados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
					if(this.comprobantesanulados.getId()>=0 && !this.comprobantesanulados.getIsNew()) {						
						this.isEsNuevoComprobantesAnulados=false;
						
					} else {
						this.isEsNuevoComprobantesAnulados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComprobantesAnulados(esRelaciones);						
				
				this.seleccionarComprobantesAnulados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comprobantesanulados.getId()<0) {
					this.isEsNuevoComprobantesAnulados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComprobantesAnulados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComprobantesAnulados(evt,rowIndex);
				}	
				
				if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComprobantesAnulados: " + this.dDif); 
					}
				}								
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComprobantesAnulados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comprobantesanulados)) {
					if(this.comprobantesanulados.getId()>0) {
						this.comprobantesanulados.setIsDeleted(true);
						
						this.comprobantesanuladossEliminados.add(this.comprobantesanulados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantesanuladosLogic.getComprobantesAnuladoss().remove(this.comprobantesanulados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantesanuladoss.remove(this.comprobantesanulados);				
					}
					
					
					((ComprobantesAnuladosModel) this.jTableDatosComprobantesAnulados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobantesAnulados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComprobantesAnulados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComprobantesAnulados) {
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobantesAnulados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobantesAnulados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanulados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComprobantesAnulados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComprobantesAnulados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobantesAnulados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobantesAnulados(ComprobantesAnulados comprobantesanulados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComprobantesAnulados(comprobantesanulados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComprobantesAnulados(comprobantesanulados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComprobantesAnulados(comprobantesanulados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComprobantesAnulados(comprobantesanulados);
	}
	
	public void setVariablesObjetoActualToFormularioComprobantesAnulados(ComprobantesAnulados comprobantesanulados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setText(comprobantesanulados.getId().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setText(comprobantesanulados.getuser_name_usuario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setText(comprobantesanulados.getnombre_modulo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setText(comprobantesanulados.getcodigo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setText(comprobantesanulados.getbeneficiario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setText(comprobantesanulados.getdetalle());
			this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setDate(comprobantesanulados.getfecha_emision());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setText(comprobantesanulados.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setText(comprobantesanulados.getnumero_mayor_dato());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setText(comprobantesanulados.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setText(comprobantesanulados.getdebito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setText(comprobantesanulados.getcredito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setText(comprobantesanulados.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComprobantesAnulados comprobantesanuladosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comprobantesanuladosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComprobantesAnulados comprobantesanuladosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comprobantesanuladosLocal=this.comprobantesanulados;
			} else {
				comprobantesanuladosLocal=this.comprobantesanuladosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comprobantesanuladosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComprobantesAnulados(comprobantesanuladosLocal,true);
					
					if(comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comprobantesanuladosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comprobantesanuladosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobantesAnulados(comprobantesanulados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(comprobantesanulados);
	}
	
	public void setVariablesFormularioToObjetoActualComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobantesAnulados(comprobantesanulados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.getText()==null || this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.getText()=="" || this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.getText()=="Id") {
				this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setText("0");
			}

			if(conColumnasBase) {comprobantesanulados.setId(Long.parseLong(this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelIdComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setuser_name_usuario(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeluser_name_usuarioComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setnombre_modulo(this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_moduloComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setcodigo(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigoComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setbeneficiario(this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelbeneficiarioComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setdetalle(this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldetalleComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setfecha_emision(this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelfecha_emisionComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setcodigo_tipo_movimiento(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_tipo_movimientoComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setnumero_mayor_dato(this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnumero_mayor_datoComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setnombre_cuenta_contable(this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelnombre_cuenta_contableComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setdebito_local(Double.parseDouble(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabeldebito_localComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setcredito_local(Double.parseDouble(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcredito_localComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantesanulados.setcodigo_cuenta_contable(this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobantesAnulados.jLabelcodigo_cuenta_contableComprobantesAnulados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobantesAnulados(ComprobantesAnulados comprobantesanuladosBean,ComprobantesAnulados comprobantesanulados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComprobantesAnulados(ComprobantesAnulados comprobantesanuladosOrigen,ComprobantesAnulados comprobantesanulados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantesanuladosOrigen.getId()!=null && !comprobantesanuladosOrigen.getId().equals(0L))) {comprobantesanulados.setId(comprobantesanuladosOrigen.getId());}}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getnumero_mayor()!=null && !comprobantesanuladosOrigen.getnumero_mayor().equals(""))) {comprobantesanulados.setnumero_mayor(comprobantesanuladosOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getfecha_emision_desde()!=null && !comprobantesanuladosOrigen.getfecha_emision_desde().equals(new Date()))) {comprobantesanulados.setfecha_emision_desde(comprobantesanuladosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getfecha_emision_hasta()!=null && !comprobantesanuladosOrigen.getfecha_emision_hasta().equals(new Date()))) {comprobantesanulados.setfecha_emision_hasta(comprobantesanuladosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getuser_name_usuario()!=null && !comprobantesanuladosOrigen.getuser_name_usuario().equals(""))) {comprobantesanulados.setuser_name_usuario(comprobantesanuladosOrigen.getuser_name_usuario());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getnombre_modulo()!=null && !comprobantesanuladosOrigen.getnombre_modulo().equals(""))) {comprobantesanulados.setnombre_modulo(comprobantesanuladosOrigen.getnombre_modulo());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getcodigo()!=null && !comprobantesanuladosOrigen.getcodigo().equals(""))) {comprobantesanulados.setcodigo(comprobantesanuladosOrigen.getcodigo());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getbeneficiario()!=null && !comprobantesanuladosOrigen.getbeneficiario().equals(""))) {comprobantesanulados.setbeneficiario(comprobantesanuladosOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getdetalle()!=null && !comprobantesanuladosOrigen.getdetalle().equals(""))) {comprobantesanulados.setdetalle(comprobantesanuladosOrigen.getdetalle());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getfecha_emision()!=null && !comprobantesanuladosOrigen.getfecha_emision().equals(new Date()))) {comprobantesanulados.setfecha_emision(comprobantesanuladosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getcodigo_tipo_movimiento()!=null && !comprobantesanuladosOrigen.getcodigo_tipo_movimiento().equals(""))) {comprobantesanulados.setcodigo_tipo_movimiento(comprobantesanuladosOrigen.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getnumero_mayor_dato()!=null && !comprobantesanuladosOrigen.getnumero_mayor_dato().equals(""))) {comprobantesanulados.setnumero_mayor_dato(comprobantesanuladosOrigen.getnumero_mayor_dato());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getnombre_cuenta_contable()!=null && !comprobantesanuladosOrigen.getnombre_cuenta_contable().equals(""))) {comprobantesanulados.setnombre_cuenta_contable(comprobantesanuladosOrigen.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getdebito_local()!=null && !comprobantesanuladosOrigen.getdebito_local().equals(0.0))) {comprobantesanulados.setdebito_local(comprobantesanuladosOrigen.getdebito_local());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getcredito_local()!=null && !comprobantesanuladosOrigen.getcredito_local().equals(0.0))) {comprobantesanulados.setcredito_local(comprobantesanuladosOrigen.getcredito_local());}
			if(conDefault || (!conDefault && comprobantesanuladosOrigen.getcodigo_cuenta_contable()!=null && !comprobantesanuladosOrigen.getcodigo_cuenta_contable().equals(""))) {comprobantesanulados.setcodigo_cuenta_contable(comprobantesanuladosOrigen.getcodigo_cuenta_contable());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobantesAnulados(ComprobantesAnulados comprobantesanulados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setText(comprobantesanulados.getId().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setText(comprobantesanulados.getuser_name_usuario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setText(comprobantesanulados.getnombre_modulo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setText(comprobantesanulados.getcodigo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setText(comprobantesanulados.getbeneficiario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setText(comprobantesanulados.getdetalle());
			this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setDate(comprobantesanulados.getfecha_emision());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setText(comprobantesanulados.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setText(comprobantesanulados.getnumero_mayor_dato());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setText(comprobantesanulados.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setText(comprobantesanulados.getdebito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setText(comprobantesanulados.getcredito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setText(comprobantesanulados.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobantesAnulados(ComprobantesAnuladosBean comprobantesanuladosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setText(comprobantesanuladosBean.getId().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setText(comprobantesanuladosBean.getuser_name_usuario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setText(comprobantesanuladosBean.getnombre_modulo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setText(comprobantesanuladosBean.getcodigo());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setText(comprobantesanuladosBean.getbeneficiario());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setText(comprobantesanuladosBean.getdetalle());
			this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setDate(comprobantesanuladosBean.getfecha_emision());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setText(comprobantesanuladosBean.getcodigo_tipo_movimiento());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setText(comprobantesanuladosBean.getnumero_mayor_dato());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setText(comprobantesanuladosBean.getnombre_cuenta_contable());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setText(comprobantesanuladosBean.getdebito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setText(comprobantesanuladosBean.getcredito_local().toString());
			this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setText(comprobantesanuladosBean.getcodigo_cuenta_contable());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComprobantesAnulados(ComprobantesAnuladosParameterReturnGeneral comprobantesanuladosReturnGeneral,ComprobantesAnuladosBean comprobantesanuladosBean,Boolean conDefault) throws Exception { 
		try {
			ComprobantesAnulados comprobantesanuladosLocal=new ComprobantesAnulados();
			
			comprobantesanuladosLocal=comprobantesanuladosReturnGeneral.getComprobantesAnulados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantesanuladosLocal.getId()!=null && !comprobantesanuladosLocal.getId().equals(0L))) {comprobantesanuladosBean.setId(comprobantesanuladosLocal.getId());}}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getuser_name_usuario()!=null && !comprobantesanuladosLocal.getuser_name_usuario().equals(""))) {comprobantesanuladosBean.setuser_name_usuario(comprobantesanuladosLocal.getuser_name_usuario());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getnombre_modulo()!=null && !comprobantesanuladosLocal.getnombre_modulo().equals(""))) {comprobantesanuladosBean.setnombre_modulo(comprobantesanuladosLocal.getnombre_modulo());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getcodigo()!=null && !comprobantesanuladosLocal.getcodigo().equals(""))) {comprobantesanuladosBean.setcodigo(comprobantesanuladosLocal.getcodigo());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getbeneficiario()!=null && !comprobantesanuladosLocal.getbeneficiario().equals(""))) {comprobantesanuladosBean.setbeneficiario(comprobantesanuladosLocal.getbeneficiario());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getdetalle()!=null && !comprobantesanuladosLocal.getdetalle().equals(""))) {comprobantesanuladosBean.setdetalle(comprobantesanuladosLocal.getdetalle());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getfecha_emision()!=null && !comprobantesanuladosLocal.getfecha_emision().equals(new Date()))) {comprobantesanuladosBean.setfecha_emision(comprobantesanuladosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getcodigo_tipo_movimiento()!=null && !comprobantesanuladosLocal.getcodigo_tipo_movimiento().equals(""))) {comprobantesanuladosBean.setcodigo_tipo_movimiento(comprobantesanuladosLocal.getcodigo_tipo_movimiento());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getnumero_mayor_dato()!=null && !comprobantesanuladosLocal.getnumero_mayor_dato().equals(""))) {comprobantesanuladosBean.setnumero_mayor_dato(comprobantesanuladosLocal.getnumero_mayor_dato());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getnombre_cuenta_contable()!=null && !comprobantesanuladosLocal.getnombre_cuenta_contable().equals(""))) {comprobantesanuladosBean.setnombre_cuenta_contable(comprobantesanuladosLocal.getnombre_cuenta_contable());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getdebito_local()!=null && !comprobantesanuladosLocal.getdebito_local().equals(0.0))) {comprobantesanuladosBean.setdebito_local(comprobantesanuladosLocal.getdebito_local());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getcredito_local()!=null && !comprobantesanuladosLocal.getcredito_local().equals(0.0))) {comprobantesanuladosBean.setcredito_local(comprobantesanuladosLocal.getcredito_local());}
			if(conDefault || (!conDefault && comprobantesanuladosLocal.getcodigo_cuenta_contable()!=null && !comprobantesanuladosLocal.getcodigo_cuenta_contable().equals(""))) {comprobantesanuladosBean.setcodigo_cuenta_contable(comprobantesanuladosLocal.getcodigo_cuenta_contable());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComprobantesAnuladosGenerico(Long idComprobantesAnuladosSeleccionado,JComboBox jComboBoxComprobantesAnulados,List<ComprobantesAnulados> comprobantesanuladossLocal)throws Exception {
		try {
			ComprobantesAnulados  comprobantesanuladosTemp=null;

			for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossLocal) {
				if(comprobantesanuladosAux.getId()!=null && comprobantesanuladosAux.getId().equals(idComprobantesAnuladosSeleccionado)) {
					comprobantesanuladosTemp=comprobantesanuladosAux;
					break;
				}
			}

			jComboBoxComprobantesAnulados.setSelectedItem(comprobantesanuladosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComprobantesAnuladosGenerico(JComboBox jComboBoxComprobantesAnulados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobantesAnulados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComprobantesAnulados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobantesAnulados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComprobantesAnulados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComprobantesAnulados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComprobantesAnulados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantesanulados=(ComprobantesAnulados) comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantesanulados =(ComprobantesAnulados) comprobantesanuladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comprobantesanulados.getIsNew() && !comprobantesanulados.getIsChanged() && !comprobantesanulados.getIsDeleted()) {
				sDescripcion=comprobantesanulados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantesanulados.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!comprobantesanulados.getIsNew() && !comprobantesanulados.getIsChanged() && !comprobantesanulados.getIsDeleted()) {
				sDescripcion=comprobantesanulados.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantesanulados.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!comprobantesanulados.getIsNew() && !comprobantesanulados.getIsChanged() && !comprobantesanulados.getIsDeleted()) {
				sDescripcion=comprobantesanulados.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantesanulados.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumento")) {
			//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
			if(!comprobantesanulados.getIsNew() && !comprobantesanulados.getIsChanged() && !comprobantesanulados.getIsDeleted()) {
				sDescripcion=comprobantesanulados.gettipodocumento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantesanulados.gettipodocumento_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!comprobantesanulados.getIsNew() && !comprobantesanulados.getIsChanged() && !comprobantesanulados.getIsDeleted()) {
				sDescripcion=comprobantesanulados.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantesanulados.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComprobantesAnulados comprobantesanuladosRow=new ComprobantesAnulados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantesanuladosRow=(ComprobantesAnulados) comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantesanuladosRow=(ComprobantesAnulados) comprobantesanuladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComprobantesAnulados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));			
			this.jButtonDuplicarComprobantesAnulados.setVisible((this.isVisibilidadCeldaDuplicarComprobantesAnulados && this.isPermisoDuplicarComprobantesAnulados));			
			this.jButtonCopiarComprobantesAnulados.setVisible((this.isVisibilidadCeldaCopiarComprobantesAnulados && this.isPermisoCopiarComprobantesAnulados));
			this.jButtonVerFormComprobantesAnulados.setVisible((this.isVisibilidadCeldaVerFormComprobantesAnulados && this.isPermisoVerFormComprobantesAnulados));
			
			this.jButtonAbrirOrderByComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));			
			
			this.jButtonNuevoRelacionesComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));			
			this.jButtonNuevoGuardarCambiosComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarComprobantesAnulados.setVisible((this.isVisibilidadCeldaModificarComprobantesAnulados && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.setVisible((this.isVisibilidadCeldaActualizarComprobantesAnulados && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.setVisible((this.isVisibilidadCeldaEliminarComprobantesAnulados && this.isPermisoEliminarComprobantesAnulados));
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.setVisible(this.isVisibilidadCeldaCancelarComprobantesAnulados);							
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));			
			
			}
						
			this.jButtonGuardarCambiosTablaComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));						
			this.jButtonDuplicarToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaDuplicarComprobantesAnulados && this.isPermisoDuplicarComprobantesAnulados));						
			this.jButtonCopiarToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaCopiarComprobantesAnulados && this.isPermisoCopiarComprobantesAnulados));			
			this.jButtonVerFormToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaVerFormComprobantesAnulados && this.isPermisoVerFormComprobantesAnulados));			
			this.jButtonAbrirOrderByToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));
			this.jButtonNuevoRelacionesToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));			
			this.jButtonNuevoGuardarCambiosToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));			
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaModificarComprobantesAnulados && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaActualizarComprobantesAnulados  && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaEliminarComprobantesAnulados && this.isPermisoEliminarComprobantesAnulados));
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarToolBarComprobantesAnulados.setVisible(this.isVisibilidadCeldaCancelarComprobantesAnulados);				
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));			
			this.jMenuItemDuplicarComprobantesAnulados.setVisible((this.isVisibilidadCeldaDuplicarComprobantesAnulados && this.isPermisoDuplicarComprobantesAnulados));			
			this.jMenuItemCopiarComprobantesAnulados.setVisible((this.isVisibilidadCeldaCopiarComprobantesAnulados && this.isPermisoCopiarComprobantesAnulados));			
			this.jMenuItemVerFormComprobantesAnulados.setVisible((this.isVisibilidadCeldaVerFormComprobantesAnulados && this.isPermisoVerFormComprobantesAnulados));			
			this.jMenuItemAbrirOrderByComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));			
			//this.jMenuItemMostrarOcultarComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));
			this.jMenuItemDetalleAbrirOrderByComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));			
			//this.jMenuItemDetalleMostrarOcultarComprobantesAnulados.setVisible((this.isVisibilidadCeldaOrdenComprobantesAnulados && this.isPermisoOrdenComprobantesAnulados));			
			this.jMenuItemNuevoRelacionesComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados));			
			this.jMenuItemNuevoGuardarCambiosComprobantesAnulados.setVisible((this.isVisibilidadCeldaNuevoComprobantesAnulados && this.isPermisoNuevoComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));									
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemModificarComprobantesAnulados.setVisible((this.isVisibilidadCeldaModificarComprobantesAnulados && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemActualizarComprobantesAnulados.setVisible((this.isVisibilidadCeldaActualizarComprobantesAnulados && this.isPermisoActualizarComprobantesAnulados));	
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemEliminarComprobantesAnulados.setVisible((this.isVisibilidadCeldaEliminarComprobantesAnulados && this.isPermisoEliminarComprobantesAnulados));
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemCancelarComprobantesAnulados.setVisible(this.isVisibilidadCeldaCancelarComprobantesAnulados);				
			}
			
			this.jMenuItemGuardarCambiosComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));						
			this.jMenuItemGuardarCambiosTablaComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=this.jButtonNuevoComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaDuplicarComprobantesAnulados=this.jButtonDuplicarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaCopiarComprobantesAnulados=this.jButtonCopiarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaVerFormComprobantesAnulados=this.jButtonVerFormComprobantesAnulados.isVisible();
			
			this.isVisibilidadCeldaOrdenComprobantesAnulados=this.jButtonAbrirOrderByComprobantesAnulados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=this.jButtonNuevoRelacionesComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaModificarComprobantesAnulados=this.jButtonModificarComprobantesAnulados.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.isVisibilidadCeldaActualizarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaEliminarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaCancelarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaGuardarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=this.jButtonGuardarCambiosTablaComprobantesAnulados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComprobantesAnulados=this.jButtonNuevoToolBarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=this.jButtonNuevoRelacionesToolBarComprobantesAnulados.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.isVisibilidadCeldaModificarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarToolBarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaActualizarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarToolBarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaEliminarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarToolBarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaCancelarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarToolBarComprobantesAnulados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobantesAnulados=this.jButtonGuardarCambiosToolBarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComprobantesAnulados=this.jMenuItemNuevoComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=this.jMenuItemNuevoRelacionesComprobantesAnulados.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.isVisibilidadCeldaModificarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemModificarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaActualizarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemActualizarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaEliminarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemEliminarComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaCancelarComprobantesAnulados=this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemCancelarComprobantesAnulados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobantesAnulados=this.jMenuItemGuardarCambiosComprobantesAnulados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=this.jMenuItemGuardarCambiosTablaComprobantesAnulados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComprobantesAnulados(Boolean esInicializar) {
		if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
				//if(this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComprobantesAnulados();
			}
			
			this.inicializarActualizarBindingBotonesManualComprobantesAnulados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComprobantesAnulados() {
		this.jButtonNuevoComprobantesAnulados.setVisible(this.isPermisoNuevoComprobantesAnulados);			
		this.jButtonDuplicarComprobantesAnulados.setVisible(this.isPermisoDuplicarComprobantesAnulados);			
		this.jButtonCopiarComprobantesAnulados.setVisible(this.isPermisoCopiarComprobantesAnulados);			
		this.jButtonVerFormComprobantesAnulados.setVisible(this.isPermisoVerFormComprobantesAnulados);			
		
		this.jButtonAbrirOrderByComprobantesAnulados.setVisible(this.isPermisoOrdenComprobantesAnulados);					
		
		this.jButtonNuevoRelacionesComprobantesAnulados.setVisible(this.isPermisoNuevoComprobantesAnulados);			
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarComprobantesAnulados.setVisible(this.isPermisoActualizarComprobantesAnulados);	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.setVisible(this.isPermisoActualizarComprobantesAnulados);	
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.setVisible(this.isPermisoEliminarComprobantesAnulados);
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.setVisible(this.isVisibilidadCeldaCancelarComprobantesAnulados);						
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.setVisible(this.isPermisoGuardarCambiosComprobantesAnulados);							
		}
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.setVisible(this.isPermisoActualizarComprobantesAnulados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobantesAnulados() {
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarComprobantesAnulados.setVisible(this.isPermisoActualizarComprobantesAnulados);	
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.setVisible(this.isPermisoActualizarComprobantesAnulados);	
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.setVisible(this.isPermisoEliminarComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.setVisible(this.isVisibilidadCeldaCancelarComprobantesAnulados);							
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.setVisible((this.isVisibilidadCeldaGuardarComprobantesAnulados && this.isPermisoGuardarCambiosComprobantesAnulados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComprobantesAnulados() {
		if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComprobantesAnulados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComprobantesAnulados() {
	}
	
	public void jTableDatosComprobantesAnuladosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComprobantesAnulados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comprobantesanulados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComprobantesAnuladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComprobantesAnulados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobantesAnulados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comprobantesanuladosLogic.getConnexion());

				if(this.comprobantesanulados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comprobantesanulados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobantesAnulados=(TitledBorder)this.jScrollPanelDatosComprobantesAnulados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComprobantesAnulados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comprobantesanulados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalComprobantesAnuladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebComprobantesAnulados(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobantesAnulados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.comprobantesanuladosLogic.getConnexion());

				if(this.comprobantesanulados.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.comprobantesanulados.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobantesAnulados=(TitledBorder)this.jScrollPanelDatosComprobantesAnulados.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderComprobantesAnulados.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.comprobantesanulados.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioComprobantesAnuladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebComprobantesAnulados(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobantesAnulados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.comprobantesanuladosLogic.getConnexion());

				if(this.comprobantesanulados.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.comprobantesanulados.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobantesAnulados=(TitledBorder)this.jScrollPanelDatosComprobantesAnulados.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderComprobantesAnulados.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.comprobantesanulados.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documentoComprobantesAnuladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumento=true;

			idTienePermisotipodocumento=this.tienePermisosUsuarioEnPaginaWebComprobantesAnulados(TipoDocumentoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobantesAnulados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);

				this.tipodocumentoBeanSwingJInternalFrame=new TipoDocumentoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentoBeanSwingJInternalFrame.getTipoDocumentoLogic().setConnexion(this.comprobantesanuladosLogic.getConnexion());

				if(this.comprobantesanulados.getid_tipo_documento()!=null) {
					this.tipodocumentoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentoBeanSwingJInternalFrame.setIdActual(this.comprobantesanulados.getid_tipo_documento());
					this.tipodocumentoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobantesAnulados=(TitledBorder)this.jScrollPanelDatosComprobantesAnulados.getBorder();
				TitledBorder titledBordertipodocumento=(TitledBorder)this.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

				titledBordertipodocumento.setTitle(titledBorderComprobantesAnulados.getTitle() + " -> Tipo Documento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documentoComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getid_tipo_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento = "+this.comprobantesanulados.getid_tipo_documento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoComprobantesAnuladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebComprobantesAnulados(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobantesAnulados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobantesAnulados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.comprobantesanuladosLogic.getConnexion());

				if(this.comprobantesanulados.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.comprobantesanulados.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobantesAnulados=(TitledBorder)this.jScrollPanelDatosComprobantesAnulados.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderComprobantesAnulados.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.comprobantesanulados.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.comprobantesanulados.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.comprobantesanulados.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.comprobantesanulados.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonuser_name_usuarioComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getuser_name_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where user_name_usuario like '%"+this.comprobantesanulados.getuser_name_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_moduloComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getnombre_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_modulo like '%"+this.comprobantesanulados.getnombre_modulo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.comprobantesanulados.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.comprobantesanulados.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.comprobantesanulados.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.comprobantesanulados.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getcodigo_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_tipo_movimiento like '%"+this.comprobantesanulados.getcodigo_tipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayor_datoComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getnumero_mayor_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor_dato like '%"+this.comprobantesanulados.getnumero_mayor_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getnombre_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cuenta_contable like '%"+this.comprobantesanulados.getnombre_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondebito_localComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getdebito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where debito_local = "+this.comprobantesanulados.getdebito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncredito_localComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getcredito_local()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where credito_local = "+this.comprobantesanulados.getcredito_local().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.getcomprobantesanulados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantesanulados==null) {
						this.comprobantesanulados = new ComprobantesAnulados();
					}

					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);
				}

				if(this.comprobantesanulados.getcodigo_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cuenta_contable like '%"+this.comprobantesanulados.getcodigo_cuenta_contable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobantesAnulados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComprobantesAnuladosComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossBusquedaComprobantesAnulados();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossFK_IdEjercicio();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossFK_IdEmpresa();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossFK_IdSucursal();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossFK_IdTipoDocumento();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoComprobantesAnuladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobantesAnulados(false,false);

			this.getComprobantesAnuladossFK_IdTipoMovimiento();

			this.inicializarActualizarBindingComprobantesAnulados(false);

			//if(ComprobantesAnuladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobantesAnulados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantesanuladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComprobantesAnulados() {
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
			this.jInternalFrameDetalleFormComprobantesAnulados.setVisible(false);	    			
			this.jInternalFrameDetalleFormComprobantesAnulados.dispose();
			this.jInternalFrameDetalleFormComprobantesAnulados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
			this.jInternalFrameReporteDinamicoComprobantesAnulados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComprobantesAnulados.dispose();
			this.jInternalFrameReporteDinamicoComprobantesAnulados=null;
		}
		
		if(this.jInternalFrameImportacionComprobantesAnulados!=null) {
			this.jInternalFrameImportacionComprobantesAnulados.setVisible(false);	    			
			this.jInternalFrameImportacionComprobantesAnulados.dispose();
			this.jInternalFrameImportacionComprobantesAnulados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComprobantesAnulados();
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			
			if(sTipo.equals("NuevoComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComprobantesAnulados")) {
				jButtonDuplicarComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComprobantesAnulados")) {
				jButtonCopiarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormComprobantesAnulados")) {
				jButtonVerFormComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComprobantesAnulados")) {
				jButtonDuplicarComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComprobantesAnulados")) {
				jButtonDuplicarComprobantesAnuladosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComprobantesAnulados")) {
				jButtonModificarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComprobantesAnulados")) {
				jButtonModificarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComprobantesAnulados")) {
				jButtonModificarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComprobantesAnulados")) {
				jButtonActualizarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComprobantesAnulados")) {
				jButtonActualizarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComprobantesAnulados")) {
				jButtonActualizarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarComprobantesAnulados")) {
				jButtonEliminarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComprobantesAnulados")) {
				jButtonEliminarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComprobantesAnulados")) {
				jButtonEliminarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarComprobantesAnulados")) {
				jButtonCancelarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComprobantesAnulados")) {
				jButtonCancelarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComprobantesAnulados")) {
				jButtonCancelarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarComprobantesAnulados")) {
				jButtonCerrarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComprobantesAnulados")) {
				jButtonCerrarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComprobantesAnulados")) {
				jButtonCerrarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComprobantesAnulados")) {
				jButtonMostrarOcultarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComprobantesAnulados")) {
				jButtonCancelarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComprobantesAnulados")) {
				jButtonCopiarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComprobantesAnulados")) {
				jButtonVerFormComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComprobantesAnulados")) {
				jButtonCopiarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComprobantesAnulados")) {
				jButtonVerFormComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComprobantesAnulados")) {
				jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComprobantesAnulados")) {
				jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComprobantesAnulados")) {
				jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComprobantesAnulados")) {
				jButtonAnterioresComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComprobantesAnulados")) {
				jButtonAnterioresComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComprobantesAnulados")) {
				jButtonAnterioresComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComprobantesAnulados")) {
				jButtonSiguientesComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComprobantesAnulados")) {
				jButtonSiguientesComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComprobantesAnulados")) {
				jButtonSiguientesComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComprobantesAnulados") || sTipo.equals("MenuItemDetalleAbrirOrderByComprobantesAnulados")) {
				jButtonAbrirOrderByComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComprobantesAnulados") || sTipo.equals("MenuItemDetalleMostrarOcultarComprobantesAnulados")) {
				jButtonMostrarOcultarComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComprobantesAnulados")) {
				jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComprobantesAnulados")) {
				jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComprobantesAnulados")) {
				jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComprobantesAnulados")) {
				jButtonCerrarReporteDinamicoComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComprobantesAnulados")) {
				jButtonGenerarReporteDinamicoComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComprobantesAnulados")) {
				
				jButtonGenerarExcelReporteDinamicoComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComprobantesAnulados")) {
				jButtonCerrarImportacionComprobantesAnuladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComprobantesAnulados")) {
				
				jButtonGenerarImportacionComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComprobantesAnulados")) {
				
				jButtonAbrirImportacionComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComprobantesAnulados")) {
				jComboBoxTiposAccionesComprobantesAnuladosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComprobantesAnulados")) {
				jComboBoxTiposRelacionesComprobantesAnuladosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComprobantesAnulados")) {
				jComboBoxTiposAccionesComprobantesAnuladosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComprobantesAnulados")) {
				
				jComboBoxTiposSeleccionarComprobantesAnuladosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComprobantesAnulados")) {
				jTextFieldValorCampoGeneralComprobantesAnuladosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComprobantesAnulados")) {
				jButtonAbrirOrderByComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComprobantesAnulados")) {
				jButtonAbrirOrderByComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComprobantesAnulados")) {
				jButtonCerrarOrderByComprobantesAnuladosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobantesAnuladosBusqueda")) {
				this.jButtonidComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobantesAnuladosUpdate")) {
				this.jButtonid_empresaComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobantesAnuladosBusqueda")) {
				this.jButtonid_empresaComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobantesAnuladosUpdate")) {
				this.jButtonid_sucursalComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobantesAnuladosBusqueda")) {
				this.jButtonid_sucursalComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComprobantesAnuladosUpdate")) {
				this.jButtonid_ejercicioComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComprobantesAnuladosBusqueda")) {
				this.jButtonid_ejercicioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoComprobantesAnuladosUpdate")) {
				this.jButtonid_tipo_documentoComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoComprobantesAnuladosBusqueda")) {
				this.jButtonid_tipo_documentoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoComprobantesAnuladosUpdate")) {
				this.jButtonid_tipo_movimientoComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoComprobantesAnuladosBusqueda")) {
				this.jButtonid_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorComprobantesAnuladosBusqueda")) {
				this.jButtonnumero_mayorComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emision_desdeComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emision_hastaComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("user_name_usuarioComprobantesAnuladosBusqueda")) {
				this.jButtonuser_name_usuarioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloComprobantesAnuladosBusqueda")) {
				this.jButtonnombre_moduloComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoComprobantesAnuladosBusqueda")) {
				this.jButtoncodigoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioComprobantesAnuladosBusqueda")) {
				this.jButtonbeneficiarioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleComprobantesAnuladosBusqueda")) {
				this.jButtondetalleComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emisionComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoComprobantesAnuladosBusqueda")) {
				this.jButtoncodigo_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayor_datoComprobantesAnuladosBusqueda")) {
				this.jButtonnumero_mayor_datoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableComprobantesAnuladosBusqueda")) {
				this.jButtonnombre_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localComprobantesAnuladosBusqueda")) {
				this.jButtondebito_localComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localComprobantesAnuladosBusqueda")) {
				this.jButtoncredito_localComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableComprobantesAnuladosBusqueda")) {
				this.jButtoncodigo_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComprobantesAnuladosComprobantesAnulados")) {
				this.jButtonBusquedaComprobantesAnuladosComprobantesAnuladosActionPerformed(evt);
			}
			
			;
			
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComprobantesAnulados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComprobantesAnulados comprobantesanuladosLocal=null;
			
			if(!this.getEsControlTabla()) {
				comprobantesanuladosLocal=this.comprobantesanulados;
			} else {
				comprobantesanuladosLocal=this.comprobantesanuladosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
							
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
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
			
			


			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
								
						
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
								
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
							
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
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
			
			


			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
								
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComprobantesAnulados")) {
					jCheckBoxSeleccionarTodosComprobantesAnuladosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComprobantesAnulados")) {
					jCheckBoxSeleccionadosComprobantesAnuladosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComprobantesAnulados")) {
					
				}
				
				


				
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
												
				
				


				
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
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
			
			


			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobantesAnuladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantesanulados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantesanulados);
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
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
				
				


				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobantesAnulados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobantesAnulados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobantesAnuladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantesanuladosAnterior =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComprobantesAnulados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComprobantesAnuladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComprobantesAnulados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comprobantesanulados =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comprobantesanulados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComprobantesAnulados")) {
				
				}
				
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComprobantesAnulados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComprobantesAnulados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComprobantesAnulados")) {
			
			}
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComprobantesAnulados();
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			if(sTipo.equals("NuevoComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComprobantesAnulados")) {
				jButtonDuplicarComprobantesAnuladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComprobantesAnulados")) {
				jButtonCopiarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComprobantesAnulados")) {
				jButtonVerFormComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComprobantesAnulados")) {
				jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComprobantesAnulados")) {
				jButtonModificarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComprobantesAnulados")) {
				jButtonActualizarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComprobantesAnulados")) {
				jButtonEliminarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComprobantesAnulados")) {
				jButtonCancelarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComprobantesAnulados")) {
				jButtonCerrarComprobantesAnuladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComprobantesAnulados")) {
				jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComprobantesAnulados")) {
				jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComprobantesAnulados")) {
				jButtonAbrirOrderByComprobantesAnuladosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComprobantesAnulados")) {
				jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComprobantesAnulados")) {
				jButtonAnterioresComprobantesAnuladosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComprobantesAnulados")) {
				jButtonSiguientesComprobantesAnuladosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobantesAnuladosBusqueda")) {
				this.jButtonidComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobantesAnuladosUpdate")) {
				this.jButtonid_empresaComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobantesAnuladosBusqueda")) {
				this.jButtonid_empresaComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobantesAnuladosUpdate")) {
				this.jButtonid_sucursalComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobantesAnuladosBusqueda")) {
				this.jButtonid_sucursalComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComprobantesAnuladosUpdate")) {
				this.jButtonid_ejercicioComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComprobantesAnuladosBusqueda")) {
				this.jButtonid_ejercicioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documentoComprobantesAnuladosUpdate")) {
				this.jButtonid_tipo_documentoComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documentoComprobantesAnuladosBusqueda")) {
				this.jButtonid_tipo_documentoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoComprobantesAnuladosUpdate")) {
				this.jButtonid_tipo_movimientoComprobantesAnuladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoComprobantesAnuladosBusqueda")) {
				this.jButtonid_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorComprobantesAnuladosBusqueda")) {
				this.jButtonnumero_mayorComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emision_desdeComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emision_hastaComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("user_name_usuarioComprobantesAnuladosBusqueda")) {
				this.jButtonuser_name_usuarioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_moduloComprobantesAnuladosBusqueda")) {
				this.jButtonnombre_moduloComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoComprobantesAnuladosBusqueda")) {
				this.jButtoncodigoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioComprobantesAnuladosBusqueda")) {
				this.jButtonbeneficiarioComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleComprobantesAnuladosBusqueda")) {
				this.jButtondetalleComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionComprobantesAnuladosBusqueda")) {
				this.jButtonfecha_emisionComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_tipo_movimientoComprobantesAnuladosBusqueda")) {
				this.jButtoncodigo_tipo_movimientoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayor_datoComprobantesAnuladosBusqueda")) {
				this.jButtonnumero_mayor_datoComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cuenta_contableComprobantesAnuladosBusqueda")) {
				this.jButtonnombre_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("debito_localComprobantesAnuladosBusqueda")) {
				this.jButtondebito_localComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("credito_localComprobantesAnuladosBusqueda")) {
				this.jButtoncredito_localComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cuenta_contableComprobantesAnuladosBusqueda")) {
				this.jButtoncodigo_cuenta_contableComprobantesAnuladosBusquedaActionPerformed(evt);
			}
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComprobantesAnulados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComprobantesAnulados")) {
				closingInternalFrameComprobantesAnulados();
				
			} else if(sTipo.equals("jButtonCancelarComprobantesAnulados")) {
				JInternalFrameBase jInternalFrameDetalleFormComprobantesAnulados = (JInternalFrameBase)evt.getSource();
	            	
	            ComprobantesAnuladosBeanSwingJInternalFrame jInternalFrameParent=(ComprobantesAnuladosBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobantesAnulados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComprobantesAnuladosActionPerformed(null);
			}
			
			ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantesanulados,new Object(),this.comprobantesanuladosParameterGeneral,this.comprobantesanuladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComprobantesAnulados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComprobantesAnulados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComprobantesAnulados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comprobantesanulados)) {
			if(!esControlTabla) {
				if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);			
				}
				
				if(this.comprobantesanuladosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComprobantesAnulados(this.comprobantesanulados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComprobantesAnulados(this.comprobantesanuladosReturnGeneral,this.comprobantesanuladosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comprobantesanuladosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComprobantesAnulados(classes,this.comprobantesanuladosReturnGeneral,this.comprobantesanuladosBean,false);
					}
						
					if(this.comprobantesanuladosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados());	
					}
						
					if(this.comprobantesanuladosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados(),classes);//this.comprobantesanuladosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComprobantesAnulados(this.comprobantesanulados,classes);//this.comprobantesanuladosBean);									
				}
			
				if(ComprobantesAnuladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComprobantesAnulados(this.comprobantesanulados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobantesAnulados(this.comprobantesanulados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comprobantesanuladosAnterior!=null) {
						this.comprobantesanulados=this.comprobantesanuladosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comprobantesanuladosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comprobantesanuladosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados(),comprobantesanuladosLogic.getComprobantesAnuladoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comprobantesanuladosReturnGeneral.getComprobantesAnulados(),this.comprobantesanuladoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComprobantesAnulados.repaint();
				
				//((AbstractTableModel) this.jTableDatosComprobantesAnulados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComprobantesAnulados();
			}
		}
	}
	
	public void actualizarVisualTableDatosComprobantesAnulados() throws Exception {
		
		ComprobantesAnuladosModel comprobantesanuladosModel=(ComprobantesAnuladosModel)this.jTableDatosComprobantesAnulados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantesanuladosModel.comprobantesanuladoss=this.comprobantesanuladosLogic.getComprobantesAnuladoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comprobantesanuladosModel.comprobantesanuladoss=this.comprobantesanuladoss;
		}
		
		
		((ComprobantesAnuladosModel) this.jTableDatosComprobantesAnulados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComprobantesAnulados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomprobantesanuladosAnterior(),this.comprobantesanuladosLogic.getComprobantesAnuladoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomprobantesanuladosAnterior(),this.comprobantesanuladoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComprobantesAnulados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComprobantesAnulados(ComprobantesAnulados comprobantesanulados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
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
										
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantesanulados,new Object(),generalEntityParameterGeneral,this.comprobantesanuladosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComprobantesAnuladosConstantesFunciones.getClassesRelationshipsOfComprobantesAnulados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComprobantesAnuladosConstantesFunciones.getClassesRelationshipsFromStringsOfComprobantesAnulados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComprobantesAnulados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComprobantesAnuladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantesanulados,new Object(),generalEntityParameterGeneral,this.comprobantesanuladosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComprobantesAnulados(ComprobantesAnuladosBean comprobantesanuladosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComprobantesAnulados(ArrayList<Classe> classes,ComprobantesAnuladosReturnGeneral comprobantesanuladosReturnGeneral,ComprobantesAnuladosBean comprobantesanuladosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComprobantesAnulados(ComprobantesAnulados comprobantesanulados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comprobantesanulados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComprobantesAnulados = new ComprobantesAnuladosDetalleFormJInternalFrame(jDesktopPane,this.comprobantesanuladosSessionBean.getConGuardarRelaciones(),this.comprobantesanuladosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.setVisible(false);
		this.jInternalFrameDetalleFormComprobantesAnulados.setSelected(false);						
		
		this.jInternalFrameDetalleFormComprobantesAnulados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComprobantesAnulados.comprobantesanuladosLogic=this.comprobantesanuladosLogic;
		
		this.cargarCombosFrameForeignKeyComprobantesAnulados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobantesAnulados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobantesAnulados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComprobantesAnulados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComprobantesAnulados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComprobantesAnulados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobantesAnulados"));
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ModificarComprobantesAnulados"));

		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobantesAnulados"));
					
		this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemModificarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobantesAnulados"));		
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"ActualizarComprobantesAnulados"));
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobantesAnulados"));
						
		this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemActualizarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobantesAnulados"));		
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"EliminarComprobantesAnulados"));
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobantesAnulados"));
								
		this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemEliminarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobantesAnulados"));		
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CancelarComprobantesAnulados"));
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobantesAnulados"));
					
		this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemCancelarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobantesAnulados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemDetalleCerrarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobantesAnulados"));		
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobantesAnulados"));
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobantesAnulados"));
		
		
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobantesAnulados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonidComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"idComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayorComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_desdeComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_hastaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonuser_name_usuarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_moduloComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonbeneficiarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondetalleComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"detalleComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emisionComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayor_datoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayor_datoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondebito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncredito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableComprobantesAnuladosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobantesAnulados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComprobantesAnulados"));
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobantesAnulados"));
		}
		
		this.jTableDatosComprobantesAnulados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComprobantesAnulados"));
		
		this.jTableDatosComprobantesAnulados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComprobantesAnulados"));
		
		this.jButtonNuevoComprobantesAnulados.addActionListener(new ButtonActionListener(this,"NuevoComprobantesAnulados"));
		
		this.jButtonDuplicarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"DuplicarComprobantesAnulados"));
		
		this.jButtonCopiarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"CopiarComprobantesAnulados"));
		
		this.jButtonVerFormComprobantesAnulados.addActionListener(new ButtonActionListener(this,"VerFormComprobantesAnulados"));
		
		
		this.jButtonNuevoToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"NuevoToolBarComprobantesAnulados"));
			
		this.jButtonDuplicarToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComprobantesAnulados"));
			
		this.jMenuItemNuevoComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComprobantesAnulados"));
			
		this.jMenuItemDuplicarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComprobantesAnulados"));		
		
		
		this.jButtonNuevoRelacionesComprobantesAnulados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComprobantesAnulados"));
		
		
		this.jButtonNuevoRelacionesToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComprobantesAnulados"));
			
		this.jMenuItemNuevoRelacionesComprobantesAnulados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComprobantesAnulados"));		
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ModificarComprobantesAnulados"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonModificarToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobantesAnulados"));
			
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemModificarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobantesAnulados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"ActualizarComprobantesAnulados"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonActualizarToolBarComprobantesAnulados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobantesAnulados"));
				
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemActualizarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobantesAnulados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"EliminarComprobantesAnulados"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonEliminarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobantesAnulados"));
						
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemEliminarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobantesAnulados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CancelarComprobantesAnulados"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonCancelarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobantesAnulados"));
			
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemCancelarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobantesAnulados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComprobantesAnulados"));		
		
		
		this.jButtonCerrarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CerrarComprobantesAnulados"));
		
		
		this.jButtonCerrarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CerrarToolBarComprobantesAnulados"));
			
		this.jMenuItemCerrarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComprobantesAnulados"));
			
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jMenuItemDetalleCerrarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobantesAnulados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosComprobantesAnulados"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobantesAnulados"));
		}
		
		this.jButtonCopiarToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CopiarToolBarComprobantesAnulados"));
			
		this.jButtonVerFormToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"VerFormToolBarComprobantesAnulados"));
		
		this.jMenuItemGuardarCambiosComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComprobantesAnulados"));
			
		this.jMenuItemCopiarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComprobantesAnulados"));		
		
		this.jMenuItemVerFormComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComprobantesAnulados"));		
		
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobantesAnulados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComprobantesAnulados"));
			
		this.jMenuItemGuardarCambiosTablaComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobantesAnulados"));		
		
		
		
		this.jButtonRecargarInformacionComprobantesAnulados.addActionListener (new ButtonActionListener(this,"RecargarInformacionComprobantesAnulados"));
					
		this.jButtonRecargarInformacionToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComprobantesAnulados"));
		
		this.jMenuItemRecargarInformacionComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComprobantesAnulados"));		
		
		
		
		this.jButtonAnterioresComprobantesAnulados.addActionListener (new ButtonActionListener(this,"AnterioresComprobantesAnulados"));
		
		
		this.jButtonAnterioresToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComprobantesAnulados"));
		
		this.jMenuItemAnterioresComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComprobantesAnulados"));		
		
		
		this.jButtonSiguientesComprobantesAnulados.addActionListener (new ButtonActionListener(this,"SiguientesComprobantesAnulados"));
		
		
		this.jButtonSiguientesToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComprobantesAnulados"));
			
		this.jMenuItemSiguientesComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComprobantesAnulados"));
			
		this.jMenuItemAbrirOrderByComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComprobantesAnulados"));
			
		this.jMenuItemMostrarOcultarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComprobantesAnulados"));
			
		this.jMenuItemDetalleAbrirOrderByComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComprobantesAnulados"));
			
		this.jMenuItemDetalleMostarOcultarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComprobantesAnulados"));		
		
		
		this.jButtonNuevoGuardarCambiosComprobantesAnulados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComprobantesAnulados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComprobantesAnulados"));
			
		this.jMenuItemNuevoGuardarCambiosComprobantesAnulados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComprobantesAnulados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComprobantesAnulados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComprobantesAnulados"));

		this.jCheckBoxSeleccionadosComprobantesAnulados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComprobantesAnulados"));
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobantesAnulados"));
		}
		
		
		this.jComboBoxTiposRelacionesComprobantesAnulados.addActionListener (new ButtonActionListener(this,"TiposRelacionesComprobantesAnulados"));
			
		this.jComboBoxTiposAccionesComprobantesAnulados.addActionListener (new ButtonActionListener(this,"TiposAccionesComprobantesAnulados"));
					
		this.jComboBoxTiposSeleccionarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComprobantesAnulados"));
			
		this.jTextFieldValorCampoGeneralComprobantesAnulados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComprobantesAnulados"));		
		
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonidComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"idComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayorComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_desdeComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_hastaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonuser_name_usuarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_moduloComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonbeneficiarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondetalleComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"detalleComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emisionComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayor_datoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayor_datoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondebito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncredito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableComprobantesAnuladosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados.addActionListener(new ButtonActionListener(this,"BusquedaComprobantesAnuladosComprobantesAnulados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComprobantesAnulados!=null) {
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobantesAnulados"));
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobantesAnulados"));
				this.jInternalFrameReporteDinamicoComprobantesAnulados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobantesAnulados"));
			}
			
			//this.jButtonCerrarReporteDinamicoComprobantesAnulados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobantesAnulados"));				
			//this.jButtonGenerarReporteDinamicoComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobantesAnulados"));
			//this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobantesAnulados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComprobantesAnulados!=null) {
				this.jInternalFrameImportacionComprobantesAnulados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobantesAnulados"));
				this.jInternalFrameImportacionComprobantesAnulados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobantesAnulados"));
				this.jInternalFrameImportacionComprobantesAnulados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobantesAnulados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComprobantesAnulados.addActionListener (new ButtonActionListener(this,"AbrirOrderByComprobantesAnulados"));
			
			this.jButtonAbrirOrderByToolBarComprobantesAnulados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComprobantesAnulados"));			
			
			if(this.jInternalFrameOrderByComprobantesAnulados!=null) {
				this.jInternalFrameOrderByComprobantesAnulados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobantesAnulados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobantesAnulados.jTabbedPaneRelacionesComprobantesAnulados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobantesAnulados"));
		
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
            		closingInternalFrameComprobantesAnulados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComprobantesAnulados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComprobantesAnulados = (JInternalFrameBase)event.getSource();
	            	
	            ComprobantesAnuladosBeanSwingJInternalFrame jInternalFrameParent=(ComprobantesAnuladosBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobantesAnulados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComprobantesAnuladosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComprobantesAnulados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComprobantesAnuladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComprobantesAnulados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComprobantesAnulados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComprobantesAnulados";
		inputMap = this.jButtonNuevoComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComprobantesAnulados";
		inputMap = this.jButtonNuevoRelacionesComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobantesAnuladosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComprobantesAnulados";
		inputMap = this.jButtonModificarComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComprobantesAnulados";
		inputMap = this.jButtonActualizarComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComprobantesAnulados";
		inputMap = this.jButtonEliminarComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComprobantesAnulados";
		inputMap = this.jButtonCancelarComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComprobantesAnulados";
		inputMap = this.jButtonCerrarComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComprobantesAnulados";
		inputMap = this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonGuardarCambiosComprobantesAnulados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComprobantesAnuladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComprobantesAnulados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComprobantesAnuladosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComprobantesAnulados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComprobantesAnuladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComprobantesAnulados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComprobantesAnuladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComprobantesAnulados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComprobantesAnuladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonidComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"idComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_empresaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_sucursalComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_ejercicioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_documentoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documentoComprobantesAnuladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonid_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayorComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_desdeComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emision_hastaComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonuser_name_usuarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"user_name_usuarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_moduloComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_moduloComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonbeneficiarioComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondetalleComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"detalleComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonfecha_emisionComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_tipo_movimientoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_tipo_movimientoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnumero_mayor_datoComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayor_datoComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtonnombre_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cuenta_contableComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtondebito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"debito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncredito_localComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"credito_localComprobantesAnuladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobantesAnulados.jButtoncodigo_cuenta_contableComprobantesAnuladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cuenta_contableComprobantesAnuladosBusqueda"));
		
		
		this.jButtonBusquedaComprobantesAnuladosComprobantesAnulados.addActionListener(new ButtonActionListener(this,"BusquedaComprobantesAnuladosComprobantesAnulados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComprobantesAnulados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComprobantesAnuladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComprobantesAnuladosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComprobantesAnulados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComprobantesAnulados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
					comprobantesanuladosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladoss) {
					comprobantesanuladosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComprobantesAnuladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
						comprobantesanuladosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladoss) {
						comprobantesanuladosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobantesAnulados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobantesAnulados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComprobantesAnuladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComprobantesAnulados.getSelectedRows();
			
			ComprobantesAnulados comprobantesanuladosLocal=new ComprobantesAnulados();
			
			//this.seleccionarTodosComprobantesAnulados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comprobantesanuladosLocal =(ComprobantesAnulados) this.comprobantesanuladosLogic.getComprobantesAnuladoss().toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comprobantesanuladosLocal =(ComprobantesAnulados) this.comprobantesanuladoss.toArray()[this.jTableDatosComprobantesAnulados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comprobantesanuladosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
						comprobantesanuladosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladoss) {
						comprobantesanuladosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobantesAnulados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobantesAnulados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobantesAnulados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComprobantesAnuladosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComprobantesAnuladosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComprobantesAnuladosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComprobantesAnulados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladosLogic.getComprobantesAnuladoss()) {
				
						if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							comprobantesanuladosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
							existe=true;
							comprobantesanuladosAux.setuser_name_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							comprobantesanuladosAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							comprobantesanuladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							comprobantesanuladosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							comprobantesanuladosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							comprobantesanuladosAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO)) {
							existe=true;
							comprobantesanuladosAux.setnumero_mayor_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							comprobantesanuladosAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							comprobantesanuladosAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							comprobantesanuladosAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							comprobantesanuladosAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladoss) {
					
						if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							comprobantesanuladosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
							existe=true;
							comprobantesanuladosAux.setuser_name_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO)) {
							existe=true;
							comprobantesanuladosAux.setnombre_modulo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							comprobantesanuladosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							comprobantesanuladosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							comprobantesanuladosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							comprobantesanuladosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
							existe=true;
							comprobantesanuladosAux.setcodigo_tipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO)) {
							existe=true;
							comprobantesanuladosAux.setnumero_mayor_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
							existe=true;
							comprobantesanuladosAux.setnombre_cuenta_contable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL)) {
							existe=true;
							comprobantesanuladosAux.setdebito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL)) {
							existe=true;
							comprobantesanuladosAux.setcredito_local(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
							existe=true;
							comprobantesanuladosAux.setcodigo_cuenta_contable(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComprobantesAnuladosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComprobantesAnulados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComprobantesAnulados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComprobantesAnulados) {				
					conSplash=true;//false;										
					
					//this.startProcessComprobantesAnulados(conSplash);
				
					this.generarReporteComprobantesAnuladossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComprobantesAnuladossSeleccionados();
				//this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobantesAnuladossSeleccionados(false);
				//this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobantesAnuladossSeleccionados(true);
				//this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobantesAnulados();
				
				this.exportarComprobantesAnuladossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComprobantesAnuladoss();
				//this.importarComprobantesAnuladoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobantesAnulados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComprobantesAnuladossSeleccionados();
				//this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comprobantes Anulados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComprobantesAnulados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComprobantesAnulados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComprobantesAnulados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
				}	
			} 			
			else if(ComprobantesAnuladosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComprobantesAnulados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComprobantesAnulados(conSplash);
					
						//this.actualizarParametrosGeneralComprobantesAnulados();
						
						this.generarReporteProcesoAccionComprobantesAnuladossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComprobantesAnuladosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comprobantes AnuladosES SELECCIONADOS?", "MANTENIMIENTO DE Comprobantes Anulados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComprobantesAnulados();
				
						this.actualizarParametrosGeneralComprobantesAnulados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comprobantesanuladosReturnGeneral=comprobantesanuladosLogic.procesarAccionComprobantesAnuladossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comprobantesanuladosLogic.getComprobantesAnuladoss(),this.comprobantesanuladosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComprobantesAnuladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComprobantesAnulados();
					
					ComprobantesAnuladosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComprobantesAnuladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobantesAnulados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxTiposAccionesFormularioComprobantesAnulados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComprobantesAnulados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComprobantesAnuladosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComprobantesAnulados();
			
			if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
			ComprobantesAnulados comprobantesanulados=new ComprobantesAnulados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComprobantesAnulados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComprobantesAnulados.getSelectedItem();
			
			
			
			
			comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
			//this.sTipoAccion;
			
			if(comprobantesanuladossSeleccionados.size()==1) {
				for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
					comprobantesanulados=comprobantesanuladosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComprobantesAnulados();
			
      		//this.finishProcessComprobantesAnulados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComprobantesAnuladosReturnGeneral() throws Exception {
		if(this.comprobantesanuladosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comprobantesanuladosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comprobantesanuladosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comprobantesanuladosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comprobantesanuladosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comprobantesanuladosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComprobantesAnulados(false);
		}
		
		if(this.comprobantesanuladosReturnGeneral.getConRetornoLista() || this.comprobantesanuladosReturnGeneral.getConRetornoObjeto()) {
			if(this.comprobantesanuladosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comprobantesanuladosLogic.setComprobantesAnuladoss(this.comprobantesanuladosReturnGeneral.getComprobantesAnuladoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComprobantesAnulados(false);
		}
	}
	
	public void actualizarParametrosGeneralComprobantesAnulados() throws Exception {
		
		
	}
	
	public ArrayList<ComprobantesAnulados> getComprobantesAnuladossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComprobantesAnulados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladosLogic.getComprobantesAnuladoss()) {
					if(comprobantesanuladosAux.getIsSelected()) {
						comprobantesanuladossSeleccionados.add(comprobantesanuladosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobantesAnulados comprobantesanuladosAux:this.comprobantesanuladoss) {
					if(comprobantesanuladosAux.getIsSelected()) {
						comprobantesanuladossSeleccionados.add(comprobantesanuladosAux);				
					}
				}
			}
			
			if(comprobantesanuladossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comprobantesanuladossSeleccionados.addAll(this.comprobantesanuladosLogic.getComprobantesAnuladoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comprobantesanuladossSeleccionados.addAll(this.comprobantesanuladoss);				
					}
				}
			}
		} else {
			comprobantesanuladossSeleccionados.add(this.comprobantesanulados);
		}
		
		return comprobantesanuladossSeleccionados;
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
	
	public void generarReporteComprobantesAnuladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComprobantesAnuladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComprobantesAnuladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobantesAnuladossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobantesAnuladossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comprobantes Anulados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados);
		
	}	
	
	public void generarReporteNormalComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComprobantesAnuladossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComprobantesAnulados();
		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComprobantesAnulados();
		
		
		//this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados ,comprobantesanuladosImplementable,comprobantesanuladosImplementableHome);
	}
	
	public void mostrarImportacionComprobantesAnuladoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComprobantesAnulados();
		
		this.abrirFrameImportacionComprobantesAnulados();		
		
			
		//this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados ,comprobantesanuladosImplementable,comprobantesanuladosImplementableHome);
	}
	
	public void importarComprobantesAnuladoss() throws Exception {		
	
	}
	
	public void exportarComprobantesAnuladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComprobantesAnuladossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComprobantesAnuladossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComprobantesAnuladossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comprobantes Anulados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComprobantesAnulados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComprobantesAnulados(comprobantesanuladosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comprobantesanuladosAux.setsDetalleGeneralEntityReporte(comprobantesanuladosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComprobantesAnulados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComprobantesAnulados(ComprobantesAnulados comprobantesanulados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comprobantesanulados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.gettipodocumento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getuser_name_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getnombre_modulo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getcodigo_tipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getnumero_mayor_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getnombre_cuenta_contable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getdebito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getcredito_local().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantesanulados.getcodigo_cuenta_contable();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComprobantesAnuladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComprobantesAnulados(row);				
				iRow++;
			}				
			
			for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComprobantesAnulados(comprobantesanuladosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComprobantesAnuladossSeleccionados() throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();		
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantesanulados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comprobantesanuladoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comprobantesanulados");
			//elementRoot.appendChild(element);
		
			for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
				element = document.createElement("comprobantesanulados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComprobantesAnulados(comprobantesanuladosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobantes Anulados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComprobantesAnulados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_DEBITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CREDITOLOCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComprobantesAnulados(ComprobantesAnulados comprobantesanulados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.gettipodocumento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getuser_name_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getnombre_modulo());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getcodigo_tipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getnumero_mayor_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getnombre_cuenta_contable());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getdebito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getcredito_local());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantesanulados.getcodigo_cuenta_contable());				
	}
	
	public void setFilaDatosExportarXmlComprobantesAnulados(ComprobantesAnulados comprobantesanulados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComprobantesAnuladosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comprobantesanulados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComprobantesAnuladosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comprobantesanulados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComprobantesAnuladosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comprobantesanulados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ComprobantesAnuladosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(comprobantesanulados.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(ComprobantesAnuladosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(comprobantesanulados.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipodocumento_descripcion = document.createElement(ComprobantesAnuladosConstantesFunciones.IDTIPODOCUMENTO);
		elementtipodocumento_descripcion.appendChild(document.createTextNode(comprobantesanulados.gettipodocumento_descripcion()));
		element.appendChild(elementtipodocumento_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(ComprobantesAnuladosConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(comprobantesanulados.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementnumero_mayor = document.createElement(ComprobantesAnuladosConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(comprobantesanulados.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementfecha_emision_desde = document.createElement(ComprobantesAnuladosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(comprobantesanulados.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(ComprobantesAnuladosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(comprobantesanulados.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementuser_name_usuario = document.createElement(ComprobantesAnuladosConstantesFunciones.USERNAMEUSUARIO);
		elementuser_name_usuario.appendChild(document.createTextNode(comprobantesanulados.getuser_name_usuario().trim()));
		element.appendChild(elementuser_name_usuario);

		Element elementnombre_modulo = document.createElement(ComprobantesAnuladosConstantesFunciones.NOMBREMODULO);
		elementnombre_modulo.appendChild(document.createTextNode(comprobantesanulados.getnombre_modulo().trim()));
		element.appendChild(elementnombre_modulo);

		Element elementcodigo = document.createElement(ComprobantesAnuladosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(comprobantesanulados.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementbeneficiario = document.createElement(ComprobantesAnuladosConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(comprobantesanulados.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementdetalle = document.createElement(ComprobantesAnuladosConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(comprobantesanulados.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementfecha_emision = document.createElement(ComprobantesAnuladosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(comprobantesanulados.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementcodigo_tipo_movimiento = document.createElement(ComprobantesAnuladosConstantesFunciones.CODIGOTIPOMOVIMIENTO);
		elementcodigo_tipo_movimiento.appendChild(document.createTextNode(comprobantesanulados.getcodigo_tipo_movimiento().trim()));
		element.appendChild(elementcodigo_tipo_movimiento);

		Element elementnumero_mayor_dato = document.createElement(ComprobantesAnuladosConstantesFunciones.NUMEROMAYORDATO);
		elementnumero_mayor_dato.appendChild(document.createTextNode(comprobantesanulados.getnumero_mayor_dato().trim()));
		element.appendChild(elementnumero_mayor_dato);

		Element elementnombre_cuenta_contable = document.createElement(ComprobantesAnuladosConstantesFunciones.NOMBRECUENTACONTABLE);
		elementnombre_cuenta_contable.appendChild(document.createTextNode(comprobantesanulados.getnombre_cuenta_contable().trim()));
		element.appendChild(elementnombre_cuenta_contable);

		Element elementdebito_local = document.createElement(ComprobantesAnuladosConstantesFunciones.DEBITOLOCAL);
		elementdebito_local.appendChild(document.createTextNode(comprobantesanulados.getdebito_local().toString().trim()));
		element.appendChild(elementdebito_local);

		Element elementcredito_local = document.createElement(ComprobantesAnuladosConstantesFunciones.CREDITOLOCAL);
		elementcredito_local.appendChild(document.createTextNode(comprobantesanulados.getcredito_local().toString().trim()));
		element.appendChild(elementcredito_local);

		Element elementcodigo_cuenta_contable = document.createElement(ComprobantesAnuladosConstantesFunciones.CODIGOCUENTACONTABLE);
		elementcodigo_cuenta_contable.appendChild(document.createTextNode(comprobantesanulados.getcodigo_cuenta_contable().trim()));
		element.appendChild(elementcodigo_cuenta_contable);
	}
	
	public void generarReporteGroupGenericoComprobantesAnuladossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados=new ArrayList<ComprobantesAnulados>();
		
		comprobantesanuladossSeleccionados=this.getComprobantesAnuladossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComprobantesAnulados(comprobantesanuladossSeleccionados);
		
		this.generarReporteComprobantesAnuladoss("Todos",comprobantesanuladossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComprobantesAnulados(ArrayList<ComprobantesAnulados> comprobantesanuladossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComprobantesAnulados comprobantesanuladosAux:comprobantesanuladossSeleccionados) {
				comprobantesanuladosAux.setsDetalleGeneralEntityReporte(comprobantesanuladosAux.toString());
			
				if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPODOCUMENTO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.gettipodocumento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantesanuladosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantesanuladosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_USERNAMEUSUARIO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getuser_name_usuario());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBREMODULO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getnombre_modulo());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantesanuladosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOTIPOMOVIMIENTO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getcodigo_tipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NUMEROMAYORDATO)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getnumero_mayor_dato());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_NOMBRECUENTACONTABLE)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getnombre_cuenta_contable());
				}
				 else if(sTipoSeleccionar.equals(ComprobantesAnuladosConstantesFunciones.LABEL_CODIGOCUENTACONTABLE)) {
					existe=true;
					comprobantesanuladosAux.setsDescripcionGeneralEntityReporte1(comprobantesanuladosAux.getcodigo_cuenta_contable());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobantesAnuladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComprobantesAnulados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComprobantesAnulados=true;
				this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=true;
				this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=true;
			}
			
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=true;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=true;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=true;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=true;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=true;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=true;
			this.isVisibilidadCeldaModificarComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
			this.isVisibilidadCeldaModificarComprobantesAnulados=true;
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
			this.isVisibilidadCeldaCancelarComprobantesAnulados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComprobantesAnuladosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComprobantesAnulados=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=true;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=true;
		} else {
			this.actualizarEstadoPanelsComprobantesAnulados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComprobantesAnulados=false;
			//this.isVisibilidadCeldaVerFormComprobantesAnulados=false;
			this.isVisibilidadCeldaDuplicarComprobantesAnulados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comprobantesanuladosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
		} else {
			this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
			this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			if(!comprobantesanuladosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;												
			}
			
			this.jButtonCerrarComprobantesAnulados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
		}
		
		if(!this.permiteMantenimiento(this.comprobantesanulados)) {
			this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
			this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComprobantesAnulados=false;
		this.isVisibilidadCeldaNuevoRelacionesComprobantesAnulados=false;
		this.isVisibilidadCeldaGuardarCambiosComprobantesAnulados=false;
		//this.isVisibilidadCeldaModificarComprobantesAnulados=true;
		this.isVisibilidadCeldaActualizarComprobantesAnulados=false;
		this.isVisibilidadCeldaEliminarComprobantesAnulados=false;
		//this.isVisibilidadCeldaCancelarComprobantesAnulados=true;			
		this.isVisibilidadCeldaGuardarComprobantesAnulados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComprobantesAnulados() {
	}
	
	public void actualizarEstadoPanelsComprobantesAnulados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComprobantesAnulados!=null) {
				this.jScrollPanelDatosEdicionComprobantesAnulados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobantesAnulados!=null) {
				this.jScrollPanelDatosComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobantesAnulados!=null) {
				this.jPanelPaginacionComprobantesAnulados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
					this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comprobantesanuladosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobantesAnulados!=null) {
				this.jTabbedPaneBusquedasComprobantesAnulados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComprobantesAnulados!=null) {
				this.jPanelParametrosReportesComprobantesAnulados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComprobantesAnulados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComprobantesAnulados) {this.jTabbedPaneBusquedasComprobantesAnulados.remove(jPanelBusquedaComprobantesAnuladosComprobantesAnulados);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaComprobantesAnulados=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaComprobantesAnulados) {this.jTabbedPaneBusquedasComprobantesAnulados.remove(jPanelBusquedaComprobantesAnuladosComprobantesAnulados);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaComprobantesAnulados=isParaEjercicio;
			if(!this.isVisibilidadBusquedaComprobantesAnulados) {this.jTabbedPaneBusquedasComprobantesAnulados.remove(jPanelBusquedaComprobantesAnuladosComprobantesAnulados);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumento(Boolean isParaTipoDocumento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoNegation=!isParaTipoDocumento;

			this.isVisibilidadBusquedaComprobantesAnulados=isParaTipoDocumento;
			if(!this.isVisibilidadBusquedaComprobantesAnulados) {this.jTabbedPaneBusquedasComprobantesAnulados.remove(jPanelBusquedaComprobantesAnuladosComprobantesAnulados);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaComprobantesAnulados=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaComprobantesAnulados) {this.jTabbedPaneBusquedasComprobantesAnulados.remove(jPanelBusquedaComprobantesAnuladosComprobantesAnulados);}
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
			
			this.inicializarActualizarBindingTablaComprobantesAnulados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComprobantesAnulados() {
		this.updateBorderResaltarBusquedasFormularioComprobantesAnulados();
		this.updateVisibilidadBusquedasFormularioComprobantesAnulados();
		this.updateHabilitarBusquedasFormularioComprobantesAnulados();
	}
	
	public void updateBorderResaltarBusquedasFormularioComprobantesAnulados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComprobantesAnulados.getComponents().length>0) {
	

		if(this.comprobantesanuladosConstantesFunciones.resaltarBusquedaComprobantesAnuladosComprobantesAnulados!=null) {
			index= this.jTabbedPaneBusquedasComprobantesAnulados.indexOfComponent(this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobantesAnulados.getComponent(index);
				jPanel.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarBusquedaComprobantesAnuladosComprobantesAnulados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComprobantesAnulados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComprobantesAnulados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobantesAnulados.indexOfComponent(this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComprobantesAnulados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarBusquedaComprobantesAnuladosComprobantesAnulados);
			if(!this.comprobantesanuladosConstantesFunciones.mostrarBusquedaComprobantesAnuladosComprobantesAnulados && index>-1) {
				this.jTabbedPaneBusquedasComprobantesAnulados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComprobantesAnulados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComprobantesAnulados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobantesAnulados.indexOfComponent(this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComprobantesAnulados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comprobantesanuladosConstantesFunciones.activarBusquedaComprobantesAnuladosComprobantesAnulados);
				this.jTabbedPaneBusquedasComprobantesAnulados.setEnabledAt(index,this.comprobantesanuladosConstantesFunciones.activarBusquedaComprobantesAnuladosComprobantesAnulados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComprobantesAnulados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComprobantesAnulados")) {
			index= this.jTabbedPaneBusquedasComprobantesAnulados.indexOfComponent(this.jPanelBusquedaComprobantesAnuladosComprobantesAnulados);

			this.jTabbedPaneBusquedasComprobantesAnulados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobantesAnulados.getComponent(index);

			this.comprobantesanuladosConstantesFunciones.setResaltarBusquedaComprobantesAnuladosComprobantesAnulados(resaltar);

			jPanel.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarBusquedaComprobantesAnuladosComprobantesAnulados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComprobantesAnulados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComprobantesAnulados() throws Exception {

		if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComprobantesAnulados();
		this.updateVisibilidadResaltarControlesFormularioComprobantesAnulados();
		this.updateHabilitarResaltarControlesFormularioComprobantesAnulados();
		
	}
	
	public void updateBorderResaltarControlesFormularioComprobantesAnulados() throws Exception {
		if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comprobantesanuladosConstantesFunciones.resaltaridComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltaridComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarid_empresaComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarid_empresaComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarid_sucursalComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarid_sucursalComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarid_ejercicioComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarid_ejercicioComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarid_tipo_documentoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarid_tipo_documentoComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarid_tipo_movimientoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarid_tipo_movimientoComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayorComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayorComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayorComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emision_desdeComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_desdeComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emision_desdeComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emision_hastaComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_hastaComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emision_hastaComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltaruser_name_usuarioComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltaruser_name_usuarioComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarnombre_moduloComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarnombre_moduloComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarcodigoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarcodigoComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarbeneficiarioComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarbeneficiarioComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltardetalleComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltardetalleComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emisionComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarfecha_emisionComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_tipo_movimientoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_tipo_movimientoComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayor_datoComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarnumero_mayor_datoComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarnombre_cuenta_contableComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarnombre_cuenta_contableComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltardebito_localComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltardebito_localComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarcredito_localComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarcredito_localComprobantesAnulados);}
		if(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_cuenta_contableComprobantesAnulados!=null && this.jInternalFrameDetalleFormComprobantesAnulados!=null) {this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setBorder(this.comprobantesanuladosConstantesFunciones.resaltarcodigo_cuenta_contableComprobantesAnulados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComprobantesAnulados() throws Exception {		
		if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
	
		//this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostraridComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelidComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostraridComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_empresaComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelid_empresaComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_empresaComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_sucursalComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelid_sucursalComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_sucursalComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_ejercicioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelid_ejercicioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_ejercicioComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_tipo_documentoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelid_tipo_documentoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_tipo_documentoComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_tipo_movimientoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelid_tipo_movimientoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarid_tipo_movimientoComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayorComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnumero_mayorComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelnumero_mayorComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnumero_mayorComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_desdeComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emision_desdeComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelfecha_emision_desdeComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emision_desdeComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_hastaComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emision_hastaComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelfecha_emision_hastaComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emision_hastaComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostraruser_name_usuarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPaneluser_name_usuarioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostraruser_name_usuarioComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnombre_moduloComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelnombre_moduloComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnombre_moduloComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelcodigoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigoComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarbeneficiarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelbeneficiarioComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarbeneficiarioComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrardetalleComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPaneldetalleComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrardetalleComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emisionComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelfecha_emisionComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarfecha_emisionComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_tipo_movimientoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelcodigo_tipo_movimientoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_tipo_movimientoComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnumero_mayor_datoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelnumero_mayor_datoComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnumero_mayor_datoComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnombre_cuenta_contableComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelnombre_cuenta_contableComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarnombre_cuenta_contableComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrardebito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPaneldebito_localComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrardebito_localComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcredito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelcredito_localComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcredito_localComprobantesAnulados);
		//this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_cuenta_contableComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jPanelcodigo_cuenta_contableComprobantesAnulados.setVisible(this.comprobantesanuladosConstantesFunciones.mostrarcodigo_cuenta_contableComprobantesAnulados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComprobantesAnulados() throws Exception {
		if(this.jInternalFrameDetalleFormComprobantesAnulados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobantesAnulados!=null) {
	
		this.jInternalFrameDetalleFormComprobantesAnulados.jLabelidComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activaridComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_empresaComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarid_empresaComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_sucursalComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarid_sucursalComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_ejercicioComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarid_ejercicioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_documentoComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarid_tipo_documentoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jComboBoxid_tipo_movimientoComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarid_tipo_movimientoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayorComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarnumero_mayorComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_desdeComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarfecha_emision_desdeComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emision_hastaComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarfecha_emision_hastaComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielduser_name_usuarioComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activaruser_name_usuarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_moduloComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarnombre_moduloComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigoComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarcodigoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreabeneficiarioComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarbeneficiarioComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreadetalleComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activardetalleComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jDateChooserfecha_emisionComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarfecha_emisionComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_tipo_movimientoComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarcodigo_tipo_movimientoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanumero_mayor_datoComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarnumero_mayor_datoComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextAreanombre_cuenta_contableComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarnombre_cuenta_contableComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFielddebito_localComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activardebito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcredito_localComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarcredito_localComprobantesAnulados);
		this.jInternalFrameDetalleFormComprobantesAnulados.jTextFieldcodigo_cuenta_contableComprobantesAnulados.setEnabled(this.comprobantesanuladosConstantesFunciones.activarcodigo_cuenta_contableComprobantesAnulados);
		}
	}
	
		
}