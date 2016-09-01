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

//import com.bydan.erp.inventario.util.ProcesoPreciosFactorConstantesFunciones;
import com.bydan.erp.inventario.util.report.ProcesoPreciosFactorParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ProcesoPreciosFactorParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ProcesoPreciosFactorBean;
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
public class ProcesoPreciosFactorBeanSwingJInternalFrame extends ProcesoPreciosFactorJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProcesoPreciosFactorBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ProcesoPreciosFactor> procesopreciosfactorValidator = new ClassValidator<ProcesoPreciosFactor>(ProcesoPreciosFactor.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ProcesoPreciosFactor procesopreciosfactor;	
	public ProcesoPreciosFactor procesopreciosfactorAux;
	public ProcesoPreciosFactor procesopreciosfactorAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ProcesoPreciosFactor procesopreciosfactorTotales;
	public Long idProcesoPreciosFactorActual;
	public Long iIdNuevoProcesoPreciosFactor=0L;
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
	
	public Boolean isPermisoTodoProcesoPreciosFactor;
	public Boolean isPermisoNuevoProcesoPreciosFactor;
	public Boolean isPermisoActualizarProcesoPreciosFactor;
	public Boolean isPermisoActualizarOriginalProcesoPreciosFactor;
	public Boolean isPermisoEliminarProcesoPreciosFactor;
	public Boolean isPermisoGuardarCambiosProcesoPreciosFactor;
	public Boolean isPermisoConsultaProcesoPreciosFactor;
	public Boolean isPermisoBusquedaProcesoPreciosFactor;
	public Boolean isPermisoReporteProcesoPreciosFactor;
	public Boolean isPermisoPaginacionMedioProcesoPreciosFactor;
	public Boolean isPermisoPaginacionAltoProcesoPreciosFactor;
	public Boolean isPermisoPaginacionTodoProcesoPreciosFactor;
	public Boolean isPermisoCopiarProcesoPreciosFactor;
	public Boolean isPermisoVerFormProcesoPreciosFactor;
	public Boolean isPermisoDuplicarProcesoPreciosFactor;
	public Boolean isPermisoOrdenProcesoPreciosFactor;
	
	
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
	
	public ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorReturnGeneral;
	public ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProcesoPreciosFactor=false;
	public Boolean esParaAccionDesdeFormularioProcesoPreciosFactor=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProcesoPreciosFactorSessionBeanAdditional procesopreciosfactorSessionBeanAdditional=null;
	
	public ProcesoPreciosFactorSessionBeanAdditional getProcesoPreciosFactorSessionBeanAdditional() {
		return this.procesopreciosfactorSessionBeanAdditional;
	}
	
	public void setProcesoPreciosFactorSessionBeanAdditional(ProcesoPreciosFactorSessionBeanAdditional procesopreciosfactorSessionBeanAdditional) {
		try {
			this.procesopreciosfactorSessionBeanAdditional=procesopreciosfactorSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProcesoPreciosFactorBeanSwingJInternalFrameAdditional procesopreciosfactorBeanSwingJInternalFrameAdditional=null;
	//public class ProcesoPreciosFactorBeanSwingJInternalFrame
	
	public ProcesoPreciosFactorBeanSwingJInternalFrameAdditional getProcesoPreciosFactorBeanSwingJInternalFrameAdditional() {
		return this.procesopreciosfactorBeanSwingJInternalFrameAdditional;
	}
	
	public void setProcesoPreciosFactorBeanSwingJInternalFrameAdditional(ProcesoPreciosFactorBeanSwingJInternalFrameAdditional procesopreciosfactorBeanSwingJInternalFrameAdditional) {
		try {
			this.procesopreciosfactorBeanSwingJInternalFrameAdditional=procesopreciosfactorBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProcesoPreciosFactorLogic procesopreciosfactorLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ProcesoPreciosFactor procesopreciosfactorBean;
	public ProcesoPreciosFactorConstantesFunciones procesopreciosfactorConstantesFunciones;
	//public ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorReturnGeneral;
	
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
	
	
	//public List<ProcesoPreciosFactor> procesopreciosfactors;	
	//public List<ProcesoPreciosFactor> procesopreciosfactorsEliminados;
	//public List<ProcesoPreciosFactor> procesopreciosfactorsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaDuplicarProcesoPreciosFactor=true;
	public Boolean isVisibilidadCeldaCopiarProcesoPreciosFactor=true;
	public Boolean isVisibilidadCeldaVerFormProcesoPreciosFactor=true;
	public Boolean isVisibilidadCeldaOrdenProcesoPreciosFactor=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaModificarProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaCancelarProcesoPreciosFactor=false;
	public Boolean isVisibilidadCeldaGuardarProcesoPreciosFactor=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;	
	
	
	public Boolean isVisibilidadBusquedaProcesoPreciosFactor=false;
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoProcesoPreciosFactor() {
		return this.iIdNuevoProcesoPreciosFactor;
	}

	public void setiIdNuevoProcesoPreciosFactor(Long iIdNuevoProcesoPreciosFactor) {
		this.iIdNuevoProcesoPreciosFactor = iIdNuevoProcesoPreciosFactor;
	}
	
	public Long getidProcesoPreciosFactorActual() {
		return this.idProcesoPreciosFactorActual;
	}

	public void setidProcesoPreciosFactorActual(Long idProcesoPreciosFactorActual) {
		this.idProcesoPreciosFactorActual = idProcesoPreciosFactorActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ProcesoPreciosFactor getprocesopreciosfactor() {
		return this.procesopreciosfactor;
	}

	public void setprocesopreciosfactor(ProcesoPreciosFactor procesopreciosfactor) {
		this.procesopreciosfactor = procesopreciosfactor;
	}
	
	public ProcesoPreciosFactor getprocesopreciosfactorAux() {
		return this.procesopreciosfactorAux;
	}

	public void setprocesopreciosfactorAux(ProcesoPreciosFactor procesopreciosfactorAux) {
		this.procesopreciosfactorAux = procesopreciosfactorAux;
	}				
	
	public ProcesoPreciosFactor getprocesopreciosfactorAnterior() {
		return this.procesopreciosfactorAnterior;
	}

	public void setprocesopreciosfactorAnterior(ProcesoPreciosFactor procesopreciosfactorAnterior) {
		this.procesopreciosfactorAnterior = procesopreciosfactorAnterior;
	}	
	
	public ProcesoPreciosFactor getprocesopreciosfactorTotales() {
		return this.procesopreciosfactorTotales;
	}

	public void setprocesopreciosfactorTotales(ProcesoPreciosFactor procesopreciosfactorTotales) {
		this.procesopreciosfactorTotales = procesopreciosfactorTotales;
	}	
	
	public ProcesoPreciosFactor getprocesopreciosfactorBean() {
		return this.procesopreciosfactorBean;
	}

	public void setprocesopreciosfactorBean(ProcesoPreciosFactor procesopreciosfactorBean) {
		this.procesopreciosfactorBean = procesopreciosfactorBean;
	}	
	
	public ProcesoPreciosFactorParameterReturnGeneral getprocesopreciosfactorReturnGeneral() {
		return this.procesopreciosfactorReturnGeneral;
	}

	public void setprocesopreciosfactorReturnGeneral(ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorReturnGeneral) {
		this.procesopreciosfactorReturnGeneral = procesopreciosfactorReturnGeneral;
	}	
	
	
	public Long id_bodegaBusquedaProcesoPreciosFactor=-1L;

	public Long getid_bodegaBusquedaProcesoPreciosFactor() {
		return this.id_bodegaBusquedaProcesoPreciosFactor;
	}

	public void setid_bodegaBusquedaProcesoPreciosFactor(Long id_bodegaBusquedaProcesoPreciosFactor) {
		this.id_bodegaBusquedaProcesoPreciosFactor = id_bodegaBusquedaProcesoPreciosFactor;
	}

;
	public Long id_productoBusquedaProcesoPreciosFactor=-1L;

	public Long getid_productoBusquedaProcesoPreciosFactor() {
		return this.id_productoBusquedaProcesoPreciosFactor;
	}

	public void setid_productoBusquedaProcesoPreciosFactor(Long id_productoBusquedaProcesoPreciosFactor) {
		this.id_productoBusquedaProcesoPreciosFactor = id_productoBusquedaProcesoPreciosFactor;
	}

;
	public Long id_lineaBusquedaProcesoPreciosFactor=-1L;

	public Long getid_lineaBusquedaProcesoPreciosFactor() {
		return this.id_lineaBusquedaProcesoPreciosFactor;
	}

	public void setid_lineaBusquedaProcesoPreciosFactor(Long id_lineaBusquedaProcesoPreciosFactor) {
		this.id_lineaBusquedaProcesoPreciosFactor = id_lineaBusquedaProcesoPreciosFactor;
	}

;
	public Long id_linea_grupoBusquedaProcesoPreciosFactor=-1L;

	public Long getid_linea_grupoBusquedaProcesoPreciosFactor() {
		return this.id_linea_grupoBusquedaProcesoPreciosFactor;
	}

	public void setid_linea_grupoBusquedaProcesoPreciosFactor(Long id_linea_grupoBusquedaProcesoPreciosFactor) {
		this.id_linea_grupoBusquedaProcesoPreciosFactor = id_linea_grupoBusquedaProcesoPreciosFactor;
	}

;
	public Long id_linea_categoriaBusquedaProcesoPreciosFactor=-1L;

	public Long getid_linea_categoriaBusquedaProcesoPreciosFactor() {
		return this.id_linea_categoriaBusquedaProcesoPreciosFactor;
	}

	public void setid_linea_categoriaBusquedaProcesoPreciosFactor(Long id_linea_categoriaBusquedaProcesoPreciosFactor) {
		this.id_linea_categoriaBusquedaProcesoPreciosFactor = id_linea_categoriaBusquedaProcesoPreciosFactor;
	}

;
	public Long id_linea_marcaBusquedaProcesoPreciosFactor=-1L;

	public Long getid_linea_marcaBusquedaProcesoPreciosFactor() {
		return this.id_linea_marcaBusquedaProcesoPreciosFactor;
	}

	public void setid_linea_marcaBusquedaProcesoPreciosFactor(Long id_linea_marcaBusquedaProcesoPreciosFactor) {
		this.id_linea_marcaBusquedaProcesoPreciosFactor = id_linea_marcaBusquedaProcesoPreciosFactor;
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
	
	
	public ProcesoPreciosFactorLogic getProcesoPreciosFactorLogic()	{		
		return procesopreciosfactorLogic;
	}

	public void setProcesoPreciosFactorLogic(ProcesoPreciosFactorLogic procesopreciosfactorLogic) {
		this.procesopreciosfactorLogic = procesopreciosfactorLogic;
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
	
	public Boolean getIsEsNuevoProcesoPreciosFactor() {
		return isEsNuevoProcesoPreciosFactor;
	}

	public void setIsEsNuevoProcesoPreciosFactor(Boolean isEsNuevoProcesoPreciosFactor) {
		this.isEsNuevoProcesoPreciosFactor = isEsNuevoProcesoPreciosFactor;
	}

	public Boolean getEsParaAccionDesdeFormularioProcesoPreciosFactor() {
		return esParaAccionDesdeFormularioProcesoPreciosFactor;
	}
	
	public void setEsParaAccionDesdeFormularioProcesoPreciosFactor(Boolean esParaAccionDesdeFormularioProcesoPreciosFactor) {
		this.esParaAccionDesdeFormularioProcesoPreciosFactor = esParaAccionDesdeFormularioProcesoPreciosFactor;
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidBodegaActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidProductoActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidEmpresaActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidSucursalActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidLineaActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidLineaGrupoActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidLineaCategoriaActual());
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

			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(procesopreciosfactorSessionBean.getlidLineaMarcaActual());
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaProcesoPreciosFactor.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_bodegaProcesoPreciosFactorGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaProcesoPreciosFactorGenerico!=null && jComboBoxid_bodegaProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_bodegaProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoProcesoPreciosFactor.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_productoProcesoPreciosFactorGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoProcesoPreciosFactorGenerico!=null && jComboBoxid_productoProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_productoProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaProcesoPreciosFactor.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_empresaProcesoPreciosFactorGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaProcesoPreciosFactorGenerico!=null && jComboBoxid_empresaProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_empresaProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalProcesoPreciosFactor.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_sucursalProcesoPreciosFactorGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalProcesoPreciosFactorGenerico!=null && jComboBoxid_sucursalProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_sucursalProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaProcesoPreciosFactor.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_lineaProcesoPreciosFactorGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaProcesoPreciosFactorGenerico!=null && jComboBoxid_lineaProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_lineaProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_linea_grupoProcesoPreciosFactorGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoProcesoPreciosFactorGenerico!=null && jComboBoxid_linea_grupoProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico!=null && jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico.setSelectedIndex(0);
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

					if(this.procesopreciosfactor!=null) {
						this.procesopreciosfactor.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.getItemCount()>0) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
						jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
							//jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaProcesoPreciosFactorGenerico)throws Exception
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
				jComboBoxid_linea_marcaProcesoPreciosFactorGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaProcesoPreciosFactorGenerico!=null && jComboBoxid_linea_marcaProcesoPreciosFactorGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaProcesoPreciosFactorGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_bodegaProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaProcesoPreciosFactorGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				procesopreciosfactor.setid_bodega(bodegaAux.getId());
				procesopreciosfactor.setbodega_descripcion(ProcesoPreciosFactorConstantesFunciones.getBodegaDescripcion(bodegaAux));
				procesopreciosfactor.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_productoProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoProcesoPreciosFactorGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				procesopreciosfactor.setid_producto(productoAux.getId());
				procesopreciosfactor.setproducto_descripcion(ProcesoPreciosFactorConstantesFunciones.getProductoDescripcion(productoAux));
				procesopreciosfactor.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_empresaProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaProcesoPreciosFactorGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				procesopreciosfactor.setid_empresa(empresaAux.getId());
				procesopreciosfactor.setempresa_descripcion(ProcesoPreciosFactorConstantesFunciones.getEmpresaDescripcion(empresaAux));
				procesopreciosfactor.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_sucursalProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalProcesoPreciosFactorGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				procesopreciosfactor.setid_sucursal(sucursalAux.getId());
				procesopreciosfactor.setsucursal_descripcion(ProcesoPreciosFactorConstantesFunciones.getSucursalDescripcion(sucursalAux));
				procesopreciosfactor.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_lineaProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaProcesoPreciosFactorGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosfactor.setid_linea(lineaAux.getId());
				procesopreciosfactor.setlinea_descripcion(ProcesoPreciosFactorConstantesFunciones.getLineaDescripcion(lineaAux));
				procesopreciosfactor.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_linea_grupoProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoProcesoPreciosFactorGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosfactor.setid_linea_grupo(lineaAux.getId());
				procesopreciosfactor.setlineagrupo_descripcion(ProcesoPreciosFactorConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				procesopreciosfactor.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosfactor.setid_linea_categoria(lineaAux.getId());
				procesopreciosfactor.setlineacategoria_descripcion(ProcesoPreciosFactorConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				procesopreciosfactor.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ProcesoPreciosFactor procesopreciosfactor,JComboBox jComboBoxid_linea_marcaProcesoPreciosFactorGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaProcesoPreciosFactorGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaProcesoPreciosFactorGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				procesopreciosfactor.setid_linea_marca(lineaAux.getId());
				procesopreciosfactor.setlineamarca_descripcion(ProcesoPreciosFactorConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				procesopreciosfactor.setLineaMarca(lineaAux);			}
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(bodega);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(producto);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(linea);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(lineagrupo);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(lineacategoria);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { 
					}

					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaProcesoPreciosFactor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.addItem(lineamarca);
							}
						}

						if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesProcesoPreciosFactor() throws Exception {
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
		
	public ProcesoPreciosFactorParameterReturnGeneral getProcesoPreciosFactorParameterGeneral() {
		return this.procesopreciosfactorParameterGeneral;
	}
	
	public void setProcesoPreciosFactorParameterGeneral(ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorParameterGeneral) {
		this.procesopreciosfactorParameterGeneral = procesopreciosfactorParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProcesoPreciosFactor() {
		return isPermisoTodoProcesoPreciosFactor;
	}

	public void setIsPermisoTodoProcesoPreciosFactor(Boolean isPermisoTodoProcesoPreciosFactor) {
		this.isPermisoTodoProcesoPreciosFactor = isPermisoTodoProcesoPreciosFactor;
	}

	public Boolean getIsPermisoNuevoProcesoPreciosFactor() {
		return isPermisoNuevoProcesoPreciosFactor;
	}

	public void setIsPermisoNuevoProcesoPreciosFactor(Boolean isPermisoNuevoProcesoPreciosFactor) {
		this.isPermisoNuevoProcesoPreciosFactor = isPermisoNuevoProcesoPreciosFactor;
	}

	public Boolean getIsPermisoActualizarProcesoPreciosFactor() {
		return isPermisoActualizarProcesoPreciosFactor;
	}

	public void setIsPermisoActualizarProcesoPreciosFactor(Boolean isPermisoActualizarProcesoPreciosFactor) {
		this.isPermisoActualizarProcesoPreciosFactor = isPermisoActualizarProcesoPreciosFactor;
	}

	public Boolean getIsPermisoEliminarProcesoPreciosFactor() {
		return isPermisoEliminarProcesoPreciosFactor;
	}

	public void setIsPermisoEliminarProcesoPreciosFactor(Boolean isPermisoEliminarProcesoPreciosFactor) {
		this.isPermisoEliminarProcesoPreciosFactor = isPermisoEliminarProcesoPreciosFactor;
	}

	public Boolean getIsPermisoGuardarCambiosProcesoPreciosFactor() {
		return isPermisoGuardarCambiosProcesoPreciosFactor;
	}

	public void setIsPermisoGuardarCambiosProcesoPreciosFactor(Boolean isPermisoGuardarCambiosProcesoPreciosFactor) {
		this.isPermisoGuardarCambiosProcesoPreciosFactor = isPermisoGuardarCambiosProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoConsultaProcesoPreciosFactor() {
		return isPermisoConsultaProcesoPreciosFactor;
	}

	public void setIsPermisoConsultaProcesoPreciosFactor(Boolean isPermisoConsultaProcesoPreciosFactor) {
		this.isPermisoConsultaProcesoPreciosFactor = isPermisoConsultaProcesoPreciosFactor;
	}

	public Boolean getIsPermisoBusquedaProcesoPreciosFactor() {
		return isPermisoBusquedaProcesoPreciosFactor;
	}

	public void setIsPermisoBusquedaProcesoPreciosFactor(Boolean isPermisoBusquedaProcesoPreciosFactor) {
		this.isPermisoBusquedaProcesoPreciosFactor = isPermisoBusquedaProcesoPreciosFactor;
	}

	public Boolean getIsPermisoReporteProcesoPreciosFactor() {
		return isPermisoReporteProcesoPreciosFactor;
	}

	public void setIsPermisoReporteProcesoPreciosFactor(Boolean isPermisoReporteProcesoPreciosFactor) {
		this.isPermisoReporteProcesoPreciosFactor = isPermisoReporteProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoPaginacionMedioProcesoPreciosFactor() {
		return isPermisoPaginacionMedioProcesoPreciosFactor;
	}

	public void setIsPermisoPaginacionMedioProcesoPreciosFactor(Boolean isPermisoPaginacionMedioProcesoPreciosFactor) {
		this.isPermisoPaginacionMedioProcesoPreciosFactor = isPermisoPaginacionMedioProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoPaginacionTodoProcesoPreciosFactor() {
		return isPermisoPaginacionTodoProcesoPreciosFactor;
	}

	public void setIsPermisoPaginacionTodoProcesoPreciosFactor(Boolean isPermisoPaginacionTodoProcesoPreciosFactor) {
		this.isPermisoPaginacionTodoProcesoPreciosFactor = isPermisoPaginacionTodoProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoPaginacionAltoProcesoPreciosFactor() {
		return isPermisoPaginacionAltoProcesoPreciosFactor;
	}

	public void setIsPermisoPaginacionAltoProcesoPreciosFactor(Boolean isPermisoPaginacionAltoProcesoPreciosFactor) {
		this.isPermisoPaginacionAltoProcesoPreciosFactor = isPermisoPaginacionAltoProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoCopiarProcesoPreciosFactor() {
		return isPermisoCopiarProcesoPreciosFactor;
	}

	public void setIsPermisoCopiarProcesoPreciosFactor(Boolean isPermisoCopiarProcesoPreciosFactor) {
		this.isPermisoCopiarProcesoPreciosFactor = isPermisoCopiarProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoVerFormProcesoPreciosFactor() {
		return isPermisoVerFormProcesoPreciosFactor;
	}

	public void setIsPermisoVerFormProcesoPreciosFactor(Boolean isPermisoVerFormProcesoPreciosFactor) {
		this.isPermisoVerFormProcesoPreciosFactor = isPermisoVerFormProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoDuplicarProcesoPreciosFactor() {
		return isPermisoDuplicarProcesoPreciosFactor;
	}

	public void setIsPermisoDuplicarProcesoPreciosFactor(Boolean isPermisoDuplicarProcesoPreciosFactor) {
		this.isPermisoDuplicarProcesoPreciosFactor = isPermisoDuplicarProcesoPreciosFactor;
	}
	
	public Boolean getIsPermisoOrdenProcesoPreciosFactor() {
		return isPermisoOrdenProcesoPreciosFactor;
	}

	public void setIsPermisoOrdenProcesoPreciosFactor(Boolean isPermisoOrdenProcesoPreciosFactor) {
		this.isPermisoOrdenProcesoPreciosFactor = isPermisoOrdenProcesoPreciosFactor;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProcesoPreciosFactor() {
		return isVisibilidadCeldaNuevoProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaNuevoProcesoPreciosFactor(Boolean isVisibilidadCeldaNuevoProcesoPreciosFactor) {
		this.isVisibilidadCeldaNuevoProcesoPreciosFactor = isVisibilidadCeldaNuevoProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProcesoPreciosFactor() {
		return isVisibilidadCeldaDuplicarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaDuplicarProcesoPreciosFactor(Boolean isVisibilidadCeldaDuplicarProcesoPreciosFactor) {
		this.isVisibilidadCeldaDuplicarProcesoPreciosFactor = isVisibilidadCeldaDuplicarProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProcesoPreciosFactor() {
		return isVisibilidadCeldaCopiarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaCopiarProcesoPreciosFactor(Boolean isVisibilidadCeldaCopiarProcesoPreciosFactor) {
		this.isVisibilidadCeldaCopiarProcesoPreciosFactor = isVisibilidadCeldaCopiarProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProcesoPreciosFactor() {
		return isVisibilidadCeldaVerFormProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaVerFormProcesoPreciosFactor(Boolean isVisibilidadCeldaVerFormProcesoPreciosFactor) {
		this.isVisibilidadCeldaVerFormProcesoPreciosFactor = isVisibilidadCeldaVerFormProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProcesoPreciosFactor() {
		return isVisibilidadCeldaOrdenProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaOrdenProcesoPreciosFactor(Boolean isVisibilidadCeldaOrdenProcesoPreciosFactor) {
		this.isVisibilidadCeldaOrdenProcesoPreciosFactor = isVisibilidadCeldaOrdenProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor() {
		return isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor(Boolean isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor) {
		this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor = isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProcesoPreciosFactor() {
		return isVisibilidadCeldaModificarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaModificarProcesoPreciosFactor(Boolean isVisibilidadCeldaModificarProcesoPreciosFactor) {
		this.isVisibilidadCeldaModificarProcesoPreciosFactor = isVisibilidadCeldaModificarProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProcesoPreciosFactor() {
		return isVisibilidadCeldaActualizarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaActualizarProcesoPreciosFactor(Boolean isVisibilidadCeldaActualizarProcesoPreciosFactor) {
		this.isVisibilidadCeldaActualizarProcesoPreciosFactor = isVisibilidadCeldaActualizarProcesoPreciosFactor;
	}

	public Boolean getIsVisibilidadCeldaEliminarProcesoPreciosFactor() {
		return isVisibilidadCeldaEliminarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaEliminarProcesoPreciosFactor(Boolean isVisibilidadCeldaEliminarProcesoPreciosFactor) {
		this.isVisibilidadCeldaEliminarProcesoPreciosFactor = isVisibilidadCeldaEliminarProcesoPreciosFactor;
	}

	public Boolean getIsVisibilidadCeldaCancelarProcesoPreciosFactor() {
		return isVisibilidadCeldaCancelarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaCancelarProcesoPreciosFactor(Boolean isVisibilidadCeldaCancelarProcesoPreciosFactor) {
		this.isVisibilidadCeldaCancelarProcesoPreciosFactor = isVisibilidadCeldaCancelarProcesoPreciosFactor;
	}

	public Boolean getIsVisibilidadCeldaGuardarProcesoPreciosFactor() {
		return isVisibilidadCeldaGuardarProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaGuardarProcesoPreciosFactor(Boolean isVisibilidadCeldaGuardarProcesoPreciosFactor) {
		this.isVisibilidadCeldaGuardarProcesoPreciosFactor = isVisibilidadCeldaGuardarProcesoPreciosFactor;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProcesoPreciosFactor() {
		return isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProcesoPreciosFactor(Boolean isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor) {
		this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor = isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor;
	}
		
	public ProcesoPreciosFactorSessionBean getprocesopreciosfactorSessionBean() {
		return this.procesopreciosfactorSessionBean;
	}
	
	public void setprocesopreciosfactorSessionBean(ProcesoPreciosFactorSessionBean procesopreciosfactorSessionBean) {
		this.procesopreciosfactorSessionBean=procesopreciosfactorSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaProcesoPreciosFactor() {
		return this.isVisibilidadBusquedaProcesoPreciosFactor;
	}

	public void setisVisibilidadBusquedaProcesoPreciosFactor(Boolean isVisibilidadBusquedaProcesoPreciosFactor) {
		this.isVisibilidadBusquedaProcesoPreciosFactor=isVisibilidadBusquedaProcesoPreciosFactor;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor)throws Exception {
		try {
			
				this.setActualParaGuardarBodegaForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarProductoForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarEmpresaForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarSucursalForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarLineaForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarLineaGrupoForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(procesopreciosfactor,null);
				this.setActualParaGuardarLineaMarcaForeignKey(procesopreciosfactor,null);
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
	
	public void bugActualizarReferenciaActual(ProcesoPreciosFactor procesopreciosfactor,ProcesoPreciosFactor procesopreciosfactorAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProcesoPreciosFactor(procesopreciosfactor);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		procesopreciosfactorAux.setId(procesopreciosfactor.getId());
		procesopreciosfactorAux.setVersionRow(procesopreciosfactor.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ProcesoPreciosFactor procesopreciosfactorLocal) throws Exception {
		
		if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ProcesoPreciosFactor procesopreciosfactorLocal) throws Exception {	
		if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				procesopreciosfactorLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				procesopreciosfactorLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				procesopreciosfactorLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				procesopreciosfactorLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				procesopreciosfactorLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				procesopreciosfactorLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				procesopreciosfactorLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				procesopreciosfactorLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarProcesoPreciosFactorActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = procesopreciosfactorValidator.getInvalidValues(this.procesopreciosfactor);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ProcesoPreciosFactor procesopreciosfactor,List<ProcesoPreciosFactor> procesopreciosfactors) throws Exception {
	}		
	
	public void actualizarSelectedLista(ProcesoPreciosFactor procesopreciosfactor,List<ProcesoPreciosFactor> procesopreciosfactors) throws Exception {
		try	{			
			ProcesoPreciosFactorConstantesFunciones.actualizarSelectedLista(procesopreciosfactor,procesopreciosfactors);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ProcesoPreciosFactor> procesopreciosfactorsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				procesopreciosfactorsLocal=this.procesopreciosfactorLogic.getProcesoPreciosFactors();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				procesopreciosfactorsLocal=this.procesopreciosfactors;
			}
			//ARCHITECTURE
		
			for(ProcesoPreciosFactor procesopreciosfactorLocal:procesopreciosfactorsLocal) {
				if(this.permiteMantenimiento(procesopreciosfactorLocal) && procesopreciosfactorLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProcesoPreciosFactorConstantesFunciones.getProcesoPreciosFactorLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigoProcesoPreciosFactor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombreProcesoPreciosFactor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigo_productoProcesoPreciosFactor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombre_productoProcesoPreciosFactor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelprecioProcesoPreciosFactor,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProcesoPreciosFactorConstantesFunciones.FACTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelfactorProcesoPreciosFactor,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigoProcesoPreciosFactor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombreProcesoPreciosFactor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigo_productoProcesoPreciosFactor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombre_productoProcesoPreciosFactor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelprecioProcesoPreciosFactor,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelfactorProcesoPreciosFactor,"");
		
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
		this.iIdNuevoProcesoPreciosFactor--;	
		
		
		this.procesopreciosfactorAux=new ProcesoPreciosFactor();
		
		this.procesopreciosfactorAux.setId(this.iIdNuevoProcesoPreciosFactor);
		this.procesopreciosfactorAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.procesopreciosfactorLogic.getProcesoPreciosFactors().add(this.procesopreciosfactorAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.procesopreciosfactors.add(this.procesopreciosfactorAux);
		}
		//ARCHITECTURE
		
		this.procesopreciosfactor=this.procesopreciosfactorAux;
		
		if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactor);
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosFactor(this.procesopreciosfactor);
		}
				
		//this.setDefaultControlesProcesoPreciosFactor();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProcesoPreciosFactor();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProcesoPreciosFactor();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosFactor();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPreciosFactor(this.procesopreciosfactorBean,this.procesopreciosfactor,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral,this.procesopreciosfactorBean,false);
		
		if(this.procesopreciosfactorReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor());
		}
		
		if(this.procesopreciosfactorReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor(),classes);//this.procesopreciosfactorBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProcesoPreciosFactor();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProcesoPreciosFactor();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.RecargarFormProcesoPreciosFactor(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
						
			if(procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosFactor();
			}
			
			this.actualizarVisualTableDatosProcesoPreciosFactor();
			
			this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosFactor(), this.getIndiceNuevoProcesoPreciosFactor());
			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
						
			this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProcesoPreciosFactor(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarcodigoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarnombreProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarcodigo_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarnombre_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarprecioProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarfactorProcesoPreciosFactor);	
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_bodegaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_productoProcesoPreciosFactor);//
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_empresaProcesoPreciosFactor);//
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_sucursalProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_lineaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_linea_grupoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_linea_categoriaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setEnabled(isHabilitar && this.procesopreciosfactorConstantesFunciones.activarid_linea_marcaProcesoPreciosFactor);
	};
	
	public void setDefaultControlesProcesoPreciosFactor() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProcesoPreciosFactor(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.procesopreciosfactorSessionBean.setConGuardarRelaciones(true);			
			this.procesopreciosfactorSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.setVisible(true);
			
					
		} else {
			//this.procesopreciosfactorSessionBean.setConGuardarRelaciones(false);			
			this.procesopreciosfactorSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoProcesoPreciosFactor() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				if(procesopreciosfactorAux.getId().equals(this.iIdNuevoProcesoPreciosFactor)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactors) {
				if(procesopreciosfactorAux.getId().equals(this.iIdNuevoProcesoPreciosFactor)) {
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
	
	public int getIndiceActualProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				if(procesopreciosfactorAux.getId().equals(procesopreciosfactor.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactors) {
				if(procesopreciosfactorAux.getId().equals(procesopreciosfactor.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactorOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				if(procesopreciosfactorAux.getProcesoPreciosFactorOriginal().getId().equals(procesopreciosfactorOriginal.getId())) {
					existe=true;
					procesopreciosfactorOriginal.setId(procesopreciosfactorAux.getId());
					procesopreciosfactorOriginal.setVersionRow(procesopreciosfactorAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactors) {
				if(procesopreciosfactorAux.getProcesoPreciosFactorOriginal().getId().equals(procesopreciosfactorOriginal.getId())) {
					existe=true;
					procesopreciosfactorOriginal.setId(procesopreciosfactorAux.getId());
					procesopreciosfactorOriginal.setVersionRow(procesopreciosfactorAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProcesoPreciosFactor(Boolean esParaCancelar) throws Exception {
		procesopreciosfactorsAux=new ArrayList<ProcesoPreciosFactor>();
		procesopreciosfactorAux=new ProcesoPreciosFactor();
		
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
					if(procesopreciosfactorAux.getId()<0) {
						procesopreciosfactorsAux.add(procesopreciosfactorAux);
					}		
				}
				this.iIdNuevoProcesoPreciosFactor=0L;
				this.procesopreciosfactorLogic.getProcesoPreciosFactors().removeAll(procesopreciosfactorsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactors) {
					if(procesopreciosfactorAux.getId()<0) {
						procesopreciosfactorsAux.add(procesopreciosfactorAux);
					}		
				}
				this.iIdNuevoProcesoPreciosFactor=0L;
				this.procesopreciosfactors.removeAll(procesopreciosfactorsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProcesoPreciosFactor 
					&& this.procesopreciosfactorLogic.getProcesoPreciosFactors().size()>0
					) {
					procesopreciosfactorAux=this.procesopreciosfactorLogic.getProcesoPreciosFactors().get(this.procesopreciosfactorLogic.getProcesoPreciosFactors().size() - 1);
				
					if(procesopreciosfactorAux.getId()<0) {
						this.procesopreciosfactorLogic.getProcesoPreciosFactors().remove(procesopreciosfactorAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProcesoPreciosFactor && this.procesopreciosfactors.size()>0) {
					procesopreciosfactorAux=this.procesopreciosfactors.get(this.procesopreciosfactors.size() - 1);
				
					if(procesopreciosfactorAux.getId()<0) {
						this.procesopreciosfactors.remove(procesopreciosfactorAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProcesoPreciosFactor(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(procesopreciosfactor.getId()<0) {
				this.procesopreciosfactorLogic.getProcesoPreciosFactors().remove(this.procesopreciosfactor);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(procesopreciosfactor.getId()<0) {
				this.procesopreciosfactors.remove(this.procesopreciosfactor);
			}
		}			
	}
	
	public void setEstadosInicialesProcesoPreciosFactor(List<ProcesoPreciosFactor> procesopreciosfactorsAux) throws Exception {
		ProcesoPreciosFactorConstantesFunciones.setEstadosInicialesProcesoPreciosFactor(procesopreciosfactorsAux);
	}
	
	public void setEstadosInicialesProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactorAux) throws Exception {
		ProcesoPreciosFactorConstantesFunciones.setEstadosInicialesProcesoPreciosFactor(procesopreciosfactorAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProcesoPreciosFactorActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProcesoPreciosFactorActual()) {
				if(!this.isEsNuevoProcesoPreciosFactor) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProcesoPreciosFactor=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProcesoPreciosFactorActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Proceso Precios Factor ?", "MANTENIMIENTO DE Proceso Precios Factor", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ProcesoPreciosFactor procesopreciosfactor) throws Exception {
		ProcesoPreciosFactorConstantesFunciones.seleccionarAsignar(this.procesopreciosfactor,procesopreciosfactor);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProcesoPreciosFactor=this.isPermisoActualizarOriginalProcesoPreciosFactor;
			
			
			this.seleccionarAsignar(procesopreciosfactor);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.procesopreciosfactorSessionBean.setsFuncionBusquedaRapida(this.procesopreciosfactorSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProcesoPreciosFactor) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProcesoPreciosFactor(esParaCancelar);				
				this.cancelarNuevoProcesoPreciosFactor(esParaCancelar);								
			}
			
			this.procesopreciosfactor=new ProcesoPreciosFactor();
			
			this.inicializarProcesoPreciosFactor();
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProcesoPreciosFactor() throws Exception {
		try {
			ProcesoPreciosFactorConstantesFunciones.inicializarProcesoPreciosFactor(this.procesopreciosfactor);
			
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
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.procesopreciosfactorLogic.getProcesoPreciosFactors().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProcesoPreciosFactors(String sAccionBusqueda,List<ProcesoPreciosFactor> procesopreciosfactorsParaReportes) throws Exception {
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
					sPathReporteFinal="ProcesoPreciosFactor"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProcesoPreciosFactorMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProcesoPreciosFactorMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ProcesoPreciosFactor"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Proceso Precios Factores");		
		parameters.put("busquedapor", ProcesoPreciosFactorConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProcesoPreciosFactor=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProcesoPreciosFactorConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProcesoPreciosFactorConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProcesoPreciosFactor=new JRBeanArrayDataSource(ProcesoPreciosFactorJInternalFrame.TraerProcesoPreciosFactorBeans(procesopreciosfactorsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProcesoPreciosFactor);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProcesoPreciosFactorConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProcesoPreciosFactorConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProcesoPreciosFactorBean.TraerProcesoPreciosFactorBeans(procesopreciosfactorsParaReportes).toArray()));
							
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
				this.generarExcelReporteProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactorActionPerformed(null);
					//this.generarExcelReporteProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProcesoPreciosFactors(sAccionBusqueda,sTipoArchivoReporte,procesopreciosfactorsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProcesoPreciosFactors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosFactor> procesopreciosfactorsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosFactors");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPreciosFactor("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ProcesoPreciosFactor procesopreciosfactor : procesopreciosfactorsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProcesoPreciosFactorConstantesFunciones.generarExcelReporteDataProcesoPreciosFactor("NORMAL",row,workbook,procesopreciosfactor,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProcesoPreciosFactor(String sTipo,Row row,Workbook workbook) {
		
		ProcesoPreciosFactorConstantesFunciones.generarExcelReporteHeaderProcesoPreciosFactor(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProcesoPreciosFactors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosFactor> procesopreciosfactorsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosFactors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ProcesoPreciosFactor procesopreciosfactor : procesopreciosfactorsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.getProcesoPreciosFactorDescripcion(procesopreciosfactor));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getcodigo_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getprecio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(procesopreciosfactor.getfactor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProcesoPreciosFactors(String sAccionBusqueda,String sTipoArchivoReporte,List<ProcesoPreciosFactor> procesopreciosfactorsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ProcesoPreciosFactor> procesopreciosfactorsRespaldo=null;
		
		classes=ProcesoPreciosFactorConstantesFunciones.getClassesRelationshipsOfProcesoPreciosFactor(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.procesopreciosfactorLogic.setDatosCliente(this.datosCliente);
		this.procesopreciosfactorLogic.setDatosDeep(this.datosDeep);
		this.procesopreciosfactorLogic.setIsConDeep(true);
		
		procesopreciosfactorsRespaldo=this.procesopreciosfactorLogic.getProcesoPreciosFactors();
		
		this.procesopreciosfactorLogic.setProcesoPreciosFactors(procesopreciosfactorsParaReportes);	
		this.procesopreciosfactorLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		procesopreciosfactorsParaReportes=this.procesopreciosfactorLogic.getProcesoPreciosFactors();
		this.procesopreciosfactorLogic.setProcesoPreciosFactors(procesopreciosfactorsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ProcesoPreciosFactors");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProcesoPreciosFactor("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ProcesoPreciosFactor procesopreciosfactor : procesopreciosfactorsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProcesoPreciosFactor("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProcesoPreciosFactorConstantesFunciones.generarExcelReporteDataProcesoPreciosFactor("NORMAL",row,workbook,procesopreciosfactor,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.getProcesoPreciosFactorDescripcion(procesopreciosfactor));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProcesoPreciosFactor() throws Exception {		
		this.startProcessProcesoPreciosFactor(true);
	}
	
	public void startProcessProcesoPreciosFactor(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProcesoPreciosFactor ,this.jPanelParametrosReportesProcesoPreciosFactor, this.jScrollPanelDatosProcesoPreciosFactor,this.jPanelPaginacionProcesoPreciosFactor, this.jScrollPanelDatosEdicionProcesoPreciosFactor, this.jPanelAccionesProcesoPreciosFactor,this.jPanelAccionesFormularioProcesoPreciosFactor,this.jmenuBarProcesoPreciosFactor,this.jmenuBarDetalleProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPreciosFactor=this.jTabbedPaneBusquedasProcesoPreciosFactor; 
		
		final JPanel jPanelParametrosReportesProcesoPreciosFactor=this.jPanelParametrosReportesProcesoPreciosFactor;
		//final JScrollPane jScrollPanelDatosProcesoPreciosFactor=this.jScrollPanelDatosProcesoPreciosFactor;
		final JTable jTableDatosProcesoPreciosFactor=this.jTableDatosProcesoPreciosFactor;		
		final JPanel jPanelPaginacionProcesoPreciosFactor=this.jPanelPaginacionProcesoPreciosFactor;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPreciosFactor=this.jScrollPanelDatosEdicionProcesoPreciosFactor;
		final JPanel jPanelAccionesProcesoPreciosFactor=this.jPanelAccionesProcesoPreciosFactor;
		
		JPanel jPanelCamposAuxiliarProcesoPreciosFactor=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPreciosFactor=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			jPanelCamposAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelCamposProcesoPreciosFactor;
			jPanelAccionesFormularioAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelAccionesFormularioProcesoPreciosFactor;
		}
		
		final JPanel jPanelCamposProcesoPreciosFactor=jPanelCamposAuxiliarProcesoPreciosFactor;
		final JPanel jPanelAccionesFormularioProcesoPreciosFactor=jPanelAccionesFormularioAuxiliarProcesoPreciosFactor;
		
		
		final JMenuBar jmenuBarProcesoPreciosFactor=this.jmenuBarProcesoPreciosFactor;
		final JToolBar jTtoolBarProcesoPreciosFactor=this.jTtoolBarProcesoPreciosFactor;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProcesoPreciosFactor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPreciosFactor=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			jmenuBarDetalleAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jmenuBarDetalleProcesoPreciosFactor;
			jTtoolBarDetalleAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jTtoolBarDetalleProcesoPreciosFactor;
		}
		
		final JMenuBar jmenuBarDetalleProcesoPreciosFactor=jmenuBarDetalleAuxiliarProcesoPreciosFactor;
		final JToolBar jTtoolBarDetalleProcesoPreciosFactor=jTtoolBarDetalleAuxiliarProcesoPreciosFactor;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPreciosFactor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPreciosFactor;
			processRunnable.jTableDatos=jTableDatosProcesoPreciosFactor;
			processRunnable.jPanelCampos=jPanelCamposProcesoPreciosFactor;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPreciosFactor;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPreciosFactor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPreciosFactor;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPreciosFactor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPreciosFactor;
			processRunnable.jTtoolBar=jTtoolBarProcesoPreciosFactor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPreciosFactor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPreciosFactor ,jPanelParametrosReportesProcesoPreciosFactor,jTableDatosProcesoPreciosFactor, /*jScrollPanelDatosProcesoPreciosFactor,*/jPanelCamposProcesoPreciosFactor,jPanelPaginacionProcesoPreciosFactor, /*jScrollPanelDatosEdicionProcesoPreciosFactor,*/ jPanelAccionesProcesoPreciosFactor,jPanelAccionesFormularioProcesoPreciosFactor,jmenuBarProcesoPreciosFactor,jmenuBarDetalleProcesoPreciosFactor,jTtoolBarProcesoPreciosFactor,jTtoolBarDetalleProcesoPreciosFactor);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProcesoPreciosFactor ,jPanelParametrosReportesProcesoPreciosFactor, jScrollPanelDatosProcesoPreciosFactor,jPanelPaginacionProcesoPreciosFactor, jScrollPanelDatosEdicionProcesoPreciosFactor, jPanelAccionesProcesoPreciosFactor,jPanelAccionesFormularioProcesoPreciosFactor,jmenuBarProcesoPreciosFactor,jmenuBarDetalleProcesoPreciosFactor,jTtoolBarProcesoPreciosFactor,jTtoolBarDetalleProcesoPreciosFactor);
						
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
	
	public void finishProcessProcesoPreciosFactor() {// throws Exception 
		this.finishProcessProcesoPreciosFactor(true);
	}
	
	public void finishProcessProcesoPreciosFactor(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProcesoPreciosFactor ,this.jPanelParametrosReportesProcesoPreciosFactor, this.jScrollPanelDatosProcesoPreciosFactor,this.jPanelPaginacionProcesoPreciosFactor, this.jScrollPanelDatosEdicionProcesoPreciosFactor, this.jPanelAccionesProcesoPreciosFactor,this.jPanelAccionesFormularioProcesoPreciosFactor,this.jmenuBarProcesoPreciosFactor,this.jmenuBarDetalleProcesoPreciosFactor,this.jTtoolBarProcesoPreciosFactor,this.jTtoolBarDetalleProcesoPreciosFactor);		
		
		final JTabbedPane jTabbedPaneBusquedasProcesoPreciosFactor=this.jTabbedPaneBusquedasProcesoPreciosFactor; 
		
		final JPanel jPanelParametrosReportesProcesoPreciosFactor=this.jPanelParametrosReportesProcesoPreciosFactor;
		//final JScrollPane jScrollPanelDatosProcesoPreciosFactor=this.jScrollPanelDatosProcesoPreciosFactor;
		final JTable jTableDatosProcesoPreciosFactor=this.jTableDatosProcesoPreciosFactor;		
		final JPanel jPanelPaginacionProcesoPreciosFactor=this.jPanelPaginacionProcesoPreciosFactor;
		//final JScrollPane jScrollPanelDatosEdicionProcesoPreciosFactor=this.jScrollPanelDatosEdicionProcesoPreciosFactor;
		final JPanel jPanelAccionesProcesoPreciosFactor=this.jPanelAccionesProcesoPreciosFactor;
		
		JPanel jPanelCamposAuxiliarProcesoPreciosFactor=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProcesoPreciosFactor=new JPanel();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			jPanelCamposAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelCamposProcesoPreciosFactor;
			jPanelAccionesFormularioAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelAccionesFormularioProcesoPreciosFactor;
		}
		
		final JPanel jPanelCamposProcesoPreciosFactor=jPanelCamposAuxiliarProcesoPreciosFactor;
		final JPanel jPanelAccionesFormularioProcesoPreciosFactor=jPanelAccionesFormularioAuxiliarProcesoPreciosFactor;
		
		
		final JMenuBar jmenuBarProcesoPreciosFactor=this.jmenuBarProcesoPreciosFactor;		
		final JToolBar jTtoolBarProcesoPreciosFactor=this.jTtoolBarProcesoPreciosFactor;
				
		JMenuBar jmenuBarDetalleAuxiliarProcesoPreciosFactor=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProcesoPreciosFactor=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			jmenuBarDetalleAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jmenuBarDetalleProcesoPreciosFactor;
			jTtoolBarDetalleAuxiliarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jTtoolBarDetalleProcesoPreciosFactor;		
		}
		
		final JMenuBar jmenuBarDetalleProcesoPreciosFactor=jmenuBarDetalleAuxiliarProcesoPreciosFactor;
		final JToolBar jTtoolBarDetalleProcesoPreciosFactor=jTtoolBarDetalleAuxiliarProcesoPreciosFactor;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProcesoPreciosFactor;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProcesoPreciosFactor;
			processRunnable.jTableDatos=jTableDatosProcesoPreciosFactor;
			processRunnable.jPanelCampos=jPanelCamposProcesoPreciosFactor;
			processRunnable.jPanelPaginacion=jPanelPaginacionProcesoPreciosFactor;
			processRunnable.jPanelAcciones=jPanelAccionesProcesoPreciosFactor;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProcesoPreciosFactor;
			
			
			processRunnable.jmenuBar=jmenuBarProcesoPreciosFactor;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProcesoPreciosFactor;
			processRunnable.jTtoolBar=jTtoolBarProcesoPreciosFactor;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProcesoPreciosFactor;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProcesoPreciosFactor ,jPanelParametrosReportesProcesoPreciosFactor, jTableDatosProcesoPreciosFactor,/*jScrollPanelDatosProcesoPreciosFactor,*/jPanelCamposProcesoPreciosFactor,jPanelPaginacionProcesoPreciosFactor, /*jScrollPanelDatosEdicionProcesoPreciosFactor,*/ jPanelAccionesProcesoPreciosFactor,jPanelAccionesFormularioProcesoPreciosFactor,jmenuBarProcesoPreciosFactor,jmenuBarDetalleProcesoPreciosFactor,jTtoolBarProcesoPreciosFactor,jTtoolBarDetalleProcesoPreciosFactor));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProcesoPreciosFactor(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProcesoPreciosFactor(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProcesoPreciosFactor(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProcesoPreciosFactor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProcesoPreciosFactor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProcesoPreciosFactor,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProcesoPreciosFactor(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProcesoPreciosFactor,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProcesoPreciosFactor,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.procesopreciosfactorConstantesFunciones.getsFinalQueryProcesoPreciosFactor();
		String  finalQueryPaginacionTodos=this.procesopreciosfactorConstantesFunciones.getsFinalQueryProcesoPreciosFactor();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProcesoPreciosFactorConstantesFunciones.getArrayColumnasGlobalesNoProcesoPreciosFactor(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProcesoPreciosFactorConstantesFunciones.getArrayColumnasGlobalesProcesoPreciosFactor(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProcesoPreciosFactorConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.procesopreciosfactorsEliminados= new ArrayList<ProcesoPreciosFactor>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProcesoPreciosFactor();
		
				///*ProcesoPreciosFactorSessionBean*/this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			
			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
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
					this.iNumeroPaginacion=ProcesoPreciosFactorConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProcesoPreciosFactorConstantesFunciones.getClassesForeignKeysOfProcesoPreciosFactor(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/procesopreciosfactor."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			procesopreciosfactorsAux= new ArrayList<ProcesoPreciosFactor>();
			
				
			procesopreciosfactorLogic.setDatosCliente(this.datosCliente);
			procesopreciosfactorLogic.setDatosDeep(this.datosDeep);
			procesopreciosfactorLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaProcesoPreciosFactor")) {
				this.sDetalleReporte=ProcesoPreciosFactorConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosFactor(id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					procesopreciosfactorLogic.getProcesoPreciosFactorsBusquedaProcesoPreciosFactor(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPreciosFactorConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosFactor(id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPreciosFactorConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosFactor(id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=procesopreciosfactorLogic.getProcesoPreciosFactors()==null||procesopreciosfactorLogic.getProcesoPreciosFactors().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=procesopreciosfactors==null|| procesopreciosfactors.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosfactorsAux=new ArrayList<ProcesoPreciosFactor>();
						procesopreciosfactorsAux.addAll(procesopreciosfactorLogic.getProcesoPreciosFactors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosfactorsAux=new ArrayList<ProcesoPreciosFactor>();
							procesopreciosfactorsAux.addAll(procesopreciosfactors);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							procesopreciosfactorLogic.getProcesoPreciosFactorsBusquedaProcesoPreciosFactor(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProcesoPreciosFactorConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosFactor(id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProcesoPreciosFactorConstantesFunciones.getDetalleIndiceBusquedaProcesoPreciosFactor(id_bodegaBusquedaProcesoPreciosFactor,id_productoBusquedaProcesoPreciosFactor,id_lineaBusquedaProcesoPreciosFactor,id_linea_grupoBusquedaProcesoPreciosFactor,id_linea_categoriaBusquedaProcesoPreciosFactor,id_linea_marcaBusquedaProcesoPreciosFactor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProcesoPreciosFactors("BusquedaProcesoPreciosFactor",procesopreciosfactorLogic.getProcesoPreciosFactors());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProcesoPreciosFactors("BusquedaProcesoPreciosFactor",procesopreciosfactors);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosfactorLogic.setProcesoPreciosFactors(new ArrayList<ProcesoPreciosFactor>());
						procesopreciosfactorLogic.getProcesoPreciosFactors().addAll(procesopreciosfactorsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosfactors=new ArrayList<ProcesoPreciosFactor>();
							procesopreciosfactors.addAll(procesopreciosfactorsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProcesoPreciosFactor();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProcesoPreciosFactor();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopreciosfactorLogic.getProcesoPreciosFactors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosfactors.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=procesopreciosfactorLogic.getProcesoPreciosFactors().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=procesopreciosfactors.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ProcesoPreciosFactor procesopreciosfactor) {
		Boolean permite=true;
		
		if(this.procesopreciosfactor.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProcesoPreciosFactorConstantesFunciones.getOrderByListaProcesoPreciosFactor();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProcesoPreciosFactorConstantesFunciones.getOrderByListaProcesoPreciosFactor();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				if(procesopreciosfactor.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosfactorTotales=procesopreciosfactor;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosFactor procesopreciosfactor:this.procesopreciosfactors) {
				if(procesopreciosfactor.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosfactorTotales=procesopreciosfactor;
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
			this.procesopreciosfactorAux=new ProcesoPreciosFactor();
			this.procesopreciosfactorAux.setsType(Constantes2.S_TOTALES);
			this.procesopreciosfactorAux.setIsNew(false);
			this.procesopreciosfactorAux.setIsChanged(false);
			this.procesopreciosfactorAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ProcesoPreciosFactorConstantesFunciones.TotalizarValoresFilaProcesoPreciosFactor(this.procesopreciosfactorLogic.getProcesoPreciosFactors(),this.procesopreciosfactorAux);
				
				//this.procesopreciosfactorLogic.getProcesoPreciosFactors().add(this.procesopreciosfactorAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProcesoPreciosFactorConstantesFunciones.TotalizarValoresFilaProcesoPreciosFactor(this.procesopreciosfactors,this.procesopreciosfactorAux);
				
				this.procesopreciosfactors.add(this.procesopreciosfactorAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		procesopreciosfactorTotales=new ProcesoPreciosFactor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopreciosfactorLogic.getProcesoPreciosFactors().remove(procesopreciosfactorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.procesopreciosfactors.remove(procesopreciosfactorTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		procesopreciosfactorTotales=new ProcesoPreciosFactor();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				if(procesopreciosfactor.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosfactorTotales=procesopreciosfactor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPreciosFactorConstantesFunciones.TotalizarValoresFilaProcesoPreciosFactor(this.procesopreciosfactorLogic.getProcesoPreciosFactors(),procesopreciosfactorTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ProcesoPreciosFactor procesopreciosfactor:this.procesopreciosfactors) {
				if(procesopreciosfactor.getsType().equals(Constantes2.S_TOTALES)) {
					procesopreciosfactorTotales=procesopreciosfactor;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProcesoPreciosFactorConstantesFunciones.TotalizarValoresFilaProcesoPreciosFactor(this.procesopreciosfactors,procesopreciosfactorTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProcesoPreciosFactorsBusquedaProcesoPreciosFactor()throws Exception {
		try {
			sAccionBusqueda="BusquedaProcesoPreciosFactor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProcesoPreciosFactorsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProcesoPreciosFactorsBusquedaProcesoPreciosFactor(String sFinalQuery,Long id_bodega,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsBusquedaProcesoPreciosFactor(sFinalQuery,this.pagination,id_bodega,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProcesoPreciosFactorsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//procesopreciosfactorLogic.getProcesoPreciosFactorsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosProcesoPreciosFactor() {
		this.isPermisoTodoProcesoPreciosFactor=false;
		this.isPermisoNuevoProcesoPreciosFactor=false;
		this.isPermisoActualizarProcesoPreciosFactor=false;
		this.isPermisoActualizarOriginalProcesoPreciosFactor=false;
		this.isPermisoEliminarProcesoPreciosFactor=false;
		this.isPermisoGuardarCambiosProcesoPreciosFactor=false;
		this.isPermisoConsultaProcesoPreciosFactor=true;
		this.isPermisoBusquedaProcesoPreciosFactor=true;
		this.isPermisoReporteProcesoPreciosFactor=true;
		this.isPermisoOrdenProcesoPreciosFactor=false;		
		this.isPermisoPaginacionMedioProcesoPreciosFactor=false;		
		this.isPermisoPaginacionAltoProcesoPreciosFactor=false;		
		this.isPermisoPaginacionTodoProcesoPreciosFactor=false;		
		this.isPermisoCopiarProcesoPreciosFactor=false;		
		this.isPermisoVerFormProcesoPreciosFactor=false;		
		this.isPermisoDuplicarProcesoPreciosFactor=false;
		this.isPermisoOrdenProcesoPreciosFactor=false;
	}
	
	public void setPermisosUsuarioProcesoPreciosFactor(Boolean isPermiso) {
		this.isPermisoTodoProcesoPreciosFactor=isPermiso;
		this.isPermisoNuevoProcesoPreciosFactor=isPermiso;
		this.isPermisoActualizarProcesoPreciosFactor=isPermiso;
		this.isPermisoActualizarOriginalProcesoPreciosFactor=isPermiso;
		this.isPermisoEliminarProcesoPreciosFactor=isPermiso;
		this.isPermisoGuardarCambiosProcesoPreciosFactor=isPermiso;
		this.isPermisoConsultaProcesoPreciosFactor=isPermiso;
		this.isPermisoBusquedaProcesoPreciosFactor=isPermiso;
		this.isPermisoReporteProcesoPreciosFactor=isPermiso;
		this.isPermisoOrdenProcesoPreciosFactor=isPermiso;		
		this.isPermisoPaginacionMedioProcesoPreciosFactor=isPermiso;		
		this.isPermisoPaginacionAltoProcesoPreciosFactor=isPermiso;		
		this.isPermisoPaginacionTodoProcesoPreciosFactor=isPermiso;		
		this.isPermisoCopiarProcesoPreciosFactor=isPermiso;		
		this.isPermisoVerFormProcesoPreciosFactor=isPermiso;		
		this.isPermisoDuplicarProcesoPreciosFactor=isPermiso;
		this.isPermisoOrdenProcesoPreciosFactor=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProcesoPreciosFactor(Boolean isPermiso) {
		//this.isPermisoTodoProcesoPreciosFactor=isPermiso;
		this.isPermisoNuevoProcesoPreciosFactor=isPermiso;
		this.isPermisoActualizarProcesoPreciosFactor=isPermiso;
		this.isPermisoActualizarOriginalProcesoPreciosFactor=isPermiso;
		this.isPermisoEliminarProcesoPreciosFactor=isPermiso;
		this.isPermisoGuardarCambiosProcesoPreciosFactor=isPermiso;
		//this.isPermisoConsultaProcesoPreciosFactor=isPermiso;
		//this.isPermisoBusquedaProcesoPreciosFactor=isPermiso;
		//this.isPermisoReporteProcesoPreciosFactor=isPermiso;
		//this.isPermisoOrdenProcesoPreciosFactor=isPermiso;		
		//this.isPermisoPaginacionMedioProcesoPreciosFactor=isPermiso;		
		//this.isPermisoPaginacionAltoProcesoPreciosFactor=isPermiso;		
		//this.isPermisoPaginacionTodoProcesoPreciosFactor=isPermiso;		
		//this.isPermisoCopiarProcesoPreciosFactor=isPermiso;		
		//this.isPermisoDuplicarProcesoPreciosFactor=isPermiso;
		//this.isPermisoOrdenProcesoPreciosFactor=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPreciosFactorClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ProcesoPreciosFactorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProcesoPreciosFactorClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioProcesoPreciosFactorClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProcesoPreciosFactorClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProcesoPreciosFactorClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioProcesoPreciosFactor() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProcesoPreciosFactorJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProcesoPreciosFactorConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProcesoPreciosFactor=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProcesoPreciosFactor=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProcesoPreciosFactor=this.isPermisoActualizarProcesoPreciosFactor;
			this.isPermisoEliminarProcesoPreciosFactor=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProcesoPreciosFactor=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProcesoPreciosFactor=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProcesoPreciosFactor=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProcesoPreciosFactor=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProcesoPreciosFactor=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPreciosFactor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProcesoPreciosFactor=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProcesoPreciosFactor=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProcesoPreciosFactor=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProcesoPreciosFactor=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProcesoPreciosFactor=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProcesoPreciosFactor=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProcesoPreciosFactor=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProcesoPreciosFactor.setToolTipText(this.jTableDatosProcesoPreciosFactor.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProcesoPreciosFactor(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProcesoPreciosFactor(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProcesoPreciosFactorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProcesoPreciosFactorJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProcesoPreciosFactor() throws Exception {
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
	public void inicializarCombosForeignKeyProcesoPreciosFactorListas()throws Exception {
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
	
	public void cargarCombosTodosForeignKeyProcesoPreciosFactorListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProcesoPreciosFactorJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyProcesoPreciosFactor()throws Exception {
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
			if(this.procesopreciosfactorSessionBean==null) {
				this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean();
			}

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.procesopreciosfactorSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyProcesoPreciosFactor()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProcesoPreciosFactor(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProcesoPreciosFactor()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosFactor();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProcesoPreciosFactor()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProcesoPreciosFactor()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProcesoPreciosFactor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProcesoPreciosFactor()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProcesoPreciosFactor()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProcesoPreciosFactor()throws Exception {
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
	
	public void cargarCombosFrameForeignKeyProcesoPreciosFactor(String sFormularioTipoBusqueda)throws Exception {
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
	
	public void setItemDefectoCombosForeignKeyProcesoPreciosFactor()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.getItemCount()>0) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public ProcesoPreciosFactorBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProcesoPreciosFactorBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProcesoPreciosFactorBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.procesopreciosfactorSessionBean=new ProcesoPreciosFactorSessionBean(); 
		this.procesopreciosfactorConstantesFunciones=new ProcesoPreciosFactorConstantesFunciones(); 
		this.procesopreciosfactorBean=new ProcesoPreciosFactor();//(this.procesopreciosfactorConstantesFunciones); 		
		this.procesopreciosfactorReturnGeneral=new ProcesoPreciosFactorParameterReturnGeneral(); 
		
		this.procesopreciosfactorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.procesopreciosfactorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProcesoPreciosFactorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProcesoPreciosFactorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProcesoPreciosFactorBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProcesoPreciosFactor(true);
			
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
			
			this.procesopreciosfactorConstantesFunciones=new ProcesoPreciosFactorConstantesFunciones(); 
			this.procesopreciosfactorBean=new ProcesoPreciosFactor();//this.procesopreciosfactorConstantesFunciones); 			
			this.procesopreciosfactorReturnGeneral=new ProcesoPreciosFactorParameterReturnGeneral(); 
		
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Proceso Precios Factor Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.procesopreciosfactor=new ProcesoPreciosFactor();
			this.procesopreciosfactors = new ArrayList<ProcesoPreciosFactor>();
			this.procesopreciosfactorsAux = new ArrayList<ProcesoPreciosFactor>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic=new ProcesoPreciosFactorLogic();
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			//this.procesopreciosfactorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.procesopreciosfactorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProcesoPreciosFactor);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPreciosFactor);	
					}
					
					if(this.jInternalFrameImportacionProcesoPreciosFactor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPreciosFactor);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProcesoPreciosFactor!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProcesoPreciosFactor);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPreciosFactor);
				this.jInternalFrameDetalleFormProcesoPreciosFactor.setVisible(false);
				this.jInternalFrameDetalleFormProcesoPreciosFactor.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPreciosFactor);
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setVisible(false);
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProcesoPreciosFactor!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPreciosFactor);
					this.jInternalFrameImportacionProcesoPreciosFactor.setVisible(false);
					this.jInternalFrameImportacionProcesoPreciosFactor.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProcesoPreciosFactor!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPreciosFactor);
					this.jInternalFrameOrderByProcesoPreciosFactor.setVisible(false);
					this.jInternalFrameOrderByProcesoPreciosFactor.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProcesoPreciosFactorActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProcesoPreciosFactorConstantesFunciones.INUMEROPAGINACION;
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
			
			this.procesopreciosfactorReturnGeneral=new ProcesoPreciosFactorParameterReturnGeneral();
			
			this.procesopreciosfactorParameterGeneral=new ProcesoPreciosFactorParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.procesopreciosfactorLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProcesoPreciosFactorJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPreciosFactorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),this.procesopreciosfactorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProcesoPreciosFactorConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),this.procesopreciosfactorSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaDuplicarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaCopiarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaVerFormProcesoPreciosFactor=true;
			this.isVisibilidadCeldaOrdenProcesoPreciosFactor=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			
			
			this.isVisibilidadBusquedaProcesoPreciosFactor=true;
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
			
			//this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProcesoPreciosFactor();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProcesoPreciosFactor(false);
			
			this.setPermisosUsuarioProcesoPreciosFactor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() 
				|| (this.procesopreciosfactorSessionBean.getEsGuardarRelacionado() && this.procesopreciosfactorSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProcesoPreciosFactorClasesRelacionadas();
			}
			
			if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProcesoPreciosFactorClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProcesoPreciosFactor();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProcesoPreciosFactor();
			}
			
			if(!this.isPermisoBusquedaProcesoPreciosFactor) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProcesoPreciosFactorConstantesFunciones.getTiposSeleccionarProcesoPreciosFactor());
				
				this.tiposColumnasSelect=ProcesoPreciosFactorConstantesFunciones.getTiposSeleccionarProcesoPreciosFactor(true);
				
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
			//if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProcesoPreciosFactor();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioProcesoPreciosFactor(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioProcesoPreciosFactor(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosFactor() ;
			
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
				procesopreciosfactorImplementable= (ProcesoPreciosFactorImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPreciosFactorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				procesopreciosfactorImplementableHome= (ProcesoPreciosFactorImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProcesoPreciosFactorConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.procesopreciosfactors= new ArrayList<ProcesoPreciosFactor>();
			this.procesopreciosfactorsEliminados= new ArrayList<ProcesoPreciosFactor>();
						
			this.isEsNuevoProcesoPreciosFactor=false;
			this.esParaAccionDesdeFormularioProcesoPreciosFactor=false;
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
				this.cargarCombosForeignKeyProcesoPreciosFactor(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProcesoPreciosFactor();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProcesoPreciosFactorConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProcesoPreciosFactor(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProcesoPreciosFactor();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProcesoPreciosFactor();
			}
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProcesoPreciosFactor.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProcesoPreciosFactor.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProcesoPreciosFactor.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProcesoPreciosFactor(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ProcesoPreciosFactor: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProcesoPreciosFactor() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProcesoPreciosFactor")) {
				iIndex=this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProcesoPreciosFactor();	
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
	
	public void cargarCombosForeignKeyProcesoPreciosFactor(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProcesoPreciosFactor(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProcesoPreciosFactor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProcesoPreciosFactorListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProcesoPreciosFactor();
		
		this.cargarCombosFrameForeignKeyProcesoPreciosFactor();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProcesoPreciosFactor();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProcesoPreciosFactor();
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
	
	public void jButtonNuevoProcesoPreciosFactorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			
			if(jTableDatosProcesoPreciosFactor.getRowCount()>=1) {
				jTableDatosProcesoPreciosFactor.removeRowSelectionInterval(0, jTableDatosProcesoPreciosFactor.getRowCount()-1);						
			}
			
			this.isEsNuevoProcesoPreciosFactor=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProcesoPreciosFactor(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProcesoPreciosFactor(true);			
			//this.procesopreciosfactor=new ProcesoPreciosFactor();
			//this.procesopreciosfactor.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor() ;
			
			if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosFactor(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.procesopreciosfactor);	
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);				
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ProcesoPreciosFactor: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProcesoPreciosFactorActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProcesoPreciosFactor.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProcesoPreciosFactor.getSelectedRows().length;			
			}
			
			procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProcesoPreciosFactor--;			
				//ProcesoPreciosFactor procesopreciosfactorAux= new ProcesoPreciosFactor();			
				//procesopreciosfactorAux.setId(this.iIdNuevoProcesoPreciosFactor);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ProcesoPreciosFactor procesopreciosfactorOrigen=new ProcesoPreciosFactor();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ProcesoPreciosFactor procesopreciosfactorOrigen : procesopreciosfactorsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							procesopreciosfactorOrigen =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							procesopreciosfactorOrigen =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProcesoPreciosFactor();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.procesopreciosfactor.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProcesoPreciosFactor(procesopreciosfactorOrigen,this.procesopreciosfactor,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopreciosfactorLogic.getProcesoPreciosFactors().add(this.procesopreciosfactorAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactors.add(this.procesopreciosfactorAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
				
				this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosFactor(), this.getIndiceNuevoProcesoPreciosFactor());
				
				int iLastRow =  this.jTableDatosProcesoPreciosFactor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPreciosFactor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPreciosFactor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();									
		
			ProcesoPreciosFactor procesopreciosfactorOrigen=new ProcesoPreciosFactor();
			ProcesoPreciosFactor procesopreciosfactorDestino=new ProcesoPreciosFactor();
				
			procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProcesoPreciosFactor.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || procesopreciosfactorsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProcesoPreciosFactor.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosfactorOrigen =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopreciosfactorOrigen =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						procesopreciosfactorDestino =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						procesopreciosfactorDestino =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				procesopreciosfactorOrigen =procesopreciosfactorsSeleccionados.get(0);
				procesopreciosfactorDestino =procesopreciosfactorsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProcesoPreciosFactor(procesopreciosfactorOrigen,procesopreciosfactorDestino,true,false);
				
				procesopreciosfactorDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(procesopreciosfactorDestino,procesopreciosfactorLogic.getProcesoPreciosFactors());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(procesopreciosfactorDestino,procesopreciosfactors);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
				
				//this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosFactor(), this.getIndiceNuevoProcesoPreciosFactor());
				
				int iLastRow =  this.jTableDatosProcesoPreciosFactor.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProcesoPreciosFactor.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProcesoPreciosFactor.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProcesoPreciosFactor.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(!isVisible);
			this.jPanelPaginacionProcesoPreciosFactor.setVisible(!isVisible);
			this.jPanelAccionesProcesoPreciosFactor.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProcesoPreciosFactor();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProcesoPreciosFactor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProcesoPreciosFactor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProcesoPreciosFactor();
			
			this.abrirFrameOrderByProcesoPreciosFactor();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProcesoPreciosFactor();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProcesoPreciosFactor(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPreciosFactor);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProcesoPreciosFactor.isMaximum()) {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProcesoPreciosFactor.setSize(this.jInternalFrameDetalleFormProcesoPreciosFactor.iWidthFormulario,this.jInternalFrameDetalleFormProcesoPreciosFactor.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProcesoPreciosFactor.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProcesoPreciosFactor.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProcesoPreciosFactor.isMaximum()) {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jContentPaneDetalleProcesoPreciosFactor.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosFactor.jContentPaneDetalleProcesoPreciosFactor.getWidth(),ProcesoPreciosFactorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosFactor.jContentPaneDetalleProcesoPreciosFactor.getWidth(),ProcesoPreciosFactorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProcesoPreciosFactor.jContentPaneDetalleProcesoPreciosFactor.getWidth(),ProcesoPreciosFactorConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProcesoPreciosFactor.setVisible(true);
	        this.jInternalFrameDetalleFormProcesoPreciosFactor.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProcesoPreciosFactor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProcesoPreciosFactor==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProcesoPreciosFactor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosFactor,false,this);
				} else {
					this.jInternalFrameOrderByProcesoPreciosFactor=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProcesoPreciosFactor,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProcesoPreciosFactor);
				this.jInternalFrameOrderByProcesoPreciosFactor.setVisible(false);
				this.jInternalFrameOrderByProcesoPreciosFactor.setSelected(false);
				
				this.jInternalFrameOrderByProcesoPreciosFactor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPreciosFactor"));
				
				this.inicializarActualizarBindingTablaOrderByProcesoPreciosFactor();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProcesoPreciosFactor() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProcesoPreciosFactor==null) {
				
				this.jInternalFrameImportacionProcesoPreciosFactor=new ImportacionJInternalFrame(ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProcesoPreciosFactor);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProcesoPreciosFactor);
				this.jInternalFrameImportacionProcesoPreciosFactor.setVisible(false);
				this.jInternalFrameImportacionProcesoPreciosFactor.setSelected(false);


				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPreciosFactor"));
				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPreciosFactor"));
				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPreciosFactor"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProcesoPreciosFactor() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor==null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor=new ReporteDinamicoJInternalFrame(ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProcesoPreciosFactor);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProcesoPreciosFactor);
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setVisible(false);
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosFactor"));
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosFactor"));
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosFactor"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosFactor();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleProcesoPreciosFactor() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProcesoPreciosFactor);
			
	       	this.jInternalFrameDetalleFormProcesoPreciosFactor.setVisible(false);
	        this.jInternalFrameDetalleFormProcesoPreciosFactor.setSelected(false);
			
			//this.jInternalFrameDetalleFormProcesoPreciosFactor.dispose();
			//this.jInternalFrameDetalleFormProcesoPreciosFactor=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProcesoPreciosFactor() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setVisible(true);
	        this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProcesoPreciosFactor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProcesoPreciosFactor.setVisible(true);
	        this.jInternalFrameImportacionProcesoPreciosFactor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProcesoPreciosFactor() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProcesoPreciosFactor.setVisible(true);
	        this.jInternalFrameOrderByProcesoPreciosFactor.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProcesoPreciosFactor() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProcesoPreciosFactor.setVisible(false);
	        this.jInternalFrameOrderByProcesoPreciosFactor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProcesoPreciosFactor() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setVisible(false);
	        this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProcesoPreciosFactor() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProcesoPreciosFactor.setVisible(false);
	        this.jInternalFrameImportacionProcesoPreciosFactor.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProcesoPreciosFactor(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProcesoPreciosFactor(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProcesoPreciosFactor(true);
			//this.isEsNuevoProcesoPreciosFactor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false) ;
			
			if(procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosFactor(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProcesoPreciosFactorActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProcesoPreciosFactor(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProcesoPreciosFactor(true);
			//this.isEsNuevoProcesoPreciosFactor=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.procesopreciosfactor.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false) ;
			
			if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProcesoPreciosFactor(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProcesoPreciosFactor(false);
			
			//if(!this.isEsNuevoProcesoPreciosFactor) {								
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				
			}
			
			if(this.permiteMantenimiento(this.procesopreciosfactor)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProcesoPreciosFactor=true;
					this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
					this.isEsNuevoProcesoPreciosFactor=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProcesoPreciosFactor=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProcesoPreciosFactor=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(false);
				
				this.habilitarDeshabilitarControlesProcesoPreciosFactor(false);
			
												
				
				if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProcesoPreciosFactor();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProcesoPreciosFactorActionPerformed(evt,procesopreciosfactorSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProcesoPreciosFactor(this.procesopreciosfactor,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,procesopreciosfactorSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.procesopreciosfactor.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				this.procesopreciosfactor.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				this.procesopreciosfactor.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.procesopreciosfactor)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProcesoPreciosFactorModel) this.jTableDatosProcesoPreciosFactor.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProcesoPreciosFactor=true;
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
				this.isEsNuevoProcesoPreciosFactor=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(false);
				
				this.habilitarDeshabilitarControlesProcesoPreciosFactor(false);
				
				
				
				if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProcesoPreciosFactor();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProcesoPreciosFactor.getRowCount()>=1) {
				jTableDatosProcesoPreciosFactor.removeRowSelectionInterval(0, jTableDatosProcesoPreciosFactor.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProcesoPreciosFactor(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(false) ;
			
			this.isEsNuevoProcesoPreciosFactor=false;
			
			if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProcesoPreciosFactor();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProcesoPreciosFactor(false);
				
				//SI ES MANUAL
				if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProcesoPreciosFactor();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProcesoPreciosFactor--;			
			//ProcesoPreciosFactor procesopreciosfactorAux= new ProcesoPreciosFactor();			
			//procesopreciosfactorAux.setId(this.iIdNuevoProcesoPreciosFactor);
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProcesoPreciosFactor();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
			
			this.procesopreciosfactor.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.procesopreciosfactorLogic.getProcesoPreciosFactors().add(this.procesopreciosfactorAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.procesopreciosfactors.add(this.procesopreciosfactorAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			
			this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(this.getIndiceNuevoProcesoPreciosFactor(), this.getIndiceNuevoProcesoPreciosFactor());
			
			int iLastRow =  this.jTableDatosProcesoPreciosFactor.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProcesoPreciosFactor.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProcesoPreciosFactor.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosFactor();
			}
			
			//this.abrirFrameTreeProcesoPreciosFactor();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProcesoPreciosFactor.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProcesoPreciosFactor.setFileImportacion(this.jInternalFrameImportacionProcesoPreciosFactor.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProcesoPreciosFactor.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProcesoPreciosFactor.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProcesoPreciosFactor.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProcesoPreciosFactor.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		

		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProcesoPreciosFactorBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProcesoPreciosFactorBaseDesign.jrxml";
			
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
			
			this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ctor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ctor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ctor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ctor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR:
					sNombreCampoCategoria="factor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR:
					sNombreCampoCategoriaValor="factor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"factor");
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
	
	public void jButtonGenerarExcelReporteDinamicoProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ProcesoPreciosFactors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getcodigo_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getprecio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR);
					iRow++;

					for(ProcesoPreciosFactor procesopreciosfactor:procesopreciosfactorsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(procesopreciosfactor.getfactor());
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
			//	this.getFilaCabeceraExportarExcelProcesoPreciosFactor(row);				
			//	iRow++;
			//}				
			
			//for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProcesoPreciosFactor(procesopreciosfactorAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
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
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProcesoPreciosFactor();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPreciosFactor();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
			
			//SI ES MANUAL
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProcesoPreciosFactor();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProcesoPreciosFactor() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProcesoPreciosFactor.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProcesoPreciosFactor.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProcesoPreciosFactor.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProcesoPreciosFactor.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProcesoPreciosFactor.setMinimumSize(dimensionMinimum);
		this.jTableDatosProcesoPreciosFactor.setMaximumSize(dimensionMaximum);
		this.jTableDatosProcesoPreciosFactor.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProcesoPreciosFactor(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProcesoPreciosFactor(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProcesoPreciosFactor(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProcesoPreciosFactor(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProcesoPreciosFactor(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProcesoPreciosFactor(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosFactor(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProcesoPreciosFactor(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProcesoPreciosFactor() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProcesoPreciosFactor();
		
		this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPreciosFactor();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosFactor() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosFactor(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosFactor(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProcesoPreciosFactor.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProcesoPreciosFactor.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionNuevoProcesoPreciosFactor.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProcesoPreciosFactor.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProcesoPreciosFactor.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionNuevoProcesoPreciosFactor.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionSinCerrarProcesoPreciosFactor.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jCheckBoxPostAccionSinMensajeProcesoPreciosFactor.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProcesoPreciosFactor.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProcesoPreciosFactor.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProcesoPreciosFactor.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProcesoPreciosFactor.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProcesoPreciosFactor.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProcesoPreciosFactor.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProcesoPreciosFactor.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProcesoPreciosFactor(Boolean esInicializar) throws Exception {
		try	{	
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProcesoPreciosFactor(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProcesoPreciosFactor() throws Exception {
		try	{
			if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPreciosFactor();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPreciosFactor() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProcesoPreciosFactor() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProcesoPreciosFactor.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProcesoPreciosFactor.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProcesoPreciosFactor.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProcesoPreciosFactor.addItem(reporte);
			}
			
			
			if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProcesoPreciosFactor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProcesoPreciosFactor.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProcesoPreciosFactor.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProcesoPreciosFactor.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProcesoPreciosFactor.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProcesoPreciosFactor.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProcesoPreciosFactor.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosFactor();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProcesoPreciosFactor() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
				
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ProcesoPreciosFactorConstantesFunciones.getTiposSeleccionarProcesoPreciosFactor(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ProcesoPreciosFactorConstantesFunciones.getTiposSeleccionarProcesoPreciosFactor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ProcesoPreciosFactorConstantesFunciones.getTiposSeleccionarProcesoPreciosFactor(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProcesoPreciosFactor()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_bodegaBusquedaProcesoPreciosFactor=((Bodega)this.jComboBoxid_bodegaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_productoBusquedaProcesoPreciosFactor=((Producto)this.jComboBoxid_productoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_lineaBusquedaProcesoPreciosFactor=((Linea)this.jComboBoxid_lineaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_linea_grupoBusquedaProcesoPreciosFactor=((Linea)this.jComboBoxid_linea_grupoBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_linea_categoriaBusquedaProcesoPreciosFactor=((Linea)this.jComboBoxid_linea_categoriaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()!=null){this.id_linea_marcaBusquedaProcesoPreciosFactor=((Linea)this.jComboBoxid_linea_marcaBusquedaProcesoPreciosFactorProcesoPreciosFactor.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProcesoPreciosFactor(Boolean esInicializar) throws Exception {				
		if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProcesoPreciosFactor();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProcesoPreciosFactor() throws Exception {
		this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProcesoPreciosFactor() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProcesoPreciosFactorOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactorOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProcesoPreciosFactor(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=procesopreciosfactorLogic.getProcesoPreciosFactors().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=procesopreciosfactors.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProcesoPreciosFactor.setModel(new ProcesoPreciosFactorModel(this.procesopreciosfactorLogic.getProcesoPreciosFactors(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProcesoPreciosFactor.setModel(new ProcesoPreciosFactorModel(this.procesopreciosfactors,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProcesoPreciosFactor!=null && this.jInternalFrameOrderByProcesoPreciosFactor.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProcesoPreciosFactor();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,procesopreciosfactorConstantesFunciones.resaltarSeleccionarProcesoPreciosFactor,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProcesoPreciosFactorConstantesFunciones.SCLASSWEBTITULO,procesopreciosfactorConstantesFunciones.resaltarSeleccionarProcesoPreciosFactor,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_ID));

		if(this.procesopreciosfactorConstantesFunciones.mostraridProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosfactorConstantesFunciones.resaltaridProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activaridProcesoPreciosFactor,iSizeTabla,this,true,"idProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltaridProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activaridProcesoPreciosFactor,this,true,"idProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO));

		if(this.procesopreciosfactorConstantesFunciones.mostrarcodigoProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosfactorConstantesFunciones.resaltarcodigoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarcodigoProcesoPreciosFactor,iSizeTabla,this,true,"codigoProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarcodigoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarcodigoProcesoPreciosFactor,this,true,"codigoProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE));

		if(this.procesopreciosfactorConstantesFunciones.mostrarnombreProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosfactorConstantesFunciones.resaltarnombreProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarnombreProcesoPreciosFactor,iSizeTabla,this,true,"nombreProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarnombreProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarnombreProcesoPreciosFactor,this,true,"nombreProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.procesopreciosfactorConstantesFunciones.mostrarcodigo_productoProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosfactorConstantesFunciones.resaltarcodigo_productoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarcodigo_productoProcesoPreciosFactor,iSizeTabla,this,true,"codigo_productoProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarcodigo_productoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarcodigo_productoProcesoPreciosFactor,this,true,"codigo_productoProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.procesopreciosfactorConstantesFunciones.mostrarnombre_productoProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.procesopreciosfactorConstantesFunciones.resaltarnombre_productoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarnombre_productoProcesoPreciosFactor,iSizeTabla,this,true,"nombre_productoProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarnombre_productoProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarnombre_productoProcesoPreciosFactor,this,true,"nombre_productoProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO));

		if(this.procesopreciosfactorConstantesFunciones.mostrarprecioProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosfactorConstantesFunciones.resaltarprecioProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarprecioProcesoPreciosFactor,iSizeTabla,this,true,"precioProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarprecioProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarprecioProcesoPreciosFactor,this,true,"precioProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR));

		if(this.procesopreciosfactorConstantesFunciones.mostrarfactorProcesoPreciosFactor && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.procesopreciosfactorConstantesFunciones.resaltarfactorProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarfactorProcesoPreciosFactor,iSizeTabla,this,true,"factorProcesoPreciosFactor","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.procesopreciosfactorConstantesFunciones.resaltarfactorProcesoPreciosFactor,this.procesopreciosfactorConstantesFunciones.activarfactorProcesoPreciosFactor,this,true,"factorProcesoPreciosFactor","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ProcesoPreciosFactorPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPreciosFactor.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProcesoPreciosFactor.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProcesoPreciosFactor.addColumn(tableColumn);
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
			
			this.jTableDatosProcesoPreciosFactor.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProcesoPreciosFactor.moveColumn(this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProcesoPreciosFactor.moveColumn(this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProcesoPreciosFactor.moveColumn(this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProcesoPreciosFactor.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProcesoPreciosFactor.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProcesoPreciosFactor,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProcesoPreciosFactor.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProcesoPreciosFactor.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProcesoPreciosFactor.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=procesopreciosfactorLogic.getProcesoPreciosFactors().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=procesopreciosfactors.size()-1;
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
		//this.jTableDatosProcesoPreciosFactor.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProcesoPreciosFactor.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProcesoPreciosFactor();
			
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
				
				//this.isEsNuevoProcesoPreciosFactor=false;
					
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
				if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPreciosFactor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.procesopreciosfactor.getsType().equals("DUPLICADO")
				   || this.procesopreciosfactor.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProcesoPreciosFactor=true;
				
				} else {
					this.isEsNuevoProcesoPreciosFactor=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
					if(this.procesopreciosfactor.getId()>=0 && !this.procesopreciosfactor.getIsNew()) {						
						this.isEsNuevoProcesoPreciosFactor=false;
						
					} else {
						this.isEsNuevoProcesoPreciosFactor=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProcesoPreciosFactor(esRelaciones);						
				
				this.seleccionarProcesoPreciosFactor(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.procesopreciosfactor.getId()<0) {
					this.isEsNuevoProcesoPreciosFactor=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProcesoPreciosFactor(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProcesoPreciosFactor(evt,rowIndex);
				}	
				
				if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ProcesoPreciosFactor: " + this.dDif); 
					}
				}								
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProcesoPreciosFactor(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.procesopreciosfactor)) {
					if(this.procesopreciosfactor.getId()>0) {
						this.procesopreciosfactor.setIsDeleted(true);
						
						this.procesopreciosfactorsEliminados.add(this.procesopreciosfactor);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.procesopreciosfactorLogic.getProcesoPreciosFactors().remove(this.procesopreciosfactor);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactors.remove(this.procesopreciosfactor);				
					}
					
					
					((ProcesoPreciosFactorModel) this.jTableDatosProcesoPreciosFactor.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProcesoPreciosFactor(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProcesoPreciosFactor) {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProcesoPreciosFactor.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProcesoPreciosFactor.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactor);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProcesoPreciosFactor("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProcesoPreciosFactor(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProcesoPreciosFactor(procesopreciosfactor,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProcesoPreciosFactor(procesopreciosfactor);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProcesoPreciosFactor(procesopreciosfactor,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosFactor(procesopreciosfactor);
	}
	
	public void setVariablesObjetoActualToFormularioProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setText(procesopreciosfactor.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setText(procesopreciosfactor.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setText(procesopreciosfactor.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setText(procesopreciosfactor.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setText(procesopreciosfactor.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setText(procesopreciosfactor.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setText(procesopreciosfactor.getfactor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ProcesoPreciosFactor procesopreciosfactorLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,procesopreciosfactorLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ProcesoPreciosFactor procesopreciosfactorLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				procesopreciosfactorLocal=this.procesopreciosfactor;
			} else {
				procesopreciosfactorLocal=this.procesopreciosfactorAnterior;
			}
		}
		
		if(this.permiteMantenimiento(procesopreciosfactorLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProcesoPreciosFactor(procesopreciosfactorLocal,true);
					
					if(procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(procesopreciosfactorLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(procesopreciosfactorLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(procesopreciosfactor,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(procesopreciosfactor);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(procesopreciosfactor,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.getText()==null || this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.getText()=="" || this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.getText()=="Id") {
				this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setText("0");
			}

			if(conColumnasBase) {procesopreciosfactor.setId(Long.parseLong(this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelIdProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setcodigo(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigoProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setnombre(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombreProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setcodigo_producto(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelcodigo_productoProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setnombre_producto(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelnombre_productoProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelprecioProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			procesopreciosfactor.setfactor(Double.parseDouble(this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelfactorProcesoPreciosFactor,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactorBean,ProcesoPreciosFactor procesopreciosfactor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactorOrigen,ProcesoPreciosFactor procesopreciosfactor,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopreciosfactorOrigen.getId()!=null && !procesopreciosfactorOrigen.getId().equals(0L))) {procesopreciosfactor.setId(procesopreciosfactorOrigen.getId());}}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getcodigo()!=null && !procesopreciosfactorOrigen.getcodigo().equals(""))) {procesopreciosfactor.setcodigo(procesopreciosfactorOrigen.getcodigo());}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getnombre()!=null && !procesopreciosfactorOrigen.getnombre().equals(""))) {procesopreciosfactor.setnombre(procesopreciosfactorOrigen.getnombre());}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getcodigo_producto()!=null && !procesopreciosfactorOrigen.getcodigo_producto().equals(""))) {procesopreciosfactor.setcodigo_producto(procesopreciosfactorOrigen.getcodigo_producto());}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getnombre_producto()!=null && !procesopreciosfactorOrigen.getnombre_producto().equals(""))) {procesopreciosfactor.setnombre_producto(procesopreciosfactorOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getprecio()!=null && !procesopreciosfactorOrigen.getprecio().equals(0.0))) {procesopreciosfactor.setprecio(procesopreciosfactorOrigen.getprecio());}
			if(conDefault || (!conDefault && procesopreciosfactorOrigen.getfactor()!=null && !procesopreciosfactorOrigen.getfactor().equals(0.0))) {procesopreciosfactor.setfactor(procesopreciosfactorOrigen.getfactor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setText(procesopreciosfactor.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setText(procesopreciosfactor.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setText(procesopreciosfactor.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setText(procesopreciosfactor.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setText(procesopreciosfactor.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setText(procesopreciosfactor.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setText(procesopreciosfactor.getfactor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProcesoPreciosFactor(ProcesoPreciosFactorBean procesopreciosfactorBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setText(procesopreciosfactorBean.getId().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setText(procesopreciosfactorBean.getcodigo());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setText(procesopreciosfactorBean.getnombre());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setText(procesopreciosfactorBean.getcodigo_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setText(procesopreciosfactorBean.getnombre_producto());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setText(procesopreciosfactorBean.getprecio().toString());
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setText(procesopreciosfactorBean.getfactor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProcesoPreciosFactor(ProcesoPreciosFactorParameterReturnGeneral procesopreciosfactorReturnGeneral,ProcesoPreciosFactorBean procesopreciosfactorBean,Boolean conDefault) throws Exception { 
		try {
			ProcesoPreciosFactor procesopreciosfactorLocal=new ProcesoPreciosFactor();
			
			procesopreciosfactorLocal=procesopreciosfactorReturnGeneral.getProcesoPreciosFactor();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && procesopreciosfactorLocal.getId()!=null && !procesopreciosfactorLocal.getId().equals(0L))) {procesopreciosfactorBean.setId(procesopreciosfactorLocal.getId());}}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getcodigo()!=null && !procesopreciosfactorLocal.getcodigo().equals(""))) {procesopreciosfactorBean.setcodigo(procesopreciosfactorLocal.getcodigo());}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getnombre()!=null && !procesopreciosfactorLocal.getnombre().equals(""))) {procesopreciosfactorBean.setnombre(procesopreciosfactorLocal.getnombre());}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getcodigo_producto()!=null && !procesopreciosfactorLocal.getcodigo_producto().equals(""))) {procesopreciosfactorBean.setcodigo_producto(procesopreciosfactorLocal.getcodigo_producto());}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getnombre_producto()!=null && !procesopreciosfactorLocal.getnombre_producto().equals(""))) {procesopreciosfactorBean.setnombre_producto(procesopreciosfactorLocal.getnombre_producto());}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getprecio()!=null && !procesopreciosfactorLocal.getprecio().equals(0.0))) {procesopreciosfactorBean.setprecio(procesopreciosfactorLocal.getprecio());}
			if(conDefault || (!conDefault && procesopreciosfactorLocal.getfactor()!=null && !procesopreciosfactorLocal.getfactor().equals(0.0))) {procesopreciosfactorBean.setfactor(procesopreciosfactorLocal.getfactor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProcesoPreciosFactorGenerico(Long idProcesoPreciosFactorSeleccionado,JComboBox jComboBoxProcesoPreciosFactor,List<ProcesoPreciosFactor> procesopreciosfactorsLocal)throws Exception {
		try {
			ProcesoPreciosFactor  procesopreciosfactorTemp=null;

			for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsLocal) {
				if(procesopreciosfactorAux.getId()!=null && procesopreciosfactorAux.getId().equals(idProcesoPreciosFactorSeleccionado)) {
					procesopreciosfactorTemp=procesopreciosfactorAux;
					break;
				}
			}

			jComboBoxProcesoPreciosFactor.setSelectedItem(procesopreciosfactorTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProcesoPreciosFactorGenerico(JComboBox jComboBoxProcesoPreciosFactor,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPreciosFactor.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProcesoPreciosFactor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProcesoPreciosFactor.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProcesoPreciosFactor.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProcesoPreciosFactor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProcesoPreciosFactor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosfactor=(ProcesoPreciosFactor) procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopreciosfactor =(ProcesoPreciosFactor) procesopreciosfactors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!procesopreciosfactor.getIsNew() && !procesopreciosfactor.getIsChanged() && !procesopreciosfactor.getIsDeleted()) {
				sDescripcion=procesopreciosfactor.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=procesopreciosfactor.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ProcesoPreciosFactor procesopreciosfactorRow=new ProcesoPreciosFactor();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosfactorRow=(ProcesoPreciosFactor) procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			procesopreciosfactorRow=(ProcesoPreciosFactor) procesopreciosfactors.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProcesoPreciosFactor(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));			
			this.jButtonDuplicarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosFactor && this.isPermisoDuplicarProcesoPreciosFactor));			
			this.jButtonCopiarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosFactor && this.isPermisoCopiarProcesoPreciosFactor));
			this.jButtonVerFormProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosFactor && this.isPermisoVerFormProcesoPreciosFactor));
			
			this.jButtonAbrirOrderByProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));			
			
			this.jButtonNuevoRelacionesProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));			
			this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosFactor && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosFactor && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosFactor && this.isPermisoEliminarProcesoPreciosFactor));
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosFactor);							
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));			
			
			}
						
			this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));						
			this.jButtonDuplicarToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosFactor && this.isPermisoDuplicarProcesoPreciosFactor));						
			this.jButtonCopiarToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosFactor && this.isPermisoCopiarProcesoPreciosFactor));			
			this.jButtonVerFormToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosFactor && this.isPermisoVerFormProcesoPreciosFactor));			
			this.jButtonAbrirOrderByToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));
			this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));			
			this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));			
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosFactor && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosFactor  && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosFactor && this.isPermisoEliminarProcesoPreciosFactor));
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarToolBarProcesoPreciosFactor.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosFactor);				
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));			
			this.jMenuItemDuplicarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaDuplicarProcesoPreciosFactor && this.isPermisoDuplicarProcesoPreciosFactor));			
			this.jMenuItemCopiarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaCopiarProcesoPreciosFactor && this.isPermisoCopiarProcesoPreciosFactor));			
			this.jMenuItemVerFormProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaVerFormProcesoPreciosFactor && this.isPermisoVerFormProcesoPreciosFactor));			
			this.jMenuItemAbrirOrderByProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));			
			//this.jMenuItemMostrarOcultarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));
			this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));			
			//this.jMenuItemDetalleMostrarOcultarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaOrdenProcesoPreciosFactor && this.isPermisoOrdenProcesoPreciosFactor));			
			this.jMenuItemNuevoRelacionesProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor));			
			this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaNuevoProcesoPreciosFactor && this.isPermisoNuevoProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));									
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemModificarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaModificarProcesoPreciosFactor && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemActualizarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaActualizarProcesoPreciosFactor && this.isPermisoActualizarProcesoPreciosFactor));	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemEliminarProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaEliminarProcesoPreciosFactor && this.isPermisoEliminarProcesoPreciosFactor));
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemCancelarProcesoPreciosFactor.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosFactor);				
			}
			
			this.jMenuItemGuardarCambiosProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));						
			this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=this.jButtonNuevoProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaDuplicarProcesoPreciosFactor=this.jButtonDuplicarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaCopiarProcesoPreciosFactor=this.jButtonCopiarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaVerFormProcesoPreciosFactor=this.jButtonVerFormProcesoPreciosFactor.isVisible();
			
			this.isVisibilidadCeldaOrdenProcesoPreciosFactor=this.jButtonAbrirOrderByProcesoPreciosFactor.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=this.jButtonNuevoRelacionesProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=this.jButtonModificarProcesoPreciosFactor.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaGuardarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=this.jButtonGuardarCambiosTablaProcesoPreciosFactor.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=this.jButtonNuevoToolBarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarToolBarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarToolBarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarToolBarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarToolBarProcesoPreciosFactor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPreciosFactor=this.jButtonGuardarCambiosToolBarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=this.jMenuItemNuevoProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=this.jMenuItemNuevoRelacionesProcesoPreciosFactor.isVisible();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemModificarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemActualizarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemEliminarProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemCancelarProcesoPreciosFactor.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProcesoPreciosFactor=this.jMenuItemGuardarCambiosProcesoPreciosFactor.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProcesoPreciosFactor(Boolean esInicializar) {
		if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {			
			if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
				//if(this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPreciosFactor();
			}
			
			this.inicializarActualizarBindingBotonesManualProcesoPreciosFactor(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProcesoPreciosFactor() {
		this.jButtonNuevoProcesoPreciosFactor.setVisible(this.isPermisoNuevoProcesoPreciosFactor);			
		this.jButtonDuplicarProcesoPreciosFactor.setVisible(this.isPermisoDuplicarProcesoPreciosFactor);			
		this.jButtonCopiarProcesoPreciosFactor.setVisible(this.isPermisoCopiarProcesoPreciosFactor);			
		this.jButtonVerFormProcesoPreciosFactor.setVisible(this.isPermisoVerFormProcesoPreciosFactor);			
		
		this.jButtonAbrirOrderByProcesoPreciosFactor.setVisible(this.isPermisoOrdenProcesoPreciosFactor);					
		
		this.jButtonNuevoRelacionesProcesoPreciosFactor.setVisible(this.isPermisoNuevoProcesoPreciosFactor);			
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarProcesoPreciosFactor.setVisible(this.isPermisoActualizarProcesoPreciosFactor);	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.setVisible(this.isPermisoActualizarProcesoPreciosFactor);	
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.setVisible(this.isPermisoEliminarProcesoPreciosFactor);
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosFactor);						
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.setVisible(this.isPermisoGuardarCambiosProcesoPreciosFactor);							
		}
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.setVisible(this.isPermisoActualizarProcesoPreciosFactor);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPreciosFactor() {
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarProcesoPreciosFactor.setVisible(this.isPermisoActualizarProcesoPreciosFactor);	
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.setVisible(this.isPermisoActualizarProcesoPreciosFactor);	
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.setVisible(this.isPermisoEliminarProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.setVisible(this.isVisibilidadCeldaCancelarProcesoPreciosFactor);							
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.setVisible((this.isVisibilidadCeldaGuardarProcesoPreciosFactor && this.isPermisoGuardarCambiosProcesoPreciosFactor));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProcesoPreciosFactor() {
		if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProcesoPreciosFactor();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProcesoPreciosFactor() {
	}
	
	public void jTableDatosProcesoPreciosFactorListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProcesoPreciosFactor(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.procesopreciosfactor.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.procesopreciosfactor.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.procesopreciosfactor.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.procesopreciosfactor.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.procesopreciosfactor.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.procesopreciosfactor.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.procesopreciosfactor.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.procesopreciosfactor.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaProcesoPreciosFactorUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebProcesoPreciosFactor(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosProcesoPreciosFactor.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosProcesoPreciosFactor.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.procesopreciosfactorLogic.getConnexion());

				if(this.procesopreciosfactor.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.procesopreciosfactor.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderProcesoPreciosFactor=(TitledBorder)this.jScrollPanelDatosProcesoPreciosFactor.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderProcesoPreciosFactor.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.procesopreciosfactor.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.procesopreciosfactor.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.procesopreciosfactor.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.procesopreciosfactor.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.procesopreciosfactor.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.procesopreciosfactor.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfactorProcesoPreciosFactorBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.getprocesopreciosfactor(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.procesopreciosfactor==null) {
						this.procesopreciosfactor = new ProcesoPreciosFactor();
					}

					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);
				}

				if(this.procesopreciosfactor.getfactor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where factor = "+this.procesopreciosfactor.getfactor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProcesoPreciosFactor(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsBusquedaProcesoPreciosFactor();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdBodega();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdEmpresa();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdLinea();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdLineaCategoria();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdLineaGrupo();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdLineaMarca();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdProducto();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalProcesoPreciosFactorActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);

			this.getProcesoPreciosFactorsFK_IdSucursal();

			this.inicializarActualizarBindingProcesoPreciosFactor(false);

			//if(ProcesoPreciosFactorBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.procesopreciosfactorLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProcesoPreciosFactor() {
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.setVisible(false);	    			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.dispose();
			this.jInternalFrameDetalleFormProcesoPreciosFactor=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
			this.jInternalFrameReporteDinamicoProcesoPreciosFactor.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProcesoPreciosFactor.dispose();
			this.jInternalFrameReporteDinamicoProcesoPreciosFactor=null;
		}
		
		if(this.jInternalFrameImportacionProcesoPreciosFactor!=null) {
			this.jInternalFrameImportacionProcesoPreciosFactor.setVisible(false);	    			
			this.jInternalFrameImportacionProcesoPreciosFactor.dispose();
			this.jInternalFrameImportacionProcesoPreciosFactor=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProcesoPreciosFactor();
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			
			if(sTipo.equals("NuevoProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProcesoPreciosFactor")) {
				jButtonDuplicarProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProcesoPreciosFactor")) {
				jButtonCopiarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("VerFormProcesoPreciosFactor")) {
				jButtonVerFormProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProcesoPreciosFactor")) {
				jButtonDuplicarProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProcesoPreciosFactor")) {
				jButtonDuplicarProcesoPreciosFactorActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProcesoPreciosFactor")) {
				jButtonModificarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProcesoPreciosFactor")) {
				jButtonModificarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProcesoPreciosFactor")) {
				jButtonModificarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProcesoPreciosFactor")) {
				jButtonActualizarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProcesoPreciosFactor")) {
				jButtonActualizarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProcesoPreciosFactor")) {
				jButtonActualizarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("EliminarProcesoPreciosFactor")) {
				jButtonEliminarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProcesoPreciosFactor")) {
				jButtonEliminarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProcesoPreciosFactor")) {
				jButtonEliminarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("CancelarProcesoPreciosFactor")) {
				jButtonCancelarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProcesoPreciosFactor")) {
				jButtonCancelarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProcesoPreciosFactor")) {
				jButtonCancelarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("CerrarProcesoPreciosFactor")) {
				jButtonCerrarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProcesoPreciosFactor")) {
				jButtonCerrarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProcesoPreciosFactor")) {
				jButtonCerrarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProcesoPreciosFactor")) {
				jButtonMostrarOcultarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProcesoPreciosFactor")) {
				jButtonCancelarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProcesoPreciosFactor")) {
				jButtonCopiarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProcesoPreciosFactor")) {
				jButtonVerFormProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProcesoPreciosFactor")) {
				jButtonCopiarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProcesoPreciosFactor")) {
				jButtonVerFormProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProcesoPreciosFactor")) {
				jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProcesoPreciosFactor")) {
				jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProcesoPreciosFactor")) {
				jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProcesoPreciosFactor")) {
				jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProcesoPreciosFactor")) {
				jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProcesoPreciosFactor")) {
				jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProcesoPreciosFactor")) {
				jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProcesoPreciosFactor")) {
				jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProcesoPreciosFactor")) {
				jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProcesoPreciosFactor") || sTipo.equals("MenuItemDetalleAbrirOrderByProcesoPreciosFactor")) {
				jButtonAbrirOrderByProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProcesoPreciosFactor") || sTipo.equals("MenuItemDetalleMostrarOcultarProcesoPreciosFactor")) {
				jButtonMostrarOcultarProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPreciosFactor")) {
				jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProcesoPreciosFactor")) {
				jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProcesoPreciosFactor")) {
				jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProcesoPreciosFactor")) {
				jButtonCerrarReporteDinamicoProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProcesoPreciosFactor")) {
				jButtonGenerarReporteDinamicoProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProcesoPreciosFactor")) {
				
				jButtonGenerarExcelReporteDinamicoProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProcesoPreciosFactor")) {
				jButtonCerrarImportacionProcesoPreciosFactorActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProcesoPreciosFactor")) {
				
				jButtonGenerarImportacionProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProcesoPreciosFactor")) {
				
				jButtonAbrirImportacionProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProcesoPreciosFactor")) {
				jComboBoxTiposAccionesProcesoPreciosFactorActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProcesoPreciosFactor")) {
				jComboBoxTiposRelacionesProcesoPreciosFactorActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProcesoPreciosFactor")) {
				jComboBoxTiposAccionesProcesoPreciosFactorActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProcesoPreciosFactor")) {
				
				jComboBoxTiposSeleccionarProcesoPreciosFactorActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProcesoPreciosFactor")) {
				jTextFieldValorCampoGeneralProcesoPreciosFactorActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProcesoPreciosFactor")) {
				jButtonAbrirOrderByProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProcesoPreciosFactor")) {
				jButtonAbrirOrderByProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProcesoPreciosFactor")) {
				jButtonCerrarOrderByProcesoPreciosFactorActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPreciosFactorBusqueda")) {
				this.jButtonidProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosFactorUpdate")) {
				this.jButtonid_bodegaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_bodegaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosFactorUpdate")) {
				this.jButtonid_productoProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosFactorBusqueda")) {
				this.jButtonid_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosFactorUpdate")) {
				this.jButtonid_empresaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_empresaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosFactorUpdate")) {
				this.jButtonid_sucursalProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosFactorBusqueda")) {
				this.jButtonid_sucursalProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosFactorUpdate")) {
				this.jButtonid_lineaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_lineaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_grupoProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_grupoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_categoriaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_categoriaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_marcaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_marcaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPreciosFactorBusqueda")) {
				this.jButtoncodigoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoPreciosFactorBusqueda")) {
				this.jButtonnombreProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoPreciosFactorBusqueda")) {
				this.jButtoncodigo_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoPreciosFactorBusqueda")) {
				this.jButtonnombre_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoPreciosFactorBusqueda")) {
				this.jButtonprecioProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("factorProcesoPreciosFactorBusqueda")) {
				this.jButtonfactorProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaProcesoPreciosFactorProcesoPreciosFactor")) {
				this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactorActionPerformed(evt);
			}
			
			;
			
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProcesoPreciosFactor();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ProcesoPreciosFactor procesopreciosfactorLocal=null;
			
			if(!this.getEsControlTabla()) {
				procesopreciosfactorLocal=this.procesopreciosfactor;
			} else {
				procesopreciosfactorLocal=this.procesopreciosfactorAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
							
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
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
			
			


			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
								
						
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
								
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
							
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
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
			
			


			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
								
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
			
			this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProcesoPreciosFactor")) {
					jCheckBoxSeleccionarTodosProcesoPreciosFactorItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProcesoPreciosFactor")) {
					jCheckBoxSeleccionadosProcesoPreciosFactorItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProcesoPreciosFactor")) {
					
				}
				
				


				
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
												
				
				


				
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
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
			
			


			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.procesopreciosfactor);
				
				this.actualizarInformacion("INFO_PADRE",false,this.procesopreciosfactor);
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
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
				
				


				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ProcesoPreciosFactor.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ProcesoPreciosFactor.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProcesoPreciosFactorActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.procesopreciosfactorAnterior =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProcesoPreciosFactor")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProcesoPreciosFactorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProcesoPreciosFactor.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.procesopreciosfactor =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.procesopreciosfactor);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProcesoPreciosFactor")) {
				
				}
				
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProcesoPreciosFactor")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProcesoPreciosFactor.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProcesoPreciosFactor")) {
			
			}
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProcesoPreciosFactor();
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			if(sTipo.equals("NuevoProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProcesoPreciosFactor")) {
				jButtonDuplicarProcesoPreciosFactorActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProcesoPreciosFactor")) {
				jButtonCopiarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProcesoPreciosFactor")) {
				jButtonVerFormProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProcesoPreciosFactor")) {
				jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProcesoPreciosFactor")) {
				jButtonModificarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProcesoPreciosFactor")) {
				jButtonActualizarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProcesoPreciosFactor")) {
				jButtonEliminarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProcesoPreciosFactor")) {
				jButtonCancelarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProcesoPreciosFactor")) {
				jButtonCerrarProcesoPreciosFactorActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProcesoPreciosFactor")) {
				jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProcesoPreciosFactor")) {
				jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProcesoPreciosFactor")) {
				jButtonAbrirOrderByProcesoPreciosFactorActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProcesoPreciosFactor")) {
				jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProcesoPreciosFactor")) {
				jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProcesoPreciosFactor")) {
				jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProcesoPreciosFactorBusqueda")) {
				this.jButtonidProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosFactorUpdate")) {
				this.jButtonid_bodegaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_bodegaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosFactorUpdate")) {
				this.jButtonid_productoProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoProcesoPreciosFactorBusqueda")) {
				this.jButtonid_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosFactorUpdate")) {
				this.jButtonid_empresaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_empresaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosFactorUpdate")) {
				this.jButtonid_sucursalProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalProcesoPreciosFactorBusqueda")) {
				this.jButtonid_sucursalProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosFactorUpdate")) {
				this.jButtonid_lineaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_lineaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_grupoProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_grupoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_categoriaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_categoriaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosFactorUpdate")) {
				this.jButtonid_linea_marcaProcesoPreciosFactorUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaProcesoPreciosFactorBusqueda")) {
				this.jButtonid_linea_marcaProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProcesoPreciosFactorBusqueda")) {
				this.jButtoncodigoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProcesoPreciosFactorBusqueda")) {
				this.jButtonnombreProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoProcesoPreciosFactorBusqueda")) {
				this.jButtoncodigo_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoProcesoPreciosFactorBusqueda")) {
				this.jButtonnombre_productoProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioProcesoPreciosFactorBusqueda")) {
				this.jButtonprecioProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("factorProcesoPreciosFactorBusqueda")) {
				this.jButtonfactorProcesoPreciosFactorBusquedaActionPerformed(evt);
			}
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProcesoPreciosFactor();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProcesoPreciosFactor")) {
				closingInternalFrameProcesoPreciosFactor();
				
			} else if(sTipo.equals("jButtonCancelarProcesoPreciosFactor")) {
				JInternalFrameBase jInternalFrameDetalleFormProcesoPreciosFactor = (JInternalFrameBase)evt.getSource();
	            	
	            ProcesoPreciosFactorBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPreciosFactorBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPreciosFactor.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProcesoPreciosFactorActionPerformed(null);
			}
			
			ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.procesopreciosfactor,new Object(),this.procesopreciosfactorParameterGeneral,this.procesopreciosfactorReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProcesoPreciosFactor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProcesoPreciosFactor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProcesoPreciosFactor(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.procesopreciosfactor)) {
			if(!esControlTabla) {
				if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);			
				}
				
				if(this.procesopreciosfactorSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral,this.procesopreciosfactorBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.procesopreciosfactorSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPreciosFactor(classes,this.procesopreciosfactorReturnGeneral,this.procesopreciosfactorBean,false);
					}
						
					if(this.procesopreciosfactorReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor());	
					}
						
					if(this.procesopreciosfactorReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor(),classes);//this.procesopreciosfactorBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProcesoPreciosFactor(this.procesopreciosfactor,classes);//this.procesopreciosfactorBean);									
				}
			
				if(ProcesoPreciosFactorJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProcesoPreciosFactor(this.procesopreciosfactor,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProcesoPreciosFactor(this.procesopreciosfactor);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.procesopreciosfactorAnterior!=null) {
						this.procesopreciosfactor=this.procesopreciosfactorAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.procesopreciosfactorSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.procesopreciosfactorSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor(),procesopreciosfactorLogic.getProcesoPreciosFactors());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactor(),this.procesopreciosfactors);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProcesoPreciosFactor.repaint();
				
				//((AbstractTableModel) this.jTableDatosProcesoPreciosFactor.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProcesoPreciosFactor();
			}
		}
	}
	
	public void actualizarVisualTableDatosProcesoPreciosFactor() throws Exception {
		
		ProcesoPreciosFactorModel procesopreciosfactorModel=(ProcesoPreciosFactorModel)this.jTableDatosProcesoPreciosFactor.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			procesopreciosfactorModel.procesopreciosfactors=this.procesopreciosfactorLogic.getProcesoPreciosFactors();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			procesopreciosfactorModel.procesopreciosfactors=this.procesopreciosfactors;
		}
		
		
		((ProcesoPreciosFactorModel) this.jTableDatosProcesoPreciosFactor.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProcesoPreciosFactor() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprocesopreciosfactorAnterior(),this.procesopreciosfactorLogic.getProcesoPreciosFactors());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprocesopreciosfactorAnterior(),this.procesopreciosfactors);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProcesoPreciosFactor();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
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
										
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopreciosfactor,new Object(),generalEntityParameterGeneral,this.procesopreciosfactorReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProcesoPreciosFactorConstantesFunciones.getClassesRelationshipsOfProcesoPreciosFactor(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProcesoPreciosFactorConstantesFunciones.getClassesRelationshipsFromStringsOfProcesoPreciosFactor(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProcesoPreciosFactor(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.procesopreciosfactor,new Object(),generalEntityParameterGeneral,this.procesopreciosfactorReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProcesoPreciosFactor(ProcesoPreciosFactorBean procesopreciosfactorBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProcesoPreciosFactor(ArrayList<Classe> classes,ProcesoPreciosFactorReturnGeneral procesopreciosfactorReturnGeneral,ProcesoPreciosFactorBean procesopreciosfactorBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.procesopreciosfactor)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor = new ProcesoPreciosFactorDetalleFormJInternalFrame(jDesktopPane,this.procesopreciosfactorSessionBean.getConGuardarRelaciones(),this.procesopreciosfactorSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.setVisible(false);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.setSelected(false);						
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.procesopreciosfactorLogic=this.procesopreciosfactorLogic;
		
		this.cargarCombosFrameForeignKeyProcesoPreciosFactor("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProcesoPreciosFactor();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProcesoPreciosFactor();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProcesoPreciosFactor("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProcesoPreciosFactor();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPreciosFactor"));
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ModificarProcesoPreciosFactor"));

		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPreciosFactor"));
					
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemModificarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPreciosFactor"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPreciosFactor"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPreciosFactor"));
						
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemActualizarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPreciosFactor"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"EliminarProcesoPreciosFactor"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPreciosFactor"));
								
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemEliminarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPreciosFactor"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CancelarProcesoPreciosFactor"));
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPreciosFactor"));
					
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemCancelarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPreciosFactor"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemDetalleCerrarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPreciosFactor"));		
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosFactor"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosFactor"));
		
		
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPreciosFactor"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonidProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombreProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigo_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombre_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonprecioProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonfactorProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"factorProcesoPreciosFactorBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPreciosFactor"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProcesoPreciosFactor"));
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProcesoPreciosFactor"));
		}
		
		this.jTableDatosProcesoPreciosFactor.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProcesoPreciosFactor"));
		
		this.jTableDatosProcesoPreciosFactor.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProcesoPreciosFactor"));
		
		this.jButtonNuevoProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"NuevoProcesoPreciosFactor"));
		
		this.jButtonDuplicarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"DuplicarProcesoPreciosFactor"));
		
		this.jButtonCopiarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"CopiarProcesoPreciosFactor"));
		
		this.jButtonVerFormProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"VerFormProcesoPreciosFactor"));
		
		
		this.jButtonNuevoToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"NuevoToolBarProcesoPreciosFactor"));
			
		this.jButtonDuplicarToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProcesoPreciosFactor"));
			
		this.jMenuItemNuevoProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProcesoPreciosFactor"));
			
		this.jMenuItemDuplicarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProcesoPreciosFactor"));		
		
		
		this.jButtonNuevoRelacionesProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProcesoPreciosFactor"));
		
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProcesoPreciosFactor"));
			
		this.jMenuItemNuevoRelacionesProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProcesoPreciosFactor"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ModificarProcesoPreciosFactor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonModificarToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ModificarToolBarProcesoPreciosFactor"));
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemModificarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"MenuItemModificarProcesoPreciosFactor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"ActualizarProcesoPreciosFactor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonActualizarToolBarProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProcesoPreciosFactor"));
				
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemActualizarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProcesoPreciosFactor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"EliminarProcesoPreciosFactor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonEliminarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"EliminarToolBarProcesoPreciosFactor"));
						
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemEliminarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProcesoPreciosFactor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CancelarProcesoPreciosFactor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonCancelarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CancelarToolBarProcesoPreciosFactor"));
			
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemCancelarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProcesoPreciosFactor"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProcesoPreciosFactor"));		
		
		
		this.jButtonCerrarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CerrarProcesoPreciosFactor"));
		
		
		this.jButtonCerrarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CerrarToolBarProcesoPreciosFactor"));
			
		this.jMenuItemCerrarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProcesoPreciosFactor"));
			
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jMenuItemDetalleCerrarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProcesoPreciosFactor"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosProcesoPreciosFactor"));
		}
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProcesoPreciosFactor"));
		}
		
		this.jButtonCopiarToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CopiarToolBarProcesoPreciosFactor"));
			
		this.jButtonVerFormToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"VerFormToolBarProcesoPreciosFactor"));
		
		this.jMenuItemGuardarCambiosProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProcesoPreciosFactor"));
			
		this.jMenuItemCopiarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProcesoPreciosFactor"));		
		
		this.jMenuItemVerFormProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProcesoPreciosFactor"));		
		
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPreciosFactor"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProcesoPreciosFactor"));
			
		this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProcesoPreciosFactor"));		
		
		
		
		this.jButtonRecargarInformacionProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"RecargarInformacionProcesoPreciosFactor"));
					
		this.jButtonRecargarInformacionToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProcesoPreciosFactor"));
		
		this.jMenuItemRecargarInformacionProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProcesoPreciosFactor"));		
		
		
		
		this.jButtonAnterioresProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"AnterioresProcesoPreciosFactor"));
		
		
		this.jButtonAnterioresToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProcesoPreciosFactor"));
		
		this.jMenuItemAnterioresProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProcesoPreciosFactor"));		
		
		
		this.jButtonSiguientesProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"SiguientesProcesoPreciosFactor"));
		
		
		this.jButtonSiguientesToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProcesoPreciosFactor"));
			
		this.jMenuItemSiguientesProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProcesoPreciosFactor"));
			
		this.jMenuItemAbrirOrderByProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProcesoPreciosFactor"));
			
		this.jMenuItemMostrarOcultarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProcesoPreciosFactor"));
			
		this.jMenuItemDetalleAbrirOrderByProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProcesoPreciosFactor"));
			
		this.jMenuItemDetalleMostarOcultarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProcesoPreciosFactor"));		
		
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProcesoPreciosFactor"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProcesoPreciosFactor"));
			
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProcesoPreciosFactor"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProcesoPreciosFactor"));

		this.jCheckBoxSeleccionadosProcesoPreciosFactor.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProcesoPreciosFactor"));
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProcesoPreciosFactor"));
		}
		
		
		this.jComboBoxTiposRelacionesProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"TiposRelacionesProcesoPreciosFactor"));
			
		this.jComboBoxTiposAccionesProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"TiposAccionesProcesoPreciosFactor"));
					
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProcesoPreciosFactor"));
			
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProcesoPreciosFactor"));		
		
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonidProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombreProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigo_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombre_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonprecioProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonfactorProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"factorProcesoPreciosFactorBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPreciosFactorProcesoPreciosFactor"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProcesoPreciosFactor!=null) {
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosFactor"));
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosFactor"));
				this.jInternalFrameReporteDinamicoProcesoPreciosFactor.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosFactor"));
			}
			
			//this.jButtonCerrarReporteDinamicoProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProcesoPreciosFactor"));				
			//this.jButtonGenerarReporteDinamicoProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProcesoPreciosFactor"));
			//this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProcesoPreciosFactor"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProcesoPreciosFactor!=null) {
				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProcesoPreciosFactor"));
				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProcesoPreciosFactor"));
				this.jInternalFrameImportacionProcesoPreciosFactor.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProcesoPreciosFactor"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"AbrirOrderByProcesoPreciosFactor"));
			
			this.jButtonAbrirOrderByToolBarProcesoPreciosFactor.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProcesoPreciosFactor"));			
			
			if(this.jInternalFrameOrderByProcesoPreciosFactor!=null) {
				this.jInternalFrameOrderByProcesoPreciosFactor.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProcesoPreciosFactor"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProcesoPreciosFactor.jTabbedPaneRelacionesProcesoPreciosFactor.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProcesoPreciosFactor"));
		
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
            		closingInternalFrameProcesoPreciosFactor();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProcesoPreciosFactor = (JInternalFrameBase)event.getSource();
	            	
	            ProcesoPreciosFactorBeanSwingJInternalFrame jInternalFrameParent=(ProcesoPreciosFactorBeanSwingJInternalFrame)jInternalFrameDetalleFormProcesoPreciosFactor.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProcesoPreciosFactorActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProcesoPreciosFactor.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProcesoPreciosFactorListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProcesoPreciosFactor.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProcesoPreciosFactor.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProcesoPreciosFactor";
		inputMap = this.jButtonNuevoProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProcesoPreciosFactor";
		inputMap = this.jButtonNuevoRelacionesProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProcesoPreciosFactorActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProcesoPreciosFactor";
		inputMap = this.jButtonModificarProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProcesoPreciosFactor";
		inputMap = this.jButtonActualizarProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProcesoPreciosFactor";
		inputMap = this.jButtonEliminarProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProcesoPreciosFactor";
		inputMap = this.jButtonCancelarProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProcesoPreciosFactor";
		inputMap = this.jButtonCerrarProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProcesoPreciosFactor";
		inputMap = this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonGuardarCambiosProcesoPreciosFactor.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProcesoPreciosFactorActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProcesoPreciosFactor.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProcesoPreciosFactorItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProcesoPreciosFactor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProcesoPreciosFactorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProcesoPreciosFactor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProcesoPreciosFactorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProcesoPreciosFactor.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProcesoPreciosFactorActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonidProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"idProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_bodegaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_productoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_empresaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_sucursalProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_lineaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_grupoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_categoriaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaProcesoPreciosFactorBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonid_linea_marcaProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombreProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombreProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtoncodigo_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonnombre_productoProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonprecioProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"precioProcesoPreciosFactorBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jButtonfactorProcesoPreciosFactorBusqueda.addActionListener(new ButtonActionListener(this,"factorProcesoPreciosFactorBusqueda"));
		
		
		this.jButtonBusquedaProcesoPreciosFactorProcesoPreciosFactor.addActionListener(new ButtonActionListener(this,"BusquedaProcesoPreciosFactorProcesoPreciosFactor"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProcesoPreciosFactor.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProcesoPreciosFactorActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProcesoPreciosFactorActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProcesoPreciosFactor.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProcesoPreciosFactor(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
					procesopreciosfactorAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactors) {
					procesopreciosfactorAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProcesoPreciosFactorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
						procesopreciosfactorAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactors) {
						procesopreciosfactorAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactors) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPreciosFactor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPreciosFactor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProcesoPreciosFactorItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProcesoPreciosFactor.getSelectedRows();
			
			ProcesoPreciosFactor procesopreciosfactorLocal=new ProcesoPreciosFactor();
			
			//this.seleccionarTodosProcesoPreciosFactor(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					procesopreciosfactorLocal =(ProcesoPreciosFactor) this.procesopreciosfactorLogic.getProcesoPreciosFactors().toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					procesopreciosfactorLocal =(ProcesoPreciosFactor) this.procesopreciosfactors.toArray()[this.jTableDatosProcesoPreciosFactor.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				procesopreciosfactorLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
						procesopreciosfactorAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactors) {
						procesopreciosfactorAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProcesoPreciosFactor.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProcesoPreciosFactor.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProcesoPreciosFactor,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProcesoPreciosFactorItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProcesoPreciosFactorParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProcesoPreciosFactorActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProcesoPreciosFactor.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactorLogic.getProcesoPreciosFactors()) {
				
						if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopreciosfactorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesopreciosfactorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesopreciosfactorAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesopreciosfactorAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesopreciosfactorAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR)) {
							existe=true;
							procesopreciosfactorAux.setfactor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactors) {
					
						if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							procesopreciosfactorAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							procesopreciosfactorAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							procesopreciosfactorAux.setcodigo_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							procesopreciosfactorAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							procesopreciosfactorAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR)) {
							existe=true;
							procesopreciosfactorAux.setfactor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProcesoPreciosFactorActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProcesoPreciosFactor=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProcesoPreciosFactor.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProcesoPreciosFactor) {				
					conSplash=true;//false;										
					
					//this.startProcessProcesoPreciosFactor(conSplash);
				
					this.generarReporteProcesoPreciosFactorsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProcesoPreciosFactorsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPreciosFactorsSeleccionados(false);
				//this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProcesoPreciosFactorsSeleccionados(true);
				//this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPreciosFactor();
				
				this.exportarProcesoPreciosFactorsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProcesoPreciosFactors();
				//this.importarProcesoPreciosFactors();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProcesoPreciosFactor();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProcesoPreciosFactorsSeleccionados();
				//this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Proceso Precios Factor", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProcesoPreciosFactor();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProcesoPreciosFactor)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProcesoPreciosFactor(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
				}	
			} 			
			else if(ProcesoPreciosFactorBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProcesoPreciosFactor) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProcesoPreciosFactor(conSplash);
					
						//this.actualizarParametrosGeneralProcesoPreciosFactor();
						
						this.generarReporteProcesoAccionProcesoPreciosFactorsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Proceso Precios FactorES SELECCIONADOS?", "MANTENIMIENTO DE Proceso Precios Factor", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProcesoPreciosFactor();
				
						this.actualizarParametrosGeneralProcesoPreciosFactor();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.procesopreciosfactorReturnGeneral=procesopreciosfactorLogic.procesarAccionProcesoPreciosFactorsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.procesopreciosfactorLogic.getProcesoPreciosFactors(),this.procesopreciosfactorParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProcesoPreciosFactorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProcesoPreciosFactor();
					
					ProcesoPreciosFactorBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProcesoPreciosFactorReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProcesoPreciosFactor.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxTiposAccionesFormularioProcesoPreciosFactor.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProcesoPreciosFactor(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProcesoPreciosFactorActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProcesoPreciosFactor();
			
			if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
			ProcesoPreciosFactor procesopreciosfactor=new ProcesoPreciosFactor();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProcesoPreciosFactor(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProcesoPreciosFactor.getSelectedItem();
			
			
			
			
			procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
			//this.sTipoAccion;
			
			if(procesopreciosfactorsSeleccionados.size()==1) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
					procesopreciosfactor=procesopreciosfactorAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProcesoPreciosFactor();
			
      		//this.finishProcessProcesoPreciosFactor(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProcesoPreciosFactorReturnGeneral() throws Exception {
		if(this.procesopreciosfactorReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.procesopreciosfactorReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.procesopreciosfactorReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.procesopreciosfactorReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.procesopreciosfactorReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.procesopreciosfactorReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
		}
		
		if(this.procesopreciosfactorReturnGeneral.getConRetornoLista() || this.procesopreciosfactorReturnGeneral.getConRetornoObjeto()) {
			if(this.procesopreciosfactorReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.procesopreciosfactorLogic.setProcesoPreciosFactors(this.procesopreciosfactorReturnGeneral.getProcesoPreciosFactors());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingProcesoPreciosFactor(false);
		}
	}
	
	public void actualizarParametrosGeneralProcesoPreciosFactor() throws Exception {
		
		
	}
	
	public ArrayList<ProcesoPreciosFactor> getProcesoPreciosFactorsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProcesoPreciosFactor) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorLogic.getProcesoPreciosFactors()) {
					if(procesopreciosfactorAux.getIsSelected()) {
						procesopreciosfactorsSeleccionados.add(procesopreciosfactorAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ProcesoPreciosFactor procesopreciosfactorAux:this.procesopreciosfactors) {
					if(procesopreciosfactorAux.getIsSelected()) {
						procesopreciosfactorsSeleccionados.add(procesopreciosfactorAux);				
					}
				}
			}
			
			if(procesopreciosfactorsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						procesopreciosfactorsSeleccionados.addAll(this.procesopreciosfactorLogic.getProcesoPreciosFactors());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						procesopreciosfactorsSeleccionados.addAll(this.procesopreciosfactors);				
					}
				}
			}
		} else {
			procesopreciosfactorsSeleccionados.add(this.procesopreciosfactor);
		}
		
		return procesopreciosfactorsSeleccionados;
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
	
	public void generarReporteProcesoPreciosFactorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProcesoPreciosFactorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProcesoPreciosFactorsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPreciosFactorsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProcesoPreciosFactorsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Proceso Precios Factor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados);
		
	}	
	
	public void generarReporteNormalProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProcesoPreciosFactorsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProcesoPreciosFactor();
		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProcesoPreciosFactor();
		
		
		//this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados ,procesopreciosfactorImplementable,procesopreciosfactorImplementableHome);
	}
	
	public void mostrarImportacionProcesoPreciosFactors() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProcesoPreciosFactor();
		
		this.abrirFrameImportacionProcesoPreciosFactor();		
		
			
		//this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados ,procesopreciosfactorImplementable,procesopreciosfactorImplementableHome);
	}
	
	public void importarProcesoPreciosFactors() throws Exception {		
	
	}
	
	public void exportarProcesoPreciosFactorsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProcesoPreciosFactorsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProcesoPreciosFactorsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProcesoPreciosFactorsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Proceso Precios Factor",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProcesoPreciosFactor(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProcesoPreciosFactor(procesopreciosfactorAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//procesopreciosfactorAux.setsDetalleGeneralEntityReporte(procesopreciosfactorAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProcesoPreciosFactor(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=procesopreciosfactor.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getcodigo_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getprecio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=procesopreciosfactor.getfactor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ProcesoPreciosFactors");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProcesoPreciosFactor(row);				
				iRow++;
			}				
			
			for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProcesoPreciosFactor(procesopreciosfactorAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProcesoPreciosFactorsSeleccionados() throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();		
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"procesopreciosfactor.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("procesopreciosfactors");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("procesopreciosfactor");
			//elementRoot.appendChild(element);
		
			for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
				element = document.createElement("procesopreciosfactor");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProcesoPreciosFactor(procesopreciosfactorAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Proceso Precios Factor",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProcesoPreciosFactor(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_PRECIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProcesoPreciosFactorConstantesFunciones.LABEL_FACTOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getcodigo_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getprecio());
		cell = row.createCell(iColumn++);cell.setCellValue(procesopreciosfactor.getfactor());				
	}
	
	public void setFilaDatosExportarXmlProcesoPreciosFactor(ProcesoPreciosFactor procesopreciosfactor,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProcesoPreciosFactorConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(procesopreciosfactor.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProcesoPreciosFactorConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(procesopreciosfactor.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementbodega_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementempresa_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ProcesoPreciosFactorConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(procesopreciosfactor.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementcodigo = document.createElement(ProcesoPreciosFactorConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(procesopreciosfactor.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProcesoPreciosFactorConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(procesopreciosfactor.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcodigo_producto = document.createElement(ProcesoPreciosFactorConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(procesopreciosfactor.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);

		Element elementnombre_producto = document.createElement(ProcesoPreciosFactorConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(procesopreciosfactor.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementprecio = document.createElement(ProcesoPreciosFactorConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(procesopreciosfactor.getprecio().toString().trim()));
		element.appendChild(elementprecio);

		Element elementfactor = document.createElement(ProcesoPreciosFactorConstantesFunciones.FACTOR);
		elementfactor.appendChild(document.createTextNode(procesopreciosfactor.getfactor().toString().trim()));
		element.appendChild(elementfactor);
	}
	
	public void generarReporteGroupGenericoProcesoPreciosFactorsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados=new ArrayList<ProcesoPreciosFactor>();
		
		procesopreciosfactorsSeleccionados=this.getProcesoPreciosFactorsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProcesoPreciosFactor(procesopreciosfactorsSeleccionados);
		
		this.generarReporteProcesoPreciosFactors("Todos",procesopreciosfactorsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProcesoPreciosFactor(ArrayList<ProcesoPreciosFactor> procesopreciosfactorsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ProcesoPreciosFactor procesopreciosfactorAux:procesopreciosfactorsSeleccionados) {
				procesopreciosfactorAux.setsDetalleGeneralEntityReporte(procesopreciosfactorAux.toString());
			
				if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getcodigo_producto());
				}
				 else if(sTipoSeleccionar.equals(ProcesoPreciosFactorConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					procesopreciosfactorAux.setsDescripcionGeneralEntityReporte1(procesopreciosfactorAux.getnombre_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProcesoPreciosFactorConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProcesoPreciosFactor(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProcesoPreciosFactor=true;
				this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=true;
				this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=true;
			}
			
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=true;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=true;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
			this.isVisibilidadCeldaModificarProcesoPreciosFactor=true;
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaCancelarProcesoPreciosFactor=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				} else {
					this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProcesoPreciosFactorJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=true;
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=true;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=true;
		} else {
			this.actualizarEstadoPanelsProcesoPreciosFactor(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProcesoPreciosFactor=false;
			//this.isVisibilidadCeldaVerFormProcesoPreciosFactor=false;
			this.isVisibilidadCeldaDuplicarProcesoPreciosFactor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!procesopreciosfactorSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
		} else {
			this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
			this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			if(!procesopreciosfactorSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;												
			}
			
			this.jButtonCerrarProcesoPreciosFactor.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
		}
		
		if(!this.permiteMantenimiento(this.procesopreciosfactor)) {
			this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
			this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoProcesoPreciosFactor=false;
		this.isVisibilidadCeldaNuevoRelacionesProcesoPreciosFactor=false;
		this.isVisibilidadCeldaGuardarCambiosProcesoPreciosFactor=false;
		//this.isVisibilidadCeldaModificarProcesoPreciosFactor=true;
		this.isVisibilidadCeldaActualizarProcesoPreciosFactor=false;
		this.isVisibilidadCeldaEliminarProcesoPreciosFactor=false;
		//this.isVisibilidadCeldaCancelarProcesoPreciosFactor=true;			
		this.isVisibilidadCeldaGuardarProcesoPreciosFactor=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProcesoPreciosFactor() {
	}
	
	public void actualizarEstadoPanelsProcesoPreciosFactor(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosEdicionProcesoPreciosFactor.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProcesoPreciosFactor!=null) {
				this.jScrollPanelDatosProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelPaginacionProcesoPreciosFactor!=null) {
				this.jPanelPaginacionProcesoPreciosFactor.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
					this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.procesopreciosfactorSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProcesoPreciosFactor!=null) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProcesoPreciosFactor!=null) {
				this.jPanelParametrosReportesProcesoPreciosFactor.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaBodega;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaProducto;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaLinea;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaProcesoPreciosFactor=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaProcesoPreciosFactor) {this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);}
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
			
			this.inicializarActualizarBindingTablaProcesoPreciosFactor(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProcesoPreciosFactor() {
		this.updateBorderResaltarBusquedasFormularioProcesoPreciosFactor();
		this.updateVisibilidadBusquedasFormularioProcesoPreciosFactor();
		this.updateHabilitarBusquedasFormularioProcesoPreciosFactor();
	}
	
	public void updateBorderResaltarBusquedasFormularioProcesoPreciosFactor() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponents().length>0) {
	

		if(this.procesopreciosfactorConstantesFunciones.resaltarBusquedaProcesoPreciosFactorProcesoPreciosFactor!=null) {
			index= this.jTabbedPaneBusquedasProcesoPreciosFactor.indexOfComponent(this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponent(index);
				jPanel.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProcesoPreciosFactor() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPreciosFactor.indexOfComponent(this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			if(!this.procesopreciosfactorConstantesFunciones.mostrarBusquedaProcesoPreciosFactorProcesoPreciosFactor && index>-1) {
				this.jTabbedPaneBusquedasProcesoPreciosFactor.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProcesoPreciosFactor() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProcesoPreciosFactor.indexOfComponent(this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.procesopreciosfactorConstantesFunciones.activarBusquedaProcesoPreciosFactorProcesoPreciosFactor);
				this.jTabbedPaneBusquedasProcesoPreciosFactor.setEnabledAt(index,this.procesopreciosfactorConstantesFunciones.activarBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProcesoPreciosFactor(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaProcesoPreciosFactor")) {
			index= this.jTabbedPaneBusquedasProcesoPreciosFactor.indexOfComponent(this.jPanelBusquedaProcesoPreciosFactorProcesoPreciosFactor);

			this.jTabbedPaneBusquedasProcesoPreciosFactor.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProcesoPreciosFactor.getComponent(index);

			this.procesopreciosfactorConstantesFunciones.setResaltarBusquedaProcesoPreciosFactorProcesoPreciosFactor(resaltar);

			jPanel.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarBusquedaProcesoPreciosFactorProcesoPreciosFactor);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProcesoPreciosFactor.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProcesoPreciosFactor() throws Exception {

		if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProcesoPreciosFactor();
		this.updateVisibilidadResaltarControlesFormularioProcesoPreciosFactor();
		this.updateHabilitarResaltarControlesFormularioProcesoPreciosFactor();
		
	}
	
	public void updateBorderResaltarControlesFormularioProcesoPreciosFactor() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.procesopreciosfactorConstantesFunciones.resaltaridProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltaridProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_bodegaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_bodegaProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_productoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_productoProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_empresaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_empresaProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_sucursalProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_sucursalProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_lineaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_lineaProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_grupoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_grupoProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_categoriaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_categoriaProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_marcaProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarid_linea_marcaProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarcodigoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarcodigoProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarnombreProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarnombreProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarcodigo_productoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarcodigo_productoProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarnombre_productoProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarnombre_productoProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarprecioProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarprecioProcesoPreciosFactor);}
		if(this.procesopreciosfactorConstantesFunciones.resaltarfactorProcesoPreciosFactor!=null && this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setBorder(this.procesopreciosfactorConstantesFunciones.resaltarfactorProcesoPreciosFactor);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProcesoPreciosFactor() throws Exception {		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
	
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostraridProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelidProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostraridProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_bodegaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_bodegaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_bodegaProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_productoProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_empresaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_empresaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_empresaProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_sucursalProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_sucursalProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_sucursalProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_lineaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_lineaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_lineaProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_grupoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_linea_grupoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_grupoProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_categoriaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_linea_categoriaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_categoriaProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_marcaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelid_linea_marcaProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarid_linea_marcaProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarcodigoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelcodigoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarcodigoProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarnombreProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelnombreProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarnombreProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarcodigo_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelcodigo_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarcodigo_productoProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarnombre_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelnombre_productoProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarnombre_productoProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarprecioProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelprecioProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarprecioProcesoPreciosFactor);
		//this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarfactorProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jPanelfactorProcesoPreciosFactor.setVisible(this.procesopreciosfactorConstantesFunciones.mostrarfactorProcesoPreciosFactor);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProcesoPreciosFactor() throws Exception {
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProcesoPreciosFactor!=null) {
	
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jLabelidProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activaridProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_bodegaProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_bodegaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_productoProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_empresaProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_empresaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_sucursalProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_sucursalProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_lineaProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_lineaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_grupoProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_linea_grupoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_categoriaProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_linea_categoriaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jComboBoxid_linea_marcaProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarid_linea_marcaProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreacodigoProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarcodigoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombreProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarnombreProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldcodigo_productoProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarcodigo_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextAreanombre_productoProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarnombre_productoProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldprecioProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarprecioProcesoPreciosFactor);
		this.jInternalFrameDetalleFormProcesoPreciosFactor.jTextFieldfactorProcesoPreciosFactor.setEnabled(this.procesopreciosfactorConstantesFunciones.activarfactorProcesoPreciosFactor);
		}
	}
	
		
}