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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.tesoreria.util.ListadosDocumentosConstantesFunciones;
import com.bydan.erp.tesoreria.util.report.ListadosDocumentosParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.report.ListadosDocumentosParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.report.ListadosDocumentosBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.tesoreria.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.tesoreria.util.*;

import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.report.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;

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
public class ListadosDocumentosBeanSwingJInternalFrame extends ListadosDocumentosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ListadosDocumentosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ListadosDocumentos> listadosdocumentosValidator = new ClassValidator<ListadosDocumentos>(ListadosDocumentos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ListadosDocumentos listadosdocumentos;	
	public ListadosDocumentos listadosdocumentosAux;
	public ListadosDocumentos listadosdocumentosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ListadosDocumentos listadosdocumentosTotales;
	public Long idListadosDocumentosActual;
	public Long iIdNuevoListadosDocumentos=0L;
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
	
	public Boolean isPermisoTodoListadosDocumentos;
	public Boolean isPermisoNuevoListadosDocumentos;
	public Boolean isPermisoActualizarListadosDocumentos;
	public Boolean isPermisoActualizarOriginalListadosDocumentos;
	public Boolean isPermisoEliminarListadosDocumentos;
	public Boolean isPermisoGuardarCambiosListadosDocumentos;
	public Boolean isPermisoConsultaListadosDocumentos;
	public Boolean isPermisoBusquedaListadosDocumentos;
	public Boolean isPermisoReporteListadosDocumentos;
	public Boolean isPermisoPaginacionMedioListadosDocumentos;
	public Boolean isPermisoPaginacionAltoListadosDocumentos;
	public Boolean isPermisoPaginacionTodoListadosDocumentos;
	public Boolean isPermisoCopiarListadosDocumentos;
	public Boolean isPermisoVerFormListadosDocumentos;
	public Boolean isPermisoDuplicarListadosDocumentos;
	public Boolean isPermisoOrdenListadosDocumentos;
	
	
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
	
	public ListadosDocumentosParameterReturnGeneral listadosdocumentosReturnGeneral;
	public ListadosDocumentosParameterReturnGeneral listadosdocumentosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoListadosDocumentos=false;
	public Boolean esParaAccionDesdeFormularioListadosDocumentos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ListadosDocumentosSessionBeanAdditional listadosdocumentosSessionBeanAdditional=null;
	
	public ListadosDocumentosSessionBeanAdditional getListadosDocumentosSessionBeanAdditional() {
		return this.listadosdocumentosSessionBeanAdditional;
	}
	
	public void setListadosDocumentosSessionBeanAdditional(ListadosDocumentosSessionBeanAdditional listadosdocumentosSessionBeanAdditional) {
		try {
			this.listadosdocumentosSessionBeanAdditional=listadosdocumentosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ListadosDocumentosBeanSwingJInternalFrameAdditional listadosdocumentosBeanSwingJInternalFrameAdditional=null;
	//public class ListadosDocumentosBeanSwingJInternalFrame
	
	public ListadosDocumentosBeanSwingJInternalFrameAdditional getListadosDocumentosBeanSwingJInternalFrameAdditional() {
		return this.listadosdocumentosBeanSwingJInternalFrameAdditional;
	}
	
	public void setListadosDocumentosBeanSwingJInternalFrameAdditional(ListadosDocumentosBeanSwingJInternalFrameAdditional listadosdocumentosBeanSwingJInternalFrameAdditional) {
		try {
			this.listadosdocumentosBeanSwingJInternalFrameAdditional=listadosdocumentosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ListadosDocumentosLogic listadosdocumentosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ListadosDocumentos listadosdocumentosBean;
	public ListadosDocumentosConstantesFunciones listadosdocumentosConstantesFunciones;
	//public ListadosDocumentosParameterReturnGeneral listadosdocumentosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public TipoMovimientoLogic tipomovimientoLogic;
	
	//PARAMETROS
	
	
	//public List<ListadosDocumentos> listadosdocumentoss;	
	//public List<ListadosDocumentos> listadosdocumentossEliminados;
	//public List<ListadosDocumentos> listadosdocumentossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoListadosDocumentos=false;
	public Boolean isVisibilidadCeldaDuplicarListadosDocumentos=true;
	public Boolean isVisibilidadCeldaCopiarListadosDocumentos=true;
	public Boolean isVisibilidadCeldaVerFormListadosDocumentos=true;
	public Boolean isVisibilidadCeldaOrdenListadosDocumentos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
	public Boolean isVisibilidadCeldaModificarListadosDocumentos=false;
	public Boolean isVisibilidadCeldaActualizarListadosDocumentos=false;
	public Boolean isVisibilidadCeldaEliminarListadosDocumentos=false;
	public Boolean isVisibilidadCeldaCancelarListadosDocumentos=false;
	public Boolean isVisibilidadCeldaGuardarListadosDocumentos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;	
	
	
	public Boolean isVisibilidadBusquedaListadosDocumentos=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoMovimiento=false;
	
	public Long getiIdNuevoListadosDocumentos() {
		return this.iIdNuevoListadosDocumentos;
	}

	public void setiIdNuevoListadosDocumentos(Long iIdNuevoListadosDocumentos) {
		this.iIdNuevoListadosDocumentos = iIdNuevoListadosDocumentos;
	}
	
	public Long getidListadosDocumentosActual() {
		return this.idListadosDocumentosActual;
	}

	public void setidListadosDocumentosActual(Long idListadosDocumentosActual) {
		this.idListadosDocumentosActual = idListadosDocumentosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ListadosDocumentos getlistadosdocumentos() {
		return this.listadosdocumentos;
	}

	public void setlistadosdocumentos(ListadosDocumentos listadosdocumentos) {
		this.listadosdocumentos = listadosdocumentos;
	}
	
	public ListadosDocumentos getlistadosdocumentosAux() {
		return this.listadosdocumentosAux;
	}

	public void setlistadosdocumentosAux(ListadosDocumentos listadosdocumentosAux) {
		this.listadosdocumentosAux = listadosdocumentosAux;
	}				
	
	public ListadosDocumentos getlistadosdocumentosAnterior() {
		return this.listadosdocumentosAnterior;
	}

	public void setlistadosdocumentosAnterior(ListadosDocumentos listadosdocumentosAnterior) {
		this.listadosdocumentosAnterior = listadosdocumentosAnterior;
	}	
	
	public ListadosDocumentos getlistadosdocumentosTotales() {
		return this.listadosdocumentosTotales;
	}

	public void setlistadosdocumentosTotales(ListadosDocumentos listadosdocumentosTotales) {
		this.listadosdocumentosTotales = listadosdocumentosTotales;
	}	
	
	public ListadosDocumentos getlistadosdocumentosBean() {
		return this.listadosdocumentosBean;
	}

	public void setlistadosdocumentosBean(ListadosDocumentos listadosdocumentosBean) {
		this.listadosdocumentosBean = listadosdocumentosBean;
	}	
	
	public ListadosDocumentosParameterReturnGeneral getlistadosdocumentosReturnGeneral() {
		return this.listadosdocumentosReturnGeneral;
	}

	public void setlistadosdocumentosReturnGeneral(ListadosDocumentosParameterReturnGeneral listadosdocumentosReturnGeneral) {
		this.listadosdocumentosReturnGeneral = listadosdocumentosReturnGeneral;
	}	
	
	
	public Long id_ejercicioBusquedaListadosDocumentos=-1L;

	public Long getid_ejercicioBusquedaListadosDocumentos() {
		return this.id_ejercicioBusquedaListadosDocumentos;
	}

	public void setid_ejercicioBusquedaListadosDocumentos(Long id_ejercicioBusquedaListadosDocumentos) {
		this.id_ejercicioBusquedaListadosDocumentos = id_ejercicioBusquedaListadosDocumentos;
	}

;
	public Long id_tipo_movimientoBusquedaListadosDocumentos=-1L;

	public Long getid_tipo_movimientoBusquedaListadosDocumentos() {
		return this.id_tipo_movimientoBusquedaListadosDocumentos;
	}

	public void setid_tipo_movimientoBusquedaListadosDocumentos(Long id_tipo_movimientoBusquedaListadosDocumentos) {
		this.id_tipo_movimientoBusquedaListadosDocumentos = id_tipo_movimientoBusquedaListadosDocumentos;
	}

;
	public Date fecha_desdeBusquedaListadosDocumentos=new Date();

	public Date getfecha_desdeBusquedaListadosDocumentos() {
		return this.fecha_desdeBusquedaListadosDocumentos;
	}

	public void setfecha_desdeBusquedaListadosDocumentos(Date fecha_desdeBusquedaListadosDocumentos) {
		this.fecha_desdeBusquedaListadosDocumentos = fecha_desdeBusquedaListadosDocumentos;
	}

;
	public Date fecha_hastaBusquedaListadosDocumentos=new Date();

	public Date getfecha_hastaBusquedaListadosDocumentos() {
		return this.fecha_hastaBusquedaListadosDocumentos;
	}

	public void setfecha_hastaBusquedaListadosDocumentos(Date fecha_hastaBusquedaListadosDocumentos) {
		this.fecha_hastaBusquedaListadosDocumentos = fecha_hastaBusquedaListadosDocumentos;
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
	
	
	public ListadosDocumentosLogic getListadosDocumentosLogic()	{		
		return listadosdocumentosLogic;
	}

	public void setListadosDocumentosLogic(ListadosDocumentosLogic listadosdocumentosLogic) {
		this.listadosdocumentosLogic = listadosdocumentosLogic;
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
	
	public Boolean getIsEsNuevoListadosDocumentos() {
		return isEsNuevoListadosDocumentos;
	}

	public void setIsEsNuevoListadosDocumentos(Boolean isEsNuevoListadosDocumentos) {
		this.isEsNuevoListadosDocumentos = isEsNuevoListadosDocumentos;
	}

	public Boolean getEsParaAccionDesdeFormularioListadosDocumentos() {
		return esParaAccionDesdeFormularioListadosDocumentos;
	}
	
	public void setEsParaAccionDesdeFormularioListadosDocumentos(Boolean esParaAccionDesdeFormularioListadosDocumentos) {
		this.esParaAccionDesdeFormularioListadosDocumentos = esParaAccionDesdeFormularioListadosDocumentos;
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

			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			}

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(listadosdocumentosSessionBean.getlidEmpresaActual());
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

			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			}

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(listadosdocumentosSessionBean.getlidSucursalActual());
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

			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			}

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(listadosdocumentosSessionBean.getlidEjercicioActual());
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

			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			}

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
					tipomovimientoLogic.getEntityWithConnection(listadosdocumentosSessionBean.getlidTipoMovimientoActual());
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

					if(this.listadosdocumentos!=null) {
						this.listadosdocumentos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaListadosDocumentos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaListadosDocumentosGenerico)throws Exception
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
				jComboBoxid_empresaListadosDocumentosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaListadosDocumentosGenerico!=null && jComboBoxid_empresaListadosDocumentosGenerico.getItemCount()>0) {
					jComboBoxid_empresaListadosDocumentosGenerico.setSelectedIndex(0);
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

					if(this.listadosdocumentos!=null) {
						this.listadosdocumentos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalListadosDocumentos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalListadosDocumentosGenerico)throws Exception
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
				jComboBoxid_sucursalListadosDocumentosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalListadosDocumentosGenerico!=null && jComboBoxid_sucursalListadosDocumentosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalListadosDocumentosGenerico.setSelectedIndex(0);
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

					if(this.listadosdocumentos!=null) {
						this.listadosdocumentos.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioListadosDocumentos.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaListadosDocumentos") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos!=null) {
						jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos!=null) {
							//jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.getItemCount()>0) {
								jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioListadosDocumentosGenerico)throws Exception
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
				jComboBoxid_ejercicioListadosDocumentosGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioListadosDocumentosGenerico!=null && jComboBoxid_ejercicioListadosDocumentosGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioListadosDocumentosGenerico.setSelectedIndex(0);
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

					if(this.listadosdocumentos!=null) {
						this.listadosdocumentos.setTipoMovimiento(tipomovimientoTemp);
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedItem(tipomovimientoTemp);
					}
				} else {
					//jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedItem(tipomovimientoTemp);
					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
						if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.getItemCount()>0) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaListadosDocumentos") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipomovimientoTemp!=null && jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos!=null) {
						jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(tipomovimientoTemp);
					} else {
						if(jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos!=null) {
							//jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(tipomovimientoTemp);
							if(jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.getItemCount()>0) {
								jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setSelectedIndex(0);
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
	public void setActualTipoMovimientoForeignKeyGenerico(Long idTipoMovimientoSeleccionado,JComboBox jComboBoxid_tipo_movimientoListadosDocumentosGenerico)throws Exception
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
				jComboBoxid_tipo_movimientoListadosDocumentosGenerico.setSelectedItem(tipomovimientoTemp);
			} else {
				if(jComboBoxid_tipo_movimientoListadosDocumentosGenerico!=null && jComboBoxid_tipo_movimientoListadosDocumentosGenerico.getItemCount()>0) {
					jComboBoxid_tipo_movimientoListadosDocumentosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ListadosDocumentos listadosdocumentos,JComboBox jComboBoxid_empresaListadosDocumentosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaListadosDocumentosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaListadosDocumentosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				listadosdocumentos.setid_empresa(empresaAux.getId());
				listadosdocumentos.setempresa_descripcion(ListadosDocumentosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				listadosdocumentos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ListadosDocumentos listadosdocumentos,JComboBox jComboBoxid_sucursalListadosDocumentosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalListadosDocumentosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalListadosDocumentosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				listadosdocumentos.setid_sucursal(sucursalAux.getId());
				listadosdocumentos.setsucursal_descripcion(ListadosDocumentosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				listadosdocumentos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ListadosDocumentos listadosdocumentos,JComboBox jComboBoxid_ejercicioListadosDocumentosGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioListadosDocumentosGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioListadosDocumentosGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				listadosdocumentos.setid_ejercicio(ejercicioAux.getId());
				listadosdocumentos.setejercicio_descripcion(ListadosDocumentosConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				listadosdocumentos.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoMovimientoForeignKey(ListadosDocumentos listadosdocumentos,JComboBox jComboBoxid_tipo_movimientoListadosDocumentosGenerico)throws Exception
	{
		try
		{
			TipoMovimiento  tipomovimientoAux=new TipoMovimiento();

			if(jComboBoxid_tipo_movimientoListadosDocumentosGenerico==null) {
				tipomovimientoAux=(TipoMovimiento)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.getSelectedItem();
			} else {
				tipomovimientoAux=(TipoMovimiento)jComboBoxid_tipo_movimientoListadosDocumentosGenerico.getSelectedItem();
			}

			if(tipomovimientoAux!=null && tipomovimientoAux.getId()!=null) {
				listadosdocumentos.setid_tipo_movimiento(tipomovimientoAux.getId());
				listadosdocumentos.settipomovimiento_descripcion(ListadosDocumentosConstantesFunciones.getTipoMovimientoDescripcion(tipomovimientoAux));
				listadosdocumentos.setTipoMovimiento(tipomovimientoAux);			}
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

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
					}

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
					}

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
					}

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaListadosDocumentos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.addItem(ejercicio);
							}
						}

						if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.addItem(tipomovimiento);
							}
						}
					}

					if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { 
					}

					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaListadosDocumentos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.removeAllItems();

							for(TipoMovimiento tipomovimiento:this.tipomovimientosForeignKey) {
								this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.addItem(tipomovimiento);
							}
						}

						if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedItem(tipomovimiento);
						}
					} else {
						if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setSelectedItem(tipomovimiento);
						} else {
							this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesListadosDocumentos() throws Exception {
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
		
	public ListadosDocumentosParameterReturnGeneral getListadosDocumentosParameterGeneral() {
		return this.listadosdocumentosParameterGeneral;
	}
	
	public void setListadosDocumentosParameterGeneral(ListadosDocumentosParameterReturnGeneral listadosdocumentosParameterGeneral) {
		this.listadosdocumentosParameterGeneral = listadosdocumentosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoListadosDocumentos() {
		return isPermisoTodoListadosDocumentos;
	}

	public void setIsPermisoTodoListadosDocumentos(Boolean isPermisoTodoListadosDocumentos) {
		this.isPermisoTodoListadosDocumentos = isPermisoTodoListadosDocumentos;
	}

	public Boolean getIsPermisoNuevoListadosDocumentos() {
		return isPermisoNuevoListadosDocumentos;
	}

	public void setIsPermisoNuevoListadosDocumentos(Boolean isPermisoNuevoListadosDocumentos) {
		this.isPermisoNuevoListadosDocumentos = isPermisoNuevoListadosDocumentos;
	}

	public Boolean getIsPermisoActualizarListadosDocumentos() {
		return isPermisoActualizarListadosDocumentos;
	}

	public void setIsPermisoActualizarListadosDocumentos(Boolean isPermisoActualizarListadosDocumentos) {
		this.isPermisoActualizarListadosDocumentos = isPermisoActualizarListadosDocumentos;
	}

	public Boolean getIsPermisoEliminarListadosDocumentos() {
		return isPermisoEliminarListadosDocumentos;
	}

	public void setIsPermisoEliminarListadosDocumentos(Boolean isPermisoEliminarListadosDocumentos) {
		this.isPermisoEliminarListadosDocumentos = isPermisoEliminarListadosDocumentos;
	}

	public Boolean getIsPermisoGuardarCambiosListadosDocumentos() {
		return isPermisoGuardarCambiosListadosDocumentos;
	}

	public void setIsPermisoGuardarCambiosListadosDocumentos(Boolean isPermisoGuardarCambiosListadosDocumentos) {
		this.isPermisoGuardarCambiosListadosDocumentos = isPermisoGuardarCambiosListadosDocumentos;
	}
	
	public Boolean getIsPermisoConsultaListadosDocumentos() {
		return isPermisoConsultaListadosDocumentos;
	}

	public void setIsPermisoConsultaListadosDocumentos(Boolean isPermisoConsultaListadosDocumentos) {
		this.isPermisoConsultaListadosDocumentos = isPermisoConsultaListadosDocumentos;
	}

	public Boolean getIsPermisoBusquedaListadosDocumentos() {
		return isPermisoBusquedaListadosDocumentos;
	}

	public void setIsPermisoBusquedaListadosDocumentos(Boolean isPermisoBusquedaListadosDocumentos) {
		this.isPermisoBusquedaListadosDocumentos = isPermisoBusquedaListadosDocumentos;
	}

	public Boolean getIsPermisoReporteListadosDocumentos() {
		return isPermisoReporteListadosDocumentos;
	}

	public void setIsPermisoReporteListadosDocumentos(Boolean isPermisoReporteListadosDocumentos) {
		this.isPermisoReporteListadosDocumentos = isPermisoReporteListadosDocumentos;
	}
	
	public Boolean getIsPermisoPaginacionMedioListadosDocumentos() {
		return isPermisoPaginacionMedioListadosDocumentos;
	}

	public void setIsPermisoPaginacionMedioListadosDocumentos(Boolean isPermisoPaginacionMedioListadosDocumentos) {
		this.isPermisoPaginacionMedioListadosDocumentos = isPermisoPaginacionMedioListadosDocumentos;
	}
	
	public Boolean getIsPermisoPaginacionTodoListadosDocumentos() {
		return isPermisoPaginacionTodoListadosDocumentos;
	}

	public void setIsPermisoPaginacionTodoListadosDocumentos(Boolean isPermisoPaginacionTodoListadosDocumentos) {
		this.isPermisoPaginacionTodoListadosDocumentos = isPermisoPaginacionTodoListadosDocumentos;
	}
	
	public Boolean getIsPermisoPaginacionAltoListadosDocumentos() {
		return isPermisoPaginacionAltoListadosDocumentos;
	}

	public void setIsPermisoPaginacionAltoListadosDocumentos(Boolean isPermisoPaginacionAltoListadosDocumentos) {
		this.isPermisoPaginacionAltoListadosDocumentos = isPermisoPaginacionAltoListadosDocumentos;
	}
	
	public Boolean getIsPermisoCopiarListadosDocumentos() {
		return isPermisoCopiarListadosDocumentos;
	}

	public void setIsPermisoCopiarListadosDocumentos(Boolean isPermisoCopiarListadosDocumentos) {
		this.isPermisoCopiarListadosDocumentos = isPermisoCopiarListadosDocumentos;
	}
	
	public Boolean getIsPermisoVerFormListadosDocumentos() {
		return isPermisoVerFormListadosDocumentos;
	}

	public void setIsPermisoVerFormListadosDocumentos(Boolean isPermisoVerFormListadosDocumentos) {
		this.isPermisoVerFormListadosDocumentos = isPermisoVerFormListadosDocumentos;
	}
	
	public Boolean getIsPermisoDuplicarListadosDocumentos() {
		return isPermisoDuplicarListadosDocumentos;
	}

	public void setIsPermisoDuplicarListadosDocumentos(Boolean isPermisoDuplicarListadosDocumentos) {
		this.isPermisoDuplicarListadosDocumentos = isPermisoDuplicarListadosDocumentos;
	}
	
	public Boolean getIsPermisoOrdenListadosDocumentos() {
		return isPermisoOrdenListadosDocumentos;
	}

	public void setIsPermisoOrdenListadosDocumentos(Boolean isPermisoOrdenListadosDocumentos) {
		this.isPermisoOrdenListadosDocumentos = isPermisoOrdenListadosDocumentos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoListadosDocumentos() {
		return isVisibilidadCeldaNuevoListadosDocumentos;
	}

	public void setIsVisibilidadCeldaNuevoListadosDocumentos(Boolean isVisibilidadCeldaNuevoListadosDocumentos) {
		this.isVisibilidadCeldaNuevoListadosDocumentos = isVisibilidadCeldaNuevoListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarListadosDocumentos() {
		return isVisibilidadCeldaDuplicarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaDuplicarListadosDocumentos(Boolean isVisibilidadCeldaDuplicarListadosDocumentos) {
		this.isVisibilidadCeldaDuplicarListadosDocumentos = isVisibilidadCeldaDuplicarListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarListadosDocumentos() {
		return isVisibilidadCeldaCopiarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaCopiarListadosDocumentos(Boolean isVisibilidadCeldaCopiarListadosDocumentos) {
		this.isVisibilidadCeldaCopiarListadosDocumentos = isVisibilidadCeldaCopiarListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormListadosDocumentos() {
		return isVisibilidadCeldaVerFormListadosDocumentos;
	}

	public void setIsVisibilidadCeldaVerFormListadosDocumentos(Boolean isVisibilidadCeldaVerFormListadosDocumentos) {
		this.isVisibilidadCeldaVerFormListadosDocumentos = isVisibilidadCeldaVerFormListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenListadosDocumentos() {
		return isVisibilidadCeldaOrdenListadosDocumentos;
	}

	public void setIsVisibilidadCeldaOrdenListadosDocumentos(Boolean isVisibilidadCeldaOrdenListadosDocumentos) {
		this.isVisibilidadCeldaOrdenListadosDocumentos = isVisibilidadCeldaOrdenListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesListadosDocumentos() {
		return isVisibilidadCeldaNuevoRelacionesListadosDocumentos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesListadosDocumentos(Boolean isVisibilidadCeldaNuevoRelacionesListadosDocumentos) {
		this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos = isVisibilidadCeldaNuevoRelacionesListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarListadosDocumentos() {
		return isVisibilidadCeldaModificarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaModificarListadosDocumentos(Boolean isVisibilidadCeldaModificarListadosDocumentos) {
		this.isVisibilidadCeldaModificarListadosDocumentos = isVisibilidadCeldaModificarListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarListadosDocumentos() {
		return isVisibilidadCeldaActualizarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaActualizarListadosDocumentos(Boolean isVisibilidadCeldaActualizarListadosDocumentos) {
		this.isVisibilidadCeldaActualizarListadosDocumentos = isVisibilidadCeldaActualizarListadosDocumentos;
	}

	public Boolean getIsVisibilidadCeldaEliminarListadosDocumentos() {
		return isVisibilidadCeldaEliminarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaEliminarListadosDocumentos(Boolean isVisibilidadCeldaEliminarListadosDocumentos) {
		this.isVisibilidadCeldaEliminarListadosDocumentos = isVisibilidadCeldaEliminarListadosDocumentos;
	}

	public Boolean getIsVisibilidadCeldaCancelarListadosDocumentos() {
		return isVisibilidadCeldaCancelarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaCancelarListadosDocumentos(Boolean isVisibilidadCeldaCancelarListadosDocumentos) {
		this.isVisibilidadCeldaCancelarListadosDocumentos = isVisibilidadCeldaCancelarListadosDocumentos;
	}

	public Boolean getIsVisibilidadCeldaGuardarListadosDocumentos() {
		return isVisibilidadCeldaGuardarListadosDocumentos;
	}

	public void setIsVisibilidadCeldaGuardarListadosDocumentos(Boolean isVisibilidadCeldaGuardarListadosDocumentos) {
		this.isVisibilidadCeldaGuardarListadosDocumentos = isVisibilidadCeldaGuardarListadosDocumentos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosListadosDocumentos() {
		return isVisibilidadCeldaGuardarCambiosListadosDocumentos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosListadosDocumentos(Boolean isVisibilidadCeldaGuardarCambiosListadosDocumentos) {
		this.isVisibilidadCeldaGuardarCambiosListadosDocumentos = isVisibilidadCeldaGuardarCambiosListadosDocumentos;
	}
		
	public ListadosDocumentosSessionBean getlistadosdocumentosSessionBean() {
		return this.listadosdocumentosSessionBean;
	}
	
	public void setlistadosdocumentosSessionBean(ListadosDocumentosSessionBean listadosdocumentosSessionBean) {
		this.listadosdocumentosSessionBean=listadosdocumentosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaListadosDocumentos() {
		return this.isVisibilidadBusquedaListadosDocumentos;
	}

	public void setisVisibilidadBusquedaListadosDocumentos(Boolean isVisibilidadBusquedaListadosDocumentos) {
		this.isVisibilidadBusquedaListadosDocumentos=isVisibilidadBusquedaListadosDocumentos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(ListadosDocumentos listadosdocumentos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(listadosdocumentos,null);
				this.setActualParaGuardarSucursalForeignKey(listadosdocumentos,null);
				this.setActualParaGuardarEjercicioForeignKey(listadosdocumentos,null);
				this.setActualParaGuardarTipoMovimientoForeignKey(listadosdocumentos,null);
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
	
	public void bugActualizarReferenciaActual(ListadosDocumentos listadosdocumentos,ListadosDocumentos listadosdocumentosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalListadosDocumentos(listadosdocumentos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		listadosdocumentosAux.setId(listadosdocumentos.getId());
		listadosdocumentosAux.setVersionRow(listadosdocumentos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ListadosDocumentos listadosdocumentosLocal) throws Exception {
		
		if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ListadosDocumentos listadosdocumentosLocal) throws Exception {	
		if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				listadosdocumentosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				listadosdocumentosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				listadosdocumentosLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoMovimientoDetalleFormJInternalFrame.class)) {
				TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrameLocal=(TipoMovimientoBeanSwingJInternalFrame) ((TipoMovimientoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipomovimientoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.gettipomovimiento(),true);
				tipomovimientoBeanSwingJInternalFrameLocal.actualizarLista(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento,this.tipomovimientosForeignKey);

				tipomovimientoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				listadosdocumentosLocal.setTipoMovimiento(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento);

				this.addItemDefectoCombosForeignKeyTipoMovimiento();
				this.cargarCombosFrameTipoMovimientosForeignKey("Formulario");
				this.setActualTipoMovimientoForeignKey(tipomovimientoBeanSwingJInternalFrameLocal.tipomovimiento.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarListadosDocumentosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = listadosdocumentosValidator.getInvalidValues(this.listadosdocumentos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ListadosDocumentos listadosdocumentos,List<ListadosDocumentos> listadosdocumentoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ListadosDocumentos listadosdocumentos,List<ListadosDocumentos> listadosdocumentoss) throws Exception {
		try	{			
			ListadosDocumentosConstantesFunciones.actualizarSelectedLista(listadosdocumentos,listadosdocumentoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ListadosDocumentos> listadosdocumentossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				listadosdocumentossLocal=this.listadosdocumentosLogic.getListadosDocumentoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				listadosdocumentossLocal=this.listadosdocumentoss;
			}
			//ARCHITECTURE
		
			for(ListadosDocumentos listadosdocumentosLocal:listadosdocumentossLocal) {
				if(this.permiteMantenimiento(listadosdocumentosLocal) && listadosdocumentosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ListadosDocumentosConstantesFunciones.getListadosDocumentosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfechaListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.TIPOMOVIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeltipo_movimientoListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelcodigoListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiarioListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.BENEFICIARIOCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiario_chequeListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldetalleListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.VALORCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalor_chequeListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.NOMBREEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_empresaListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.RUCEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelruc_empresaListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.DIRECCIONEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldireccion_empresaListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_sucursalListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalorListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.NUMEROMAYOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_mayorListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_emisionListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.FECHAFINALIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_finalizacionListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.NOMBREUSUARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_usuarioListadosDocumentos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ListadosDocumentosConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_chequeListadosDocumentos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfechaListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabeltipo_movimientoListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelcodigoListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiarioListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiario_chequeListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldetalleListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalor_chequeListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_empresaListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelruc_empresaListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldireccion_empresaListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_sucursalListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalorListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_mayorListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_emisionListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_finalizacionListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_usuarioListadosDocumentos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_chequeListadosDocumentos,"");
		
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
		this.iIdNuevoListadosDocumentos--;	
		
		
		this.listadosdocumentosAux=new ListadosDocumentos();
		
		this.listadosdocumentosAux.setId(this.iIdNuevoListadosDocumentos);
		this.listadosdocumentosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.listadosdocumentosLogic.getListadosDocumentoss().add(this.listadosdocumentosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.listadosdocumentoss.add(this.listadosdocumentosAux);
		}
		//ARCHITECTURE
		
		this.listadosdocumentos=this.listadosdocumentosAux;
		
		if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentos);
			this.setVariablesObjetoActualToFormularioForeignKeyListadosDocumentos(this.listadosdocumentos);
		}
				
		//this.setDefaultControlesListadosDocumentos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyListadosDocumentos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyListadosDocumentos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosDocumentos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosDocumentos(this.listadosdocumentosBean,this.listadosdocumentos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanListadosDocumentos(this.listadosdocumentosReturnGeneral,this.listadosdocumentosBean,false);
		
		if(this.listadosdocumentosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos());
		}
		
		if(this.listadosdocumentosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos(),classes);//this.listadosdocumentosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyListadosDocumentos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyListadosDocumentos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.RecargarFormListadosDocumentos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingListadosDocumentos(false);
						
			if(listadosdocumentosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosDocumentos();
			}
			
			this.actualizarVisualTableDatosListadosDocumentos();
			
			this.jTableDatosListadosDocumentos.setRowSelectionInterval(this.getIndiceNuevoListadosDocumentos(), this.getIndiceNuevoListadosDocumentos());
			
			this.seleccionarFilaTablaListadosDocumentosActual();
						
			this.actualizarEstadoCeldasBotonesListadosDocumentos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesListadosDocumentos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_desdeListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarfecha_desdeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_hastaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarfecha_hastaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarfechaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activartipo_movimientoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarcodigoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarbeneficiarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarbeneficiario_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activardetalleListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarvalor_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarnombre_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarruc_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activardireccion_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarnombre_sucursalListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarvalorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarnumero_mayorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarfecha_emisionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarfecha_finalizacionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarnombre_usuarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarnumero_chequeListadosDocumentos);	
		//
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarid_empresaListadosDocumentos);//
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarid_sucursalListadosDocumentos);//
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarid_ejercicioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setEnabled(isHabilitar && this.listadosdocumentosConstantesFunciones.activarid_tipo_movimientoListadosDocumentos);
	};
	
	public void setDefaultControlesListadosDocumentos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoListadosDocumentos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.listadosdocumentosSessionBean.setConGuardarRelaciones(true);			
			this.listadosdocumentosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.setVisible(true);
			
					
		} else {
			//this.listadosdocumentosSessionBean.setConGuardarRelaciones(false);			
			this.listadosdocumentosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoListadosDocumentos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
				if(listadosdocumentosAux.getId().equals(this.iIdNuevoListadosDocumentos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentoss) {
				if(listadosdocumentosAux.getId().equals(this.iIdNuevoListadosDocumentos)) {
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
	
	public int getIndiceActualListadosDocumentos(ListadosDocumentos listadosdocumentos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
				if(listadosdocumentosAux.getId().equals(listadosdocumentos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentoss) {
				if(listadosdocumentosAux.getId().equals(listadosdocumentos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalListadosDocumentos(ListadosDocumentos listadosdocumentosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
				if(listadosdocumentosAux.getListadosDocumentosOriginal().getId().equals(listadosdocumentosOriginal.getId())) {
					existe=true;
					listadosdocumentosOriginal.setId(listadosdocumentosAux.getId());
					listadosdocumentosOriginal.setVersionRow(listadosdocumentosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentoss) {
				if(listadosdocumentosAux.getListadosDocumentosOriginal().getId().equals(listadosdocumentosOriginal.getId())) {
					existe=true;
					listadosdocumentosOriginal.setId(listadosdocumentosAux.getId());
					listadosdocumentosOriginal.setVersionRow(listadosdocumentosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosListadosDocumentos(Boolean esParaCancelar) throws Exception {
		listadosdocumentossAux=new ArrayList<ListadosDocumentos>();
		listadosdocumentosAux=new ListadosDocumentos();
		
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
					if(listadosdocumentosAux.getId()<0) {
						listadosdocumentossAux.add(listadosdocumentosAux);
					}		
				}
				this.iIdNuevoListadosDocumentos=0L;
				this.listadosdocumentosLogic.getListadosDocumentoss().removeAll(listadosdocumentossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentoss) {
					if(listadosdocumentosAux.getId()<0) {
						listadosdocumentossAux.add(listadosdocumentosAux);
					}		
				}
				this.iIdNuevoListadosDocumentos=0L;
				this.listadosdocumentoss.removeAll(listadosdocumentossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoListadosDocumentos 
					&& this.listadosdocumentosLogic.getListadosDocumentoss().size()>0
					) {
					listadosdocumentosAux=this.listadosdocumentosLogic.getListadosDocumentoss().get(this.listadosdocumentosLogic.getListadosDocumentoss().size() - 1);
				
					if(listadosdocumentosAux.getId()<0) {
						this.listadosdocumentosLogic.getListadosDocumentoss().remove(listadosdocumentosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoListadosDocumentos && this.listadosdocumentoss.size()>0) {
					listadosdocumentosAux=this.listadosdocumentoss.get(this.listadosdocumentoss.size() - 1);
				
					if(listadosdocumentosAux.getId()<0) {
						this.listadosdocumentoss.remove(listadosdocumentosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoListadosDocumentos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(listadosdocumentos.getId()<0) {
				this.listadosdocumentosLogic.getListadosDocumentoss().remove(this.listadosdocumentos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(listadosdocumentos.getId()<0) {
				this.listadosdocumentoss.remove(this.listadosdocumentos);
			}
		}			
	}
	
	public void setEstadosInicialesListadosDocumentos(List<ListadosDocumentos> listadosdocumentossAux) throws Exception {
		ListadosDocumentosConstantesFunciones.setEstadosInicialesListadosDocumentos(listadosdocumentossAux);
	}
	
	public void setEstadosInicialesListadosDocumentos(ListadosDocumentos listadosdocumentosAux) throws Exception {
		ListadosDocumentosConstantesFunciones.setEstadosInicialesListadosDocumentos(listadosdocumentosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarListadosDocumentosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarListadosDocumentosActual()) {
				if(!this.isEsNuevoListadosDocumentos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoListadosDocumentos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarListadosDocumentosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Listados Documentos ?", "MANTENIMIENTO DE Listados Documentos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ListadosDocumentos listadosdocumentos) throws Exception {
		ListadosDocumentosConstantesFunciones.seleccionarAsignar(this.listadosdocumentos,listadosdocumentos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarListadosDocumentos=this.isPermisoActualizarOriginalListadosDocumentos;
			
			
			this.seleccionarAsignar(listadosdocumentos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesListadosDocumentos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.listadosdocumentosSessionBean.setsFuncionBusquedaRapida(this.listadosdocumentosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoListadosDocumentos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosListadosDocumentos(esParaCancelar);				
				this.cancelarNuevoListadosDocumentos(esParaCancelar);								
			}
			
			this.listadosdocumentos=new ListadosDocumentos();
			
			this.inicializarListadosDocumentos();
			
			this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarListadosDocumentos() throws Exception {
		try {
			ListadosDocumentosConstantesFunciones.inicializarListadosDocumentos(this.listadosdocumentos);
			
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
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.listadosdocumentosLogic.getListadosDocumentoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteListadosDocumentoss(String sAccionBusqueda,List<ListadosDocumentos> listadosdocumentossParaReportes) throws Exception {
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
					sPathReporteFinal="ListadosDocumentos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ListadosDocumentosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ListadosDocumentosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ListadosDocumentos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Listados Documentoses");		
		parameters.put("busquedapor", ListadosDocumentosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceListadosDocumentos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ListadosDocumentosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ListadosDocumentosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceListadosDocumentos=new JRBeanArrayDataSource(ListadosDocumentosJInternalFrame.TraerListadosDocumentosBeans(listadosdocumentossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceListadosDocumentos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ListadosDocumentosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ListadosDocumentosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ListadosDocumentosBean.TraerListadosDocumentosBeans(listadosdocumentossParaReportes).toArray()));
							
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
				this.generarExcelReporteListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoListadosDocumentosActionPerformed(null);
					//this.generarExcelReporteListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesListadosDocumentoss(sAccionBusqueda,sTipoArchivoReporte,listadosdocumentossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteListadosDocumentoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosDocumentos> listadosdocumentossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosDocumentoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosDocumentos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ListadosDocumentos listadosdocumentos : listadosdocumentossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ListadosDocumentosConstantesFunciones.generarExcelReporteDataListadosDocumentos("NORMAL",row,workbook,listadosdocumentos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderListadosDocumentos(String sTipo,Row row,Workbook workbook) {
		
		ListadosDocumentosConstantesFunciones.generarExcelReporteHeaderListadosDocumentos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalListadosDocumentoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosDocumentos> listadosdocumentossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosDocumentoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ListadosDocumentos listadosdocumentos : listadosdocumentossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ListadosDocumentosConstantesFunciones.getListadosDocumentosDescripcion(listadosdocumentos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.gettipomovimiento_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.gettipo_movimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getbeneficiario_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getdetalle());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getvalor_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getnombre_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getruc_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getdireccion_empresa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getnumero_mayor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getfecha_finalizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getnombre_usuario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(listadosdocumentos.getnumero_cheque());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesListadosDocumentoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ListadosDocumentos> listadosdocumentossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ListadosDocumentos> listadosdocumentossRespaldo=null;
		
		classes=ListadosDocumentosConstantesFunciones.getClassesRelationshipsOfListadosDocumentos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.listadosdocumentosLogic.setDatosCliente(this.datosCliente);
		this.listadosdocumentosLogic.setDatosDeep(this.datosDeep);
		this.listadosdocumentosLogic.setIsConDeep(true);
		
		listadosdocumentossRespaldo=this.listadosdocumentosLogic.getListadosDocumentoss();
		
		this.listadosdocumentosLogic.setListadosDocumentoss(listadosdocumentossParaReportes);	
		this.listadosdocumentosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		listadosdocumentossParaReportes=this.listadosdocumentosLogic.getListadosDocumentoss();
		this.listadosdocumentosLogic.setListadosDocumentoss(listadosdocumentossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ListadosDocumentoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderListadosDocumentos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ListadosDocumentos listadosdocumentos : listadosdocumentossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderListadosDocumentos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ListadosDocumentosConstantesFunciones.generarExcelReporteDataListadosDocumentos("NORMAL",row,workbook,listadosdocumentos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ListadosDocumentosConstantesFunciones.getListadosDocumentosDescripcion(listadosdocumentos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoListadosDocumentos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessListadosDocumentos() throws Exception {		
		this.startProcessListadosDocumentos(true);
	}
	
	public void startProcessListadosDocumentos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasListadosDocumentos ,this.jPanelParametrosReportesListadosDocumentos, this.jScrollPanelDatosListadosDocumentos,this.jPanelPaginacionListadosDocumentos, this.jScrollPanelDatosEdicionListadosDocumentos, this.jPanelAccionesListadosDocumentos,this.jPanelAccionesFormularioListadosDocumentos,this.jmenuBarListadosDocumentos,this.jmenuBarDetalleListadosDocumentos,this.jTtoolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosDocumentos=this.jTabbedPaneBusquedasListadosDocumentos; 
		
		final JPanel jPanelParametrosReportesListadosDocumentos=this.jPanelParametrosReportesListadosDocumentos;
		//final JScrollPane jScrollPanelDatosListadosDocumentos=this.jScrollPanelDatosListadosDocumentos;
		final JTable jTableDatosListadosDocumentos=this.jTableDatosListadosDocumentos;		
		final JPanel jPanelPaginacionListadosDocumentos=this.jPanelPaginacionListadosDocumentos;
		//final JScrollPane jScrollPanelDatosEdicionListadosDocumentos=this.jScrollPanelDatosEdicionListadosDocumentos;
		final JPanel jPanelAccionesListadosDocumentos=this.jPanelAccionesListadosDocumentos;
		
		JPanel jPanelCamposAuxiliarListadosDocumentos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarListadosDocumentos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			jPanelCamposAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jPanelCamposListadosDocumentos;
			jPanelAccionesFormularioAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jPanelAccionesFormularioListadosDocumentos;
		}
		
		final JPanel jPanelCamposListadosDocumentos=jPanelCamposAuxiliarListadosDocumentos;
		final JPanel jPanelAccionesFormularioListadosDocumentos=jPanelAccionesFormularioAuxiliarListadosDocumentos;
		
		
		final JMenuBar jmenuBarListadosDocumentos=this.jmenuBarListadosDocumentos;
		final JToolBar jTtoolBarListadosDocumentos=this.jTtoolBarListadosDocumentos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarListadosDocumentos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosDocumentos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			jmenuBarDetalleAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jmenuBarDetalleListadosDocumentos;
			jTtoolBarDetalleAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jTtoolBarDetalleListadosDocumentos;
		}
		
		final JMenuBar jmenuBarDetalleListadosDocumentos=jmenuBarDetalleAuxiliarListadosDocumentos;
		final JToolBar jTtoolBarDetalleListadosDocumentos=jTtoolBarDetalleAuxiliarListadosDocumentos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosDocumentos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosDocumentos;
			processRunnable.jTableDatos=jTableDatosListadosDocumentos;
			processRunnable.jPanelCampos=jPanelCamposListadosDocumentos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosDocumentos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosDocumentos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosDocumentos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosDocumentos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosDocumentos;
			processRunnable.jTtoolBar=jTtoolBarListadosDocumentos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosDocumentos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosDocumentos ,jPanelParametrosReportesListadosDocumentos,jTableDatosListadosDocumentos, /*jScrollPanelDatosListadosDocumentos,*/jPanelCamposListadosDocumentos,jPanelPaginacionListadosDocumentos, /*jScrollPanelDatosEdicionListadosDocumentos,*/ jPanelAccionesListadosDocumentos,jPanelAccionesFormularioListadosDocumentos,jmenuBarListadosDocumentos,jmenuBarDetalleListadosDocumentos,jTtoolBarListadosDocumentos,jTtoolBarDetalleListadosDocumentos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasListadosDocumentos ,jPanelParametrosReportesListadosDocumentos, jScrollPanelDatosListadosDocumentos,jPanelPaginacionListadosDocumentos, jScrollPanelDatosEdicionListadosDocumentos, jPanelAccionesListadosDocumentos,jPanelAccionesFormularioListadosDocumentos,jmenuBarListadosDocumentos,jmenuBarDetalleListadosDocumentos,jTtoolBarListadosDocumentos,jTtoolBarDetalleListadosDocumentos);
						
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
	
	public void finishProcessListadosDocumentos() {// throws Exception 
		this.finishProcessListadosDocumentos(true);
	}
	
	public void finishProcessListadosDocumentos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasListadosDocumentos ,this.jPanelParametrosReportesListadosDocumentos, this.jScrollPanelDatosListadosDocumentos,this.jPanelPaginacionListadosDocumentos, this.jScrollPanelDatosEdicionListadosDocumentos, this.jPanelAccionesListadosDocumentos,this.jPanelAccionesFormularioListadosDocumentos,this.jmenuBarListadosDocumentos,this.jmenuBarDetalleListadosDocumentos,this.jTtoolBarListadosDocumentos,this.jTtoolBarDetalleListadosDocumentos);		
		
		final JTabbedPane jTabbedPaneBusquedasListadosDocumentos=this.jTabbedPaneBusquedasListadosDocumentos; 
		
		final JPanel jPanelParametrosReportesListadosDocumentos=this.jPanelParametrosReportesListadosDocumentos;
		//final JScrollPane jScrollPanelDatosListadosDocumentos=this.jScrollPanelDatosListadosDocumentos;
		final JTable jTableDatosListadosDocumentos=this.jTableDatosListadosDocumentos;		
		final JPanel jPanelPaginacionListadosDocumentos=this.jPanelPaginacionListadosDocumentos;
		//final JScrollPane jScrollPanelDatosEdicionListadosDocumentos=this.jScrollPanelDatosEdicionListadosDocumentos;
		final JPanel jPanelAccionesListadosDocumentos=this.jPanelAccionesListadosDocumentos;
		
		JPanel jPanelCamposAuxiliarListadosDocumentos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarListadosDocumentos=new JPanel();
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			jPanelCamposAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jPanelCamposListadosDocumentos;
			jPanelAccionesFormularioAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jPanelAccionesFormularioListadosDocumentos;
		}
		
		final JPanel jPanelCamposListadosDocumentos=jPanelCamposAuxiliarListadosDocumentos;
		final JPanel jPanelAccionesFormularioListadosDocumentos=jPanelAccionesFormularioAuxiliarListadosDocumentos;
		
		
		final JMenuBar jmenuBarListadosDocumentos=this.jmenuBarListadosDocumentos;		
		final JToolBar jTtoolBarListadosDocumentos=this.jTtoolBarListadosDocumentos;
				
		JMenuBar jmenuBarDetalleAuxiliarListadosDocumentos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarListadosDocumentos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			jmenuBarDetalleAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jmenuBarDetalleListadosDocumentos;
			jTtoolBarDetalleAuxiliarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jTtoolBarDetalleListadosDocumentos;		
		}
		
		final JMenuBar jmenuBarDetalleListadosDocumentos=jmenuBarDetalleAuxiliarListadosDocumentos;
		final JToolBar jTtoolBarDetalleListadosDocumentos=jTtoolBarDetalleAuxiliarListadosDocumentos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasListadosDocumentos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesListadosDocumentos;
			processRunnable.jTableDatos=jTableDatosListadosDocumentos;
			processRunnable.jPanelCampos=jPanelCamposListadosDocumentos;
			processRunnable.jPanelPaginacion=jPanelPaginacionListadosDocumentos;
			processRunnable.jPanelAcciones=jPanelAccionesListadosDocumentos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioListadosDocumentos;
			
			
			processRunnable.jmenuBar=jmenuBarListadosDocumentos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleListadosDocumentos;
			processRunnable.jTtoolBar=jTtoolBarListadosDocumentos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleListadosDocumentos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasListadosDocumentos ,jPanelParametrosReportesListadosDocumentos, jTableDatosListadosDocumentos,/*jScrollPanelDatosListadosDocumentos,*/jPanelCamposListadosDocumentos,jPanelPaginacionListadosDocumentos, /*jScrollPanelDatosEdicionListadosDocumentos,*/ jPanelAccionesListadosDocumentos,jPanelAccionesFormularioListadosDocumentos,jmenuBarListadosDocumentos,jmenuBarDetalleListadosDocumentos,jTtoolBarListadosDocumentos,jTtoolBarDetalleListadosDocumentos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesListadosDocumentos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarListadosDocumentos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuListadosDocumentos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarListadosDocumentos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarListadosDocumentos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleListadosDocumentos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuListadosDocumentos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarListadosDocumentos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleListadosDocumentos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.listadosdocumentosConstantesFunciones.getsFinalQueryListadosDocumentos();
		String  finalQueryPaginacionTodos=this.listadosdocumentosConstantesFunciones.getsFinalQueryListadosDocumentos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ListadosDocumentosConstantesFunciones.getArrayColumnasGlobalesNoListadosDocumentos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ListadosDocumentosConstantesFunciones.getArrayColumnasGlobalesListadosDocumentos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ListadosDocumentosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.listadosdocumentossEliminados= new ArrayList<ListadosDocumentos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessListadosDocumentos();
		
				///*ListadosDocumentosSessionBean*/this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			
			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
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
					this.iNumeroPaginacion=ListadosDocumentosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ListadosDocumentosConstantesFunciones.getClassesForeignKeysOfListadosDocumentos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/listadosdocumentos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			listadosdocumentossAux= new ArrayList<ListadosDocumentos>();
			
				
			listadosdocumentosLogic.setDatosCliente(this.datosCliente);
			listadosdocumentosLogic.setDatosDeep(this.datosDeep);
			listadosdocumentosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaListadosDocumentos")) {
				this.sDetalleReporte=ListadosDocumentosConstantesFunciones.getDetalleIndiceBusquedaListadosDocumentos(id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					listadosdocumentosLogic.getListadosDocumentossBusquedaListadosDocumentos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosDocumentosConstantesFunciones.getDetalleIndiceBusquedaListadosDocumentos(id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosDocumentosConstantesFunciones.getDetalleIndiceBusquedaListadosDocumentos(id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=listadosdocumentosLogic.getListadosDocumentoss()==null||listadosdocumentosLogic.getListadosDocumentoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=listadosdocumentoss==null|| listadosdocumentoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosdocumentossAux=new ArrayList<ListadosDocumentos>();
						listadosdocumentossAux.addAll(listadosdocumentosLogic.getListadosDocumentoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosdocumentossAux=new ArrayList<ListadosDocumentos>();
							listadosdocumentossAux.addAll(listadosdocumentoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							listadosdocumentosLogic.getListadosDocumentossBusquedaListadosDocumentos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ListadosDocumentosConstantesFunciones.getDetalleIndiceBusquedaListadosDocumentos(id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ListadosDocumentosConstantesFunciones.getDetalleIndiceBusquedaListadosDocumentos(id_ejercicioBusquedaListadosDocumentos,id_tipo_movimientoBusquedaListadosDocumentos,fecha_desdeBusquedaListadosDocumentos,fecha_hastaBusquedaListadosDocumentos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteListadosDocumentoss("BusquedaListadosDocumentos",listadosdocumentosLogic.getListadosDocumentoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteListadosDocumentoss("BusquedaListadosDocumentos",listadosdocumentoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosdocumentosLogic.setListadosDocumentoss(new ArrayList<ListadosDocumentos>());
						listadosdocumentosLogic.getListadosDocumentoss().addAll(listadosdocumentossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosdocumentoss=new ArrayList<ListadosDocumentos>();
							listadosdocumentoss.addAll(listadosdocumentossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesListadosDocumentos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessListadosDocumentos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosdocumentosLogic.getListadosDocumentoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosdocumentoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=listadosdocumentosLogic.getListadosDocumentoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=listadosdocumentoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ListadosDocumentos listadosdocumentos) {
		Boolean permite=true;
		
		if(this.listadosdocumentos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ListadosDocumentosConstantesFunciones.getOrderByListaListadosDocumentos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ListadosDocumentosConstantesFunciones.getOrderByListaListadosDocumentos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosDocumentos listadosdocumentos:listadosdocumentosLogic.getListadosDocumentoss()) {
				if(listadosdocumentos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosdocumentosTotales=listadosdocumentos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosDocumentos listadosdocumentos:this.listadosdocumentoss) {
				if(listadosdocumentos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosdocumentosTotales=listadosdocumentos;
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
			this.listadosdocumentosAux=new ListadosDocumentos();
			this.listadosdocumentosAux.setsType(Constantes2.S_TOTALES);
			this.listadosdocumentosAux.setIsNew(false);
			this.listadosdocumentosAux.setIsChanged(false);
			this.listadosdocumentosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ListadosDocumentosConstantesFunciones.TotalizarValoresFilaListadosDocumentos(this.listadosdocumentosLogic.getListadosDocumentoss(),this.listadosdocumentosAux);
				
				//this.listadosdocumentosLogic.getListadosDocumentoss().add(this.listadosdocumentosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ListadosDocumentosConstantesFunciones.TotalizarValoresFilaListadosDocumentos(this.listadosdocumentoss,this.listadosdocumentosAux);
				
				this.listadosdocumentoss.add(this.listadosdocumentosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		listadosdocumentosTotales=new ListadosDocumentos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosdocumentosLogic.getListadosDocumentoss().remove(listadosdocumentosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.listadosdocumentoss.remove(listadosdocumentosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		listadosdocumentosTotales=new ListadosDocumentos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ListadosDocumentos listadosdocumentos:listadosdocumentosLogic.getListadosDocumentoss()) {
				if(listadosdocumentos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosdocumentosTotales=listadosdocumentos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosDocumentosConstantesFunciones.TotalizarValoresFilaListadosDocumentos(this.listadosdocumentosLogic.getListadosDocumentoss(),listadosdocumentosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ListadosDocumentos listadosdocumentos:this.listadosdocumentoss) {
				if(listadosdocumentos.getsType().equals(Constantes2.S_TOTALES)) {
					listadosdocumentosTotales=listadosdocumentos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ListadosDocumentosConstantesFunciones.TotalizarValoresFilaListadosDocumentos(this.listadosdocumentoss,listadosdocumentosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getListadosDocumentossBusquedaListadosDocumentos()throws Exception {
		try {
			sAccionBusqueda="BusquedaListadosDocumentos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosDocumentossFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosDocumentossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosDocumentossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getListadosDocumentossFK_IdTipoMovimiento()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoMovimiento";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getListadosDocumentossBusquedaListadosDocumentos(String sFinalQuery,Long id_ejercicio,Long id_tipo_movimiento,Date fecha_desde,Date fecha_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosdocumentosLogic.getListadosDocumentossBusquedaListadosDocumentos(sFinalQuery,this.pagination,id_ejercicio,id_tipo_movimiento,fecha_desde,fecha_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosDocumentossFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosdocumentosLogic.getListadosDocumentossFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosDocumentossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosdocumentosLogic.getListadosDocumentossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosDocumentossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosdocumentosLogic.getListadosDocumentossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getListadosDocumentossFK_IdTipoMovimiento(String sFinalQuery,Long id_tipo_movimiento)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//listadosdocumentosLogic.getListadosDocumentossFK_IdTipoMovimiento(sFinalQuery,this.pagination,id_tipo_movimiento);
				
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
	
	public void inicializarPermisosListadosDocumentos() {
		this.isPermisoTodoListadosDocumentos=false;
		this.isPermisoNuevoListadosDocumentos=false;
		this.isPermisoActualizarListadosDocumentos=false;
		this.isPermisoActualizarOriginalListadosDocumentos=false;
		this.isPermisoEliminarListadosDocumentos=false;
		this.isPermisoGuardarCambiosListadosDocumentos=false;
		this.isPermisoConsultaListadosDocumentos=true;
		this.isPermisoBusquedaListadosDocumentos=true;
		this.isPermisoReporteListadosDocumentos=true;
		this.isPermisoOrdenListadosDocumentos=false;		
		this.isPermisoPaginacionMedioListadosDocumentos=false;		
		this.isPermisoPaginacionAltoListadosDocumentos=false;		
		this.isPermisoPaginacionTodoListadosDocumentos=false;		
		this.isPermisoCopiarListadosDocumentos=false;		
		this.isPermisoVerFormListadosDocumentos=false;		
		this.isPermisoDuplicarListadosDocumentos=false;
		this.isPermisoOrdenListadosDocumentos=false;
	}
	
	public void setPermisosUsuarioListadosDocumentos(Boolean isPermiso) {
		this.isPermisoTodoListadosDocumentos=isPermiso;
		this.isPermisoNuevoListadosDocumentos=isPermiso;
		this.isPermisoActualizarListadosDocumentos=isPermiso;
		this.isPermisoActualizarOriginalListadosDocumentos=isPermiso;
		this.isPermisoEliminarListadosDocumentos=isPermiso;
		this.isPermisoGuardarCambiosListadosDocumentos=isPermiso;
		this.isPermisoConsultaListadosDocumentos=isPermiso;
		this.isPermisoBusquedaListadosDocumentos=isPermiso;
		this.isPermisoReporteListadosDocumentos=isPermiso;
		this.isPermisoOrdenListadosDocumentos=isPermiso;		
		this.isPermisoPaginacionMedioListadosDocumentos=isPermiso;		
		this.isPermisoPaginacionAltoListadosDocumentos=isPermiso;		
		this.isPermisoPaginacionTodoListadosDocumentos=isPermiso;		
		this.isPermisoCopiarListadosDocumentos=isPermiso;		
		this.isPermisoVerFormListadosDocumentos=isPermiso;		
		this.isPermisoDuplicarListadosDocumentos=isPermiso;
		this.isPermisoOrdenListadosDocumentos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioListadosDocumentos(Boolean isPermiso) {
		//this.isPermisoTodoListadosDocumentos=isPermiso;
		this.isPermisoNuevoListadosDocumentos=isPermiso;
		this.isPermisoActualizarListadosDocumentos=isPermiso;
		this.isPermisoActualizarOriginalListadosDocumentos=isPermiso;
		this.isPermisoEliminarListadosDocumentos=isPermiso;
		this.isPermisoGuardarCambiosListadosDocumentos=isPermiso;
		//this.isPermisoConsultaListadosDocumentos=isPermiso;
		//this.isPermisoBusquedaListadosDocumentos=isPermiso;
		//this.isPermisoReporteListadosDocumentos=isPermiso;
		//this.isPermisoOrdenListadosDocumentos=isPermiso;		
		//this.isPermisoPaginacionMedioListadosDocumentos=isPermiso;		
		//this.isPermisoPaginacionAltoListadosDocumentos=isPermiso;		
		//this.isPermisoPaginacionTodoListadosDocumentos=isPermiso;		
		//this.isPermisoCopiarListadosDocumentos=isPermiso;		
		//this.isPermisoDuplicarListadosDocumentos=isPermiso;
		//this.isPermisoOrdenListadosDocumentos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioListadosDocumentosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ListadosDocumentosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebListadosDocumentos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioListadosDocumentosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioListadosDocumentosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionListadosDocumentosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioListadosDocumentosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioListadosDocumentos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ListadosDocumentosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ListadosDocumentosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoListadosDocumentos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarListadosDocumentos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalListadosDocumentos=this.isPermisoActualizarListadosDocumentos;
			this.isPermisoEliminarListadosDocumentos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosListadosDocumentos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaListadosDocumentos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaListadosDocumentos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoListadosDocumentos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteListadosDocumentos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosDocumentos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioListadosDocumentos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoListadosDocumentos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoListadosDocumentos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarListadosDocumentos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormListadosDocumentos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarListadosDocumentos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenListadosDocumentos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosListadosDocumentos.setToolTipText(this.jTableDatosListadosDocumentos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioListadosDocumentos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioListadosDocumentos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ListadosDocumentosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ListadosDocumentosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioListadosDocumentos() throws Exception {
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
	public void inicializarCombosForeignKeyListadosDocumentosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.tipomovimientosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyListadosDocumentosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ListadosDocumentosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyListadosDocumentos()throws Exception {
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
			if(this.listadosdocumentosSessionBean==null) {
				this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean();
			}

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.listadosdocumentosSessionBean.getisBusquedaDesdeForeignKeySesionTipoMovimiento()) {
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
	
	public void initActionsCombosTodosForeignKeyListadosDocumentos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyListadosDocumentos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyListadosDocumentos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyListadosDocumentos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyListadosDocumentos(ListadosDocumentos listadosdocumentos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyListadosDocumentos(ListadosDocumentos listadosdocumentos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyListadosDocumentos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyListadosDocumentos()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyListadosDocumentos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyListadosDocumentos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroListadosDocumentos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyListadosDocumentos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFrameTipoMovimientosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyListadosDocumentos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoMovimientosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyListadosDocumentos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.getItemCount()>0) {
				this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ListadosDocumentosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ListadosDocumentosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ListadosDocumentosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.listadosdocumentosSessionBean=new ListadosDocumentosSessionBean(); 
		this.listadosdocumentosConstantesFunciones=new ListadosDocumentosConstantesFunciones(); 
		this.listadosdocumentosBean=new ListadosDocumentos();//(this.listadosdocumentosConstantesFunciones); 		
		this.listadosdocumentosReturnGeneral=new ListadosDocumentosParameterReturnGeneral(); 
		
		this.listadosdocumentosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.listadosdocumentosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ListadosDocumentosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ListadosDocumentosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ListadosDocumentosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessListadosDocumentos(true);
			
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
			
			this.listadosdocumentosConstantesFunciones=new ListadosDocumentosConstantesFunciones(); 
			this.listadosdocumentosBean=new ListadosDocumentos();//this.listadosdocumentosConstantesFunciones); 			
			this.listadosdocumentosReturnGeneral=new ListadosDocumentosParameterReturnGeneral(); 
		
			ListadosDocumentosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Listados Documentos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.listadosdocumentos=new ListadosDocumentos();
			this.listadosdocumentoss = new ArrayList<ListadosDocumentos>();
			this.listadosdocumentossAux = new ArrayList<ListadosDocumentos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic=new ListadosDocumentosLogic();
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			//this.listadosdocumentosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.listadosdocumentosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormListadosDocumentos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosDocumentos);	
					}
					
					if(this.jInternalFrameImportacionListadosDocumentos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosDocumentos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByListadosDocumentos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByListadosDocumentos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosDocumentos);
				this.jInternalFrameDetalleFormListadosDocumentos.setVisible(false);
				this.jInternalFrameDetalleFormListadosDocumentos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosDocumentos);
					this.jInternalFrameReporteDinamicoListadosDocumentos.setVisible(false);
					this.jInternalFrameReporteDinamicoListadosDocumentos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionListadosDocumentos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionListadosDocumentos);
					this.jInternalFrameImportacionListadosDocumentos.setVisible(false);
					this.jInternalFrameImportacionListadosDocumentos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByListadosDocumentos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByListadosDocumentos);
					this.jInternalFrameOrderByListadosDocumentos.setVisible(false);
					this.jInternalFrameOrderByListadosDocumentos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idListadosDocumentosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ListadosDocumentosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.listadosdocumentosReturnGeneral=new ListadosDocumentosParameterReturnGeneral();
			
			this.listadosdocumentosParameterGeneral=new ListadosDocumentosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.listadosdocumentosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ListadosDocumentosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosDocumentosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),this.listadosdocumentosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ListadosDocumentosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),this.listadosdocumentosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaDuplicarListadosDocumentos=true;
			this.isVisibilidadCeldaCopiarListadosDocumentos=true;
			this.isVisibilidadCeldaVerFormListadosDocumentos=true;
			this.isVisibilidadCeldaOrdenListadosDocumentos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			
			
			this.isVisibilidadBusquedaListadosDocumentos=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoMovimiento=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosListadosDocumentos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioListadosDocumentos(false);
			
			this.setPermisosUsuarioListadosDocumentos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado() 
				|| (this.listadosdocumentosSessionBean.getEsGuardarRelacionado() && this.listadosdocumentosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioListadosDocumentosClasesRelacionadas();
			}
			
			if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioListadosDocumentosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosListadosDocumentos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualListadosDocumentos();
			}
			
			if(!this.isPermisoBusquedaListadosDocumentos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ListadosDocumentosConstantesFunciones.getTiposSeleccionarListadosDocumentos());
				
				this.tiposColumnasSelect=ListadosDocumentosConstantesFunciones.getTiposSeleccionarListadosDocumentos(true);
				
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
			//if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioListadosDocumentos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioListadosDocumentos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioListadosDocumentos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosDocumentos() ;
			
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
				listadosdocumentosImplementable= (ListadosDocumentosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosDocumentosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				listadosdocumentosImplementableHome= (ListadosDocumentosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ListadosDocumentosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.listadosdocumentoss= new ArrayList<ListadosDocumentos>();
			this.listadosdocumentossEliminados= new ArrayList<ListadosDocumentos>();
						
			this.isEsNuevoListadosDocumentos=false;
			this.esParaAccionDesdeFormularioListadosDocumentos=false;
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
				this.cargarCombosForeignKeyListadosDocumentos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroListadosDocumentos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ListadosDocumentosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ListadosDocumentosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesListadosDocumentos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingListadosDocumentos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioListadosDocumentos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioListadosDocumentos();
			}
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasListadosDocumentos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasListadosDocumentos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasListadosDocumentos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessListadosDocumentos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ListadosDocumentos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectListadosDocumentos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesListadosDocumentos")) {
				iIndex=this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessListadosDocumentos();	
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
	
	public void cargarCombosForeignKeyListadosDocumentos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyListadosDocumentos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyListadosDocumentos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyListadosDocumentosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyListadosDocumentos();
		
		this.cargarCombosFrameForeignKeyListadosDocumentos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyListadosDocumentos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyListadosDocumentos();
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
	
	public void jButtonNuevoListadosDocumentosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			
			if(jTableDatosListadosDocumentos.getRowCount()>=1) {
				jTableDatosListadosDocumentos.removeRowSelectionInterval(0, jTableDatosListadosDocumentos.getRowCount()-1);						
			}
			
			this.isEsNuevoListadosDocumentos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoListadosDocumentos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesListadosDocumentos(true);			
			//this.listadosdocumentos=new ListadosDocumentos();
			//this.listadosdocumentos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosDocumentos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosDocumentos() ;
			
			if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosDocumentos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.listadosdocumentos);	
			this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);				
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ListadosDocumentos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarListadosDocumentosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosListadosDocumentos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosListadosDocumentos.getSelectedRows().length;			
			}
			
			listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoListadosDocumentos--;			
				//ListadosDocumentos listadosdocumentosAux= new ListadosDocumentos();			
				//listadosdocumentosAux.setId(this.iIdNuevoListadosDocumentos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ListadosDocumentos listadosdocumentosOrigen=new ListadosDocumentos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ListadosDocumentos listadosdocumentosOrigen : listadosdocumentossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							listadosdocumentosOrigen =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							listadosdocumentosOrigen =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaListadosDocumentos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.listadosdocumentos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosListadosDocumentos(listadosdocumentosOrigen,this.listadosdocumentos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosdocumentosLogic.getListadosDocumentoss().add(this.listadosdocumentosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosdocumentoss.add(this.listadosdocumentosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
				
				this.jTableDatosListadosDocumentos.setRowSelectionInterval(this.getIndiceNuevoListadosDocumentos(), this.getIndiceNuevoListadosDocumentos());
				
				int iLastRow =  this.jTableDatosListadosDocumentos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosDocumentos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosDocumentos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosDocumentos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();									
		
			ListadosDocumentos listadosdocumentosOrigen=new ListadosDocumentos();
			ListadosDocumentos listadosdocumentosDestino=new ListadosDocumentos();
				
			listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosListadosDocumentos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || listadosdocumentossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosListadosDocumentos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosdocumentosOrigen =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosdocumentosOrigen =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						listadosdocumentosDestino =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						listadosdocumentosDestino =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				listadosdocumentosOrigen =listadosdocumentossSeleccionados.get(0);
				listadosdocumentosDestino =listadosdocumentossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosListadosDocumentos(listadosdocumentosOrigen,listadosdocumentosDestino,true,false);
				
				listadosdocumentosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(listadosdocumentosDestino,listadosdocumentosLogic.getListadosDocumentoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(listadosdocumentosDestino,listadosdocumentoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
				
				//this.jTableDatosListadosDocumentos.setRowSelectionInterval(this.getIndiceNuevoListadosDocumentos(), this.getIndiceNuevoListadosDocumentos());
				
				int iLastRow =  this.jTableDatosListadosDocumentos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosListadosDocumentos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosListadosDocumentos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosDocumentos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormListadosDocumentos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesListadosDocumentos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasListadosDocumentos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesListadosDocumentos.setVisible(!isVisible);
			this.jPanelPaginacionListadosDocumentos.setVisible(!isVisible);
			this.jPanelAccionesListadosDocumentos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameListadosDocumentos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoListadosDocumentos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionListadosDocumentos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByListadosDocumentos();
			
			this.abrirFrameOrderByListadosDocumentos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByListadosDocumentos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleListadosDocumentos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosDocumentos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormListadosDocumentos.isMaximum()) {
					this.jInternalFrameDetalleFormListadosDocumentos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormListadosDocumentos.setSize(this.jInternalFrameDetalleFormListadosDocumentos.iWidthFormulario,this.jInternalFrameDetalleFormListadosDocumentos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormListadosDocumentos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormListadosDocumentos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormListadosDocumentos.isMaximum()) {
						this.jInternalFrameDetalleFormListadosDocumentos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormListadosDocumentos.jContentPaneDetalleListadosDocumentos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormListadosDocumentos.jContentPaneDetalleListadosDocumentos.getWidth(),ListadosDocumentosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormListadosDocumentos.jContentPaneDetalleListadosDocumentos.getWidth(),ListadosDocumentosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormListadosDocumentos.jContentPaneDetalleListadosDocumentos.getWidth(),ListadosDocumentosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormListadosDocumentos.setVisible(true);
	        this.jInternalFrameDetalleFormListadosDocumentos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByListadosDocumentos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByListadosDocumentos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByListadosDocumentos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosDocumentos,false,this);
				} else {
					this.jInternalFrameOrderByListadosDocumentos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByListadosDocumentos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByListadosDocumentos);
				this.jInternalFrameOrderByListadosDocumentos.setVisible(false);
				this.jInternalFrameOrderByListadosDocumentos.setSelected(false);
				
				this.jInternalFrameOrderByListadosDocumentos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosDocumentos"));
				
				this.inicializarActualizarBindingTablaOrderByListadosDocumentos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionListadosDocumentos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionListadosDocumentos==null) {
				
				this.jInternalFrameImportacionListadosDocumentos=new ImportacionJInternalFrame(ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionListadosDocumentos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionListadosDocumentos);
				this.jInternalFrameImportacionListadosDocumentos.setVisible(false);
				this.jInternalFrameImportacionListadosDocumentos.setSelected(false);


				this.jInternalFrameImportacionListadosDocumentos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosDocumentos"));
				this.jInternalFrameImportacionListadosDocumentos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosDocumentos"));
				this.jInternalFrameImportacionListadosDocumentos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosDocumentos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoListadosDocumentos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoListadosDocumentos==null) {
				this.jInternalFrameReporteDinamicoListadosDocumentos=new ReporteDinamicoJInternalFrame(ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoListadosDocumentos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoListadosDocumentos);
				this.jInternalFrameReporteDinamicoListadosDocumentos.setVisible(false);
				this.jInternalFrameReporteDinamicoListadosDocumentos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosDocumentos"));
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosDocumentos"));
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosDocumentos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosDocumentos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleListadosDocumentos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormListadosDocumentos);
			
	       	this.jInternalFrameDetalleFormListadosDocumentos.setVisible(false);
	        this.jInternalFrameDetalleFormListadosDocumentos.setSelected(false);
			
			//this.jInternalFrameDetalleFormListadosDocumentos.dispose();
			//this.jInternalFrameDetalleFormListadosDocumentos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoListadosDocumentos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoListadosDocumentos.setVisible(true);
	        this.jInternalFrameReporteDinamicoListadosDocumentos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionListadosDocumentos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionListadosDocumentos.setVisible(true);
	        this.jInternalFrameImportacionListadosDocumentos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByListadosDocumentos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByListadosDocumentos.setVisible(true);
	        this.jInternalFrameOrderByListadosDocumentos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByListadosDocumentos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByListadosDocumentos.setVisible(false);
	        this.jInternalFrameOrderByListadosDocumentos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoListadosDocumentos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoListadosDocumentos.setVisible(false);
	        this.jInternalFrameReporteDinamicoListadosDocumentos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionListadosDocumentos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionListadosDocumentos.setVisible(false);
	        this.jInternalFrameImportacionListadosDocumentos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarListadosDocumentos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarListadosDocumentos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesListadosDocumentos(true);
			//this.isEsNuevoListadosDocumentos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesListadosDocumentos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosDocumentos(false) ;
			
			if(listadosdocumentosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosDocumentos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosDocumentos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaListadosDocumentosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarListadosDocumentos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesListadosDocumentos(true);
			//this.isEsNuevoListadosDocumentos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.listadosdocumentos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesListadosDocumentos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesListadosDocumentos(false) ;
			
			if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleListadosDocumentos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosDocumentos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaTipoMovimiento(List<TipoMovimiento> tipomovimientosForeignKey)throws Exception{
		TableColumn tableColumnTipoMovimiento=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO));
		TableCellEditor tableCellEditorTipoMovimiento =tableColumnTipoMovimiento.getCellEditor();

		TipoMovimientoTableCell tipomovimientoTableCellFk=(TipoMovimientoTableCell)tableCellEditorTipoMovimiento;

		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.settipomovimientosForeignKey(tipomovimientosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosListadosDocumentos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipomovimientoTableCellFk.setRowActual(intSelectedRow);
			//tipomovimientoTableCellFk.settipomovimientosForeignKeyActual(tipomovimientosForeignKey);
		//}


		if(tipomovimientoTableCellFk!=null) {
			tipomovimientoTableCellFk.RecargarTipoMovimientosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesListadosDocumentos(false);
			
			//if(!this.isEsNuevoListadosDocumentos) {								
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				
			}
			
			if(this.permiteMantenimiento(this.listadosdocumentos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoListadosDocumentos=true;
					this.inicializarActualizarBindingTablaListadosDocumentos(false);
					this.isEsNuevoListadosDocumentos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoListadosDocumentos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoListadosDocumentos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosDocumentos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosDocumentos(false);
				
				this.habilitarDeshabilitarControlesListadosDocumentos(false);
			
												
				
				if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleListadosDocumentos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoListadosDocumentosActionPerformed(evt,listadosdocumentosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualListadosDocumentos(this.listadosdocumentos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosListadosDocumentos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,listadosdocumentosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.listadosdocumentos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				this.listadosdocumentos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				this.listadosdocumentos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.listadosdocumentos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ListadosDocumentosModel) this.jTableDatosListadosDocumentos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoListadosDocumentos=true;
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
				this.isEsNuevoListadosDocumentos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesListadosDocumentos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosDocumentos(false);
				
				this.habilitarDeshabilitarControlesListadosDocumentos(false);
				
				
				
				if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleListadosDocumentos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosListadosDocumentos.getRowCount()>=1) {
				jTableDatosListadosDocumentos.removeRowSelectionInterval(0, jTableDatosListadosDocumentos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesListadosDocumentos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaListadosDocumentos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesListadosDocumentos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualListadosDocumentos(false) ;
			
			this.isEsNuevoListadosDocumentos=false;
			
			if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleListadosDocumentos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingListadosDocumentos(false);
				
				//SI ES MANUAL
				if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualListadosDocumentos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoListadosDocumentos--;			
			//ListadosDocumentos listadosdocumentosAux= new ListadosDocumentos();			
			//listadosdocumentosAux.setId(this.iIdNuevoListadosDocumentos);
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaListadosDocumentos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
			
			this.listadosdocumentos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.listadosdocumentosLogic.getListadosDocumentoss().add(this.listadosdocumentosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.listadosdocumentoss.add(this.listadosdocumentosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaListadosDocumentos(false);
			
			this.jTableDatosListadosDocumentos.setRowSelectionInterval(this.getIndiceNuevoListadosDocumentos(), this.getIndiceNuevoListadosDocumentos());
			
			int iLastRow =  this.jTableDatosListadosDocumentos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosListadosDocumentos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosListadosDocumentos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosDocumentos(false);
			
			//SI ES MANUAL
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosDocumentos();
			}
			
			//this.abrirFrameTreeListadosDocumentos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionListadosDocumentos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionListadosDocumentos.setFileImportacion(this.jInternalFrameImportacionListadosDocumentos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionListadosDocumentos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionListadosDocumentos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionListadosDocumentos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionListadosDocumentos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		

		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ListadosDocumentosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ListadosDocumentosBaseDesign.jrxml";
			
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
			
			this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosDocumentosConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_poMovimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_poMovimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_poMovimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_poMovimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiarioCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiarioCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiarioCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiarioCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMayor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMayor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMayor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMayor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFinalizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFinalizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFinalizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFinalizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUsuario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUsuario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUsuario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUsuario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ListadosDocumentosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoria="tipo_movimiento";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE:
					sNombreCampoCategoria="beneficiario_cheque";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoria="valor_cheque";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoria="nombre_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA:
					sNombreCampoCategoria="ruc_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA:
					sNombreCampoCategoria="direccion_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoria="numero_mayor";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION:
					sNombreCampoCategoria="fecha_finalizacion";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoria="nombre_usuario";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ListadosDocumentosConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					sNombreCampoCategoriaValor="tipo_movimiento";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE:
					sNombreCampoCategoriaValor="beneficiario_cheque";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE:
					sNombreCampoCategoriaValor="valor_cheque";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA:
					sNombreCampoCategoriaValor="nombre_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA:
					sNombreCampoCategoriaValor="ruc_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA:
					sNombreCampoCategoriaValor="direccion_empresa";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR:
					sNombreCampoCategoriaValor="numero_mayor";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION:
					sNombreCampoCategoriaValor="fecha_finalizacion";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO:
					sNombreCampoCategoriaValor="nombre_usuario";
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ListadosDocumentosConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Movimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo_movimiento");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario_cheque");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_cheque");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_empresa");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_empresa");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_empresa");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Mayor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_mayor");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Finalizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_finalizacion");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Usuario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_usuario");
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
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
	
	public void jButtonGenerarExcelReporteDinamicoListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ListadosDocumentoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.gettipomovimiento_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.gettipo_movimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getbeneficiario_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getdetalle());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getvalor_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getnombre_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getruc_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getdireccion_empresa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getnumero_mayor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getfecha_finalizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getnombre_usuario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(ListadosDocumentos listadosdocumentos:listadosdocumentossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(listadosdocumentos.getnumero_cheque());
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
			//	this.getFilaCabeceraExportarExcelListadosDocumentos(row);				
			//	iRow++;
			//}				
			
			//for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelListadosDocumentos(listadosdocumentosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
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
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosDocumentos(false);
			
			//SI ES MANUAL
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualListadosDocumentos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosDocumentos(false);
			
			//SI ES MANUAL
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosDocumentos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingListadosDocumentos(false);
			
			//SI ES MANUAL
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualListadosDocumentos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaListadosDocumentos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosListadosDocumentos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosListadosDocumentos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosListadosDocumentos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosListadosDocumentos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosListadosDocumentos.setMinimumSize(dimensionMinimum);
		this.jTableDatosListadosDocumentos.setMaximumSize(dimensionMaximum);
		this.jTableDatosListadosDocumentos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingListadosDocumentos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingListadosDocumentos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingListadosDocumentos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaListadosDocumentos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesListadosDocumentos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasListadosDocumentos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosDocumentos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesListadosDocumentos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualListadosDocumentos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaListadosDocumentos();
		
		this.inicializarActualizarBindingBotonesManualListadosDocumentos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualListadosDocumentos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesListadosDocumentos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualListadosDocumentos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualListadosDocumentos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosListadosDocumentos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosListadosDocumentos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteListadosDocumentos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionNuevoListadosDocumentos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionSinCerrarListadosDocumentos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionSinMensajeListadosDocumentos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosListadosDocumentos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosListadosDocumentos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteListadosDocumentos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
				this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionNuevoListadosDocumentos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionSinCerrarListadosDocumentos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormListadosDocumentos.jCheckBoxPostAccionSinMensajeListadosDocumentos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionListadosDocumentos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionListadosDocumentos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesListadosDocumentos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesListadosDocumentos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesListadosDocumentos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarListadosDocumentos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesListadosDocumentos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesListadosDocumentos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralListadosDocumentos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesListadosDocumentos(Boolean esInicializar) throws Exception {
		try	{	
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualListadosDocumentos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesListadosDocumentos() throws Exception {
		try	{
			if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosDocumentos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosDocumentos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualListadosDocumentos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesListadosDocumentos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesListadosDocumentos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesListadosDocumentos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionListadosDocumentos.addItem(reporte);
			}
			
			
			if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionListadosDocumentos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionListadosDocumentos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesListadosDocumentos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesListadosDocumentos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarListadosDocumentos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarListadosDocumentos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarListadosDocumentos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosDocumentos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualListadosDocumentos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
				
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ListadosDocumentosConstantesFunciones.getTiposSeleccionarListadosDocumentos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ListadosDocumentosConstantesFunciones.getTiposSeleccionarListadosDocumentos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ListadosDocumentosConstantesFunciones.getTiposSeleccionarListadosDocumentos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoListadosDocumentos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualListadosDocumentos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.getSelectedItem()!=null){this.id_ejercicioBusquedaListadosDocumentos=((Ejercicio)this.jComboBoxid_ejercicioBusquedaListadosDocumentosListadosDocumentos.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.getSelectedItem()!=null){this.id_tipo_movimientoBusquedaListadosDocumentos=((TipoMovimiento)this.jComboBoxid_tipo_movimientoBusquedaListadosDocumentosListadosDocumentos.getSelectedItem()).getId();}
		this.fecha_desdeBusquedaListadosDocumentos=new Date(this.jDateChooserfecha_desdeBusquedaListadosDocumentosListadosDocumentos.getDate().getTime());
		this.fecha_hastaBusquedaListadosDocumentos=new Date(this.jDateChooserfecha_hastaBusquedaListadosDocumentosListadosDocumentos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasListadosDocumentos(Boolean esInicializar) throws Exception {				
		if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualListadosDocumentos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaListadosDocumentos() throws Exception {
		this.inicializarActualizarBindingTablaListadosDocumentos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByListadosDocumentos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosListadosDocumentosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaListadosDocumentos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=listadosdocumentosLogic.getListadosDocumentoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=listadosdocumentoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosListadosDocumentos.setModel(new ListadosDocumentosModel(this.listadosdocumentosLogic.getListadosDocumentoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosListadosDocumentos.setModel(new ListadosDocumentosModel(this.listadosdocumentoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByListadosDocumentos!=null && this.jInternalFrameOrderByListadosDocumentos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByListadosDocumentos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,listadosdocumentosConstantesFunciones.resaltarSeleccionarListadosDocumentos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ListadosDocumentosConstantesFunciones.SCLASSWEBTITULO,listadosdocumentosConstantesFunciones.resaltarSeleccionarListadosDocumentos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_ID));

		if(this.listadosdocumentosConstantesFunciones.mostraridListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosdocumentosConstantesFunciones.resaltaridListadosDocumentos,this.listadosdocumentosConstantesFunciones.activaridListadosDocumentos,iSizeTabla,this,true,"idListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltaridListadosDocumentos,this.listadosdocumentosConstantesFunciones.activaridListadosDocumentos,this,true,"idListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_FECHA));

		if(this.listadosdocumentosConstantesFunciones.mostrarfechaListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadosdocumentosConstantesFunciones.resaltarfechaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfechaListadosDocumentos,iSizeTabla,this,true,"fechaListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarfechaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfechaListadosDocumentos,this,true,"fechaListadosDocumentos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO));

		if(this.listadosdocumentosConstantesFunciones.mostrartipo_movimientoListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltartipo_movimientoListadosDocumentos,this.listadosdocumentosConstantesFunciones.activartipo_movimientoListadosDocumentos,iSizeTabla,this,true,"tipo_movimientoListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltartipo_movimientoListadosDocumentos,this.listadosdocumentosConstantesFunciones.activartipo_movimientoListadosDocumentos,this,true,"tipo_movimientoListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_CODIGO));

		if(this.listadosdocumentosConstantesFunciones.mostrarcodigoListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarcodigoListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarcodigoListadosDocumentos,iSizeTabla,this,true,"codigoListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarcodigoListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarcodigoListadosDocumentos,this,true,"codigoListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.listadosdocumentosConstantesFunciones.mostrarbeneficiarioListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarbeneficiarioListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarbeneficiarioListadosDocumentos,iSizeTabla,this,true,"beneficiarioListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarbeneficiarioListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarbeneficiarioListadosDocumentos,this,true,"beneficiarioListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE));

		if(this.listadosdocumentosConstantesFunciones.mostrarbeneficiario_chequeListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarbeneficiario_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarbeneficiario_chequeListadosDocumentos,iSizeTabla,this,true,"beneficiario_chequeListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarbeneficiario_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarbeneficiario_chequeListadosDocumentos,this,true,"beneficiario_chequeListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_DETALLE));

		if(this.listadosdocumentosConstantesFunciones.mostrardetalleListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltardetalleListadosDocumentos,this.listadosdocumentosConstantesFunciones.activardetalleListadosDocumentos,iSizeTabla,this,true,"detalleListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltardetalleListadosDocumentos,this.listadosdocumentosConstantesFunciones.activardetalleListadosDocumentos,this,true,"detalleListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE));

		if(this.listadosdocumentosConstantesFunciones.mostrarvalor_chequeListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosdocumentosConstantesFunciones.resaltarvalor_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarvalor_chequeListadosDocumentos,iSizeTabla,this,true,"valor_chequeListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarvalor_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarvalor_chequeListadosDocumentos,this,true,"valor_chequeListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA));

		if(this.listadosdocumentosConstantesFunciones.mostrarnombre_empresaListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_empresaListadosDocumentos,iSizeTabla,this,true,"nombre_empresaListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_empresaListadosDocumentos,this,true,"nombre_empresaListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA));

		if(this.listadosdocumentosConstantesFunciones.mostrarruc_empresaListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarruc_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarruc_empresaListadosDocumentos,iSizeTabla,this,true,"ruc_empresaListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarruc_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarruc_empresaListadosDocumentos,this,true,"ruc_empresaListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA));

		if(this.listadosdocumentosConstantesFunciones.mostrardireccion_empresaListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltardireccion_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activardireccion_empresaListadosDocumentos,iSizeTabla,this,true,"direccion_empresaListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltardireccion_empresaListadosDocumentos,this.listadosdocumentosConstantesFunciones.activardireccion_empresaListadosDocumentos,this,true,"direccion_empresaListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.listadosdocumentosConstantesFunciones.mostrarnombre_sucursalListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_sucursalListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_sucursalListadosDocumentos,iSizeTabla,this,true,"nombre_sucursalListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_sucursalListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_sucursalListadosDocumentos,this,true,"nombre_sucursalListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_VALOR));

		if(this.listadosdocumentosConstantesFunciones.mostrarvalorListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.listadosdocumentosConstantesFunciones.resaltarvalorListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarvalorListadosDocumentos,iSizeTabla,this,true,"valorListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarvalorListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarvalorListadosDocumentos,this,true,"valorListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR));

		if(this.listadosdocumentosConstantesFunciones.mostrarnumero_mayorListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarnumero_mayorListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnumero_mayorListadosDocumentos,iSizeTabla,this,true,"numero_mayorListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarnumero_mayorListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnumero_mayorListadosDocumentos,this,true,"numero_mayorListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.listadosdocumentosConstantesFunciones.mostrarfecha_emisionListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadosdocumentosConstantesFunciones.resaltarfecha_emisionListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfecha_emisionListadosDocumentos,iSizeTabla,this,true,"fecha_emisionListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarfecha_emisionListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfecha_emisionListadosDocumentos,this,true,"fecha_emisionListadosDocumentos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION));

		if(this.listadosdocumentosConstantesFunciones.mostrarfecha_finalizacionListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.listadosdocumentosConstantesFunciones.resaltarfecha_finalizacionListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfecha_finalizacionListadosDocumentos,iSizeTabla,this,true,"fecha_finalizacionListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarfecha_finalizacionListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarfecha_finalizacionListadosDocumentos,this,true,"fecha_finalizacionListadosDocumentos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO));

		if(this.listadosdocumentosConstantesFunciones.mostrarnombre_usuarioListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_usuarioListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_usuarioListadosDocumentos,iSizeTabla,this,true,"nombre_usuarioListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarnombre_usuarioListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnombre_usuarioListadosDocumentos,this,true,"nombre_usuarioListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.listadosdocumentosConstantesFunciones.mostrarnumero_chequeListadosDocumentos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.listadosdocumentosConstantesFunciones.resaltarnumero_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnumero_chequeListadosDocumentos,iSizeTabla,this,true,"numero_chequeListadosDocumentos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.listadosdocumentosConstantesFunciones.resaltarnumero_chequeListadosDocumentos,this.listadosdocumentosConstantesFunciones.activarnumero_chequeListadosDocumentos,this,true,"numero_chequeListadosDocumentos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ListadosDocumentosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosDocumentos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosListadosDocumentos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosListadosDocumentos.addColumn(tableColumn);
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
			
			this.jTableDatosListadosDocumentos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosListadosDocumentos.moveColumn(this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosListadosDocumentos.moveColumn(this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosListadosDocumentos.moveColumn(this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosListadosDocumentos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosListadosDocumentos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosListadosDocumentos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosListadosDocumentos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosListadosDocumentos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosListadosDocumentos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosListadosDocumentos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosListadosDocumentos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=listadosdocumentosLogic.getListadosDocumentoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=listadosdocumentoss.size()-1;
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
		//this.jTableDatosListadosDocumentos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosListadosDocumentos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosListadosDocumentos();
			
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
				
				//this.isEsNuevoListadosDocumentos=false;
					
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
				if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormListadosDocumentos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosDocumentos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosDocumentos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.listadosdocumentos.getsType().equals("DUPLICADO")
				   || this.listadosdocumentos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoListadosDocumentos=true;
				
				} else {
					this.isEsNuevoListadosDocumentos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
					if(this.listadosdocumentos.getId()>=0 && !this.listadosdocumentos.getIsNew()) {						
						this.isEsNuevoListadosDocumentos=false;
						
					} else {
						this.isEsNuevoListadosDocumentos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoListadosDocumentos(esRelaciones);						
				
				this.seleccionarListadosDocumentos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.listadosdocumentos.getId()<0) {
					this.isEsNuevoListadosDocumentos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarListadosDocumentos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarListadosDocumentos(evt,rowIndex);
				}	
				
				if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ListadosDocumentos: " + this.dDif); 
					}
				}								
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarListadosDocumentos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.listadosdocumentos)) {
					if(this.listadosdocumentos.getId()>0) {
						this.listadosdocumentos.setIsDeleted(true);
						
						this.listadosdocumentossEliminados.add(this.listadosdocumentos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.listadosdocumentosLogic.getListadosDocumentoss().remove(this.listadosdocumentos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.listadosdocumentoss.remove(this.listadosdocumentos);				
					}
					
					
					((ListadosDocumentosModel) this.jTableDatosListadosDocumentos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaListadosDocumentos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarListadosDocumentos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoListadosDocumentos) {
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosListadosDocumentos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosListadosDocumentos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesListadosDocumentos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesListadosDocumentos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualListadosDocumentos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosDocumentos(ListadosDocumentos listadosdocumentos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoListadosDocumentos(listadosdocumentos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoListadosDocumentos(ListadosDocumentos listadosdocumentos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioListadosDocumentos(listadosdocumentos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyListadosDocumentos(listadosdocumentos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyListadosDocumentos(listadosdocumentos);
	}
	
	public void setVariablesObjetoActualToFormularioListadosDocumentos(ListadosDocumentos listadosdocumentos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setText(listadosdocumentos.getId().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setDate(listadosdocumentos.getfecha());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setText(listadosdocumentos.gettipo_movimiento());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setText(listadosdocumentos.getcodigo());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setText(listadosdocumentos.getbeneficiario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setText(listadosdocumentos.getbeneficiario_cheque());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setText(listadosdocumentos.getdetalle());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setText(listadosdocumentos.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setText(listadosdocumentos.getnombre_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setText(listadosdocumentos.getruc_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setText(listadosdocumentos.getdireccion_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setText(listadosdocumentos.getnombre_sucursal());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setText(listadosdocumentos.getvalor().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setText(listadosdocumentos.getnumero_mayor());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setDate(listadosdocumentos.getfecha_emision());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setDate(listadosdocumentos.getfecha_finalizacion());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setText(listadosdocumentos.getnombre_usuario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setText(listadosdocumentos.getnumero_cheque());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ListadosDocumentos listadosdocumentosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,listadosdocumentosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ListadosDocumentos listadosdocumentosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				listadosdocumentosLocal=this.listadosdocumentos;
			} else {
				listadosdocumentosLocal=this.listadosdocumentosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(listadosdocumentosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoListadosDocumentos(listadosdocumentosLocal,true);
					
					if(listadosdocumentosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(listadosdocumentosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(listadosdocumentosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoListadosDocumentos(ListadosDocumentos listadosdocumentos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosDocumentos(listadosdocumentos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(listadosdocumentos);
	}
	
	public void setVariablesFormularioToObjetoActualListadosDocumentos(ListadosDocumentos listadosdocumentos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualListadosDocumentos(listadosdocumentos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualListadosDocumentos(ListadosDocumentos listadosdocumentos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.getText()==null || this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.getText()=="" || this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.getText()=="Id") {
				this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setText("0");
			}

			if(conColumnasBase) {listadosdocumentos.setId(Long.parseLong(this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelIdListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setfecha(this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfechaListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.settipo_movimiento(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeltipo_movimientoListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setcodigo(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelcodigoListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setbeneficiario(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiarioListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setbeneficiario_cheque(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelbeneficiario_chequeListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setdetalle(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldetalleListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setvalor_cheque(Double.parseDouble(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalor_chequeListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setnombre_empresa(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_empresaListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setruc_empresa(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelruc_empresaListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setdireccion_empresa(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabeldireccion_empresaListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setnombre_sucursal(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_sucursalListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelvalorListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setnumero_mayor(this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_mayorListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setfecha_emision(this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_emisionListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setfecha_finalizacion(this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelfecha_finalizacionListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setnombre_usuario(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnombre_usuarioListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			listadosdocumentos.setnumero_cheque(this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormListadosDocumentos.jLabelnumero_chequeListadosDocumentos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualListadosDocumentos(ListadosDocumentos listadosdocumentosBean,ListadosDocumentos listadosdocumentos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosListadosDocumentos(ListadosDocumentos listadosdocumentosOrigen,ListadosDocumentos listadosdocumentos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadosdocumentosOrigen.getId()!=null && !listadosdocumentosOrigen.getId().equals(0L))) {listadosdocumentos.setId(listadosdocumentosOrigen.getId());}}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getfecha_desde()!=null && !listadosdocumentosOrigen.getfecha_desde().equals(new Date()))) {listadosdocumentos.setfecha_desde(listadosdocumentosOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getfecha_hasta()!=null && !listadosdocumentosOrigen.getfecha_hasta().equals(new Date()))) {listadosdocumentos.setfecha_hasta(listadosdocumentosOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getfecha()!=null && !listadosdocumentosOrigen.getfecha().equals(new Date()))) {listadosdocumentos.setfecha(listadosdocumentosOrigen.getfecha());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.gettipo_movimiento()!=null && !listadosdocumentosOrigen.gettipo_movimiento().equals(""))) {listadosdocumentos.settipo_movimiento(listadosdocumentosOrigen.gettipo_movimiento());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getcodigo()!=null && !listadosdocumentosOrigen.getcodigo().equals(""))) {listadosdocumentos.setcodigo(listadosdocumentosOrigen.getcodigo());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getbeneficiario()!=null && !listadosdocumentosOrigen.getbeneficiario().equals(""))) {listadosdocumentos.setbeneficiario(listadosdocumentosOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getbeneficiario_cheque()!=null && !listadosdocumentosOrigen.getbeneficiario_cheque().equals(""))) {listadosdocumentos.setbeneficiario_cheque(listadosdocumentosOrigen.getbeneficiario_cheque());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getdetalle()!=null && !listadosdocumentosOrigen.getdetalle().equals(""))) {listadosdocumentos.setdetalle(listadosdocumentosOrigen.getdetalle());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getvalor_cheque()!=null && !listadosdocumentosOrigen.getvalor_cheque().equals(0.0))) {listadosdocumentos.setvalor_cheque(listadosdocumentosOrigen.getvalor_cheque());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getnombre_empresa()!=null && !listadosdocumentosOrigen.getnombre_empresa().equals(""))) {listadosdocumentos.setnombre_empresa(listadosdocumentosOrigen.getnombre_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getruc_empresa()!=null && !listadosdocumentosOrigen.getruc_empresa().equals(""))) {listadosdocumentos.setruc_empresa(listadosdocumentosOrigen.getruc_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getdireccion_empresa()!=null && !listadosdocumentosOrigen.getdireccion_empresa().equals(""))) {listadosdocumentos.setdireccion_empresa(listadosdocumentosOrigen.getdireccion_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getnombre_sucursal()!=null && !listadosdocumentosOrigen.getnombre_sucursal().equals(""))) {listadosdocumentos.setnombre_sucursal(listadosdocumentosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getvalor()!=null && !listadosdocumentosOrigen.getvalor().equals(0.0))) {listadosdocumentos.setvalor(listadosdocumentosOrigen.getvalor());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getnumero_mayor()!=null && !listadosdocumentosOrigen.getnumero_mayor().equals(""))) {listadosdocumentos.setnumero_mayor(listadosdocumentosOrigen.getnumero_mayor());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getfecha_emision()!=null && !listadosdocumentosOrigen.getfecha_emision().equals(new Date()))) {listadosdocumentos.setfecha_emision(listadosdocumentosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getfecha_finalizacion()!=null && !listadosdocumentosOrigen.getfecha_finalizacion().equals(new Date()))) {listadosdocumentos.setfecha_finalizacion(listadosdocumentosOrigen.getfecha_finalizacion());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getnombre_usuario()!=null && !listadosdocumentosOrigen.getnombre_usuario().equals(""))) {listadosdocumentos.setnombre_usuario(listadosdocumentosOrigen.getnombre_usuario());}
			if(conDefault || (!conDefault && listadosdocumentosOrigen.getnumero_cheque()!=null && !listadosdocumentosOrigen.getnumero_cheque().equals(""))) {listadosdocumentos.setnumero_cheque(listadosdocumentosOrigen.getnumero_cheque());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosDocumentos(ListadosDocumentos listadosdocumentos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setText(listadosdocumentos.getId().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setDate(listadosdocumentos.getfecha());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setText(listadosdocumentos.gettipo_movimiento());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setText(listadosdocumentos.getcodigo());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setText(listadosdocumentos.getbeneficiario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setText(listadosdocumentos.getbeneficiario_cheque());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setText(listadosdocumentos.getdetalle());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setText(listadosdocumentos.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setText(listadosdocumentos.getnombre_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setText(listadosdocumentos.getruc_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setText(listadosdocumentos.getdireccion_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setText(listadosdocumentos.getnombre_sucursal());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setText(listadosdocumentos.getvalor().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setText(listadosdocumentos.getnumero_mayor());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setDate(listadosdocumentos.getfecha_emision());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setDate(listadosdocumentos.getfecha_finalizacion());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setText(listadosdocumentos.getnombre_usuario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setText(listadosdocumentos.getnumero_cheque());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioListadosDocumentos(ListadosDocumentosBean listadosdocumentosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setText(listadosdocumentosBean.getId().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setDate(listadosdocumentosBean.getfecha());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setText(listadosdocumentosBean.gettipo_movimiento());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setText(listadosdocumentosBean.getcodigo());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setText(listadosdocumentosBean.getbeneficiario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setText(listadosdocumentosBean.getbeneficiario_cheque());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setText(listadosdocumentosBean.getdetalle());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setText(listadosdocumentosBean.getvalor_cheque().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setText(listadosdocumentosBean.getnombre_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setText(listadosdocumentosBean.getruc_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setText(listadosdocumentosBean.getdireccion_empresa());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setText(listadosdocumentosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setText(listadosdocumentosBean.getvalor().toString());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setText(listadosdocumentosBean.getnumero_mayor());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setDate(listadosdocumentosBean.getfecha_emision());
			this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setDate(listadosdocumentosBean.getfecha_finalizacion());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setText(listadosdocumentosBean.getnombre_usuario());
			this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setText(listadosdocumentosBean.getnumero_cheque());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanListadosDocumentos(ListadosDocumentosParameterReturnGeneral listadosdocumentosReturnGeneral,ListadosDocumentosBean listadosdocumentosBean,Boolean conDefault) throws Exception { 
		try {
			ListadosDocumentos listadosdocumentosLocal=new ListadosDocumentos();
			
			listadosdocumentosLocal=listadosdocumentosReturnGeneral.getListadosDocumentos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && listadosdocumentosLocal.getId()!=null && !listadosdocumentosLocal.getId().equals(0L))) {listadosdocumentosBean.setId(listadosdocumentosLocal.getId());}}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getfecha()!=null && !listadosdocumentosLocal.getfecha().equals(new Date()))) {listadosdocumentosBean.setfecha(listadosdocumentosLocal.getfecha());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.gettipo_movimiento()!=null && !listadosdocumentosLocal.gettipo_movimiento().equals(""))) {listadosdocumentosBean.settipo_movimiento(listadosdocumentosLocal.gettipo_movimiento());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getcodigo()!=null && !listadosdocumentosLocal.getcodigo().equals(""))) {listadosdocumentosBean.setcodigo(listadosdocumentosLocal.getcodigo());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getbeneficiario()!=null && !listadosdocumentosLocal.getbeneficiario().equals(""))) {listadosdocumentosBean.setbeneficiario(listadosdocumentosLocal.getbeneficiario());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getbeneficiario_cheque()!=null && !listadosdocumentosLocal.getbeneficiario_cheque().equals(""))) {listadosdocumentosBean.setbeneficiario_cheque(listadosdocumentosLocal.getbeneficiario_cheque());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getdetalle()!=null && !listadosdocumentosLocal.getdetalle().equals(""))) {listadosdocumentosBean.setdetalle(listadosdocumentosLocal.getdetalle());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getvalor_cheque()!=null && !listadosdocumentosLocal.getvalor_cheque().equals(0.0))) {listadosdocumentosBean.setvalor_cheque(listadosdocumentosLocal.getvalor_cheque());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getnombre_empresa()!=null && !listadosdocumentosLocal.getnombre_empresa().equals(""))) {listadosdocumentosBean.setnombre_empresa(listadosdocumentosLocal.getnombre_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getruc_empresa()!=null && !listadosdocumentosLocal.getruc_empresa().equals(""))) {listadosdocumentosBean.setruc_empresa(listadosdocumentosLocal.getruc_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getdireccion_empresa()!=null && !listadosdocumentosLocal.getdireccion_empresa().equals(""))) {listadosdocumentosBean.setdireccion_empresa(listadosdocumentosLocal.getdireccion_empresa());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getnombre_sucursal()!=null && !listadosdocumentosLocal.getnombre_sucursal().equals(""))) {listadosdocumentosBean.setnombre_sucursal(listadosdocumentosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getvalor()!=null && !listadosdocumentosLocal.getvalor().equals(0.0))) {listadosdocumentosBean.setvalor(listadosdocumentosLocal.getvalor());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getnumero_mayor()!=null && !listadosdocumentosLocal.getnumero_mayor().equals(""))) {listadosdocumentosBean.setnumero_mayor(listadosdocumentosLocal.getnumero_mayor());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getfecha_emision()!=null && !listadosdocumentosLocal.getfecha_emision().equals(new Date()))) {listadosdocumentosBean.setfecha_emision(listadosdocumentosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getfecha_finalizacion()!=null && !listadosdocumentosLocal.getfecha_finalizacion().equals(new Date()))) {listadosdocumentosBean.setfecha_finalizacion(listadosdocumentosLocal.getfecha_finalizacion());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getnombre_usuario()!=null && !listadosdocumentosLocal.getnombre_usuario().equals(""))) {listadosdocumentosBean.setnombre_usuario(listadosdocumentosLocal.getnombre_usuario());}
			if(conDefault || (!conDefault && listadosdocumentosLocal.getnumero_cheque()!=null && !listadosdocumentosLocal.getnumero_cheque().equals(""))) {listadosdocumentosBean.setnumero_cheque(listadosdocumentosLocal.getnumero_cheque());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxListadosDocumentosGenerico(Long idListadosDocumentosSeleccionado,JComboBox jComboBoxListadosDocumentos,List<ListadosDocumentos> listadosdocumentossLocal)throws Exception {
		try {
			ListadosDocumentos  listadosdocumentosTemp=null;

			for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossLocal) {
				if(listadosdocumentosAux.getId()!=null && listadosdocumentosAux.getId().equals(idListadosDocumentosSeleccionado)) {
					listadosdocumentosTemp=listadosdocumentosAux;
					break;
				}
			}

			jComboBoxListadosDocumentos.setSelectedItem(listadosdocumentosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxListadosDocumentosGenerico(JComboBox jComboBoxListadosDocumentos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosDocumentos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxListadosDocumentos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxListadosDocumentos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxListadosDocumentos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxListadosDocumentos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxListadosDocumentos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosdocumentos=(ListadosDocumentos) listadosdocumentosLogic.getListadosDocumentoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosdocumentos =(ListadosDocumentos) listadosdocumentoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!listadosdocumentos.getIsNew() && !listadosdocumentos.getIsChanged() && !listadosdocumentos.getIsDeleted()) {
				sDescripcion=listadosdocumentos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=listadosdocumentos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!listadosdocumentos.getIsNew() && !listadosdocumentos.getIsChanged() && !listadosdocumentos.getIsDeleted()) {
				sDescripcion=listadosdocumentos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=listadosdocumentos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!listadosdocumentos.getIsNew() && !listadosdocumentos.getIsChanged() && !listadosdocumentos.getIsDeleted()) {
				sDescripcion=listadosdocumentos.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=listadosdocumentos.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("TipoMovimiento")) {
			//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
			if(!listadosdocumentos.getIsNew() && !listadosdocumentos.getIsChanged() && !listadosdocumentos.getIsDeleted()) {
				sDescripcion=listadosdocumentos.gettipomovimiento_descripcion();
			} else {
				//sDescripcion=this.getActualTipoMovimientoForeignKeyDescripcion((Long)value);
				sDescripcion=listadosdocumentos.gettipomovimiento_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ListadosDocumentos listadosdocumentosRow=new ListadosDocumentos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosdocumentosRow=(ListadosDocumentos) listadosdocumentosLogic.getListadosDocumentoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			listadosdocumentosRow=(ListadosDocumentos) listadosdocumentoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualListadosDocumentos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos));			
			this.jButtonDuplicarListadosDocumentos.setVisible((this.isVisibilidadCeldaDuplicarListadosDocumentos && this.isPermisoDuplicarListadosDocumentos));			
			this.jButtonCopiarListadosDocumentos.setVisible((this.isVisibilidadCeldaCopiarListadosDocumentos && this.isPermisoCopiarListadosDocumentos));
			this.jButtonVerFormListadosDocumentos.setVisible((this.isVisibilidadCeldaVerFormListadosDocumentos && this.isPermisoVerFormListadosDocumentos));
			
			this.jButtonAbrirOrderByListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));			
			
			this.jButtonNuevoRelacionesListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos && this.isPermisoNuevoListadosDocumentos));			
			this.jButtonNuevoGuardarCambiosListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarListadosDocumentos.setVisible((this.isVisibilidadCeldaModificarListadosDocumentos && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.setVisible((this.isVisibilidadCeldaActualizarListadosDocumentos && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.setVisible((this.isVisibilidadCeldaEliminarListadosDocumentos && this.isPermisoEliminarListadosDocumentos));
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.setVisible(this.isVisibilidadCeldaCancelarListadosDocumentos);							
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));			
			
			}
						
			this.jButtonGuardarCambiosTablaListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos));						
			this.jButtonDuplicarToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaDuplicarListadosDocumentos && this.isPermisoDuplicarListadosDocumentos));						
			this.jButtonCopiarToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaCopiarListadosDocumentos && this.isPermisoCopiarListadosDocumentos));			
			this.jButtonVerFormToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaVerFormListadosDocumentos && this.isPermisoVerFormListadosDocumentos));			
			this.jButtonAbrirOrderByToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));
			this.jButtonNuevoRelacionesToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos && this.isPermisoNuevoListadosDocumentos));			
			this.jButtonNuevoGuardarCambiosToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));			
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaModificarListadosDocumentos && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaActualizarListadosDocumentos  && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaEliminarListadosDocumentos && this.isPermisoEliminarListadosDocumentos));
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarToolBarListadosDocumentos.setVisible(this.isVisibilidadCeldaCancelarListadosDocumentos);				
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos));			
			this.jMenuItemDuplicarListadosDocumentos.setVisible((this.isVisibilidadCeldaDuplicarListadosDocumentos && this.isPermisoDuplicarListadosDocumentos));			
			this.jMenuItemCopiarListadosDocumentos.setVisible((this.isVisibilidadCeldaCopiarListadosDocumentos && this.isPermisoCopiarListadosDocumentos));			
			this.jMenuItemVerFormListadosDocumentos.setVisible((this.isVisibilidadCeldaVerFormListadosDocumentos && this.isPermisoVerFormListadosDocumentos));			
			this.jMenuItemAbrirOrderByListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));			
			//this.jMenuItemMostrarOcultarListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));
			this.jMenuItemDetalleAbrirOrderByListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));			
			//this.jMenuItemDetalleMostrarOcultarListadosDocumentos.setVisible((this.isVisibilidadCeldaOrdenListadosDocumentos && this.isPermisoOrdenListadosDocumentos));			
			this.jMenuItemNuevoRelacionesListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos && this.isPermisoNuevoListadosDocumentos));			
			this.jMenuItemNuevoGuardarCambiosListadosDocumentos.setVisible((this.isVisibilidadCeldaNuevoListadosDocumentos && this.isPermisoNuevoListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));									
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemModificarListadosDocumentos.setVisible((this.isVisibilidadCeldaModificarListadosDocumentos && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemActualizarListadosDocumentos.setVisible((this.isVisibilidadCeldaActualizarListadosDocumentos && this.isPermisoActualizarListadosDocumentos));	
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemEliminarListadosDocumentos.setVisible((this.isVisibilidadCeldaEliminarListadosDocumentos && this.isPermisoEliminarListadosDocumentos));
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemCancelarListadosDocumentos.setVisible(this.isVisibilidadCeldaCancelarListadosDocumentos);				
			}
			
			this.jMenuItemGuardarCambiosListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));						
			this.jMenuItemGuardarCambiosTablaListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarCambiosListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoListadosDocumentos=this.jButtonNuevoListadosDocumentos.isVisible();
			this.isVisibilidadCeldaDuplicarListadosDocumentos=this.jButtonDuplicarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaCopiarListadosDocumentos=this.jButtonCopiarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaVerFormListadosDocumentos=this.jButtonVerFormListadosDocumentos.isVisible();
			
			this.isVisibilidadCeldaOrdenListadosDocumentos=this.jButtonAbrirOrderByListadosDocumentos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=this.jButtonNuevoRelacionesListadosDocumentos.isVisible();
			this.isVisibilidadCeldaModificarListadosDocumentos=this.jButtonModificarListadosDocumentos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.isVisibilidadCeldaActualizarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaEliminarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaCancelarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaGuardarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=this.jButtonGuardarCambiosTablaListadosDocumentos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoListadosDocumentos=this.jButtonNuevoToolBarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=this.jButtonNuevoRelacionesToolBarListadosDocumentos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.isVisibilidadCeldaModificarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarToolBarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaActualizarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarToolBarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaEliminarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarToolBarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaCancelarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarToolBarListadosDocumentos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosDocumentos=this.jButtonGuardarCambiosToolBarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=this.jButtonGuardarCambiosTablaToolBarListadosDocumentos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoListadosDocumentos=this.jMenuItemNuevoListadosDocumentos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=this.jMenuItemNuevoRelacionesListadosDocumentos.isVisible();
			
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.isVisibilidadCeldaModificarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemModificarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaActualizarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemActualizarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaEliminarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemEliminarListadosDocumentos.isVisible();
			this.isVisibilidadCeldaCancelarListadosDocumentos=this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemCancelarListadosDocumentos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarListadosDocumentos=this.jMenuItemGuardarCambiosListadosDocumentos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=this.jMenuItemGuardarCambiosTablaListadosDocumentos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesListadosDocumentos(Boolean esInicializar) {
		if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
				//if(this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesListadosDocumentos();
			}
			
			this.inicializarActualizarBindingBotonesManualListadosDocumentos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualListadosDocumentos() {
		this.jButtonNuevoListadosDocumentos.setVisible(this.isPermisoNuevoListadosDocumentos);			
		this.jButtonDuplicarListadosDocumentos.setVisible(this.isPermisoDuplicarListadosDocumentos);			
		this.jButtonCopiarListadosDocumentos.setVisible(this.isPermisoCopiarListadosDocumentos);			
		this.jButtonVerFormListadosDocumentos.setVisible(this.isPermisoVerFormListadosDocumentos);			
		
		this.jButtonAbrirOrderByListadosDocumentos.setVisible(this.isPermisoOrdenListadosDocumentos);					
		
		this.jButtonNuevoRelacionesListadosDocumentos.setVisible(this.isPermisoNuevoListadosDocumentos);			
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarListadosDocumentos.setVisible(this.isPermisoActualizarListadosDocumentos);	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.setVisible(this.isPermisoActualizarListadosDocumentos);	
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.setVisible(this.isPermisoEliminarListadosDocumentos);
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.setVisible(this.isVisibilidadCeldaCancelarListadosDocumentos);						
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.setVisible(this.isPermisoGuardarCambiosListadosDocumentos);							
		}
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.setVisible(this.isPermisoActualizarListadosDocumentos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosDocumentos() {
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarListadosDocumentos.setVisible(this.isPermisoActualizarListadosDocumentos);	
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.setVisible(this.isPermisoActualizarListadosDocumentos);	
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.setVisible(this.isPermisoEliminarListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.setVisible(this.isVisibilidadCeldaCancelarListadosDocumentos);							
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.setVisible((this.isVisibilidadCeldaGuardarListadosDocumentos && this.isPermisoGuardarCambiosListadosDocumentos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosListadosDocumentos() {
		if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualListadosDocumentos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesListadosDocumentos() {
	}
	
	public void jTableDatosListadosDocumentosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarListadosDocumentos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.listadosdocumentos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaListadosDocumentosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebListadosDocumentos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosDocumentos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosDocumentos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.listadosdocumentosLogic.getConnexion());

				if(this.listadosdocumentos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.listadosdocumentos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosDocumentos=(TitledBorder)this.jScrollPanelDatosListadosDocumentos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderListadosDocumentos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.listadosdocumentos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalListadosDocumentosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebListadosDocumentos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosDocumentos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosDocumentos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.listadosdocumentosLogic.getConnexion());

				if(this.listadosdocumentos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.listadosdocumentos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosDocumentos=(TitledBorder)this.jScrollPanelDatosListadosDocumentos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderListadosDocumentos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.listadosdocumentos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioListadosDocumentosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebListadosDocumentos(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosDocumentos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosDocumentos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.listadosdocumentosLogic.getConnexion());

				if(this.listadosdocumentos.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.listadosdocumentos.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosDocumentos=(TitledBorder)this.jScrollPanelDatosListadosDocumentos.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderListadosDocumentos.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.listadosdocumentos.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_movimientoListadosDocumentosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipomovimiento=true;

			idTienePermisotipomovimiento=this.tienePermisosUsuarioEnPaginaWebListadosDocumentos(TipoMovimientoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipomovimiento) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosListadosDocumentos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosListadosDocumentos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);

				this.tipomovimientoBeanSwingJInternalFrame=new TipoMovimientoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipomovimientoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipomovimientoBeanSwingJInternalFrame.getTipoMovimientoLogic().setConnexion(this.listadosdocumentosLogic.getConnexion());

				if(this.listadosdocumentos.getid_tipo_movimiento()!=null) {
					this.tipomovimientoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipomovimientoBeanSwingJInternalFrame.setIdActual(this.listadosdocumentos.getid_tipo_movimiento());
					this.tipomovimientoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipomovimientoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoMovimiento();
				}

				JInternalFrameBase jinternalFrame =this.tipomovimientoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderListadosDocumentos=(TitledBorder)this.jScrollPanelDatosListadosDocumentos.getBorder();
				TitledBorder titledBordertipomovimiento=(TitledBorder)this.tipomovimientoBeanSwingJInternalFrame.jScrollPanelDatosTipoMovimiento.getBorder();

				titledBordertipomovimiento.setTitle(titledBorderListadosDocumentos.getTitle() + " -> Tipo Movimiento");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_movimientoListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getid_tipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_movimiento = "+this.listadosdocumentos.getid_tipo_movimiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.listadosdocumentos.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.listadosdocumentos.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.listadosdocumentos.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipo_movimientoListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.gettipo_movimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo_movimiento like '%"+this.listadosdocumentos.gettipo_movimiento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.listadosdocumentos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.listadosdocumentos.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiario_chequeListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getbeneficiario_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario_cheque like '%"+this.listadosdocumentos.getbeneficiario_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.listadosdocumentos.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_chequeListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getvalor_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_cheque = "+this.listadosdocumentos.getvalor_cheque().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_empresaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getnombre_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_empresa like '%"+this.listadosdocumentos.getnombre_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_empresaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getruc_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_empresa like '%"+this.listadosdocumentos.getruc_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_empresaListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getdireccion_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_empresa like '%"+this.listadosdocumentos.getdireccion_empresa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.listadosdocumentos.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.listadosdocumentos.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_mayorListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getnumero_mayor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_mayor like '%"+this.listadosdocumentos.getnumero_mayor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.listadosdocumentos.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finalizacionListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getfecha_finalizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_finalizacion = '"+Funciones2.getStringPostgresDate(this.listadosdocumentos.getfecha_finalizacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_usuarioListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getnombre_usuario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_usuario like '%"+this.listadosdocumentos.getnombre_usuario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeListadosDocumentosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.getlistadosdocumentos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.listadosdocumentos==null) {
						this.listadosdocumentos = new ListadosDocumentos();
					}

					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);
				}

				if(this.listadosdocumentos.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.listadosdocumentos.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingListadosDocumentos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaListadosDocumentosListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosDocumentos(false,false);

			this.getListadosDocumentossBusquedaListadosDocumentos();

			this.inicializarActualizarBindingListadosDocumentos(false);

			//if(ListadosDocumentosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosDocumentos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosDocumentos(false,false);

			this.getListadosDocumentossFK_IdEjercicio();

			this.inicializarActualizarBindingListadosDocumentos(false);

			//if(ListadosDocumentosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosDocumentos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosDocumentos(false,false);

			this.getListadosDocumentossFK_IdEmpresa();

			this.inicializarActualizarBindingListadosDocumentos(false);

			//if(ListadosDocumentosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosDocumentos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosDocumentos(false,false);

			this.getListadosDocumentossFK_IdSucursal();

			this.inicializarActualizarBindingListadosDocumentos(false);

			//if(ListadosDocumentosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosDocumentos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoMovimientoListadosDocumentosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingListadosDocumentos(false,false);

			this.getListadosDocumentossFK_IdTipoMovimiento();

			this.inicializarActualizarBindingListadosDocumentos(false);

			//if(ListadosDocumentosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingListadosDocumentos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.listadosdocumentosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameListadosDocumentos() {
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
			this.jInternalFrameDetalleFormListadosDocumentos.setVisible(false);	    			
			this.jInternalFrameDetalleFormListadosDocumentos.dispose();
			this.jInternalFrameDetalleFormListadosDocumentos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
			this.jInternalFrameReporteDinamicoListadosDocumentos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoListadosDocumentos.dispose();
			this.jInternalFrameReporteDinamicoListadosDocumentos=null;
		}
		
		if(this.jInternalFrameImportacionListadosDocumentos!=null) {
			this.jInternalFrameImportacionListadosDocumentos.setVisible(false);	    			
			this.jInternalFrameImportacionListadosDocumentos.dispose();
			this.jInternalFrameImportacionListadosDocumentos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessListadosDocumentos();
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			
			if(sTipo.equals("NuevoListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarListadosDocumentos")) {
				jButtonDuplicarListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarListadosDocumentos")) {
				jButtonCopiarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("VerFormListadosDocumentos")) {
				jButtonVerFormListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarListadosDocumentos")) {
				jButtonDuplicarListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarListadosDocumentos")) {
				jButtonDuplicarListadosDocumentosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarListadosDocumentos")) {
				jButtonModificarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarListadosDocumentos")) {
				jButtonModificarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarListadosDocumentos")) {
				jButtonModificarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarListadosDocumentos")) {
				jButtonActualizarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarListadosDocumentos")) {
				jButtonActualizarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarListadosDocumentos")) {
				jButtonActualizarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("EliminarListadosDocumentos")) {
				jButtonEliminarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarListadosDocumentos")) {
				jButtonEliminarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarListadosDocumentos")) {
				jButtonEliminarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("CancelarListadosDocumentos")) {
				jButtonCancelarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarListadosDocumentos")) {
				jButtonCancelarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarListadosDocumentos")) {
				jButtonCancelarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("CerrarListadosDocumentos")) {
				jButtonCerrarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarListadosDocumentos")) {
				jButtonCerrarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarListadosDocumentos")) {
				jButtonCerrarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarListadosDocumentos")) {
				jButtonMostrarOcultarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarListadosDocumentos")) {
				jButtonCancelarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarListadosDocumentos")) {
				jButtonCopiarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarListadosDocumentos")) {
				jButtonVerFormListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarListadosDocumentos")) {
				jButtonCopiarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormListadosDocumentos")) {
				jButtonVerFormListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionListadosDocumentos")) {
				jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarListadosDocumentos")) {
				jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionListadosDocumentos")) {
				jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresListadosDocumentos")) {
				jButtonAnterioresListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarListadosDocumentos")) {
				jButtonAnterioresListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreListadosDocumentos")) {
				jButtonAnterioresListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesListadosDocumentos")) {
				jButtonSiguientesListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarListadosDocumentos")) {
				jButtonSiguientesListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesListadosDocumentos")) {
				jButtonSiguientesListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByListadosDocumentos") || sTipo.equals("MenuItemDetalleAbrirOrderByListadosDocumentos")) {
				jButtonAbrirOrderByListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarListadosDocumentos") || sTipo.equals("MenuItemDetalleMostrarOcultarListadosDocumentos")) {
				jButtonMostrarOcultarListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosListadosDocumentos")) {
				jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarListadosDocumentos")) {
				jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosListadosDocumentos")) {
				jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoListadosDocumentos")) {
				jButtonCerrarReporteDinamicoListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoListadosDocumentos")) {
				jButtonGenerarReporteDinamicoListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoListadosDocumentos")) {
				
				jButtonGenerarExcelReporteDinamicoListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionListadosDocumentos")) {
				jButtonCerrarImportacionListadosDocumentosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionListadosDocumentos")) {
				
				jButtonGenerarImportacionListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionListadosDocumentos")) {
				
				jButtonAbrirImportacionListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesListadosDocumentos")) {
				jComboBoxTiposAccionesListadosDocumentosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesListadosDocumentos")) {
				jComboBoxTiposRelacionesListadosDocumentosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioListadosDocumentos")) {
				jComboBoxTiposAccionesListadosDocumentosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarListadosDocumentos")) {
				
				jComboBoxTiposSeleccionarListadosDocumentosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralListadosDocumentos")) {
				jTextFieldValorCampoGeneralListadosDocumentosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByListadosDocumentos")) {
				jButtonAbrirOrderByListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarListadosDocumentos")) {
				jButtonAbrirOrderByListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByListadosDocumentos")) {
				jButtonCerrarOrderByListadosDocumentosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosDocumentosBusqueda")) {
				this.jButtonidListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosDocumentosUpdate")) {
				this.jButtonid_empresaListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosDocumentosBusqueda")) {
				this.jButtonid_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalListadosDocumentosUpdate")) {
				this.jButtonid_sucursalListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalListadosDocumentosBusqueda")) {
				this.jButtonid_sucursalListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioListadosDocumentosUpdate")) {
				this.jButtonid_ejercicioListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioListadosDocumentosBusqueda")) {
				this.jButtonid_ejercicioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoListadosDocumentosUpdate")) {
				this.jButtonid_tipo_movimientoListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoListadosDocumentosBusqueda")) {
				this.jButtonid_tipo_movimientoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeListadosDocumentosBusqueda")) {
				this.jButtonfecha_desdeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaListadosDocumentosBusqueda")) {
				this.jButtonfecha_hastaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaListadosDocumentosBusqueda")) {
				this.jButtonfechaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoListadosDocumentosBusqueda")) {
				this.jButtontipo_movimientoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosDocumentosBusqueda")) {
				this.jButtoncodigoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioListadosDocumentosBusqueda")) {
				this.jButtonbeneficiarioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_chequeListadosDocumentosBusqueda")) {
				this.jButtonbeneficiario_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleListadosDocumentosBusqueda")) {
				this.jButtondetalleListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeListadosDocumentosBusqueda")) {
				this.jButtonvalor_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaListadosDocumentosBusqueda")) {
				this.jButtonnombre_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_empresaListadosDocumentosBusqueda")) {
				this.jButtonruc_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_empresaListadosDocumentosBusqueda")) {
				this.jButtondireccion_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalListadosDocumentosBusqueda")) {
				this.jButtonnombre_sucursalListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosDocumentosBusqueda")) {
				this.jButtonvalorListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorListadosDocumentosBusqueda")) {
				this.jButtonnumero_mayorListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionListadosDocumentosBusqueda")) {
				this.jButtonfecha_emisionListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalizacionListadosDocumentosBusqueda")) {
				this.jButtonfecha_finalizacionListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioListadosDocumentosBusqueda")) {
				this.jButtonnombre_usuarioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeListadosDocumentosBusqueda")) {
				this.jButtonnumero_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaListadosDocumentosListadosDocumentos")) {
				this.jButtonBusquedaListadosDocumentosListadosDocumentosActionPerformed(evt);
			}
			
			;
			
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessListadosDocumentos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ListadosDocumentos listadosdocumentosLocal=null;
			
			if(!this.getEsControlTabla()) {
				listadosdocumentosLocal=this.listadosdocumentos;
			} else {
				listadosdocumentosLocal=this.listadosdocumentosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
							
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
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
			
			


			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
								
						
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
								
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
							
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
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
			
			


			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
								
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosListadosDocumentos")) {
					jCheckBoxSeleccionarTodosListadosDocumentosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosListadosDocumentos")) {
					jCheckBoxSeleccionadosListadosDocumentosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarListadosDocumentos")) {
					
				}
				
				


				
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
												
				
				


				
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
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
			
			


			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaListadosDocumentosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.listadosdocumentos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.listadosdocumentos);
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
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
				
				


				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ListadosDocumentos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ListadosDocumentos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaListadosDocumentosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.listadosdocumentosAnterior =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarListadosDocumentos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosListadosDocumentosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosListadosDocumentos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.listadosdocumentos =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.listadosdocumentos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarListadosDocumentos")) {
				
				}
				
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarListadosDocumentos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosListadosDocumentos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarListadosDocumentos")) {
			
			}
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessListadosDocumentos();
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			if(sTipo.equals("NuevoListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarListadosDocumentos")) {
				jButtonDuplicarListadosDocumentosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarListadosDocumentos")) {
				jButtonCopiarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormListadosDocumentos")) {
				jButtonVerFormListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesListadosDocumentos")) {
				jButtonNuevoListadosDocumentosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarListadosDocumentos")) {
				jButtonModificarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarListadosDocumentos")) {
				jButtonActualizarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarListadosDocumentos")) {
				jButtonEliminarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarListadosDocumentos")) {
				jButtonCancelarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarListadosDocumentos")) {
				jButtonCerrarListadosDocumentosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosListadosDocumentos")) {
				jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosListadosDocumentos")) {
				jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByListadosDocumentos")) {
				jButtonAbrirOrderByListadosDocumentosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionListadosDocumentos")) {
				jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresListadosDocumentos")) {
				jButtonAnterioresListadosDocumentosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesListadosDocumentos")) {
				jButtonSiguientesListadosDocumentosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idListadosDocumentosBusqueda")) {
				this.jButtonidListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaListadosDocumentosUpdate")) {
				this.jButtonid_empresaListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaListadosDocumentosBusqueda")) {
				this.jButtonid_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalListadosDocumentosUpdate")) {
				this.jButtonid_sucursalListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalListadosDocumentosBusqueda")) {
				this.jButtonid_sucursalListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioListadosDocumentosUpdate")) {
				this.jButtonid_ejercicioListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioListadosDocumentosBusqueda")) {
				this.jButtonid_ejercicioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_movimientoListadosDocumentosUpdate")) {
				this.jButtonid_tipo_movimientoListadosDocumentosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_movimientoListadosDocumentosBusqueda")) {
				this.jButtonid_tipo_movimientoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeListadosDocumentosBusqueda")) {
				this.jButtonfecha_desdeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaListadosDocumentosBusqueda")) {
				this.jButtonfecha_hastaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaListadosDocumentosBusqueda")) {
				this.jButtonfechaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipo_movimientoListadosDocumentosBusqueda")) {
				this.jButtontipo_movimientoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoListadosDocumentosBusqueda")) {
				this.jButtoncodigoListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioListadosDocumentosBusqueda")) {
				this.jButtonbeneficiarioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiario_chequeListadosDocumentosBusqueda")) {
				this.jButtonbeneficiario_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleListadosDocumentosBusqueda")) {
				this.jButtondetalleListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_chequeListadosDocumentosBusqueda")) {
				this.jButtonvalor_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_empresaListadosDocumentosBusqueda")) {
				this.jButtonnombre_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_empresaListadosDocumentosBusqueda")) {
				this.jButtonruc_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_empresaListadosDocumentosBusqueda")) {
				this.jButtondireccion_empresaListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalListadosDocumentosBusqueda")) {
				this.jButtonnombre_sucursalListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorListadosDocumentosBusqueda")) {
				this.jButtonvalorListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_mayorListadosDocumentosBusqueda")) {
				this.jButtonnumero_mayorListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionListadosDocumentosBusqueda")) {
				this.jButtonfecha_emisionListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finalizacionListadosDocumentosBusqueda")) {
				this.jButtonfecha_finalizacionListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_usuarioListadosDocumentosBusqueda")) {
				this.jButtonnombre_usuarioListadosDocumentosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeListadosDocumentosBusqueda")) {
				this.jButtonnumero_chequeListadosDocumentosBusquedaActionPerformed(evt);
			}
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessListadosDocumentos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameListadosDocumentos")) {
				closingInternalFrameListadosDocumentos();
				
			} else if(sTipo.equals("jButtonCancelarListadosDocumentos")) {
				JInternalFrameBase jInternalFrameDetalleFormListadosDocumentos = (JInternalFrameBase)evt.getSource();
	            	
	            ListadosDocumentosBeanSwingJInternalFrame jInternalFrameParent=(ListadosDocumentosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosDocumentos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarListadosDocumentosActionPerformed(null);
			}
			
			ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.listadosdocumentos,new Object(),this.listadosdocumentosParameterGeneral,this.listadosdocumentosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormListadosDocumentos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormListadosDocumentos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormListadosDocumentos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.listadosdocumentos)) {
			if(!esControlTabla) {
				if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);			
				}
				
				if(this.listadosdocumentosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualListadosDocumentos(this.listadosdocumentos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanListadosDocumentos(this.listadosdocumentosReturnGeneral,this.listadosdocumentosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.listadosdocumentosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanListadosDocumentos(classes,this.listadosdocumentosReturnGeneral,this.listadosdocumentosBean,false);
					}
						
					if(this.listadosdocumentosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos());	
					}
						
					if(this.listadosdocumentosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentosReturnGeneral.getListadosDocumentos(),classes);//this.listadosdocumentosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioListadosDocumentos(this.listadosdocumentos,classes);//this.listadosdocumentosBean);									
				}
			
				if(ListadosDocumentosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualListadosDocumentos(this.listadosdocumentos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysListadosDocumentos(this.listadosdocumentos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.listadosdocumentosAnterior!=null) {
						this.listadosdocumentos=this.listadosdocumentosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.listadosdocumentosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.listadosdocumentosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.listadosdocumentosReturnGeneral.getListadosDocumentos(),listadosdocumentosLogic.getListadosDocumentoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.listadosdocumentosReturnGeneral.getListadosDocumentos(),this.listadosdocumentoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosListadosDocumentos.repaint();
				
				//((AbstractTableModel) this.jTableDatosListadosDocumentos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosListadosDocumentos();
			}
		}
	}
	
	public void actualizarVisualTableDatosListadosDocumentos() throws Exception {
		
		ListadosDocumentosModel listadosdocumentosModel=(ListadosDocumentosModel)this.jTableDatosListadosDocumentos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			listadosdocumentosModel.listadosdocumentoss=this.listadosdocumentosLogic.getListadosDocumentoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			listadosdocumentosModel.listadosdocumentoss=this.listadosdocumentoss;
		}
		
		
		((ListadosDocumentosModel) this.jTableDatosListadosDocumentos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaListadosDocumentos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlistadosdocumentosAnterior(),this.listadosdocumentosLogic.getListadosDocumentoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlistadosdocumentosAnterior(),this.listadosdocumentoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosListadosDocumentos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioListadosDocumentos(ListadosDocumentos listadosdocumentos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
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
										
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosdocumentos,new Object(),generalEntityParameterGeneral,this.listadosdocumentosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.listadosdocumentosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ListadosDocumentosConstantesFunciones.getClassesRelationshipsOfListadosDocumentos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ListadosDocumentosConstantesFunciones.getClassesRelationshipsFromStringsOfListadosDocumentos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormListadosDocumentos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ListadosDocumentosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.listadosdocumentos,new Object(),generalEntityParameterGeneral,this.listadosdocumentosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioListadosDocumentos(ListadosDocumentosBean listadosdocumentosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanListadosDocumentos(ArrayList<Classe> classes,ListadosDocumentosReturnGeneral listadosdocumentosReturnGeneral,ListadosDocumentosBean listadosdocumentosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualListadosDocumentos(ListadosDocumentos listadosdocumentos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.listadosdocumentos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormListadosDocumentos = new ListadosDocumentosDetalleFormJInternalFrame(jDesktopPane,this.listadosdocumentosSessionBean.getConGuardarRelaciones(),this.listadosdocumentosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.setVisible(false);
		this.jInternalFrameDetalleFormListadosDocumentos.setSelected(false);						
		
		this.jInternalFrameDetalleFormListadosDocumentos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormListadosDocumentos.listadosdocumentosLogic=this.listadosdocumentosLogic;
		
		this.cargarCombosFrameForeignKeyListadosDocumentos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleListadosDocumentos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleListadosDocumentos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyListadosDocumentos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyListadosDocumentos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormListadosDocumentos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosDocumentos"));
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ModificarListadosDocumentos"));

		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosDocumentos"));
					
		this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemModificarListadosDocumentos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosDocumentos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.addActionListener (new ButtonActionListener(this,"ActualizarListadosDocumentos"));
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosDocumentos"));
						
		this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemActualizarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosDocumentos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.addActionListener (new ButtonActionListener(this,"EliminarListadosDocumentos"));
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosDocumentos"));
								
		this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemEliminarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosDocumentos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CancelarListadosDocumentos"));
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosDocumentos"));
					
		this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemCancelarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosDocumentos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemDetalleCerrarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosDocumentos"));		
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosDocumentos"));
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosDocumentos"));
		
		
		
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosDocumentos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonidListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_desdeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_hastaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfechaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtontipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtoncodigoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiario_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondetalleListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"detalleListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalor_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonruc_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondireccion_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_mayorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_emisionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_finalizacionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_usuarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeListadosDocumentosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosDocumentos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameListadosDocumentos"));
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarListadosDocumentos"));
		}
		
		this.jTableDatosListadosDocumentos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarListadosDocumentos"));
		
		this.jTableDatosListadosDocumentos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarListadosDocumentos"));
		
		this.jButtonNuevoListadosDocumentos.addActionListener(new ButtonActionListener(this,"NuevoListadosDocumentos"));
		
		this.jButtonDuplicarListadosDocumentos.addActionListener(new ButtonActionListener(this,"DuplicarListadosDocumentos"));
		
		this.jButtonCopiarListadosDocumentos.addActionListener(new ButtonActionListener(this,"CopiarListadosDocumentos"));
		
		this.jButtonVerFormListadosDocumentos.addActionListener(new ButtonActionListener(this,"VerFormListadosDocumentos"));
		
		
		this.jButtonNuevoToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"NuevoToolBarListadosDocumentos"));
			
		this.jButtonDuplicarToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarListadosDocumentos"));
			
		this.jMenuItemNuevoListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoListadosDocumentos"));
			
		this.jMenuItemDuplicarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarListadosDocumentos"));		
		
		
		this.jButtonNuevoRelacionesListadosDocumentos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesListadosDocumentos"));
		
		
		this.jButtonNuevoRelacionesToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarListadosDocumentos"));
			
		this.jMenuItemNuevoRelacionesListadosDocumentos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesListadosDocumentos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ModificarListadosDocumentos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonModificarToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ModificarToolBarListadosDocumentos"));
			
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemModificarListadosDocumentos.addActionListener(new ButtonActionListener(this,"MenuItemModificarListadosDocumentos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarListadosDocumentos.addActionListener (new ButtonActionListener(this,"ActualizarListadosDocumentos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonActualizarToolBarListadosDocumentos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarListadosDocumentos"));
				
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemActualizarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarListadosDocumentos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarListadosDocumentos.addActionListener (new ButtonActionListener(this,"EliminarListadosDocumentos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonEliminarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"EliminarToolBarListadosDocumentos"));
						
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemEliminarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarListadosDocumentos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CancelarListadosDocumentos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonCancelarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CancelarToolBarListadosDocumentos"));
			
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemCancelarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarListadosDocumentos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarListadosDocumentos"));		
		
		
		this.jButtonCerrarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CerrarListadosDocumentos"));
		
		
		this.jButtonCerrarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CerrarToolBarListadosDocumentos"));
			
		this.jMenuItemCerrarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarListadosDocumentos"));
			
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jMenuItemDetalleCerrarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarListadosDocumentos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosListadosDocumentos"));
		}
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarListadosDocumentos"));
		}
		
		this.jButtonCopiarToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"CopiarToolBarListadosDocumentos"));
			
		this.jButtonVerFormToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"VerFormToolBarListadosDocumentos"));
		
		this.jMenuItemGuardarCambiosListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosListadosDocumentos"));
			
		this.jMenuItemCopiarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarListadosDocumentos"));		
		
		this.jMenuItemVerFormListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormListadosDocumentos"));		
		
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosDocumentos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarListadosDocumentos"));
			
		this.jMenuItemGuardarCambiosTablaListadosDocumentos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaListadosDocumentos"));		
		
		
		
		this.jButtonRecargarInformacionListadosDocumentos.addActionListener (new ButtonActionListener(this,"RecargarInformacionListadosDocumentos"));
					
		this.jButtonRecargarInformacionToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarListadosDocumentos"));
		
		this.jMenuItemRecargarInformacionListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionListadosDocumentos"));		
		
		
		
		this.jButtonAnterioresListadosDocumentos.addActionListener (new ButtonActionListener(this,"AnterioresListadosDocumentos"));
		
		
		this.jButtonAnterioresToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarListadosDocumentos"));
		
		this.jMenuItemAnterioresListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresListadosDocumentos"));		
		
		
		this.jButtonSiguientesListadosDocumentos.addActionListener (new ButtonActionListener(this,"SiguientesListadosDocumentos"));
		
		
		this.jButtonSiguientesToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarListadosDocumentos"));
			
		this.jMenuItemSiguientesListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesListadosDocumentos"));
			
		this.jMenuItemAbrirOrderByListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByListadosDocumentos"));
			
		this.jMenuItemMostrarOcultarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarListadosDocumentos"));
			
		this.jMenuItemDetalleAbrirOrderByListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByListadosDocumentos"));
			
		this.jMenuItemDetalleMostarOcultarListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarListadosDocumentos"));		
		
		
		this.jButtonNuevoGuardarCambiosListadosDocumentos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosListadosDocumentos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarListadosDocumentos"));
			
		this.jMenuItemNuevoGuardarCambiosListadosDocumentos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosListadosDocumentos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosListadosDocumentos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosListadosDocumentos"));

		this.jCheckBoxSeleccionadosListadosDocumentos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosListadosDocumentos"));
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioListadosDocumentos"));
		}
		
		
		this.jComboBoxTiposRelacionesListadosDocumentos.addActionListener (new ButtonActionListener(this,"TiposRelacionesListadosDocumentos"));
			
		this.jComboBoxTiposAccionesListadosDocumentos.addActionListener (new ButtonActionListener(this,"TiposAccionesListadosDocumentos"));
					
		this.jComboBoxTiposSeleccionarListadosDocumentos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarListadosDocumentos"));
			
		this.jTextFieldValorCampoGeneralListadosDocumentos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralListadosDocumentos"));		
		
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonidListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_desdeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_hastaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfechaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtontipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtoncodigoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiario_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondetalleListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"detalleListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalor_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonruc_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondireccion_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_mayorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_emisionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_finalizacionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_usuarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeListadosDocumentosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaListadosDocumentosListadosDocumentos.addActionListener(new ButtonActionListener(this,"BusquedaListadosDocumentosListadosDocumentos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoListadosDocumentos!=null) {
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosDocumentos"));
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosDocumentos"));
				this.jInternalFrameReporteDinamicoListadosDocumentos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosDocumentos"));
			}
			
			//this.jButtonCerrarReporteDinamicoListadosDocumentos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoListadosDocumentos"));				
			//this.jButtonGenerarReporteDinamicoListadosDocumentos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoListadosDocumentos"));
			//this.jButtonGenerarExcelReporteDinamicoListadosDocumentos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoListadosDocumentos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionListadosDocumentos!=null) {
				this.jInternalFrameImportacionListadosDocumentos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionListadosDocumentos"));
				this.jInternalFrameImportacionListadosDocumentos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionListadosDocumentos"));
				this.jInternalFrameImportacionListadosDocumentos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionListadosDocumentos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByListadosDocumentos.addActionListener (new ButtonActionListener(this,"AbrirOrderByListadosDocumentos"));
			
			this.jButtonAbrirOrderByToolBarListadosDocumentos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarListadosDocumentos"));			
			
			if(this.jInternalFrameOrderByListadosDocumentos!=null) {
				this.jInternalFrameOrderByListadosDocumentos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByListadosDocumentos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormListadosDocumentos.jTabbedPaneRelacionesListadosDocumentos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesListadosDocumentos"));
		
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
            		closingInternalFrameListadosDocumentos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormListadosDocumentos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormListadosDocumentos = (JInternalFrameBase)event.getSource();
	            	
	            ListadosDocumentosBeanSwingJInternalFrame jInternalFrameParent=(ListadosDocumentosBeanSwingJInternalFrame)jInternalFrameDetalleFormListadosDocumentos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarListadosDocumentosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosListadosDocumentos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosListadosDocumentosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosListadosDocumentos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosListadosDocumentos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoListadosDocumentos";
		inputMap = this.jButtonNuevoListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosDocumentosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoListadosDocumentosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesListadosDocumentos";
		inputMap = this.jButtonNuevoRelacionesListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoListadosDocumentosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarListadosDocumentos";
		inputMap = this.jButtonModificarListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarListadosDocumentos";
		inputMap = this.jButtonActualizarListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarListadosDocumentos";
		inputMap = this.jButtonEliminarListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarListadosDocumentos";
		inputMap = this.jButtonCancelarListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarListadosDocumentos";
		inputMap = this.jButtonCerrarListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosListadosDocumentos";
		inputMap = this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonGuardarCambiosListadosDocumentos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosListadosDocumentosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosListadosDocumentos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosListadosDocumentosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesListadosDocumentos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesListadosDocumentosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarListadosDocumentos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarListadosDocumentosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralListadosDocumentos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralListadosDocumentosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonidListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"idListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_ejercicioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioListadosDocumentosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonid_tipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_desdeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_hastaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfechaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fechaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtontipo_movimientoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"tipo_movimientoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtoncodigoListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"codigoListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonbeneficiario_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"beneficiario_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondetalleListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"detalleListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalor_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valor_chequeListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonruc_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"ruc_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtondireccion_empresaListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"direccion_empresaListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_sucursalListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonvalorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"valorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_mayorListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_mayorListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_emisionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonfecha_finalizacionListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finalizacionListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnombre_usuarioListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_usuarioListadosDocumentosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormListadosDocumentos.jButtonnumero_chequeListadosDocumentosBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeListadosDocumentosBusqueda"));
		
		
		this.jButtonBusquedaListadosDocumentosListadosDocumentos.addActionListener(new ButtonActionListener(this,"BusquedaListadosDocumentosListadosDocumentos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionListadosDocumentos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionListadosDocumentosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarListadosDocumentosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarListadosDocumentos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosListadosDocumentos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
					listadosdocumentosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosDocumentos listadosdocumentosAux:listadosdocumentoss) {
					listadosdocumentosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosListadosDocumentosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
						listadosdocumentosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosDocumentos listadosdocumentosAux:listadosdocumentoss) {
						listadosdocumentosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosDocumentos listadosdocumentosAux:listadosdocumentoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosDocumentos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosDocumentos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosListadosDocumentosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosListadosDocumentos.getSelectedRows();
			
			ListadosDocumentos listadosdocumentosLocal=new ListadosDocumentos();
			
			//this.seleccionarTodosListadosDocumentos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					listadosdocumentosLocal =(ListadosDocumentos) this.listadosdocumentosLogic.getListadosDocumentoss().toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					listadosdocumentosLocal =(ListadosDocumentos) this.listadosdocumentoss.toArray()[this.jTableDatosListadosDocumentos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				listadosdocumentosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
						listadosdocumentosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ListadosDocumentos listadosdocumentosAux:listadosdocumentoss) {
						listadosdocumentosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosListadosDocumentos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosListadosDocumentos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosListadosDocumentos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualListadosDocumentosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarListadosDocumentosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralListadosDocumentosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralListadosDocumentos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentosLogic.getListadosDocumentoss()) {
				
						if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							listadosdocumentosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							listadosdocumentosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							listadosdocumentosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							listadosdocumentosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosdocumentosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							listadosdocumentosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setbeneficiario_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							listadosdocumentosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setruc_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setdireccion_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							listadosdocumentosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadosdocumentosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							listadosdocumentosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							listadosdocumentosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION)) {
							existe=true;
							listadosdocumentosAux.setfecha_finalizacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							listadosdocumentosAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosDocumentos listadosdocumentosAux:listadosdocumentoss) {
					
						if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							listadosdocumentosAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							listadosdocumentosAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							listadosdocumentosAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
							existe=true;
							listadosdocumentosAux.settipo_movimiento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							listadosdocumentosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							listadosdocumentosAux.setbeneficiario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setbeneficiario_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							listadosdocumentosAux.setdetalle(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setvalor_cheque(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setnombre_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setruc_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA)) {
							existe=true;
							listadosdocumentosAux.setdireccion_empresa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							listadosdocumentosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							listadosdocumentosAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR)) {
							existe=true;
							listadosdocumentosAux.setnumero_mayor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							listadosdocumentosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION)) {
							existe=true;
							listadosdocumentosAux.setfecha_finalizacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO)) {
							existe=true;
							listadosdocumentosAux.setnombre_usuario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							listadosdocumentosAux.setnumero_cheque(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaListadosDocumentos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesListadosDocumentosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioListadosDocumentos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesListadosDocumentos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteListadosDocumentos) {				
					conSplash=true;//false;										
					
					//this.startProcessListadosDocumentos(conSplash);
				
					this.generarReporteListadosDocumentossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoListadosDocumentossSeleccionados();
				//this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosDocumentossSeleccionados(false);
				//this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoListadosDocumentossSeleccionados(true);
				//this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosDocumentos();
				
				this.exportarListadosDocumentossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionListadosDocumentoss();
				//this.importarListadosDocumentoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessListadosDocumentos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelListadosDocumentossSeleccionados();
				//this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Listados Documentos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessListadosDocumentos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoListadosDocumentos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyListadosDocumentos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
				}	
			} 			
			else if(ListadosDocumentosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteListadosDocumentos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessListadosDocumentos(conSplash);
					
						//this.actualizarParametrosGeneralListadosDocumentos();
						
						this.generarReporteProcesoAccionListadosDocumentossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ListadosDocumentosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Listados DocumentosES SELECCIONADOS?", "MANTENIMIENTO DE Listados Documentos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessListadosDocumentos();
				
						this.actualizarParametrosGeneralListadosDocumentos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.listadosdocumentosReturnGeneral=listadosdocumentosLogic.procesarAccionListadosDocumentossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.listadosdocumentosLogic.getListadosDocumentoss(),this.listadosdocumentosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarListadosDocumentosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralListadosDocumentos();
					
					ListadosDocumentosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarListadosDocumentosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesListadosDocumentos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxTiposAccionesFormularioListadosDocumentos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessListadosDocumentos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesListadosDocumentosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessListadosDocumentos();
			
			if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
			ListadosDocumentos listadosdocumentos=new ListadosDocumentos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingListadosDocumentos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesListadosDocumentos.getSelectedItem();
			
			
			
			
			listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
			//this.sTipoAccion;
			
			if(listadosdocumentossSeleccionados.size()==1) {
				for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
					listadosdocumentos=listadosdocumentosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessListadosDocumentos();
			
      		//this.finishProcessListadosDocumentos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarListadosDocumentosReturnGeneral() throws Exception {
		if(this.listadosdocumentosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.listadosdocumentosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.listadosdocumentosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.listadosdocumentosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.listadosdocumentosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.listadosdocumentosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingListadosDocumentos(false);
		}
		
		if(this.listadosdocumentosReturnGeneral.getConRetornoLista() || this.listadosdocumentosReturnGeneral.getConRetornoObjeto()) {
			if(this.listadosdocumentosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.listadosdocumentosLogic.setListadosDocumentoss(this.listadosdocumentosReturnGeneral.getListadosDocumentoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingListadosDocumentos(false);
		}
	}
	
	public void actualizarParametrosGeneralListadosDocumentos() throws Exception {
		
		
	}
	
	public ArrayList<ListadosDocumentos> getListadosDocumentossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioListadosDocumentos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ListadosDocumentos listadosdocumentosAux:listadosdocumentosLogic.getListadosDocumentoss()) {
					if(listadosdocumentosAux.getIsSelected()) {
						listadosdocumentossSeleccionados.add(listadosdocumentosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ListadosDocumentos listadosdocumentosAux:this.listadosdocumentoss) {
					if(listadosdocumentosAux.getIsSelected()) {
						listadosdocumentossSeleccionados.add(listadosdocumentosAux);				
					}
				}
			}
			
			if(listadosdocumentossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						listadosdocumentossSeleccionados.addAll(this.listadosdocumentosLogic.getListadosDocumentoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						listadosdocumentossSeleccionados.addAll(this.listadosdocumentoss);				
					}
				}
			}
		} else {
			listadosdocumentossSeleccionados.add(this.listadosdocumentos);
		}
		
		return listadosdocumentossSeleccionados;
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
	
	public void generarReporteListadosDocumentossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalListadosDocumentossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoListadosDocumentossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosDocumentossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoListadosDocumentossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Listados Documentos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados);
		
	}	
	
	public void generarReporteNormalListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionListadosDocumentossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoListadosDocumentos();
		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoListadosDocumentos();
		
		
		//this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados ,listadosdocumentosImplementable,listadosdocumentosImplementableHome);
	}
	
	public void mostrarImportacionListadosDocumentoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionListadosDocumentos();
		
		this.abrirFrameImportacionListadosDocumentos();		
		
			
		//this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados ,listadosdocumentosImplementable,listadosdocumentosImplementableHome);
	}
	
	public void importarListadosDocumentoss() throws Exception {		
	
	}
	
	public void exportarListadosDocumentossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelListadosDocumentossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoListadosDocumentossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlListadosDocumentossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Listados Documentos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarListadosDocumentos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarListadosDocumentos(listadosdocumentosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//listadosdocumentosAux.setsDetalleGeneralEntityReporte(listadosdocumentosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarListadosDocumentos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_DETALLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarListadosDocumentos(ListadosDocumentos listadosdocumentos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=listadosdocumentos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.gettipomovimiento_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.gettipo_movimiento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getbeneficiario_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getdetalle();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getvalor_cheque().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getnombre_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getruc_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getdireccion_empresa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getnumero_mayor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getfecha_finalizacion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getnombre_usuario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=listadosdocumentos.getnumero_cheque();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ListadosDocumentoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelListadosDocumentos(row);				
				iRow++;
			}				
			
			for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelListadosDocumentos(listadosdocumentosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlListadosDocumentossSeleccionados() throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();		
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"listadosdocumentos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("listadosdocumentoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("listadosdocumentos");
			//elementRoot.appendChild(element);
		
			for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
				element = document.createElement("listadosdocumentos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlListadosDocumentos(listadosdocumentosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Listados Documentos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelListadosDocumentos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DETALLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALORCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelListadosDocumentos(ListadosDocumentos listadosdocumentos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.gettipomovimiento_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.gettipo_movimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getbeneficiario_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getdetalle());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getvalor_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getnombre_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getruc_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getdireccion_empresa());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getnumero_mayor());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getfecha_finalizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getnombre_usuario());
		cell = row.createCell(iColumn++);cell.setCellValue(listadosdocumentos.getnumero_cheque());				
	}
	
	public void setFilaDatosExportarXmlListadosDocumentos(ListadosDocumentos listadosdocumentos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ListadosDocumentosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(listadosdocumentos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ListadosDocumentosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(listadosdocumentos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ListadosDocumentosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(listadosdocumentos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ListadosDocumentosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(listadosdocumentos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(ListadosDocumentosConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(listadosdocumentos.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementtipomovimiento_descripcion = document.createElement(ListadosDocumentosConstantesFunciones.IDTIPOMOVIMIENTO);
		elementtipomovimiento_descripcion.appendChild(document.createTextNode(listadosdocumentos.gettipomovimiento_descripcion()));
		element.appendChild(elementtipomovimiento_descripcion);

		Element elementfecha_desde = document.createElement(ListadosDocumentosConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(listadosdocumentos.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(ListadosDocumentosConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(listadosdocumentos.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementfecha = document.createElement(ListadosDocumentosConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(listadosdocumentos.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementtipo_movimiento = document.createElement(ListadosDocumentosConstantesFunciones.TIPOMOVIMIENTO);
		elementtipo_movimiento.appendChild(document.createTextNode(listadosdocumentos.gettipo_movimiento().trim()));
		element.appendChild(elementtipo_movimiento);

		Element elementcodigo = document.createElement(ListadosDocumentosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(listadosdocumentos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementbeneficiario = document.createElement(ListadosDocumentosConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(listadosdocumentos.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementbeneficiario_cheque = document.createElement(ListadosDocumentosConstantesFunciones.BENEFICIARIOCHEQUE);
		elementbeneficiario_cheque.appendChild(document.createTextNode(listadosdocumentos.getbeneficiario_cheque().trim()));
		element.appendChild(elementbeneficiario_cheque);

		Element elementdetalle = document.createElement(ListadosDocumentosConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(listadosdocumentos.getdetalle().trim()));
		element.appendChild(elementdetalle);

		Element elementvalor_cheque = document.createElement(ListadosDocumentosConstantesFunciones.VALORCHEQUE);
		elementvalor_cheque.appendChild(document.createTextNode(listadosdocumentos.getvalor_cheque().toString().trim()));
		element.appendChild(elementvalor_cheque);

		Element elementnombre_empresa = document.createElement(ListadosDocumentosConstantesFunciones.NOMBREEMPRESA);
		elementnombre_empresa.appendChild(document.createTextNode(listadosdocumentos.getnombre_empresa().trim()));
		element.appendChild(elementnombre_empresa);

		Element elementruc_empresa = document.createElement(ListadosDocumentosConstantesFunciones.RUCEMPRESA);
		elementruc_empresa.appendChild(document.createTextNode(listadosdocumentos.getruc_empresa().trim()));
		element.appendChild(elementruc_empresa);

		Element elementdireccion_empresa = document.createElement(ListadosDocumentosConstantesFunciones.DIRECCIONEMPRESA);
		elementdireccion_empresa.appendChild(document.createTextNode(listadosdocumentos.getdireccion_empresa().trim()));
		element.appendChild(elementdireccion_empresa);

		Element elementnombre_sucursal = document.createElement(ListadosDocumentosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(listadosdocumentos.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementvalor = document.createElement(ListadosDocumentosConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(listadosdocumentos.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementnumero_mayor = document.createElement(ListadosDocumentosConstantesFunciones.NUMEROMAYOR);
		elementnumero_mayor.appendChild(document.createTextNode(listadosdocumentos.getnumero_mayor().trim()));
		element.appendChild(elementnumero_mayor);

		Element elementfecha_emision = document.createElement(ListadosDocumentosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(listadosdocumentos.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_finalizacion = document.createElement(ListadosDocumentosConstantesFunciones.FECHAFINALIZACION);
		elementfecha_finalizacion.appendChild(document.createTextNode(listadosdocumentos.getfecha_finalizacion().toString().trim()));
		element.appendChild(elementfecha_finalizacion);

		Element elementnombre_usuario = document.createElement(ListadosDocumentosConstantesFunciones.NOMBREUSUARIO);
		elementnombre_usuario.appendChild(document.createTextNode(listadosdocumentos.getnombre_usuario().trim()));
		element.appendChild(elementnombre_usuario);

		Element elementnumero_cheque = document.createElement(ListadosDocumentosConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(listadosdocumentos.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);
	}
	
	public void generarReporteGroupGenericoListadosDocumentossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados=new ArrayList<ListadosDocumentos>();
		
		listadosdocumentossSeleccionados=this.getListadosDocumentossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoListadosDocumentos(listadosdocumentossSeleccionados);
		
		this.generarReporteListadosDocumentoss("Todos",listadosdocumentossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoListadosDocumentos(ArrayList<ListadosDocumentos> listadosdocumentossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ListadosDocumentos listadosdocumentosAux:listadosdocumentossSeleccionados) {
				listadosdocumentosAux.setsDetalleGeneralEntityReporte(listadosdocumentosAux.toString());
			
				if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_IDTIPOMOVIMIENTO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.gettipomovimiento_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosdocumentosAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosdocumentosAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosdocumentosAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_TIPOMOVIMIENTO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.gettipo_movimiento());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_BENEFICIARIOCHEQUE)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getbeneficiario_cheque());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getdetalle());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREEMPRESA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getnombre_empresa());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_RUCEMPRESA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getruc_empresa());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_DIRECCIONEMPRESA)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getdireccion_empresa());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROMAYOR)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getnumero_mayor());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosdocumentosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_FECHAFINALIZACION)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(listadosdocumentosAux.getfecha_finalizacion()));
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NOMBREUSUARIO)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getnombre_usuario());
				}
				 else if(sTipoSeleccionar.equals(ListadosDocumentosConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					listadosdocumentosAux.setsDescripcionGeneralEntityReporte1(listadosdocumentosAux.getnumero_cheque());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ListadosDocumentosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesListadosDocumentos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoListadosDocumentos=true;
				this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=true;
				this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=true;
			}
			
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=true;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=true;
			this.isVisibilidadCeldaEliminarListadosDocumentos=true;
			this.isVisibilidadCeldaCancelarListadosDocumentos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=true;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=true;
			this.isVisibilidadCeldaModificarListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=true;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
			this.isVisibilidadCeldaModificarListadosDocumentos=true;
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
			this.isVisibilidadCeldaCancelarListadosDocumentos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				} else {
					this.isVisibilidadCeldaGuardarListadosDocumentos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ListadosDocumentosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoListadosDocumentos=true;
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=true;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=true;
		} else {
			this.actualizarEstadoPanelsListadosDocumentos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarListadosDocumentos=false;
			//this.isVisibilidadCeldaVerFormListadosDocumentos=false;
			this.isVisibilidadCeldaDuplicarListadosDocumentos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!listadosdocumentosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
		} else {
			this.isVisibilidadCeldaNuevoListadosDocumentos=false;
			this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			if(!listadosdocumentosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;												
			}
			
			this.jButtonCerrarListadosDocumentos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
		}
		
		if(!this.permiteMantenimiento(this.listadosdocumentos)) {
			this.isVisibilidadCeldaActualizarListadosDocumentos=false;
			this.isVisibilidadCeldaEliminarListadosDocumentos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoListadosDocumentos=false;
		this.isVisibilidadCeldaNuevoRelacionesListadosDocumentos=false;
		this.isVisibilidadCeldaGuardarCambiosListadosDocumentos=false;
		//this.isVisibilidadCeldaModificarListadosDocumentos=true;
		this.isVisibilidadCeldaActualizarListadosDocumentos=false;
		this.isVisibilidadCeldaEliminarListadosDocumentos=false;
		//this.isVisibilidadCeldaCancelarListadosDocumentos=true;			
		this.isVisibilidadCeldaGuardarListadosDocumentos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesListadosDocumentos() {
	}
	
	public void actualizarEstadoPanelsListadosDocumentos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionListadosDocumentos!=null) {
				this.jScrollPanelDatosEdicionListadosDocumentos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosListadosDocumentos!=null) {
				this.jScrollPanelDatosListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelPaginacionListadosDocumentos!=null) {
				this.jPanelPaginacionListadosDocumentos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
					this.jTabbedPaneBusquedasListadosDocumentos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.listadosdocumentosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasListadosDocumentos!=null) {
				this.jTabbedPaneBusquedasListadosDocumentos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesListadosDocumentos!=null) {
				this.jPanelParametrosReportesListadosDocumentos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaListadosDocumentos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaListadosDocumentos) {this.jTabbedPaneBusquedasListadosDocumentos.remove(jPanelBusquedaListadosDocumentosListadosDocumentos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaListadosDocumentos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaListadosDocumentos) {this.jTabbedPaneBusquedasListadosDocumentos.remove(jPanelBusquedaListadosDocumentosListadosDocumentos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadBusquedaListadosDocumentos=isParaEjercicio;
			if(!this.isVisibilidadBusquedaListadosDocumentos) {this.jTabbedPaneBusquedasListadosDocumentos.remove(jPanelBusquedaListadosDocumentosListadosDocumentos);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoMovimiento(Boolean isParaTipoMovimiento){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoMovimientoNegation=!isParaTipoMovimiento;

			this.isVisibilidadBusquedaListadosDocumentos=isParaTipoMovimiento;
			if(!this.isVisibilidadBusquedaListadosDocumentos) {this.jTabbedPaneBusquedasListadosDocumentos.remove(jPanelBusquedaListadosDocumentosListadosDocumentos);}
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
			
			this.inicializarActualizarBindingTablaListadosDocumentos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioListadosDocumentos() {
		this.updateBorderResaltarBusquedasFormularioListadosDocumentos();
		this.updateVisibilidadBusquedasFormularioListadosDocumentos();
		this.updateHabilitarBusquedasFormularioListadosDocumentos();
	}
	
	public void updateBorderResaltarBusquedasFormularioListadosDocumentos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasListadosDocumentos.getComponents().length>0) {
	

		if(this.listadosdocumentosConstantesFunciones.resaltarBusquedaListadosDocumentosListadosDocumentos!=null) {
			index= this.jTabbedPaneBusquedasListadosDocumentos.indexOfComponent(this.jPanelBusquedaListadosDocumentosListadosDocumentos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosDocumentos.getComponent(index);
				jPanel.setBorder(this.listadosdocumentosConstantesFunciones.resaltarBusquedaListadosDocumentosListadosDocumentos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioListadosDocumentos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasListadosDocumentos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosDocumentos.indexOfComponent(this.jPanelBusquedaListadosDocumentosListadosDocumentos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasListadosDocumentos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.listadosdocumentosConstantesFunciones.mostrarBusquedaListadosDocumentosListadosDocumentos);
			if(!this.listadosdocumentosConstantesFunciones.mostrarBusquedaListadosDocumentosListadosDocumentos && index>-1) {
				this.jTabbedPaneBusquedasListadosDocumentos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioListadosDocumentos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasListadosDocumentos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasListadosDocumentos.indexOfComponent(this.jPanelBusquedaListadosDocumentosListadosDocumentos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasListadosDocumentos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.listadosdocumentosConstantesFunciones.activarBusquedaListadosDocumentosListadosDocumentos);
				this.jTabbedPaneBusquedasListadosDocumentos.setEnabledAt(index,this.listadosdocumentosConstantesFunciones.activarBusquedaListadosDocumentosListadosDocumentos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaListadosDocumentos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaListadosDocumentos")) {
			index= this.jTabbedPaneBusquedasListadosDocumentos.indexOfComponent(this.jPanelBusquedaListadosDocumentosListadosDocumentos);

			this.jTabbedPaneBusquedasListadosDocumentos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasListadosDocumentos.getComponent(index);

			this.listadosdocumentosConstantesFunciones.setResaltarBusquedaListadosDocumentosListadosDocumentos(resaltar);

			jPanel.setBorder(this.listadosdocumentosConstantesFunciones.resaltarBusquedaListadosDocumentosListadosDocumentos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarListadosDocumentos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioListadosDocumentos() throws Exception {

		if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioListadosDocumentos();
		this.updateVisibilidadResaltarControlesFormularioListadosDocumentos();
		this.updateHabilitarResaltarControlesFormularioListadosDocumentos();
		
	}
	
	public void updateBorderResaltarControlesFormularioListadosDocumentos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.listadosdocumentosConstantesFunciones.resaltaridListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltaridListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarid_empresaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarid_empresaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarid_sucursalListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarid_sucursalListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarid_ejercicioListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarid_ejercicioListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarid_tipo_movimientoListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarid_tipo_movimientoListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarfecha_desdeListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_desdeListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarfecha_desdeListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarfecha_hastaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_hastaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarfecha_hastaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarfechaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarfechaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltartipo_movimientoListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltartipo_movimientoListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarcodigoListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarcodigoListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarbeneficiarioListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarbeneficiarioListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarbeneficiario_chequeListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarbeneficiario_chequeListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltardetalleListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltardetalleListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarvalor_chequeListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarvalor_chequeListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarnombre_empresaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarnombre_empresaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarruc_empresaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarruc_empresaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltardireccion_empresaListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltardireccion_empresaListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarnombre_sucursalListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarnombre_sucursalListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarvalorListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarvalorListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarnumero_mayorListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarnumero_mayorListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarfecha_emisionListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarfecha_emisionListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarfecha_finalizacionListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarfecha_finalizacionListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarnombre_usuarioListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarnombre_usuarioListadosDocumentos);}
		if(this.listadosdocumentosConstantesFunciones.resaltarnumero_chequeListadosDocumentos!=null && this.jInternalFrameDetalleFormListadosDocumentos!=null) {this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setBorder(this.listadosdocumentosConstantesFunciones.resaltarnumero_chequeListadosDocumentos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioListadosDocumentos() throws Exception {		
		if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
	
		//this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostraridListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelidListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostraridListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelid_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_empresaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_sucursalListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelid_sucursalListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_sucursalListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_ejercicioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelid_ejercicioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_ejercicioListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_tipo_movimientoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelid_tipo_movimientoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarid_tipo_movimientoListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_desdeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_desdeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelfecha_desdeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_desdeListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_hastaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_hastaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelfecha_hastaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_hastaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfechaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelfechaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfechaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrartipo_movimientoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPaneltipo_movimientoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrartipo_movimientoListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarcodigoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelcodigoListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarcodigoListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarbeneficiarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelbeneficiarioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarbeneficiarioListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarbeneficiario_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelbeneficiario_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarbeneficiario_chequeListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrardetalleListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPaneldetalleListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrardetalleListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarvalor_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelvalor_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarvalor_chequeListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelnombre_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_empresaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarruc_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelruc_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarruc_empresaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrardireccion_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPaneldireccion_empresaListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrardireccion_empresaListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_sucursalListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelnombre_sucursalListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_sucursalListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarvalorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelvalorListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarvalorListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnumero_mayorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelnumero_mayorListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnumero_mayorListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_emisionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelfecha_emisionListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_emisionListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_finalizacionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelfecha_finalizacionListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarfecha_finalizacionListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_usuarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelnombre_usuarioListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnombre_usuarioListadosDocumentos);
		//this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnumero_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jPanelnumero_chequeListadosDocumentos.setVisible(this.listadosdocumentosConstantesFunciones.mostrarnumero_chequeListadosDocumentos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioListadosDocumentos() throws Exception {
		if(this.jInternalFrameDetalleFormListadosDocumentos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormListadosDocumentos!=null) {
	
		this.jInternalFrameDetalleFormListadosDocumentos.jLabelidListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activaridListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_empresaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarid_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_sucursalListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarid_sucursalListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_ejercicioListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarid_ejercicioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jComboBoxid_tipo_movimientoListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarid_tipo_movimientoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_desdeListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarfecha_desdeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_hastaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarfecha_hastaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfechaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarfechaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreatipo_movimientoListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activartipo_movimientoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldcodigoListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarcodigoListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiarioListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarbeneficiarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreabeneficiario_chequeListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarbeneficiario_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadetalleListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activardetalleListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalor_chequeListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarvalor_chequeListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_empresaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarnombre_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldruc_empresaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarruc_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreadireccion_empresaListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activardireccion_empresaListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanombre_sucursalListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarnombre_sucursalListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldvalorListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarvalorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextAreanumero_mayorListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarnumero_mayorListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_emisionListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarfecha_emisionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jDateChooserfecha_finalizacionListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarfecha_finalizacionListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnombre_usuarioListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarnombre_usuarioListadosDocumentos);
		this.jInternalFrameDetalleFormListadosDocumentos.jTextFieldnumero_chequeListadosDocumentos.setEnabled(this.listadosdocumentosConstantesFunciones.activarnumero_chequeListadosDocumentos);
		}
	}
	
		
}