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
package com.bydan.erp.inventario.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.inventario.util.ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoCrearEtiquetasCodigoBarrasParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoCrearEtiquetasCodigoBarrasBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.inventario.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.inventario.util.*;

import com.bydan.erp.inventario.util.report.*;
import com.bydan.erp.inventario.business.logic.report.*;

import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.inventario.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame extends ProcesoCrearEtiquetasCodigoBarrasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrasValidator = new ClassValidator<ProcesoCrearEtiquetasCodigoBarras>(ProcesoCrearEtiquetasCodigoBarras.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras;	
	public ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux;
	public ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasTotales;
	public Long idProcesoCrearEtiquetasCodigoBarrasActual;
	public Long iIdNuevoProcesoCrearEtiquetasCodigoBarras=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
	}

	public String sFinalQueryComboProducto="";

	public List<Producto> productosForeignKey;

	public List<Producto> getproductosForeignKey() {
		return productosForeignKey;
	}

	public void setproductosForeignKey(List<Producto> productosForeignKey) {
		this.productosForeignKey = productosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Producto productoForeignKey;

	public Producto getproductoForeignKey() {
		return productoForeignKey;
	}

	public void setproductoForeignKey(Producto productoForeignKey) {
		this.productoForeignKey = productoForeignKey;
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

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoNuevoProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoActualizarProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoEliminarProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoConsultaProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoReporteProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoCopiarProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoVerFormProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras;
	public Boolean isPermisoOrdenProcesoCrearEtiquetasCodigoBarras;
	
	
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
	
	public ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasReturnGeneral;
	public ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoCrearEtiquetasCodigoBarrasSessionBeanAdditional procesocrearetiquetascodigobarrasSessionBeanAdditional=null;
	
	public ProcesoCrearEtiquetasCodigoBarrasSessionBeanAdditional getProcesoCrearEtiquetasCodigoBarrasSessionBeanAdditional() {
		return this.procesocrearetiquetascodigobarrasSessionBeanAdditional;
	}
	
	public void setProcesoCrearEtiquetasCodigoBarrasSessionBeanAdditional(ProcesoCrearEtiquetasCodigoBarrasSessionBeanAdditional procesocrearetiquetascodigobarrasSessionBeanAdditional) {
		try {
			this.procesocrearetiquetascodigobarrasSessionBeanAdditional=procesocrearetiquetascodigobarrasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional procesocrearetiquetascodigobarrasBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame
	
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional getProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional() {
		return this.procesocrearetiquetascodigobarrasBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional procesocrearetiquetascodigobarrasBeanSwingJInternalFrameAdditional) {
		try {
			this.procesocrearetiquetascodigobarrasBeanSwingJInternalFrameAdditional=procesocrearetiquetascodigobarrasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoCrearEtiquetasCodigoBarrasLogic procesocrearetiquetascodigobarrasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasBean;
	public ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones procesocrearetiquetascodigobarrasConstantesFunciones;
	//public ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasReturnGeneral;
	
	//FK
	
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass;	
	//public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassEliminados;
	//public List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras=true;
	public Boolean isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras=true;
	public Boolean isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras=true;
	public Boolean isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoCrearEtiquetasCodigoBarras() {
		return this.iIdNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setiIdNuevoProcesoCrearEtiquetasCodigoBarras(Long iIdNuevoProcesoCrearEtiquetasCodigoBarras) {
		this.iIdNuevoProcesoCrearEtiquetasCodigoBarras = iIdNuevoProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Long getidProcesoCrearEtiquetasCodigoBarrasActual() {
		return this.idProcesoCrearEtiquetasCodigoBarrasActual;
	}

	public void setidProcesoCrearEtiquetasCodigoBarrasActual(Long idProcesoCrearEtiquetasCodigoBarrasActual) {
		this.idProcesoCrearEtiquetasCodigoBarrasActual = idProcesoCrearEtiquetasCodigoBarrasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoCrearEtiquetasCodigoBarras getprocesocrearetiquetascodigobarras() {
		return this.procesocrearetiquetascodigobarras;
	}

	public void setprocesocrearetiquetascodigobarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) {
		this.procesocrearetiquetascodigobarras = procesocrearetiquetascodigobarras;
	}
	
	public ProcesoCrearEtiquetasCodigoBarras getprocesocrearetiquetascodigobarrasAux() {
		return this.procesocrearetiquetascodigobarrasAux;
	}

	public void setprocesocrearetiquetascodigobarrasAux(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux) {
		this.procesocrearetiquetascodigobarrasAux = procesocrearetiquetascodigobarrasAux;
	}				
	
	public ProcesoCrearEtiquetasCodigoBarras getprocesocrearetiquetascodigobarrasAnterior() {
		return this.procesocrearetiquetascodigobarrasAnterior;
	}

	public void setprocesocrearetiquetascodigobarrasAnterior(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAnterior) {
		this.procesocrearetiquetascodigobarrasAnterior = procesocrearetiquetascodigobarrasAnterior;
	}	
	
	public ProcesoCrearEtiquetasCodigoBarras getprocesocrearetiquetascodigobarrasTotales() {
		return this.procesocrearetiquetascodigobarrasTotales;
	}

	public void setprocesocrearetiquetascodigobarrasTotales(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasTotales) {
		this.procesocrearetiquetascodigobarrasTotales = procesocrearetiquetascodigobarrasTotales;
	}	
	
	public ProcesoCrearEtiquetasCodigoBarras getprocesocrearetiquetascodigobarrasBean() {
		return this.procesocrearetiquetascodigobarrasBean;
	}

	public void setprocesocrearetiquetascodigobarrasBean(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasBean) {
		this.procesocrearetiquetascodigobarrasBean = procesocrearetiquetascodigobarrasBean;
	}	
	
	public ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral getprocesocrearetiquetascodigobarrasReturnGeneral() {
		return this.procesocrearetiquetascodigobarrasReturnGeneral;
	}

	public void setprocesocrearetiquetascodigobarrasReturnGeneral(ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasReturnGeneral) {
		this.procesocrearetiquetascodigobarrasReturnGeneral = procesocrearetiquetascodigobarrasReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras = id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

;
	public Long id_productoBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_productoBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_productoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_productoBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_productoBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_productoBusquedaProcesoCrearEtiquetasCodigoBarras = id_productoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

;
	public Long id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_lineaBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_lineaBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras = id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

;
	public Long id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras = id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

;
	public Long id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras = id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

;
	public Long id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras=-1L;

	public Long getid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras(Long id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras = id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
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
	
	
	public ProcesoCrearEtiquetasCodigoBarrasLogic getProcesoCrearEtiquetasCodigoBarrasLogic()	{		
		return procesocrearetiquetascodigobarrasLogic;
	}

	public void setProcesoCrearEtiquetasCodigoBarrasLogic(ProcesoCrearEtiquetasCodigoBarrasLogic procesocrearetiquetascodigobarrasLogic) {
		this.procesocrearetiquetascodigobarrasLogic = procesocrearetiquetascodigobarrasLogic;
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
	
	public Boolean getIsEsNuevoProcesoCrearEtiquetasCodigoBarras() {
		return isEsNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsEsNuevoProcesoCrearEtiquetasCodigoBarras(Boolean isEsNuevoProcesoCrearEtiquetasCodigoBarras) {
		this.isEsNuevoProcesoCrearEtiquetasCodigoBarras = isEsNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras() {
		return esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras(Boolean esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras) {
		this.esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras = esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras;
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
	
	
	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosProductosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.productosForeignKey=new ArrayList<Producto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProductoLogic productoLogic=new ProductoLogic();

			productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

					productoLogic.getTodosProductosWithConnection(sFinalQuery,new Pagination());

					this.productosForeignKey=productoLogic.getProductos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProducto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidProductoActual());
					this.productosForeignKey.add(productoLogic.getProducto());
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

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidEmpresaActual());
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

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidSucursalActual());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(procesocrearetiquetascodigobarrasSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

	
	
	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProductoForeignKey(Long idProductoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(productoTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualProductoForeignKeyDescripcion(Long idProductoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}


			sDescripcion=ProductoConstantesFunciones.getProductoDescripcion(productoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Producto  productoTemp=null;

			for(Producto productoAux:productosForeignKey) {
				if(productoAux.getId()!=null && productoAux.getId().equals(idProductoSeleccionado)) {
					productoTemp=productoAux;
					break;
				}
			}

			if(productoTemp!=null) {
				jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
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
				jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
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

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.procesocrearetiquetascodigobarras!=null) {
						this.procesocrearetiquetascodigobarras.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
						jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
							//jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico!=null && jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_bodega(bodegaAux.getId());
				procesocrearetiquetascodigobarras.setbodega_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getBodegaDescripcion(bodegaAux));
				procesocrearetiquetascodigobarras.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_producto(productoAux.getId());
				procesocrearetiquetascodigobarras.setproducto_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getProductoDescripcion(productoAux));
				procesocrearetiquetascodigobarras.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_empresa(empresaAux.getId());
				procesocrearetiquetascodigobarras.setempresa_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesocrearetiquetascodigobarras.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_sucursal(sucursalAux.getId());
				procesocrearetiquetascodigobarras.setsucursal_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesocrearetiquetascodigobarras.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_linea(lineaAux.getId());
				procesocrearetiquetascodigobarras.setlinea_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getLineaDescripcion(lineaAux));
				procesocrearetiquetascodigobarras.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_linea_grupo(lineaAux.getId());
				procesocrearetiquetascodigobarras.setlineagrupo_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				procesocrearetiquetascodigobarras.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_linea_categoria(lineaAux.getId());
				procesocrearetiquetascodigobarras.setlineacategoria_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				procesocrearetiquetascodigobarras.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,JComboBox jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarrasGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesocrearetiquetascodigobarras.setid_linea_marca(lineaAux.getId());
				procesocrearetiquetascodigobarras.setlineamarca_descripcion(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				procesocrearetiquetascodigobarras.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(bodega);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(producto);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(linea);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(lineagrupo);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(lineacategoria);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { 
					}

					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addItem(lineamarca);
							}
						}

						if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoCrearEtiquetasCodigoBarras() throws Exception {
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
		
	public ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral getProcesoCrearEtiquetasCodigoBarrasParameterGeneral() {
		return this.procesocrearetiquetascodigobarrasParameterGeneral;
	}
	
	public void setProcesoCrearEtiquetasCodigoBarrasParameterGeneral(ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasParameterGeneral) {
		this.procesocrearetiquetascodigobarrasParameterGeneral = procesocrearetiquetascodigobarrasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoTodoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoTodoProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoTodoProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoTodoProcesoCrearEtiquetasCodigoBarras = isPermisoTodoProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoNuevoProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoNuevoProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoNuevoProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras = isPermisoNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoActualizarProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoActualizarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoActualizarProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoActualizarProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras = isPermisoActualizarProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoEliminarProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoEliminarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoEliminarProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoEliminarProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras = isPermisoEliminarProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras = isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoConsultaProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoConsultaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoConsultaProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoConsultaProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoConsultaProcesoCrearEtiquetasCodigoBarras = isPermisoConsultaProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoBusquedaProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras = isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsPermisoReporteProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoReporteProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoReporteProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoReporteProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras = isPermisoReporteProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras = isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras = isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras = isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoCopiarProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoCopiarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoCopiarProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoCopiarProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras = isPermisoCopiarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoVerFormProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoVerFormProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoVerFormProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoVerFormProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras = isPermisoVerFormProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoDuplicarProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoDuplicarProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras = isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsPermisoOrdenProcesoCrearEtiquetasCodigoBarras() {
		return isPermisoOrdenProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsPermisoOrdenProcesoCrearEtiquetasCodigoBarras(Boolean isPermisoOrdenProcesoCrearEtiquetasCodigoBarras) {
		this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras = isPermisoOrdenProcesoCrearEtiquetasCodigoBarras;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras() {
		return isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras = isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras;
	}
		
	public ProcesoCrearEtiquetasCodigoBarrasSessionBean getprocesocrearetiquetascodigobarrasSessionBean() {
		return this.procesocrearetiquetascodigobarrasSessionBean;
	}
	
	public void setprocesocrearetiquetascodigobarrasSessionBean(ProcesoCrearEtiquetasCodigoBarrasSessionBean procesocrearetiquetascodigobarrasSessionBean) {
		this.procesocrearetiquetascodigobarrasSessionBean=procesocrearetiquetascodigobarrasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras() {
		return this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public void setisVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras(Boolean isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {
		this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras;
	}

	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarProductoForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarEmpresaForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarSucursalForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarLineaForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarLineaGrupoForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(procesocrearetiquetascodigobarras,null);
				this.setActualParaGuardarLineaMarcaForeignKey(procesocrearetiquetascodigobarras,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesocrearetiquetascodigobarrasAux.setId(procesocrearetiquetascodigobarras.getId());
		procesocrearetiquetascodigobarrasAux.setVersionRow(procesocrearetiquetascodigobarras.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal) throws Exception {
		
		if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal) throws Exception {	
		if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				procesocrearetiquetascodigobarrasLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				procesocrearetiquetascodigobarrasLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesocrearetiquetascodigobarrasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesocrearetiquetascodigobarrasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetascodigobarrasLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetascodigobarrasLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetascodigobarrasLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				procesocrearetiquetascodigobarrasLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoCrearEtiquetasCodigoBarrasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesocrearetiquetascodigobarrasValidator.getInvalidValues(this.procesocrearetiquetascodigobarras);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrass) throws Exception {
		try	{			
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.actualizarSelectedLista(procesocrearetiquetascodigobarras,procesocrearetiquetascodigobarrass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesocrearetiquetascodigobarrassLocal=this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesocrearetiquetascodigobarrassLocal=this.procesocrearetiquetascodigobarrass;
			}
			//ARCHITECTURE
		
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal:procesocrearetiquetascodigobarrassLocal) {
				if(this.permiteMantenimiento(procesocrearetiquetascodigobarrasLocal) && procesocrearetiquetascodigobarrasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getProcesoCrearEtiquetasCodigoBarrasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelcodigoProcesoCrearEtiquetasCodigoBarras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnombreProcesoCrearEtiquetasCodigoBarras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelprecioProcesoCrearEtiquetasCodigoBarras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnumeroProcesoCrearEtiquetasCodigoBarras,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TALLA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabeltallaProcesoCrearEtiquetasCodigoBarras,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelcodigoProcesoCrearEtiquetasCodigoBarras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnombreProcesoCrearEtiquetasCodigoBarras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelprecioProcesoCrearEtiquetasCodigoBarras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnumeroProcesoCrearEtiquetasCodigoBarras,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabeltallaProcesoCrearEtiquetasCodigoBarras,"");
		
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
		this.iIdNuevoProcesoCrearEtiquetasCodigoBarras--;	
		
		
		this.procesocrearetiquetascodigobarrasAux=new ProcesoCrearEtiquetasCodigoBarras();
		
		this.procesocrearetiquetascodigobarrasAux.setId(this.iIdNuevoProcesoCrearEtiquetasCodigoBarras);
		this.procesocrearetiquetascodigobarrasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().add(this.procesocrearetiquetascodigobarrasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesocrearetiquetascodigobarrass.add(this.procesocrearetiquetascodigobarrasAux);
		}
		//ARCHITECTURE
		
		this.procesocrearetiquetascodigobarras=this.procesocrearetiquetascodigobarrasAux;
		
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
		}
				
		//this.setDefaultControlesProcesoCrearEtiquetasCodigoBarras();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasBean,this.procesocrearetiquetascodigobarras,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral,this.procesocrearetiquetascodigobarrasBean,false);
		
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras());
		}
		
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras(),classes);//this.procesocrearetiquetascodigobarrasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.RecargarFormProcesoCrearEtiquetasCodigoBarras(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
						
			if(procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();
			}
			
			this.actualizarVisualTableDatosProcesoCrearEtiquetasCodigoBarras();
			
			this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras(), this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras());
			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
						
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarcodigoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnombreProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarprecioProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnumeroProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activartallaProcesoCrearEtiquetasCodigoBarras);	
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_bodegaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_productoProcesoCrearEtiquetasCodigoBarras);//
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_empresaProcesoCrearEtiquetasCodigoBarras);//
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_sucursalProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_lineaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_grupoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setEnabled(isHabilitar && this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_marcaProcesoCrearEtiquetasCodigoBarras);
	};
	
	public void setDefaultControlesProcesoCrearEtiquetasCodigoBarras() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasCodigoBarras(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(true);			
			this.procesocrearetiquetascodigobarrasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			
					
		} else {
			//this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(false);			
			this.procesocrearetiquetascodigobarrasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoCrearEtiquetasCodigoBarras() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				if(procesocrearetiquetascodigobarrasAux.getId().equals(this.iIdNuevoProcesoCrearEtiquetasCodigoBarras)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrass) {
				if(procesocrearetiquetascodigobarrasAux.getId().equals(this.iIdNuevoProcesoCrearEtiquetasCodigoBarras)) {
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
	
	public int getIndiceActualProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				if(procesocrearetiquetascodigobarrasAux.getId().equals(procesocrearetiquetascodigobarras.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrass) {
				if(procesocrearetiquetascodigobarrasAux.getId().equals(procesocrearetiquetascodigobarras.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				if(procesocrearetiquetascodigobarrasAux.getProcesoCrearEtiquetasCodigoBarrasOriginal().getId().equals(procesocrearetiquetascodigobarrasOriginal.getId())) {
					existe=true;
					procesocrearetiquetascodigobarrasOriginal.setId(procesocrearetiquetascodigobarrasAux.getId());
					procesocrearetiquetascodigobarrasOriginal.setVersionRow(procesocrearetiquetascodigobarrasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrass) {
				if(procesocrearetiquetascodigobarrasAux.getProcesoCrearEtiquetasCodigoBarrasOriginal().getId().equals(procesocrearetiquetascodigobarrasOriginal.getId())) {
					existe=true;
					procesocrearetiquetascodigobarrasOriginal.setId(procesocrearetiquetascodigobarrasAux.getId());
					procesocrearetiquetascodigobarrasOriginal.setVersionRow(procesocrearetiquetascodigobarrasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoCrearEtiquetasCodigoBarras(Boolean esParaCancelar) throws Exception {
		procesocrearetiquetascodigobarrassAux=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
		procesocrearetiquetascodigobarrasAux=new ProcesoCrearEtiquetasCodigoBarras();
		
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
					if(procesocrearetiquetascodigobarrasAux.getId()<0) {
						procesocrearetiquetascodigobarrassAux.add(procesocrearetiquetascodigobarrasAux);
					}		
				}
				this.iIdNuevoProcesoCrearEtiquetasCodigoBarras=0L;
				this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().removeAll(procesocrearetiquetascodigobarrassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrass) {
					if(procesocrearetiquetascodigobarrasAux.getId()<0) {
						procesocrearetiquetascodigobarrassAux.add(procesocrearetiquetascodigobarrasAux);
					}		
				}
				this.iIdNuevoProcesoCrearEtiquetasCodigoBarras=0L;
				this.procesocrearetiquetascodigobarrass.removeAll(procesocrearetiquetascodigobarrassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoCrearEtiquetasCodigoBarras 
					&& this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size()>0
					) {
					procesocrearetiquetascodigobarrasAux=this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().get(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size() - 1);
				
					if(procesocrearetiquetascodigobarrasAux.getId()<0) {
						this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().remove(procesocrearetiquetascodigobarrasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoCrearEtiquetasCodigoBarras && this.procesocrearetiquetascodigobarrass.size()>0) {
					procesocrearetiquetascodigobarrasAux=this.procesocrearetiquetascodigobarrass.get(this.procesocrearetiquetascodigobarrass.size() - 1);
				
					if(procesocrearetiquetascodigobarrasAux.getId()<0) {
						this.procesocrearetiquetascodigobarrass.remove(procesocrearetiquetascodigobarrasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoCrearEtiquetasCodigoBarras(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesocrearetiquetascodigobarras.getId()<0) {
				this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().remove(this.procesocrearetiquetascodigobarras);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesocrearetiquetascodigobarras.getId()<0) {
				this.procesocrearetiquetascodigobarrass.remove(this.procesocrearetiquetascodigobarras);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoCrearEtiquetasCodigoBarras(List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassAux) throws Exception {
		ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.setEstadosInicialesProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrassAux);
	}
	
	public void setEstadosInicialesProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux) throws Exception {
		ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.setEstadosInicialesProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoCrearEtiquetasCodigoBarrasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoCrearEtiquetasCodigoBarrasActual()) {
				if(!this.isEsNuevoProcesoCrearEtiquetasCodigoBarras) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoCrearEtiquetasCodigoBarrasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Crear Etiquetas Codigo Barras ?", "MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) throws Exception {
		ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.seleccionarAsignar(this.procesocrearetiquetascodigobarras,procesocrearetiquetascodigobarras);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras=this.isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras;
			
			
			this.seleccionarAsignar(procesocrearetiquetascodigobarras);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesocrearetiquetascodigobarrasSessionBean.setsFuncionBusquedaRapida(this.procesocrearetiquetascodigobarrasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoCrearEtiquetasCodigoBarras) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoCrearEtiquetasCodigoBarras(esParaCancelar);				
				this.cancelarNuevoProcesoCrearEtiquetasCodigoBarras(esParaCancelar);								
			}
			
			this.procesocrearetiquetascodigobarras=new ProcesoCrearEtiquetasCodigoBarras();
			
			this.inicializarProcesoCrearEtiquetasCodigoBarras();
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoCrearEtiquetasCodigoBarras() throws Exception {
		try {
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.inicializarProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoCrearEtiquetasCodigoBarrass(String sAccionBusqueda,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoCrearEtiquetasCodigoBarras"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoCrearEtiquetasCodigoBarrasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoCrearEtiquetasCodigoBarrasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoCrearEtiquetasCodigoBarras"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Crear Etiquetas Codigo Barrases");		
		parameters.put("busquedapor", ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoCrearEtiquetasCodigoBarras=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoCrearEtiquetasCodigoBarras=new JRBeanArrayDataSource(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.TraerProcesoCrearEtiquetasCodigoBarrasBeans(procesocrearetiquetascodigobarrassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoCrearEtiquetasCodigoBarras);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoCrearEtiquetasCodigoBarrasBean.TraerProcesoCrearEtiquetasCodigoBarrasBeans(procesocrearetiquetascodigobarrassParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(null);
					//this.generarExcelReporteProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoCrearEtiquetasCodigoBarrass(sAccionBusqueda,sTipoArchivoReporte,procesocrearetiquetascodigobarrassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoCrearEtiquetasCodigoBarrass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasCodigoBarrass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCrearEtiquetasCodigoBarras("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras : procesocrearetiquetascodigobarrassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.generarExcelReporteDataProcesoCrearEtiquetasCodigoBarras("NORMAL",row,workbook,procesocrearetiquetascodigobarras,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoCrearEtiquetasCodigoBarras(String sTipo,Row row,Workbook workbook) {
		
		ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.generarExcelReporteHeaderProcesoCrearEtiquetasCodigoBarras(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoCrearEtiquetasCodigoBarrass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasCodigoBarrass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras : procesocrearetiquetascodigobarrassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getProcesoCrearEtiquetasCodigoBarrasDescripcion(procesocrearetiquetascodigobarras));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesocrearetiquetascodigobarras.gettalla());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoCrearEtiquetasCodigoBarrass(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassRespaldo=null;
		
		classes=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getClassesRelationshipsOfProcesoCrearEtiquetasCodigoBarras(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesocrearetiquetascodigobarrasLogic.setDatosCliente(this.datosCliente);
		this.procesocrearetiquetascodigobarrasLogic.setDatosDeep(this.datosDeep);
		this.procesocrearetiquetascodigobarrasLogic.setIsConDeep(true);
		
		procesocrearetiquetascodigobarrassRespaldo=this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass();
		
		this.procesocrearetiquetascodigobarrasLogic.setProcesoCrearEtiquetasCodigoBarrass(procesocrearetiquetascodigobarrassParaReportes);	
		this.procesocrearetiquetascodigobarrasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesocrearetiquetascodigobarrassParaReportes=this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass();
		this.procesocrearetiquetascodigobarrasLogic.setProcesoCrearEtiquetasCodigoBarrass(procesocrearetiquetascodigobarrassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasCodigoBarrass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoCrearEtiquetasCodigoBarras("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras : procesocrearetiquetascodigobarrassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoCrearEtiquetasCodigoBarras("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.generarExcelReporteDataProcesoCrearEtiquetasCodigoBarras("NORMAL",row,workbook,procesocrearetiquetascodigobarras,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getProcesoCrearEtiquetasCodigoBarrasDescripcion(procesocrearetiquetascodigobarras));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		this.startProcessProcesoCrearEtiquetasCodigoBarras(true);
	}
	
	public void startProcessProcesoCrearEtiquetasCodigoBarras(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras ,this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras,this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras, this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras,this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras,this.jmenuBarProcesoCrearEtiquetasCodigoBarras,this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras=this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras; 
		
		final JPanel jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras=this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras;
		//final JScrollPane jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras=this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras;
		final JTable jTableDatosProcesoCrearEtiquetasCodigoBarras=this.jTableDatosProcesoCrearEtiquetasCodigoBarras;		
		final JPanel jPanelPaginacionProcesoCrearEtiquetasCodigoBarras=this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras=this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras;
		final JPanel jPanelAccionesProcesoCrearEtiquetasCodigoBarras=this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
		
		JPanel jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelCamposProcesoCrearEtiquetasCodigoBarras;
			jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
		}
		
		final JPanel jPanelCamposProcesoCrearEtiquetasCodigoBarras=jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras;
		final JPanel jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras=jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras;
		
		
		final JMenuBar jmenuBarProcesoCrearEtiquetasCodigoBarras=this.jmenuBarProcesoCrearEtiquetasCodigoBarras;
		final JToolBar jTtoolBarProcesoCrearEtiquetasCodigoBarras=this.jTtoolBarProcesoCrearEtiquetasCodigoBarras;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras;
			jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras;
		}
		
		final JMenuBar jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras=jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras;
		final JToolBar jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras=jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTableDatos=jTableDatosProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelCampos=jPanelCamposProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTtoolBar=jTtoolBarProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras ,jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras,jTableDatosProcesoCrearEtiquetasCodigoBarras, /*jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras,*/jPanelCamposProcesoCrearEtiquetasCodigoBarras,jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, /*jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras,*/ jPanelAccionesProcesoCrearEtiquetasCodigoBarras,jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras,jmenuBarProcesoCrearEtiquetasCodigoBarras,jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,jTtoolBarProcesoCrearEtiquetasCodigoBarras,jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras ,jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras,jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras, jPanelAccionesProcesoCrearEtiquetasCodigoBarras,jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras,jmenuBarProcesoCrearEtiquetasCodigoBarras,jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,jTtoolBarProcesoCrearEtiquetasCodigoBarras,jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras);
						
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
	
	public void finishProcessProcesoCrearEtiquetasCodigoBarras() {// throws Exception 
		this.finishProcessProcesoCrearEtiquetasCodigoBarras(true);
	}
	
	public void finishProcessProcesoCrearEtiquetasCodigoBarras(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras ,this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras,this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras, this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras,this.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras,this.jmenuBarProcesoCrearEtiquetasCodigoBarras,this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras=this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras; 
		
		final JPanel jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras=this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras;
		//final JScrollPane jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras=this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras;
		final JTable jTableDatosProcesoCrearEtiquetasCodigoBarras=this.jTableDatosProcesoCrearEtiquetasCodigoBarras;		
		final JPanel jPanelPaginacionProcesoCrearEtiquetasCodigoBarras=this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras;
		//final JScrollPane jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras=this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras;
		final JPanel jPanelAccionesProcesoCrearEtiquetasCodigoBarras=this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
		
		JPanel jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelCamposProcesoCrearEtiquetasCodigoBarras;
			jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
		}
		
		final JPanel jPanelCamposProcesoCrearEtiquetasCodigoBarras=jPanelCamposAuxiliarProcesoCrearEtiquetasCodigoBarras;
		final JPanel jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras=jPanelAccionesFormularioAuxiliarProcesoCrearEtiquetasCodigoBarras;
		
		
		final JMenuBar jmenuBarProcesoCrearEtiquetasCodigoBarras=this.jmenuBarProcesoCrearEtiquetasCodigoBarras;		
		final JToolBar jTtoolBarProcesoCrearEtiquetasCodigoBarras=this.jTtoolBarProcesoCrearEtiquetasCodigoBarras;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras;
			jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras=jmenuBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras;
		final JToolBar jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras=jTtoolBarDetalleAuxiliarProcesoCrearEtiquetasCodigoBarras;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTableDatos=jTableDatosProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelCampos=jPanelCamposProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTtoolBar=jTtoolBarProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras ,jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras, jTableDatosProcesoCrearEtiquetasCodigoBarras,/*jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras,*/jPanelCamposProcesoCrearEtiquetasCodigoBarras,jPanelPaginacionProcesoCrearEtiquetasCodigoBarras, /*jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras,*/ jPanelAccionesProcesoCrearEtiquetasCodigoBarras,jPanelAccionesFormularioProcesoCrearEtiquetasCodigoBarras,jmenuBarProcesoCrearEtiquetasCodigoBarras,jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,jTtoolBarProcesoCrearEtiquetasCodigoBarras,jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoCrearEtiquetasCodigoBarras(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoCrearEtiquetasCodigoBarras(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoCrearEtiquetasCodigoBarras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoCrearEtiquetasCodigoBarras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoCrearEtiquetasCodigoBarras,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoCrearEtiquetasCodigoBarras(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoCrearEtiquetasCodigoBarras,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoCrearEtiquetasCodigoBarras,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesocrearetiquetascodigobarrasConstantesFunciones.getsFinalQueryProcesoCrearEtiquetasCodigoBarras();
		String  finalQueryPaginacionTodos=this.procesocrearetiquetascodigobarrasConstantesFunciones.getsFinalQueryProcesoCrearEtiquetasCodigoBarras();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getArrayColumnasGlobalesNoProcesoCrearEtiquetasCodigoBarras(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getArrayColumnasGlobalesProcesoCrearEtiquetasCodigoBarras(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesocrearetiquetascodigobarrassEliminados= new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoCrearEtiquetasCodigoBarras();
		
				///*ProcesoCrearEtiquetasCodigoBarrasSessionBean*/this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			
			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
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
					this.iNumeroPaginacion=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getClassesForeignKeysOfProcesoCrearEtiquetasCodigoBarras(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesocrearetiquetascodigobarras."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesocrearetiquetascodigobarrassAux= new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
			
				
			procesocrearetiquetascodigobarrasLogic.setDatosCliente(this.datosCliente);
			procesocrearetiquetascodigobarrasLogic.setDatosDeep(this.datosDeep);
			procesocrearetiquetascodigobarrasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras")) {
				this.sDetalleReporte=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasCodigoBarras(id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasCodigoBarras(id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasCodigoBarras(id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()==null||procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesocrearetiquetascodigobarrass==null|| procesocrearetiquetascodigobarrass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetascodigobarrassAux=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
						procesocrearetiquetascodigobarrassAux.addAll(procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetascodigobarrassAux=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
							procesocrearetiquetascodigobarrassAux.addAll(procesocrearetiquetascodigobarrass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasCodigoBarras(id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getDetalleIndiceBusquedaProcesoCrearEtiquetasCodigoBarras(id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras,id_productoBusquedaProcesoCrearEtiquetasCodigoBarras,id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras,id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoCrearEtiquetasCodigoBarrass("BusquedaProcesoCrearEtiquetasCodigoBarras",procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoCrearEtiquetasCodigoBarrass("BusquedaProcesoCrearEtiquetasCodigoBarras",procesocrearetiquetascodigobarrass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetascodigobarrasLogic.setProcesoCrearEtiquetasCodigoBarrass(new ArrayList<ProcesoCrearEtiquetasCodigoBarras>());
						procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().addAll(procesocrearetiquetascodigobarrassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetascodigobarrass=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
							procesocrearetiquetascodigobarrass.addAll(procesocrearetiquetascodigobarrassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoCrearEtiquetasCodigoBarras();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoCrearEtiquetasCodigoBarras();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetascodigobarrass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesocrearetiquetascodigobarrass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) {
		Boolean permite=true;
		
		if(this.procesocrearetiquetascodigobarras.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getOrderByListaProcesoCrearEtiquetasCodigoBarras();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getOrderByListaProcesoCrearEtiquetasCodigoBarras();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				if(procesocrearetiquetascodigobarras.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetascodigobarrasTotales=procesocrearetiquetascodigobarras;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:this.procesocrearetiquetascodigobarrass) {
				if(procesocrearetiquetascodigobarras.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetascodigobarrasTotales=procesocrearetiquetascodigobarras;
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
			this.procesocrearetiquetascodigobarrasAux=new ProcesoCrearEtiquetasCodigoBarras();
			this.procesocrearetiquetascodigobarrasAux.setsType(Constantes2.S_TOTALES);
			this.procesocrearetiquetascodigobarrasAux.setIsNew(false);
			this.procesocrearetiquetascodigobarrasAux.setIsChanged(false);
			this.procesocrearetiquetascodigobarrasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass(),this.procesocrearetiquetascodigobarrasAux);
				
				//this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().add(this.procesocrearetiquetascodigobarrasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrass,this.procesocrearetiquetascodigobarrasAux);
				
				this.procesocrearetiquetascodigobarrass.add(this.procesocrearetiquetascodigobarrasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesocrearetiquetascodigobarrasTotales=new ProcesoCrearEtiquetasCodigoBarras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().remove(procesocrearetiquetascodigobarrasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesocrearetiquetascodigobarrass.remove(procesocrearetiquetascodigobarrasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesocrearetiquetascodigobarrasTotales=new ProcesoCrearEtiquetasCodigoBarras();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				if(procesocrearetiquetascodigobarras.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetascodigobarrasTotales=procesocrearetiquetascodigobarras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass(),procesocrearetiquetascodigobarrasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:this.procesocrearetiquetascodigobarrass) {
				if(procesocrearetiquetascodigobarras.getsType().equals(Constantes2.S_TOTALES)) {
					procesocrearetiquetascodigobarrasTotales=procesocrearetiquetascodigobarras;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TotalizarValoresFilaProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrass,procesocrearetiquetascodigobarrasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoCrearEtiquetasCodigoBarras";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoCrearEtiquetasCodigoBarrassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoCrearEtiquetasCodigoBarras() {
		this.isPermisoTodoProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoConsultaProcesoCrearEtiquetasCodigoBarras=true;
		this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras=true;
		this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras=true;
		this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras=false;		
		this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras=false;
		this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=false;
	}
	
	public void setPermisosUsuarioProcesoCrearEtiquetasCodigoBarras(Boolean isPermiso) {
		this.isPermisoTodoProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoConsultaProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoCrearEtiquetasCodigoBarras(Boolean isPermiso) {
		//this.isPermisoTodoProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras=isPermiso;
		//this.isPermisoConsultaProcesoCrearEtiquetasCodigoBarras=isPermiso;
		//this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras=isPermiso;
		//this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras=isPermiso;
		//this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		//this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras=isPermiso;		
		//this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras=isPermiso;
		//this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoCrearEtiquetasCodigoBarrasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoCrearEtiquetasCodigoBarras() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoCrearEtiquetasCodigoBarras=this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras;
			this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setToolTipText(this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoCrearEtiquetasCodigoBarras(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoCrearEtiquetasCodigoBarras(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoCrearEtiquetasCodigoBarras() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoCrearEtiquetasCodigoBarrasListas()throws Exception {
		try	{						
			
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarrasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProductoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.productosForeignKey==null||this.productosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProductoConstantesFunciones.SFINALQUERY;

				this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {
			if(this.procesocrearetiquetascodigobarrasSessionBean==null) {
				this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean();
			}

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				Producto producto=new Producto();
				ProductoConstantesFunciones.setProductoDescripcion(producto,Constantes.SMENSAJE_ESCOJA_OPCION);
				producto.setId(null);

				if(!ProductoConstantesFunciones.ExisteEnLista(this.productosForeignKey,producto,true)) {

					this.productosForeignKey.add(0,producto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.procesocrearetiquetascodigobarrasSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProcesoCrearEtiquetasCodigoBarras(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProcesoCrearEtiquetasCodigoBarras()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesocrearetiquetascodigobarrasSessionBean=new ProcesoCrearEtiquetasCodigoBarrasSessionBean(); 
		this.procesocrearetiquetascodigobarrasConstantesFunciones=new ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones(); 
		this.procesocrearetiquetascodigobarrasBean=new ProcesoCrearEtiquetasCodigoBarras();//(this.procesocrearetiquetascodigobarrasConstantesFunciones); 		
		this.procesocrearetiquetascodigobarrasReturnGeneral=new ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral(); 
		
		this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesocrearetiquetascodigobarrasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoCrearEtiquetasCodigoBarras(true);
			
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
			
			this.procesocrearetiquetascodigobarrasConstantesFunciones=new ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones(); 
			this.procesocrearetiquetascodigobarrasBean=new ProcesoCrearEtiquetasCodigoBarras();//this.procesocrearetiquetascodigobarrasConstantesFunciones); 			
			this.procesocrearetiquetascodigobarrasReturnGeneral=new ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral(); 
		
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Crear Etiquetas Codigo Barras Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesocrearetiquetascodigobarras=new ProcesoCrearEtiquetasCodigoBarras();
			this.procesocrearetiquetascodigobarrass = new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
			this.procesocrearetiquetascodigobarrassAux = new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic=new ProcesoCrearEtiquetasCodigoBarrasLogic();
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			//this.procesocrearetiquetascodigobarrasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesocrearetiquetascodigobarrasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras);	
					}
					
					if(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setVisible(false);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras);
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras);
					this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
					this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras);
					this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setVisible(false);
					this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoCrearEtiquetasCodigoBarrasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesocrearetiquetascodigobarrasReturnGeneral=new ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral();
			
			this.procesocrearetiquetascodigobarrasParameterGeneral=new ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			
			
			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoCrearEtiquetasCodigoBarras();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoCrearEtiquetasCodigoBarras(false);
			
			this.setPermisosUsuarioProcesoCrearEtiquetasCodigoBarras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() 
				|| (this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado() && this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClasesRelacionadas();
			}
			
			if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoCrearEtiquetasCodigoBarrasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoCrearEtiquetasCodigoBarras();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasCodigoBarras();
			}
			
			if(!this.isPermisoBusquedaProcesoCrearEtiquetasCodigoBarras) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasCodigoBarras());
				
				this.tiposColumnasSelect=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasCodigoBarras(true);
				
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
			//if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoCrearEtiquetasCodigoBarras();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoCrearEtiquetasCodigoBarras(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoCrearEtiquetasCodigoBarras(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasCodigoBarras() ;
			
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
			
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				procesocrearetiquetascodigobarrasImplementable= (ProcesoCrearEtiquetasCodigoBarrasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesocrearetiquetascodigobarrasImplementableHome= (ProcesoCrearEtiquetasCodigoBarrasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesocrearetiquetascodigobarrass= new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
			this.procesocrearetiquetascodigobarrassEliminados= new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
						
			this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProcesoCrearEtiquetasCodigoBarras(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoCrearEtiquetasCodigoBarras();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoCrearEtiquetasCodigoBarras();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoCrearEtiquetasCodigoBarras();
			}
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoCrearEtiquetasCodigoBarras(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoCrearEtiquetasCodigoBarras: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoCrearEtiquetasCodigoBarras() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoCrearEtiquetasCodigoBarras")) {
				iIndex=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoCrearEtiquetasCodigoBarras();	
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
	
	public void cargarCombosForeignKeyProcesoCrearEtiquetasCodigoBarras(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoCrearEtiquetasCodigoBarras(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoCrearEtiquetasCodigoBarras(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarrasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		this.cargarCombosFrameForeignKeyProcesoCrearEtiquetasCodigoBarras();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		}
	}
	
	

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProducto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProducto(this.productosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			
			if(jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>=1) {
				jTableDatosProcesoCrearEtiquetasCodigoBarras.removeRowSelectionInterval(0, jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasCodigoBarras(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(true);			
			//this.procesocrearetiquetascodigobarras=new ProcesoCrearEtiquetasCodigoBarras();
			//this.procesocrearetiquetascodigobarras.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras() ;
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasCodigoBarras(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesocrearetiquetascodigobarras);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);				
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoCrearEtiquetasCodigoBarras: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRows().length;			
			}
			
			procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoCrearEtiquetasCodigoBarras--;			
				//ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux= new ProcesoCrearEtiquetasCodigoBarras();			
				//procesocrearetiquetascodigobarrasAux.setId(this.iIdNuevoProcesoCrearEtiquetasCodigoBarras);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasOrigen=new ProcesoCrearEtiquetasCodigoBarras();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasOrigen : procesocrearetiquetascodigobarrassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesocrearetiquetascodigobarrasOrigen =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesocrearetiquetascodigobarrasOrigen =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasCodigoBarras();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesocrearetiquetascodigobarras.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasOrigen,this.procesocrearetiquetascodigobarras,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().add(this.procesocrearetiquetascodigobarrasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarrass.add(this.procesocrearetiquetascodigobarrasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras(), this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras());
				
				int iLastRow =  this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();									
		
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasOrigen=new ProcesoCrearEtiquetasCodigoBarras();
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasDestino=new ProcesoCrearEtiquetasCodigoBarras();
				
			procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesocrearetiquetascodigobarrassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetascodigobarrasOrigen =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocrearetiquetascodigobarrasOrigen =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesocrearetiquetascodigobarrasDestino =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesocrearetiquetascodigobarrasDestino =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesocrearetiquetascodigobarrasOrigen =procesocrearetiquetascodigobarrassSeleccionados.get(0);
				procesocrearetiquetascodigobarrasDestino =procesocrearetiquetascodigobarrassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasOrigen,procesocrearetiquetascodigobarrasDestino,true,false);
				
				procesocrearetiquetascodigobarrasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesocrearetiquetascodigobarrasDestino,procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesocrearetiquetascodigobarrasDestino,procesocrearetiquetascodigobarrass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
				
				//this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras(), this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras());
				
				int iLastRow =  this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(!isVisible);
			this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(!isVisible);
			this.jPanelAccionesProcesoCrearEtiquetasCodigoBarras.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoCrearEtiquetasCodigoBarras();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoCrearEtiquetasCodigoBarras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoCrearEtiquetasCodigoBarras();
			
			this.abrirFrameOrderByProcesoCrearEtiquetasCodigoBarras();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoCrearEtiquetasCodigoBarras();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoCrearEtiquetasCodigoBarras(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSize(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.iWidthFormulario,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.getWidth(),ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.getWidth(),ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jContentPaneDetalleProcesoCrearEtiquetasCodigoBarras.getWidth(),ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,false,this);
				} else {
					this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras);
				this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setVisible(false);
				this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setSelected(false);
				
				this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCrearEtiquetasCodigoBarras"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasCodigoBarras();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras==null) {
				
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras=new ImportacionJInternalFrame(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras);
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSelected(false);


				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCrearEtiquetasCodigoBarras"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras==null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras=new ReporteDinamicoJInternalFrame(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras);
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasCodigoBarras();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras);
			
	       	this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.dispose();
			//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setVisible(true);
	        this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setVisible(true);
	        this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setVisible(false);
	        this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoCrearEtiquetasCodigoBarras() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
	        this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoCrearEtiquetasCodigoBarras(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoCrearEtiquetasCodigoBarras(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(true);
			//this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false) ;
			
			if(procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasCodigoBarras(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoCrearEtiquetasCodigoBarras(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(true);
			//this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesocrearetiquetascodigobarras.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false) ;
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoCrearEtiquetasCodigoBarras(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasCodigoBarras(false);
			
			//if(!this.isEsNuevoProcesoCrearEtiquetasCodigoBarras) {								
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				
			}
			
			if(this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(false);
				
				this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(false);
			
												
				
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoCrearEtiquetasCodigoBarras();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesocrearetiquetascodigobarras.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				this.procesocrearetiquetascodigobarras.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				this.procesocrearetiquetascodigobarras.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoCrearEtiquetasCodigoBarrasModel) this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
				this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(false);
				
				this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(false);
				
				
				
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoCrearEtiquetasCodigoBarras();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>=1) {
				jTableDatosProcesoCrearEtiquetasCodigoBarras.removeRowSelectionInterval(0, jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoCrearEtiquetasCodigoBarras(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(false) ;
			
			this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
			
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoCrearEtiquetasCodigoBarras();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				
				//SI ES MANUAL
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoCrearEtiquetasCodigoBarras--;			
			//ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux= new ProcesoCrearEtiquetasCodigoBarras();			
			//procesocrearetiquetascodigobarrasAux.setId(this.iIdNuevoProcesoCrearEtiquetasCodigoBarras);
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasCodigoBarras();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
			
			this.procesocrearetiquetascodigobarras.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().add(this.procesocrearetiquetascodigobarrasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesocrearetiquetascodigobarrass.add(this.procesocrearetiquetascodigobarrasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			
			this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras(), this.getIndiceNuevoProcesoCrearEtiquetasCodigoBarras());
			
			int iLastRow =  this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoCrearEtiquetasCodigoBarras.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();
			}
			
			//this.abrirFrameTreeProcesoCrearEtiquetasCodigoBarras();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setFileImportacion(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoCrearEtiquetasCodigoBarras.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		

		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoCrearEtiquetasCodigoBarrasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoCrearEtiquetasCodigoBarrasBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lla_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lla_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lla_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lla_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA:
					sNombreCampoCategoria="talla";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA:
					sNombreCampoCategoriaValor="talla";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Talla",sNombreCampoCategoria,sNombreCampoCategoriaValor,"talla");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoCrearEtiquetasCodigoBarrass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA);
					iRow++;

					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras:procesocrearetiquetascodigobarrassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesocrearetiquetascodigobarras.gettalla());
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
			//	this.getFilaCabeceraExportarExcelProcesoCrearEtiquetasCodigoBarras(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
			
			//SI ES MANUAL
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoCrearEtiquetasCodigoBarras(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasCodigoBarras(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasCodigoBarras(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras();
		
		this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasCodigoBarras();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasCodigoBarras() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasCodigoBarras(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasCodigoBarras(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoCrearEtiquetasCodigoBarras.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionNuevoProcesoCrearEtiquetasCodigoBarras.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionSinCerrarProcesoCrearEtiquetasCodigoBarras.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jCheckBoxPostAccionSinMensajeProcesoCrearEtiquetasCodigoBarras.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoCrearEtiquetasCodigoBarras(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoCrearEtiquetasCodigoBarras() throws Exception {
		try	{
			if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCrearEtiquetasCodigoBarras();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCrearEtiquetasCodigoBarras() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoCrearEtiquetasCodigoBarras() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			
			if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoCrearEtiquetasCodigoBarras.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasCodigoBarras();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoCrearEtiquetasCodigoBarras() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasCodigoBarras(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasCodigoBarras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getTiposSeleccionarProcesoCrearEtiquetasCodigoBarras(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasCodigoBarras()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_bodegaBusquedaProcesoCrearEtiquetasCodigoBarras=((Bodega)this.jComboBoxid_bodegaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_productoBusquedaProcesoCrearEtiquetasCodigoBarras=((Producto)this.jComboBoxid_productoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_lineaBusquedaProcesoCrearEtiquetasCodigoBarras=((Linea)this.jComboBoxid_lineaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarras=((Linea)this.jComboBoxid_linea_grupoBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarras=((Linea)this.jComboBoxid_linea_categoriaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()!=null){this.id_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarras=((Linea)this.jComboBoxid_linea_marcaBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar) throws Exception {				
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoCrearEtiquetasCodigoBarras();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras() throws Exception {
		this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasCodigoBarras() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarrasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesocrearetiquetascodigobarrass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setModel(new ProcesoCrearEtiquetasCodigoBarrasModel(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setModel(new ProcesoCrearEtiquetasCodigoBarrasModel(this.procesocrearetiquetascodigobarrass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoCrearEtiquetasCodigoBarras();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,procesocrearetiquetascodigobarrasConstantesFunciones.resaltarSeleccionarProcesoCrearEtiquetasCodigoBarras,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.SCLASSWEBTITULO,procesocrearetiquetascodigobarrasConstantesFunciones.resaltarSeleccionarProcesoCrearEtiquetasCodigoBarras,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostraridProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltaridProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activaridProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"idProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltaridProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activaridProcesoCrearEtiquetasCodigoBarras,this,true,"idProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarcodigoProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"codigoProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarcodigoProcesoCrearEtiquetasCodigoBarras,this,true,"codigoProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnombreProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnombreProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnombreProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"nombreProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnombreProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnombreProcesoCrearEtiquetasCodigoBarras,this,true,"nombreProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarprecioProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarprecioProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarprecioProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"precioProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarprecioProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarprecioProcesoCrearEtiquetasCodigoBarras,this,true,"precioProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnumeroProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnumeroProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnumeroProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"numeroProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnumeroProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnumeroProcesoCrearEtiquetasCodigoBarras,this,true,"numeroProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA));

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrartallaProcesoCrearEtiquetasCodigoBarras && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltartallaProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activartallaProcesoCrearEtiquetasCodigoBarras,iSizeTabla,this,true,"tallaProcesoCrearEtiquetasCodigoBarras","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltartallaProcesoCrearEtiquetasCodigoBarras,this.procesocrearetiquetascodigobarrasConstantesFunciones.activartallaProcesoCrearEtiquetasCodigoBarras,this,true,"tallaProcesoCrearEtiquetasCodigoBarras","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoCrearEtiquetasCodigoBarrasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoCrearEtiquetasCodigoBarras.moveColumn(this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoCrearEtiquetasCodigoBarras.moveColumn(this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoCrearEtiquetasCodigoBarras.moveColumn(this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesocrearetiquetascodigobarrass.size()-1;
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
		//this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoCrearEtiquetasCodigoBarras();
			
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
				
				//this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
					
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
				if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesocrearetiquetascodigobarras.getsType().equals("DUPLICADO")
				   || this.procesocrearetiquetascodigobarras.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
				
				} else {
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
					if(this.procesocrearetiquetascodigobarras.getId()>=0 && !this.procesocrearetiquetascodigobarras.getIsNew()) {						
						this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=false;
						
					} else {
						this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoCrearEtiquetasCodigoBarras(esRelaciones);						
				
				this.seleccionarProcesoCrearEtiquetasCodigoBarras(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesocrearetiquetascodigobarras.getId()<0) {
					this.isEsNuevoProcesoCrearEtiquetasCodigoBarras=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoCrearEtiquetasCodigoBarras(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoCrearEtiquetasCodigoBarras(evt,rowIndex);
				}	
				
				if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoCrearEtiquetasCodigoBarras: " + this.dDif); 
					}
				}								
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoCrearEtiquetasCodigoBarras(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {
					if(this.procesocrearetiquetascodigobarras.getId()>0) {
						this.procesocrearetiquetascodigobarras.setIsDeleted(true);
						
						this.procesocrearetiquetascodigobarrassEliminados.add(this.procesocrearetiquetascodigobarras);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().remove(this.procesocrearetiquetascodigobarras);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarrass.remove(this.procesocrearetiquetascodigobarras);				
					}
					
					
					((ProcesoCrearEtiquetasCodigoBarrasModel) this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoCrearEtiquetasCodigoBarras(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoCrearEtiquetasCodigoBarras) {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getnumero().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.gettalla());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesocrearetiquetascodigobarrasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesocrearetiquetascodigobarrasLocal=this.procesocrearetiquetascodigobarras;
			} else {
				procesocrearetiquetascodigobarrasLocal=this.procesocrearetiquetascodigobarrasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesocrearetiquetascodigobarrasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasLocal,true);
					
					if(procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesocrearetiquetascodigobarrasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesocrearetiquetascodigobarrasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarras,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.getText()==null || this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.getText()=="" || this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setText("0");
			}

			if(conColumnasBase) {procesocrearetiquetascodigobarras.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelIdProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetascodigobarras.setcodigo(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelcodigoProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetascodigobarras.setnombre(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnombreProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetascodigobarras.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelprecioProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetascodigobarras.setnumero(Double.parseDouble(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelnumeroProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesocrearetiquetascodigobarras.settalla(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabeltallaProcesoCrearEtiquetasCodigoBarras,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasBean,ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasOrigen,ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.getId()!=null && !procesocrearetiquetascodigobarrasOrigen.getId().equals(0L))) {procesocrearetiquetascodigobarras.setId(procesocrearetiquetascodigobarrasOrigen.getId());}}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.getcodigo()!=null && !procesocrearetiquetascodigobarrasOrigen.getcodigo().equals(""))) {procesocrearetiquetascodigobarras.setcodigo(procesocrearetiquetascodigobarrasOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.getnombre()!=null && !procesocrearetiquetascodigobarrasOrigen.getnombre().equals(""))) {procesocrearetiquetascodigobarras.setnombre(procesocrearetiquetascodigobarrasOrigen.getnombre());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.getprecio()!=null && !procesocrearetiquetascodigobarrasOrigen.getprecio().equals(0.0))) {procesocrearetiquetascodigobarras.setprecio(procesocrearetiquetascodigobarrasOrigen.getprecio());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.getnumero()!=null && !procesocrearetiquetascodigobarrasOrigen.getnumero().equals(0.0))) {procesocrearetiquetascodigobarras.setnumero(procesocrearetiquetascodigobarrasOrigen.getnumero());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasOrigen.gettalla()!=null && !procesocrearetiquetascodigobarrasOrigen.gettalla().equals(""))) {procesocrearetiquetascodigobarras.settalla(procesocrearetiquetascodigobarrasOrigen.gettalla());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.getnumero().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarras.gettalla());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarrasBean procesocrearetiquetascodigobarrasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.getnombre());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.getnumero().toString());
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setText(procesocrearetiquetascodigobarrasBean.gettalla());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarrasParameterReturnGeneral procesocrearetiquetascodigobarrasReturnGeneral,ProcesoCrearEtiquetasCodigoBarrasBean procesocrearetiquetascodigobarrasBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal=new ProcesoCrearEtiquetasCodigoBarras();
			
			procesocrearetiquetascodigobarrasLocal=procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.getId()!=null && !procesocrearetiquetascodigobarrasLocal.getId().equals(0L))) {procesocrearetiquetascodigobarrasBean.setId(procesocrearetiquetascodigobarrasLocal.getId());}}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.getcodigo()!=null && !procesocrearetiquetascodigobarrasLocal.getcodigo().equals(""))) {procesocrearetiquetascodigobarrasBean.setcodigo(procesocrearetiquetascodigobarrasLocal.getcodigo());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.getnombre()!=null && !procesocrearetiquetascodigobarrasLocal.getnombre().equals(""))) {procesocrearetiquetascodigobarrasBean.setnombre(procesocrearetiquetascodigobarrasLocal.getnombre());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.getprecio()!=null && !procesocrearetiquetascodigobarrasLocal.getprecio().equals(0.0))) {procesocrearetiquetascodigobarrasBean.setprecio(procesocrearetiquetascodigobarrasLocal.getprecio());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.getnumero()!=null && !procesocrearetiquetascodigobarrasLocal.getnumero().equals(0.0))) {procesocrearetiquetascodigobarrasBean.setnumero(procesocrearetiquetascodigobarrasLocal.getnumero());}
			if(conDefault || (!conDefault && procesocrearetiquetascodigobarrasLocal.gettalla()!=null && !procesocrearetiquetascodigobarrasLocal.gettalla().equals(""))) {procesocrearetiquetascodigobarrasBean.settalla(procesocrearetiquetascodigobarrasLocal.gettalla());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoCrearEtiquetasCodigoBarrasGenerico(Long idProcesoCrearEtiquetasCodigoBarrasSeleccionado,JComboBox jComboBoxProcesoCrearEtiquetasCodigoBarras,List<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassLocal)throws Exception {
		try {
			ProcesoCrearEtiquetasCodigoBarras  procesocrearetiquetascodigobarrasTemp=null;

			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassLocal) {
				if(procesocrearetiquetascodigobarrasAux.getId()!=null && procesocrearetiquetascodigobarrasAux.getId().equals(idProcesoCrearEtiquetasCodigoBarrasSeleccionado)) {
					procesocrearetiquetascodigobarrasTemp=procesocrearetiquetascodigobarrasAux;
					break;
				}
			}

			jComboBoxProcesoCrearEtiquetasCodigoBarras.setSelectedItem(procesocrearetiquetascodigobarrasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoCrearEtiquetasCodigoBarrasGenerico(JComboBox jComboBoxProcesoCrearEtiquetasCodigoBarras,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCrearEtiquetasCodigoBarras.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoCrearEtiquetasCodigoBarras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoCrearEtiquetasCodigoBarras.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoCrearEtiquetasCodigoBarras.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoCrearEtiquetasCodigoBarras.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetascodigobarras=(ProcesoCrearEtiquetasCodigoBarras) procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) procesocrearetiquetascodigobarrass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!procesocrearetiquetascodigobarras.getIsNew() && !procesocrearetiquetascodigobarras.getIsChanged() && !procesocrearetiquetascodigobarras.getIsDeleted()) {
				sDescripcion=procesocrearetiquetascodigobarras.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=procesocrearetiquetascodigobarras.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasRow=new ProcesoCrearEtiquetasCodigoBarras();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetascodigobarrasRow=(ProcesoCrearEtiquetasCodigoBarras) procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesocrearetiquetascodigobarrasRow=(ProcesoCrearEtiquetasCodigoBarras) procesocrearetiquetascodigobarrass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras && this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras && this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras));
			this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras && this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras));
			
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));			
			
			this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras);							
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));						
			this.jButtonDuplicarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras && this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras));						
			this.jButtonCopiarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras && this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonVerFormToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras && this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));
			this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));			
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras  && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras);				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras && this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras && this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras && this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));			
			//this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));
			this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));			
			//this.jMenuItemDetalleMostrarOcultarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras && this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras));			
			this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));									
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras && this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras));	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras && this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras));
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras);				
			}
			
			this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));						
			this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras=this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras=this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras=this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoCrearEtiquetasCodigoBarras=this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoCrearEtiquetasCodigoBarras(Boolean esInicializar) {
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
				//if(this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCrearEtiquetasCodigoBarras();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoCrearEtiquetasCodigoBarras(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasCodigoBarras() {
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras);			
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoDuplicarProcesoCrearEtiquetasCodigoBarras);			
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoCopiarProcesoCrearEtiquetasCodigoBarras);			
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoVerFormProcesoCrearEtiquetasCodigoBarras);			
		
		this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoOrdenProcesoCrearEtiquetasCodigoBarras);					
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoNuevoProcesoCrearEtiquetasCodigoBarras);			
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras);	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras);	
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras);
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras);						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCrearEtiquetasCodigoBarras() {
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras);	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoActualizarProcesoCrearEtiquetasCodigoBarras);	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isPermisoEliminarProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.setVisible(this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras);							
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.setVisible((this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras && this.isPermisoGuardarCambiosProcesoCrearEtiquetasCodigoBarras));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoCrearEtiquetasCodigoBarras() {
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoCrearEtiquetasCodigoBarras();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoCrearEtiquetasCodigoBarras() {
	}
	
	public void jTableDatosProcesoCrearEtiquetasCodigoBarrasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoCrearEtiquetasCodigoBarras(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesocrearetiquetascodigobarras.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.procesocrearetiquetascodigobarras.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.procesocrearetiquetascodigobarras.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesocrearetiquetascodigobarras.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesocrearetiquetascodigobarras.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.procesocrearetiquetascodigobarras.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.procesocrearetiquetascodigobarras.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.procesocrearetiquetascodigobarras.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProcesoCrearEtiquetasCodigoBarras(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoCrearEtiquetasCodigoBarras.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesocrearetiquetascodigobarrasLogic.getConnexion());

				if(this.procesocrearetiquetascodigobarras.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.procesocrearetiquetascodigobarras.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoCrearEtiquetasCodigoBarras=(TitledBorder)this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProcesoCrearEtiquetasCodigoBarras.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.procesocrearetiquetascodigobarras.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesocrearetiquetascodigobarras.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesocrearetiquetascodigobarras.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.procesocrearetiquetascodigobarras.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.procesocrearetiquetascodigobarras.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontallaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.getprocesocrearetiquetascodigobarras(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesocrearetiquetascodigobarras==null) {
						this.procesocrearetiquetascodigobarras = new ProcesoCrearEtiquetasCodigoBarras();
					}

					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);
				}

				if(this.procesocrearetiquetascodigobarras.gettalla()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where talla like '%"+this.procesocrearetiquetascodigobarras.gettalla()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassBusquedaProcesoCrearEtiquetasCodigoBarras();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdBodega();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdLinea();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaCategoria();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaGrupo();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdLineaMarca();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdProducto();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoCrearEtiquetasCodigoBarrasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);

			this.getProcesoCrearEtiquetasCodigoBarrassFK_IdSucursal();

			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);

			//if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesocrearetiquetascodigobarrasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoCrearEtiquetasCodigoBarras() {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.dispose();
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.dispose();
			this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras=null;
		}
		
		if(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras!=null) {
			this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.dispose();
			this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoCrearEtiquetasCodigoBarras();
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonDuplicarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCopiarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoCrearEtiquetasCodigoBarras")) {
				jButtonVerFormProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonDuplicarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonDuplicarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonMostrarOcultarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCopiarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonVerFormProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCopiarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoCrearEtiquetasCodigoBarras")) {
				jButtonVerFormProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoCrearEtiquetasCodigoBarras")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonMostrarOcultarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoCrearEtiquetasCodigoBarras")) {
				
				jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoCrearEtiquetasCodigoBarras")) {
				
				jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoCrearEtiquetasCodigoBarras")) {
				jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarrasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoCrearEtiquetasCodigoBarras")) {
				jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarrasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras")) {
				jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarrasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoCrearEtiquetasCodigoBarras")) {
				
				jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarrasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoCrearEtiquetasCodigoBarras")) {
				jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarrasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonidProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras")) {
				this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			}
			
			;
			
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoCrearEtiquetasCodigoBarras();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesocrearetiquetascodigobarrasLocal=this.procesocrearetiquetascodigobarras;
			} else {
				procesocrearetiquetascodigobarrasLocal=this.procesocrearetiquetascodigobarrasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
							
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
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
			
			


			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
								
						
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
								
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
							
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
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
			
			


			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
								
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoCrearEtiquetasCodigoBarras")) {
					jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarrasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoCrearEtiquetasCodigoBarras")) {
					jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarrasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoCrearEtiquetasCodigoBarras")) {
					
				}
				
				


				
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
												
				
				


				
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
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
			
			


			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesocrearetiquetascodigobarras);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesocrearetiquetascodigobarras);
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
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
				
				


				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoCrearEtiquetasCodigoBarras.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoCrearEtiquetasCodigoBarras.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoCrearEtiquetasCodigoBarrasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesocrearetiquetascodigobarrasAnterior =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoCrearEtiquetasCodigoBarras")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoCrearEtiquetasCodigoBarrasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesocrearetiquetascodigobarras =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesocrearetiquetascodigobarras);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasCodigoBarras")) {
				
				}
				
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoCrearEtiquetasCodigoBarras")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasCodigoBarras")) {
			
			}
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoCrearEtiquetasCodigoBarras();
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonDuplicarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCopiarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoCrearEtiquetasCodigoBarras")) {
				jButtonVerFormProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoCrearEtiquetasCodigoBarras")) {
				jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras")) {
				jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoCrearEtiquetasCodigoBarras")) {
				jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoCrearEtiquetasCodigoBarras")) {
				jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoCrearEtiquetasCodigoBarras")) {
				jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonidProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tallaProcesoCrearEtiquetasCodigoBarrasBusqueda")) {
				this.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusquedaActionPerformed(evt);
			}
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoCrearEtiquetasCodigoBarras();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoCrearEtiquetasCodigoBarras")) {
				closingInternalFrameProcesoCrearEtiquetasCodigoBarras();
				
			} else if(sTipo.equals("jButtonCancelarProcesoCrearEtiquetasCodigoBarras")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(null);
			}
			
			ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesocrearetiquetascodigobarras,new Object(),this.procesocrearetiquetascodigobarrasParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoCrearEtiquetasCodigoBarras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoCrearEtiquetasCodigoBarras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoCrearEtiquetasCodigoBarras(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {
			if(!esControlTabla) {
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);			
				}
				
				if(this.procesocrearetiquetascodigobarrasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral,this.procesocrearetiquetascodigobarrasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesocrearetiquetascodigobarrasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCrearEtiquetasCodigoBarras(classes,this.procesocrearetiquetascodigobarrasReturnGeneral,this.procesocrearetiquetascodigobarrasBean,false);
					}
						
					if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras());	
					}
						
					if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras(),classes);//this.procesocrearetiquetascodigobarrasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,classes);//this.procesocrearetiquetascodigobarrasBean);									
				}
			
				if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoCrearEtiquetasCodigoBarras(this.procesocrearetiquetascodigobarras);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesocrearetiquetascodigobarrasAnterior!=null) {
						this.procesocrearetiquetascodigobarras=this.procesocrearetiquetascodigobarrasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesocrearetiquetascodigobarrasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras(),procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarras(),this.procesocrearetiquetascodigobarrass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoCrearEtiquetasCodigoBarras.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoCrearEtiquetasCodigoBarras();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoCrearEtiquetasCodigoBarras() throws Exception {
		
		ProcesoCrearEtiquetasCodigoBarrasModel procesocrearetiquetascodigobarrasModel=(ProcesoCrearEtiquetasCodigoBarrasModel)this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesocrearetiquetascodigobarrasModel.procesocrearetiquetascodigobarrass=this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesocrearetiquetascodigobarrasModel.procesocrearetiquetascodigobarrass=this.procesocrearetiquetascodigobarrass;
		}
		
		
		((ProcesoCrearEtiquetasCodigoBarrasModel) this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoCrearEtiquetasCodigoBarras() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesocrearetiquetascodigobarrasAnterior(),this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesocrearetiquetascodigobarrasAnterior(),this.procesocrearetiquetascodigobarrass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoCrearEtiquetasCodigoBarras();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
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
										
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocrearetiquetascodigobarras,new Object(),generalEntityParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getClassesRelationshipsOfProcesoCrearEtiquetasCodigoBarras(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoCrearEtiquetasCodigoBarras(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoCrearEtiquetasCodigoBarras(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesocrearetiquetascodigobarras,new Object(),generalEntityParameterGeneral,this.procesocrearetiquetascodigobarrasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarrasBean procesocrearetiquetascodigobarrasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoCrearEtiquetasCodigoBarras(ArrayList<Classe> classes,ProcesoCrearEtiquetasCodigoBarrasReturnGeneral procesocrearetiquetascodigobarrasReturnGeneral,ProcesoCrearEtiquetasCodigoBarrasBean procesocrearetiquetascodigobarrasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras = new ProcesoCrearEtiquetasCodigoBarrasDetalleFormJInternalFrame(jDesktopPane,this.procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones(),this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setVisible(false);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.procesocrearetiquetascodigobarrasLogic=this.procesocrearetiquetascodigobarrasLogic;
		
		this.cargarCombosFrameForeignKeyProcesoCrearEtiquetasCodigoBarras("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoCrearEtiquetasCodigoBarras();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoCrearEtiquetasCodigoBarras();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoCrearEtiquetasCodigoBarras("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoCrearEtiquetasCodigoBarras();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ModificarProcesoCrearEtiquetasCodigoBarras"));

		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCrearEtiquetasCodigoBarras"));
					
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCrearEtiquetasCodigoBarras"));
						
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"EliminarProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCrearEtiquetasCodigoBarras"));
								
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CancelarProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCrearEtiquetasCodigoBarras"));
					
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras"));
		
		
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonidProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"tallaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCrearEtiquetasCodigoBarras"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoCrearEtiquetasCodigoBarras"));
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"NuevoProcesoCrearEtiquetasCodigoBarras"));
		
		this.jButtonDuplicarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"DuplicarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jButtonCopiarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"CopiarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jButtonVerFormProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"VerFormProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jButtonDuplicarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemDuplicarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ModificarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoCrearEtiquetasCodigoBarras"));
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoCrearEtiquetasCodigoBarras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"ActualizarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoCrearEtiquetasCodigoBarras"));
				
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoCrearEtiquetasCodigoBarras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"EliminarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoCrearEtiquetasCodigoBarras"));
						
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoCrearEtiquetasCodigoBarras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CancelarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoCrearEtiquetasCodigoBarras"));
			
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoCrearEtiquetasCodigoBarras"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CerrarProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoCrearEtiquetasCodigoBarras"));
			
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras"));
		}
		
		this.jButtonCopiarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jButtonVerFormToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemCopiarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoCrearEtiquetasCodigoBarras"));		
		
		this.jMenuItemVerFormProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoCrearEtiquetasCodigoBarras"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoCrearEtiquetasCodigoBarras"));
					
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"AnterioresProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoCrearEtiquetasCodigoBarras"));
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoCrearEtiquetasCodigoBarras"));		
		
		
		this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"SiguientesProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemDetalleMostarOcultarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoCrearEtiquetasCodigoBarras"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoCrearEtiquetasCodigoBarras"));

		this.jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarras.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoCrearEtiquetasCodigoBarras"));
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoCrearEtiquetasCodigoBarras"));
			
		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoCrearEtiquetasCodigoBarras"));
					
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoCrearEtiquetasCodigoBarras"));
			
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoCrearEtiquetasCodigoBarras"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonidProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"tallaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));				
			//this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoCrearEtiquetasCodigoBarras"));
				this.jInternalFrameImportacionProcesoCrearEtiquetasCodigoBarras.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoCrearEtiquetasCodigoBarras"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoCrearEtiquetasCodigoBarras"));
			
			this.jButtonAbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoCrearEtiquetasCodigoBarras"));			
			
			if(this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jInternalFrameOrderByProcesoCrearEtiquetasCodigoBarras.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoCrearEtiquetasCodigoBarras"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTabbedPaneRelacionesProcesoCrearEtiquetasCodigoBarras.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoCrearEtiquetasCodigoBarras"));
		
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
            		closingInternalFrameProcesoCrearEtiquetasCodigoBarras();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame jInternalFrameParent=(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoCrearEtiquetasCodigoBarrasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoCrearEtiquetasCodigoBarras.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoCrearEtiquetasCodigoBarras";
		inputMap = this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarras.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarras.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarrasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarrasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarrasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarrasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonidProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_productoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonid_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtoncodigoProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnombreProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonprecioProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtonnumeroProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"numeroProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jButtontallaProcesoCrearEtiquetasCodigoBarrasBusqueda.addActionListener(new ButtonActionListener(this,"tallaProcesoCrearEtiquetasCodigoBarrasBusqueda"));
		
		
		this.jButtonBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras.addActionListener(new ButtonActionListener(this,"BusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarras.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoCrearEtiquetasCodigoBarrasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarrasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoCrearEtiquetasCodigoBarras(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
					procesocrearetiquetascodigobarrasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrass) {
					procesocrearetiquetascodigobarrasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoCrearEtiquetasCodigoBarrasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
						procesocrearetiquetascodigobarrasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrass) {
						procesocrearetiquetascodigobarrasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoCrearEtiquetasCodigoBarrasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getSelectedRows();
			
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasLocal=new ProcesoCrearEtiquetasCodigoBarras();
			
			//this.seleccionarTodosProcesoCrearEtiquetasCodigoBarras(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesocrearetiquetascodigobarrasLocal =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass().toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesocrearetiquetascodigobarrasLocal =(ProcesoCrearEtiquetasCodigoBarras) this.procesocrearetiquetascodigobarrass.toArray()[this.jTableDatosProcesoCrearEtiquetasCodigoBarras.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesocrearetiquetascodigobarrasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
						procesocrearetiquetascodigobarrasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrass) {
						procesocrearetiquetascodigobarrasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoCrearEtiquetasCodigoBarras.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoCrearEtiquetasCodigoBarras,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoCrearEtiquetasCodigoBarrasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoCrearEtiquetasCodigoBarrasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarrasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoCrearEtiquetasCodigoBarras.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
				
						if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setnumero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.settalla(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrass) {
					
						if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.setnumero(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA)) {
							existe=true;
							procesocrearetiquetascodigobarrasAux.settalla(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarrasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoCrearEtiquetasCodigoBarras(conSplash);
				
					this.generarReporteProcesoCrearEtiquetasCodigoBarrassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrassSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCrearEtiquetasCodigoBarrassSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCrearEtiquetasCodigoBarras();
				
				this.exportarProcesoCrearEtiquetasCodigoBarrassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoCrearEtiquetasCodigoBarrass();
				//this.importarProcesoCrearEtiquetasCodigoBarrass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoCrearEtiquetasCodigoBarras();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoCrearEtiquetasCodigoBarrassSeleccionados();
				//this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoCrearEtiquetasCodigoBarras();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoCrearEtiquetasCodigoBarras)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoCrearEtiquetasCodigoBarras(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoCrearEtiquetasCodigoBarras) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoCrearEtiquetasCodigoBarras(conSplash);
					
						//this.actualizarParametrosGeneralProcesoCrearEtiquetasCodigoBarras();
						
						this.generarReporteProcesoAccionProcesoCrearEtiquetasCodigoBarrassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Crear Etiquetas Codigo BarrasES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoCrearEtiquetasCodigoBarras();
				
						this.actualizarParametrosGeneralProcesoCrearEtiquetasCodigoBarras();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesocrearetiquetascodigobarrasReturnGeneral=procesocrearetiquetascodigobarrasLogic.procesarAccionProcesoCrearEtiquetasCodigoBarrassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass(),this.procesocrearetiquetascodigobarrasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoCrearEtiquetasCodigoBarrasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoCrearEtiquetasCodigoBarras();
					
					ProcesoCrearEtiquetasCodigoBarrasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoCrearEtiquetasCodigoBarrasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxTiposAccionesFormularioProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoCrearEtiquetasCodigoBarras(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarrasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoCrearEtiquetasCodigoBarras();
			
			if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
			ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras=new ProcesoCrearEtiquetasCodigoBarras();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoCrearEtiquetasCodigoBarras.getSelectedItem();
			
			
			
			
			procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesocrearetiquetascodigobarrassSeleccionados.size()==1) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
					procesocrearetiquetascodigobarras=procesocrearetiquetascodigobarrasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoCrearEtiquetasCodigoBarras();
			
      		//this.finishProcessProcesoCrearEtiquetasCodigoBarras(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoCrearEtiquetasCodigoBarrasReturnGeneral() throws Exception {
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesocrearetiquetascodigobarrasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesocrearetiquetascodigobarrasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesocrearetiquetascodigobarrasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
		}
		
		if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRetornoLista() || this.procesocrearetiquetascodigobarrasReturnGeneral.getConRetornoObjeto()) {
			if(this.procesocrearetiquetascodigobarrasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesocrearetiquetascodigobarrasLogic.setProcesoCrearEtiquetasCodigoBarrass(this.procesocrearetiquetascodigobarrasReturnGeneral.getProcesoCrearEtiquetasCodigoBarrass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoCrearEtiquetasCodigoBarras(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoCrearEtiquetasCodigoBarras() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoCrearEtiquetasCodigoBarras> getProcesoCrearEtiquetasCodigoBarrassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoCrearEtiquetasCodigoBarras) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass()) {
					if(procesocrearetiquetascodigobarrasAux.getIsSelected()) {
						procesocrearetiquetascodigobarrassSeleccionados.add(procesocrearetiquetascodigobarrasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:this.procesocrearetiquetascodigobarrass) {
					if(procesocrearetiquetascodigobarrasAux.getIsSelected()) {
						procesocrearetiquetascodigobarrassSeleccionados.add(procesocrearetiquetascodigobarrasAux);				
					}
				}
			}
			
			if(procesocrearetiquetascodigobarrassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesocrearetiquetascodigobarrassSeleccionados.addAll(this.procesocrearetiquetascodigobarrasLogic.getProcesoCrearEtiquetasCodigoBarrass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesocrearetiquetascodigobarrassSeleccionados.addAll(this.procesocrearetiquetascodigobarrass);				
					}
				}
			}
		} else {
			procesocrearetiquetascodigobarrassSeleccionados.add(this.procesocrearetiquetascodigobarras);
		}
		
		return procesocrearetiquetascodigobarrassSeleccionados;
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
	
	public void generarReporteProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoCrearEtiquetasCodigoBarrassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCrearEtiquetasCodigoBarrassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoCrearEtiquetasCodigoBarrassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras();
		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoCrearEtiquetasCodigoBarras();
		
		
		//this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados ,procesocrearetiquetascodigobarrasImplementable,procesocrearetiquetascodigobarrasImplementableHome);
	}
	
	public void mostrarImportacionProcesoCrearEtiquetasCodigoBarrass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoCrearEtiquetasCodigoBarras();
		
		this.abrirFrameImportacionProcesoCrearEtiquetasCodigoBarras();		
		
			
		//this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados ,procesocrearetiquetascodigobarrasImplementable,procesocrearetiquetascodigobarrasImplementableHome);
	}
	
	public void importarProcesoCrearEtiquetasCodigoBarrass() throws Exception {		
	
	}
	
	public void exportarProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoCrearEtiquetasCodigoBarrassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoCrearEtiquetasCodigoBarrassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoCrearEtiquetasCodigoBarrassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoCrearEtiquetasCodigoBarras(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesocrearetiquetascodigobarrasAux.setsDetalleGeneralEntityReporte(procesocrearetiquetascodigobarrasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoCrearEtiquetasCodigoBarras(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesocrearetiquetascodigobarras.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.getnumero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesocrearetiquetascodigobarras.gettalla();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoCrearEtiquetasCodigoBarrass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoCrearEtiquetasCodigoBarras(row);				
				iRow++;
			}				
			
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoCrearEtiquetasCodigoBarrassSeleccionados() throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();		
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesocrearetiquetascodigobarras.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesocrearetiquetascodigobarrass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesocrearetiquetascodigobarras");
			//elementRoot.appendChild(element);
		
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
				element = document.createElement("procesocrearetiquetascodigobarras");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Crear Etiquetas Codigo Barras",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoCrearEtiquetasCodigoBarras(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(procesocrearetiquetascodigobarras.gettalla());				
	}
	
	public void setFilaDatosExportarXmlProcesoCrearEtiquetasCodigoBarras(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarras,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementcodigo = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementprecio = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementnumero = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.getnumero().toString().trim()));
		element.appendChild(elementnumero);

		Element elementtalla = document.createElement(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.TALLA);
		elementtalla.appendChild(document.createTextNode(procesocrearetiquetascodigobarras.gettalla().trim()));
		element.appendChild(elementtalla);
	}
	
	public void generarReporteGroupGenericoProcesoCrearEtiquetasCodigoBarrassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados=new ArrayList<ProcesoCrearEtiquetasCodigoBarras>();
		
		procesocrearetiquetascodigobarrassSeleccionados=this.getProcesoCrearEtiquetasCodigoBarrassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoCrearEtiquetasCodigoBarras(procesocrearetiquetascodigobarrassSeleccionados);
		
		this.generarReporteProcesoCrearEtiquetasCodigoBarrass("Todos",procesocrearetiquetascodigobarrassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoCrearEtiquetasCodigoBarras(ArrayList<ProcesoCrearEtiquetasCodigoBarras> procesocrearetiquetascodigobarrassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoCrearEtiquetasCodigoBarras procesocrearetiquetascodigobarrasAux:procesocrearetiquetascodigobarrassSeleccionados) {
				procesocrearetiquetascodigobarrasAux.setsDetalleGeneralEntityReporte(procesocrearetiquetascodigobarrasAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.LABEL_TALLA)) {
					existe=true;
					procesocrearetiquetascodigobarrasAux.setsDescripcionGeneralEntityReporte1(procesocrearetiquetascodigobarrasAux.gettalla());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoCrearEtiquetasCodigoBarrasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoCrearEtiquetasCodigoBarras(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoCrearEtiquetasCodigoBarrasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=true;
		} else {
			this.actualizarEstadoPanelsProcesoCrearEtiquetasCodigoBarras(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoCrearEtiquetasCodigoBarras=false;
			//this.isVisibilidadCeldaVerFormProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaDuplicarProcesoCrearEtiquetasCodigoBarras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			if(!procesocrearetiquetascodigobarrasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;												
			}
			
			this.jButtonCerrarProcesoCrearEtiquetasCodigoBarras.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
		}
		
		if(!this.permiteMantenimiento(this.procesocrearetiquetascodigobarras)) {
			this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
			this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoCrearEtiquetasCodigoBarras=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoCrearEtiquetasCodigoBarras=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoCrearEtiquetasCodigoBarras=false;
		//this.isVisibilidadCeldaModificarProcesoCrearEtiquetasCodigoBarras=true;
		this.isVisibilidadCeldaActualizarProcesoCrearEtiquetasCodigoBarras=false;
		this.isVisibilidadCeldaEliminarProcesoCrearEtiquetasCodigoBarras=false;
		//this.isVisibilidadCeldaCancelarProcesoCrearEtiquetasCodigoBarras=true;			
		this.isVisibilidadCeldaGuardarProcesoCrearEtiquetasCodigoBarras=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoCrearEtiquetasCodigoBarras() {
	}
	
	public void actualizarEstadoPanelsProcesoCrearEtiquetasCodigoBarras(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosEdicionProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jScrollPanelDatosProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelPaginacionProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
					this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesocrearetiquetascodigobarrasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras!=null) {
				this.jPanelParametrosReportesProcesoCrearEtiquetasCodigoBarras.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaBodega;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaProducto;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaLinea;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProcesoCrearEtiquetasCodigoBarras) {this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);}
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
			
			this.inicializarActualizarBindingTablaProcesoCrearEtiquetasCodigoBarras(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoCrearEtiquetasCodigoBarras() {
		this.updateBorderResaltarBusquedasFormularioProcesoCrearEtiquetasCodigoBarras();
		this.updateVisibilidadBusquedasFormularioProcesoCrearEtiquetasCodigoBarras();
		this.updateHabilitarBusquedasFormularioProcesoCrearEtiquetasCodigoBarras();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoCrearEtiquetasCodigoBarras() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponents().length>0) {
	

		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras!=null) {
			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponent(index);
				jPanel.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoCrearEtiquetasCodigoBarras() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			if(!this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras && index>-1) {
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoCrearEtiquetasCodigoBarras() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
				this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setEnabledAt(index,this.procesocrearetiquetascodigobarrasConstantesFunciones.activarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoCrearEtiquetasCodigoBarras(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoCrearEtiquetasCodigoBarras")) {
			index= this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.indexOfComponent(this.jPanelBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);

			this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoCrearEtiquetasCodigoBarras.getComponent(index);

			this.procesocrearetiquetascodigobarrasConstantesFunciones.setResaltarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras(resaltar);

			jPanel.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarBusquedaProcesoCrearEtiquetasCodigoBarrasProcesoCrearEtiquetasCodigoBarras);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoCrearEtiquetasCodigoBarras.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoCrearEtiquetasCodigoBarras() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras();
		this.updateVisibilidadResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras();
		this.updateHabilitarResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltaridProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltaridProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_bodegaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_bodegaProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_productoProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_productoProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_empresaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_empresaProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_sucursalProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_sucursalProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_lineaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_lineaProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_grupoProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_grupoProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_marcaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarid_linea_marcaProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarcodigoProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnombreProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnombreProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarprecioProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarprecioProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnumeroProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltarnumeroProcesoCrearEtiquetasCodigoBarras);}
		if(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltartallaProcesoCrearEtiquetasCodigoBarras!=null && this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setBorder(this.procesocrearetiquetascodigobarrasConstantesFunciones.resaltartallaProcesoCrearEtiquetasCodigoBarras);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
	
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostraridProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelidProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostraridProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_bodegaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_bodegaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_bodegaProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_productoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_productoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_productoProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_empresaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_empresaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_empresaProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_sucursalProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_sucursalProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_sucursalProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_lineaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_lineaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_lineaProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_grupoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_grupoProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_marcaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarid_linea_marcaProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelcodigoProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarcodigoProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnombreProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelnombreProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnombreProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarprecioProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelprecioProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarprecioProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnumeroProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPanelnumeroProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrarnumeroProcesoCrearEtiquetasCodigoBarras);
		//this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrartallaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jPaneltallaProcesoCrearEtiquetasCodigoBarras.setVisible(this.procesocrearetiquetascodigobarrasConstantesFunciones.mostrartallaProcesoCrearEtiquetasCodigoBarras);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoCrearEtiquetasCodigoBarras() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras!=null) {
	
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jLabelidProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activaridProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_bodegaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_bodegaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_productoProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_productoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_empresaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_empresaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_sucursalProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_sucursalProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_lineaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_lineaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_grupoProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_grupoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_categoriaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_categoriaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jComboBoxid_linea_marcaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarid_linea_marcaProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldcodigoProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarcodigoProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreanombreProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnombreProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldprecioProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarprecioProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextFieldnumeroProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activarnumeroProcesoCrearEtiquetasCodigoBarras);
		this.jInternalFrameDetalleFormProcesoCrearEtiquetasCodigoBarras.jTextAreatallaProcesoCrearEtiquetasCodigoBarras.setEnabled(this.procesocrearetiquetascodigobarrasConstantesFunciones.activartallaProcesoCrearEtiquetasCodigoBarras);
		}
	}
	
		
}