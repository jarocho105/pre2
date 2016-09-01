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

//import com.bydan.erp.inventario.util.ConteosFisicosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ConteosFisicosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ConteosFisicosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ConteosFisicosBean;
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
public class ConteosFisicosBeanSwingJInternalFrame extends ConteosFisicosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConteosFisicosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConteosFisicos> conteosfisicosValidator = new ClassValidator<ConteosFisicos>(ConteosFisicos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConteosFisicos conteosfisicos;	
	public ConteosFisicos conteosfisicosAux;
	public ConteosFisicos conteosfisicosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConteosFisicos conteosfisicosTotales;
	public Long idConteosFisicosActual;
	public Long iIdNuevoConteosFisicos=0L;
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
	
	public Boolean isPermisoTodoConteosFisicos;
	public Boolean isPermisoNuevoConteosFisicos;
	public Boolean isPermisoActualizarConteosFisicos;
	public Boolean isPermisoActualizarOriginalConteosFisicos;
	public Boolean isPermisoEliminarConteosFisicos;
	public Boolean isPermisoGuardarCambiosConteosFisicos;
	public Boolean isPermisoConsultaConteosFisicos;
	public Boolean isPermisoBusquedaConteosFisicos;
	public Boolean isPermisoReporteConteosFisicos;
	public Boolean isPermisoPaginacionMedioConteosFisicos;
	public Boolean isPermisoPaginacionAltoConteosFisicos;
	public Boolean isPermisoPaginacionTodoConteosFisicos;
	public Boolean isPermisoCopiarConteosFisicos;
	public Boolean isPermisoVerFormConteosFisicos;
	public Boolean isPermisoDuplicarConteosFisicos;
	public Boolean isPermisoOrdenConteosFisicos;
	
	
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
	
	public ConteosFisicosParameterReturnGeneral conteosfisicosReturnGeneral;
	public ConteosFisicosParameterReturnGeneral conteosfisicosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConteosFisicos=false;
	public Boolean esParaAccionDesdeFormularioConteosFisicos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConteosFisicosSessionBeanAdditional conteosfisicosSessionBeanAdditional=null;
	
	public ConteosFisicosSessionBeanAdditional getConteosFisicosSessionBeanAdditional() {
		return this.conteosfisicosSessionBeanAdditional;
	}
	
	public void setConteosFisicosSessionBeanAdditional(ConteosFisicosSessionBeanAdditional conteosfisicosSessionBeanAdditional) {
		try {
			this.conteosfisicosSessionBeanAdditional=conteosfisicosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConteosFisicosBeanSwingJInternalFrameAdditional conteosfisicosBeanSwingJInternalFrameAdditional=null;
	//public class ConteosFisicosBeanSwingJInternalFrame
	
	public ConteosFisicosBeanSwingJInternalFrameAdditional getConteosFisicosBeanSwingJInternalFrameAdditional() {
		return this.conteosfisicosBeanSwingJInternalFrameAdditional;
	}
	
	public void setConteosFisicosBeanSwingJInternalFrameAdditional(ConteosFisicosBeanSwingJInternalFrameAdditional conteosfisicosBeanSwingJInternalFrameAdditional) {
		try {
			this.conteosfisicosBeanSwingJInternalFrameAdditional=conteosfisicosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConteosFisicosLogic conteosfisicosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConteosFisicos conteosfisicosBean;
	public ConteosFisicosConstantesFunciones conteosfisicosConstantesFunciones;
	//public ConteosFisicosParameterReturnGeneral conteosfisicosReturnGeneral;
	
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
	
	
	//public List<ConteosFisicos> conteosfisicoss;	
	//public List<ConteosFisicos> conteosfisicossEliminados;
	//public List<ConteosFisicos> conteosfisicossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConteosFisicos=false;
	public Boolean isVisibilidadCeldaDuplicarConteosFisicos=true;
	public Boolean isVisibilidadCeldaCopiarConteosFisicos=true;
	public Boolean isVisibilidadCeldaVerFormConteosFisicos=true;
	public Boolean isVisibilidadCeldaOrdenConteosFisicos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
	public Boolean isVisibilidadCeldaModificarConteosFisicos=false;
	public Boolean isVisibilidadCeldaActualizarConteosFisicos=false;
	public Boolean isVisibilidadCeldaEliminarConteosFisicos=false;
	public Boolean isVisibilidadCeldaCancelarConteosFisicos=false;
	public Boolean isVisibilidadCeldaGuardarConteosFisicos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConteosFisicos=false;	
	
	
	public Boolean isVisibilidadBusquedaConteosFisicos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoConteosFisicos() {
		return this.iIdNuevoConteosFisicos;
	}

	public void setiIdNuevoConteosFisicos(Long iIdNuevoConteosFisicos) {
		this.iIdNuevoConteosFisicos = iIdNuevoConteosFisicos;
	}
	
	public Long getidConteosFisicosActual() {
		return this.idConteosFisicosActual;
	}

	public void setidConteosFisicosActual(Long idConteosFisicosActual) {
		this.idConteosFisicosActual = idConteosFisicosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConteosFisicos getconteosfisicos() {
		return this.conteosfisicos;
	}

	public void setconteosfisicos(ConteosFisicos conteosfisicos) {
		this.conteosfisicos = conteosfisicos;
	}
	
	public ConteosFisicos getconteosfisicosAux() {
		return this.conteosfisicosAux;
	}

	public void setconteosfisicosAux(ConteosFisicos conteosfisicosAux) {
		this.conteosfisicosAux = conteosfisicosAux;
	}				
	
	public ConteosFisicos getconteosfisicosAnterior() {
		return this.conteosfisicosAnterior;
	}

	public void setconteosfisicosAnterior(ConteosFisicos conteosfisicosAnterior) {
		this.conteosfisicosAnterior = conteosfisicosAnterior;
	}	
	
	public ConteosFisicos getconteosfisicosTotales() {
		return this.conteosfisicosTotales;
	}

	public void setconteosfisicosTotales(ConteosFisicos conteosfisicosTotales) {
		this.conteosfisicosTotales = conteosfisicosTotales;
	}	
	
	public ConteosFisicos getconteosfisicosBean() {
		return this.conteosfisicosBean;
	}

	public void setconteosfisicosBean(ConteosFisicos conteosfisicosBean) {
		this.conteosfisicosBean = conteosfisicosBean;
	}	
	
	public ConteosFisicosParameterReturnGeneral getconteosfisicosReturnGeneral() {
		return this.conteosfisicosReturnGeneral;
	}

	public void setconteosfisicosReturnGeneral(ConteosFisicosParameterReturnGeneral conteosfisicosReturnGeneral) {
		this.conteosfisicosReturnGeneral = conteosfisicosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaConteosFisicos=-1L;

	public Long getid_bodegaBusquedaConteosFisicos() {
		return this.id_bodegaBusquedaConteosFisicos;
	}

	public void setid_bodegaBusquedaConteosFisicos(Long id_bodegaBusquedaConteosFisicos) {
		this.id_bodegaBusquedaConteosFisicos = id_bodegaBusquedaConteosFisicos;
	}

;
	public Long id_productoBusquedaConteosFisicos=-1L;

	public Long getid_productoBusquedaConteosFisicos() {
		return this.id_productoBusquedaConteosFisicos;
	}

	public void setid_productoBusquedaConteosFisicos(Long id_productoBusquedaConteosFisicos) {
		this.id_productoBusquedaConteosFisicos = id_productoBusquedaConteosFisicos;
	}

;
	public Long id_lineaBusquedaConteosFisicos=-1L;

	public Long getid_lineaBusquedaConteosFisicos() {
		return this.id_lineaBusquedaConteosFisicos;
	}

	public void setid_lineaBusquedaConteosFisicos(Long id_lineaBusquedaConteosFisicos) {
		this.id_lineaBusquedaConteosFisicos = id_lineaBusquedaConteosFisicos;
	}

;
	public Long id_linea_grupoBusquedaConteosFisicos=-1L;

	public Long getid_linea_grupoBusquedaConteosFisicos() {
		return this.id_linea_grupoBusquedaConteosFisicos;
	}

	public void setid_linea_grupoBusquedaConteosFisicos(Long id_linea_grupoBusquedaConteosFisicos) {
		this.id_linea_grupoBusquedaConteosFisicos = id_linea_grupoBusquedaConteosFisicos;
	}

;
	public Long id_linea_categoriaBusquedaConteosFisicos=-1L;

	public Long getid_linea_categoriaBusquedaConteosFisicos() {
		return this.id_linea_categoriaBusquedaConteosFisicos;
	}

	public void setid_linea_categoriaBusquedaConteosFisicos(Long id_linea_categoriaBusquedaConteosFisicos) {
		this.id_linea_categoriaBusquedaConteosFisicos = id_linea_categoriaBusquedaConteosFisicos;
	}

;
	public Long id_linea_marcaBusquedaConteosFisicos=-1L;

	public Long getid_linea_marcaBusquedaConteosFisicos() {
		return this.id_linea_marcaBusquedaConteosFisicos;
	}

	public void setid_linea_marcaBusquedaConteosFisicos(Long id_linea_marcaBusquedaConteosFisicos) {
		this.id_linea_marcaBusquedaConteosFisicos = id_linea_marcaBusquedaConteosFisicos;
	}

;
	public Date fecha_ultima_venta_hastaBusquedaConteosFisicos=new Date();

	public Date getfecha_ultima_venta_hastaBusquedaConteosFisicos() {
		return this.fecha_ultima_venta_hastaBusquedaConteosFisicos;
	}

	public void setfecha_ultima_venta_hastaBusquedaConteosFisicos(Date fecha_ultima_venta_hastaBusquedaConteosFisicos) {
		this.fecha_ultima_venta_hastaBusquedaConteosFisicos = fecha_ultima_venta_hastaBusquedaConteosFisicos;
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
	
	
	public ConteosFisicosLogic getConteosFisicosLogic()	{		
		return conteosfisicosLogic;
	}

	public void setConteosFisicosLogic(ConteosFisicosLogic conteosfisicosLogic) {
		this.conteosfisicosLogic = conteosfisicosLogic;
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
	
	public Boolean getIsEsNuevoConteosFisicos() {
		return isEsNuevoConteosFisicos;
	}

	public void setIsEsNuevoConteosFisicos(Boolean isEsNuevoConteosFisicos) {
		this.isEsNuevoConteosFisicos = isEsNuevoConteosFisicos;
	}

	public Boolean getEsParaAccionDesdeFormularioConteosFisicos() {
		return esParaAccionDesdeFormularioConteosFisicos;
	}
	
	public void setEsParaAccionDesdeFormularioConteosFisicos(Boolean esParaAccionDesdeFormularioConteosFisicos) {
		this.esParaAccionDesdeFormularioConteosFisicos = esParaAccionDesdeFormularioConteosFisicos;
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidBodegaActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidProductoActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidEmpresaActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidSucursalActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidLineaActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidLineaGrupoActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidLineaCategoriaActual());
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

			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(conteosfisicosSessionBean.getlidLineaMarcaActual());
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaConteosFisicos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaConteosFisicosGenerico)throws Exception
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
				jComboBoxid_bodegaConteosFisicosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaConteosFisicosGenerico!=null && jComboBoxid_bodegaConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoConteosFisicos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoConteosFisicosGenerico)throws Exception
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
				jComboBoxid_productoConteosFisicosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoConteosFisicosGenerico!=null && jComboBoxid_productoConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_productoConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConteosFisicos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConteosFisicosGenerico)throws Exception
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
				jComboBoxid_empresaConteosFisicosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConteosFisicosGenerico!=null && jComboBoxid_empresaConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_empresaConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalConteosFisicos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalConteosFisicosGenerico)throws Exception
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
				jComboBoxid_sucursalConteosFisicosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalConteosFisicosGenerico!=null && jComboBoxid_sucursalConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaConteosFisicos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaConteosFisicosGenerico)throws Exception
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
				jComboBoxid_lineaConteosFisicosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaConteosFisicosGenerico!=null && jComboBoxid_lineaConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_lineaConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoConteosFisicos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoConteosFisicosGenerico)throws Exception
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
				jComboBoxid_linea_grupoConteosFisicosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoConteosFisicosGenerico!=null && jComboBoxid_linea_grupoConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaConteosFisicos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaConteosFisicosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaConteosFisicosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaConteosFisicosGenerico!=null && jComboBoxid_linea_categoriaConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaConteosFisicosGenerico.setSelectedIndex(0);
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

					if(this.conteosfisicos!=null) {
						this.conteosfisicos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaConteosFisicos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
						if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.getItemCount()>0) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos!=null) {
						jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos!=null) {
							//jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaConteosFisicosGenerico)throws Exception
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
				jComboBoxid_linea_marcaConteosFisicosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaConteosFisicosGenerico!=null && jComboBoxid_linea_marcaConteosFisicosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaConteosFisicosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_bodegaConteosFisicosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaConteosFisicosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaConteosFisicosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				conteosfisicos.setid_bodega(bodegaAux.getId());
				conteosfisicos.setbodega_descripcion(ConteosFisicosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				conteosfisicos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_productoConteosFisicosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoConteosFisicosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoConteosFisicosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				conteosfisicos.setid_producto(productoAux.getId());
				conteosfisicos.setproducto_descripcion(ConteosFisicosConstantesFunciones.getProductoDescripcion(productoAux));
				conteosfisicos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_empresaConteosFisicosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConteosFisicosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConteosFisicosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				conteosfisicos.setid_empresa(empresaAux.getId());
				conteosfisicos.setempresa_descripcion(ConteosFisicosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				conteosfisicos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_sucursalConteosFisicosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalConteosFisicosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalConteosFisicosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				conteosfisicos.setid_sucursal(sucursalAux.getId());
				conteosfisicos.setsucursal_descripcion(ConteosFisicosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				conteosfisicos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_lineaConteosFisicosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaConteosFisicosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaConteosFisicosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				conteosfisicos.setid_linea(lineaAux.getId());
				conteosfisicos.setlinea_descripcion(ConteosFisicosConstantesFunciones.getLineaDescripcion(lineaAux));
				conteosfisicos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_linea_grupoConteosFisicosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoConteosFisicosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoConteosFisicosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				conteosfisicos.setid_linea_grupo(lineaAux.getId());
				conteosfisicos.setlineagrupo_descripcion(ConteosFisicosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				conteosfisicos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_linea_categoriaConteosFisicosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaConteosFisicosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaConteosFisicosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				conteosfisicos.setid_linea_categoria(lineaAux.getId());
				conteosfisicos.setlineacategoria_descripcion(ConteosFisicosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				conteosfisicos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ConteosFisicos conteosfisicos,JComboBox jComboBoxid_linea_marcaConteosFisicosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaConteosFisicosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaConteosFisicosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				conteosfisicos.setid_linea_marca(lineaAux.getId());
				conteosfisicos.setlineamarca_descripcion(ConteosFisicosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				conteosfisicos.setLineaMarca(lineaAux);			}
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.addItem(bodega);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.addItem(producto);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.addItem(linea);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.addItem(lineagrupo);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.addItem(lineacategoria);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConteosFisicos!=null) { 
					}

					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaConteosFisicos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.addItem(lineamarca);
							}
						}

						if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConteosFisicos() throws Exception {
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
		
	public ConteosFisicosParameterReturnGeneral getConteosFisicosParameterGeneral() {
		return this.conteosfisicosParameterGeneral;
	}
	
	public void setConteosFisicosParameterGeneral(ConteosFisicosParameterReturnGeneral conteosfisicosParameterGeneral) {
		this.conteosfisicosParameterGeneral = conteosfisicosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConteosFisicos() {
		return isPermisoTodoConteosFisicos;
	}

	public void setIsPermisoTodoConteosFisicos(Boolean isPermisoTodoConteosFisicos) {
		this.isPermisoTodoConteosFisicos = isPermisoTodoConteosFisicos;
	}

	public Boolean getIsPermisoNuevoConteosFisicos() {
		return isPermisoNuevoConteosFisicos;
	}

	public void setIsPermisoNuevoConteosFisicos(Boolean isPermisoNuevoConteosFisicos) {
		this.isPermisoNuevoConteosFisicos = isPermisoNuevoConteosFisicos;
	}

	public Boolean getIsPermisoActualizarConteosFisicos() {
		return isPermisoActualizarConteosFisicos;
	}

	public void setIsPermisoActualizarConteosFisicos(Boolean isPermisoActualizarConteosFisicos) {
		this.isPermisoActualizarConteosFisicos = isPermisoActualizarConteosFisicos;
	}

	public Boolean getIsPermisoEliminarConteosFisicos() {
		return isPermisoEliminarConteosFisicos;
	}

	public void setIsPermisoEliminarConteosFisicos(Boolean isPermisoEliminarConteosFisicos) {
		this.isPermisoEliminarConteosFisicos = isPermisoEliminarConteosFisicos;
	}

	public Boolean getIsPermisoGuardarCambiosConteosFisicos() {
		return isPermisoGuardarCambiosConteosFisicos;
	}

	public void setIsPermisoGuardarCambiosConteosFisicos(Boolean isPermisoGuardarCambiosConteosFisicos) {
		this.isPermisoGuardarCambiosConteosFisicos = isPermisoGuardarCambiosConteosFisicos;
	}
	
	public Boolean getIsPermisoConsultaConteosFisicos() {
		return isPermisoConsultaConteosFisicos;
	}

	public void setIsPermisoConsultaConteosFisicos(Boolean isPermisoConsultaConteosFisicos) {
		this.isPermisoConsultaConteosFisicos = isPermisoConsultaConteosFisicos;
	}

	public Boolean getIsPermisoBusquedaConteosFisicos() {
		return isPermisoBusquedaConteosFisicos;
	}

	public void setIsPermisoBusquedaConteosFisicos(Boolean isPermisoBusquedaConteosFisicos) {
		this.isPermisoBusquedaConteosFisicos = isPermisoBusquedaConteosFisicos;
	}

	public Boolean getIsPermisoReporteConteosFisicos() {
		return isPermisoReporteConteosFisicos;
	}

	public void setIsPermisoReporteConteosFisicos(Boolean isPermisoReporteConteosFisicos) {
		this.isPermisoReporteConteosFisicos = isPermisoReporteConteosFisicos;
	}
	
	public Boolean getIsPermisoPaginacionMedioConteosFisicos() {
		return isPermisoPaginacionMedioConteosFisicos;
	}

	public void setIsPermisoPaginacionMedioConteosFisicos(Boolean isPermisoPaginacionMedioConteosFisicos) {
		this.isPermisoPaginacionMedioConteosFisicos = isPermisoPaginacionMedioConteosFisicos;
	}
	
	public Boolean getIsPermisoPaginacionTodoConteosFisicos() {
		return isPermisoPaginacionTodoConteosFisicos;
	}

	public void setIsPermisoPaginacionTodoConteosFisicos(Boolean isPermisoPaginacionTodoConteosFisicos) {
		this.isPermisoPaginacionTodoConteosFisicos = isPermisoPaginacionTodoConteosFisicos;
	}
	
	public Boolean getIsPermisoPaginacionAltoConteosFisicos() {
		return isPermisoPaginacionAltoConteosFisicos;
	}

	public void setIsPermisoPaginacionAltoConteosFisicos(Boolean isPermisoPaginacionAltoConteosFisicos) {
		this.isPermisoPaginacionAltoConteosFisicos = isPermisoPaginacionAltoConteosFisicos;
	}
	
	public Boolean getIsPermisoCopiarConteosFisicos() {
		return isPermisoCopiarConteosFisicos;
	}

	public void setIsPermisoCopiarConteosFisicos(Boolean isPermisoCopiarConteosFisicos) {
		this.isPermisoCopiarConteosFisicos = isPermisoCopiarConteosFisicos;
	}
	
	public Boolean getIsPermisoVerFormConteosFisicos() {
		return isPermisoVerFormConteosFisicos;
	}

	public void setIsPermisoVerFormConteosFisicos(Boolean isPermisoVerFormConteosFisicos) {
		this.isPermisoVerFormConteosFisicos = isPermisoVerFormConteosFisicos;
	}
	
	public Boolean getIsPermisoDuplicarConteosFisicos() {
		return isPermisoDuplicarConteosFisicos;
	}

	public void setIsPermisoDuplicarConteosFisicos(Boolean isPermisoDuplicarConteosFisicos) {
		this.isPermisoDuplicarConteosFisicos = isPermisoDuplicarConteosFisicos;
	}
	
	public Boolean getIsPermisoOrdenConteosFisicos() {
		return isPermisoOrdenConteosFisicos;
	}

	public void setIsPermisoOrdenConteosFisicos(Boolean isPermisoOrdenConteosFisicos) {
		this.isPermisoOrdenConteosFisicos = isPermisoOrdenConteosFisicos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConteosFisicos() {
		return isVisibilidadCeldaNuevoConteosFisicos;
	}

	public void setIsVisibilidadCeldaNuevoConteosFisicos(Boolean isVisibilidadCeldaNuevoConteosFisicos) {
		this.isVisibilidadCeldaNuevoConteosFisicos = isVisibilidadCeldaNuevoConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConteosFisicos() {
		return isVisibilidadCeldaDuplicarConteosFisicos;
	}

	public void setIsVisibilidadCeldaDuplicarConteosFisicos(Boolean isVisibilidadCeldaDuplicarConteosFisicos) {
		this.isVisibilidadCeldaDuplicarConteosFisicos = isVisibilidadCeldaDuplicarConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConteosFisicos() {
		return isVisibilidadCeldaCopiarConteosFisicos;
	}

	public void setIsVisibilidadCeldaCopiarConteosFisicos(Boolean isVisibilidadCeldaCopiarConteosFisicos) {
		this.isVisibilidadCeldaCopiarConteosFisicos = isVisibilidadCeldaCopiarConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConteosFisicos() {
		return isVisibilidadCeldaVerFormConteosFisicos;
	}

	public void setIsVisibilidadCeldaVerFormConteosFisicos(Boolean isVisibilidadCeldaVerFormConteosFisicos) {
		this.isVisibilidadCeldaVerFormConteosFisicos = isVisibilidadCeldaVerFormConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConteosFisicos() {
		return isVisibilidadCeldaOrdenConteosFisicos;
	}

	public void setIsVisibilidadCeldaOrdenConteosFisicos(Boolean isVisibilidadCeldaOrdenConteosFisicos) {
		this.isVisibilidadCeldaOrdenConteosFisicos = isVisibilidadCeldaOrdenConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConteosFisicos() {
		return isVisibilidadCeldaNuevoRelacionesConteosFisicos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConteosFisicos(Boolean isVisibilidadCeldaNuevoRelacionesConteosFisicos) {
		this.isVisibilidadCeldaNuevoRelacionesConteosFisicos = isVisibilidadCeldaNuevoRelacionesConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConteosFisicos() {
		return isVisibilidadCeldaModificarConteosFisicos;
	}

	public void setIsVisibilidadCeldaModificarConteosFisicos(Boolean isVisibilidadCeldaModificarConteosFisicos) {
		this.isVisibilidadCeldaModificarConteosFisicos = isVisibilidadCeldaModificarConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConteosFisicos() {
		return isVisibilidadCeldaActualizarConteosFisicos;
	}

	public void setIsVisibilidadCeldaActualizarConteosFisicos(Boolean isVisibilidadCeldaActualizarConteosFisicos) {
		this.isVisibilidadCeldaActualizarConteosFisicos = isVisibilidadCeldaActualizarConteosFisicos;
	}

	public Boolean getIsVisibilidadCeldaEliminarConteosFisicos() {
		return isVisibilidadCeldaEliminarConteosFisicos;
	}

	public void setIsVisibilidadCeldaEliminarConteosFisicos(Boolean isVisibilidadCeldaEliminarConteosFisicos) {
		this.isVisibilidadCeldaEliminarConteosFisicos = isVisibilidadCeldaEliminarConteosFisicos;
	}

	public Boolean getIsVisibilidadCeldaCancelarConteosFisicos() {
		return isVisibilidadCeldaCancelarConteosFisicos;
	}

	public void setIsVisibilidadCeldaCancelarConteosFisicos(Boolean isVisibilidadCeldaCancelarConteosFisicos) {
		this.isVisibilidadCeldaCancelarConteosFisicos = isVisibilidadCeldaCancelarConteosFisicos;
	}

	public Boolean getIsVisibilidadCeldaGuardarConteosFisicos() {
		return isVisibilidadCeldaGuardarConteosFisicos;
	}

	public void setIsVisibilidadCeldaGuardarConteosFisicos(Boolean isVisibilidadCeldaGuardarConteosFisicos) {
		this.isVisibilidadCeldaGuardarConteosFisicos = isVisibilidadCeldaGuardarConteosFisicos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConteosFisicos() {
		return isVisibilidadCeldaGuardarCambiosConteosFisicos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConteosFisicos(Boolean isVisibilidadCeldaGuardarCambiosConteosFisicos) {
		this.isVisibilidadCeldaGuardarCambiosConteosFisicos = isVisibilidadCeldaGuardarCambiosConteosFisicos;
	}
		
	public ConteosFisicosSessionBean getconteosfisicosSessionBean() {
		return this.conteosfisicosSessionBean;
	}
	
	public void setconteosfisicosSessionBean(ConteosFisicosSessionBean conteosfisicosSessionBean) {
		this.conteosfisicosSessionBean=conteosfisicosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaConteosFisicos() {
		return this.isVisibilidadBusquedaConteosFisicos;
	}

	public void setisVisibilidadBusquedaConteosFisicos(Boolean isVisibilidadBusquedaConteosFisicos) {
		this.isVisibilidadBusquedaConteosFisicos=isVisibilidadBusquedaConteosFisicos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(ConteosFisicos conteosfisicos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(conteosfisicos,null);
				this.setActualParaGuardarProductoForeignKey(conteosfisicos,null);
				this.setActualParaGuardarEmpresaForeignKey(conteosfisicos,null);
				this.setActualParaGuardarSucursalForeignKey(conteosfisicos,null);
				this.setActualParaGuardarLineaForeignKey(conteosfisicos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(conteosfisicos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(conteosfisicos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(conteosfisicos,null);
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
	
	public void bugActualizarReferenciaActual(ConteosFisicos conteosfisicos,ConteosFisicos conteosfisicosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConteosFisicos(conteosfisicos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conteosfisicosAux.setId(conteosfisicos.getId());
		conteosfisicosAux.setVersionRow(conteosfisicos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ConteosFisicos conteosfisicosLocal) throws Exception {
		
		if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConteosFisicos conteosfisicosLocal) throws Exception {	
		if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				conteosfisicosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				conteosfisicosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				conteosfisicosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				conteosfisicosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				conteosfisicosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				conteosfisicosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				conteosfisicosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				conteosfisicosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConteosFisicosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conteosfisicosValidator.getInvalidValues(this.conteosfisicos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConteosFisicos conteosfisicos,List<ConteosFisicos> conteosfisicoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ConteosFisicos conteosfisicos,List<ConteosFisicos> conteosfisicoss) throws Exception {
		try	{			
			ConteosFisicosConstantesFunciones.actualizarSelectedLista(conteosfisicos,conteosfisicoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConteosFisicos> conteosfisicossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conteosfisicossLocal=this.conteosfisicosLogic.getConteosFisicoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conteosfisicossLocal=this.conteosfisicoss;
			}
			//ARCHITECTURE
		
			for(ConteosFisicos conteosfisicosLocal:conteosfisicossLocal) {
				if(this.permiteMantenimiento(conteosfisicosLocal) && conteosfisicosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConteosFisicosConstantesFunciones.getConteosFisicosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigoConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombre_unidadConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_disponibleConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.CANTIDADFISICA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_fisicaConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigo_productoConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombreConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.INGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelingresosConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.EGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelegresosConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.EXISTENCIACORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelexistencia_corteConteosFisicos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConteosFisicosConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcostoConteosFisicos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigoConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombre_unidadConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_disponibleConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_fisicaConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigo_productoConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombreConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelingresosConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelegresosConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelexistencia_corteConteosFisicos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConteosFisicos.jLabelcostoConteosFisicos,"");
		
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
		this.iIdNuevoConteosFisicos--;	
		
		
		this.conteosfisicosAux=new ConteosFisicos();
		
		this.conteosfisicosAux.setId(this.iIdNuevoConteosFisicos);
		this.conteosfisicosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conteosfisicosLogic.getConteosFisicoss().add(this.conteosfisicosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conteosfisicoss.add(this.conteosfisicosAux);
		}
		//ARCHITECTURE
		
		this.conteosfisicos=this.conteosfisicosAux;
		
		if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConteosFisicos(this.conteosfisicos);
			this.setVariablesObjetoActualToFormularioForeignKeyConteosFisicos(this.conteosfisicos);
		}
				
		//this.setDefaultControlesConteosFisicos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConteosFisicos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConteosFisicos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConteosFisicos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConteosFisicos(this.conteosfisicosBean,this.conteosfisicos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConteosFisicos(this.conteosfisicosReturnGeneral,this.conteosfisicosBean,false);
		
		if(this.conteosfisicosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos());
		}
		
		if(this.conteosfisicosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos(),classes);//this.conteosfisicosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConteosFisicos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConteosFisicos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.RecargarFormConteosFisicos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConteosFisicos(false);
						
			if(conteosfisicosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConteosFisicos();
			}
			
			this.actualizarVisualTableDatosConteosFisicos();
			
			this.jTableDatosConteosFisicos.setRowSelectionInterval(this.getIndiceNuevoConteosFisicos(), this.getIndiceNuevoConteosFisicos());
			
			this.seleccionarFilaTablaConteosFisicosActual();
						
			this.actualizarEstadoCeldasBotonesConteosFisicos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConteosFisicos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConteosFisicos.jDateChooserfecha_ultima_venta_hastaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarfecha_ultima_venta_hastaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarcodigoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarnombre_unidadConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarcantidad_disponibleConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarcantidad_fisicaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarcodigo_productoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarnombreConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activaringresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activaregresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarexistencia_corteConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarcostoConteosFisicos);	
		
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_bodegaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_productoConteosFisicos);//
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_empresaConteosFisicos);//
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_sucursalConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_lineaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_linea_grupoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_linea_categoriaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setEnabled(isHabilitar && this.conteosfisicosConstantesFunciones.activarid_linea_marcaConteosFisicos);
	};
	
	public void setDefaultControlesConteosFisicos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConteosFisicos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conteosfisicosSessionBean.setConGuardarRelaciones(true);			
			this.conteosfisicosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.setVisible(true);
			
					
		} else {
			//this.conteosfisicosSessionBean.setConGuardarRelaciones(false);			
			this.conteosfisicosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConteosFisicos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
				if(conteosfisicosAux.getId().equals(this.iIdNuevoConteosFisicos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicoss) {
				if(conteosfisicosAux.getId().equals(this.iIdNuevoConteosFisicos)) {
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
	
	public int getIndiceActualConteosFisicos(ConteosFisicos conteosfisicos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
				if(conteosfisicosAux.getId().equals(conteosfisicos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicoss) {
				if(conteosfisicosAux.getId().equals(conteosfisicos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConteosFisicos(ConteosFisicos conteosfisicosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
				if(conteosfisicosAux.getConteosFisicosOriginal().getId().equals(conteosfisicosOriginal.getId())) {
					existe=true;
					conteosfisicosOriginal.setId(conteosfisicosAux.getId());
					conteosfisicosOriginal.setVersionRow(conteosfisicosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConteosFisicos conteosfisicosAux:this.conteosfisicoss) {
				if(conteosfisicosAux.getConteosFisicosOriginal().getId().equals(conteosfisicosOriginal.getId())) {
					existe=true;
					conteosfisicosOriginal.setId(conteosfisicosAux.getId());
					conteosfisicosOriginal.setVersionRow(conteosfisicosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConteosFisicos(Boolean esParaCancelar) throws Exception {
		conteosfisicossAux=new ArrayList<ConteosFisicos>();
		conteosfisicosAux=new ConteosFisicos();
		
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
					if(conteosfisicosAux.getId()<0) {
						conteosfisicossAux.add(conteosfisicosAux);
					}		
				}
				this.iIdNuevoConteosFisicos=0L;
				this.conteosfisicosLogic.getConteosFisicoss().removeAll(conteosfisicossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConteosFisicos conteosfisicosAux:this.conteosfisicoss) {
					if(conteosfisicosAux.getId()<0) {
						conteosfisicossAux.add(conteosfisicosAux);
					}		
				}
				this.iIdNuevoConteosFisicos=0L;
				this.conteosfisicoss.removeAll(conteosfisicossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConteosFisicos 
					&& this.conteosfisicosLogic.getConteosFisicoss().size()>0
					) {
					conteosfisicosAux=this.conteosfisicosLogic.getConteosFisicoss().get(this.conteosfisicosLogic.getConteosFisicoss().size() - 1);
				
					if(conteosfisicosAux.getId()<0) {
						this.conteosfisicosLogic.getConteosFisicoss().remove(conteosfisicosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConteosFisicos && this.conteosfisicoss.size()>0) {
					conteosfisicosAux=this.conteosfisicoss.get(this.conteosfisicoss.size() - 1);
				
					if(conteosfisicosAux.getId()<0) {
						this.conteosfisicoss.remove(conteosfisicosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConteosFisicos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conteosfisicos.getId()<0) {
				this.conteosfisicosLogic.getConteosFisicoss().remove(this.conteosfisicos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conteosfisicos.getId()<0) {
				this.conteosfisicoss.remove(this.conteosfisicos);
			}
		}			
	}
	
	public void setEstadosInicialesConteosFisicos(List<ConteosFisicos> conteosfisicossAux) throws Exception {
		ConteosFisicosConstantesFunciones.setEstadosInicialesConteosFisicos(conteosfisicossAux);
	}
	
	public void setEstadosInicialesConteosFisicos(ConteosFisicos conteosfisicosAux) throws Exception {
		ConteosFisicosConstantesFunciones.setEstadosInicialesConteosFisicos(conteosfisicosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConteosFisicosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConteosFisicosActual()) {
				if(!this.isEsNuevoConteosFisicos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConteosFisicos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConteosFisicosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conteos Fisicos ?", "MANTENIMIENTO DE Conteos Fisicos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConteosFisicos conteosfisicos) throws Exception {
		ConteosFisicosConstantesFunciones.seleccionarAsignar(this.conteosfisicos,conteosfisicos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConteosFisicos=this.isPermisoActualizarOriginalConteosFisicos;
			
			
			this.seleccionarAsignar(conteosfisicos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesConteosFisicos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conteosfisicosSessionBean.setsFuncionBusquedaRapida(this.conteosfisicosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConteosFisicos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConteosFisicos(esParaCancelar);				
				this.cancelarNuevoConteosFisicos(esParaCancelar);								
			}
			
			this.conteosfisicos=new ConteosFisicos();
			
			this.inicializarConteosFisicos();
			
			this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConteosFisicos() throws Exception {
		try {
			ConteosFisicosConstantesFunciones.inicializarConteosFisicos(this.conteosfisicos);
			
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
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conteosfisicosLogic.getConteosFisicoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConteosFisicoss(String sAccionBusqueda,List<ConteosFisicos> conteosfisicossParaReportes) throws Exception {
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
					sPathReporteFinal="ConteosFisicos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConteosFisicosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConteosFisicosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConteosFisicos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conteos Fisicoses");		
		parameters.put("busquedapor", ConteosFisicosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConteosFisicos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConteosFisicosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConteosFisicosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConteosFisicos=new JRBeanArrayDataSource(ConteosFisicosJInternalFrame.TraerConteosFisicosBeans(conteosfisicossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConteosFisicos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConteosFisicosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConteosFisicosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConteosFisicosBean.TraerConteosFisicosBeans(conteosfisicossParaReportes).toArray()));
							
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
				this.generarExcelReporteConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConteosFisicosActionPerformed(null);
					//this.generarExcelReporteConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConteosFisicoss(sAccionBusqueda,sTipoArchivoReporte,conteosfisicossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConteosFisicoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConteosFisicos> conteosfisicossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConteosFisicoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConteosFisicos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConteosFisicos conteosfisicos : conteosfisicossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConteosFisicosConstantesFunciones.generarExcelReporteDataConteosFisicos("NORMAL",row,workbook,conteosfisicos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConteosFisicos(String sTipo,Row row,Workbook workbook) {
		
		ConteosFisicosConstantesFunciones.generarExcelReporteHeaderConteosFisicos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConteosFisicoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConteosFisicos> conteosfisicossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConteosFisicoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConteosFisicos conteosfisicos : conteosfisicossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConteosFisicosConstantesFunciones.getConteosFisicosDescripcion(conteosfisicos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getfecha_ultima_venta_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getcantidad_fisica());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_INGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_INGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_EGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getegresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getexistencia_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConteosFisicosConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conteosfisicos.getcosto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConteosFisicoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ConteosFisicos> conteosfisicossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConteosFisicos> conteosfisicossRespaldo=null;
		
		classes=ConteosFisicosConstantesFunciones.getClassesRelationshipsOfConteosFisicos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conteosfisicosLogic.setDatosCliente(this.datosCliente);
		this.conteosfisicosLogic.setDatosDeep(this.datosDeep);
		this.conteosfisicosLogic.setIsConDeep(true);
		
		conteosfisicossRespaldo=this.conteosfisicosLogic.getConteosFisicoss();
		
		this.conteosfisicosLogic.setConteosFisicoss(conteosfisicossParaReportes);	
		this.conteosfisicosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conteosfisicossParaReportes=this.conteosfisicosLogic.getConteosFisicoss();
		this.conteosfisicosLogic.setConteosFisicoss(conteosfisicossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConteosFisicoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConteosFisicos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConteosFisicos conteosfisicos : conteosfisicossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConteosFisicos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConteosFisicosConstantesFunciones.generarExcelReporteDataConteosFisicos("NORMAL",row,workbook,conteosfisicos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConteosFisicosConstantesFunciones.getConteosFisicosDescripcion(conteosfisicos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConteosFisicos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConteosFisicos() throws Exception {		
		this.startProcessConteosFisicos(true);
	}
	
	public void startProcessConteosFisicos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConteosFisicos ,this.jPanelParametrosReportesConteosFisicos, this.jScrollPanelDatosConteosFisicos,this.jPanelPaginacionConteosFisicos, this.jScrollPanelDatosEdicionConteosFisicos, this.jPanelAccionesConteosFisicos,this.jPanelAccionesFormularioConteosFisicos,this.jmenuBarConteosFisicos,this.jmenuBarDetalleConteosFisicos,this.jTtoolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos);		
		
		final JTabbedPane jTabbedPaneBusquedasConteosFisicos=this.jTabbedPaneBusquedasConteosFisicos; 
		
		final JPanel jPanelParametrosReportesConteosFisicos=this.jPanelParametrosReportesConteosFisicos;
		//final JScrollPane jScrollPanelDatosConteosFisicos=this.jScrollPanelDatosConteosFisicos;
		final JTable jTableDatosConteosFisicos=this.jTableDatosConteosFisicos;		
		final JPanel jPanelPaginacionConteosFisicos=this.jPanelPaginacionConteosFisicos;
		//final JScrollPane jScrollPanelDatosEdicionConteosFisicos=this.jScrollPanelDatosEdicionConteosFisicos;
		final JPanel jPanelAccionesConteosFisicos=this.jPanelAccionesConteosFisicos;
		
		JPanel jPanelCamposAuxiliarConteosFisicos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConteosFisicos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			jPanelCamposAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jPanelCamposConteosFisicos;
			jPanelAccionesFormularioAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jPanelAccionesFormularioConteosFisicos;
		}
		
		final JPanel jPanelCamposConteosFisicos=jPanelCamposAuxiliarConteosFisicos;
		final JPanel jPanelAccionesFormularioConteosFisicos=jPanelAccionesFormularioAuxiliarConteosFisicos;
		
		
		final JMenuBar jmenuBarConteosFisicos=this.jmenuBarConteosFisicos;
		final JToolBar jTtoolBarConteosFisicos=this.jTtoolBarConteosFisicos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConteosFisicos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConteosFisicos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			jmenuBarDetalleAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jmenuBarDetalleConteosFisicos;
			jTtoolBarDetalleAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jTtoolBarDetalleConteosFisicos;
		}
		
		final JMenuBar jmenuBarDetalleConteosFisicos=jmenuBarDetalleAuxiliarConteosFisicos;
		final JToolBar jTtoolBarDetalleConteosFisicos=jTtoolBarDetalleAuxiliarConteosFisicos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConteosFisicos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConteosFisicos;
			processRunnable.jTableDatos=jTableDatosConteosFisicos;
			processRunnable.jPanelCampos=jPanelCamposConteosFisicos;
			processRunnable.jPanelPaginacion=jPanelPaginacionConteosFisicos;
			processRunnable.jPanelAcciones=jPanelAccionesConteosFisicos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConteosFisicos;
			
			
			processRunnable.jmenuBar=jmenuBarConteosFisicos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConteosFisicos;
			processRunnable.jTtoolBar=jTtoolBarConteosFisicos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConteosFisicos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConteosFisicos ,jPanelParametrosReportesConteosFisicos,jTableDatosConteosFisicos, /*jScrollPanelDatosConteosFisicos,*/jPanelCamposConteosFisicos,jPanelPaginacionConteosFisicos, /*jScrollPanelDatosEdicionConteosFisicos,*/ jPanelAccionesConteosFisicos,jPanelAccionesFormularioConteosFisicos,jmenuBarConteosFisicos,jmenuBarDetalleConteosFisicos,jTtoolBarConteosFisicos,jTtoolBarDetalleConteosFisicos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConteosFisicos ,jPanelParametrosReportesConteosFisicos, jScrollPanelDatosConteosFisicos,jPanelPaginacionConteosFisicos, jScrollPanelDatosEdicionConteosFisicos, jPanelAccionesConteosFisicos,jPanelAccionesFormularioConteosFisicos,jmenuBarConteosFisicos,jmenuBarDetalleConteosFisicos,jTtoolBarConteosFisicos,jTtoolBarDetalleConteosFisicos);
						
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
	
	public void finishProcessConteosFisicos() {// throws Exception 
		this.finishProcessConteosFisicos(true);
	}
	
	public void finishProcessConteosFisicos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConteosFisicos ,this.jPanelParametrosReportesConteosFisicos, this.jScrollPanelDatosConteosFisicos,this.jPanelPaginacionConteosFisicos, this.jScrollPanelDatosEdicionConteosFisicos, this.jPanelAccionesConteosFisicos,this.jPanelAccionesFormularioConteosFisicos,this.jmenuBarConteosFisicos,this.jmenuBarDetalleConteosFisicos,this.jTtoolBarConteosFisicos,this.jTtoolBarDetalleConteosFisicos);		
		
		final JTabbedPane jTabbedPaneBusquedasConteosFisicos=this.jTabbedPaneBusquedasConteosFisicos; 
		
		final JPanel jPanelParametrosReportesConteosFisicos=this.jPanelParametrosReportesConteosFisicos;
		//final JScrollPane jScrollPanelDatosConteosFisicos=this.jScrollPanelDatosConteosFisicos;
		final JTable jTableDatosConteosFisicos=this.jTableDatosConteosFisicos;		
		final JPanel jPanelPaginacionConteosFisicos=this.jPanelPaginacionConteosFisicos;
		//final JScrollPane jScrollPanelDatosEdicionConteosFisicos=this.jScrollPanelDatosEdicionConteosFisicos;
		final JPanel jPanelAccionesConteosFisicos=this.jPanelAccionesConteosFisicos;
		
		JPanel jPanelCamposAuxiliarConteosFisicos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConteosFisicos=new JPanel();
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			jPanelCamposAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jPanelCamposConteosFisicos;
			jPanelAccionesFormularioAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jPanelAccionesFormularioConteosFisicos;
		}
		
		final JPanel jPanelCamposConteosFisicos=jPanelCamposAuxiliarConteosFisicos;
		final JPanel jPanelAccionesFormularioConteosFisicos=jPanelAccionesFormularioAuxiliarConteosFisicos;
		
		
		final JMenuBar jmenuBarConteosFisicos=this.jmenuBarConteosFisicos;		
		final JToolBar jTtoolBarConteosFisicos=this.jTtoolBarConteosFisicos;
				
		JMenuBar jmenuBarDetalleAuxiliarConteosFisicos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConteosFisicos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			jmenuBarDetalleAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jmenuBarDetalleConteosFisicos;
			jTtoolBarDetalleAuxiliarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jTtoolBarDetalleConteosFisicos;		
		}
		
		final JMenuBar jmenuBarDetalleConteosFisicos=jmenuBarDetalleAuxiliarConteosFisicos;
		final JToolBar jTtoolBarDetalleConteosFisicos=jTtoolBarDetalleAuxiliarConteosFisicos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConteosFisicos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConteosFisicos;
			processRunnable.jTableDatos=jTableDatosConteosFisicos;
			processRunnable.jPanelCampos=jPanelCamposConteosFisicos;
			processRunnable.jPanelPaginacion=jPanelPaginacionConteosFisicos;
			processRunnable.jPanelAcciones=jPanelAccionesConteosFisicos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConteosFisicos;
			
			
			processRunnable.jmenuBar=jmenuBarConteosFisicos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConteosFisicos;
			processRunnable.jTtoolBar=jTtoolBarConteosFisicos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConteosFisicos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConteosFisicos ,jPanelParametrosReportesConteosFisicos, jTableDatosConteosFisicos,/*jScrollPanelDatosConteosFisicos,*/jPanelCamposConteosFisicos,jPanelPaginacionConteosFisicos, /*jScrollPanelDatosEdicionConteosFisicos,*/ jPanelAccionesConteosFisicos,jPanelAccionesFormularioConteosFisicos,jmenuBarConteosFisicos,jmenuBarDetalleConteosFisicos,jTtoolBarConteosFisicos,jTtoolBarDetalleConteosFisicos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConteosFisicos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConteosFisicos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConteosFisicos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConteosFisicos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConteosFisicos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConteosFisicos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConteosFisicos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConteosFisicos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConteosFisicos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conteosfisicosConstantesFunciones.getsFinalQueryConteosFisicos();
		String  finalQueryPaginacionTodos=this.conteosfisicosConstantesFunciones.getsFinalQueryConteosFisicos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConteosFisicosConstantesFunciones.getArrayColumnasGlobalesNoConteosFisicos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConteosFisicosConstantesFunciones.getArrayColumnasGlobalesConteosFisicos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConteosFisicosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conteosfisicossEliminados= new ArrayList<ConteosFisicos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConteosFisicos();
		
				///*ConteosFisicosSessionBean*/this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			
			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
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
					this.iNumeroPaginacion=ConteosFisicosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConteosFisicosConstantesFunciones.getClassesForeignKeysOfConteosFisicos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conteosfisicos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conteosfisicossAux= new ArrayList<ConteosFisicos>();
			
				
			conteosfisicosLogic.setDatosCliente(this.datosCliente);
			conteosfisicosLogic.setDatosDeep(this.datosDeep);
			conteosfisicosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaConteosFisicos")) {
				this.sDetalleReporte=ConteosFisicosConstantesFunciones.getDetalleIndiceBusquedaConteosFisicos(id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conteosfisicosLogic.getConteosFisicossBusquedaConteosFisicos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConteosFisicosConstantesFunciones.getDetalleIndiceBusquedaConteosFisicos(id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConteosFisicosConstantesFunciones.getDetalleIndiceBusquedaConteosFisicos(id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conteosfisicosLogic.getConteosFisicoss()==null||conteosfisicosLogic.getConteosFisicoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conteosfisicoss==null|| conteosfisicoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conteosfisicossAux=new ArrayList<ConteosFisicos>();
						conteosfisicossAux.addAll(conteosfisicosLogic.getConteosFisicoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conteosfisicossAux=new ArrayList<ConteosFisicos>();
							conteosfisicossAux.addAll(conteosfisicoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conteosfisicosLogic.getConteosFisicossBusquedaConteosFisicos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConteosFisicosConstantesFunciones.getDetalleIndiceBusquedaConteosFisicos(id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConteosFisicosConstantesFunciones.getDetalleIndiceBusquedaConteosFisicos(id_bodegaBusquedaConteosFisicos,id_productoBusquedaConteosFisicos,id_lineaBusquedaConteosFisicos,id_linea_grupoBusquedaConteosFisicos,id_linea_categoriaBusquedaConteosFisicos,id_linea_marcaBusquedaConteosFisicos,fecha_ultima_venta_hastaBusquedaConteosFisicos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConteosFisicoss("BusquedaConteosFisicos",conteosfisicosLogic.getConteosFisicoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConteosFisicoss("BusquedaConteosFisicos",conteosfisicoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conteosfisicosLogic.setConteosFisicoss(new ArrayList<ConteosFisicos>());
						conteosfisicosLogic.getConteosFisicoss().addAll(conteosfisicossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conteosfisicoss=new ArrayList<ConteosFisicos>();
							conteosfisicoss.addAll(conteosfisicossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConteosFisicos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConteosFisicos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conteosfisicosLogic.getConteosFisicoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conteosfisicoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conteosfisicosLogic.getConteosFisicoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conteosfisicoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConteosFisicos conteosfisicos) {
		Boolean permite=true;
		
		if(this.conteosfisicos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConteosFisicosConstantesFunciones.getOrderByListaConteosFisicos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConteosFisicosConstantesFunciones.getOrderByListaConteosFisicos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConteosFisicos conteosfisicos:conteosfisicosLogic.getConteosFisicoss()) {
				if(conteosfisicos.getsType().equals(Constantes2.S_TOTALES)) {
					conteosfisicosTotales=conteosfisicos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConteosFisicos conteosfisicos:this.conteosfisicoss) {
				if(conteosfisicos.getsType().equals(Constantes2.S_TOTALES)) {
					conteosfisicosTotales=conteosfisicos;
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
			this.conteosfisicosAux=new ConteosFisicos();
			this.conteosfisicosAux.setsType(Constantes2.S_TOTALES);
			this.conteosfisicosAux.setIsNew(false);
			this.conteosfisicosAux.setIsChanged(false);
			this.conteosfisicosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ConteosFisicosConstantesFunciones.TotalizarValoresFilaConteosFisicos(this.conteosfisicosLogic.getConteosFisicoss(),this.conteosfisicosAux);
				
				//this.conteosfisicosLogic.getConteosFisicoss().add(this.conteosfisicosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConteosFisicosConstantesFunciones.TotalizarValoresFilaConteosFisicos(this.conteosfisicoss,this.conteosfisicosAux);
				
				this.conteosfisicoss.add(this.conteosfisicosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conteosfisicosTotales=new ConteosFisicos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conteosfisicosLogic.getConteosFisicoss().remove(conteosfisicosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conteosfisicoss.remove(conteosfisicosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conteosfisicosTotales=new ConteosFisicos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConteosFisicos conteosfisicos:conteosfisicosLogic.getConteosFisicoss()) {
				if(conteosfisicos.getsType().equals(Constantes2.S_TOTALES)) {
					conteosfisicosTotales=conteosfisicos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConteosFisicosConstantesFunciones.TotalizarValoresFilaConteosFisicos(this.conteosfisicosLogic.getConteosFisicoss(),conteosfisicosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConteosFisicos conteosfisicos:this.conteosfisicoss) {
				if(conteosfisicos.getsType().equals(Constantes2.S_TOTALES)) {
					conteosfisicosTotales=conteosfisicos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConteosFisicosConstantesFunciones.TotalizarValoresFilaConteosFisicos(this.conteosfisicoss,conteosfisicosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConteosFisicossBusquedaConteosFisicos()throws Exception {
		try {
			sAccionBusqueda="BusquedaConteosFisicos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConteosFisicossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConteosFisicossBusquedaConteosFisicos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_ultima_venta_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossBusquedaConteosFisicos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_ultima_venta_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConteosFisicossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//conteosfisicosLogic.getConteosFisicossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosConteosFisicos() {
		this.isPermisoTodoConteosFisicos=false;
		this.isPermisoNuevoConteosFisicos=false;
		this.isPermisoActualizarConteosFisicos=false;
		this.isPermisoActualizarOriginalConteosFisicos=false;
		this.isPermisoEliminarConteosFisicos=false;
		this.isPermisoGuardarCambiosConteosFisicos=false;
		this.isPermisoConsultaConteosFisicos=true;
		this.isPermisoBusquedaConteosFisicos=true;
		this.isPermisoReporteConteosFisicos=true;
		this.isPermisoOrdenConteosFisicos=false;		
		this.isPermisoPaginacionMedioConteosFisicos=false;		
		this.isPermisoPaginacionAltoConteosFisicos=false;		
		this.isPermisoPaginacionTodoConteosFisicos=false;		
		this.isPermisoCopiarConteosFisicos=false;		
		this.isPermisoVerFormConteosFisicos=false;		
		this.isPermisoDuplicarConteosFisicos=false;
		this.isPermisoOrdenConteosFisicos=false;
	}
	
	public void setPermisosUsuarioConteosFisicos(Boolean isPermiso) {
		this.isPermisoTodoConteosFisicos=isPermiso;
		this.isPermisoNuevoConteosFisicos=isPermiso;
		this.isPermisoActualizarConteosFisicos=isPermiso;
		this.isPermisoActualizarOriginalConteosFisicos=isPermiso;
		this.isPermisoEliminarConteosFisicos=isPermiso;
		this.isPermisoGuardarCambiosConteosFisicos=isPermiso;
		this.isPermisoConsultaConteosFisicos=isPermiso;
		this.isPermisoBusquedaConteosFisicos=isPermiso;
		this.isPermisoReporteConteosFisicos=isPermiso;
		this.isPermisoOrdenConteosFisicos=isPermiso;		
		this.isPermisoPaginacionMedioConteosFisicos=isPermiso;		
		this.isPermisoPaginacionAltoConteosFisicos=isPermiso;		
		this.isPermisoPaginacionTodoConteosFisicos=isPermiso;		
		this.isPermisoCopiarConteosFisicos=isPermiso;		
		this.isPermisoVerFormConteosFisicos=isPermiso;		
		this.isPermisoDuplicarConteosFisicos=isPermiso;
		this.isPermisoOrdenConteosFisicos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConteosFisicos(Boolean isPermiso) {
		//this.isPermisoTodoConteosFisicos=isPermiso;
		this.isPermisoNuevoConteosFisicos=isPermiso;
		this.isPermisoActualizarConteosFisicos=isPermiso;
		this.isPermisoActualizarOriginalConteosFisicos=isPermiso;
		this.isPermisoEliminarConteosFisicos=isPermiso;
		this.isPermisoGuardarCambiosConteosFisicos=isPermiso;
		//this.isPermisoConsultaConteosFisicos=isPermiso;
		//this.isPermisoBusquedaConteosFisicos=isPermiso;
		//this.isPermisoReporteConteosFisicos=isPermiso;
		//this.isPermisoOrdenConteosFisicos=isPermiso;		
		//this.isPermisoPaginacionMedioConteosFisicos=isPermiso;		
		//this.isPermisoPaginacionAltoConteosFisicos=isPermiso;		
		//this.isPermisoPaginacionTodoConteosFisicos=isPermiso;		
		//this.isPermisoCopiarConteosFisicos=isPermiso;		
		//this.isPermisoDuplicarConteosFisicos=isPermiso;
		//this.isPermisoOrdenConteosFisicos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConteosFisicosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConteosFisicosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConteosFisicos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConteosFisicosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConteosFisicosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConteosFisicosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConteosFisicosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConteosFisicos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConteosFisicosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConteosFisicosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConteosFisicos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConteosFisicos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConteosFisicos=this.isPermisoActualizarConteosFisicos;
			this.isPermisoEliminarConteosFisicos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConteosFisicos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConteosFisicos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConteosFisicos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConteosFisicos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConteosFisicos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConteosFisicos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConteosFisicos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConteosFisicos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConteosFisicos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConteosFisicos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConteosFisicos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConteosFisicos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConteosFisicos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConteosFisicos.setToolTipText(this.jTableDatosConteosFisicos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConteosFisicos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConteosFisicos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConteosFisicosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConteosFisicosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConteosFisicos() throws Exception {
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
	public void inicializarCombosForeignKeyConteosFisicosListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyConteosFisicosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConteosFisicosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyConteosFisicos()throws Exception {
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
			if(this.conteosfisicosSessionBean==null) {
				this.conteosfisicosSessionBean=new ConteosFisicosSessionBean();
			}

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.conteosfisicosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyConteosFisicos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConteosFisicos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConteosFisicos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConteosFisicos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConteosFisicos(ConteosFisicos conteosfisicos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConteosFisicos(ConteosFisicos conteosfisicos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConteosFisicos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConteosFisicos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConteosFisicos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConteosFisicos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConteosFisicos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConteosFisicos()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyConteosFisicos(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyConteosFisicos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.getItemCount()>0) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ConteosFisicosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConteosFisicosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConteosFisicosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conteosfisicosSessionBean=new ConteosFisicosSessionBean(); 
		this.conteosfisicosConstantesFunciones=new ConteosFisicosConstantesFunciones(); 
		this.conteosfisicosBean=new ConteosFisicos();//(this.conteosfisicosConstantesFunciones); 		
		this.conteosfisicosReturnGeneral=new ConteosFisicosParameterReturnGeneral(); 
		
		this.conteosfisicosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conteosfisicosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConteosFisicosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConteosFisicosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConteosFisicosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConteosFisicos(true);
			
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
			
			this.conteosfisicosConstantesFunciones=new ConteosFisicosConstantesFunciones(); 
			this.conteosfisicosBean=new ConteosFisicos();//this.conteosfisicosConstantesFunciones); 			
			this.conteosfisicosReturnGeneral=new ConteosFisicosParameterReturnGeneral(); 
		
			ConteosFisicosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conteos Fisicos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.conteosfisicos=new ConteosFisicos();
			this.conteosfisicoss = new ArrayList<ConteosFisicos>();
			this.conteosfisicossAux = new ArrayList<ConteosFisicos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic=new ConteosFisicosLogic();
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			//this.conteosfisicosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conteosfisicosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConteosFisicos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConteosFisicos);	
					}
					
					if(this.jInternalFrameImportacionConteosFisicos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConteosFisicos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConteosFisicos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConteosFisicos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConteosFisicos);
				this.jInternalFrameDetalleFormConteosFisicos.setVisible(false);
				this.jInternalFrameDetalleFormConteosFisicos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConteosFisicos);
					this.jInternalFrameReporteDinamicoConteosFisicos.setVisible(false);
					this.jInternalFrameReporteDinamicoConteosFisicos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConteosFisicos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConteosFisicos);
					this.jInternalFrameImportacionConteosFisicos.setVisible(false);
					this.jInternalFrameImportacionConteosFisicos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConteosFisicos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConteosFisicos);
					this.jInternalFrameOrderByConteosFisicos.setVisible(false);
					this.jInternalFrameOrderByConteosFisicos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConteosFisicosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConteosFisicosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conteosfisicosReturnGeneral=new ConteosFisicosParameterReturnGeneral();
			
			this.conteosfisicosParameterGeneral=new ConteosFisicosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conteosfisicosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConteosFisicosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConteosFisicosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),this.conteosfisicosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConteosFisicosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),this.conteosfisicosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaDuplicarConteosFisicos=true;
			this.isVisibilidadCeldaCopiarConteosFisicos=true;
			this.isVisibilidadCeldaVerFormConteosFisicos=true;
			this.isVisibilidadCeldaOrdenConteosFisicos=true;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=false;
			this.isVisibilidadCeldaGuardarConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			
			
			this.isVisibilidadBusquedaConteosFisicos=true;
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
			
			//this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConteosFisicos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConteosFisicos(false);
			
			this.setPermisosUsuarioConteosFisicos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado() 
				|| (this.conteosfisicosSessionBean.getEsGuardarRelacionado() && this.conteosfisicosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConteosFisicosClasesRelacionadas();
			}
			
			if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConteosFisicosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConteosFisicos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConteosFisicos();
			}
			
			if(!this.isPermisoBusquedaConteosFisicos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConteosFisicosConstantesFunciones.getTiposSeleccionarConteosFisicos());
				
				this.tiposColumnasSelect=ConteosFisicosConstantesFunciones.getTiposSeleccionarConteosFisicos(true);
				
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
			//if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConteosFisicos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioConteosFisicos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioConteosFisicos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConteosFisicos() ;
			
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
				conteosfisicosImplementable= (ConteosFisicosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConteosFisicosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conteosfisicosImplementableHome= (ConteosFisicosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConteosFisicosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conteosfisicoss= new ArrayList<ConteosFisicos>();
			this.conteosfisicossEliminados= new ArrayList<ConteosFisicos>();
						
			this.isEsNuevoConteosFisicos=false;
			this.esParaAccionDesdeFormularioConteosFisicos=false;
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
				this.cargarCombosForeignKeyConteosFisicos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConteosFisicos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConteosFisicosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConteosFisicosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConteosFisicos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConteosFisicos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConteosFisicos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConteosFisicos();
			}
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConteosFisicos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConteosFisicos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConteosFisicos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConteosFisicos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConteosFisicos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConteosFisicos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConteosFisicos")) {
				iIndex=this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConteosFisicos();	
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
	
	public void cargarCombosForeignKeyConteosFisicos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConteosFisicos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConteosFisicos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConteosFisicosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConteosFisicos();
		
		this.cargarCombosFrameForeignKeyConteosFisicos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConteosFisicos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConteosFisicos();
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
	
	public void jButtonNuevoConteosFisicosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			
			if(jTableDatosConteosFisicos.getRowCount()>=1) {
				jTableDatosConteosFisicos.removeRowSelectionInterval(0, jTableDatosConteosFisicos.getRowCount()-1);						
			}
			
			this.isEsNuevoConteosFisicos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConteosFisicos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConteosFisicos(true);			
			//this.conteosfisicos=new ConteosFisicos();
			//this.conteosfisicos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConteosFisicos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConteosFisicos() ;
			
			if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConteosFisicos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conteosfisicos);	
			this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);				
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConteosFisicos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConteosFisicosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConteosFisicos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConteosFisicos.getSelectedRows().length;			
			}
			
			conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConteosFisicos--;			
				//ConteosFisicos conteosfisicosAux= new ConteosFisicos();			
				//conteosfisicosAux.setId(this.iIdNuevoConteosFisicos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConteosFisicos conteosfisicosOrigen=new ConteosFisicos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConteosFisicos conteosfisicosOrigen : conteosfisicossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conteosfisicosOrigen =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conteosfisicosOrigen =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConteosFisicos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conteosfisicos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConteosFisicos(conteosfisicosOrigen,this.conteosfisicos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conteosfisicosLogic.getConteosFisicoss().add(this.conteosfisicosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conteosfisicoss.add(this.conteosfisicosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConteosFisicos(false);
				
				this.jTableDatosConteosFisicos.setRowSelectionInterval(this.getIndiceNuevoConteosFisicos(), this.getIndiceNuevoConteosFisicos());
				
				int iLastRow =  this.jTableDatosConteosFisicos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConteosFisicos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConteosFisicos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConteosFisicos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();									
		
			ConteosFisicos conteosfisicosOrigen=new ConteosFisicos();
			ConteosFisicos conteosfisicosDestino=new ConteosFisicos();
				
			conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConteosFisicos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conteosfisicossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConteosFisicos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conteosfisicosOrigen =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conteosfisicosOrigen =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conteosfisicosDestino =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conteosfisicosDestino =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conteosfisicosOrigen =conteosfisicossSeleccionados.get(0);
				conteosfisicosDestino =conteosfisicossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConteosFisicos(conteosfisicosOrigen,conteosfisicosDestino,true,false);
				
				conteosfisicosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conteosfisicosDestino,conteosfisicosLogic.getConteosFisicoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conteosfisicosDestino,conteosfisicoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConteosFisicos(false);
				
				//this.jTableDatosConteosFisicos.setRowSelectionInterval(this.getIndiceNuevoConteosFisicos(), this.getIndiceNuevoConteosFisicos());
				
				int iLastRow =  this.jTableDatosConteosFisicos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConteosFisicos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConteosFisicos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConteosFisicos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConteosFisicos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConteosFisicos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConteosFisicos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConteosFisicos.setVisible(!isVisible);
			this.jPanelPaginacionConteosFisicos.setVisible(!isVisible);
			this.jPanelAccionesConteosFisicos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConteosFisicos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConteosFisicos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConteosFisicos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConteosFisicos();
			
			this.abrirFrameOrderByConteosFisicos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConteosFisicos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConteosFisicos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConteosFisicos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConteosFisicos.isMaximum()) {
					this.jInternalFrameDetalleFormConteosFisicos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConteosFisicos.setSize(this.jInternalFrameDetalleFormConteosFisicos.iWidthFormulario,this.jInternalFrameDetalleFormConteosFisicos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConteosFisicos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConteosFisicos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConteosFisicos.isMaximum()) {
						this.jInternalFrameDetalleFormConteosFisicos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConteosFisicos.jContentPaneDetalleConteosFisicos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConteosFisicos.jContentPaneDetalleConteosFisicos.getWidth(),ConteosFisicosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConteosFisicos.jContentPaneDetalleConteosFisicos.getWidth(),ConteosFisicosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConteosFisicos.jContentPaneDetalleConteosFisicos.getWidth(),ConteosFisicosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConteosFisicos.setVisible(true);
	        this.jInternalFrameDetalleFormConteosFisicos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConteosFisicos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConteosFisicos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConteosFisicos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConteosFisicos,false,this);
				} else {
					this.jInternalFrameOrderByConteosFisicos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConteosFisicos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConteosFisicos);
				this.jInternalFrameOrderByConteosFisicos.setVisible(false);
				this.jInternalFrameOrderByConteosFisicos.setSelected(false);
				
				this.jInternalFrameOrderByConteosFisicos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConteosFisicos"));
				
				this.inicializarActualizarBindingTablaOrderByConteosFisicos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConteosFisicos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConteosFisicos==null) {
				
				this.jInternalFrameImportacionConteosFisicos=new ImportacionJInternalFrame(ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConteosFisicos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConteosFisicos);
				this.jInternalFrameImportacionConteosFisicos.setVisible(false);
				this.jInternalFrameImportacionConteosFisicos.setSelected(false);


				this.jInternalFrameImportacionConteosFisicos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConteosFisicos"));
				this.jInternalFrameImportacionConteosFisicos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConteosFisicos"));
				this.jInternalFrameImportacionConteosFisicos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConteosFisicos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConteosFisicos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConteosFisicos==null) {
				this.jInternalFrameReporteDinamicoConteosFisicos=new ReporteDinamicoJInternalFrame(ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConteosFisicos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConteosFisicos);
				this.jInternalFrameReporteDinamicoConteosFisicos.setVisible(false);
				this.jInternalFrameReporteDinamicoConteosFisicos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConteosFisicos"));
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConteosFisicos"));
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConteosFisicos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConteosFisicos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConteosFisicos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConteosFisicos);
			
	       	this.jInternalFrameDetalleFormConteosFisicos.setVisible(false);
	        this.jInternalFrameDetalleFormConteosFisicos.setSelected(false);
			
			//this.jInternalFrameDetalleFormConteosFisicos.dispose();
			//this.jInternalFrameDetalleFormConteosFisicos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConteosFisicos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConteosFisicos.setVisible(true);
	        this.jInternalFrameReporteDinamicoConteosFisicos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConteosFisicos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConteosFisicos.setVisible(true);
	        this.jInternalFrameImportacionConteosFisicos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConteosFisicos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConteosFisicos.setVisible(true);
	        this.jInternalFrameOrderByConteosFisicos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConteosFisicos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConteosFisicos.setVisible(false);
	        this.jInternalFrameOrderByConteosFisicos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConteosFisicos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConteosFisicos.setVisible(false);
	        this.jInternalFrameReporteDinamicoConteosFisicos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConteosFisicos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConteosFisicos.setVisible(false);
	        this.jInternalFrameImportacionConteosFisicos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConteosFisicos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConteosFisicos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConteosFisicos(true);
			//this.isEsNuevoConteosFisicos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConteosFisicos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConteosFisicos(false) ;
			
			if(conteosfisicosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConteosFisicos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConteosFisicos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConteosFisicosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConteosFisicos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConteosFisicos(true);
			//this.isEsNuevoConteosFisicos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conteosfisicos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConteosFisicos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConteosFisicos(false) ;
			
			if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConteosFisicos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConteosFisicos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConteosFisicos(false);
			
			//if(!this.isEsNuevoConteosFisicos) {								
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				
			}
			
			if(this.permiteMantenimiento(this.conteosfisicos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConteosFisicos=true;
					this.inicializarActualizarBindingTablaConteosFisicos(false);
					this.isEsNuevoConteosFisicos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConteosFisicos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConteosFisicos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConteosFisicos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConteosFisicos(false);
				
				this.habilitarDeshabilitarControlesConteosFisicos(false);
			
												
				
				if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConteosFisicos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConteosFisicosActionPerformed(evt,conteosfisicosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConteosFisicos(this.conteosfisicos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conteosfisicosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conteosfisicos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				this.conteosfisicos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				this.conteosfisicos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conteosfisicos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConteosFisicosModel) this.jTableDatosConteosFisicos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConteosFisicos=true;
				this.inicializarActualizarBindingTablaConteosFisicos(false);
				this.isEsNuevoConteosFisicos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConteosFisicos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConteosFisicos(false);
				
				this.habilitarDeshabilitarControlesConteosFisicos(false);
				
				
				
				if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConteosFisicos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConteosFisicosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConteosFisicos.getRowCount()>=1) {
				jTableDatosConteosFisicos.removeRowSelectionInterval(0, jTableDatosConteosFisicos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConteosFisicos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConteosFisicos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConteosFisicos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConteosFisicos(false) ;
			
			this.isEsNuevoConteosFisicos=false;
			
			if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConteosFisicos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConteosFisicos(false);
				
				//SI ES MANUAL
				if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConteosFisicos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConteosFisicos--;			
			//ConteosFisicos conteosfisicosAux= new ConteosFisicos();			
			//conteosfisicosAux.setId(this.iIdNuevoConteosFisicos);
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConteosFisicos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
			
			this.conteosfisicos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conteosfisicosLogic.getConteosFisicoss().add(this.conteosfisicosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conteosfisicoss.add(this.conteosfisicosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConteosFisicos(false);
			
			this.jTableDatosConteosFisicos.setRowSelectionInterval(this.getIndiceNuevoConteosFisicos(), this.getIndiceNuevoConteosFisicos());
			
			int iLastRow =  this.jTableDatosConteosFisicos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConteosFisicos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConteosFisicos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConteosFisicos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConteosFisicos(false);
			
			//SI ES MANUAL
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConteosFisicos();
			}
			
			//this.abrirFrameTreeConteosFisicos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConteosFisicos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConteosFisicos.setFileImportacion(this.jInternalFrameImportacionConteosFisicos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConteosFisicos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConteosFisicos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConteosFisicos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConteosFisicos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		

		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConteosFisicosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConteosFisicosBaseDesign.jrxml";
			
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
			
			this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConteosFisicosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadFisica_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadFisica_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadFisica_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadFisica_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_INGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_EGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_resos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_resos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_resos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_resos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_istenciaCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_istenciaCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_istenciaCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_istenciaCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConteosFisicosConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConteosFisicos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConteosFisicosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoria="cantidad_fisica";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoria="ingresos";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoria="egresos";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE:
					sNombreCampoCategoria="existencia_corte";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConteosFisicosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoriaValor="cantidad_fisica";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoriaValor="ingresos";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoriaValor="egresos";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE:
					sNombreCampoCategoriaValor="existencia_corte";
					break;

				case ConteosFisicosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConteosFisicosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Fisica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_fisica");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_INGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingresos");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Egresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"egresos");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Existencia Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"existencia_corte");
					break;

				case ConteosFisicosConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
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
	
	public void jButtonGenerarExcelReporteDinamicoConteosFisicosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConteosFisicoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConteosFisicosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getfecha_ultima_venta_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getcantidad_fisica());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_INGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_INGRESOS);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EGRESOS);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getegresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getexistencia_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConteosFisicosConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(ConteosFisicos conteosfisicos:conteosfisicossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conteosfisicos.getcosto());
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
			//	this.getFilaCabeceraExportarExcelConteosFisicos(row);				
			//	iRow++;
			//}				
			
			//for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConteosFisicos(conteosfisicosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
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
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConteosFisicos(false);
			
			//SI ES MANUAL
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConteosFisicos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConteosFisicos(false);
			
			//SI ES MANUAL
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConteosFisicos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConteosFisicosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConteosFisicos(false);
			
			//SI ES MANUAL
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConteosFisicos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConteosFisicos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConteosFisicos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConteosFisicos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConteosFisicos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConteosFisicos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConteosFisicos.setMinimumSize(dimensionMinimum);
		this.jTableDatosConteosFisicos.setMaximumSize(dimensionMaximum);
		this.jTableDatosConteosFisicos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConteosFisicos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConteosFisicos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConteosFisicos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConteosFisicos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConteosFisicos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConteosFisicos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConteosFisicos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConteosFisicos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConteosFisicos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConteosFisicos();
		
		this.inicializarActualizarBindingBotonesManualConteosFisicos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConteosFisicos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConteosFisicos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConteosFisicos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConteosFisicos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConteosFisicos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConteosFisicos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConteosFisicos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionNuevoConteosFisicos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionSinCerrarConteosFisicos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionSinMensajeConteosFisicos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConteosFisicos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConteosFisicos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConteosFisicos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
				this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionNuevoConteosFisicos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionSinCerrarConteosFisicos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConteosFisicos.jCheckBoxPostAccionSinMensajeConteosFisicos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConteosFisicos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConteosFisicos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConteosFisicos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConteosFisicos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConteosFisicos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConteosFisicos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConteosFisicos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConteosFisicos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConteosFisicos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConteosFisicos(Boolean esInicializar) throws Exception {
		try	{	
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConteosFisicos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConteosFisicos() throws Exception {
		try	{
			if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConteosFisicos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConteosFisicos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConteosFisicos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConteosFisicos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConteosFisicos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConteosFisicos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConteosFisicos.addItem(reporte);
			}
			
			
			if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConteosFisicos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConteosFisicos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConteosFisicos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConteosFisicos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConteosFisicos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConteosFisicos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConteosFisicos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConteosFisicos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConteosFisicos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
				this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
				this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
				
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConteosFisicosConstantesFunciones.getTiposSeleccionarConteosFisicos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConteosFisicosConstantesFunciones.getTiposSeleccionarConteosFisicos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConteosFisicosConstantesFunciones.getTiposSeleccionarConteosFisicos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConteosFisicos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConteosFisicos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConteosFisicos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_bodegaBusquedaConteosFisicos=((Bodega)this.jComboBoxid_bodegaBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_productoBusquedaConteosFisicos=((Producto)this.jComboBoxid_productoBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_lineaBusquedaConteosFisicos=((Linea)this.jComboBoxid_lineaBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_linea_grupoBusquedaConteosFisicos=((Linea)this.jComboBoxid_linea_grupoBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaConteosFisicos=((Linea)this.jComboBoxid_linea_categoriaBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.getSelectedItem()!=null){this.id_linea_marcaBusquedaConteosFisicos=((Linea)this.jComboBoxid_linea_marcaBusquedaConteosFisicosConteosFisicos.getSelectedItem()).getId();}
		this.fecha_ultima_venta_hastaBusquedaConteosFisicos=new Date(this.jDateChooserfecha_ultima_venta_hastaBusquedaConteosFisicosConteosFisicos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConteosFisicos(Boolean esInicializar) throws Exception {				
		if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConteosFisicos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConteosFisicos() throws Exception {
		this.inicializarActualizarBindingTablaConteosFisicos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConteosFisicos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConteosFisicosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConteosFisicos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conteosfisicosLogic.getConteosFisicoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conteosfisicoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConteosFisicos.setModel(new ConteosFisicosModel(this.conteosfisicosLogic.getConteosFisicoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConteosFisicos.setModel(new ConteosFisicosModel(this.conteosfisicoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConteosFisicos!=null && this.jInternalFrameOrderByConteosFisicos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConteosFisicos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,conteosfisicosConstantesFunciones.resaltarSeleccionarConteosFisicos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConteosFisicosConstantesFunciones.SCLASSWEBTITULO,conteosfisicosConstantesFunciones.resaltarSeleccionarConteosFisicos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_ID));

		if(this.conteosfisicosConstantesFunciones.mostraridConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltaridConteosFisicos,this.conteosfisicosConstantesFunciones.activaridConteosFisicos,iSizeTabla,this,true,"idConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltaridConteosFisicos,this.conteosfisicosConstantesFunciones.activaridConteosFisicos,this,true,"idConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_CODIGO));

		if(this.conteosfisicosConstantesFunciones.mostrarcodigoConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conteosfisicosConstantesFunciones.resaltarcodigoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcodigoConteosFisicos,iSizeTabla,this,true,"codigoConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarcodigoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcodigoConteosFisicos,this,true,"codigoConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.conteosfisicosConstantesFunciones.mostrarnombre_unidadConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conteosfisicosConstantesFunciones.resaltarnombre_unidadConteosFisicos,this.conteosfisicosConstantesFunciones.activarnombre_unidadConteosFisicos,iSizeTabla,this,true,"nombre_unidadConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarnombre_unidadConteosFisicos,this.conteosfisicosConstantesFunciones.activarnombre_unidadConteosFisicos,this,true,"nombre_unidadConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.conteosfisicosConstantesFunciones.mostrarcantidad_disponibleConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltarcantidad_disponibleConteosFisicos,this.conteosfisicosConstantesFunciones.activarcantidad_disponibleConteosFisicos,iSizeTabla,this,true,"cantidad_disponibleConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarcantidad_disponibleConteosFisicos,this.conteosfisicosConstantesFunciones.activarcantidad_disponibleConteosFisicos,this,true,"cantidad_disponibleConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA));

		if(this.conteosfisicosConstantesFunciones.mostrarcantidad_fisicaConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltarcantidad_fisicaConteosFisicos,this.conteosfisicosConstantesFunciones.activarcantidad_fisicaConteosFisicos,iSizeTabla,this,true,"cantidad_fisicaConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarcantidad_fisicaConteosFisicos,this.conteosfisicosConstantesFunciones.activarcantidad_fisicaConteosFisicos,this,true,"cantidad_fisicaConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.conteosfisicosConstantesFunciones.mostrarcodigo_productoConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conteosfisicosConstantesFunciones.resaltarcodigo_productoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcodigo_productoConteosFisicos,iSizeTabla,this,true,"codigo_productoConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarcodigo_productoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcodigo_productoConteosFisicos,this,true,"codigo_productoConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_NOMBRE));

		if(this.conteosfisicosConstantesFunciones.mostrarnombreConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conteosfisicosConstantesFunciones.resaltarnombreConteosFisicos,this.conteosfisicosConstantesFunciones.activarnombreConteosFisicos,iSizeTabla,this,true,"nombreConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarnombreConteosFisicos,this.conteosfisicosConstantesFunciones.activarnombreConteosFisicos,this,true,"nombreConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_INGRESOS));

		if(this.conteosfisicosConstantesFunciones.mostraringresosConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_INGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltaringresosConteosFisicos,this.conteosfisicosConstantesFunciones.activaringresosConteosFisicos,iSizeTabla,this,true,"ingresosConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltaringresosConteosFisicos,this.conteosfisicosConstantesFunciones.activaringresosConteosFisicos,this,true,"ingresosConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_EGRESOS));

		if(this.conteosfisicosConstantesFunciones.mostraregresosConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_EGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltaregresosConteosFisicos,this.conteosfisicosConstantesFunciones.activaregresosConteosFisicos,iSizeTabla,this,true,"egresosConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltaregresosConteosFisicos,this.conteosfisicosConstantesFunciones.activaregresosConteosFisicos,this,true,"egresosConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE));

		if(this.conteosfisicosConstantesFunciones.mostrarexistencia_corteConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltarexistencia_corteConteosFisicos,this.conteosfisicosConstantesFunciones.activarexistencia_corteConteosFisicos,iSizeTabla,this,true,"existencia_corteConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarexistencia_corteConteosFisicos,this.conteosfisicosConstantesFunciones.activarexistencia_corteConteosFisicos,this,true,"existencia_corteConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,ConteosFisicosConstantesFunciones.LABEL_COSTO));

		if(this.conteosfisicosConstantesFunciones.mostrarcostoConteosFisicos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConteosFisicosConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conteosfisicosConstantesFunciones.resaltarcostoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcostoConteosFisicos,iSizeTabla,this,true,"costoConteosFisicos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conteosfisicosConstantesFunciones.resaltarcostoConteosFisicos,this.conteosfisicosConstantesFunciones.activarcostoConteosFisicos,this,true,"costoConteosFisicos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConteosFisicosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConteosFisicos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConteosFisicos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conteosfisicosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConteosFisicos.addColumn(tableColumn);
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
			
			this.jTableDatosConteosFisicos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConteosFisicos.moveColumn(this.jTableDatosConteosFisicos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConteosFisicos.moveColumn(this.jTableDatosConteosFisicos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConteosFisicos.moveColumn(this.jTableDatosConteosFisicos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConteosFisicos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConteosFisicos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConteosFisicos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConteosFisicos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConteosFisicos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConteosFisicos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConteosFisicos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConteosFisicos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=conteosfisicosLogic.getConteosFisicoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=conteosfisicoss.size()-1;
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
		//this.jTableDatosConteosFisicos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConteosFisicos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConteosFisicos();
			
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
				
				//this.isEsNuevoConteosFisicos=false;
					
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
				if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConteosFisicos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConteosFisicos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conteosfisicos.getsType().equals("DUPLICADO")
				   || this.conteosfisicos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConteosFisicos=true;
				
				} else {
					this.isEsNuevoConteosFisicos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
					if(this.conteosfisicos.getId()>=0 && !this.conteosfisicos.getIsNew()) {						
						this.isEsNuevoConteosFisicos=false;
						
					} else {
						this.isEsNuevoConteosFisicos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConteosFisicos(esRelaciones);						
				
				this.seleccionarConteosFisicos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conteosfisicos.getId()<0) {
					this.isEsNuevoConteosFisicos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConteosFisicos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConteosFisicos(evt,rowIndex);
				}	
				
				if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConteosFisicos: " + this.dDif); 
					}
				}								
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConteosFisicos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conteosfisicos)) {
					if(this.conteosfisicos.getId()>0) {
						this.conteosfisicos.setIsDeleted(true);
						
						this.conteosfisicossEliminados.add(this.conteosfisicos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conteosfisicosLogic.getConteosFisicoss().remove(this.conteosfisicos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conteosfisicoss.remove(this.conteosfisicos);				
					}
					
					
					((ConteosFisicosModel) this.jTableDatosConteosFisicos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConteosFisicos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConteosFisicos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConteosFisicos) {
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConteosFisicos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConteosFisicos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConteosFisicos(this.conteosfisicos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConteosFisicos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConteosFisicos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConteosFisicos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConteosFisicos(ConteosFisicos conteosfisicos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConteosFisicos(conteosfisicos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConteosFisicos(ConteosFisicos conteosfisicos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConteosFisicos(conteosfisicos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConteosFisicos(conteosfisicos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConteosFisicos(conteosfisicos);
	}
	
	public void setVariablesObjetoActualToFormularioConteosFisicos(ConteosFisicos conteosfisicos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setText(conteosfisicos.getId().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setText(conteosfisicos.getcodigo());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setText(conteosfisicos.getnombre_unidad());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setText(conteosfisicos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setText(conteosfisicos.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setText(conteosfisicos.getcodigo_producto());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setText(conteosfisicos.getnombre());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setText(conteosfisicos.getingresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setText(conteosfisicos.getegresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setText(conteosfisicos.getexistencia_corte().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setText(conteosfisicos.getcosto().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConteosFisicos conteosfisicosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conteosfisicosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConteosFisicos conteosfisicosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conteosfisicosLocal=this.conteosfisicos;
			} else {
				conteosfisicosLocal=this.conteosfisicosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conteosfisicosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConteosFisicos(conteosfisicosLocal,true);
					
					if(conteosfisicosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conteosfisicosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conteosfisicosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConteosFisicos(ConteosFisicos conteosfisicos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConteosFisicos(conteosfisicos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(conteosfisicos);
	}
	
	public void setVariablesFormularioToObjetoActualConteosFisicos(ConteosFisicos conteosfisicos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConteosFisicos(conteosfisicos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConteosFisicos(ConteosFisicos conteosfisicos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.getText()==null || this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.getText()=="" || this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.getText()=="Id") {
				this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setText("0");
			}

			if(conColumnasBase) {conteosfisicos.setId(Long.parseLong(this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelIdConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setcodigo(this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigoConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setnombre_unidad(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombre_unidadConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_disponibleConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setcantidad_fisica(Integer.parseInt(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcantidad_fisicaConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setcodigo_producto(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcodigo_productoConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setnombre(this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelnombreConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setingresos(Double.parseDouble(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_INGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelingresosConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setegresos(Double.parseDouble(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_EGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelegresosConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setexistencia_corte(Double.parseDouble(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelexistencia_corteConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conteosfisicos.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConteosFisicosConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConteosFisicos.jLabelcostoConteosFisicos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConteosFisicos(ConteosFisicos conteosfisicosBean,ConteosFisicos conteosfisicos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConteosFisicos(ConteosFisicos conteosfisicosOrigen,ConteosFisicos conteosfisicos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conteosfisicosOrigen.getId()!=null && !conteosfisicosOrigen.getId().equals(0L))) {conteosfisicos.setId(conteosfisicosOrigen.getId());}}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getfecha_ultima_venta_hasta()!=null && !conteosfisicosOrigen.getfecha_ultima_venta_hasta().equals(new Date()))) {conteosfisicos.setfecha_ultima_venta_hasta(conteosfisicosOrigen.getfecha_ultima_venta_hasta());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getcodigo()!=null && !conteosfisicosOrigen.getcodigo().equals(""))) {conteosfisicos.setcodigo(conteosfisicosOrigen.getcodigo());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getnombre_unidad()!=null && !conteosfisicosOrigen.getnombre_unidad().equals(""))) {conteosfisicos.setnombre_unidad(conteosfisicosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getcantidad_disponible()!=null && !conteosfisicosOrigen.getcantidad_disponible().equals(0))) {conteosfisicos.setcantidad_disponible(conteosfisicosOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getcantidad_fisica()!=null && !conteosfisicosOrigen.getcantidad_fisica().equals(0))) {conteosfisicos.setcantidad_fisica(conteosfisicosOrigen.getcantidad_fisica());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getcodigo_producto()!=null && !conteosfisicosOrigen.getcodigo_producto().equals(""))) {conteosfisicos.setcodigo_producto(conteosfisicosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getnombre()!=null && !conteosfisicosOrigen.getnombre().equals(""))) {conteosfisicos.setnombre(conteosfisicosOrigen.getnombre());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getingresos()!=null && !conteosfisicosOrigen.getingresos().equals(0.0))) {conteosfisicos.setingresos(conteosfisicosOrigen.getingresos());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getegresos()!=null && !conteosfisicosOrigen.getegresos().equals(0.0))) {conteosfisicos.setegresos(conteosfisicosOrigen.getegresos());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getexistencia_corte()!=null && !conteosfisicosOrigen.getexistencia_corte().equals(0.0))) {conteosfisicos.setexistencia_corte(conteosfisicosOrigen.getexistencia_corte());}
			if(conDefault || (!conDefault && conteosfisicosOrigen.getcosto()!=null && !conteosfisicosOrigen.getcosto().equals(0.0))) {conteosfisicos.setcosto(conteosfisicosOrigen.getcosto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConteosFisicos(ConteosFisicos conteosfisicos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setText(conteosfisicos.getId().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setText(conteosfisicos.getcodigo());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setText(conteosfisicos.getnombre_unidad());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setText(conteosfisicos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setText(conteosfisicos.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setText(conteosfisicos.getcodigo_producto());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setText(conteosfisicos.getnombre());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setText(conteosfisicos.getingresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setText(conteosfisicos.getegresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setText(conteosfisicos.getexistencia_corte().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setText(conteosfisicos.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConteosFisicos(ConteosFisicosBean conteosfisicosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setText(conteosfisicosBean.getId().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setText(conteosfisicosBean.getcodigo());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setText(conteosfisicosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setText(conteosfisicosBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setText(conteosfisicosBean.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setText(conteosfisicosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setText(conteosfisicosBean.getnombre());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setText(conteosfisicosBean.getingresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setText(conteosfisicosBean.getegresos().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setText(conteosfisicosBean.getexistencia_corte().toString());
			this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setText(conteosfisicosBean.getcosto().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConteosFisicos(ConteosFisicosParameterReturnGeneral conteosfisicosReturnGeneral,ConteosFisicosBean conteosfisicosBean,Boolean conDefault) throws Exception { 
		try {
			ConteosFisicos conteosfisicosLocal=new ConteosFisicos();
			
			conteosfisicosLocal=conteosfisicosReturnGeneral.getConteosFisicos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conteosfisicosLocal.getId()!=null && !conteosfisicosLocal.getId().equals(0L))) {conteosfisicosBean.setId(conteosfisicosLocal.getId());}}
			if(conDefault || (!conDefault && conteosfisicosLocal.getcodigo()!=null && !conteosfisicosLocal.getcodigo().equals(""))) {conteosfisicosBean.setcodigo(conteosfisicosLocal.getcodigo());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getnombre_unidad()!=null && !conteosfisicosLocal.getnombre_unidad().equals(""))) {conteosfisicosBean.setnombre_unidad(conteosfisicosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getcantidad_disponible()!=null && !conteosfisicosLocal.getcantidad_disponible().equals(0))) {conteosfisicosBean.setcantidad_disponible(conteosfisicosLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getcantidad_fisica()!=null && !conteosfisicosLocal.getcantidad_fisica().equals(0))) {conteosfisicosBean.setcantidad_fisica(conteosfisicosLocal.getcantidad_fisica());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getcodigo_producto()!=null && !conteosfisicosLocal.getcodigo_producto().equals(""))) {conteosfisicosBean.setcodigo_producto(conteosfisicosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getnombre()!=null && !conteosfisicosLocal.getnombre().equals(""))) {conteosfisicosBean.setnombre(conteosfisicosLocal.getnombre());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getingresos()!=null && !conteosfisicosLocal.getingresos().equals(0.0))) {conteosfisicosBean.setingresos(conteosfisicosLocal.getingresos());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getegresos()!=null && !conteosfisicosLocal.getegresos().equals(0.0))) {conteosfisicosBean.setegresos(conteosfisicosLocal.getegresos());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getexistencia_corte()!=null && !conteosfisicosLocal.getexistencia_corte().equals(0.0))) {conteosfisicosBean.setexistencia_corte(conteosfisicosLocal.getexistencia_corte());}
			if(conDefault || (!conDefault && conteosfisicosLocal.getcosto()!=null && !conteosfisicosLocal.getcosto().equals(0.0))) {conteosfisicosBean.setcosto(conteosfisicosLocal.getcosto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConteosFisicosGenerico(Long idConteosFisicosSeleccionado,JComboBox jComboBoxConteosFisicos,List<ConteosFisicos> conteosfisicossLocal)throws Exception {
		try {
			ConteosFisicos  conteosfisicosTemp=null;

			for(ConteosFisicos conteosfisicosAux:conteosfisicossLocal) {
				if(conteosfisicosAux.getId()!=null && conteosfisicosAux.getId().equals(idConteosFisicosSeleccionado)) {
					conteosfisicosTemp=conteosfisicosAux;
					break;
				}
			}

			jComboBoxConteosFisicos.setSelectedItem(conteosfisicosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConteosFisicosGenerico(JComboBox jComboBoxConteosFisicos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConteosFisicos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConteosFisicos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConteosFisicos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConteosFisicos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConteosFisicos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConteosFisicos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conteosfisicos=(ConteosFisicos) conteosfisicosLogic.getConteosFisicoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conteosfisicos =(ConteosFisicos) conteosfisicoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!conteosfisicos.getIsNew() && !conteosfisicos.getIsChanged() && !conteosfisicos.getIsDeleted()) {
				sDescripcion=conteosfisicos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=conteosfisicos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConteosFisicos conteosfisicosRow=new ConteosFisicos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conteosfisicosRow=(ConteosFisicos) conteosfisicosLogic.getConteosFisicoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conteosfisicosRow=(ConteosFisicos) conteosfisicoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConteosFisicos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos));			
			this.jButtonDuplicarConteosFisicos.setVisible((this.isVisibilidadCeldaDuplicarConteosFisicos && this.isPermisoDuplicarConteosFisicos));			
			this.jButtonCopiarConteosFisicos.setVisible((this.isVisibilidadCeldaCopiarConteosFisicos && this.isPermisoCopiarConteosFisicos));
			this.jButtonVerFormConteosFisicos.setVisible((this.isVisibilidadCeldaVerFormConteosFisicos && this.isPermisoVerFormConteosFisicos));
			
			this.jButtonAbrirOrderByConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));			
			
			this.jButtonNuevoRelacionesConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoRelacionesConteosFisicos && this.isPermisoNuevoConteosFisicos));			
			this.jButtonNuevoGuardarCambiosConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarConteosFisicos.setVisible((this.isVisibilidadCeldaModificarConteosFisicos && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.setVisible((this.isVisibilidadCeldaActualizarConteosFisicos && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.setVisible((this.isVisibilidadCeldaEliminarConteosFisicos && this.isPermisoEliminarConteosFisicos));
			this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.setVisible(this.isVisibilidadCeldaCancelarConteosFisicos);							
			this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));			
			
			}
						
			this.jButtonGuardarCambiosTablaConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarCambiosConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos));						
			this.jButtonDuplicarToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaDuplicarConteosFisicos && this.isPermisoDuplicarConteosFisicos));						
			this.jButtonCopiarToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaCopiarConteosFisicos && this.isPermisoCopiarConteosFisicos));			
			this.jButtonVerFormToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaVerFormConteosFisicos && this.isPermisoVerFormConteosFisicos));			
			this.jButtonAbrirOrderByToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));
			this.jButtonNuevoRelacionesToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoRelacionesConteosFisicos && this.isPermisoNuevoConteosFisicos));			
			this.jButtonNuevoGuardarCambiosToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));			
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaModificarConteosFisicos && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaActualizarConteosFisicos  && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaEliminarConteosFisicos && this.isPermisoEliminarConteosFisicos));
			this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarToolBarConteosFisicos.setVisible(this.isVisibilidadCeldaCancelarConteosFisicos);				
			this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarCambiosConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos));			
			this.jMenuItemDuplicarConteosFisicos.setVisible((this.isVisibilidadCeldaDuplicarConteosFisicos && this.isPermisoDuplicarConteosFisicos));			
			this.jMenuItemCopiarConteosFisicos.setVisible((this.isVisibilidadCeldaCopiarConteosFisicos && this.isPermisoCopiarConteosFisicos));			
			this.jMenuItemVerFormConteosFisicos.setVisible((this.isVisibilidadCeldaVerFormConteosFisicos && this.isPermisoVerFormConteosFisicos));			
			this.jMenuItemAbrirOrderByConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));			
			//this.jMenuItemMostrarOcultarConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));
			this.jMenuItemDetalleAbrirOrderByConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));			
			//this.jMenuItemDetalleMostrarOcultarConteosFisicos.setVisible((this.isVisibilidadCeldaOrdenConteosFisicos && this.isPermisoOrdenConteosFisicos));			
			this.jMenuItemNuevoRelacionesConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoRelacionesConteosFisicos && this.isPermisoNuevoConteosFisicos));			
			this.jMenuItemNuevoGuardarCambiosConteosFisicos.setVisible((this.isVisibilidadCeldaNuevoConteosFisicos && this.isPermisoNuevoConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));									
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemModificarConteosFisicos.setVisible((this.isVisibilidadCeldaModificarConteosFisicos && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemActualizarConteosFisicos.setVisible((this.isVisibilidadCeldaActualizarConteosFisicos && this.isPermisoActualizarConteosFisicos));	
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemEliminarConteosFisicos.setVisible((this.isVisibilidadCeldaEliminarConteosFisicos && this.isPermisoEliminarConteosFisicos));
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemCancelarConteosFisicos.setVisible(this.isVisibilidadCeldaCancelarConteosFisicos);				
			}
			
			this.jMenuItemGuardarCambiosConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));						
			this.jMenuItemGuardarCambiosTablaConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarCambiosConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConteosFisicos=this.jButtonNuevoConteosFisicos.isVisible();
			this.isVisibilidadCeldaDuplicarConteosFisicos=this.jButtonDuplicarConteosFisicos.isVisible();
			this.isVisibilidadCeldaCopiarConteosFisicos=this.jButtonCopiarConteosFisicos.isVisible();
			this.isVisibilidadCeldaVerFormConteosFisicos=this.jButtonVerFormConteosFisicos.isVisible();
			
			this.isVisibilidadCeldaOrdenConteosFisicos=this.jButtonAbrirOrderByConteosFisicos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=this.jButtonNuevoRelacionesConteosFisicos.isVisible();
			this.isVisibilidadCeldaModificarConteosFisicos=this.jButtonModificarConteosFisicos.isVisible();
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.isVisibilidadCeldaActualizarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.isVisible();
			this.isVisibilidadCeldaEliminarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.isVisible();
			this.isVisibilidadCeldaCancelarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.isVisible();
			this.isVisibilidadCeldaGuardarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=this.jButtonGuardarCambiosTablaConteosFisicos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConteosFisicos=this.jButtonNuevoToolBarConteosFisicos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=this.jButtonNuevoRelacionesToolBarConteosFisicos.isVisible();
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.isVisibilidadCeldaModificarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarToolBarConteosFisicos.isVisible();
			this.isVisibilidadCeldaActualizarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarToolBarConteosFisicos.isVisible();
			this.isVisibilidadCeldaEliminarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarToolBarConteosFisicos.isVisible();
			this.isVisibilidadCeldaCancelarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarToolBarConteosFisicos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConteosFisicos=this.jButtonGuardarCambiosToolBarConteosFisicos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=this.jButtonGuardarCambiosTablaToolBarConteosFisicos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConteosFisicos=this.jMenuItemNuevoConteosFisicos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=this.jMenuItemNuevoRelacionesConteosFisicos.isVisible();
			
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.isVisibilidadCeldaModificarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jMenuItemModificarConteosFisicos.isVisible();
			this.isVisibilidadCeldaActualizarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jMenuItemActualizarConteosFisicos.isVisible();
			this.isVisibilidadCeldaEliminarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jMenuItemEliminarConteosFisicos.isVisible();
			this.isVisibilidadCeldaCancelarConteosFisicos=this.jInternalFrameDetalleFormConteosFisicos.jMenuItemCancelarConteosFisicos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConteosFisicos=this.jMenuItemGuardarCambiosConteosFisicos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=this.jMenuItemGuardarCambiosTablaConteosFisicos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConteosFisicos(Boolean esInicializar) {
		if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
				//if(this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConteosFisicos();
			}
			
			this.inicializarActualizarBindingBotonesManualConteosFisicos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConteosFisicos() {
		this.jButtonNuevoConteosFisicos.setVisible(this.isPermisoNuevoConteosFisicos);			
		this.jButtonDuplicarConteosFisicos.setVisible(this.isPermisoDuplicarConteosFisicos);			
		this.jButtonCopiarConteosFisicos.setVisible(this.isPermisoCopiarConteosFisicos);			
		this.jButtonVerFormConteosFisicos.setVisible(this.isPermisoVerFormConteosFisicos);			
		
		this.jButtonAbrirOrderByConteosFisicos.setVisible(this.isPermisoOrdenConteosFisicos);					
		
		this.jButtonNuevoRelacionesConteosFisicos.setVisible(this.isPermisoNuevoConteosFisicos);			
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarConteosFisicos.setVisible(this.isPermisoActualizarConteosFisicos);	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.setVisible(this.isPermisoActualizarConteosFisicos);	
			this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.setVisible(this.isPermisoEliminarConteosFisicos);
			this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.setVisible(this.isVisibilidadCeldaCancelarConteosFisicos);						
			this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.setVisible(this.isPermisoGuardarCambiosConteosFisicos);							
		}
		
		this.jButtonGuardarCambiosTablaConteosFisicos.setVisible(this.isPermisoActualizarConteosFisicos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConteosFisicos() {
		this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarConteosFisicos.setVisible(this.isPermisoActualizarConteosFisicos);	
		this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.setVisible(this.isPermisoActualizarConteosFisicos);	
		this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.setVisible(this.isPermisoEliminarConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.setVisible(this.isVisibilidadCeldaCancelarConteosFisicos);							
		this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.setVisible((this.isVisibilidadCeldaGuardarConteosFisicos && this.isPermisoGuardarCambiosConteosFisicos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConteosFisicos() {
		if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConteosFisicos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConteosFisicos() {
	}
	
	public void jTableDatosConteosFisicosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConteosFisicos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conteosfisicos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderConteosFisicos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.conteosfisicos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderConteosFisicos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.conteosfisicos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConteosFisicos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.conteosfisicos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderConteosFisicos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.conteosfisicos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderConteosFisicos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.conteosfisicos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderConteosFisicos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.conteosfisicos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderConteosFisicos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.conteosfisicos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaConteosFisicosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebConteosFisicos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConteosFisicos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConteosFisicos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.conteosfisicosLogic.getConnexion());

				if(this.conteosfisicos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.conteosfisicos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConteosFisicos=(TitledBorder)this.jScrollPanelDatosConteosFisicos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderConteosFisicos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.conteosfisicos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_venta_hastaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getfecha_ultima_venta_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta_hasta = '"+Funciones2.getStringPostgresDate(this.conteosfisicos.getfecha_ultima_venta_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.conteosfisicos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.conteosfisicos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.conteosfisicos.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_fisicaConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getcantidad_fisica()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_fisica = "+this.conteosfisicos.getcantidad_fisica().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.conteosfisicos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.conteosfisicos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresosConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingresos = "+this.conteosfisicos.getingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonegresosConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getegresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where egresos = "+this.conteosfisicos.getegresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonexistencia_corteConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getexistencia_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where existencia_corte = "+this.conteosfisicos.getexistencia_corte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoConteosFisicosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.getconteosfisicos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conteosfisicos==null) {
						this.conteosfisicos = new ConteosFisicos();
					}

					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);
				}

				if(this.conteosfisicos.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.conteosfisicos.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConteosFisicos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaConteosFisicosConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossBusquedaConteosFisicos();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdBodega();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdEmpresa();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdLinea();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdLineaCategoria();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdLineaGrupo();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdLineaMarca();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdProducto();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalConteosFisicosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConteosFisicos(false,false);

			this.getConteosFisicossFK_IdSucursal();

			this.inicializarActualizarBindingConteosFisicos(false);

			//if(ConteosFisicosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConteosFisicos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conteosfisicosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConteosFisicos() {
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
			this.jInternalFrameDetalleFormConteosFisicos.setVisible(false);	    			
			this.jInternalFrameDetalleFormConteosFisicos.dispose();
			this.jInternalFrameDetalleFormConteosFisicos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
			this.jInternalFrameReporteDinamicoConteosFisicos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConteosFisicos.dispose();
			this.jInternalFrameReporteDinamicoConteosFisicos=null;
		}
		
		if(this.jInternalFrameImportacionConteosFisicos!=null) {
			this.jInternalFrameImportacionConteosFisicos.setVisible(false);	    			
			this.jInternalFrameImportacionConteosFisicos.dispose();
			this.jInternalFrameImportacionConteosFisicos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConteosFisicos();
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			
			if(sTipo.equals("NuevoConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConteosFisicos")) {
				jButtonDuplicarConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConteosFisicos")) {
				jButtonCopiarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("VerFormConteosFisicos")) {
				jButtonVerFormConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConteosFisicos")) {
				jButtonDuplicarConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConteosFisicos")) {
				jButtonDuplicarConteosFisicosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConteosFisicos")) {
				jButtonModificarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConteosFisicos")) {
				jButtonModificarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConteosFisicos")) {
				jButtonModificarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConteosFisicos")) {
				jButtonActualizarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConteosFisicos")) {
				jButtonActualizarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConteosFisicos")) {
				jButtonActualizarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("EliminarConteosFisicos")) {
				jButtonEliminarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConteosFisicos")) {
				jButtonEliminarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConteosFisicos")) {
				jButtonEliminarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("CancelarConteosFisicos")) {
				jButtonCancelarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConteosFisicos")) {
				jButtonCancelarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConteosFisicos")) {
				jButtonCancelarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("CerrarConteosFisicos")) {
				jButtonCerrarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConteosFisicos")) {
				jButtonCerrarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConteosFisicos")) {
				jButtonCerrarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConteosFisicos")) {
				jButtonMostrarOcultarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConteosFisicos")) {
				jButtonCancelarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConteosFisicos")) {
				jButtonCopiarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConteosFisicos")) {
				jButtonVerFormConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConteosFisicos")) {
				jButtonCopiarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConteosFisicos")) {
				jButtonVerFormConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConteosFisicos")) {
				jButtonRecargarInformacionConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConteosFisicos")) {
				jButtonRecargarInformacionConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConteosFisicos")) {
				jButtonRecargarInformacionConteosFisicosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConteosFisicos")) {
				jButtonAnterioresConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConteosFisicos")) {
				jButtonAnterioresConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConteosFisicos")) {
				jButtonAnterioresConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConteosFisicos")) {
				jButtonSiguientesConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConteosFisicos")) {
				jButtonSiguientesConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConteosFisicos")) {
				jButtonSiguientesConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConteosFisicos") || sTipo.equals("MenuItemDetalleAbrirOrderByConteosFisicos")) {
				jButtonAbrirOrderByConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConteosFisicos") || sTipo.equals("MenuItemDetalleMostrarOcultarConteosFisicos")) {
				jButtonMostrarOcultarConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConteosFisicos")) {
				jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConteosFisicos")) {
				jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConteosFisicos")) {
				jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConteosFisicos")) {
				jButtonCerrarReporteDinamicoConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConteosFisicos")) {
				jButtonGenerarReporteDinamicoConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConteosFisicos")) {
				
				jButtonGenerarExcelReporteDinamicoConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConteosFisicos")) {
				jButtonCerrarImportacionConteosFisicosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConteosFisicos")) {
				
				jButtonGenerarImportacionConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConteosFisicos")) {
				
				jButtonAbrirImportacionConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConteosFisicos")) {
				jComboBoxTiposAccionesConteosFisicosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConteosFisicos")) {
				jComboBoxTiposRelacionesConteosFisicosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConteosFisicos")) {
				jComboBoxTiposAccionesConteosFisicosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConteosFisicos")) {
				
				jComboBoxTiposSeleccionarConteosFisicosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConteosFisicos")) {
				jTextFieldValorCampoGeneralConteosFisicosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConteosFisicos")) {
				jButtonAbrirOrderByConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConteosFisicos")) {
				jButtonAbrirOrderByConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConteosFisicos")) {
				jButtonCerrarOrderByConteosFisicosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConteosFisicosBusqueda")) {
				this.jButtonidConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaConteosFisicosUpdate")) {
				this.jButtonid_bodegaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaConteosFisicosBusqueda")) {
				this.jButtonid_bodegaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoConteosFisicosUpdate")) {
				this.jButtonid_productoConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoConteosFisicosBusqueda")) {
				this.jButtonid_productoConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConteosFisicosUpdate")) {
				this.jButtonid_empresaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConteosFisicosBusqueda")) {
				this.jButtonid_empresaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalConteosFisicosUpdate")) {
				this.jButtonid_sucursalConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalConteosFisicosBusqueda")) {
				this.jButtonid_sucursalConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConteosFisicosUpdate")) {
				this.jButtonid_lineaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConteosFisicosBusqueda")) {
				this.jButtonid_lineaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConteosFisicosUpdate")) {
				this.jButtonid_linea_grupoConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConteosFisicosBusqueda")) {
				this.jButtonid_linea_grupoConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConteosFisicosUpdate")) {
				this.jButtonid_linea_categoriaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConteosFisicosBusqueda")) {
				this.jButtonid_linea_categoriaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConteosFisicosUpdate")) {
				this.jButtonid_linea_marcaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConteosFisicosBusqueda")) {
				this.jButtonid_linea_marcaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaConteosFisicosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConteosFisicosBusqueda")) {
				this.jButtoncodigoConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConteosFisicosBusqueda")) {
				this.jButtonnombre_unidadConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleConteosFisicosBusqueda")) {
				this.jButtoncantidad_disponibleConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaConteosFisicosBusqueda")) {
				this.jButtoncantidad_fisicaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoConteosFisicosBusqueda")) {
				this.jButtoncodigo_productoConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConteosFisicosBusqueda")) {
				this.jButtonnombreConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosConteosFisicosBusqueda")) {
				this.jButtoningresosConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosConteosFisicosBusqueda")) {
				this.jButtonegresosConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("existencia_corteConteosFisicosBusqueda")) {
				this.jButtonexistencia_corteConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoConteosFisicosBusqueda")) {
				this.jButtoncostoConteosFisicosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaConteosFisicosConteosFisicos")) {
				this.jButtonBusquedaConteosFisicosConteosFisicosActionPerformed(evt);
			}
			
			;
			
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConteosFisicos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConteosFisicos conteosfisicosLocal=null;
			
			if(!this.getEsControlTabla()) {
				conteosfisicosLocal=this.conteosfisicos;
			} else {
				conteosfisicosLocal=this.conteosfisicosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
							
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
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
			
			


			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
								
						
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
								
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
							
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
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
			
			


			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
								
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConteosFisicos")) {
					jCheckBoxSeleccionarTodosConteosFisicosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConteosFisicos")) {
					jCheckBoxSeleccionadosConteosFisicosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConteosFisicos")) {
					
				}
				
				


				
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
												
				
				


				
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
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
			
			


			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConteosFisicosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conteosfisicos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conteosfisicos);
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
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
				
				


				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConteosFisicos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConteosFisicos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConteosFisicosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conteosfisicosAnterior =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConteosFisicos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConteosFisicosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConteosFisicos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conteosfisicos =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conteosfisicos =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conteosfisicos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConteosFisicos")) {
				
				}
				
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConteosFisicos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConteosFisicos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConteosFisicos")) {
			
			}
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConteosFisicos();
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			if(sTipo.equals("NuevoConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConteosFisicos")) {
				jButtonDuplicarConteosFisicosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConteosFisicos")) {
				jButtonCopiarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConteosFisicos")) {
				jButtonVerFormConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConteosFisicos")) {
				jButtonNuevoConteosFisicosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConteosFisicos")) {
				jButtonModificarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConteosFisicos")) {
				jButtonActualizarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConteosFisicos")) {
				jButtonEliminarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConteosFisicos")) {
				jButtonCancelarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConteosFisicos")) {
				jButtonCerrarConteosFisicosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConteosFisicos")) {
				jButtonGuardarCambiosConteosFisicosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConteosFisicos")) {
				jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConteosFisicos")) {
				jButtonAbrirOrderByConteosFisicosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConteosFisicos")) {
				jButtonRecargarInformacionConteosFisicosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConteosFisicos")) {
				jButtonAnterioresConteosFisicosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConteosFisicos")) {
				jButtonSiguientesConteosFisicosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConteosFisicosBusqueda")) {
				this.jButtonidConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaConteosFisicosUpdate")) {
				this.jButtonid_bodegaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaConteosFisicosBusqueda")) {
				this.jButtonid_bodegaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoConteosFisicosUpdate")) {
				this.jButtonid_productoConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoConteosFisicosBusqueda")) {
				this.jButtonid_productoConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConteosFisicosUpdate")) {
				this.jButtonid_empresaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConteosFisicosBusqueda")) {
				this.jButtonid_empresaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalConteosFisicosUpdate")) {
				this.jButtonid_sucursalConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalConteosFisicosBusqueda")) {
				this.jButtonid_sucursalConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaConteosFisicosUpdate")) {
				this.jButtonid_lineaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaConteosFisicosBusqueda")) {
				this.jButtonid_lineaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoConteosFisicosUpdate")) {
				this.jButtonid_linea_grupoConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoConteosFisicosBusqueda")) {
				this.jButtonid_linea_grupoConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaConteosFisicosUpdate")) {
				this.jButtonid_linea_categoriaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaConteosFisicosBusqueda")) {
				this.jButtonid_linea_categoriaConteosFisicosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaConteosFisicosUpdate")) {
				this.jButtonid_linea_marcaConteosFisicosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaConteosFisicosBusqueda")) {
				this.jButtonid_linea_marcaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaConteosFisicosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoConteosFisicosBusqueda")) {
				this.jButtoncodigoConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadConteosFisicosBusqueda")) {
				this.jButtonnombre_unidadConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleConteosFisicosBusqueda")) {
				this.jButtoncantidad_disponibleConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaConteosFisicosBusqueda")) {
				this.jButtoncantidad_fisicaConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoConteosFisicosBusqueda")) {
				this.jButtoncodigo_productoConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreConteosFisicosBusqueda")) {
				this.jButtonnombreConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosConteosFisicosBusqueda")) {
				this.jButtoningresosConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosConteosFisicosBusqueda")) {
				this.jButtonegresosConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("existencia_corteConteosFisicosBusqueda")) {
				this.jButtonexistencia_corteConteosFisicosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoConteosFisicosBusqueda")) {
				this.jButtoncostoConteosFisicosBusquedaActionPerformed(evt);
			}
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConteosFisicos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConteosFisicos")) {
				closingInternalFrameConteosFisicos();
				
			} else if(sTipo.equals("jButtonCancelarConteosFisicos")) {
				JInternalFrameBase jInternalFrameDetalleFormConteosFisicos = (JInternalFrameBase)evt.getSource();
	            	
	            ConteosFisicosBeanSwingJInternalFrame jInternalFrameParent=(ConteosFisicosBeanSwingJInternalFrame)jInternalFrameDetalleFormConteosFisicos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConteosFisicosActionPerformed(null);
			}
			
			ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conteosfisicos,new Object(),this.conteosfisicosParameterGeneral,this.conteosfisicosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConteosFisicos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConteosFisicos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConteosFisicos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conteosfisicos)) {
			if(!esControlTabla) {
				if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);			
				}
				
				if(this.conteosfisicosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConteosFisicos(this.conteosfisicos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConteosFisicos(this.conteosfisicosReturnGeneral,this.conteosfisicosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conteosfisicosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConteosFisicos(classes,this.conteosfisicosReturnGeneral,this.conteosfisicosBean,false);
					}
						
					if(this.conteosfisicosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos());	
					}
						
					if(this.conteosfisicosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConteosFisicos(this.conteosfisicosReturnGeneral.getConteosFisicos(),classes);//this.conteosfisicosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConteosFisicos(this.conteosfisicos,classes);//this.conteosfisicosBean);									
				}
			
				if(ConteosFisicosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConteosFisicos(this.conteosfisicos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConteosFisicos(this.conteosfisicos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conteosfisicosAnterior!=null) {
						this.conteosfisicos=this.conteosfisicosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conteosfisicosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conteosfisicosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conteosfisicosReturnGeneral.getConteosFisicos(),conteosfisicosLogic.getConteosFisicoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conteosfisicosReturnGeneral.getConteosFisicos(),this.conteosfisicoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConteosFisicos.repaint();
				
				//((AbstractTableModel) this.jTableDatosConteosFisicos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConteosFisicos();
			}
		}
	}
	
	public void actualizarVisualTableDatosConteosFisicos() throws Exception {
		
		ConteosFisicosModel conteosfisicosModel=(ConteosFisicosModel)this.jTableDatosConteosFisicos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conteosfisicosModel.conteosfisicoss=this.conteosfisicosLogic.getConteosFisicoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conteosfisicosModel.conteosfisicoss=this.conteosfisicoss;
		}
		
		
		((ConteosFisicosModel) this.jTableDatosConteosFisicos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConteosFisicos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconteosfisicosAnterior(),this.conteosfisicosLogic.getConteosFisicoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconteosfisicosAnterior(),this.conteosfisicoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConteosFisicos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConteosFisicos(ConteosFisicos conteosfisicos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
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
										
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conteosfisicos,new Object(),generalEntityParameterGeneral,this.conteosfisicosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conteosfisicosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConteosFisicosConstantesFunciones.getClassesRelationshipsOfConteosFisicos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConteosFisicosConstantesFunciones.getClassesRelationshipsFromStringsOfConteosFisicos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConteosFisicos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConteosFisicosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conteosfisicos,new Object(),generalEntityParameterGeneral,this.conteosfisicosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConteosFisicos(ConteosFisicosBean conteosfisicosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConteosFisicos(ArrayList<Classe> classes,ConteosFisicosReturnGeneral conteosfisicosReturnGeneral,ConteosFisicosBean conteosfisicosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConteosFisicos(ConteosFisicos conteosfisicos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.conteosfisicos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConteosFisicos = new ConteosFisicosDetalleFormJInternalFrame(jDesktopPane,this.conteosfisicosSessionBean.getConGuardarRelaciones(),this.conteosfisicosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.setVisible(false);
		this.jInternalFrameDetalleFormConteosFisicos.setSelected(false);						
		
		this.jInternalFrameDetalleFormConteosFisicos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConteosFisicos.conteosfisicosLogic=this.conteosfisicosLogic;
		
		this.cargarCombosFrameForeignKeyConteosFisicos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConteosFisicos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConteosFisicos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConteosFisicos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConteosFisicos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConteosFisicos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConteosFisicos"));
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarConteosFisicos.addActionListener(new ButtonActionListener(this,"ModificarConteosFisicos"));

		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"ModificarToolBarConteosFisicos"));
					
		this.jInternalFrameDetalleFormConteosFisicos.jMenuItemModificarConteosFisicos.addActionListener(new ButtonActionListener(this,"MenuItemModificarConteosFisicos"));		
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.addActionListener (new ButtonActionListener(this,"ActualizarConteosFisicos"));
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConteosFisicos"));
						
		this.jInternalFrameDetalleFormConteosFisicos.jMenuItemActualizarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConteosFisicos"));		
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.addActionListener (new ButtonActionListener(this,"EliminarConteosFisicos"));
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"EliminarToolBarConteosFisicos"));
								
		this.jInternalFrameDetalleFormConteosFisicos.jMenuItemEliminarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConteosFisicos"));		
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.addActionListener (new ButtonActionListener(this,"CancelarConteosFisicos"));
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"CancelarToolBarConteosFisicos"));
					
		this.jInternalFrameDetalleFormConteosFisicos.jMenuItemCancelarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConteosFisicos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jMenuItemDetalleCerrarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConteosFisicos"));		
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConteosFisicos"));
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConteosFisicos"));
		
		
		
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConteosFisicos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonidConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"idConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombre_unidadConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_disponibleConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_fisicaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigo_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombreConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombreConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoningresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonegresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"egresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonexistencia_corteConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"existencia_corteConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncostoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"costoConteosFisicosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConteosFisicos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConteosFisicos"));
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConteosFisicos"));
		}
		
		this.jTableDatosConteosFisicos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConteosFisicos"));
		
		this.jTableDatosConteosFisicos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConteosFisicos"));
		
		this.jButtonNuevoConteosFisicos.addActionListener(new ButtonActionListener(this,"NuevoConteosFisicos"));
		
		this.jButtonDuplicarConteosFisicos.addActionListener(new ButtonActionListener(this,"DuplicarConteosFisicos"));
		
		this.jButtonCopiarConteosFisicos.addActionListener(new ButtonActionListener(this,"CopiarConteosFisicos"));
		
		this.jButtonVerFormConteosFisicos.addActionListener(new ButtonActionListener(this,"VerFormConteosFisicos"));
		
		
		this.jButtonNuevoToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"NuevoToolBarConteosFisicos"));
			
		this.jButtonDuplicarToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConteosFisicos"));
			
		this.jMenuItemNuevoConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConteosFisicos"));
			
		this.jMenuItemDuplicarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConteosFisicos"));		
		
		
		this.jButtonNuevoRelacionesConteosFisicos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConteosFisicos"));
		
		
		this.jButtonNuevoRelacionesToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConteosFisicos"));
			
		this.jMenuItemNuevoRelacionesConteosFisicos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConteosFisicos"));		
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarConteosFisicos.addActionListener(new ButtonActionListener(this,"ModificarConteosFisicos"));
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonModificarToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"ModificarToolBarConteosFisicos"));
			
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemModificarConteosFisicos.addActionListener(new ButtonActionListener(this,"MenuItemModificarConteosFisicos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarConteosFisicos.addActionListener (new ButtonActionListener(this,"ActualizarConteosFisicos"));
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonActualizarToolBarConteosFisicos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConteosFisicos"));
				
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemActualizarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConteosFisicos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarConteosFisicos.addActionListener (new ButtonActionListener(this,"EliminarConteosFisicos"));
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonEliminarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"EliminarToolBarConteosFisicos"));
						
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemEliminarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConteosFisicos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarConteosFisicos.addActionListener (new ButtonActionListener(this,"CancelarConteosFisicos"));
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonCancelarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"CancelarToolBarConteosFisicos"));
			
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemCancelarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConteosFisicos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConteosFisicos"));		
		
		
		this.jButtonCerrarConteosFisicos.addActionListener (new ButtonActionListener(this,"CerrarConteosFisicos"));
		
		
		this.jButtonCerrarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"CerrarToolBarConteosFisicos"));
			
		this.jMenuItemCerrarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConteosFisicos"));
			
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jMenuItemDetalleCerrarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConteosFisicos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosConteosFisicos"));
		}
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConteosFisicos"));
		}
		
		this.jButtonCopiarToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"CopiarToolBarConteosFisicos"));
			
		this.jButtonVerFormToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"VerFormToolBarConteosFisicos"));
		
		this.jMenuItemGuardarCambiosConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConteosFisicos"));
			
		this.jMenuItemCopiarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConteosFisicos"));		
		
		this.jMenuItemVerFormConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConteosFisicos"));		
		
		
		this.jButtonGuardarCambiosTablaConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConteosFisicos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConteosFisicos"));
			
		this.jMenuItemGuardarCambiosTablaConteosFisicos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConteosFisicos"));		
		
		
		
		this.jButtonRecargarInformacionConteosFisicos.addActionListener (new ButtonActionListener(this,"RecargarInformacionConteosFisicos"));
					
		this.jButtonRecargarInformacionToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConteosFisicos"));
		
		this.jMenuItemRecargarInformacionConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConteosFisicos"));		
		
		
		
		this.jButtonAnterioresConteosFisicos.addActionListener (new ButtonActionListener(this,"AnterioresConteosFisicos"));
		
		
		this.jButtonAnterioresToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConteosFisicos"));
		
		this.jMenuItemAnterioresConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConteosFisicos"));		
		
		
		this.jButtonSiguientesConteosFisicos.addActionListener (new ButtonActionListener(this,"SiguientesConteosFisicos"));
		
		
		this.jButtonSiguientesToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConteosFisicos"));
			
		this.jMenuItemSiguientesConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConteosFisicos"));
			
		this.jMenuItemAbrirOrderByConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConteosFisicos"));
			
		this.jMenuItemMostrarOcultarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConteosFisicos"));
			
		this.jMenuItemDetalleAbrirOrderByConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConteosFisicos"));
			
		this.jMenuItemDetalleMostarOcultarConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConteosFisicos"));		
		
		
		this.jButtonNuevoGuardarCambiosConteosFisicos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConteosFisicos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConteosFisicos"));
			
		this.jMenuItemNuevoGuardarCambiosConteosFisicos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConteosFisicos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConteosFisicos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConteosFisicos"));

		this.jCheckBoxSeleccionadosConteosFisicos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConteosFisicos"));
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConteosFisicos"));
		}
		
		
		this.jComboBoxTiposRelacionesConteosFisicos.addActionListener (new ButtonActionListener(this,"TiposRelacionesConteosFisicos"));
			
		this.jComboBoxTiposAccionesConteosFisicos.addActionListener (new ButtonActionListener(this,"TiposAccionesConteosFisicos"));
					
		this.jComboBoxTiposSeleccionarConteosFisicos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConteosFisicos"));
			
		this.jTextFieldValorCampoGeneralConteosFisicos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConteosFisicos"));		
		
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonidConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"idConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombre_unidadConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_disponibleConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_fisicaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigo_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombreConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombreConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoningresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonegresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"egresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonexistencia_corteConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"existencia_corteConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncostoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"costoConteosFisicosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaConteosFisicosConteosFisicos.addActionListener(new ButtonActionListener(this,"BusquedaConteosFisicosConteosFisicos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConteosFisicos!=null) {
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConteosFisicos"));
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConteosFisicos"));
				this.jInternalFrameReporteDinamicoConteosFisicos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConteosFisicos"));
			}
			
			//this.jButtonCerrarReporteDinamicoConteosFisicos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConteosFisicos"));				
			//this.jButtonGenerarReporteDinamicoConteosFisicos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConteosFisicos"));
			//this.jButtonGenerarExcelReporteDinamicoConteosFisicos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConteosFisicos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConteosFisicos!=null) {
				this.jInternalFrameImportacionConteosFisicos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConteosFisicos"));
				this.jInternalFrameImportacionConteosFisicos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConteosFisicos"));
				this.jInternalFrameImportacionConteosFisicos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConteosFisicos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConteosFisicos.addActionListener (new ButtonActionListener(this,"AbrirOrderByConteosFisicos"));
			
			this.jButtonAbrirOrderByToolBarConteosFisicos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConteosFisicos"));			
			
			if(this.jInternalFrameOrderByConteosFisicos!=null) {
				this.jInternalFrameOrderByConteosFisicos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConteosFisicos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConteosFisicos.jTabbedPaneRelacionesConteosFisicos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConteosFisicos"));
		
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
            		closingInternalFrameConteosFisicos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConteosFisicos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConteosFisicos = (JInternalFrameBase)event.getSource();
	            	
	            ConteosFisicosBeanSwingJInternalFrame jInternalFrameParent=(ConteosFisicosBeanSwingJInternalFrame)jInternalFrameDetalleFormConteosFisicos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConteosFisicosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConteosFisicos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConteosFisicosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConteosFisicos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConteosFisicos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConteosFisicos";
		inputMap = this.jButtonNuevoConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConteosFisicosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConteosFisicosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConteosFisicos";
		inputMap = this.jButtonNuevoRelacionesConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConteosFisicosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConteosFisicos";
		inputMap = this.jButtonModificarConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConteosFisicos";
		inputMap = this.jButtonActualizarConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConteosFisicos";
		inputMap = this.jButtonEliminarConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConteosFisicos";
		inputMap = this.jButtonCancelarConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConteosFisicos";
		inputMap = this.jButtonCerrarConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConteosFisicos";
		inputMap = this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConteosFisicos.jButtonGuardarCambiosConteosFisicos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConteosFisicosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConteosFisicos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConteosFisicosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConteosFisicos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConteosFisicosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConteosFisicos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConteosFisicosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConteosFisicos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConteosFisicosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonidConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"idConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_bodegaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_empresaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_sucursalConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_lineaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_grupoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_categoriaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaConteosFisicosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonid_linea_marcaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonfecha_ultima_venta_hastaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombre_unidadConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_disponibleConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncantidad_fisicaConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncodigo_productoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonnombreConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"nombreConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoningresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonegresosConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"egresosConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtonexistencia_corteConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"existencia_corteConteosFisicosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConteosFisicos.jButtoncostoConteosFisicosBusqueda.addActionListener(new ButtonActionListener(this,"costoConteosFisicosBusqueda"));
		
		
		this.jButtonBusquedaConteosFisicosConteosFisicos.addActionListener(new ButtonActionListener(this,"BusquedaConteosFisicosConteosFisicos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConteosFisicos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConteosFisicosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConteosFisicosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConteosFisicos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConteosFisicos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
					conteosfisicosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConteosFisicos conteosfisicosAux:conteosfisicoss) {
					conteosfisicosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConteosFisicosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
						conteosfisicosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConteosFisicos conteosfisicosAux:conteosfisicoss) {
						conteosfisicosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConteosFisicos conteosfisicosAux:conteosfisicoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConteosFisicos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConteosFisicos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConteosFisicos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConteosFisicosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConteosFisicos.getSelectedRows();
			
			ConteosFisicos conteosfisicosLocal=new ConteosFisicos();
			
			//this.seleccionarTodosConteosFisicos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conteosfisicosLocal =(ConteosFisicos) this.conteosfisicosLogic.getConteosFisicoss().toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conteosfisicosLocal =(ConteosFisicos) this.conteosfisicoss.toArray()[this.jTableDatosConteosFisicos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conteosfisicosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
						conteosfisicosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConteosFisicos conteosfisicosAux:conteosfisicoss) {
						conteosfisicosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConteosFisicos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConteosFisicos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConteosFisicos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConteosFisicos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConteosFisicosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConteosFisicosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConteosFisicosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConteosFisicos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConteosFisicos conteosfisicosAux:this.conteosfisicosLogic.getConteosFisicoss()) {
				
						if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							conteosfisicosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							conteosfisicosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							conteosfisicosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							conteosfisicosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							conteosfisicosAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							conteosfisicosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							conteosfisicosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							conteosfisicosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							conteosfisicosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE)) {
							existe=true;
							conteosfisicosAux.setexistencia_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							conteosfisicosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConteosFisicos conteosfisicosAux:conteosfisicoss) {
					
						if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							conteosfisicosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							conteosfisicosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							conteosfisicosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							conteosfisicosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							conteosfisicosAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							conteosfisicosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							conteosfisicosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							conteosfisicosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							conteosfisicosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE)) {
							existe=true;
							conteosfisicosAux.setexistencia_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							conteosfisicosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConteosFisicos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConteosFisicosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConteosFisicos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConteosFisicos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConteosFisicos) {				
					conSplash=true;//false;										
					
					//this.startProcessConteosFisicos(conSplash);
				
					this.generarReporteConteosFisicossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConteosFisicossSeleccionados();
				//this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConteosFisicossSeleccionados(false);
				//this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConteosFisicossSeleccionados(true);
				//this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConteosFisicos();
				
				this.exportarConteosFisicossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConteosFisicoss();
				//this.importarConteosFisicoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConteosFisicos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConteosFisicossSeleccionados();
				//this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conteos Fisicos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConteosFisicos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConteosFisicos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConteosFisicos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
				}	
			} 			
			else if(ConteosFisicosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConteosFisicos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConteosFisicos(conSplash);
					
						//this.actualizarParametrosGeneralConteosFisicos();
						
						this.generarReporteProcesoAccionConteosFisicossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConteosFisicosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Conteos FisicosES SELECCIONADOS?", "MANTENIMIENTO DE Conteos Fisicos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConteosFisicos();
				
						this.actualizarParametrosGeneralConteosFisicos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conteosfisicosReturnGeneral=conteosfisicosLogic.procesarAccionConteosFisicossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conteosfisicosLogic.getConteosFisicoss(),this.conteosfisicosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConteosFisicosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConteosFisicos();
					
					ConteosFisicosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConteosFisicosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConteosFisicos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConteosFisicos.jComboBoxTiposAccionesFormularioConteosFisicos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConteosFisicos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConteosFisicosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConteosFisicos();
			
			if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
			ConteosFisicos conteosfisicos=new ConteosFisicos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConteosFisicos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConteosFisicos.getSelectedItem();
			
			
			
			
			conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
			//this.sTipoAccion;
			
			if(conteosfisicossSeleccionados.size()==1) {
				for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
					conteosfisicos=conteosfisicosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConteosFisicos();
			
      		//this.finishProcessConteosFisicos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConteosFisicosReturnGeneral() throws Exception {
		if(this.conteosfisicosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conteosfisicosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conteosfisicosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conteosfisicosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conteosfisicosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conteosfisicosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConteosFisicos(false);
		}
		
		if(this.conteosfisicosReturnGeneral.getConRetornoLista() || this.conteosfisicosReturnGeneral.getConRetornoObjeto()) {
			if(this.conteosfisicosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conteosfisicosLogic.setConteosFisicoss(this.conteosfisicosReturnGeneral.getConteosFisicoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingConteosFisicos(false);
		}
	}
	
	public void actualizarParametrosGeneralConteosFisicos() throws Exception {
		
		
	}
	
	public ArrayList<ConteosFisicos> getConteosFisicossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConteosFisicos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConteosFisicos conteosfisicosAux:conteosfisicosLogic.getConteosFisicoss()) {
					if(conteosfisicosAux.getIsSelected()) {
						conteosfisicossSeleccionados.add(conteosfisicosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConteosFisicos conteosfisicosAux:this.conteosfisicoss) {
					if(conteosfisicosAux.getIsSelected()) {
						conteosfisicossSeleccionados.add(conteosfisicosAux);				
					}
				}
			}
			
			if(conteosfisicossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conteosfisicossSeleccionados.addAll(this.conteosfisicosLogic.getConteosFisicoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conteosfisicossSeleccionados.addAll(this.conteosfisicoss);				
					}
				}
			}
		} else {
			conteosfisicossSeleccionados.add(this.conteosfisicos);
		}
		
		return conteosfisicossSeleccionados;
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
	
	public void generarReporteConteosFisicossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConteosFisicossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConteosFisicossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConteosFisicossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConteosFisicossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conteos Fisicos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados);
		
	}	
	
	public void generarReporteNormalConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConteosFisicossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConteosFisicos();
		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConteosFisicos();
		
		
		//this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados ,conteosfisicosImplementable,conteosfisicosImplementableHome);
	}
	
	public void mostrarImportacionConteosFisicoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConteosFisicos();
		
		this.abrirFrameImportacionConteosFisicos();		
		
			
		//this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados ,conteosfisicosImplementable,conteosfisicosImplementableHome);
	}
	
	public void importarConteosFisicoss() throws Exception {		
	
	}
	
	public void exportarConteosFisicossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConteosFisicossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConteosFisicossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConteosFisicossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conteos Fisicos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConteosFisicos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConteosFisicos(conteosfisicosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conteosfisicosAux.setsDetalleGeneralEntityReporte(conteosfisicosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConteosFisicos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_INGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_EGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConteosFisicosConstantesFunciones.LABEL_COSTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConteosFisicos(ConteosFisicos conteosfisicos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conteosfisicos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getfecha_ultima_venta_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getcantidad_fisica().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getegresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getexistencia_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conteosfisicos.getcosto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConteosFisicoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConteosFisicos(row);				
				iRow++;
			}				
			
			for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConteosFisicos(conteosfisicosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConteosFisicossSeleccionados() throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();		
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conteosfisicos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conteosfisicoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conteosfisicos");
			//elementRoot.appendChild(element);
		
			for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
				element = document.createElement("conteosfisicos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConteosFisicos(conteosfisicosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conteos Fisicos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConteosFisicos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_INGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_EXISTENCIACORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConteosFisicosConstantesFunciones.LABEL_COSTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConteosFisicos(ConteosFisicos conteosfisicos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getfecha_ultima_venta_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getcantidad_fisica());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getegresos());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getexistencia_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(conteosfisicos.getcosto());				
	}
	
	public void setFilaDatosExportarXmlConteosFisicos(ConteosFisicos conteosfisicos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConteosFisicosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(conteosfisicos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConteosFisicosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conteosfisicos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(conteosfisicos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(conteosfisicos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(conteosfisicos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(conteosfisicos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(conteosfisicos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(conteosfisicos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(conteosfisicos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ConteosFisicosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(conteosfisicos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_ultima_venta_hasta = document.createElement(ConteosFisicosConstantesFunciones.FECHAULTIMAVENTAHASTA);
		elementfecha_ultima_venta_hasta.appendChild(document.createTextNode(conteosfisicos.getfecha_ultima_venta_hasta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta_hasta);

		Element elementcodigo = document.createElement(ConteosFisicosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(conteosfisicos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_unidad = document.createElement(ConteosFisicosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(conteosfisicos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(ConteosFisicosConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(conteosfisicos.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementcantidad_fisica = document.createElement(ConteosFisicosConstantesFunciones.CANTIDADFISICA);
		elementcantidad_fisica.appendChild(document.createTextNode(conteosfisicos.getcantidad_fisica().toString().trim()));
		element.appendChild(elementcantidad_fisica);

		Element elementcodigo_producto = document.createElement(ConteosFisicosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(conteosfisicos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre = document.createElement(ConteosFisicosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(conteosfisicos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementingresos = document.createElement(ConteosFisicosConstantesFunciones.INGRESOS);
		elementingresos.appendChild(document.createTextNode(conteosfisicos.getingresos().toString().trim()));
		element.appendChild(elementingresos);

		Element elementegresos = document.createElement(ConteosFisicosConstantesFunciones.EGRESOS);
		elementegresos.appendChild(document.createTextNode(conteosfisicos.getegresos().toString().trim()));
		element.appendChild(elementegresos);

		Element elementexistencia_corte = document.createElement(ConteosFisicosConstantesFunciones.EXISTENCIACORTE);
		elementexistencia_corte.appendChild(document.createTextNode(conteosfisicos.getexistencia_corte().toString().trim()));
		element.appendChild(elementexistencia_corte);

		Element elementcosto = document.createElement(ConteosFisicosConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(conteosfisicos.getcosto().toString().trim()));
		element.appendChild(elementcosto);
	}
	
	public void generarReporteGroupGenericoConteosFisicossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConteosFisicos> conteosfisicossSeleccionados=new ArrayList<ConteosFisicos>();
		
		conteosfisicossSeleccionados=this.getConteosFisicossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConteosFisicos(conteosfisicossSeleccionados);
		
		this.generarReporteConteosFisicoss("Todos",conteosfisicossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConteosFisicos(ArrayList<ConteosFisicos> conteosfisicossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConteosFisicos conteosfisicosAux:conteosfisicossSeleccionados) {
				conteosfisicosAux.setsDetalleGeneralEntityReporte(conteosfisicosAux.toString());
			
				if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(conteosfisicosAux.getfecha_ultima_venta_hasta()));
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CANTIDADFISICA)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getcantidad_fisica().toString());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ConteosFisicosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					conteosfisicosAux.setsDescripcionGeneralEntityReporte1(conteosfisicosAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConteosFisicosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConteosFisicos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConteosFisicos=true;
				this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=true;
				this.isVisibilidadCeldaGuardarCambiosConteosFisicos=true;
			}
			
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=true;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=true;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=true;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=true;
			this.isVisibilidadCeldaEliminarConteosFisicos=true;
			this.isVisibilidadCeldaCancelarConteosFisicos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=true;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=true;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConteosFisicos=true;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=true;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=true;
			this.isVisibilidadCeldaModificarConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=true;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
			this.isVisibilidadCeldaModificarConteosFisicos=true;
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
			this.isVisibilidadCeldaCancelarConteosFisicos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				} else {
					this.isVisibilidadCeldaGuardarConteosFisicos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConteosFisicosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConteosFisicos=true;
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=true;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=true;
		} else {
			this.actualizarEstadoPanelsConteosFisicos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConteosFisicos=false;
			//this.isVisibilidadCeldaVerFormConteosFisicos=false;
			this.isVisibilidadCeldaDuplicarConteosFisicos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conteosfisicosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
		} else {
			this.isVisibilidadCeldaNuevoConteosFisicos=false;
			this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			if(!conteosfisicosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;												
			}
			
			this.jButtonCerrarConteosFisicos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
		}
		
		if(!this.permiteMantenimiento(this.conteosfisicos)) {
			this.isVisibilidadCeldaActualizarConteosFisicos=false;
			this.isVisibilidadCeldaEliminarConteosFisicos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoConteosFisicos=false;
		this.isVisibilidadCeldaNuevoRelacionesConteosFisicos=false;
		this.isVisibilidadCeldaGuardarCambiosConteosFisicos=false;
		//this.isVisibilidadCeldaModificarConteosFisicos=true;
		this.isVisibilidadCeldaActualizarConteosFisicos=false;
		this.isVisibilidadCeldaEliminarConteosFisicos=false;
		//this.isVisibilidadCeldaCancelarConteosFisicos=true;			
		this.isVisibilidadCeldaGuardarConteosFisicos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConteosFisicos() {
	}
	
	public void actualizarEstadoPanelsConteosFisicos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConteosFisicos!=null) {
				this.jScrollPanelDatosEdicionConteosFisicos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConteosFisicos!=null) {
				this.jScrollPanelDatosConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelPaginacionConteosFisicos!=null) {
				this.jPanelPaginacionConteosFisicos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
					this.jTabbedPaneBusquedasConteosFisicos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conteosfisicosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConteosFisicos!=null) {
				this.jTabbedPaneBusquedasConteosFisicos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConteosFisicos!=null) {
				this.jPanelParametrosReportesConteosFisicos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaConteosFisicos=isParaBodega;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaConteosFisicos=isParaProducto;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaConteosFisicos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaConteosFisicos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaConteosFisicos=isParaLinea;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaConteosFisicos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaConteosFisicos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaConteosFisicos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaConteosFisicos) {this.jTabbedPaneBusquedasConteosFisicos.remove(jPanelBusquedaConteosFisicosConteosFisicos);}
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
			
			this.inicializarActualizarBindingTablaConteosFisicos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConteosFisicos() {
		this.updateBorderResaltarBusquedasFormularioConteosFisicos();
		this.updateVisibilidadBusquedasFormularioConteosFisicos();
		this.updateHabilitarBusquedasFormularioConteosFisicos();
	}
	
	public void updateBorderResaltarBusquedasFormularioConteosFisicos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConteosFisicos.getComponents().length>0) {
	

		if(this.conteosfisicosConstantesFunciones.resaltarBusquedaConteosFisicosConteosFisicos!=null) {
			index= this.jTabbedPaneBusquedasConteosFisicos.indexOfComponent(this.jPanelBusquedaConteosFisicosConteosFisicos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConteosFisicos.getComponent(index);
				jPanel.setBorder(this.conteosfisicosConstantesFunciones.resaltarBusquedaConteosFisicosConteosFisicos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConteosFisicos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConteosFisicos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConteosFisicos.indexOfComponent(this.jPanelBusquedaConteosFisicosConteosFisicos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConteosFisicos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conteosfisicosConstantesFunciones.mostrarBusquedaConteosFisicosConteosFisicos);
			if(!this.conteosfisicosConstantesFunciones.mostrarBusquedaConteosFisicosConteosFisicos && index>-1) {
				this.jTabbedPaneBusquedasConteosFisicos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConteosFisicos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConteosFisicos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConteosFisicos.indexOfComponent(this.jPanelBusquedaConteosFisicosConteosFisicos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConteosFisicos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conteosfisicosConstantesFunciones.activarBusquedaConteosFisicosConteosFisicos);
				this.jTabbedPaneBusquedasConteosFisicos.setEnabledAt(index,this.conteosfisicosConstantesFunciones.activarBusquedaConteosFisicosConteosFisicos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConteosFisicos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaConteosFisicos")) {
			index= this.jTabbedPaneBusquedasConteosFisicos.indexOfComponent(this.jPanelBusquedaConteosFisicosConteosFisicos);

			this.jTabbedPaneBusquedasConteosFisicos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConteosFisicos.getComponent(index);

			this.conteosfisicosConstantesFunciones.setResaltarBusquedaConteosFisicosConteosFisicos(resaltar);

			jPanel.setBorder(this.conteosfisicosConstantesFunciones.resaltarBusquedaConteosFisicosConteosFisicos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConteosFisicos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConteosFisicos() throws Exception {

		if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConteosFisicos();
		this.updateVisibilidadResaltarControlesFormularioConteosFisicos();
		this.updateHabilitarResaltarControlesFormularioConteosFisicos();
		
	}
	
	public void updateBorderResaltarControlesFormularioConteosFisicos() throws Exception {
		if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conteosfisicosConstantesFunciones.resaltaridConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltaridConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_bodegaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_bodegaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_productoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_productoConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_empresaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_empresaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_sucursalConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_sucursalConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_lineaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_lineaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_linea_grupoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_linea_grupoConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_linea_categoriaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_linea_categoriaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarid_linea_marcaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarid_linea_marcaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarfecha_ultima_venta_hastaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jDateChooserfecha_ultima_venta_hastaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarfecha_ultima_venta_hastaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarcodigoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarcodigoConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarnombre_unidadConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarnombre_unidadConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarcantidad_disponibleConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarcantidad_disponibleConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarcantidad_fisicaConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarcantidad_fisicaConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarcodigo_productoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarcodigo_productoConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarnombreConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarnombreConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltaringresosConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltaringresosConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltaregresosConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltaregresosConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarexistencia_corteConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarexistencia_corteConteosFisicos);}
		if(this.conteosfisicosConstantesFunciones.resaltarcostoConteosFisicos!=null && this.jInternalFrameDetalleFormConteosFisicos!=null) {this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setBorder(this.conteosfisicosConstantesFunciones.resaltarcostoConteosFisicos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConteosFisicos() throws Exception {		
		if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
	
		//this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraridConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelidConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraridConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_bodegaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_bodegaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_bodegaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_productoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_productoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_productoConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_empresaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_empresaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_empresaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_sucursalConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_sucursalConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_sucursalConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_lineaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_lineaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_lineaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_grupoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_linea_grupoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_grupoConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_categoriaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_linea_categoriaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_categoriaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_marcaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelid_linea_marcaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarid_linea_marcaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jDateChooserfecha_ultima_venta_hastaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarfecha_ultima_venta_hastaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelfecha_ultima_venta_hastaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarfecha_ultima_venta_hastaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcodigoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelcodigoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcodigoConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarnombre_unidadConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelnombre_unidadConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarnombre_unidadConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcantidad_disponibleConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelcantidad_disponibleConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcantidad_disponibleConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcantidad_fisicaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelcantidad_fisicaConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcantidad_fisicaConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcodigo_productoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelcodigo_productoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcodigo_productoConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarnombreConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelnombreConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarnombreConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraringresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelingresosConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraringresosConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraregresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelegresosConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostraregresosConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarexistencia_corteConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelexistencia_corteConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarexistencia_corteConteosFisicos);
		//this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcostoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jPanelcostoConteosFisicos.setVisible(this.conteosfisicosConstantesFunciones.mostrarcostoConteosFisicos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConteosFisicos() throws Exception {
		if(this.jInternalFrameDetalleFormConteosFisicos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConteosFisicos!=null) {
	
		this.jInternalFrameDetalleFormConteosFisicos.jLabelidConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activaridConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_bodegaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_bodegaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_productoConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_productoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_empresaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_empresaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_sucursalConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_sucursalConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_lineaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_lineaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_grupoConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_linea_grupoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_categoriaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_linea_categoriaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jComboBoxid_linea_marcaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarid_linea_marcaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jDateChooserfecha_ultima_venta_hastaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarfecha_ultima_venta_hastaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextAreacodigoConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarcodigoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldnombre_unidadConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarnombre_unidadConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_disponibleConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarcantidad_disponibleConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcantidad_fisicaConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarcantidad_fisicaConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcodigo_productoConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarcodigo_productoConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextAreanombreConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarnombreConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldingresosConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activaringresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldegresosConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activaregresosConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldexistencia_corteConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarexistencia_corteConteosFisicos);
		this.jInternalFrameDetalleFormConteosFisicos.jTextFieldcostoConteosFisicos.setEnabled(this.conteosfisicosConstantesFunciones.activarcostoConteosFisicos);
		}
	}
	
		
}