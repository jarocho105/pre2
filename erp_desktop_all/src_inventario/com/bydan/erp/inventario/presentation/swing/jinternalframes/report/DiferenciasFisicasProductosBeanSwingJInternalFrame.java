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

//import com.bydan.erp.inventario.util.DiferenciasFisicasProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.DiferenciasFisicasProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.DiferenciasFisicasProductosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.DiferenciasFisicasProductosBean;
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
public class DiferenciasFisicasProductosBeanSwingJInternalFrame extends DiferenciasFisicasProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DiferenciasFisicasProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DiferenciasFisicasProductos> diferenciasfisicasproductosValidator = new ClassValidator<DiferenciasFisicasProductos>(DiferenciasFisicasProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DiferenciasFisicasProductos diferenciasfisicasproductos;	
	public DiferenciasFisicasProductos diferenciasfisicasproductosAux;
	public DiferenciasFisicasProductos diferenciasfisicasproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DiferenciasFisicasProductos diferenciasfisicasproductosTotales;
	public Long idDiferenciasFisicasProductosActual;
	public Long iIdNuevoDiferenciasFisicasProductos=0L;
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
	
	public Boolean isPermisoTodoDiferenciasFisicasProductos;
	public Boolean isPermisoNuevoDiferenciasFisicasProductos;
	public Boolean isPermisoActualizarDiferenciasFisicasProductos;
	public Boolean isPermisoActualizarOriginalDiferenciasFisicasProductos;
	public Boolean isPermisoEliminarDiferenciasFisicasProductos;
	public Boolean isPermisoGuardarCambiosDiferenciasFisicasProductos;
	public Boolean isPermisoConsultaDiferenciasFisicasProductos;
	public Boolean isPermisoBusquedaDiferenciasFisicasProductos;
	public Boolean isPermisoReporteDiferenciasFisicasProductos;
	public Boolean isPermisoPaginacionMedioDiferenciasFisicasProductos;
	public Boolean isPermisoPaginacionAltoDiferenciasFisicasProductos;
	public Boolean isPermisoPaginacionTodoDiferenciasFisicasProductos;
	public Boolean isPermisoCopiarDiferenciasFisicasProductos;
	public Boolean isPermisoVerFormDiferenciasFisicasProductos;
	public Boolean isPermisoDuplicarDiferenciasFisicasProductos;
	public Boolean isPermisoOrdenDiferenciasFisicasProductos;
	
	
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
	
	public DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosReturnGeneral;
	public DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDiferenciasFisicasProductos=false;
	public Boolean esParaAccionDesdeFormularioDiferenciasFisicasProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DiferenciasFisicasProductosSessionBeanAdditional diferenciasfisicasproductosSessionBeanAdditional=null;
	
	public DiferenciasFisicasProductosSessionBeanAdditional getDiferenciasFisicasProductosSessionBeanAdditional() {
		return this.diferenciasfisicasproductosSessionBeanAdditional;
	}
	
	public void setDiferenciasFisicasProductosSessionBeanAdditional(DiferenciasFisicasProductosSessionBeanAdditional diferenciasfisicasproductosSessionBeanAdditional) {
		try {
			this.diferenciasfisicasproductosSessionBeanAdditional=diferenciasfisicasproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional diferenciasfisicasproductosBeanSwingJInternalFrameAdditional=null;
	//public class DiferenciasFisicasProductosBeanSwingJInternalFrame
	
	public DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional getDiferenciasFisicasProductosBeanSwingJInternalFrameAdditional() {
		return this.diferenciasfisicasproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setDiferenciasFisicasProductosBeanSwingJInternalFrameAdditional(DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional diferenciasfisicasproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.diferenciasfisicasproductosBeanSwingJInternalFrameAdditional=diferenciasfisicasproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DiferenciasFisicasProductosLogic diferenciasfisicasproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DiferenciasFisicasProductos diferenciasfisicasproductosBean;
	public DiferenciasFisicasProductosConstantesFunciones diferenciasfisicasproductosConstantesFunciones;
	//public DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosReturnGeneral;
	
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
	
	
	//public List<DiferenciasFisicasProductos> diferenciasfisicasproductoss;	
	//public List<DiferenciasFisicasProductos> diferenciasfisicasproductossEliminados;
	//public List<DiferenciasFisicasProductos> diferenciasfisicasproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaDuplicarDiferenciasFisicasProductos=true;
	public Boolean isVisibilidadCeldaCopiarDiferenciasFisicasProductos=true;
	public Boolean isVisibilidadCeldaVerFormDiferenciasFisicasProductos=true;
	public Boolean isVisibilidadCeldaOrdenDiferenciasFisicasProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaCancelarDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaDiferenciasFisicasProductos=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDiferenciasFisicasProductos() {
		return this.iIdNuevoDiferenciasFisicasProductos;
	}

	public void setiIdNuevoDiferenciasFisicasProductos(Long iIdNuevoDiferenciasFisicasProductos) {
		this.iIdNuevoDiferenciasFisicasProductos = iIdNuevoDiferenciasFisicasProductos;
	}
	
	public Long getidDiferenciasFisicasProductosActual() {
		return this.idDiferenciasFisicasProductosActual;
	}

	public void setidDiferenciasFisicasProductosActual(Long idDiferenciasFisicasProductosActual) {
		this.idDiferenciasFisicasProductosActual = idDiferenciasFisicasProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DiferenciasFisicasProductos getdiferenciasfisicasproductos() {
		return this.diferenciasfisicasproductos;
	}

	public void setdiferenciasfisicasproductos(DiferenciasFisicasProductos diferenciasfisicasproductos) {
		this.diferenciasfisicasproductos = diferenciasfisicasproductos;
	}
	
	public DiferenciasFisicasProductos getdiferenciasfisicasproductosAux() {
		return this.diferenciasfisicasproductosAux;
	}

	public void setdiferenciasfisicasproductosAux(DiferenciasFisicasProductos diferenciasfisicasproductosAux) {
		this.diferenciasfisicasproductosAux = diferenciasfisicasproductosAux;
	}				
	
	public DiferenciasFisicasProductos getdiferenciasfisicasproductosAnterior() {
		return this.diferenciasfisicasproductosAnterior;
	}

	public void setdiferenciasfisicasproductosAnterior(DiferenciasFisicasProductos diferenciasfisicasproductosAnterior) {
		this.diferenciasfisicasproductosAnterior = diferenciasfisicasproductosAnterior;
	}	
	
	public DiferenciasFisicasProductos getdiferenciasfisicasproductosTotales() {
		return this.diferenciasfisicasproductosTotales;
	}

	public void setdiferenciasfisicasproductosTotales(DiferenciasFisicasProductos diferenciasfisicasproductosTotales) {
		this.diferenciasfisicasproductosTotales = diferenciasfisicasproductosTotales;
	}	
	
	public DiferenciasFisicasProductos getdiferenciasfisicasproductosBean() {
		return this.diferenciasfisicasproductosBean;
	}

	public void setdiferenciasfisicasproductosBean(DiferenciasFisicasProductos diferenciasfisicasproductosBean) {
		this.diferenciasfisicasproductosBean = diferenciasfisicasproductosBean;
	}	
	
	public DiferenciasFisicasProductosParameterReturnGeneral getdiferenciasfisicasproductosReturnGeneral() {
		return this.diferenciasfisicasproductosReturnGeneral;
	}

	public void setdiferenciasfisicasproductosReturnGeneral(DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosReturnGeneral) {
		this.diferenciasfisicasproductosReturnGeneral = diferenciasfisicasproductosReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_bodegaBusquedaDiferenciasFisicasProductos() {
		return this.id_bodegaBusquedaDiferenciasFisicasProductos;
	}

	public void setid_bodegaBusquedaDiferenciasFisicasProductos(Long id_bodegaBusquedaDiferenciasFisicasProductos) {
		this.id_bodegaBusquedaDiferenciasFisicasProductos = id_bodegaBusquedaDiferenciasFisicasProductos;
	}

;
	public Long id_productoBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_productoBusquedaDiferenciasFisicasProductos() {
		return this.id_productoBusquedaDiferenciasFisicasProductos;
	}

	public void setid_productoBusquedaDiferenciasFisicasProductos(Long id_productoBusquedaDiferenciasFisicasProductos) {
		this.id_productoBusquedaDiferenciasFisicasProductos = id_productoBusquedaDiferenciasFisicasProductos;
	}

;
	public Long id_lineaBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_lineaBusquedaDiferenciasFisicasProductos() {
		return this.id_lineaBusquedaDiferenciasFisicasProductos;
	}

	public void setid_lineaBusquedaDiferenciasFisicasProductos(Long id_lineaBusquedaDiferenciasFisicasProductos) {
		this.id_lineaBusquedaDiferenciasFisicasProductos = id_lineaBusquedaDiferenciasFisicasProductos;
	}

;
	public Long id_linea_grupoBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_linea_grupoBusquedaDiferenciasFisicasProductos() {
		return this.id_linea_grupoBusquedaDiferenciasFisicasProductos;
	}

	public void setid_linea_grupoBusquedaDiferenciasFisicasProductos(Long id_linea_grupoBusquedaDiferenciasFisicasProductos) {
		this.id_linea_grupoBusquedaDiferenciasFisicasProductos = id_linea_grupoBusquedaDiferenciasFisicasProductos;
	}

;
	public Long id_linea_categoriaBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_linea_categoriaBusquedaDiferenciasFisicasProductos() {
		return this.id_linea_categoriaBusquedaDiferenciasFisicasProductos;
	}

	public void setid_linea_categoriaBusquedaDiferenciasFisicasProductos(Long id_linea_categoriaBusquedaDiferenciasFisicasProductos) {
		this.id_linea_categoriaBusquedaDiferenciasFisicasProductos = id_linea_categoriaBusquedaDiferenciasFisicasProductos;
	}

;
	public Long id_linea_marcaBusquedaDiferenciasFisicasProductos=-1L;

	public Long getid_linea_marcaBusquedaDiferenciasFisicasProductos() {
		return this.id_linea_marcaBusquedaDiferenciasFisicasProductos;
	}

	public void setid_linea_marcaBusquedaDiferenciasFisicasProductos(Long id_linea_marcaBusquedaDiferenciasFisicasProductos) {
		this.id_linea_marcaBusquedaDiferenciasFisicasProductos = id_linea_marcaBusquedaDiferenciasFisicasProductos;
	}

;
	public Date fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos=new Date();

	public Date getfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos() {
		return this.fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos;
	}

	public void setfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos(Date fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos) {
		this.fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos = fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos;
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
	
	
	public DiferenciasFisicasProductosLogic getDiferenciasFisicasProductosLogic()	{		
		return diferenciasfisicasproductosLogic;
	}

	public void setDiferenciasFisicasProductosLogic(DiferenciasFisicasProductosLogic diferenciasfisicasproductosLogic) {
		this.diferenciasfisicasproductosLogic = diferenciasfisicasproductosLogic;
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
	
	public Boolean getIsEsNuevoDiferenciasFisicasProductos() {
		return isEsNuevoDiferenciasFisicasProductos;
	}

	public void setIsEsNuevoDiferenciasFisicasProductos(Boolean isEsNuevoDiferenciasFisicasProductos) {
		this.isEsNuevoDiferenciasFisicasProductos = isEsNuevoDiferenciasFisicasProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioDiferenciasFisicasProductos() {
		return esParaAccionDesdeFormularioDiferenciasFisicasProductos;
	}
	
	public void setEsParaAccionDesdeFormularioDiferenciasFisicasProductos(Boolean esParaAccionDesdeFormularioDiferenciasFisicasProductos) {
		this.esParaAccionDesdeFormularioDiferenciasFisicasProductos = esParaAccionDesdeFormularioDiferenciasFisicasProductos;
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidBodegaActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidProductoActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidEmpresaActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidSucursalActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidLineaActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidLineaGrupoActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidLineaCategoriaActual());
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

			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(diferenciasfisicasproductosSessionBean.getlidLineaMarcaActual());
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_bodegaDiferenciasFisicasProductosGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDiferenciasFisicasProductosGenerico!=null && jComboBoxid_bodegaDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDiferenciasFisicasProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_productoDiferenciasFisicasProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDiferenciasFisicasProductosGenerico!=null && jComboBoxid_productoDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_empresaDiferenciasFisicasProductosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDiferenciasFisicasProductosGenerico!=null && jComboBoxid_empresaDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_empresaDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_sucursalDiferenciasFisicasProductosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDiferenciasFisicasProductosGenerico!=null && jComboBoxid_sucursalDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_lineaDiferenciasFisicasProductosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaDiferenciasFisicasProductosGenerico!=null && jComboBoxid_lineaDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_lineaDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico!=null && jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico!=null && jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
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

					if(this.diferenciasfisicasproductos!=null) {
						this.diferenciasfisicasproductos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
						jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
							//jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico)throws Exception
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
				jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico!=null && jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_bodegaDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDiferenciasFisicasProductosGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_bodega(bodegaAux.getId());
				diferenciasfisicasproductos.setbodega_descripcion(DiferenciasFisicasProductosConstantesFunciones.getBodegaDescripcion(bodegaAux));
				diferenciasfisicasproductos.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_productoDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDiferenciasFisicasProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				diferenciasfisicasproductos.setid_producto(productoAux.getId());
				diferenciasfisicasproductos.setproducto_descripcion(DiferenciasFisicasProductosConstantesFunciones.getProductoDescripcion(productoAux));
				diferenciasfisicasproductos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_empresaDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDiferenciasFisicasProductosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_empresa(empresaAux.getId());
				diferenciasfisicasproductos.setempresa_descripcion(DiferenciasFisicasProductosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				diferenciasfisicasproductos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_sucursalDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDiferenciasFisicasProductosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				diferenciasfisicasproductos.setid_sucursal(sucursalAux.getId());
				diferenciasfisicasproductos.setsucursal_descripcion(DiferenciasFisicasProductosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				diferenciasfisicasproductos.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_lineaDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaDiferenciasFisicasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_linea(lineaAux.getId());
				diferenciasfisicasproductos.setlinea_descripcion(DiferenciasFisicasProductosConstantesFunciones.getLineaDescripcion(lineaAux));
				diferenciasfisicasproductos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_linea_grupo(lineaAux.getId());
				diferenciasfisicasproductos.setlineagrupo_descripcion(DiferenciasFisicasProductosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				diferenciasfisicasproductos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_linea_categoria(lineaAux.getId());
				diferenciasfisicasproductos.setlineacategoria_descripcion(DiferenciasFisicasProductosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				diferenciasfisicasproductos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(DiferenciasFisicasProductos diferenciasfisicasproductos,JComboBox jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaDiferenciasFisicasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				diferenciasfisicasproductos.setid_linea_marca(lineaAux.getId());
				diferenciasfisicasproductos.setlineamarca_descripcion(DiferenciasFisicasProductosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				diferenciasfisicasproductos.setLineaMarca(lineaAux);			}
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(bodega);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(producto);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(linea);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(lineagrupo);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(lineacategoria);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { 
					}

					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addItem(lineamarca);
							}
						}

						if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDiferenciasFisicasProductos() throws Exception {
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
		
	public DiferenciasFisicasProductosParameterReturnGeneral getDiferenciasFisicasProductosParameterGeneral() {
		return this.diferenciasfisicasproductosParameterGeneral;
	}
	
	public void setDiferenciasFisicasProductosParameterGeneral(DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosParameterGeneral) {
		this.diferenciasfisicasproductosParameterGeneral = diferenciasfisicasproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDiferenciasFisicasProductos() {
		return isPermisoTodoDiferenciasFisicasProductos;
	}

	public void setIsPermisoTodoDiferenciasFisicasProductos(Boolean isPermisoTodoDiferenciasFisicasProductos) {
		this.isPermisoTodoDiferenciasFisicasProductos = isPermisoTodoDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoNuevoDiferenciasFisicasProductos() {
		return isPermisoNuevoDiferenciasFisicasProductos;
	}

	public void setIsPermisoNuevoDiferenciasFisicasProductos(Boolean isPermisoNuevoDiferenciasFisicasProductos) {
		this.isPermisoNuevoDiferenciasFisicasProductos = isPermisoNuevoDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoActualizarDiferenciasFisicasProductos() {
		return isPermisoActualizarDiferenciasFisicasProductos;
	}

	public void setIsPermisoActualizarDiferenciasFisicasProductos(Boolean isPermisoActualizarDiferenciasFisicasProductos) {
		this.isPermisoActualizarDiferenciasFisicasProductos = isPermisoActualizarDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoEliminarDiferenciasFisicasProductos() {
		return isPermisoEliminarDiferenciasFisicasProductos;
	}

	public void setIsPermisoEliminarDiferenciasFisicasProductos(Boolean isPermisoEliminarDiferenciasFisicasProductos) {
		this.isPermisoEliminarDiferenciasFisicasProductos = isPermisoEliminarDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoGuardarCambiosDiferenciasFisicasProductos() {
		return isPermisoGuardarCambiosDiferenciasFisicasProductos;
	}

	public void setIsPermisoGuardarCambiosDiferenciasFisicasProductos(Boolean isPermisoGuardarCambiosDiferenciasFisicasProductos) {
		this.isPermisoGuardarCambiosDiferenciasFisicasProductos = isPermisoGuardarCambiosDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoConsultaDiferenciasFisicasProductos() {
		return isPermisoConsultaDiferenciasFisicasProductos;
	}

	public void setIsPermisoConsultaDiferenciasFisicasProductos(Boolean isPermisoConsultaDiferenciasFisicasProductos) {
		this.isPermisoConsultaDiferenciasFisicasProductos = isPermisoConsultaDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoBusquedaDiferenciasFisicasProductos() {
		return isPermisoBusquedaDiferenciasFisicasProductos;
	}

	public void setIsPermisoBusquedaDiferenciasFisicasProductos(Boolean isPermisoBusquedaDiferenciasFisicasProductos) {
		this.isPermisoBusquedaDiferenciasFisicasProductos = isPermisoBusquedaDiferenciasFisicasProductos;
	}

	public Boolean getIsPermisoReporteDiferenciasFisicasProductos() {
		return isPermisoReporteDiferenciasFisicasProductos;
	}

	public void setIsPermisoReporteDiferenciasFisicasProductos(Boolean isPermisoReporteDiferenciasFisicasProductos) {
		this.isPermisoReporteDiferenciasFisicasProductos = isPermisoReporteDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioDiferenciasFisicasProductos() {
		return isPermisoPaginacionMedioDiferenciasFisicasProductos;
	}

	public void setIsPermisoPaginacionMedioDiferenciasFisicasProductos(Boolean isPermisoPaginacionMedioDiferenciasFisicasProductos) {
		this.isPermisoPaginacionMedioDiferenciasFisicasProductos = isPermisoPaginacionMedioDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoDiferenciasFisicasProductos() {
		return isPermisoPaginacionTodoDiferenciasFisicasProductos;
	}

	public void setIsPermisoPaginacionTodoDiferenciasFisicasProductos(Boolean isPermisoPaginacionTodoDiferenciasFisicasProductos) {
		this.isPermisoPaginacionTodoDiferenciasFisicasProductos = isPermisoPaginacionTodoDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoDiferenciasFisicasProductos() {
		return isPermisoPaginacionAltoDiferenciasFisicasProductos;
	}

	public void setIsPermisoPaginacionAltoDiferenciasFisicasProductos(Boolean isPermisoPaginacionAltoDiferenciasFisicasProductos) {
		this.isPermisoPaginacionAltoDiferenciasFisicasProductos = isPermisoPaginacionAltoDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoCopiarDiferenciasFisicasProductos() {
		return isPermisoCopiarDiferenciasFisicasProductos;
	}

	public void setIsPermisoCopiarDiferenciasFisicasProductos(Boolean isPermisoCopiarDiferenciasFisicasProductos) {
		this.isPermisoCopiarDiferenciasFisicasProductos = isPermisoCopiarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoVerFormDiferenciasFisicasProductos() {
		return isPermisoVerFormDiferenciasFisicasProductos;
	}

	public void setIsPermisoVerFormDiferenciasFisicasProductos(Boolean isPermisoVerFormDiferenciasFisicasProductos) {
		this.isPermisoVerFormDiferenciasFisicasProductos = isPermisoVerFormDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoDuplicarDiferenciasFisicasProductos() {
		return isPermisoDuplicarDiferenciasFisicasProductos;
	}

	public void setIsPermisoDuplicarDiferenciasFisicasProductos(Boolean isPermisoDuplicarDiferenciasFisicasProductos) {
		this.isPermisoDuplicarDiferenciasFisicasProductos = isPermisoDuplicarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsPermisoOrdenDiferenciasFisicasProductos() {
		return isPermisoOrdenDiferenciasFisicasProductos;
	}

	public void setIsPermisoOrdenDiferenciasFisicasProductos(Boolean isPermisoOrdenDiferenciasFisicasProductos) {
		this.isPermisoOrdenDiferenciasFisicasProductos = isPermisoOrdenDiferenciasFisicasProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDiferenciasFisicasProductos() {
		return isVisibilidadCeldaNuevoDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaNuevoDiferenciasFisicasProductos(Boolean isVisibilidadCeldaNuevoDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos = isVisibilidadCeldaNuevoDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaDuplicarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaDuplicarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaDuplicarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos = isVisibilidadCeldaDuplicarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaCopiarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaCopiarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaCopiarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos = isVisibilidadCeldaCopiarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDiferenciasFisicasProductos() {
		return isVisibilidadCeldaVerFormDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaVerFormDiferenciasFisicasProductos(Boolean isVisibilidadCeldaVerFormDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos = isVisibilidadCeldaVerFormDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDiferenciasFisicasProductos() {
		return isVisibilidadCeldaOrdenDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaOrdenDiferenciasFisicasProductos(Boolean isVisibilidadCeldaOrdenDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos = isVisibilidadCeldaOrdenDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos() {
		return isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos(Boolean isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos = isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaModificarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaModificarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaModificarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaModificarDiferenciasFisicasProductos = isVisibilidadCeldaModificarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaActualizarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaActualizarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaActualizarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos = isVisibilidadCeldaActualizarDiferenciasFisicasProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaEliminarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaEliminarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaEliminarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos = isVisibilidadCeldaEliminarDiferenciasFisicasProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaCancelarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaCancelarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaCancelarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos = isVisibilidadCeldaCancelarDiferenciasFisicasProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarDiferenciasFisicasProductos() {
		return isVisibilidadCeldaGuardarDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaGuardarDiferenciasFisicasProductos(Boolean isVisibilidadCeldaGuardarDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos = isVisibilidadCeldaGuardarDiferenciasFisicasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos() {
		return isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos(Boolean isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos) {
		this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos = isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos;
	}
		
	public DiferenciasFisicasProductosSessionBean getdiferenciasfisicasproductosSessionBean() {
		return this.diferenciasfisicasproductosSessionBean;
	}
	
	public void setdiferenciasfisicasproductosSessionBean(DiferenciasFisicasProductosSessionBean diferenciasfisicasproductosSessionBean) {
		this.diferenciasfisicasproductosSessionBean=diferenciasfisicasproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDiferenciasFisicasProductos() {
		return this.isVisibilidadBusquedaDiferenciasFisicasProductos;
	}

	public void setisVisibilidadBusquedaDiferenciasFisicasProductos(Boolean isVisibilidadBusquedaDiferenciasFisicasProductos) {
		this.isVisibilidadBusquedaDiferenciasFisicasProductos=isVisibilidadBusquedaDiferenciasFisicasProductos;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarProductoForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarEmpresaForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarSucursalForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarLineaForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(diferenciasfisicasproductos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(diferenciasfisicasproductos,null);
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
	
	public void bugActualizarReferenciaActual(DiferenciasFisicasProductos diferenciasfisicasproductos,DiferenciasFisicasProductos diferenciasfisicasproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDiferenciasFisicasProductos(diferenciasfisicasproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		diferenciasfisicasproductosAux.setId(diferenciasfisicasproductos.getId());
		diferenciasfisicasproductosAux.setVersionRow(diferenciasfisicasproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DiferenciasFisicasProductos diferenciasfisicasproductosLocal) throws Exception {
		
		if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DiferenciasFisicasProductos diferenciasfisicasproductosLocal) throws Exception {	
		if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				diferenciasfisicasproductosLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				diferenciasfisicasproductosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				diferenciasfisicasproductosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				diferenciasfisicasproductosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				diferenciasfisicasproductosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				diferenciasfisicasproductosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				diferenciasfisicasproductosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				diferenciasfisicasproductosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDiferenciasFisicasProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = diferenciasfisicasproductosValidator.getInvalidValues(this.diferenciasfisicasproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DiferenciasFisicasProductos diferenciasfisicasproductos,List<DiferenciasFisicasProductos> diferenciasfisicasproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(DiferenciasFisicasProductos diferenciasfisicasproductos,List<DiferenciasFisicasProductos> diferenciasfisicasproductoss) throws Exception {
		try	{			
			DiferenciasFisicasProductosConstantesFunciones.actualizarSelectedLista(diferenciasfisicasproductos,diferenciasfisicasproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DiferenciasFisicasProductos> diferenciasfisicasproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				diferenciasfisicasproductossLocal=this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				diferenciasfisicasproductossLocal=this.diferenciasfisicasproductoss;
			}
			//ARCHITECTURE
		
			for(DiferenciasFisicasProductos diferenciasfisicasproductosLocal:diferenciasfisicasproductossLocal) {
				if(this.permiteMantenimiento(diferenciasfisicasproductosLocal) && diferenciasfisicasproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.getDiferenciasFisicasProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigoDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombre_unidadDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.CANTIDADDISPONIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_disponibleDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.CANTIDADFISICA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_fisicaDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigo_productoDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombreDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.INGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelingresosDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.EGRESOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelegresosDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.DISPONIBLECORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldisponible_corteDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.DIFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldiferenciaDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcostoDiferenciasFisicasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DiferenciasFisicasProductosConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeltotalDiferenciasFisicasProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigoDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombre_unidadDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_disponibleDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_fisicaDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigo_productoDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombreDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelingresosDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelegresosDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldisponible_corteDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldiferenciaDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcostoDiferenciasFisicasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeltotalDiferenciasFisicasProductos,"");
		
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
		this.iIdNuevoDiferenciasFisicasProductos--;	
		
		
		this.diferenciasfisicasproductosAux=new DiferenciasFisicasProductos();
		
		this.diferenciasfisicasproductosAux.setId(this.iIdNuevoDiferenciasFisicasProductos);
		this.diferenciasfisicasproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().add(this.diferenciasfisicasproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.diferenciasfisicasproductoss.add(this.diferenciasfisicasproductosAux);
		}
		//ARCHITECTURE
		
		this.diferenciasfisicasproductos=this.diferenciasfisicasproductosAux;
		
		if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
		}
				
		//this.setDefaultControlesDiferenciasFisicasProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDiferenciasFisicasProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDiferenciasFisicasProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiferenciasFisicasProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductosBean,this.diferenciasfisicasproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral,this.diferenciasfisicasproductosBean,false);
		
		if(this.diferenciasfisicasproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos());
		}
		
		if(this.diferenciasfisicasproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos(),classes);//this.diferenciasfisicasproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDiferenciasFisicasProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDiferenciasFisicasProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.RecargarFormDiferenciasFisicasProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
						
			if(diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();
			}
			
			this.actualizarVisualTableDatosDiferenciasFisicasProductos();
			
			this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(this.getIndiceNuevoDiferenciasFisicasProductos(), this.getIndiceNuevoDiferenciasFisicasProductos());
			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
						
			this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDiferenciasFisicasProductos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarfecha_ultima_venta_hastaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarcodigoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarnombre_unidadDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_disponibleDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_fisicaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarcodigo_productoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarnombreDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activaringresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activaregresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activardisponible_corteDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activardiferenciaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarcostoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activartotalDiferenciasFisicasProductos);	
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_bodegaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_productoDiferenciasFisicasProductos);//
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_empresaDiferenciasFisicasProductos);//
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_sucursalDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_lineaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_grupoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_categoriaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setEnabled(isHabilitar && this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_marcaDiferenciasFisicasProductos);
	};
	
	public void setDefaultControlesDiferenciasFisicasProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDiferenciasFisicasProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(true);			
			this.diferenciasfisicasproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.setVisible(true);
			
					
		} else {
			//this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(false);			
			this.diferenciasfisicasproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDiferenciasFisicasProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				if(diferenciasfisicasproductosAux.getId().equals(this.iIdNuevoDiferenciasFisicasProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductoss) {
				if(diferenciasfisicasproductosAux.getId().equals(this.iIdNuevoDiferenciasFisicasProductos)) {
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
	
	public int getIndiceActualDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				if(diferenciasfisicasproductosAux.getId().equals(diferenciasfisicasproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductoss) {
				if(diferenciasfisicasproductosAux.getId().equals(diferenciasfisicasproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				if(diferenciasfisicasproductosAux.getDiferenciasFisicasProductosOriginal().getId().equals(diferenciasfisicasproductosOriginal.getId())) {
					existe=true;
					diferenciasfisicasproductosOriginal.setId(diferenciasfisicasproductosAux.getId());
					diferenciasfisicasproductosOriginal.setVersionRow(diferenciasfisicasproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductoss) {
				if(diferenciasfisicasproductosAux.getDiferenciasFisicasProductosOriginal().getId().equals(diferenciasfisicasproductosOriginal.getId())) {
					existe=true;
					diferenciasfisicasproductosOriginal.setId(diferenciasfisicasproductosAux.getId());
					diferenciasfisicasproductosOriginal.setVersionRow(diferenciasfisicasproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDiferenciasFisicasProductos(Boolean esParaCancelar) throws Exception {
		diferenciasfisicasproductossAux=new ArrayList<DiferenciasFisicasProductos>();
		diferenciasfisicasproductosAux=new DiferenciasFisicasProductos();
		
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
					if(diferenciasfisicasproductosAux.getId()<0) {
						diferenciasfisicasproductossAux.add(diferenciasfisicasproductosAux);
					}		
				}
				this.iIdNuevoDiferenciasFisicasProductos=0L;
				this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().removeAll(diferenciasfisicasproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductoss) {
					if(diferenciasfisicasproductosAux.getId()<0) {
						diferenciasfisicasproductossAux.add(diferenciasfisicasproductosAux);
					}		
				}
				this.iIdNuevoDiferenciasFisicasProductos=0L;
				this.diferenciasfisicasproductoss.removeAll(diferenciasfisicasproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDiferenciasFisicasProductos 
					&& this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size()>0
					) {
					diferenciasfisicasproductosAux=this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().get(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size() - 1);
				
					if(diferenciasfisicasproductosAux.getId()<0) {
						this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().remove(diferenciasfisicasproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDiferenciasFisicasProductos && this.diferenciasfisicasproductoss.size()>0) {
					diferenciasfisicasproductosAux=this.diferenciasfisicasproductoss.get(this.diferenciasfisicasproductoss.size() - 1);
				
					if(diferenciasfisicasproductosAux.getId()<0) {
						this.diferenciasfisicasproductoss.remove(diferenciasfisicasproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDiferenciasFisicasProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(diferenciasfisicasproductos.getId()<0) {
				this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().remove(this.diferenciasfisicasproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(diferenciasfisicasproductos.getId()<0) {
				this.diferenciasfisicasproductoss.remove(this.diferenciasfisicasproductos);
			}
		}			
	}
	
	public void setEstadosInicialesDiferenciasFisicasProductos(List<DiferenciasFisicasProductos> diferenciasfisicasproductossAux) throws Exception {
		DiferenciasFisicasProductosConstantesFunciones.setEstadosInicialesDiferenciasFisicasProductos(diferenciasfisicasproductossAux);
	}
	
	public void setEstadosInicialesDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductosAux) throws Exception {
		DiferenciasFisicasProductosConstantesFunciones.setEstadosInicialesDiferenciasFisicasProductos(diferenciasfisicasproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDiferenciasFisicasProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDiferenciasFisicasProductosActual()) {
				if(!this.isEsNuevoDiferenciasFisicasProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDiferenciasFisicasProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDiferenciasFisicasProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Diferencias Fisicas Productos ?", "MANTENIMIENTO DE Diferencias Fisicas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DiferenciasFisicasProductos diferenciasfisicasproductos) throws Exception {
		DiferenciasFisicasProductosConstantesFunciones.seleccionarAsignar(this.diferenciasfisicasproductos,diferenciasfisicasproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDiferenciasFisicasProductos=this.isPermisoActualizarOriginalDiferenciasFisicasProductos;
			
			
			this.seleccionarAsignar(diferenciasfisicasproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.diferenciasfisicasproductosSessionBean.setsFuncionBusquedaRapida(this.diferenciasfisicasproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDiferenciasFisicasProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDiferenciasFisicasProductos(esParaCancelar);				
				this.cancelarNuevoDiferenciasFisicasProductos(esParaCancelar);								
			}
			
			this.diferenciasfisicasproductos=new DiferenciasFisicasProductos();
			
			this.inicializarDiferenciasFisicasProductos();
			
			this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDiferenciasFisicasProductos() throws Exception {
		try {
			DiferenciasFisicasProductosConstantesFunciones.inicializarDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDiferenciasFisicasProductoss(String sAccionBusqueda,List<DiferenciasFisicasProductos> diferenciasfisicasproductossParaReportes) throws Exception {
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
					sPathReporteFinal="DiferenciasFisicasProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DiferenciasFisicasProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DiferenciasFisicasProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DiferenciasFisicasProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Diferencias Fisicas Productoses");		
		parameters.put("busquedapor", DiferenciasFisicasProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDiferenciasFisicasProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DiferenciasFisicasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DiferenciasFisicasProductosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDiferenciasFisicasProductos=new JRBeanArrayDataSource(DiferenciasFisicasProductosJInternalFrame.TraerDiferenciasFisicasProductosBeans(diferenciasfisicasproductossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDiferenciasFisicasProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DiferenciasFisicasProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DiferenciasFisicasProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DiferenciasFisicasProductosBean.TraerDiferenciasFisicasProductosBeans(diferenciasfisicasproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductosActionPerformed(null);
					//this.generarExcelReporteDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDiferenciasFisicasProductoss(sAccionBusqueda,sTipoArchivoReporte,diferenciasfisicasproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDiferenciasFisicasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DiferenciasFisicasProductos> diferenciasfisicasproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiferenciasFisicasProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiferenciasFisicasProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DiferenciasFisicasProductos diferenciasfisicasproductos : diferenciasfisicasproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DiferenciasFisicasProductosConstantesFunciones.generarExcelReporteDataDiferenciasFisicasProductos("NORMAL",row,workbook,diferenciasfisicasproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDiferenciasFisicasProductos(String sTipo,Row row,Workbook workbook) {
		
		DiferenciasFisicasProductosConstantesFunciones.generarExcelReporteHeaderDiferenciasFisicasProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDiferenciasFisicasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DiferenciasFisicasProductos> diferenciasfisicasproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiferenciasFisicasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DiferenciasFisicasProductos diferenciasfisicasproductos : diferenciasfisicasproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.getDiferenciasFisicasProductosDescripcion(diferenciasfisicasproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getfecha_ultima_venta_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getcantidad_disponible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getcantidad_fisica());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getingresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getegresos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getdisponible_corte());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getdiferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(diferenciasfisicasproductos.gettotal());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDiferenciasFisicasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DiferenciasFisicasProductos> diferenciasfisicasproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DiferenciasFisicasProductos> diferenciasfisicasproductossRespaldo=null;
		
		classes=DiferenciasFisicasProductosConstantesFunciones.getClassesRelationshipsOfDiferenciasFisicasProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.diferenciasfisicasproductosLogic.setDatosCliente(this.datosCliente);
		this.diferenciasfisicasproductosLogic.setDatosDeep(this.datosDeep);
		this.diferenciasfisicasproductosLogic.setIsConDeep(true);
		
		diferenciasfisicasproductossRespaldo=this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss();
		
		this.diferenciasfisicasproductosLogic.setDiferenciasFisicasProductoss(diferenciasfisicasproductossParaReportes);	
		this.diferenciasfisicasproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		diferenciasfisicasproductossParaReportes=this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss();
		this.diferenciasfisicasproductosLogic.setDiferenciasFisicasProductoss(diferenciasfisicasproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DiferenciasFisicasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDiferenciasFisicasProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DiferenciasFisicasProductos diferenciasfisicasproductos : diferenciasfisicasproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDiferenciasFisicasProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DiferenciasFisicasProductosConstantesFunciones.generarExcelReporteDataDiferenciasFisicasProductos("NORMAL",row,workbook,diferenciasfisicasproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.getDiferenciasFisicasProductosDescripcion(diferenciasfisicasproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDiferenciasFisicasProductos() throws Exception {		
		this.startProcessDiferenciasFisicasProductos(true);
	}
	
	public void startProcessDiferenciasFisicasProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDiferenciasFisicasProductos ,this.jPanelParametrosReportesDiferenciasFisicasProductos, this.jScrollPanelDatosDiferenciasFisicasProductos,this.jPanelPaginacionDiferenciasFisicasProductos, this.jScrollPanelDatosEdicionDiferenciasFisicasProductos, this.jPanelAccionesDiferenciasFisicasProductos,this.jPanelAccionesFormularioDiferenciasFisicasProductos,this.jmenuBarDiferenciasFisicasProductos,this.jmenuBarDetalleDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasDiferenciasFisicasProductos=this.jTabbedPaneBusquedasDiferenciasFisicasProductos; 
		
		final JPanel jPanelParametrosReportesDiferenciasFisicasProductos=this.jPanelParametrosReportesDiferenciasFisicasProductos;
		//final JScrollPane jScrollPanelDatosDiferenciasFisicasProductos=this.jScrollPanelDatosDiferenciasFisicasProductos;
		final JTable jTableDatosDiferenciasFisicasProductos=this.jTableDatosDiferenciasFisicasProductos;		
		final JPanel jPanelPaginacionDiferenciasFisicasProductos=this.jPanelPaginacionDiferenciasFisicasProductos;
		//final JScrollPane jScrollPanelDatosEdicionDiferenciasFisicasProductos=this.jScrollPanelDatosEdicionDiferenciasFisicasProductos;
		final JPanel jPanelAccionesDiferenciasFisicasProductos=this.jPanelAccionesDiferenciasFisicasProductos;
		
		JPanel jPanelCamposAuxiliarDiferenciasFisicasProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			jPanelCamposAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelCamposDiferenciasFisicasProductos;
			jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelAccionesFormularioDiferenciasFisicasProductos;
		}
		
		final JPanel jPanelCamposDiferenciasFisicasProductos=jPanelCamposAuxiliarDiferenciasFisicasProductos;
		final JPanel jPanelAccionesFormularioDiferenciasFisicasProductos=jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos;
		
		
		final JMenuBar jmenuBarDiferenciasFisicasProductos=this.jmenuBarDiferenciasFisicasProductos;
		final JToolBar jTtoolBarDiferenciasFisicasProductos=this.jTtoolBarDiferenciasFisicasProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDiferenciasFisicasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			jmenuBarDetalleAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jmenuBarDetalleDiferenciasFisicasProductos;
			jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTtoolBarDetalleDiferenciasFisicasProductos;
		}
		
		final JMenuBar jmenuBarDetalleDiferenciasFisicasProductos=jmenuBarDetalleAuxiliarDiferenciasFisicasProductos;
		final JToolBar jTtoolBarDetalleDiferenciasFisicasProductos=jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiferenciasFisicasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiferenciasFisicasProductos;
			processRunnable.jTableDatos=jTableDatosDiferenciasFisicasProductos;
			processRunnable.jPanelCampos=jPanelCamposDiferenciasFisicasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiferenciasFisicasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesDiferenciasFisicasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiferenciasFisicasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarDiferenciasFisicasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiferenciasFisicasProductos;
			processRunnable.jTtoolBar=jTtoolBarDiferenciasFisicasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiferenciasFisicasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiferenciasFisicasProductos ,jPanelParametrosReportesDiferenciasFisicasProductos,jTableDatosDiferenciasFisicasProductos, /*jScrollPanelDatosDiferenciasFisicasProductos,*/jPanelCamposDiferenciasFisicasProductos,jPanelPaginacionDiferenciasFisicasProductos, /*jScrollPanelDatosEdicionDiferenciasFisicasProductos,*/ jPanelAccionesDiferenciasFisicasProductos,jPanelAccionesFormularioDiferenciasFisicasProductos,jmenuBarDiferenciasFisicasProductos,jmenuBarDetalleDiferenciasFisicasProductos,jTtoolBarDiferenciasFisicasProductos,jTtoolBarDetalleDiferenciasFisicasProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDiferenciasFisicasProductos ,jPanelParametrosReportesDiferenciasFisicasProductos, jScrollPanelDatosDiferenciasFisicasProductos,jPanelPaginacionDiferenciasFisicasProductos, jScrollPanelDatosEdicionDiferenciasFisicasProductos, jPanelAccionesDiferenciasFisicasProductos,jPanelAccionesFormularioDiferenciasFisicasProductos,jmenuBarDiferenciasFisicasProductos,jmenuBarDetalleDiferenciasFisicasProductos,jTtoolBarDiferenciasFisicasProductos,jTtoolBarDetalleDiferenciasFisicasProductos);
						
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
	
	public void finishProcessDiferenciasFisicasProductos() {// throws Exception 
		this.finishProcessDiferenciasFisicasProductos(true);
	}
	
	public void finishProcessDiferenciasFisicasProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDiferenciasFisicasProductos ,this.jPanelParametrosReportesDiferenciasFisicasProductos, this.jScrollPanelDatosDiferenciasFisicasProductos,this.jPanelPaginacionDiferenciasFisicasProductos, this.jScrollPanelDatosEdicionDiferenciasFisicasProductos, this.jPanelAccionesDiferenciasFisicasProductos,this.jPanelAccionesFormularioDiferenciasFisicasProductos,this.jmenuBarDiferenciasFisicasProductos,this.jmenuBarDetalleDiferenciasFisicasProductos,this.jTtoolBarDiferenciasFisicasProductos,this.jTtoolBarDetalleDiferenciasFisicasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasDiferenciasFisicasProductos=this.jTabbedPaneBusquedasDiferenciasFisicasProductos; 
		
		final JPanel jPanelParametrosReportesDiferenciasFisicasProductos=this.jPanelParametrosReportesDiferenciasFisicasProductos;
		//final JScrollPane jScrollPanelDatosDiferenciasFisicasProductos=this.jScrollPanelDatosDiferenciasFisicasProductos;
		final JTable jTableDatosDiferenciasFisicasProductos=this.jTableDatosDiferenciasFisicasProductos;		
		final JPanel jPanelPaginacionDiferenciasFisicasProductos=this.jPanelPaginacionDiferenciasFisicasProductos;
		//final JScrollPane jScrollPanelDatosEdicionDiferenciasFisicasProductos=this.jScrollPanelDatosEdicionDiferenciasFisicasProductos;
		final JPanel jPanelAccionesDiferenciasFisicasProductos=this.jPanelAccionesDiferenciasFisicasProductos;
		
		JPanel jPanelCamposAuxiliarDiferenciasFisicasProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			jPanelCamposAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelCamposDiferenciasFisicasProductos;
			jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelAccionesFormularioDiferenciasFisicasProductos;
		}
		
		final JPanel jPanelCamposDiferenciasFisicasProductos=jPanelCamposAuxiliarDiferenciasFisicasProductos;
		final JPanel jPanelAccionesFormularioDiferenciasFisicasProductos=jPanelAccionesFormularioAuxiliarDiferenciasFisicasProductos;
		
		
		final JMenuBar jmenuBarDiferenciasFisicasProductos=this.jmenuBarDiferenciasFisicasProductos;		
		final JToolBar jTtoolBarDiferenciasFisicasProductos=this.jTtoolBarDiferenciasFisicasProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarDiferenciasFisicasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			jmenuBarDetalleAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jmenuBarDetalleDiferenciasFisicasProductos;
			jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTtoolBarDetalleDiferenciasFisicasProductos;		
		}
		
		final JMenuBar jmenuBarDetalleDiferenciasFisicasProductos=jmenuBarDetalleAuxiliarDiferenciasFisicasProductos;
		final JToolBar jTtoolBarDetalleDiferenciasFisicasProductos=jTtoolBarDetalleAuxiliarDiferenciasFisicasProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDiferenciasFisicasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDiferenciasFisicasProductos;
			processRunnable.jTableDatos=jTableDatosDiferenciasFisicasProductos;
			processRunnable.jPanelCampos=jPanelCamposDiferenciasFisicasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDiferenciasFisicasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesDiferenciasFisicasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDiferenciasFisicasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarDiferenciasFisicasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDiferenciasFisicasProductos;
			processRunnable.jTtoolBar=jTtoolBarDiferenciasFisicasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDiferenciasFisicasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDiferenciasFisicasProductos ,jPanelParametrosReportesDiferenciasFisicasProductos, jTableDatosDiferenciasFisicasProductos,/*jScrollPanelDatosDiferenciasFisicasProductos,*/jPanelCamposDiferenciasFisicasProductos,jPanelPaginacionDiferenciasFisicasProductos, /*jScrollPanelDatosEdicionDiferenciasFisicasProductos,*/ jPanelAccionesDiferenciasFisicasProductos,jPanelAccionesFormularioDiferenciasFisicasProductos,jmenuBarDiferenciasFisicasProductos,jmenuBarDetalleDiferenciasFisicasProductos,jTtoolBarDiferenciasFisicasProductos,jTtoolBarDetalleDiferenciasFisicasProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDiferenciasFisicasProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDiferenciasFisicasProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDiferenciasFisicasProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDiferenciasFisicasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDiferenciasFisicasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDiferenciasFisicasProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDiferenciasFisicasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDiferenciasFisicasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDiferenciasFisicasProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.diferenciasfisicasproductosConstantesFunciones.getsFinalQueryDiferenciasFisicasProductos();
		String  finalQueryPaginacionTodos=this.diferenciasfisicasproductosConstantesFunciones.getsFinalQueryDiferenciasFisicasProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DiferenciasFisicasProductosConstantesFunciones.getArrayColumnasGlobalesNoDiferenciasFisicasProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DiferenciasFisicasProductosConstantesFunciones.getArrayColumnasGlobalesDiferenciasFisicasProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DiferenciasFisicasProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.diferenciasfisicasproductossEliminados= new ArrayList<DiferenciasFisicasProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDiferenciasFisicasProductos();
		
				///*DiferenciasFisicasProductosSessionBean*/this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			
			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
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
					this.iNumeroPaginacion=DiferenciasFisicasProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DiferenciasFisicasProductosConstantesFunciones.getClassesForeignKeysOfDiferenciasFisicasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/diferenciasfisicasproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			diferenciasfisicasproductossAux= new ArrayList<DiferenciasFisicasProductos>();
			
				
			diferenciasfisicasproductosLogic.setDatosCliente(this.datosCliente);
			diferenciasfisicasproductosLogic.setDatosDeep(this.datosDeep);
			diferenciasfisicasproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDiferenciasFisicasProductos")) {
				this.sDetalleReporte=DiferenciasFisicasProductosConstantesFunciones.getDetalleIndiceBusquedaDiferenciasFisicasProductos(id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiferenciasFisicasProductosConstantesFunciones.getDetalleIndiceBusquedaDiferenciasFisicasProductos(id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiferenciasFisicasProductosConstantesFunciones.getDetalleIndiceBusquedaDiferenciasFisicasProductos(id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()==null||diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=diferenciasfisicasproductoss==null|| diferenciasfisicasproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						diferenciasfisicasproductossAux=new ArrayList<DiferenciasFisicasProductos>();
						diferenciasfisicasproductossAux.addAll(diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diferenciasfisicasproductossAux=new ArrayList<DiferenciasFisicasProductos>();
							diferenciasfisicasproductossAux.addAll(diferenciasfisicasproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DiferenciasFisicasProductosConstantesFunciones.getDetalleIndiceBusquedaDiferenciasFisicasProductos(id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DiferenciasFisicasProductosConstantesFunciones.getDetalleIndiceBusquedaDiferenciasFisicasProductos(id_bodegaBusquedaDiferenciasFisicasProductos,id_productoBusquedaDiferenciasFisicasProductos,id_lineaBusquedaDiferenciasFisicasProductos,id_linea_grupoBusquedaDiferenciasFisicasProductos,id_linea_categoriaBusquedaDiferenciasFisicasProductos,id_linea_marcaBusquedaDiferenciasFisicasProductos,fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDiferenciasFisicasProductoss("BusquedaDiferenciasFisicasProductos",diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDiferenciasFisicasProductoss("BusquedaDiferenciasFisicasProductos",diferenciasfisicasproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						diferenciasfisicasproductosLogic.setDiferenciasFisicasProductoss(new ArrayList<DiferenciasFisicasProductos>());
						diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().addAll(diferenciasfisicasproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diferenciasfisicasproductoss=new ArrayList<DiferenciasFisicasProductos>();
							diferenciasfisicasproductoss.addAll(diferenciasfisicasproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDiferenciasFisicasProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDiferenciasFisicasProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diferenciasfisicasproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=diferenciasfisicasproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DiferenciasFisicasProductos diferenciasfisicasproductos) {
		Boolean permite=true;
		
		if(this.diferenciasfisicasproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DiferenciasFisicasProductosConstantesFunciones.getOrderByListaDiferenciasFisicasProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DiferenciasFisicasProductosConstantesFunciones.getOrderByListaDiferenciasFisicasProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				if(diferenciasfisicasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					diferenciasfisicasproductosTotales=diferenciasfisicasproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductos:this.diferenciasfisicasproductoss) {
				if(diferenciasfisicasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					diferenciasfisicasproductosTotales=diferenciasfisicasproductos;
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
			this.diferenciasfisicasproductosAux=new DiferenciasFisicasProductos();
			this.diferenciasfisicasproductosAux.setsType(Constantes2.S_TOTALES);
			this.diferenciasfisicasproductosAux.setIsNew(false);
			this.diferenciasfisicasproductosAux.setIsChanged(false);
			this.diferenciasfisicasproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DiferenciasFisicasProductosConstantesFunciones.TotalizarValoresFilaDiferenciasFisicasProductos(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss(),this.diferenciasfisicasproductosAux);
				
				//this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().add(this.diferenciasfisicasproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DiferenciasFisicasProductosConstantesFunciones.TotalizarValoresFilaDiferenciasFisicasProductos(this.diferenciasfisicasproductoss,this.diferenciasfisicasproductosAux);
				
				this.diferenciasfisicasproductoss.add(this.diferenciasfisicasproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diferenciasfisicasproductosTotales=new DiferenciasFisicasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().remove(diferenciasfisicasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diferenciasfisicasproductoss.remove(diferenciasfisicasproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diferenciasfisicasproductosTotales=new DiferenciasFisicasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				if(diferenciasfisicasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					diferenciasfisicasproductosTotales=diferenciasfisicasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiferenciasFisicasProductosConstantesFunciones.TotalizarValoresFilaDiferenciasFisicasProductos(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss(),diferenciasfisicasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DiferenciasFisicasProductos diferenciasfisicasproductos:this.diferenciasfisicasproductoss) {
				if(diferenciasfisicasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					diferenciasfisicasproductosTotales=diferenciasfisicasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiferenciasFisicasProductosConstantesFunciones.TotalizarValoresFilaDiferenciasFisicasProductos(this.diferenciasfisicasproductoss,diferenciasfisicasproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaDiferenciasFisicasProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDiferenciasFisicasProductossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_ultima_venta_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_ultima_venta_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDiferenciasFisicasProductossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//diferenciasfisicasproductosLogic.getDiferenciasFisicasProductossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDiferenciasFisicasProductos() {
		this.isPermisoTodoDiferenciasFisicasProductos=false;
		this.isPermisoNuevoDiferenciasFisicasProductos=false;
		this.isPermisoActualizarDiferenciasFisicasProductos=false;
		this.isPermisoActualizarOriginalDiferenciasFisicasProductos=false;
		this.isPermisoEliminarDiferenciasFisicasProductos=false;
		this.isPermisoGuardarCambiosDiferenciasFisicasProductos=false;
		this.isPermisoConsultaDiferenciasFisicasProductos=true;
		this.isPermisoBusquedaDiferenciasFisicasProductos=true;
		this.isPermisoReporteDiferenciasFisicasProductos=true;
		this.isPermisoOrdenDiferenciasFisicasProductos=false;		
		this.isPermisoPaginacionMedioDiferenciasFisicasProductos=false;		
		this.isPermisoPaginacionAltoDiferenciasFisicasProductos=false;		
		this.isPermisoPaginacionTodoDiferenciasFisicasProductos=false;		
		this.isPermisoCopiarDiferenciasFisicasProductos=false;		
		this.isPermisoVerFormDiferenciasFisicasProductos=false;		
		this.isPermisoDuplicarDiferenciasFisicasProductos=false;
		this.isPermisoOrdenDiferenciasFisicasProductos=false;
	}
	
	public void setPermisosUsuarioDiferenciasFisicasProductos(Boolean isPermiso) {
		this.isPermisoTodoDiferenciasFisicasProductos=isPermiso;
		this.isPermisoNuevoDiferenciasFisicasProductos=isPermiso;
		this.isPermisoActualizarDiferenciasFisicasProductos=isPermiso;
		this.isPermisoActualizarOriginalDiferenciasFisicasProductos=isPermiso;
		this.isPermisoEliminarDiferenciasFisicasProductos=isPermiso;
		this.isPermisoGuardarCambiosDiferenciasFisicasProductos=isPermiso;
		this.isPermisoConsultaDiferenciasFisicasProductos=isPermiso;
		this.isPermisoBusquedaDiferenciasFisicasProductos=isPermiso;
		this.isPermisoReporteDiferenciasFisicasProductos=isPermiso;
		this.isPermisoOrdenDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoPaginacionMedioDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoPaginacionAltoDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoPaginacionTodoDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoCopiarDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoVerFormDiferenciasFisicasProductos=isPermiso;		
		this.isPermisoDuplicarDiferenciasFisicasProductos=isPermiso;
		this.isPermisoOrdenDiferenciasFisicasProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDiferenciasFisicasProductos(Boolean isPermiso) {
		//this.isPermisoTodoDiferenciasFisicasProductos=isPermiso;
		this.isPermisoNuevoDiferenciasFisicasProductos=isPermiso;
		this.isPermisoActualizarDiferenciasFisicasProductos=isPermiso;
		this.isPermisoActualizarOriginalDiferenciasFisicasProductos=isPermiso;
		this.isPermisoEliminarDiferenciasFisicasProductos=isPermiso;
		this.isPermisoGuardarCambiosDiferenciasFisicasProductos=isPermiso;
		//this.isPermisoConsultaDiferenciasFisicasProductos=isPermiso;
		//this.isPermisoBusquedaDiferenciasFisicasProductos=isPermiso;
		//this.isPermisoReporteDiferenciasFisicasProductos=isPermiso;
		//this.isPermisoOrdenDiferenciasFisicasProductos=isPermiso;		
		//this.isPermisoPaginacionMedioDiferenciasFisicasProductos=isPermiso;		
		//this.isPermisoPaginacionAltoDiferenciasFisicasProductos=isPermiso;		
		//this.isPermisoPaginacionTodoDiferenciasFisicasProductos=isPermiso;		
		//this.isPermisoCopiarDiferenciasFisicasProductos=isPermiso;		
		//this.isPermisoDuplicarDiferenciasFisicasProductos=isPermiso;
		//this.isPermisoOrdenDiferenciasFisicasProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDiferenciasFisicasProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DiferenciasFisicasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDiferenciasFisicasProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDiferenciasFisicasProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDiferenciasFisicasProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDiferenciasFisicasProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDiferenciasFisicasProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DiferenciasFisicasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DiferenciasFisicasProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDiferenciasFisicasProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDiferenciasFisicasProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDiferenciasFisicasProductos=this.isPermisoActualizarDiferenciasFisicasProductos;
			this.isPermisoEliminarDiferenciasFisicasProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDiferenciasFisicasProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDiferenciasFisicasProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDiferenciasFisicasProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDiferenciasFisicasProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDiferenciasFisicasProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiferenciasFisicasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDiferenciasFisicasProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDiferenciasFisicasProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDiferenciasFisicasProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDiferenciasFisicasProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDiferenciasFisicasProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDiferenciasFisicasProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDiferenciasFisicasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDiferenciasFisicasProductos.setToolTipText(this.jTableDatosDiferenciasFisicasProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDiferenciasFisicasProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDiferenciasFisicasProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDiferenciasFisicasProductos() throws Exception {
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
	public void inicializarCombosForeignKeyDiferenciasFisicasProductosListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyDiferenciasFisicasProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DiferenciasFisicasProductosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyDiferenciasFisicasProductos()throws Exception {
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
			if(this.diferenciasfisicasproductosSessionBean==null) {
				this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean();
			}

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.diferenciasfisicasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyDiferenciasFisicasProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDiferenciasFisicasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDiferenciasFisicasProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDiferenciasFisicasProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDiferenciasFisicasProductos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDiferenciasFisicasProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDiferenciasFisicasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDiferenciasFisicasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDiferenciasFisicasProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDiferenciasFisicasProductos()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyDiferenciasFisicasProductos(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyDiferenciasFisicasProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public DiferenciasFisicasProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DiferenciasFisicasProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DiferenciasFisicasProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.diferenciasfisicasproductosSessionBean=new DiferenciasFisicasProductosSessionBean(); 
		this.diferenciasfisicasproductosConstantesFunciones=new DiferenciasFisicasProductosConstantesFunciones(); 
		this.diferenciasfisicasproductosBean=new DiferenciasFisicasProductos();//(this.diferenciasfisicasproductosConstantesFunciones); 		
		this.diferenciasfisicasproductosReturnGeneral=new DiferenciasFisicasProductosParameterReturnGeneral(); 
		
		this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diferenciasfisicasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DiferenciasFisicasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DiferenciasFisicasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DiferenciasFisicasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDiferenciasFisicasProductos(true);
			
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
			
			this.diferenciasfisicasproductosConstantesFunciones=new DiferenciasFisicasProductosConstantesFunciones(); 
			this.diferenciasfisicasproductosBean=new DiferenciasFisicasProductos();//this.diferenciasfisicasproductosConstantesFunciones); 			
			this.diferenciasfisicasproductosReturnGeneral=new DiferenciasFisicasProductosParameterReturnGeneral(); 
		
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Diferencias Fisicas Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.diferenciasfisicasproductos=new DiferenciasFisicasProductos();
			this.diferenciasfisicasproductoss = new ArrayList<DiferenciasFisicasProductos>();
			this.diferenciasfisicasproductossAux = new ArrayList<DiferenciasFisicasProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic=new DiferenciasFisicasProductosLogic();
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.diferenciasfisicasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.diferenciasfisicasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDiferenciasFisicasProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos);	
					}
					
					if(this.jInternalFrameImportacionDiferenciasFisicasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiferenciasFisicasProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDiferenciasFisicasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDiferenciasFisicasProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDiferenciasFisicasProductos);
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setVisible(false);
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos);
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDiferenciasFisicasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDiferenciasFisicasProductos);
					this.jInternalFrameImportacionDiferenciasFisicasProductos.setVisible(false);
					this.jInternalFrameImportacionDiferenciasFisicasProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDiferenciasFisicasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDiferenciasFisicasProductos);
					this.jInternalFrameOrderByDiferenciasFisicasProductos.setVisible(false);
					this.jInternalFrameOrderByDiferenciasFisicasProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDiferenciasFisicasProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DiferenciasFisicasProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.diferenciasfisicasproductosReturnGeneral=new DiferenciasFisicasProductosParameterReturnGeneral();
			
			this.diferenciasfisicasproductosParameterGeneral=new DiferenciasFisicasProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiferenciasFisicasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiferenciasFisicasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			
			
			this.isVisibilidadBusquedaDiferenciasFisicasProductos=true;
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
			
			//this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDiferenciasFisicasProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDiferenciasFisicasProductos(false);
			
			this.setPermisosUsuarioDiferenciasFisicasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado() && this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDiferenciasFisicasProductosClasesRelacionadas();
			}
			
			if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDiferenciasFisicasProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDiferenciasFisicasProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDiferenciasFisicasProductos();
			}
			
			if(!this.isPermisoBusquedaDiferenciasFisicasProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DiferenciasFisicasProductosConstantesFunciones.getTiposSeleccionarDiferenciasFisicasProductos());
				
				this.tiposColumnasSelect=DiferenciasFisicasProductosConstantesFunciones.getTiposSeleccionarDiferenciasFisicasProductos(true);
				
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
			//if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDiferenciasFisicasProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDiferenciasFisicasProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDiferenciasFisicasProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDiferenciasFisicasProductos() ;
			
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
				diferenciasfisicasproductosImplementable= (DiferenciasFisicasProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiferenciasFisicasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				diferenciasfisicasproductosImplementableHome= (DiferenciasFisicasProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiferenciasFisicasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.diferenciasfisicasproductoss= new ArrayList<DiferenciasFisicasProductos>();
			this.diferenciasfisicasproductossEliminados= new ArrayList<DiferenciasFisicasProductos>();
						
			this.isEsNuevoDiferenciasFisicasProductos=false;
			this.esParaAccionDesdeFormularioDiferenciasFisicasProductos=false;
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
				this.cargarCombosForeignKeyDiferenciasFisicasProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDiferenciasFisicasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DiferenciasFisicasProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDiferenciasFisicasProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDiferenciasFisicasProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDiferenciasFisicasProductos();
			}
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDiferenciasFisicasProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DiferenciasFisicasProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDiferenciasFisicasProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDiferenciasFisicasProductos")) {
				iIndex=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDiferenciasFisicasProductos();	
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
	
	public void cargarCombosForeignKeyDiferenciasFisicasProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDiferenciasFisicasProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDiferenciasFisicasProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDiferenciasFisicasProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDiferenciasFisicasProductos();
		
		this.cargarCombosFrameForeignKeyDiferenciasFisicasProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDiferenciasFisicasProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDiferenciasFisicasProductos();
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
	
	public void jButtonNuevoDiferenciasFisicasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			
			if(jTableDatosDiferenciasFisicasProductos.getRowCount()>=1) {
				jTableDatosDiferenciasFisicasProductos.removeRowSelectionInterval(0, jTableDatosDiferenciasFisicasProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoDiferenciasFisicasProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDiferenciasFisicasProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(true);			
			//this.diferenciasfisicasproductos=new DiferenciasFisicasProductos();
			//this.diferenciasfisicasproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos() ;
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiferenciasFisicasProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.diferenciasfisicasproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);				
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DiferenciasFisicasProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDiferenciasFisicasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDiferenciasFisicasProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDiferenciasFisicasProductos.getSelectedRows().length;			
			}
			
			diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDiferenciasFisicasProductos--;			
				//DiferenciasFisicasProductos diferenciasfisicasproductosAux= new DiferenciasFisicasProductos();			
				//diferenciasfisicasproductosAux.setId(this.iIdNuevoDiferenciasFisicasProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DiferenciasFisicasProductos diferenciasfisicasproductosOrigen=new DiferenciasFisicasProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DiferenciasFisicasProductos diferenciasfisicasproductosOrigen : diferenciasfisicasproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							diferenciasfisicasproductosOrigen =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diferenciasfisicasproductosOrigen =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDiferenciasFisicasProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.diferenciasfisicasproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDiferenciasFisicasProductos(diferenciasfisicasproductosOrigen,this.diferenciasfisicasproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().add(this.diferenciasfisicasproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductoss.add(this.diferenciasfisicasproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
				
				this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(this.getIndiceNuevoDiferenciasFisicasProductos(), this.getIndiceNuevoDiferenciasFisicasProductos());
				
				int iLastRow =  this.jTableDatosDiferenciasFisicasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiferenciasFisicasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiferenciasFisicasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();									
		
			DiferenciasFisicasProductos diferenciasfisicasproductosOrigen=new DiferenciasFisicasProductos();
			DiferenciasFisicasProductos diferenciasfisicasproductosDestino=new DiferenciasFisicasProductos();
				
			diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDiferenciasFisicasProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || diferenciasfisicasproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDiferenciasFisicasProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diferenciasfisicasproductosOrigen =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diferenciasfisicasproductosOrigen =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diferenciasfisicasproductosDestino =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diferenciasfisicasproductosDestino =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				diferenciasfisicasproductosOrigen =diferenciasfisicasproductossSeleccionados.get(0);
				diferenciasfisicasproductosDestino =diferenciasfisicasproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDiferenciasFisicasProductos(diferenciasfisicasproductosOrigen,diferenciasfisicasproductosDestino,true,false);
				
				diferenciasfisicasproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diferenciasfisicasproductosDestino,diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diferenciasfisicasproductosDestino,diferenciasfisicasproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
				
				//this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(this.getIndiceNuevoDiferenciasFisicasProductos(), this.getIndiceNuevoDiferenciasFisicasProductos());
				
				int iLastRow =  this.jTableDatosDiferenciasFisicasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDiferenciasFisicasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDiferenciasFisicasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDiferenciasFisicasProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(!isVisible);
			this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(!isVisible);
			this.jPanelAccionesDiferenciasFisicasProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDiferenciasFisicasProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDiferenciasFisicasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDiferenciasFisicasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDiferenciasFisicasProductos();
			
			this.abrirFrameOrderByDiferenciasFisicasProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDiferenciasFisicasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDiferenciasFisicasProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiferenciasFisicasProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.isMaximum()) {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSize(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.iWidthFormulario,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDiferenciasFisicasProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDiferenciasFisicasProductos.isMaximum()) {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jContentPaneDetalleDiferenciasFisicasProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jContentPaneDetalleDiferenciasFisicasProductos.getWidth(),DiferenciasFisicasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jContentPaneDetalleDiferenciasFisicasProductos.getWidth(),DiferenciasFisicasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jContentPaneDetalleDiferenciasFisicasProductos.getWidth(),DiferenciasFisicasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setVisible(true);
	        this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDiferenciasFisicasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDiferenciasFisicasProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDiferenciasFisicasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiferenciasFisicasProductos,false,this);
				} else {
					this.jInternalFrameOrderByDiferenciasFisicasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDiferenciasFisicasProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDiferenciasFisicasProductos);
				this.jInternalFrameOrderByDiferenciasFisicasProductos.setVisible(false);
				this.jInternalFrameOrderByDiferenciasFisicasProductos.setSelected(false);
				
				this.jInternalFrameOrderByDiferenciasFisicasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiferenciasFisicasProductos"));
				
				this.inicializarActualizarBindingTablaOrderByDiferenciasFisicasProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDiferenciasFisicasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDiferenciasFisicasProductos==null) {
				
				this.jInternalFrameImportacionDiferenciasFisicasProductos=new ImportacionJInternalFrame(DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDiferenciasFisicasProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDiferenciasFisicasProductos);
				this.jInternalFrameImportacionDiferenciasFisicasProductos.setVisible(false);
				this.jInternalFrameImportacionDiferenciasFisicasProductos.setSelected(false);


				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiferenciasFisicasProductos"));
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiferenciasFisicasProductos"));
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiferenciasFisicasProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDiferenciasFisicasProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos==null) {
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos=new ReporteDinamicoJInternalFrame(DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos);
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiferenciasFisicasProductos"));
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiferenciasFisicasProductos"));
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiferenciasFisicasProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiferenciasFisicasProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDiferenciasFisicasProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDiferenciasFisicasProductos);
			
	       	this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setVisible(false);
	        this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.dispose();
			//this.jInternalFrameDetalleFormDiferenciasFisicasProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDiferenciasFisicasProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDiferenciasFisicasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDiferenciasFisicasProductos.setVisible(true);
	        this.jInternalFrameImportacionDiferenciasFisicasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDiferenciasFisicasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setVisible(true);
	        this.jInternalFrameOrderByDiferenciasFisicasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDiferenciasFisicasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDiferenciasFisicasProductos.setVisible(false);
	        this.jInternalFrameOrderByDiferenciasFisicasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDiferenciasFisicasProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDiferenciasFisicasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDiferenciasFisicasProductos.setVisible(false);
	        this.jInternalFrameImportacionDiferenciasFisicasProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDiferenciasFisicasProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDiferenciasFisicasProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(true);
			//this.isEsNuevoDiferenciasFisicasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false) ;
			
			if(diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiferenciasFisicasProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDiferenciasFisicasProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDiferenciasFisicasProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(true);
			//this.isEsNuevoDiferenciasFisicasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.diferenciasfisicasproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false) ;
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDiferenciasFisicasProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDiferenciasFisicasProductos(false);
			
			//if(!this.isEsNuevoDiferenciasFisicasProductos) {								
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				
			}
			
			if(this.permiteMantenimiento(this.diferenciasfisicasproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDiferenciasFisicasProductos=true;
					this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
					this.isEsNuevoDiferenciasFisicasProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDiferenciasFisicasProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDiferenciasFisicasProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(false);
				
				this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(false);
			
												
				
				if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDiferenciasFisicasProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,diferenciasfisicasproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,diferenciasfisicasproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.diferenciasfisicasproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				this.diferenciasfisicasproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				this.diferenciasfisicasproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.diferenciasfisicasproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DiferenciasFisicasProductosModel) this.jTableDatosDiferenciasFisicasProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDiferenciasFisicasProductos=true;
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
				this.isEsNuevoDiferenciasFisicasProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(false);
				
				this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(false);
				
				
				
				if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDiferenciasFisicasProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDiferenciasFisicasProductos.getRowCount()>=1) {
				jTableDatosDiferenciasFisicasProductos.removeRowSelectionInterval(0, jTableDatosDiferenciasFisicasProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDiferenciasFisicasProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(false) ;
			
			this.isEsNuevoDiferenciasFisicasProductos=false;
			
			if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDiferenciasFisicasProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				
				//SI ES MANUAL
				if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDiferenciasFisicasProductos--;			
			//DiferenciasFisicasProductos diferenciasfisicasproductosAux= new DiferenciasFisicasProductos();			
			//diferenciasfisicasproductosAux.setId(this.iIdNuevoDiferenciasFisicasProductos);
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDiferenciasFisicasProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
			
			this.diferenciasfisicasproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().add(this.diferenciasfisicasproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.diferenciasfisicasproductoss.add(this.diferenciasfisicasproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			
			this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(this.getIndiceNuevoDiferenciasFisicasProductos(), this.getIndiceNuevoDiferenciasFisicasProductos());
			
			int iLastRow =  this.jTableDatosDiferenciasFisicasProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDiferenciasFisicasProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDiferenciasFisicasProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
			
			//SI ES MANUAL
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();
			}
			
			//this.abrirFrameTreeDiferenciasFisicasProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDiferenciasFisicasProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDiferenciasFisicasProductos.setFileImportacion(this.jInternalFrameImportacionDiferenciasFisicasProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDiferenciasFisicasProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDiferenciasFisicasProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		

		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DiferenciasFisicasProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DiferenciasFisicasProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadDisponible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadDisponible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadDisponible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadDisponible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadFisica_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadFisica_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadFisica_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadFisica_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_resos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_resos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_resos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_resos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponibleCorte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponibleCorte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponibleCorte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponibleCorte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoria="cantidad_disponible";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoria="cantidad_fisica";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoria="ingresos";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoria="egresos";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoria="disponible_corte";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA:
					sNombreCampoCategoria="diferencia";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					sNombreCampoCategoriaValor="cantidad_disponible";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA:
					sNombreCampoCategoriaValor="cantidad_fisica";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS:
					sNombreCampoCategoriaValor="ingresos";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS:
					sNombreCampoCategoriaValor="egresos";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE:
					sNombreCampoCategoriaValor="disponible_corte";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA:
					sNombreCampoCategoriaValor="diferencia";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Disponible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_disponible");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad Fisica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_fisica");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingresos");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Egresos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"egresos");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Disponible Corte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"disponible_corte");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Diferencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"diferencia");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
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
	
	public void jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DiferenciasFisicasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getfecha_ultima_venta_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getcantidad_disponible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getcantidad_fisica());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getingresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getegresos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getdisponible_corte());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getdiferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(DiferenciasFisicasProductos diferenciasfisicasproductos:diferenciasfisicasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(diferenciasfisicasproductos.gettotal());
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
			//	this.getFilaCabeceraExportarExcelDiferenciasFisicasProductos(row);				
			//	iRow++;
			//}				
			
			//for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDiferenciasFisicasProductos(diferenciasfisicasproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
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
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
			
			//SI ES MANUAL
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
			
			//SI ES MANUAL
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
			
			//SI ES MANUAL
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDiferenciasFisicasProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDiferenciasFisicasProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDiferenciasFisicasProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDiferenciasFisicasProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDiferenciasFisicasProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDiferenciasFisicasProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDiferenciasFisicasProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosDiferenciasFisicasProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosDiferenciasFisicasProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDiferenciasFisicasProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDiferenciasFisicasProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDiferenciasFisicasProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDiferenciasFisicasProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiferenciasFisicasProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDiferenciasFisicasProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDiferenciasFisicasProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDiferenciasFisicasProductos();
		
		this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDiferenciasFisicasProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDiferenciasFisicasProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDiferenciasFisicasProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDiferenciasFisicasProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDiferenciasFisicasProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionNuevoDiferenciasFisicasProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionSinCerrarDiferenciasFisicasProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jCheckBoxPostAccionSinMensajeDiferenciasFisicasProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDiferenciasFisicasProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDiferenciasFisicasProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDiferenciasFisicasProductos() throws Exception {
		try	{
			if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDiferenciasFisicasProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiferenciasFisicasProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDiferenciasFisicasProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDiferenciasFisicasProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDiferenciasFisicasProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDiferenciasFisicasProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.addItem(reporte);
			}
			
			
			if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDiferenciasFisicasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDiferenciasFisicasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiferenciasFisicasProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDiferenciasFisicasProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DiferenciasFisicasProductosConstantesFunciones.getTiposSeleccionarDiferenciasFisicasProductos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DiferenciasFisicasProductosConstantesFunciones.getTiposSeleccionarDiferenciasFisicasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DiferenciasFisicasProductosConstantesFunciones.getTiposSeleccionarDiferenciasFisicasProductos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDiferenciasFisicasProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_bodegaBusquedaDiferenciasFisicasProductos=((Bodega)this.jComboBoxid_bodegaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_productoBusquedaDiferenciasFisicasProductos=((Producto)this.jComboBoxid_productoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_lineaBusquedaDiferenciasFisicasProductos=((Linea)this.jComboBoxid_lineaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_linea_grupoBusquedaDiferenciasFisicasProductos=((Linea)this.jComboBoxid_linea_grupoBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaDiferenciasFisicasProductos=((Linea)this.jComboBoxid_linea_categoriaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()!=null){this.id_linea_marcaBusquedaDiferenciasFisicasProductos=((Linea)this.jComboBoxid_linea_marcaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getSelectedItem()).getId();}
		this.fecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductos=new Date(this.jDateChooserfecha_ultima_venta_hastaBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDiferenciasFisicasProductos(Boolean esInicializar) throws Exception {				
		if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDiferenciasFisicasProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDiferenciasFisicasProductos() throws Exception {
		this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDiferenciasFisicasProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDiferenciasFisicasProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDiferenciasFisicasProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=diferenciasfisicasproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDiferenciasFisicasProductos.setModel(new DiferenciasFisicasProductosModel(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDiferenciasFisicasProductos.setModel(new DiferenciasFisicasProductosModel(this.diferenciasfisicasproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDiferenciasFisicasProductos!=null && this.jInternalFrameOrderByDiferenciasFisicasProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDiferenciasFisicasProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,diferenciasfisicasproductosConstantesFunciones.resaltarSeleccionarDiferenciasFisicasProductos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DiferenciasFisicasProductosConstantesFunciones.SCLASSWEBTITULO,diferenciasfisicasproductosConstantesFunciones.resaltarSeleccionarDiferenciasFisicasProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_ID));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostraridDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaridDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaridDiferenciasFisicasProductos,iSizeTabla,this,true,"idDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaridDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaridDiferenciasFisicasProductos,this,true,"idDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigoDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcodigoDiferenciasFisicasProductos,iSizeTabla,this,true,"codigoDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcodigoDiferenciasFisicasProductos,this,true,"codigoDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombre_unidadDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombre_unidadDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarnombre_unidadDiferenciasFisicasProductos,iSizeTabla,this,true,"nombre_unidadDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombre_unidadDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarnombre_unidadDiferenciasFisicasProductos,this,true,"nombre_unidadDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_disponibleDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_disponibleDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_disponibleDiferenciasFisicasProductos,iSizeTabla,this,true,"cantidad_disponibleDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_disponibleDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_disponibleDiferenciasFisicasProductos,this,true,"cantidad_disponibleDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_fisicaDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_fisicaDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_fisicaDiferenciasFisicasProductos,iSizeTabla,this,true,"cantidad_fisicaDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_fisicaDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_fisicaDiferenciasFisicasProductos,this,true,"cantidad_fisicaDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigo_productoDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigo_productoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcodigo_productoDiferenciasFisicasProductos,iSizeTabla,this,true,"codigo_productoDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigo_productoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcodigo_productoDiferenciasFisicasProductos,this,true,"codigo_productoDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombreDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombreDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarnombreDiferenciasFisicasProductos,iSizeTabla,this,true,"nombreDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombreDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarnombreDiferenciasFisicasProductos,this,true,"nombreDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostraringresosDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaringresosDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaringresosDiferenciasFisicasProductos,iSizeTabla,this,true,"ingresosDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaringresosDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaringresosDiferenciasFisicasProductos,this,true,"ingresosDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostraregresosDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaregresosDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaregresosDiferenciasFisicasProductos,iSizeTabla,this,true,"egresosDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltaregresosDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activaregresosDiferenciasFisicasProductos,this,true,"egresosDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrardisponible_corteDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltardisponible_corteDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activardisponible_corteDiferenciasFisicasProductos,iSizeTabla,this,true,"disponible_corteDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltardisponible_corteDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activardisponible_corteDiferenciasFisicasProductos,this,true,"disponible_corteDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrardiferenciaDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltardiferenciaDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activardiferenciaDiferenciasFisicasProductos,iSizeTabla,this,true,"diferenciaDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltardiferenciaDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activardiferenciaDiferenciasFisicasProductos,this,true,"diferenciaDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrarcostoDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcostoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcostoDiferenciasFisicasProductos,iSizeTabla,this,true,"costoDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltarcostoDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activarcostoDiferenciasFisicasProductos,this,true,"costoDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL));

		if(this.diferenciasfisicasproductosConstantesFunciones.mostrartotalDiferenciasFisicasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltartotalDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activartotalDiferenciasFisicasProductos,iSizeTabla,this,true,"totalDiferenciasFisicasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diferenciasfisicasproductosConstantesFunciones.resaltartotalDiferenciasFisicasProductos,this.diferenciasfisicasproductosConstantesFunciones.activartotalDiferenciasFisicasProductos,this,true,"totalDiferenciasFisicasProductos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DiferenciasFisicasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiferenciasFisicasProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDiferenciasFisicasProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDiferenciasFisicasProductos.addColumn(tableColumn);
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
			
			this.jTableDatosDiferenciasFisicasProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDiferenciasFisicasProductos.moveColumn(this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDiferenciasFisicasProductos.moveColumn(this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDiferenciasFisicasProductos.moveColumn(this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDiferenciasFisicasProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDiferenciasFisicasProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDiferenciasFisicasProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDiferenciasFisicasProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDiferenciasFisicasProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDiferenciasFisicasProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=diferenciasfisicasproductoss.size()-1;
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
		//this.jTableDatosDiferenciasFisicasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDiferenciasFisicasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDiferenciasFisicasProductos();
			
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
				
				//this.isEsNuevoDiferenciasFisicasProductos=false;
					
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
				if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiferenciasFisicasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.diferenciasfisicasproductos.getsType().equals("DUPLICADO")
				   || this.diferenciasfisicasproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDiferenciasFisicasProductos=true;
				
				} else {
					this.isEsNuevoDiferenciasFisicasProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.diferenciasfisicasproductos.getId()>=0 && !this.diferenciasfisicasproductos.getIsNew()) {						
						this.isEsNuevoDiferenciasFisicasProductos=false;
						
					} else {
						this.isEsNuevoDiferenciasFisicasProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDiferenciasFisicasProductos(esRelaciones);						
				
				this.seleccionarDiferenciasFisicasProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.diferenciasfisicasproductos.getId()<0) {
					this.isEsNuevoDiferenciasFisicasProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDiferenciasFisicasProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDiferenciasFisicasProductos(evt,rowIndex);
				}	
				
				if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DiferenciasFisicasProductos: " + this.dDif); 
					}
				}								
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDiferenciasFisicasProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.diferenciasfisicasproductos)) {
					if(this.diferenciasfisicasproductos.getId()>0) {
						this.diferenciasfisicasproductos.setIsDeleted(true);
						
						this.diferenciasfisicasproductossEliminados.add(this.diferenciasfisicasproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().remove(this.diferenciasfisicasproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductoss.remove(this.diferenciasfisicasproductos);				
					}
					
					
					((DiferenciasFisicasProductosModel) this.jTableDatosDiferenciasFisicasProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDiferenciasFisicasProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDiferenciasFisicasProductos) {
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDiferenciasFisicasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDiferenciasFisicasProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDiferenciasFisicasProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDiferenciasFisicasProductos(diferenciasfisicasproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(diferenciasfisicasproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDiferenciasFisicasProductos(diferenciasfisicasproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDiferenciasFisicasProductos(diferenciasfisicasproductos);
	}
	
	public void setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getId().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcodigo());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getnombre());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getingresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getegresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getdiferencia().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcosto().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.gettotal().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DiferenciasFisicasProductos diferenciasfisicasproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,diferenciasfisicasproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DiferenciasFisicasProductos diferenciasfisicasproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				diferenciasfisicasproductosLocal=this.diferenciasfisicasproductos;
			} else {
				diferenciasfisicasproductosLocal=this.diferenciasfisicasproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(diferenciasfisicasproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDiferenciasFisicasProductos(diferenciasfisicasproductosLocal,true);
					
					if(diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(diferenciasfisicasproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(diferenciasfisicasproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(diferenciasfisicasproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(diferenciasfisicasproductos);
	}
	
	public void setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(diferenciasfisicasproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.getText()==null || this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.getText()=="" || this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setText("0");
			}

			if(conColumnasBase) {diferenciasfisicasproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelIdDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setcodigo(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigoDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setnombre_unidad(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombre_unidadDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setcantidad_disponible(Integer.parseInt(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_disponibleDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setcantidad_fisica(Integer.parseInt(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcantidad_fisicaDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setcodigo_producto(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcodigo_productoDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setnombre(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelnombreDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setingresos(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelingresosDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setegresos(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelegresosDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setdisponible_corte(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldisponible_corteDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setdiferencia(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeldiferenciaDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelcostoDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			diferenciasfisicasproductos.settotal(Double.parseDouble(this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabeltotalDiferenciasFisicasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductosBean,DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductosOrigen,DiferenciasFisicasProductos diferenciasfisicasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getId()!=null && !diferenciasfisicasproductosOrigen.getId().equals(0L))) {diferenciasfisicasproductos.setId(diferenciasfisicasproductosOrigen.getId());}}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getfecha_ultima_venta_hasta()!=null && !diferenciasfisicasproductosOrigen.getfecha_ultima_venta_hasta().equals(new Date()))) {diferenciasfisicasproductos.setfecha_ultima_venta_hasta(diferenciasfisicasproductosOrigen.getfecha_ultima_venta_hasta());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getcodigo()!=null && !diferenciasfisicasproductosOrigen.getcodigo().equals(""))) {diferenciasfisicasproductos.setcodigo(diferenciasfisicasproductosOrigen.getcodigo());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getnombre_unidad()!=null && !diferenciasfisicasproductosOrigen.getnombre_unidad().equals(""))) {diferenciasfisicasproductos.setnombre_unidad(diferenciasfisicasproductosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getcantidad_disponible()!=null && !diferenciasfisicasproductosOrigen.getcantidad_disponible().equals(0))) {diferenciasfisicasproductos.setcantidad_disponible(diferenciasfisicasproductosOrigen.getcantidad_disponible());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getcantidad_fisica()!=null && !diferenciasfisicasproductosOrigen.getcantidad_fisica().equals(0))) {diferenciasfisicasproductos.setcantidad_fisica(diferenciasfisicasproductosOrigen.getcantidad_fisica());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getcodigo_producto()!=null && !diferenciasfisicasproductosOrigen.getcodigo_producto().equals(""))) {diferenciasfisicasproductos.setcodigo_producto(diferenciasfisicasproductosOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getnombre()!=null && !diferenciasfisicasproductosOrigen.getnombre().equals(""))) {diferenciasfisicasproductos.setnombre(diferenciasfisicasproductosOrigen.getnombre());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getingresos()!=null && !diferenciasfisicasproductosOrigen.getingresos().equals(0.0))) {diferenciasfisicasproductos.setingresos(diferenciasfisicasproductosOrigen.getingresos());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getegresos()!=null && !diferenciasfisicasproductosOrigen.getegresos().equals(0.0))) {diferenciasfisicasproductos.setegresos(diferenciasfisicasproductosOrigen.getegresos());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getdisponible_corte()!=null && !diferenciasfisicasproductosOrigen.getdisponible_corte().equals(0.0))) {diferenciasfisicasproductos.setdisponible_corte(diferenciasfisicasproductosOrigen.getdisponible_corte());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getdiferencia()!=null && !diferenciasfisicasproductosOrigen.getdiferencia().equals(0.0))) {diferenciasfisicasproductos.setdiferencia(diferenciasfisicasproductosOrigen.getdiferencia());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.getcosto()!=null && !diferenciasfisicasproductosOrigen.getcosto().equals(0.0))) {diferenciasfisicasproductos.setcosto(diferenciasfisicasproductosOrigen.getcosto());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosOrigen.gettotal()!=null && !diferenciasfisicasproductosOrigen.gettotal().equals(0.0))) {diferenciasfisicasproductos.settotal(diferenciasfisicasproductosOrigen.gettotal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getId().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcodigo());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getnombre_unidad());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcodigo_producto());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getnombre());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getingresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getegresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getdiferencia().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.getcosto().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setText(diferenciasfisicasproductos.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDiferenciasFisicasProductos(DiferenciasFisicasProductosBean diferenciasfisicasproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getId().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getcodigo());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getcantidad_disponible().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getcantidad_fisica().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getcodigo_producto());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getnombre());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getingresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getegresos().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getdisponible_corte().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getdiferencia().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.getcosto().toString());
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setText(diferenciasfisicasproductosBean.gettotal().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDiferenciasFisicasProductos(DiferenciasFisicasProductosParameterReturnGeneral diferenciasfisicasproductosReturnGeneral,DiferenciasFisicasProductosBean diferenciasfisicasproductosBean,Boolean conDefault) throws Exception { 
		try {
			DiferenciasFisicasProductos diferenciasfisicasproductosLocal=new DiferenciasFisicasProductos();
			
			diferenciasfisicasproductosLocal=diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getId()!=null && !diferenciasfisicasproductosLocal.getId().equals(0L))) {diferenciasfisicasproductosBean.setId(diferenciasfisicasproductosLocal.getId());}}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getcodigo()!=null && !diferenciasfisicasproductosLocal.getcodigo().equals(""))) {diferenciasfisicasproductosBean.setcodigo(diferenciasfisicasproductosLocal.getcodigo());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getnombre_unidad()!=null && !diferenciasfisicasproductosLocal.getnombre_unidad().equals(""))) {diferenciasfisicasproductosBean.setnombre_unidad(diferenciasfisicasproductosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getcantidad_disponible()!=null && !diferenciasfisicasproductosLocal.getcantidad_disponible().equals(0))) {diferenciasfisicasproductosBean.setcantidad_disponible(diferenciasfisicasproductosLocal.getcantidad_disponible());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getcantidad_fisica()!=null && !diferenciasfisicasproductosLocal.getcantidad_fisica().equals(0))) {diferenciasfisicasproductosBean.setcantidad_fisica(diferenciasfisicasproductosLocal.getcantidad_fisica());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getcodigo_producto()!=null && !diferenciasfisicasproductosLocal.getcodigo_producto().equals(""))) {diferenciasfisicasproductosBean.setcodigo_producto(diferenciasfisicasproductosLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getnombre()!=null && !diferenciasfisicasproductosLocal.getnombre().equals(""))) {diferenciasfisicasproductosBean.setnombre(diferenciasfisicasproductosLocal.getnombre());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getingresos()!=null && !diferenciasfisicasproductosLocal.getingresos().equals(0.0))) {diferenciasfisicasproductosBean.setingresos(diferenciasfisicasproductosLocal.getingresos());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getegresos()!=null && !diferenciasfisicasproductosLocal.getegresos().equals(0.0))) {diferenciasfisicasproductosBean.setegresos(diferenciasfisicasproductosLocal.getegresos());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getdisponible_corte()!=null && !diferenciasfisicasproductosLocal.getdisponible_corte().equals(0.0))) {diferenciasfisicasproductosBean.setdisponible_corte(diferenciasfisicasproductosLocal.getdisponible_corte());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getdiferencia()!=null && !diferenciasfisicasproductosLocal.getdiferencia().equals(0.0))) {diferenciasfisicasproductosBean.setdiferencia(diferenciasfisicasproductosLocal.getdiferencia());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.getcosto()!=null && !diferenciasfisicasproductosLocal.getcosto().equals(0.0))) {diferenciasfisicasproductosBean.setcosto(diferenciasfisicasproductosLocal.getcosto());}
			if(conDefault || (!conDefault && diferenciasfisicasproductosLocal.gettotal()!=null && !diferenciasfisicasproductosLocal.gettotal().equals(0.0))) {diferenciasfisicasproductosBean.settotal(diferenciasfisicasproductosLocal.gettotal());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDiferenciasFisicasProductosGenerico(Long idDiferenciasFisicasProductosSeleccionado,JComboBox jComboBoxDiferenciasFisicasProductos,List<DiferenciasFisicasProductos> diferenciasfisicasproductossLocal)throws Exception {
		try {
			DiferenciasFisicasProductos  diferenciasfisicasproductosTemp=null;

			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossLocal) {
				if(diferenciasfisicasproductosAux.getId()!=null && diferenciasfisicasproductosAux.getId().equals(idDiferenciasFisicasProductosSeleccionado)) {
					diferenciasfisicasproductosTemp=diferenciasfisicasproductosAux;
					break;
				}
			}

			jComboBoxDiferenciasFisicasProductos.setSelectedItem(diferenciasfisicasproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDiferenciasFisicasProductosGenerico(JComboBox jComboBoxDiferenciasFisicasProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiferenciasFisicasProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDiferenciasFisicasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDiferenciasFisicasProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDiferenciasFisicasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDiferenciasFisicasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDiferenciasFisicasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diferenciasfisicasproductos=(DiferenciasFisicasProductos) diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diferenciasfisicasproductos =(DiferenciasFisicasProductos) diferenciasfisicasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!diferenciasfisicasproductos.getIsNew() && !diferenciasfisicasproductos.getIsChanged() && !diferenciasfisicasproductos.getIsDeleted()) {
				sDescripcion=diferenciasfisicasproductos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=diferenciasfisicasproductos.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DiferenciasFisicasProductos diferenciasfisicasproductosRow=new DiferenciasFisicasProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diferenciasfisicasproductosRow=(DiferenciasFisicasProductos) diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diferenciasfisicasproductosRow=(DiferenciasFisicasProductos) diferenciasfisicasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));			
			this.jButtonDuplicarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos && this.isPermisoDuplicarDiferenciasFisicasProductos));			
			this.jButtonCopiarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos && this.isPermisoCopiarDiferenciasFisicasProductos));
			this.jButtonVerFormDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos && this.isPermisoVerFormDiferenciasFisicasProductos));
			
			this.jButtonAbrirOrderByDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));			
			
			this.jButtonNuevoRelacionesDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));			
			this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaModificarDiferenciasFisicasProductos && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos && this.isPermisoEliminarDiferenciasFisicasProductos));
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.setVisible(this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos);							
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));						
			this.jButtonDuplicarToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos && this.isPermisoDuplicarDiferenciasFisicasProductos));						
			this.jButtonCopiarToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos && this.isPermisoCopiarDiferenciasFisicasProductos));			
			this.jButtonVerFormToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos && this.isPermisoVerFormDiferenciasFisicasProductos));			
			this.jButtonAbrirOrderByToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));
			this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));			
			this.jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));			
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaModificarDiferenciasFisicasProductos && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos  && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos && this.isPermisoEliminarDiferenciasFisicasProductos));
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarToolBarDiferenciasFisicasProductos.setVisible(this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos);				
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));			
			this.jMenuItemDuplicarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos && this.isPermisoDuplicarDiferenciasFisicasProductos));			
			this.jMenuItemCopiarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos && this.isPermisoCopiarDiferenciasFisicasProductos));			
			this.jMenuItemVerFormDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos && this.isPermisoVerFormDiferenciasFisicasProductos));			
			this.jMenuItemAbrirOrderByDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));			
			//this.jMenuItemMostrarOcultarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));
			this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));			
			//this.jMenuItemDetalleMostrarOcultarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos && this.isPermisoOrdenDiferenciasFisicasProductos));			
			this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos));			
			this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos && this.isPermisoNuevoDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));									
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemModificarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaModificarDiferenciasFisicasProductos && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemActualizarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos && this.isPermisoActualizarDiferenciasFisicasProductos));	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemEliminarDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos && this.isPermisoEliminarDiferenciasFisicasProductos));
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemCancelarDiferenciasFisicasProductos.setVisible(this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos);				
			}
			
			this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));						
			this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=this.jButtonNuevoDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos=this.jButtonDuplicarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos=this.jButtonCopiarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos=this.jButtonVerFormDiferenciasFisicasProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenDiferenciasFisicasProductos=this.jButtonAbrirOrderByDiferenciasFisicasProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=this.jButtonNuevoRelacionesDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=this.jButtonModificarDiferenciasFisicasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=this.jButtonNuevoToolBarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarToolBarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarToolBarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarToolBarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarToolBarDiferenciasFisicasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=this.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=this.jMenuItemNuevoDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemModificarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemActualizarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemEliminarDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemCancelarDiferenciasFisicasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDiferenciasFisicasProductos(Boolean esInicializar) {
		if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDiferenciasFisicasProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualDiferenciasFisicasProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDiferenciasFisicasProductos() {
		this.jButtonNuevoDiferenciasFisicasProductos.setVisible(this.isPermisoNuevoDiferenciasFisicasProductos);			
		this.jButtonDuplicarDiferenciasFisicasProductos.setVisible(this.isPermisoDuplicarDiferenciasFisicasProductos);			
		this.jButtonCopiarDiferenciasFisicasProductos.setVisible(this.isPermisoCopiarDiferenciasFisicasProductos);			
		this.jButtonVerFormDiferenciasFisicasProductos.setVisible(this.isPermisoVerFormDiferenciasFisicasProductos);			
		
		this.jButtonAbrirOrderByDiferenciasFisicasProductos.setVisible(this.isPermisoOrdenDiferenciasFisicasProductos);					
		
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.setVisible(this.isPermisoNuevoDiferenciasFisicasProductos);			
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarDiferenciasFisicasProductos.setVisible(this.isPermisoActualizarDiferenciasFisicasProductos);	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.setVisible(this.isPermisoActualizarDiferenciasFisicasProductos);	
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.setVisible(this.isPermisoEliminarDiferenciasFisicasProductos);
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.setVisible(this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos);						
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.setVisible(this.isPermisoGuardarCambiosDiferenciasFisicasProductos);							
		}
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.setVisible(this.isPermisoActualizarDiferenciasFisicasProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDiferenciasFisicasProductos() {
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarDiferenciasFisicasProductos.setVisible(this.isPermisoActualizarDiferenciasFisicasProductos);	
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.setVisible(this.isPermisoActualizarDiferenciasFisicasProductos);	
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.setVisible(this.isPermisoEliminarDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.setVisible(this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos);							
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.setVisible((this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos && this.isPermisoGuardarCambiosDiferenciasFisicasProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDiferenciasFisicasProductos() {
		if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDiferenciasFisicasProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDiferenciasFisicasProductos() {
	}
	
	public void jTableDatosDiferenciasFisicasProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDiferenciasFisicasProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.diferenciasfisicasproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.diferenciasfisicasproductos.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.diferenciasfisicasproductos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.diferenciasfisicasproductos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.diferenciasfisicasproductos.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.diferenciasfisicasproductos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.diferenciasfisicasproductos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.diferenciasfisicasproductos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaDiferenciasFisicasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebDiferenciasFisicasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDiferenciasFisicasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDiferenciasFisicasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.diferenciasfisicasproductosLogic.getConnexion());

				if(this.diferenciasfisicasproductos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.diferenciasfisicasproductos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDiferenciasFisicasProductos=(TitledBorder)this.jScrollPanelDatosDiferenciasFisicasProductos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderDiferenciasFisicasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.diferenciasfisicasproductos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getfecha_ultima_venta_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_ultima_venta_hasta = '"+Funciones2.getStringPostgresDate(this.diferenciasfisicasproductos.getfecha_ultima_venta_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.diferenciasfisicasproductos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.diferenciasfisicasproductos.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_disponibleDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getcantidad_disponible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_disponible = "+this.diferenciasfisicasproductos.getcantidad_disponible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_fisicaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getcantidad_fisica()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_fisica = "+this.diferenciasfisicasproductos.getcantidad_fisica().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.diferenciasfisicasproductos.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.diferenciasfisicasproductos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningresosDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getingresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingresos = "+this.diferenciasfisicasproductos.getingresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonegresosDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getegresos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where egresos = "+this.diferenciasfisicasproductos.getegresos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondisponible_corteDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getdisponible_corte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where disponible_corte = "+this.diferenciasfisicasproductos.getdisponible_corte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiferenciaDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getdiferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where diferencia = "+this.diferenciasfisicasproductos.getdiferencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.diferenciasfisicasproductos.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalDiferenciasFisicasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.getdiferenciasfisicasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.diferenciasfisicasproductos==null) {
						this.diferenciasfisicasproductos = new DiferenciasFisicasProductos();
					}

					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);
				}

				if(this.diferenciasfisicasproductos.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.diferenciasfisicasproductos.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossBusquedaDiferenciasFisicasProductos();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdBodega();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdEmpresa();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdLinea();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdLineaCategoria();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdLineaGrupo();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdLineaMarca();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdProducto();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDiferenciasFisicasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);

			this.getDiferenciasFisicasProductossFK_IdSucursal();

			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);

			//if(DiferenciasFisicasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diferenciasfisicasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDiferenciasFisicasProductos() {
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.dispose();
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
			this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.dispose();
			this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos=null;
		}
		
		if(this.jInternalFrameImportacionDiferenciasFisicasProductos!=null) {
			this.jInternalFrameImportacionDiferenciasFisicasProductos.setVisible(false);	    			
			this.jInternalFrameImportacionDiferenciasFisicasProductos.dispose();
			this.jInternalFrameImportacionDiferenciasFisicasProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDiferenciasFisicasProductos();
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDiferenciasFisicasProductos")) {
				jButtonDuplicarDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDiferenciasFisicasProductos")) {
				jButtonCopiarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormDiferenciasFisicasProductos")) {
				jButtonVerFormDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDiferenciasFisicasProductos")) {
				jButtonDuplicarDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDiferenciasFisicasProductos")) {
				jButtonDuplicarDiferenciasFisicasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDiferenciasFisicasProductos")) {
				jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDiferenciasFisicasProductos")) {
				jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDiferenciasFisicasProductos")) {
				jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDiferenciasFisicasProductos")) {
				jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDiferenciasFisicasProductos")) {
				jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDiferenciasFisicasProductos")) {
				jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarDiferenciasFisicasProductos")) {
				jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDiferenciasFisicasProductos")) {
				jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDiferenciasFisicasProductos")) {
				jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarDiferenciasFisicasProductos")) {
				jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDiferenciasFisicasProductos")) {
				jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDiferenciasFisicasProductos")) {
				jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarDiferenciasFisicasProductos")) {
				jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDiferenciasFisicasProductos")) {
				jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDiferenciasFisicasProductos")) {
				jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDiferenciasFisicasProductos")) {
				jButtonMostrarOcultarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDiferenciasFisicasProductos")) {
				jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDiferenciasFisicasProductos")) {
				jButtonCopiarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDiferenciasFisicasProductos")) {
				jButtonVerFormDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDiferenciasFisicasProductos")) {
				jButtonCopiarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDiferenciasFisicasProductos")) {
				jButtonVerFormDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDiferenciasFisicasProductos")) {
				jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDiferenciasFisicasProductos")) {
				jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDiferenciasFisicasProductos")) {
				jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDiferenciasFisicasProductos")) {
				jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDiferenciasFisicasProductos")) {
				jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDiferenciasFisicasProductos")) {
				jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDiferenciasFisicasProductos")) {
				jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDiferenciasFisicasProductos")) {
				jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDiferenciasFisicasProductos")) {
				jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDiferenciasFisicasProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByDiferenciasFisicasProductos")) {
				jButtonAbrirOrderByDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDiferenciasFisicasProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarDiferenciasFisicasProductos")) {
				jButtonMostrarOcultarDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDiferenciasFisicasProductos")) {
				jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDiferenciasFisicasProductos")) {
				jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDiferenciasFisicasProductos")) {
				jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDiferenciasFisicasProductos")) {
				jButtonCerrarReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDiferenciasFisicasProductos")) {
				jButtonGenerarReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDiferenciasFisicasProductos")) {
				
				jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDiferenciasFisicasProductos")) {
				jButtonCerrarImportacionDiferenciasFisicasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDiferenciasFisicasProductos")) {
				
				jButtonGenerarImportacionDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDiferenciasFisicasProductos")) {
				
				jButtonAbrirImportacionDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDiferenciasFisicasProductos")) {
				jComboBoxTiposAccionesDiferenciasFisicasProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDiferenciasFisicasProductos")) {
				jComboBoxTiposRelacionesDiferenciasFisicasProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDiferenciasFisicasProductos")) {
				jComboBoxTiposAccionesDiferenciasFisicasProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDiferenciasFisicasProductos")) {
				
				jComboBoxTiposSeleccionarDiferenciasFisicasProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDiferenciasFisicasProductos")) {
				jTextFieldValorCampoGeneralDiferenciasFisicasProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDiferenciasFisicasProductos")) {
				jButtonAbrirOrderByDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDiferenciasFisicasProductos")) {
				jButtonAbrirOrderByDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDiferenciasFisicasProductos")) {
				jButtonCerrarOrderByDiferenciasFisicasProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiferenciasFisicasProductosBusqueda")) {
				this.jButtonidDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_bodegaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_bodegaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_productoDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_productoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_empresaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_empresaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_sucursalDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_sucursalDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_lineaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_lineaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_grupoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_marcaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncodigoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDiferenciasFisicasProductosBusqueda")) {
				this.jButtonnombre_unidadDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncodigo_productoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiferenciasFisicasProductosBusqueda")) {
				this.jButtonnombreDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDiferenciasFisicasProductosBusqueda")) {
				this.jButtoningresosDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDiferenciasFisicasProductosBusqueda")) {
				this.jButtonegresosDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteDiferenciasFisicasProductosBusqueda")) {
				this.jButtondisponible_corteDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diferenciaDiferenciasFisicasProductosBusqueda")) {
				this.jButtondiferenciaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncostoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDiferenciasFisicasProductosBusqueda")) {
				this.jButtontotalDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos")) {
				this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductosActionPerformed(evt);
			}
			
			;
			
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDiferenciasFisicasProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DiferenciasFisicasProductos diferenciasfisicasproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				diferenciasfisicasproductosLocal=this.diferenciasfisicasproductos;
			} else {
				diferenciasfisicasproductosLocal=this.diferenciasfisicasproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
							
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
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
			
			


			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
								
						
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
								
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
							
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
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
			
			


			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
								
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDiferenciasFisicasProductos")) {
					jCheckBoxSeleccionarTodosDiferenciasFisicasProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDiferenciasFisicasProductos")) {
					jCheckBoxSeleccionadosDiferenciasFisicasProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDiferenciasFisicasProductos")) {
					
				}
				
				


				
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
												
				
				


				
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
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
			
			


			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.diferenciasfisicasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.diferenciasfisicasproductos);
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
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
				
				


				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DiferenciasFisicasProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DiferenciasFisicasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiferenciasFisicasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diferenciasfisicasproductosAnterior =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDiferenciasFisicasProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDiferenciasFisicasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDiferenciasFisicasProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.diferenciasfisicasproductos =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.diferenciasfisicasproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDiferenciasFisicasProductos")) {
				
				}
				
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDiferenciasFisicasProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDiferenciasFisicasProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDiferenciasFisicasProductos")) {
			
			}
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDiferenciasFisicasProductos();
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			if(sTipo.equals("NuevoDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDiferenciasFisicasProductos")) {
				jButtonDuplicarDiferenciasFisicasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDiferenciasFisicasProductos")) {
				jButtonCopiarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDiferenciasFisicasProductos")) {
				jButtonVerFormDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDiferenciasFisicasProductos")) {
				jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDiferenciasFisicasProductos")) {
				jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDiferenciasFisicasProductos")) {
				jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDiferenciasFisicasProductos")) {
				jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDiferenciasFisicasProductos")) {
				jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDiferenciasFisicasProductos")) {
				jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDiferenciasFisicasProductos")) {
				jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDiferenciasFisicasProductos")) {
				jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDiferenciasFisicasProductos")) {
				jButtonAbrirOrderByDiferenciasFisicasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDiferenciasFisicasProductos")) {
				jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDiferenciasFisicasProductos")) {
				jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDiferenciasFisicasProductos")) {
				jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiferenciasFisicasProductosBusqueda")) {
				this.jButtonidDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_bodegaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_bodegaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_productoDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_productoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_empresaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_empresaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_sucursalDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_sucursalDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_lineaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_lineaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_grupoDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_grupoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_categoriaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaDiferenciasFisicasProductosUpdate")) {
				this.jButtonid_linea_marcaDiferenciasFisicasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonid_linea_marcaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda")) {
				this.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncodigoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadDiferenciasFisicasProductosBusqueda")) {
				this.jButtonnombre_unidadDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_disponibleDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncantidad_disponibleDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_fisicaDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncantidad_fisicaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncodigo_productoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiferenciasFisicasProductosBusqueda")) {
				this.jButtonnombreDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingresosDiferenciasFisicasProductosBusqueda")) {
				this.jButtoningresosDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("egresosDiferenciasFisicasProductosBusqueda")) {
				this.jButtonegresosDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("disponible_corteDiferenciasFisicasProductosBusqueda")) {
				this.jButtondisponible_corteDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diferenciaDiferenciasFisicasProductosBusqueda")) {
				this.jButtondiferenciaDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoDiferenciasFisicasProductosBusqueda")) {
				this.jButtoncostoDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalDiferenciasFisicasProductosBusqueda")) {
				this.jButtontotalDiferenciasFisicasProductosBusquedaActionPerformed(evt);
			}
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDiferenciasFisicasProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDiferenciasFisicasProductos")) {
				closingInternalFrameDiferenciasFisicasProductos();
				
			} else if(sTipo.equals("jButtonCancelarDiferenciasFisicasProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormDiferenciasFisicasProductos = (JInternalFrameBase)evt.getSource();
	            	
	            DiferenciasFisicasProductosBeanSwingJInternalFrame jInternalFrameParent=(DiferenciasFisicasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormDiferenciasFisicasProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDiferenciasFisicasProductosActionPerformed(null);
			}
			
			DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.diferenciasfisicasproductos,new Object(),this.diferenciasfisicasproductosParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDiferenciasFisicasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDiferenciasFisicasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDiferenciasFisicasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.diferenciasfisicasproductos)) {
			if(!esControlTabla) {
				if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);			
				}
				
				if(this.diferenciasfisicasproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral,this.diferenciasfisicasproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.diferenciasfisicasproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDiferenciasFisicasProductos(classes,this.diferenciasfisicasproductosReturnGeneral,this.diferenciasfisicasproductosBean,false);
					}
						
					if(this.diferenciasfisicasproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos());	
					}
						
					if(this.diferenciasfisicasproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos(),classes);//this.diferenciasfisicasproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDiferenciasFisicasProductos(this.diferenciasfisicasproductos,classes);//this.diferenciasfisicasproductosBean);									
				}
			
				if(DiferenciasFisicasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDiferenciasFisicasProductos(this.diferenciasfisicasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDiferenciasFisicasProductos(this.diferenciasfisicasproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.diferenciasfisicasproductosAnterior!=null) {
						this.diferenciasfisicasproductos=this.diferenciasfisicasproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diferenciasfisicasproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos(),diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductos(),this.diferenciasfisicasproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDiferenciasFisicasProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosDiferenciasFisicasProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDiferenciasFisicasProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosDiferenciasFisicasProductos() throws Exception {
		
		DiferenciasFisicasProductosModel diferenciasfisicasproductosModel=(DiferenciasFisicasProductosModel)this.jTableDatosDiferenciasFisicasProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diferenciasfisicasproductosModel.diferenciasfisicasproductoss=this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			diferenciasfisicasproductosModel.diferenciasfisicasproductoss=this.diferenciasfisicasproductoss;
		}
		
		
		((DiferenciasFisicasProductosModel) this.jTableDatosDiferenciasFisicasProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDiferenciasFisicasProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdiferenciasfisicasproductosAnterior(),this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdiferenciasfisicasproductosAnterior(),this.diferenciasfisicasproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDiferenciasFisicasProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
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
										
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diferenciasfisicasproductos,new Object(),generalEntityParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DiferenciasFisicasProductosConstantesFunciones.getClassesRelationshipsOfDiferenciasFisicasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DiferenciasFisicasProductosConstantesFunciones.getClassesRelationshipsFromStringsOfDiferenciasFisicasProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDiferenciasFisicasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diferenciasfisicasproductos,new Object(),generalEntityParameterGeneral,this.diferenciasfisicasproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDiferenciasFisicasProductos(DiferenciasFisicasProductosBean diferenciasfisicasproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDiferenciasFisicasProductos(ArrayList<Classe> classes,DiferenciasFisicasProductosReturnGeneral diferenciasfisicasproductosReturnGeneral,DiferenciasFisicasProductosBean diferenciasfisicasproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.diferenciasfisicasproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos = new DiferenciasFisicasProductosDetalleFormJInternalFrame(jDesktopPane,this.diferenciasfisicasproductosSessionBean.getConGuardarRelaciones(),this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setVisible(false);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.diferenciasfisicasproductosLogic=this.diferenciasfisicasproductosLogic;
		
		this.cargarCombosFrameForeignKeyDiferenciasFisicasProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDiferenciasFisicasProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDiferenciasFisicasProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDiferenciasFisicasProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDiferenciasFisicasProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiferenciasFisicasProductos"));
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ModificarDiferenciasFisicasProductos"));

		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiferenciasFisicasProductos"));
					
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemModificarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiferenciasFisicasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"ActualizarDiferenciasFisicasProductos"));
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiferenciasFisicasProductos"));
						
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemActualizarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiferenciasFisicasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"EliminarDiferenciasFisicasProductos"));
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiferenciasFisicasProductos"));
								
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemEliminarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiferenciasFisicasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CancelarDiferenciasFisicasProductos"));
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiferenciasFisicasProductos"));
					
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemCancelarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiferenciasFisicasProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemDetalleCerrarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiferenciasFisicasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiferenciasFisicasProductos"));
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiferenciasFisicasProductos"));
		
		
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiferenciasFisicasProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonidDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombreDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoningresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonegresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondiferenciaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncostoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtontotalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"totalDiferenciasFisicasProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiferenciasFisicasProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDiferenciasFisicasProductos"));
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDiferenciasFisicasProductos"));
		}
		
		this.jTableDatosDiferenciasFisicasProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDiferenciasFisicasProductos"));
		
		this.jTableDatosDiferenciasFisicasProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDiferenciasFisicasProductos"));
		
		this.jButtonNuevoDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"NuevoDiferenciasFisicasProductos"));
		
		this.jButtonDuplicarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"DuplicarDiferenciasFisicasProductos"));
		
		this.jButtonCopiarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"CopiarDiferenciasFisicasProductos"));
		
		this.jButtonVerFormDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"VerFormDiferenciasFisicasProductos"));
		
		
		this.jButtonNuevoToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarDiferenciasFisicasProductos"));
			
		this.jButtonDuplicarToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemNuevoDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDiferenciasFisicasProductos"));
			
		this.jMenuItemDuplicarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDiferenciasFisicasProductos"));		
		
		
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDiferenciasFisicasProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDiferenciasFisicasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ModificarDiferenciasFisicasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonModificarToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDiferenciasFisicasProductos"));
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemModificarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDiferenciasFisicasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"ActualizarDiferenciasFisicasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonActualizarToolBarDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDiferenciasFisicasProductos"));
				
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemActualizarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDiferenciasFisicasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"EliminarDiferenciasFisicasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonEliminarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDiferenciasFisicasProductos"));
						
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemEliminarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDiferenciasFisicasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CancelarDiferenciasFisicasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonCancelarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDiferenciasFisicasProductos"));
			
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemCancelarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDiferenciasFisicasProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDiferenciasFisicasProductos"));		
		
		
		this.jButtonCerrarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CerrarDiferenciasFisicasProductos"));
		
		
		this.jButtonCerrarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemCerrarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDiferenciasFisicasProductos"));
			
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jMenuItemDetalleCerrarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDiferenciasFisicasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosDiferenciasFisicasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDiferenciasFisicasProductos"));
		}
		
		this.jButtonCopiarToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarDiferenciasFisicasProductos"));
			
		this.jButtonVerFormToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarDiferenciasFisicasProductos"));
		
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDiferenciasFisicasProductos"));
			
		this.jMenuItemCopiarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDiferenciasFisicasProductos"));		
		
		this.jMenuItemVerFormDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDiferenciasFisicasProductos"));		
		
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiferenciasFisicasProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDiferenciasFisicasProductos"));		
		
		
		
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionDiferenciasFisicasProductos"));
					
		this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDiferenciasFisicasProductos"));
		
		this.jMenuItemRecargarInformacionDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDiferenciasFisicasProductos"));		
		
		
		
		this.jButtonAnterioresDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"AnterioresDiferenciasFisicasProductos"));
		
		
		this.jButtonAnterioresToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDiferenciasFisicasProductos"));
		
		this.jMenuItemAnterioresDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDiferenciasFisicasProductos"));		
		
		
		this.jButtonSiguientesDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"SiguientesDiferenciasFisicasProductos"));
		
		
		this.jButtonSiguientesToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemSiguientesDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDiferenciasFisicasProductos"));
			
		this.jMenuItemAbrirOrderByDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDiferenciasFisicasProductos"));
			
		this.jMenuItemMostrarOcultarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDiferenciasFisicasProductos"));
			
		this.jMenuItemDetalleAbrirOrderByDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDiferenciasFisicasProductos"));
			
		this.jMenuItemDetalleMostarOcultarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDiferenciasFisicasProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDiferenciasFisicasProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDiferenciasFisicasProductos"));
			
		this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDiferenciasFisicasProductos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDiferenciasFisicasProductos"));

		this.jCheckBoxSeleccionadosDiferenciasFisicasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDiferenciasFisicasProductos"));
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDiferenciasFisicasProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesDiferenciasFisicasProductos"));
			
		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesDiferenciasFisicasProductos"));
					
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDiferenciasFisicasProductos"));
			
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDiferenciasFisicasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonidDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombreDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoningresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonegresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondiferenciaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncostoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtontotalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"totalDiferenciasFisicasProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"BusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos!=null) {
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiferenciasFisicasProductos"));
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiferenciasFisicasProductos"));
				this.jInternalFrameReporteDinamicoDiferenciasFisicasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiferenciasFisicasProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDiferenciasFisicasProductos"));				
			//this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDiferenciasFisicasProductos"));
			//this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDiferenciasFisicasProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDiferenciasFisicasProductos!=null) {
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDiferenciasFisicasProductos"));
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDiferenciasFisicasProductos"));
				this.jInternalFrameImportacionDiferenciasFisicasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDiferenciasFisicasProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByDiferenciasFisicasProductos"));
			
			this.jButtonAbrirOrderByToolBarDiferenciasFisicasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDiferenciasFisicasProductos"));			
			
			if(this.jInternalFrameOrderByDiferenciasFisicasProductos!=null) {
				this.jInternalFrameOrderByDiferenciasFisicasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDiferenciasFisicasProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTabbedPaneRelacionesDiferenciasFisicasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDiferenciasFisicasProductos"));
		
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
            		closingInternalFrameDiferenciasFisicasProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDiferenciasFisicasProductos = (JInternalFrameBase)event.getSource();
	            	
	            DiferenciasFisicasProductosBeanSwingJInternalFrame jInternalFrameParent=(DiferenciasFisicasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormDiferenciasFisicasProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDiferenciasFisicasProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDiferenciasFisicasProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDiferenciasFisicasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDiferenciasFisicasProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDiferenciasFisicasProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDiferenciasFisicasProductos";
		inputMap = this.jButtonNuevoRelacionesDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiferenciasFisicasProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDiferenciasFisicasProductos";
		inputMap = this.jButtonModificarDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDiferenciasFisicasProductos";
		inputMap = this.jButtonActualizarDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDiferenciasFisicasProductos";
		inputMap = this.jButtonEliminarDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDiferenciasFisicasProductos";
		inputMap = this.jButtonCancelarDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDiferenciasFisicasProductos";
		inputMap = this.jButtonCerrarDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDiferenciasFisicasProductos";
		inputMap = this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonGuardarCambiosDiferenciasFisicasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDiferenciasFisicasProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDiferenciasFisicasProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDiferenciasFisicasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDiferenciasFisicasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDiferenciasFisicasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDiferenciasFisicasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonidDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_bodegaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_empresaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_sucursalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_lineaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_grupoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_categoriaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaDiferenciasFisicasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonid_linea_marcaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonfecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_ultima_venta_hastaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombre_unidadDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_disponibleDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_disponibleDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncantidad_fisicaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_fisicaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncodigo_productoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonnombreDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoningresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"ingresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtonegresosDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"egresosDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondisponible_corteDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"disponible_corteDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtondiferenciaDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"diferenciaDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtoncostoDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"costoDiferenciasFisicasProductosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jButtontotalDiferenciasFisicasProductosBusqueda.addActionListener(new ButtonActionListener(this,"totalDiferenciasFisicasProductosBusqueda"));
		
		
		this.jButtonBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos.addActionListener(new ButtonActionListener(this,"BusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDiferenciasFisicasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDiferenciasFisicasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDiferenciasFisicasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDiferenciasFisicasProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDiferenciasFisicasProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
					diferenciasfisicasproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductoss) {
					diferenciasfisicasproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDiferenciasFisicasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
						diferenciasfisicasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductoss) {
						diferenciasfisicasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiferenciasFisicasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiferenciasFisicasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDiferenciasFisicasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDiferenciasFisicasProductos.getSelectedRows();
			
			DiferenciasFisicasProductos diferenciasfisicasproductosLocal=new DiferenciasFisicasProductos();
			
			//this.seleccionarTodosDiferenciasFisicasProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diferenciasfisicasproductosLocal =(DiferenciasFisicasProductos) this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss().toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					diferenciasfisicasproductosLocal =(DiferenciasFisicasProductos) this.diferenciasfisicasproductoss.toArray()[this.jTableDatosDiferenciasFisicasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				diferenciasfisicasproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
						diferenciasfisicasproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductoss) {
						diferenciasfisicasproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDiferenciasFisicasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDiferenciasFisicasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDiferenciasFisicasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDiferenciasFisicasProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDiferenciasFisicasProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDiferenciasFisicasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDiferenciasFisicasProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
				
						if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							diferenciasfisicasproductosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							diferenciasfisicasproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							diferenciasfisicasproductosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							diferenciasfisicasproductosAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diferenciasfisicasproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							diferenciasfisicasproductosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							diferenciasfisicasproductosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							diferenciasfisicasproductosAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA)) {
							existe=true;
							diferenciasfisicasproductosAux.setdiferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							diferenciasfisicasproductosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductoss) {
					
						if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
							existe=true;
							diferenciasfisicasproductosAux.setfecha_ultima_venta_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							diferenciasfisicasproductosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
							existe=true;
							diferenciasfisicasproductosAux.setcantidad_disponible(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA)) {
							existe=true;
							diferenciasfisicasproductosAux.setcantidad_fisica(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diferenciasfisicasproductosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS)) {
							existe=true;
							diferenciasfisicasproductosAux.setingresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS)) {
							existe=true;
							diferenciasfisicasproductosAux.setegresos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE)) {
							existe=true;
							diferenciasfisicasproductosAux.setdisponible_corte(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA)) {
							existe=true;
							diferenciasfisicasproductosAux.setdiferencia(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							diferenciasfisicasproductosAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							diferenciasfisicasproductosAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDiferenciasFisicasProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDiferenciasFisicasProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDiferenciasFisicasProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDiferenciasFisicasProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessDiferenciasFisicasProductos(conSplash);
				
					this.generarReporteDiferenciasFisicasProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDiferenciasFisicasProductossSeleccionados();
				//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiferenciasFisicasProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiferenciasFisicasProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiferenciasFisicasProductos();
				
				this.exportarDiferenciasFisicasProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDiferenciasFisicasProductoss();
				//this.importarDiferenciasFisicasProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDiferenciasFisicasProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDiferenciasFisicasProductossSeleccionados();
				//this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Diferencias Fisicas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDiferenciasFisicasProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDiferenciasFisicasProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDiferenciasFisicasProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(DiferenciasFisicasProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDiferenciasFisicasProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDiferenciasFisicasProductos(conSplash);
					
						//this.actualizarParametrosGeneralDiferenciasFisicasProductos();
						
						this.generarReporteProcesoAccionDiferenciasFisicasProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Diferencias Fisicas ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Diferencias Fisicas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDiferenciasFisicasProductos();
				
						this.actualizarParametrosGeneralDiferenciasFisicasProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.diferenciasfisicasproductosReturnGeneral=diferenciasfisicasproductosLogic.procesarAccionDiferenciasFisicasProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss(),this.diferenciasfisicasproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDiferenciasFisicasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDiferenciasFisicasProductos();
					
					DiferenciasFisicasProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDiferenciasFisicasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDiferenciasFisicasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxTiposAccionesFormularioDiferenciasFisicasProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDiferenciasFisicasProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDiferenciasFisicasProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDiferenciasFisicasProductos();
			
			if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
			DiferenciasFisicasProductos diferenciasfisicasproductos=new DiferenciasFisicasProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDiferenciasFisicasProductos.getSelectedItem();
			
			
			
			
			diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(diferenciasfisicasproductossSeleccionados.size()==1) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
					diferenciasfisicasproductos=diferenciasfisicasproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDiferenciasFisicasProductos();
			
      		//this.finishProcessDiferenciasFisicasProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDiferenciasFisicasProductosReturnGeneral() throws Exception {
		if(this.diferenciasfisicasproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.diferenciasfisicasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.diferenciasfisicasproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.diferenciasfisicasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.diferenciasfisicasproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.diferenciasfisicasproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
		}
		
		if(this.diferenciasfisicasproductosReturnGeneral.getConRetornoLista() || this.diferenciasfisicasproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.diferenciasfisicasproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diferenciasfisicasproductosLogic.setDiferenciasFisicasProductoss(this.diferenciasfisicasproductosReturnGeneral.getDiferenciasFisicasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDiferenciasFisicasProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralDiferenciasFisicasProductos() throws Exception {
		
		
	}
	
	public ArrayList<DiferenciasFisicasProductos> getDiferenciasFisicasProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDiferenciasFisicasProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss()) {
					if(diferenciasfisicasproductosAux.getIsSelected()) {
						diferenciasfisicasproductossSeleccionados.add(diferenciasfisicasproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:this.diferenciasfisicasproductoss) {
					if(diferenciasfisicasproductosAux.getIsSelected()) {
						diferenciasfisicasproductossSeleccionados.add(diferenciasfisicasproductosAux);				
					}
				}
			}
			
			if(diferenciasfisicasproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						diferenciasfisicasproductossSeleccionados.addAll(this.diferenciasfisicasproductosLogic.getDiferenciasFisicasProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						diferenciasfisicasproductossSeleccionados.addAll(this.diferenciasfisicasproductoss);				
					}
				}
			}
		} else {
			diferenciasfisicasproductossSeleccionados.add(this.diferenciasfisicasproductos);
		}
		
		return diferenciasfisicasproductossSeleccionados;
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
	
	public void generarReporteDiferenciasFisicasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDiferenciasFisicasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDiferenciasFisicasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiferenciasFisicasProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiferenciasFisicasProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Diferencias Fisicas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDiferenciasFisicasProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDiferenciasFisicasProductos();
		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDiferenciasFisicasProductos();
		
		
		//this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados ,diferenciasfisicasproductosImplementable,diferenciasfisicasproductosImplementableHome);
	}
	
	public void mostrarImportacionDiferenciasFisicasProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDiferenciasFisicasProductos();
		
		this.abrirFrameImportacionDiferenciasFisicasProductos();		
		
			
		//this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados ,diferenciasfisicasproductosImplementable,diferenciasfisicasproductosImplementableHome);
	}
	
	public void importarDiferenciasFisicasProductoss() throws Exception {		
	
	}
	
	public void exportarDiferenciasFisicasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDiferenciasFisicasProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDiferenciasFisicasProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDiferenciasFisicasProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Diferencias Fisicas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDiferenciasFisicasProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDiferenciasFisicasProductos(diferenciasfisicasproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//diferenciasfisicasproductosAux.setsDetalleGeneralEntityReporte(diferenciasfisicasproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDiferenciasFisicasProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=diferenciasfisicasproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getfecha_ultima_venta_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getcantidad_disponible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getcantidad_fisica().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getingresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getegresos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getdisponible_corte().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getdiferencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=diferenciasfisicasproductos.gettotal().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DiferenciasFisicasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDiferenciasFisicasProductos(row);				
				iRow++;
			}				
			
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDiferenciasFisicasProductos(diferenciasfisicasproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDiferenciasFisicasProductossSeleccionados() throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();		
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"diferenciasfisicasproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("diferenciasfisicasproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("diferenciasfisicasproductos");
			//elementRoot.appendChild(element);
		
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
				element = document.createElement("diferenciasfisicasproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDiferenciasFisicasProductos(diferenciasfisicasproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Diferencias Fisicas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDiferenciasFisicasProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_INGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_EGRESOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DISPONIBLECORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_DIFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DiferenciasFisicasProductosConstantesFunciones.LABEL_TOTAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getfecha_ultima_venta_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getcantidad_disponible());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getcantidad_fisica());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getingresos());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getegresos());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getdisponible_corte());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getdiferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(diferenciasfisicasproductos.gettotal());				
	}
	
	public void setFilaDatosExportarXmlDiferenciasFisicasProductos(DiferenciasFisicasProductos diferenciasfisicasproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DiferenciasFisicasProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(diferenciasfisicasproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DiferenciasFisicasProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(diferenciasfisicasproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(DiferenciasFisicasProductosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(diferenciasfisicasproductos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_ultima_venta_hasta = document.createElement(DiferenciasFisicasProductosConstantesFunciones.FECHAULTIMAVENTAHASTA);
		elementfecha_ultima_venta_hasta.appendChild(document.createTextNode(diferenciasfisicasproductos.getfecha_ultima_venta_hasta().toString().trim()));
		element.appendChild(elementfecha_ultima_venta_hasta);

		Element elementcodigo = document.createElement(DiferenciasFisicasProductosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(diferenciasfisicasproductos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_unidad = document.createElement(DiferenciasFisicasProductosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(diferenciasfisicasproductos.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad_disponible = document.createElement(DiferenciasFisicasProductosConstantesFunciones.CANTIDADDISPONIBLE);
		elementcantidad_disponible.appendChild(document.createTextNode(diferenciasfisicasproductos.getcantidad_disponible().toString().trim()));
		element.appendChild(elementcantidad_disponible);

		Element elementcantidad_fisica = document.createElement(DiferenciasFisicasProductosConstantesFunciones.CANTIDADFISICA);
		elementcantidad_fisica.appendChild(document.createTextNode(diferenciasfisicasproductos.getcantidad_fisica().toString().trim()));
		element.appendChild(elementcantidad_fisica);

		Element elementcodigo_producto = document.createElement(DiferenciasFisicasProductosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(diferenciasfisicasproductos.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre = document.createElement(DiferenciasFisicasProductosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(diferenciasfisicasproductos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementingresos = document.createElement(DiferenciasFisicasProductosConstantesFunciones.INGRESOS);
		elementingresos.appendChild(document.createTextNode(diferenciasfisicasproductos.getingresos().toString().trim()));
		element.appendChild(elementingresos);

		Element elementegresos = document.createElement(DiferenciasFisicasProductosConstantesFunciones.EGRESOS);
		elementegresos.appendChild(document.createTextNode(diferenciasfisicasproductos.getegresos().toString().trim()));
		element.appendChild(elementegresos);

		Element elementdisponible_corte = document.createElement(DiferenciasFisicasProductosConstantesFunciones.DISPONIBLECORTE);
		elementdisponible_corte.appendChild(document.createTextNode(diferenciasfisicasproductos.getdisponible_corte().toString().trim()));
		element.appendChild(elementdisponible_corte);

		Element elementdiferencia = document.createElement(DiferenciasFisicasProductosConstantesFunciones.DIFERENCIA);
		elementdiferencia.appendChild(document.createTextNode(diferenciasfisicasproductos.getdiferencia().toString().trim()));
		element.appendChild(elementdiferencia);

		Element elementcosto = document.createElement(DiferenciasFisicasProductosConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(diferenciasfisicasproductos.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementtotal = document.createElement(DiferenciasFisicasProductosConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(diferenciasfisicasproductos.gettotal().toString().trim()));
		element.appendChild(elementtotal);
	}
	
	public void generarReporteGroupGenericoDiferenciasFisicasProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados=new ArrayList<DiferenciasFisicasProductos>();
		
		diferenciasfisicasproductossSeleccionados=this.getDiferenciasFisicasProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDiferenciasFisicasProductos(diferenciasfisicasproductossSeleccionados);
		
		this.generarReporteDiferenciasFisicasProductoss("Todos",diferenciasfisicasproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDiferenciasFisicasProductos(ArrayList<DiferenciasFisicasProductos> diferenciasfisicasproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DiferenciasFisicasProductos diferenciasfisicasproductosAux:diferenciasfisicasproductossSeleccionados) {
				diferenciasfisicasproductosAux.setsDetalleGeneralEntityReporte(diferenciasfisicasproductosAux.toString());
			
				if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_FECHAULTIMAVENTAHASTA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(diferenciasfisicasproductosAux.getfecha_ultima_venta_hasta()));
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADDISPONIBLE)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getcantidad_disponible().toString());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CANTIDADFISICA)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getcantidad_fisica().toString());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(DiferenciasFisicasProductosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					diferenciasfisicasproductosAux.setsDescripcionGeneralEntityReporte1(diferenciasfisicasproductosAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiferenciasFisicasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDiferenciasFisicasProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=true;
				this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=true;
			}
			
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DiferenciasFisicasProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=true;
		} else {
			this.actualizarEstadoPanelsDiferenciasFisicasProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDiferenciasFisicasProductos=false;
			//this.isVisibilidadCeldaVerFormDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaDuplicarDiferenciasFisicasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!diferenciasfisicasproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;												
			}
			
			this.jButtonCerrarDiferenciasFisicasProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.diferenciasfisicasproductos)) {
			this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
			this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDiferenciasFisicasProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesDiferenciasFisicasProductos=false;
		this.isVisibilidadCeldaGuardarCambiosDiferenciasFisicasProductos=false;
		//this.isVisibilidadCeldaModificarDiferenciasFisicasProductos=true;
		this.isVisibilidadCeldaActualizarDiferenciasFisicasProductos=false;
		this.isVisibilidadCeldaEliminarDiferenciasFisicasProductos=false;
		//this.isVisibilidadCeldaCancelarDiferenciasFisicasProductos=true;			
		this.isVisibilidadCeldaGuardarDiferenciasFisicasProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDiferenciasFisicasProductos() {
	}
	
	public void actualizarEstadoPanelsDiferenciasFisicasProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosEdicionDiferenciasFisicasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDiferenciasFisicasProductos!=null) {
				this.jScrollPanelDatosDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDiferenciasFisicasProductos!=null) {
				this.jPanelPaginacionDiferenciasFisicasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
					this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.diferenciasfisicasproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos!=null) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDiferenciasFisicasProductos!=null) {
				this.jPanelParametrosReportesDiferenciasFisicasProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaBodega;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaProducto;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaLinea;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaDiferenciasFisicasProductos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaDiferenciasFisicasProductos) {this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);}
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
			
			this.inicializarActualizarBindingTablaDiferenciasFisicasProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDiferenciasFisicasProductos() {
		this.updateBorderResaltarBusquedasFormularioDiferenciasFisicasProductos();
		this.updateVisibilidadBusquedasFormularioDiferenciasFisicasProductos();
		this.updateHabilitarBusquedasFormularioDiferenciasFisicasProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioDiferenciasFisicasProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponents().length>0) {
	

		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos!=null) {
			index= this.jTabbedPaneBusquedasDiferenciasFisicasProductos.indexOfComponent(this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponent(index);
				jPanel.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDiferenciasFisicasProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiferenciasFisicasProductos.indexOfComponent(this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			if(!this.diferenciasfisicasproductosConstantesFunciones.mostrarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos && index>-1) {
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDiferenciasFisicasProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDiferenciasFisicasProductos.indexOfComponent(this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
				this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setEnabledAt(index,this.diferenciasfisicasproductosConstantesFunciones.activarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDiferenciasFisicasProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDiferenciasFisicasProductos")) {
			index= this.jTabbedPaneBusquedasDiferenciasFisicasProductos.indexOfComponent(this.jPanelBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);

			this.jTabbedPaneBusquedasDiferenciasFisicasProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDiferenciasFisicasProductos.getComponent(index);

			this.diferenciasfisicasproductosConstantesFunciones.setResaltarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos(resaltar);

			jPanel.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarBusquedaDiferenciasFisicasProductosDiferenciasFisicasProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDiferenciasFisicasProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDiferenciasFisicasProductos() throws Exception {

		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDiferenciasFisicasProductos();
		this.updateVisibilidadResaltarControlesFormularioDiferenciasFisicasProductos();
		this.updateHabilitarResaltarControlesFormularioDiferenciasFisicasProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioDiferenciasFisicasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltaridDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltaridDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_bodegaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_bodegaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_productoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_productoDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_empresaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_empresaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_sucursalDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_sucursalDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_lineaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_lineaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_grupoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_grupoDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_categoriaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_categoriaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_marcaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarid_linea_marcaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarfecha_ultima_venta_hastaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarfecha_ultima_venta_hastaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigoDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombre_unidadDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombre_unidadDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_disponibleDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_disponibleDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_fisicaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarcantidad_fisicaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigo_productoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarcodigo_productoDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombreDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarnombreDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltaringresosDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltaringresosDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltaregresosDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltaregresosDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltardisponible_corteDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltardisponible_corteDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltardiferenciaDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltardiferenciaDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltarcostoDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltarcostoDiferenciasFisicasProductos);}
		if(this.diferenciasfisicasproductosConstantesFunciones.resaltartotalDiferenciasFisicasProductos!=null && this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setBorder(this.diferenciasfisicasproductosConstantesFunciones.resaltartotalDiferenciasFisicasProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDiferenciasFisicasProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
	
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraridDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelidDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraridDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_bodegaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_bodegaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_bodegaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_productoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_productoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_productoDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_empresaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_empresaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_empresaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_sucursalDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_sucursalDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_sucursalDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_lineaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_lineaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_lineaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_grupoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_linea_grupoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_grupoDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_categoriaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_linea_categoriaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_categoriaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_marcaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelid_linea_marcaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarid_linea_marcaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarfecha_ultima_venta_hastaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelfecha_ultima_venta_hastaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarfecha_ultima_venta_hastaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelcodigoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigoDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombre_unidadDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelnombre_unidadDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombre_unidadDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_disponibleDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelcantidad_disponibleDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_disponibleDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_fisicaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelcantidad_fisicaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcantidad_fisicaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigo_productoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelcodigo_productoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcodigo_productoDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombreDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelnombreDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarnombreDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraringresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelingresosDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraringresosDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraregresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelegresosDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostraregresosDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrardisponible_corteDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPaneldisponible_corteDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrardisponible_corteDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrardiferenciaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPaneldiferenciaDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrardiferenciaDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcostoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPanelcostoDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrarcostoDiferenciasFisicasProductos);
		//this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrartotalDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jPaneltotalDiferenciasFisicasProductos.setVisible(this.diferenciasfisicasproductosConstantesFunciones.mostrartotalDiferenciasFisicasProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDiferenciasFisicasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDiferenciasFisicasProductos!=null) {
	
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jLabelidDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activaridDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_bodegaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_bodegaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_productoDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_productoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_empresaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_empresaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_sucursalDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_sucursalDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_lineaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_lineaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_grupoDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_grupoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_categoriaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_categoriaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jComboBoxid_linea_marcaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarid_linea_marcaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jDateChooserfecha_ultima_venta_hastaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarfecha_ultima_venta_hastaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreacodigoDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarcodigoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldnombre_unidadDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarnombre_unidadDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_disponibleDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_disponibleDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcantidad_fisicaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarcantidad_fisicaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcodigo_productoDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarcodigo_productoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextAreanombreDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarnombreDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldingresosDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activaringresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldegresosDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activaregresosDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddisponible_corteDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activardisponible_corteDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFielddiferenciaDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activardiferenciaDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldcostoDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activarcostoDiferenciasFisicasProductos);
		this.jInternalFrameDetalleFormDiferenciasFisicasProductos.jTextFieldtotalDiferenciasFisicasProductos.setEnabled(this.diferenciasfisicasproductosConstantesFunciones.activartotalDiferenciasFisicasProductos);
		}
	}
	
		
}