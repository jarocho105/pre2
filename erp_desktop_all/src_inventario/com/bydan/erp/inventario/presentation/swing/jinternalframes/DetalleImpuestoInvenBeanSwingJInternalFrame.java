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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.DetalleImpuestoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.DetalleImpuestoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.DetalleImpuestoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.DetalleImpuestoInvenBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class DetalleImpuestoInvenBeanSwingJInternalFrame extends DetalleImpuestoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleImpuestoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleImpuestoInven> detalleimpuestoinvenValidator = new ClassValidator<DetalleImpuestoInven>(DetalleImpuestoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleImpuestoInven detalleimpuestoinven;	
	public DetalleImpuestoInven detalleimpuestoinvenAux;
	public DetalleImpuestoInven detalleimpuestoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleImpuestoInven detalleimpuestoinvenTotales;
	public Long idDetalleImpuestoInvenActual;
	public Long iIdNuevoDetalleImpuestoInven=0L;
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

	public String sFinalQueryComboImpuestoInven="";

	public List<ImpuestoInven> impuestoinvensForeignKey;

	public List<ImpuestoInven> getimpuestoinvensForeignKey() {
		return impuestoinvensForeignKey;
	}

	public void setimpuestoinvensForeignKey(List<ImpuestoInven> impuestoinvensForeignKey) {
		this.impuestoinvensForeignKey = impuestoinvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public ImpuestoInven impuestoinvenForeignKey;

	public ImpuestoInven getimpuestoinvenForeignKey() {
		return impuestoinvenForeignKey;
	}

	public void setimpuestoinvenForeignKey(ImpuestoInven impuestoinvenForeignKey) {
		this.impuestoinvenForeignKey = impuestoinvenForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idProductoActual=0L;

	public Long getidProductoActual() {
		return idProductoActual;
	}

	public void setidProductoActual(Long idProductoActual) {
		this.idProductoActual= idProductoActual;
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
	
	public Boolean isPermisoTodoDetalleImpuestoInven;
	public Boolean isPermisoNuevoDetalleImpuestoInven;
	public Boolean isPermisoActualizarDetalleImpuestoInven;
	public Boolean isPermisoActualizarOriginalDetalleImpuestoInven;
	public Boolean isPermisoEliminarDetalleImpuestoInven;
	public Boolean isPermisoGuardarCambiosDetalleImpuestoInven;
	public Boolean isPermisoConsultaDetalleImpuestoInven;
	public Boolean isPermisoBusquedaDetalleImpuestoInven;
	public Boolean isPermisoReporteDetalleImpuestoInven;
	public Boolean isPermisoPaginacionMedioDetalleImpuestoInven;
	public Boolean isPermisoPaginacionAltoDetalleImpuestoInven;
	public Boolean isPermisoPaginacionTodoDetalleImpuestoInven;
	public Boolean isPermisoCopiarDetalleImpuestoInven;
	public Boolean isPermisoVerFormDetalleImpuestoInven;
	public Boolean isPermisoDuplicarDetalleImpuestoInven;
	public Boolean isPermisoOrdenDetalleImpuestoInven;
	
	
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
	
	public DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenReturnGeneral;
	public DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleImpuestoInven=false;
	public Boolean esParaAccionDesdeFormularioDetalleImpuestoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleImpuestoInvenSessionBeanAdditional detalleimpuestoinvenSessionBeanAdditional=null;
	
	public DetalleImpuestoInvenSessionBeanAdditional getDetalleImpuestoInvenSessionBeanAdditional() {
		return this.detalleimpuestoinvenSessionBeanAdditional;
	}
	
	public void setDetalleImpuestoInvenSessionBeanAdditional(DetalleImpuestoInvenSessionBeanAdditional detalleimpuestoinvenSessionBeanAdditional) {
		try {
			this.detalleimpuestoinvenSessionBeanAdditional=detalleimpuestoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleImpuestoInvenBeanSwingJInternalFrameAdditional detalleimpuestoinvenBeanSwingJInternalFrameAdditional=null;
	//public class DetalleImpuestoInvenBeanSwingJInternalFrame
	
	public DetalleImpuestoInvenBeanSwingJInternalFrameAdditional getDetalleImpuestoInvenBeanSwingJInternalFrameAdditional() {
		return this.detalleimpuestoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleImpuestoInvenBeanSwingJInternalFrameAdditional(DetalleImpuestoInvenBeanSwingJInternalFrameAdditional detalleimpuestoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleimpuestoinvenBeanSwingJInternalFrameAdditional=detalleimpuestoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleImpuestoInvenLogic detalleimpuestoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleImpuestoInven detalleimpuestoinvenBean;
	public DetalleImpuestoInvenConstantesFunciones detalleimpuestoinvenConstantesFunciones;
	//public DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public ProductoLogic productoLogic;
	public ImpuestoInvenLogic impuestoinvenLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleImpuestoInven> detalleimpuestoinvens;	
	//public List<DetalleImpuestoInven> detalleimpuestoinvensEliminados;
	//public List<DetalleImpuestoInven> detalleimpuestoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleImpuestoInven=true;
	public Boolean isVisibilidadCeldaCopiarDetalleImpuestoInven=true;
	public Boolean isVisibilidadCeldaVerFormDetalleImpuestoInven=true;
	public Boolean isVisibilidadCeldaOrdenDetalleImpuestoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaModificarDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaCancelarDetalleImpuestoInven=false;
	public Boolean isVisibilidadCeldaGuardarDetalleImpuestoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdImpuestoInven=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoDetalleImpuestoInven() {
		return this.iIdNuevoDetalleImpuestoInven;
	}

	public void setiIdNuevoDetalleImpuestoInven(Long iIdNuevoDetalleImpuestoInven) {
		this.iIdNuevoDetalleImpuestoInven = iIdNuevoDetalleImpuestoInven;
	}
	
	public Long getidDetalleImpuestoInvenActual() {
		return this.idDetalleImpuestoInvenActual;
	}

	public void setidDetalleImpuestoInvenActual(Long idDetalleImpuestoInvenActual) {
		this.idDetalleImpuestoInvenActual = idDetalleImpuestoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleImpuestoInven getdetalleimpuestoinven() {
		return this.detalleimpuestoinven;
	}

	public void setdetalleimpuestoinven(DetalleImpuestoInven detalleimpuestoinven) {
		this.detalleimpuestoinven = detalleimpuestoinven;
	}
	
	public DetalleImpuestoInven getdetalleimpuestoinvenAux() {
		return this.detalleimpuestoinvenAux;
	}

	public void setdetalleimpuestoinvenAux(DetalleImpuestoInven detalleimpuestoinvenAux) {
		this.detalleimpuestoinvenAux = detalleimpuestoinvenAux;
	}				
	
	public DetalleImpuestoInven getdetalleimpuestoinvenAnterior() {
		return this.detalleimpuestoinvenAnterior;
	}

	public void setdetalleimpuestoinvenAnterior(DetalleImpuestoInven detalleimpuestoinvenAnterior) {
		this.detalleimpuestoinvenAnterior = detalleimpuestoinvenAnterior;
	}	
	
	public DetalleImpuestoInven getdetalleimpuestoinvenTotales() {
		return this.detalleimpuestoinvenTotales;
	}

	public void setdetalleimpuestoinvenTotales(DetalleImpuestoInven detalleimpuestoinvenTotales) {
		this.detalleimpuestoinvenTotales = detalleimpuestoinvenTotales;
	}	
	
	public DetalleImpuestoInven getdetalleimpuestoinvenBean() {
		return this.detalleimpuestoinvenBean;
	}

	public void setdetalleimpuestoinvenBean(DetalleImpuestoInven detalleimpuestoinvenBean) {
		this.detalleimpuestoinvenBean = detalleimpuestoinvenBean;
	}	
	
	public DetalleImpuestoInvenParameterReturnGeneral getdetalleimpuestoinvenReturnGeneral() {
		return this.detalleimpuestoinvenReturnGeneral;
	}

	public void setdetalleimpuestoinvenReturnGeneral(DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenReturnGeneral) {
		this.detalleimpuestoinvenReturnGeneral = detalleimpuestoinvenReturnGeneral;
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

	public Long id_impuesto_invenFK_IdImpuestoInven=-1L;

	public Long getid_impuesto_invenFK_IdImpuestoInven() {
		return this.id_impuesto_invenFK_IdImpuestoInven;
	}

	public void setid_impuesto_invenFK_IdImpuestoInven(Long id_impuesto_invenFK_IdImpuestoInven) {
		this.id_impuesto_invenFK_IdImpuestoInven = id_impuesto_invenFK_IdImpuestoInven;
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
	
	
	public DetalleImpuestoInvenLogic getDetalleImpuestoInvenLogic()	{		
		return detalleimpuestoinvenLogic;
	}

	public void setDetalleImpuestoInvenLogic(DetalleImpuestoInvenLogic detalleimpuestoinvenLogic) {
		this.detalleimpuestoinvenLogic = detalleimpuestoinvenLogic;
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
	
	public Boolean getIsEsNuevoDetalleImpuestoInven() {
		return isEsNuevoDetalleImpuestoInven;
	}

	public void setIsEsNuevoDetalleImpuestoInven(Boolean isEsNuevoDetalleImpuestoInven) {
		this.isEsNuevoDetalleImpuestoInven = isEsNuevoDetalleImpuestoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleImpuestoInven() {
		return esParaAccionDesdeFormularioDetalleImpuestoInven;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleImpuestoInven(Boolean esParaAccionDesdeFormularioDetalleImpuestoInven) {
		this.esParaAccionDesdeFormularioDetalleImpuestoInven = esParaAccionDesdeFormularioDetalleImpuestoInven;
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

			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleimpuestoinvenSessionBean.getlidEmpresaActual());
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

			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleimpuestoinvenSessionBean.getlidSucursalActual());
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

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

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
					bodegaLogic.getEntityWithConnection(detalleimpuestoinvenSessionBean.getlidBodegaActual());
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

			//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//productoLogic.getProductoDataAccess().setIsForForeingKeyData(true);

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
					productoLogic.getEntityWithConnection(detalleimpuestoinvenSessionBean.getlidProductoActual());
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

	public void cargarCombosImpuestoInvensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ImpuestoInvenLogic impuestoinvenLogic=new ImpuestoInvenLogic();

			//impuestoinvenLogic.getImpuestoInvenDataAccess().setIsForForeingKeyData(true);

			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//impuestoinvenLogic.getImpuestoInvenDataAccess().setIsForForeingKeyData(true);

					impuestoinvenLogic.getTodosImpuestoInvensWithConnection(sFinalQuery,new Pagination());

					this.impuestoinvensForeignKey=impuestoinvenLogic.getImpuestoInvens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaImpuestoInven(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					impuestoinvenLogic.getEntityWithConnection(detalleimpuestoinvenSessionBean.getlidImpuestoInvenActual());
					this.impuestoinvensForeignKey.add(impuestoinvenLogic.getImpuestoInven());
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

					if(this.detalleimpuestoinven!=null) {
						this.detalleimpuestoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleImpuestoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleImpuestoInvenGenerico)throws Exception
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
				jComboBoxid_empresaDetalleImpuestoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleImpuestoInvenGenerico!=null && jComboBoxid_empresaDetalleImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleImpuestoInvenGenerico.setSelectedIndex(0);
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

					if(this.detalleimpuestoinven!=null) {
						this.detalleimpuestoinven.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleImpuestoInven.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleImpuestoInvenGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleImpuestoInvenGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleImpuestoInvenGenerico!=null && jComboBoxid_sucursalDetalleImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleImpuestoInvenGenerico.setSelectedIndex(0);
				}
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

					if(this.detalleimpuestoinven!=null) {
						this.detalleimpuestoinven.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaDetalleImpuestoInven.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven!=null) {
						jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven!=null) {
							//jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaDetalleImpuestoInvenGenerico)throws Exception
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
				jComboBoxid_bodegaDetalleImpuestoInvenGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaDetalleImpuestoInvenGenerico!=null && jComboBoxid_bodegaDetalleImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_bodegaDetalleImpuestoInvenGenerico.setSelectedIndex(0);
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

					if(this.detalleimpuestoinven!=null) {
						this.detalleimpuestoinven.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoDetalleImpuestoInven.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoFK_IdProductoDetalleImpuestoInven!=null) {
						jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoFK_IdProductoDetalleImpuestoInven!=null) {
							//jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setSelectedItem(productoTemp);
							if(jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.getItemCount()>0) {
								jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoDetalleImpuestoInvenGenerico)throws Exception
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
				jComboBoxid_productoDetalleImpuestoInvenGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoDetalleImpuestoInvenGenerico!=null && jComboBoxid_productoDetalleImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_productoDetalleImpuestoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualImpuestoInvenForeignKey(Long idImpuestoInvenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(impuestoinvenTemp!=null) {

					if(this.detalleimpuestoinven!=null) {
						this.detalleimpuestoinven.setImpuestoInven(impuestoinvenTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedItem(impuestoinvenTemp);
					}
				} else {
					//jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedItem(impuestoinvenTemp);
					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdImpuestoInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(impuestoinvenTemp!=null && jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven!=null) {
						jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setSelectedItem(impuestoinvenTemp);
					} else {
						if(jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven!=null) {
							//jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setSelectedItem(impuestoinvenTemp);
							if(jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.getItemCount()>0) {
								jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setSelectedIndex(0);
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

	public String getActualImpuestoInvenForeignKeyDescripcion(Long idImpuestoInvenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}


			sDescripcion=ImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualImpuestoInvenForeignKeyGenerico(Long idImpuestoInvenSeleccionado,JComboBox jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenTemp=null;

			for(ImpuestoInven impuestoinvenAux:impuestoinvensForeignKey) {
				if(impuestoinvenAux.getId()!=null && impuestoinvenAux.getId().equals(idImpuestoInvenSeleccionado)) {
					impuestoinvenTemp=impuestoinvenAux;
					break;
				}
			}

			if(impuestoinvenTemp!=null) {
				jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico.setSelectedItem(impuestoinvenTemp);
			} else {
				if(jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico!=null && jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico.getItemCount()>0) {
					jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleImpuestoInven detalleimpuestoinven,JComboBox jComboBoxid_empresaDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleImpuestoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleImpuestoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleimpuestoinven.setid_empresa(empresaAux.getId());
				detalleimpuestoinven.setempresa_descripcion(DetalleImpuestoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleimpuestoinven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleImpuestoInven detalleimpuestoinven,JComboBox jComboBoxid_sucursalDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleImpuestoInvenGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleImpuestoInvenGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleimpuestoinven.setid_sucursal(sucursalAux.getId());
				detalleimpuestoinven.setsucursal_descripcion(DetalleImpuestoInvenConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleimpuestoinven.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(DetalleImpuestoInven detalleimpuestoinven,JComboBox jComboBoxid_bodegaDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaDetalleImpuestoInvenGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaDetalleImpuestoInvenGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				detalleimpuestoinven.setid_bodega(bodegaAux.getId());
				detalleimpuestoinven.setbodega_descripcion(DetalleImpuestoInvenConstantesFunciones.getBodegaDescripcion(bodegaAux));
				detalleimpuestoinven.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(DetalleImpuestoInven detalleimpuestoinven,JComboBox jComboBoxid_productoDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoDetalleImpuestoInvenGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoDetalleImpuestoInvenGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				detalleimpuestoinven.setid_producto(productoAux.getId());
				detalleimpuestoinven.setproducto_descripcion(DetalleImpuestoInvenConstantesFunciones.getProductoDescripcion(productoAux));
				detalleimpuestoinven.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarImpuestoInvenForeignKey(DetalleImpuestoInven detalleimpuestoinven,JComboBox jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico)throws Exception
	{
		try
		{
			ImpuestoInven  impuestoinvenAux=new ImpuestoInven();

			if(jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico==null) {
				impuestoinvenAux=(ImpuestoInven)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.getSelectedItem();
			} else {
				impuestoinvenAux=(ImpuestoInven)jComboBoxid_impuesto_invenDetalleImpuestoInvenGenerico.getSelectedItem();
			}

			if(impuestoinvenAux!=null && impuestoinvenAux.getId()!=null) {
				detalleimpuestoinven.setid_impuesto_inven(impuestoinvenAux.getId());
				detalleimpuestoinven.setimpuestoinven_descripcion(DetalleImpuestoInvenConstantesFunciones.getImpuestoInvenDescripcion(impuestoinvenAux));
				detalleimpuestoinven.setImpuestoInven(impuestoinvenAux);			}
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

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
					}

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
					}

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
					}

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.addItem(bodega);
							}
						}

						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
					}

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProducto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.addItem(producto);
							}
						}

						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameImpuestoInvensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingImpuestoInven=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.removeAllItems();

							for(ImpuestoInven impuestoinven:this.impuestoinvensForeignKey) {
								this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.addItem(impuestoinven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { 
					}

					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdImpuestoInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.removeAllItems();

							for(ImpuestoInven impuestoinven:this.impuestoinvensForeignKey) {
								this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.addItem(impuestoinven);
							}
						}

						if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameImpuestoInvenForeignKey(ImpuestoInven impuestoinven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedItem(impuestoinven);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setSelectedItem(impuestoinven);
						} else {
							this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleImpuestoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleImpuestoInvenConstantesFunciones.refrescarForeignKeysDescripcionesDetalleImpuestoInven(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleImpuestoInvenConstantesFunciones.refrescarForeignKeysDescripcionesDetalleImpuestoInven(this.detalleimpuestoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Producto.class));
		classes.add(new Classe(ImpuestoInven.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleimpuestoinvenLogic.setDetalleImpuestoInvens(this.detalleimpuestoinvens);
			detalleimpuestoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleImpuestoInvenParameterReturnGeneral getDetalleImpuestoInvenParameterGeneral() {
		return this.detalleimpuestoinvenParameterGeneral;
	}
	
	public void setDetalleImpuestoInvenParameterGeneral(DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenParameterGeneral) {
		this.detalleimpuestoinvenParameterGeneral = detalleimpuestoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleImpuestoInven() {
		return isPermisoTodoDetalleImpuestoInven;
	}

	public void setIsPermisoTodoDetalleImpuestoInven(Boolean isPermisoTodoDetalleImpuestoInven) {
		this.isPermisoTodoDetalleImpuestoInven = isPermisoTodoDetalleImpuestoInven;
	}

	public Boolean getIsPermisoNuevoDetalleImpuestoInven() {
		return isPermisoNuevoDetalleImpuestoInven;
	}

	public void setIsPermisoNuevoDetalleImpuestoInven(Boolean isPermisoNuevoDetalleImpuestoInven) {
		this.isPermisoNuevoDetalleImpuestoInven = isPermisoNuevoDetalleImpuestoInven;
	}

	public Boolean getIsPermisoActualizarDetalleImpuestoInven() {
		return isPermisoActualizarDetalleImpuestoInven;
	}

	public void setIsPermisoActualizarDetalleImpuestoInven(Boolean isPermisoActualizarDetalleImpuestoInven) {
		this.isPermisoActualizarDetalleImpuestoInven = isPermisoActualizarDetalleImpuestoInven;
	}

	public Boolean getIsPermisoEliminarDetalleImpuestoInven() {
		return isPermisoEliminarDetalleImpuestoInven;
	}

	public void setIsPermisoEliminarDetalleImpuestoInven(Boolean isPermisoEliminarDetalleImpuestoInven) {
		this.isPermisoEliminarDetalleImpuestoInven = isPermisoEliminarDetalleImpuestoInven;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleImpuestoInven() {
		return isPermisoGuardarCambiosDetalleImpuestoInven;
	}

	public void setIsPermisoGuardarCambiosDetalleImpuestoInven(Boolean isPermisoGuardarCambiosDetalleImpuestoInven) {
		this.isPermisoGuardarCambiosDetalleImpuestoInven = isPermisoGuardarCambiosDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoConsultaDetalleImpuestoInven() {
		return isPermisoConsultaDetalleImpuestoInven;
	}

	public void setIsPermisoConsultaDetalleImpuestoInven(Boolean isPermisoConsultaDetalleImpuestoInven) {
		this.isPermisoConsultaDetalleImpuestoInven = isPermisoConsultaDetalleImpuestoInven;
	}

	public Boolean getIsPermisoBusquedaDetalleImpuestoInven() {
		return isPermisoBusquedaDetalleImpuestoInven;
	}

	public void setIsPermisoBusquedaDetalleImpuestoInven(Boolean isPermisoBusquedaDetalleImpuestoInven) {
		this.isPermisoBusquedaDetalleImpuestoInven = isPermisoBusquedaDetalleImpuestoInven;
	}

	public Boolean getIsPermisoReporteDetalleImpuestoInven() {
		return isPermisoReporteDetalleImpuestoInven;
	}

	public void setIsPermisoReporteDetalleImpuestoInven(Boolean isPermisoReporteDetalleImpuestoInven) {
		this.isPermisoReporteDetalleImpuestoInven = isPermisoReporteDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleImpuestoInven() {
		return isPermisoPaginacionMedioDetalleImpuestoInven;
	}

	public void setIsPermisoPaginacionMedioDetalleImpuestoInven(Boolean isPermisoPaginacionMedioDetalleImpuestoInven) {
		this.isPermisoPaginacionMedioDetalleImpuestoInven = isPermisoPaginacionMedioDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleImpuestoInven() {
		return isPermisoPaginacionTodoDetalleImpuestoInven;
	}

	public void setIsPermisoPaginacionTodoDetalleImpuestoInven(Boolean isPermisoPaginacionTodoDetalleImpuestoInven) {
		this.isPermisoPaginacionTodoDetalleImpuestoInven = isPermisoPaginacionTodoDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleImpuestoInven() {
		return isPermisoPaginacionAltoDetalleImpuestoInven;
	}

	public void setIsPermisoPaginacionAltoDetalleImpuestoInven(Boolean isPermisoPaginacionAltoDetalleImpuestoInven) {
		this.isPermisoPaginacionAltoDetalleImpuestoInven = isPermisoPaginacionAltoDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoCopiarDetalleImpuestoInven() {
		return isPermisoCopiarDetalleImpuestoInven;
	}

	public void setIsPermisoCopiarDetalleImpuestoInven(Boolean isPermisoCopiarDetalleImpuestoInven) {
		this.isPermisoCopiarDetalleImpuestoInven = isPermisoCopiarDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoVerFormDetalleImpuestoInven() {
		return isPermisoVerFormDetalleImpuestoInven;
	}

	public void setIsPermisoVerFormDetalleImpuestoInven(Boolean isPermisoVerFormDetalleImpuestoInven) {
		this.isPermisoVerFormDetalleImpuestoInven = isPermisoVerFormDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoDuplicarDetalleImpuestoInven() {
		return isPermisoDuplicarDetalleImpuestoInven;
	}

	public void setIsPermisoDuplicarDetalleImpuestoInven(Boolean isPermisoDuplicarDetalleImpuestoInven) {
		this.isPermisoDuplicarDetalleImpuestoInven = isPermisoDuplicarDetalleImpuestoInven;
	}
	
	public Boolean getIsPermisoOrdenDetalleImpuestoInven() {
		return isPermisoOrdenDetalleImpuestoInven;
	}

	public void setIsPermisoOrdenDetalleImpuestoInven(Boolean isPermisoOrdenDetalleImpuestoInven) {
		this.isPermisoOrdenDetalleImpuestoInven = isPermisoOrdenDetalleImpuestoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleImpuestoInven() {
		return isVisibilidadCeldaNuevoDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaNuevoDetalleImpuestoInven(Boolean isVisibilidadCeldaNuevoDetalleImpuestoInven) {
		this.isVisibilidadCeldaNuevoDetalleImpuestoInven = isVisibilidadCeldaNuevoDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleImpuestoInven() {
		return isVisibilidadCeldaDuplicarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleImpuestoInven(Boolean isVisibilidadCeldaDuplicarDetalleImpuestoInven) {
		this.isVisibilidadCeldaDuplicarDetalleImpuestoInven = isVisibilidadCeldaDuplicarDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleImpuestoInven() {
		return isVisibilidadCeldaCopiarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaCopiarDetalleImpuestoInven(Boolean isVisibilidadCeldaCopiarDetalleImpuestoInven) {
		this.isVisibilidadCeldaCopiarDetalleImpuestoInven = isVisibilidadCeldaCopiarDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleImpuestoInven() {
		return isVisibilidadCeldaVerFormDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaVerFormDetalleImpuestoInven(Boolean isVisibilidadCeldaVerFormDetalleImpuestoInven) {
		this.isVisibilidadCeldaVerFormDetalleImpuestoInven = isVisibilidadCeldaVerFormDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleImpuestoInven() {
		return isVisibilidadCeldaOrdenDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaOrdenDetalleImpuestoInven(Boolean isVisibilidadCeldaOrdenDetalleImpuestoInven) {
		this.isVisibilidadCeldaOrdenDetalleImpuestoInven = isVisibilidadCeldaOrdenDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven() {
		return isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven(Boolean isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven = isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleImpuestoInven() {
		return isVisibilidadCeldaModificarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaModificarDetalleImpuestoInven(Boolean isVisibilidadCeldaModificarDetalleImpuestoInven) {
		this.isVisibilidadCeldaModificarDetalleImpuestoInven = isVisibilidadCeldaModificarDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleImpuestoInven() {
		return isVisibilidadCeldaActualizarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaActualizarDetalleImpuestoInven(Boolean isVisibilidadCeldaActualizarDetalleImpuestoInven) {
		this.isVisibilidadCeldaActualizarDetalleImpuestoInven = isVisibilidadCeldaActualizarDetalleImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleImpuestoInven() {
		return isVisibilidadCeldaEliminarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaEliminarDetalleImpuestoInven(Boolean isVisibilidadCeldaEliminarDetalleImpuestoInven) {
		this.isVisibilidadCeldaEliminarDetalleImpuestoInven = isVisibilidadCeldaEliminarDetalleImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleImpuestoInven() {
		return isVisibilidadCeldaCancelarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaCancelarDetalleImpuestoInven(Boolean isVisibilidadCeldaCancelarDetalleImpuestoInven) {
		this.isVisibilidadCeldaCancelarDetalleImpuestoInven = isVisibilidadCeldaCancelarDetalleImpuestoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleImpuestoInven() {
		return isVisibilidadCeldaGuardarDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaGuardarDetalleImpuestoInven(Boolean isVisibilidadCeldaGuardarDetalleImpuestoInven) {
		this.isVisibilidadCeldaGuardarDetalleImpuestoInven = isVisibilidadCeldaGuardarDetalleImpuestoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleImpuestoInven() {
		return isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleImpuestoInven(Boolean isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven) {
		this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven = isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven;
	}
		
	public DetalleImpuestoInvenSessionBean getdetalleimpuestoinvenSessionBean() {
		return this.detalleimpuestoinvenSessionBean;
	}
	
	public void setdetalleimpuestoinvenSessionBean(DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean) {
		this.detalleimpuestoinvenSessionBean=detalleimpuestoinvenSessionBean;
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

	public Boolean getisVisibilidadFK_IdImpuestoInven() {
		return this.isVisibilidadFK_IdImpuestoInven;
	}

	public void setisVisibilidadFK_IdImpuestoInven(Boolean isVisibilidadFK_IdImpuestoInven) {
		this.isVisibilidadFK_IdImpuestoInven=isVisibilidadFK_IdImpuestoInven;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleimpuestoinven,null);
				this.setActualParaGuardarSucursalForeignKey(detalleimpuestoinven,null);
				this.setActualParaGuardarBodegaForeignKey(detalleimpuestoinven,null);
				this.setActualParaGuardarProductoForeignKey(detalleimpuestoinven,null);
				this.setActualParaGuardarImpuestoInvenForeignKey(detalleimpuestoinven,null);
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
	
	public void bugActualizarReferenciaActual(DetalleImpuestoInven detalleimpuestoinven,DetalleImpuestoInven detalleimpuestoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleImpuestoInven(detalleimpuestoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleimpuestoinvenAux.setId(detalleimpuestoinven.getId());
		detalleimpuestoinvenAux.setVersionRow(detalleimpuestoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleImpuestoInven();
		
			int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleimpuestoinvenValidator.getInvalidValues(this.detalleimpuestoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleimpuestoinvenLogic.setDatosCliente(datosCliente);
			detalleimpuestoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleimpuestoinvenAux=new  DetalleImpuestoInven();
				
				detalleimpuestoinvenAux.setIsNew(true);
				detalleimpuestoinvenAux.setIsChanged(true);
				
				detalleimpuestoinvenAux.setDetalleImpuestoInvenOriginal(this.detalleimpuestoinven);
				
				detalleimpuestoinvenAux.setId(this.detalleimpuestoinven.getId());	
				detalleimpuestoinvenAux.setVersionRow(this.detalleimpuestoinven.getVersionRow());	
				detalleimpuestoinvenAux.setid_empresa(this.detalleimpuestoinven.getid_empresa());	
				detalleimpuestoinvenAux.setid_sucursal(this.detalleimpuestoinven.getid_sucursal());	
				detalleimpuestoinvenAux.setid_bodega(this.detalleimpuestoinven.getid_bodega());	
				detalleimpuestoinvenAux.setid_producto(this.detalleimpuestoinven.getid_producto());	
				detalleimpuestoinvenAux.setid_impuesto_inven(this.detalleimpuestoinven.getid_impuesto_inven());	
				detalleimpuestoinvenAux.setporcentaje(this.detalleimpuestoinven.getporcentaje());	
				detalleimpuestoinvenAux.setvalor(this.detalleimpuestoinven.getvalor());	
				detalleimpuestoinvenAux.setdescripcion(this.detalleimpuestoinven.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.saveDetalleImpuestoInvens();//WithConnection
						//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);
					
					this.refrescarForeignKeysDescripcionesDetalleImpuestoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleimpuestoinvenLogic.saveDetalleImpuestoInvenRelaciones(detalleimpuestoinvenAux);//WithConnection
								//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleimpuestoinvenAux=new  DetalleImpuestoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() && this.detalleimpuestoinven.getId()>=0)) {
						
					detalleimpuestoinvenAux.setIsNew(false);
				}
				
				detalleimpuestoinvenAux.setIsDeleted(false);
			
				detalleimpuestoinvenAux.setId(this.detalleimpuestoinven.getId());	
				detalleimpuestoinvenAux.setVersionRow(this.detalleimpuestoinven.getVersionRow());	
				detalleimpuestoinvenAux.setid_empresa(this.detalleimpuestoinven.getid_empresa());	
				detalleimpuestoinvenAux.setid_sucursal(this.detalleimpuestoinven.getid_sucursal());	
				detalleimpuestoinvenAux.setid_bodega(this.detalleimpuestoinven.getid_bodega());	
				detalleimpuestoinvenAux.setid_producto(this.detalleimpuestoinven.getid_producto());	
				detalleimpuestoinvenAux.setid_impuesto_inven(this.detalleimpuestoinven.getid_impuesto_inven());	
				detalleimpuestoinvenAux.setporcentaje(this.detalleimpuestoinven.getporcentaje());	
				detalleimpuestoinvenAux.setvalor(this.detalleimpuestoinven.getvalor());	
				detalleimpuestoinvenAux.setdescripcion(this.detalleimpuestoinven.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.saveDetalleImpuestoInvens();//WithConnection
						//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);
					
					this.refrescarForeignKeysDescripcionesDetalleImpuestoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleimpuestoinvenLogic.saveDetalleImpuestoInvenRelaciones(detalleimpuestoinvenAux);//WithConnection
								//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleimpuestoinven,detalleimpuestoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleimpuestoinvenAux=new  DetalleImpuestoInven();
				
				detalleimpuestoinvenAux.setIsNew(false);
				detalleimpuestoinvenAux.setIsChanged(false);
				
				detalleimpuestoinvenAux.setIsDeleted(true);
				
				detalleimpuestoinvenAux.setId(this.detalleimpuestoinven.getId());	
				detalleimpuestoinvenAux.setVersionRow(this.detalleimpuestoinven.getVersionRow());	
				detalleimpuestoinvenAux.setid_empresa(this.detalleimpuestoinven.getid_empresa());	
				detalleimpuestoinvenAux.setid_sucursal(this.detalleimpuestoinven.getid_sucursal());	
				detalleimpuestoinvenAux.setid_bodega(this.detalleimpuestoinven.getid_bodega());	
				detalleimpuestoinvenAux.setid_producto(this.detalleimpuestoinven.getid_producto());	
				detalleimpuestoinvenAux.setid_impuesto_inven(this.detalleimpuestoinven.getid_impuesto_inven());	
				detalleimpuestoinvenAux.setporcentaje(this.detalleimpuestoinven.getporcentaje());	
				detalleimpuestoinvenAux.setvalor(this.detalleimpuestoinven.getvalor());	
				detalleimpuestoinvenAux.setdescripcion(this.detalleimpuestoinven.getdescripcion());	
				
				if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleimpuestoinvenAux.getId()>=0) {	
						this.detalleimpuestoinvensEliminados.add(detalleimpuestoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.saveDetalleImpuestoInvens();//WithConnection
						//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleimpuestoinvenLogic.saveDetalleImpuestoInvenRelaciones(detalleimpuestoinvenAux);//WithConnection
								//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
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
							if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleimpuestoinvenAux,detalleimpuestoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(this.detalleimpuestoinvensEliminados);
					
					detalleimpuestoinvenLogic.saveDetalleImpuestoInvens();//WithConnection
					//detalleimpuestoinvenLogic.getSetVersionRowDetalleImpuestoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleImpuestoInven();
				
				this.detalleimpuestoinvensEliminados= new ArrayList<DetalleImpuestoInven>();		
			}
			
			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Impuesto Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleimpuestoinven=detalleimpuestoinvenAux;
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
      		//this.finishProcessDetalleImpuestoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleImpuestoInven detalleimpuestoinvenLocal) throws Exception {
		
		if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleImpuestoInven detalleimpuestoinvenLocal) throws Exception {	
		if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleimpuestoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleimpuestoinvenLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				detalleimpuestoinvenLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				detalleimpuestoinvenLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ImpuestoInvenDetalleFormJInternalFrame.class)) {
				ImpuestoInvenBeanSwingJInternalFrame impuestoinvenBeanSwingJInternalFrameLocal=(ImpuestoInvenBeanSwingJInternalFrame) ((ImpuestoInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				impuestoinvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoImpuestoInven(impuestoinvenBeanSwingJInternalFrameLocal.getimpuestoinven(),true);
				impuestoinvenBeanSwingJInternalFrameLocal.actualizarLista(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven,this.impuestoinvensForeignKey);

				impuestoinvenBeanSwingJInternalFrameLocal.actualizarRelaciones(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven);

				detalleimpuestoinvenLocal.setImpuestoInven(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven);

				this.addItemDefectoCombosForeignKeyImpuestoInven();
				this.cargarCombosFrameImpuestoInvensForeignKey("Formulario");
				this.setActualImpuestoInvenForeignKey(impuestoinvenBeanSwingJInternalFrameLocal.impuestoinven.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleImpuestoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleimpuestoinvenValidator.getInvalidValues(this.detalleimpuestoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleImpuestoInven detalleimpuestoinven,List<DetalleImpuestoInven> detalleimpuestoinvens) throws Exception {
		try	{		
			DetalleImpuestoInvenConstantesFunciones.actualizarLista(detalleimpuestoinven,detalleimpuestoinvens,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleImpuestoInven detalleimpuestoinven,List<DetalleImpuestoInven> detalleimpuestoinvens) throws Exception {
		try	{			
			DetalleImpuestoInvenConstantesFunciones.actualizarSelectedLista(detalleimpuestoinven,detalleimpuestoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleImpuestoInven> detalleimpuestoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleimpuestoinvensLocal=this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleimpuestoinvensLocal=this.detalleimpuestoinvens;
			}
			//ARCHITECTURE
		
			for(DetalleImpuestoInven detalleimpuestoinvenLocal:detalleimpuestoinvensLocal) {
				if(this.permiteMantenimiento(detalleimpuestoinvenLocal) && detalleimpuestoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleImpuestoInvenConstantesFunciones.getDetalleImpuestoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_empresaDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_sucursalDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_bodegaDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_productoDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.IDIMPUESTOINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_impuesto_invenDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelporcentajeDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelvalorDetalleImpuestoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleImpuestoInvenConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabeldescripcionDetalleImpuestoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_empresaDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_sucursalDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_bodegaDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_productoDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelid_impuesto_invenDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelporcentajeDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelvalorDetalleImpuestoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabeldescripcionDetalleImpuestoInven,"");
		
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
		this.iIdNuevoDetalleImpuestoInven--;	
		
		
		this.detalleimpuestoinvenAux=new DetalleImpuestoInven();
		
		this.detalleimpuestoinvenAux.setId(this.iIdNuevoDetalleImpuestoInven);
		this.detalleimpuestoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().add(this.detalleimpuestoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleimpuestoinvens.add(this.detalleimpuestoinvenAux);
		}
		//ARCHITECTURE
		
		this.detalleimpuestoinven=this.detalleimpuestoinvenAux;
		
		if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleImpuestoInven(this.detalleimpuestoinven);
		}
				
		//this.setDefaultControlesDetalleImpuestoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleImpuestoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleImpuestoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleImpuestoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinvenBean,this.detalleimpuestoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
			classes=DetalleImpuestoInvenConstantesFunciones.getClassesRelationshipsOfDetalleImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.procesarEventosDetalleImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this.detalleimpuestoinven,this.detalleimpuestoinvenParameterGeneral,this.isEsNuevoDetalleImpuestoInven,classes);//this.detalleimpuestoinvenLogic.getDetalleImpuestoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral,this.detalleimpuestoinvenBean,false);
		
		if(this.detalleimpuestoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven());
		}
		
		if(this.detalleimpuestoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven(),classes);//this.detalleimpuestoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleImpuestoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleImpuestoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.RecargarFormDetalleImpuestoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
						
			if(detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleImpuestoInven();
			}
			
			this.actualizarVisualTableDatosDetalleImpuestoInven();
			
			this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleImpuestoInven(), this.getIndiceNuevoDetalleImpuestoInven());
			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
						
			this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleImpuestoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarporcentajeDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarvalorDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activardescripcionDetalleImpuestoInven);	
		//
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarid_empresaDetalleImpuestoInven);//
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarid_sucursalDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarid_bodegaDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarid_productoDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setEnabled(isHabilitar && this.detalleimpuestoinvenConstantesFunciones.activarid_impuesto_invenDetalleImpuestoInven);
	};
	
	public void setDefaultControlesDetalleImpuestoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleImpuestoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(true);			
			this.detalleimpuestoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.setVisible(true);
			
					
		} else {
			//this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(false);			
			this.detalleimpuestoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleImpuestoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				if(detalleimpuestoinvenAux.getId().equals(this.iIdNuevoDetalleImpuestoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvens) {
				if(detalleimpuestoinvenAux.getId().equals(this.iIdNuevoDetalleImpuestoInven)) {
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
	
	public int getIndiceActualDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				if(detalleimpuestoinvenAux.getId().equals(detalleimpuestoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvens) {
				if(detalleimpuestoinvenAux.getId().equals(detalleimpuestoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				if(detalleimpuestoinvenAux.getDetalleImpuestoInvenOriginal().getId().equals(detalleimpuestoinvenOriginal.getId())) {
					existe=true;
					detalleimpuestoinvenOriginal.setId(detalleimpuestoinvenAux.getId());
					detalleimpuestoinvenOriginal.setVersionRow(detalleimpuestoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvens) {
				if(detalleimpuestoinvenAux.getDetalleImpuestoInvenOriginal().getId().equals(detalleimpuestoinvenOriginal.getId())) {
					existe=true;
					detalleimpuestoinvenOriginal.setId(detalleimpuestoinvenAux.getId());
					detalleimpuestoinvenOriginal.setVersionRow(detalleimpuestoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleImpuestoInven(Boolean esParaCancelar) throws Exception {
		detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
		detalleimpuestoinvenAux=new DetalleImpuestoInven();
		
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
					if(detalleimpuestoinvenAux.getId()<0) {
						detalleimpuestoinvensAux.add(detalleimpuestoinvenAux);
					}		
				}
				this.iIdNuevoDetalleImpuestoInven=0L;
				this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().removeAll(detalleimpuestoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvens) {
					if(detalleimpuestoinvenAux.getId()<0) {
						detalleimpuestoinvensAux.add(detalleimpuestoinvenAux);
					}		
				}
				this.iIdNuevoDetalleImpuestoInven=0L;
				this.detalleimpuestoinvens.removeAll(detalleimpuestoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleImpuestoInven 
					&& this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()>0
					) {
					detalleimpuestoinvenAux=this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().get(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size() - 1);
				
					if(detalleimpuestoinvenAux.getId()<0) {
						this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().remove(detalleimpuestoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleImpuestoInven && this.detalleimpuestoinvens.size()>0) {
					detalleimpuestoinvenAux=this.detalleimpuestoinvens.get(this.detalleimpuestoinvens.size() - 1);
				
					if(detalleimpuestoinvenAux.getId()<0) {
						this.detalleimpuestoinvens.remove(detalleimpuestoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleImpuestoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleimpuestoinven.getId()<0) {
				this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().remove(this.detalleimpuestoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleimpuestoinven.getId()<0) {
				this.detalleimpuestoinvens.remove(this.detalleimpuestoinven);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleImpuestoInven(List<DetalleImpuestoInven> detalleimpuestoinvensAux) throws Exception {
		DetalleImpuestoInvenConstantesFunciones.setEstadosInicialesDetalleImpuestoInven(detalleimpuestoinvensAux);
	}
	
	public void setEstadosInicialesDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinvenAux) throws Exception {
		DetalleImpuestoInvenConstantesFunciones.setEstadosInicialesDetalleImpuestoInven(detalleimpuestoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleImpuestoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleImpuestoInvenActual()) {
				if(!this.isEsNuevoDetalleImpuestoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleImpuestoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleImpuestoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Impuesto Inven ?", "MANTENIMIENTO DE Detalle Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleImpuestoInven detalleimpuestoinven) throws Exception {
		DetalleImpuestoInvenConstantesFunciones.seleccionarAsignar(this.detalleimpuestoinven,detalleimpuestoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleImpuestoInven=this.isPermisoActualizarOriginalDetalleImpuestoInven;
			
			
			this.seleccionarAsignar(detalleimpuestoinven);
			
			

			idProductoActual=detalleimpuestoinven.getid_producto();
			this.seleccionarProductoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleImpuestoInvenConstantesFunciones.quitarEspaciosDetalleImpuestoInven(this.detalleimpuestoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleimpuestoinvenSessionBean.setsFuncionBusquedaRapida(this.detalleimpuestoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarProductoActual() throws Exception {
		try	{
			Producto productoAux=new Producto();

			if(this.idProductoActual != null && this.idProductoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					productoLogic.getEntityWithConnection(this.idProductoActual);
					productoAux= productoLogic.getProducto();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				productosForeignKey=new ArrayList<Producto>();
				productosForeignKey.add(productoAux);
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
			if(this.isEsNuevoDetalleImpuestoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleImpuestoInven(esParaCancelar);				
				this.cancelarNuevoDetalleImpuestoInven(esParaCancelar);								
			}
			
			this.detalleimpuestoinven=new DetalleImpuestoInven();
			
			this.inicializarDetalleImpuestoInven();
			
			this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleImpuestoInven() throws Exception {
		try {
			DetalleImpuestoInvenConstantesFunciones.inicializarDetalleImpuestoInven(this.detalleimpuestoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleImpuestoInvens(String sAccionBusqueda,List<DetalleImpuestoInven> detalleimpuestoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleImpuestoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleImpuestoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleImpuestoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleImpuestoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Impuesto Invenes");		
		parameters.put("busquedapor", DetalleImpuestoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleImpuestoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleImpuestoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleImpuestoInven=new JRBeanArrayDataSource(DetalleImpuestoInvenJInternalFrame.TraerDetalleImpuestoInvenBeans(detalleimpuestoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleImpuestoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleImpuestoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleImpuestoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleImpuestoInvenBean.TraerDetalleImpuestoInvenBeans(detalleimpuestoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInvenActionPerformed(null);
					//this.generarExcelReporteDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleImpuestoInvens(sAccionBusqueda,sTipoArchivoReporte,detalleimpuestoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleImpuestoInven> detalleimpuestoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleImpuestoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleImpuestoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleImpuestoInven detalleimpuestoinven : detalleimpuestoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleImpuestoInvenConstantesFunciones.generarExcelReporteDataDetalleImpuestoInven("NORMAL",row,workbook,detalleimpuestoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleImpuestoInven(String sTipo,Row row,Workbook workbook) {
		
		DetalleImpuestoInvenConstantesFunciones.generarExcelReporteHeaderDetalleImpuestoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleImpuestoInven> detalleimpuestoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleImpuestoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleImpuestoInven detalleimpuestoinven : detalleimpuestoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.getDetalleImpuestoInvenDescripcion(detalleimpuestoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getimpuestoinven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleimpuestoinven.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleImpuestoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleImpuestoInven> detalleimpuestoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleImpuestoInven> detalleimpuestoinvensRespaldo=null;
		
		classes=DetalleImpuestoInvenConstantesFunciones.getClassesRelationshipsOfDetalleImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleimpuestoinvenLogic.setDatosCliente(this.datosCliente);
		this.detalleimpuestoinvenLogic.setDatosDeep(this.datosDeep);
		this.detalleimpuestoinvenLogic.setIsConDeep(true);
		
		detalleimpuestoinvensRespaldo=this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens();
		
		this.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(detalleimpuestoinvensParaReportes);	
		this.detalleimpuestoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleimpuestoinvensParaReportes=this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens();
		this.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(detalleimpuestoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleImpuestoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleImpuestoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleImpuestoInven detalleimpuestoinven : detalleimpuestoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleImpuestoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleImpuestoInvenConstantesFunciones.generarExcelReporteDataDetalleImpuestoInven("NORMAL",row,workbook,detalleimpuestoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.getDetalleImpuestoInvenDescripcion(detalleimpuestoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleImpuestoInven() throws Exception {		
		this.startProcessDetalleImpuestoInven(true);
	}
	
	public void startProcessDetalleImpuestoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleImpuestoInven ,this.jPanelParametrosReportesDetalleImpuestoInven, this.jScrollPanelDatosDetalleImpuestoInven,this.jPanelPaginacionDetalleImpuestoInven, this.jScrollPanelDatosEdicionDetalleImpuestoInven, this.jPanelAccionesDetalleImpuestoInven,this.jPanelAccionesFormularioDetalleImpuestoInven,this.jmenuBarDetalleImpuestoInven,this.jmenuBarDetalleDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleImpuestoInven=this.jTabbedPaneBusquedasDetalleImpuestoInven; 
		
		final JPanel jPanelParametrosReportesDetalleImpuestoInven=this.jPanelParametrosReportesDetalleImpuestoInven;
		//final JScrollPane jScrollPanelDatosDetalleImpuestoInven=this.jScrollPanelDatosDetalleImpuestoInven;
		final JTable jTableDatosDetalleImpuestoInven=this.jTableDatosDetalleImpuestoInven;		
		final JPanel jPanelPaginacionDetalleImpuestoInven=this.jPanelPaginacionDetalleImpuestoInven;
		//final JScrollPane jScrollPanelDatosEdicionDetalleImpuestoInven=this.jScrollPanelDatosEdicionDetalleImpuestoInven;
		final JPanel jPanelAccionesDetalleImpuestoInven=this.jPanelAccionesDetalleImpuestoInven;
		
		JPanel jPanelCamposAuxiliarDetalleImpuestoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleImpuestoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			jPanelCamposAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelCamposDetalleImpuestoInven;
			jPanelAccionesFormularioAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelAccionesFormularioDetalleImpuestoInven;
		}
		
		final JPanel jPanelCamposDetalleImpuestoInven=jPanelCamposAuxiliarDetalleImpuestoInven;
		final JPanel jPanelAccionesFormularioDetalleImpuestoInven=jPanelAccionesFormularioAuxiliarDetalleImpuestoInven;
		
		
		final JMenuBar jmenuBarDetalleImpuestoInven=this.jmenuBarDetalleImpuestoInven;
		final JToolBar jTtoolBarDetalleImpuestoInven=this.jTtoolBarDetalleImpuestoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleImpuestoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleImpuestoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			jmenuBarDetalleAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jmenuBarDetalleDetalleImpuestoInven;
			jTtoolBarDetalleAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jTtoolBarDetalleDetalleImpuestoInven;
		}
		
		final JMenuBar jmenuBarDetalleDetalleImpuestoInven=jmenuBarDetalleAuxiliarDetalleImpuestoInven;
		final JToolBar jTtoolBarDetalleDetalleImpuestoInven=jTtoolBarDetalleAuxiliarDetalleImpuestoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleImpuestoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleImpuestoInven;
			processRunnable.jTableDatos=jTableDatosDetalleImpuestoInven;
			processRunnable.jPanelCampos=jPanelCamposDetalleImpuestoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleImpuestoInven;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleImpuestoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleImpuestoInven;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleImpuestoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleImpuestoInven;
			processRunnable.jTtoolBar=jTtoolBarDetalleImpuestoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleImpuestoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleImpuestoInven ,jPanelParametrosReportesDetalleImpuestoInven,jTableDatosDetalleImpuestoInven, /*jScrollPanelDatosDetalleImpuestoInven,*/jPanelCamposDetalleImpuestoInven,jPanelPaginacionDetalleImpuestoInven, /*jScrollPanelDatosEdicionDetalleImpuestoInven,*/ jPanelAccionesDetalleImpuestoInven,jPanelAccionesFormularioDetalleImpuestoInven,jmenuBarDetalleImpuestoInven,jmenuBarDetalleDetalleImpuestoInven,jTtoolBarDetalleImpuestoInven,jTtoolBarDetalleDetalleImpuestoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleImpuestoInven ,jPanelParametrosReportesDetalleImpuestoInven, jScrollPanelDatosDetalleImpuestoInven,jPanelPaginacionDetalleImpuestoInven, jScrollPanelDatosEdicionDetalleImpuestoInven, jPanelAccionesDetalleImpuestoInven,jPanelAccionesFormularioDetalleImpuestoInven,jmenuBarDetalleImpuestoInven,jmenuBarDetalleDetalleImpuestoInven,jTtoolBarDetalleImpuestoInven,jTtoolBarDetalleDetalleImpuestoInven);
						
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
	
	public void finishProcessDetalleImpuestoInven() {// throws Exception 
		this.finishProcessDetalleImpuestoInven(true);
	}
	
	public void finishProcessDetalleImpuestoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleImpuestoInven ,this.jPanelParametrosReportesDetalleImpuestoInven, this.jScrollPanelDatosDetalleImpuestoInven,this.jPanelPaginacionDetalleImpuestoInven, this.jScrollPanelDatosEdicionDetalleImpuestoInven, this.jPanelAccionesDetalleImpuestoInven,this.jPanelAccionesFormularioDetalleImpuestoInven,this.jmenuBarDetalleImpuestoInven,this.jmenuBarDetalleDetalleImpuestoInven,this.jTtoolBarDetalleImpuestoInven,this.jTtoolBarDetalleDetalleImpuestoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleImpuestoInven=this.jTabbedPaneBusquedasDetalleImpuestoInven; 
		
		final JPanel jPanelParametrosReportesDetalleImpuestoInven=this.jPanelParametrosReportesDetalleImpuestoInven;
		//final JScrollPane jScrollPanelDatosDetalleImpuestoInven=this.jScrollPanelDatosDetalleImpuestoInven;
		final JTable jTableDatosDetalleImpuestoInven=this.jTableDatosDetalleImpuestoInven;		
		final JPanel jPanelPaginacionDetalleImpuestoInven=this.jPanelPaginacionDetalleImpuestoInven;
		//final JScrollPane jScrollPanelDatosEdicionDetalleImpuestoInven=this.jScrollPanelDatosEdicionDetalleImpuestoInven;
		final JPanel jPanelAccionesDetalleImpuestoInven=this.jPanelAccionesDetalleImpuestoInven;
		
		JPanel jPanelCamposAuxiliarDetalleImpuestoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleImpuestoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			jPanelCamposAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelCamposDetalleImpuestoInven;
			jPanelAccionesFormularioAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelAccionesFormularioDetalleImpuestoInven;
		}
		
		final JPanel jPanelCamposDetalleImpuestoInven=jPanelCamposAuxiliarDetalleImpuestoInven;
		final JPanel jPanelAccionesFormularioDetalleImpuestoInven=jPanelAccionesFormularioAuxiliarDetalleImpuestoInven;
		
		
		final JMenuBar jmenuBarDetalleImpuestoInven=this.jmenuBarDetalleImpuestoInven;		
		final JToolBar jTtoolBarDetalleImpuestoInven=this.jTtoolBarDetalleImpuestoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleImpuestoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleImpuestoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			jmenuBarDetalleAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jmenuBarDetalleDetalleImpuestoInven;
			jTtoolBarDetalleAuxiliarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jTtoolBarDetalleDetalleImpuestoInven;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleImpuestoInven=jmenuBarDetalleAuxiliarDetalleImpuestoInven;
		final JToolBar jTtoolBarDetalleDetalleImpuestoInven=jTtoolBarDetalleAuxiliarDetalleImpuestoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleImpuestoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleImpuestoInven;
			processRunnable.jTableDatos=jTableDatosDetalleImpuestoInven;
			processRunnable.jPanelCampos=jPanelCamposDetalleImpuestoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleImpuestoInven;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleImpuestoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleImpuestoInven;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleImpuestoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleImpuestoInven;
			processRunnable.jTtoolBar=jTtoolBarDetalleImpuestoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleImpuestoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleImpuestoInven ,jPanelParametrosReportesDetalleImpuestoInven, jTableDatosDetalleImpuestoInven,/*jScrollPanelDatosDetalleImpuestoInven,*/jPanelCamposDetalleImpuestoInven,jPanelPaginacionDetalleImpuestoInven, /*jScrollPanelDatosEdicionDetalleImpuestoInven,*/ jPanelAccionesDetalleImpuestoInven,jPanelAccionesFormularioDetalleImpuestoInven,jmenuBarDetalleImpuestoInven,jmenuBarDetalleDetalleImpuestoInven,jTtoolBarDetalleImpuestoInven,jTtoolBarDetalleDetalleImpuestoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleImpuestoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleImpuestoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleImpuestoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleImpuestoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleImpuestoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleImpuestoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleImpuestoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleimpuestoinvenConstantesFunciones.getsFinalQueryDetalleImpuestoInven();
		String  finalQueryPaginacionTodos=this.detalleimpuestoinvenConstantesFunciones.getsFinalQueryDetalleImpuestoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesNoDetalleImpuestoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesDetalleImpuestoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleImpuestoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleimpuestoinvensEliminados= new ArrayList<DetalleImpuestoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleImpuestoInven();
		
				///*DetalleImpuestoInvenSessionBean*/this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			
			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
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
					this.iNumeroPaginacion=DetalleImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleImpuestoInvenConstantesFunciones.getClassesForeignKeysOfDetalleImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleimpuestoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleimpuestoinvensAux= new ArrayList<DetalleImpuestoInven>();
			
				
			detalleimpuestoinvenLogic.setDatosCliente(this.datosCliente);
			detalleimpuestoinvenLogic.setDatosDeep(this.datosDeep);
			detalleimpuestoinvenLogic.setIsConDeep(true);
			
			
			detalleimpuestoinvenLogic.getDetalleImpuestoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleimpuestoinvenLogic.getTodosDetalleImpuestoInvens(finalQueryGlobal,pagination);
					
					//detalleimpuestoinvenLogic.getTodosDetalleImpuestoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null|| detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleimpuestoinvensAux= new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux= new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleimpuestoinvenLogic.getTodosDetalleImpuestoInvens(finalQueryGlobal+"",this.pagination);												
							
							//detalleimpuestoinvenLogic.getTodosDetalleImpuestoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvenLogic.getDetalleImpuestoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());					
							detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleImpuestoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleImpuestoInven=this.idActual;
				
				} else if(this.idDetalleImpuestoInvenActual!=null && this.idDetalleImpuestoInvenActual!=0L) {
					idDetalleImpuestoInven=idDetalleImpuestoInvenActual;
				}
				
					
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndicePorId(idDetalleImpuestoInven);
				
				this.detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleimpuestoinvenLogic.getEntity(idDetalleImpuestoInven);
					
					//detalleimpuestoinvenLogic.getEntityWithConnection(idDetalleImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
					detalleimpuestoinvenLogic.getDetalleImpuestoInvens().add(detalleimpuestoinvenLogic.getDetalleImpuestoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
					this.detalleimpuestoinvens.add(detalleimpuestoinven);
				}
				
				if(detalleimpuestoinvenLogic.getDetalleImpuestoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null||detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleimpuestoinvens==null|| detalleimpuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
						detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleImpuestoInvens("FK_IdBodega",detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleImpuestoInvens("FK_IdBodega",detalleimpuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
						detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null||detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleimpuestoinvens==null|| detalleimpuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
						detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleImpuestoInvens("FK_IdEmpresa",detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleImpuestoInvens("FK_IdEmpresa",detalleimpuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
						detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdImpuestoInven")) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdImpuestoInven(finalQueryGlobal,pagination,id_impuesto_invenFK_IdImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null||detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleimpuestoinvens==null|| detalleimpuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
						detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdImpuestoInven(finalQueryGlobal,pagination,id_impuesto_invenFK_IdImpuestoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdImpuestoInven(id_impuesto_invenFK_IdImpuestoInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleImpuestoInvens("FK_IdImpuestoInven",detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleImpuestoInvens("FK_IdImpuestoInven",detalleimpuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
						detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProducto")) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null||detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleimpuestoinvens==null|| detalleimpuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
						detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdProducto(finalQueryGlobal,pagination,id_productoFK_IdProducto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdProducto(id_productoFK_IdProducto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleImpuestoInvens("FK_IdProducto",detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleImpuestoInvens("FK_IdProducto",detalleimpuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
						detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens()==null||detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleimpuestoinvens==null|| detalleimpuestoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
						detalleimpuestoinvensAux.addAll(detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvensAux=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvensAux.addAll(detalleimpuestoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleImpuestoInvenConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleImpuestoInvens("FK_IdSucursal",detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleImpuestoInvens("FK_IdSucursal",detalleimpuestoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenLogic.setDetalleImpuestoInvens(new ArrayList<DetalleImpuestoInven>());
						detalleimpuestoinvenLogic.getDetalleImpuestoInvens().addAll(detalleimpuestoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvens=new ArrayList<DetalleImpuestoInven>();
							detalleimpuestoinvens.addAll(detalleimpuestoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleImpuestoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleImpuestoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleimpuestoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleimpuestoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleImpuestoInven detalleimpuestoinven) {
		Boolean permite=true;
		
		if(this.detalleimpuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleImpuestoInvenConstantesFunciones.getOrderByListaDetalleImpuestoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleImpuestoInvenConstantesFunciones.getOrderByListaDetalleImpuestoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				if(detalleimpuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detalleimpuestoinvenTotales=detalleimpuestoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleImpuestoInven detalleimpuestoinven:this.detalleimpuestoinvens) {
				if(detalleimpuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detalleimpuestoinvenTotales=detalleimpuestoinven;
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
			this.detalleimpuestoinvenAux=new DetalleImpuestoInven();
			this.detalleimpuestoinvenAux.setsType(Constantes2.S_TOTALES);
			this.detalleimpuestoinvenAux.setIsNew(false);
			this.detalleimpuestoinvenAux.setIsChanged(false);
			this.detalleimpuestoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleImpuestoInvenConstantesFunciones.TotalizarValoresFilaDetalleImpuestoInven(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this.detalleimpuestoinvenAux);
				
				this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().add(this.detalleimpuestoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleImpuestoInvenConstantesFunciones.TotalizarValoresFilaDetalleImpuestoInven(this.detalleimpuestoinvens,this.detalleimpuestoinvenAux);
				
				this.detalleimpuestoinvens.add(this.detalleimpuestoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleimpuestoinvenTotales=new DetalleImpuestoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().remove(detalleimpuestoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleimpuestoinvens.remove(detalleimpuestoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleimpuestoinvenTotales=new DetalleImpuestoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				if(detalleimpuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detalleimpuestoinvenTotales=detalleimpuestoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleImpuestoInvenConstantesFunciones.TotalizarValoresFilaDetalleImpuestoInven(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),detalleimpuestoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleImpuestoInven detalleimpuestoinven:this.detalleimpuestoinvens) {
				if(detalleimpuestoinven.getsType().equals(Constantes2.S_TOTALES)) {
					detalleimpuestoinvenTotales=detalleimpuestoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleImpuestoInvenConstantesFunciones.TotalizarValoresFilaDetalleImpuestoInven(this.detalleimpuestoinvens,detalleimpuestoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleImpuestoInvensFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleImpuestoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleImpuestoInvensFK_IdImpuestoInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdImpuestoInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleImpuestoInvensFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleImpuestoInvensFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleImpuestoInvensFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleImpuestoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleImpuestoInvensFK_IdImpuestoInven(String sFinalQuery,Long id_impuesto_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdImpuestoInven(sFinalQuery,this.pagination,id_impuesto_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleImpuestoInvensFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleImpuestoInvensFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLogic.getDetalleImpuestoInvensFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosDetalleImpuestoInven() {
		this.isPermisoTodoDetalleImpuestoInven=false;
		this.isPermisoNuevoDetalleImpuestoInven=false;
		this.isPermisoActualizarDetalleImpuestoInven=false;
		this.isPermisoActualizarOriginalDetalleImpuestoInven=false;
		this.isPermisoEliminarDetalleImpuestoInven=false;
		this.isPermisoGuardarCambiosDetalleImpuestoInven=false;
		this.isPermisoConsultaDetalleImpuestoInven=false;
		this.isPermisoBusquedaDetalleImpuestoInven=false;
		this.isPermisoReporteDetalleImpuestoInven=false;		
		this.isPermisoOrdenDetalleImpuestoInven=false;		
		this.isPermisoPaginacionMedioDetalleImpuestoInven=false;		
		this.isPermisoPaginacionAltoDetalleImpuestoInven=false;
		this.isPermisoPaginacionTodoDetalleImpuestoInven=false;
		this.isPermisoCopiarDetalleImpuestoInven=false;		
		this.isPermisoVerFormDetalleImpuestoInven=false;		
		this.isPermisoDuplicarDetalleImpuestoInven=false;		
		this.isPermisoOrdenDetalleImpuestoInven=false;		
	}
	
	public void setPermisosUsuarioDetalleImpuestoInven(Boolean isPermiso) {
		this.isPermisoTodoDetalleImpuestoInven=isPermiso;
		this.isPermisoNuevoDetalleImpuestoInven=isPermiso;
		this.isPermisoActualizarDetalleImpuestoInven=isPermiso;
		this.isPermisoActualizarOriginalDetalleImpuestoInven=isPermiso;
		this.isPermisoEliminarDetalleImpuestoInven=isPermiso;
		this.isPermisoGuardarCambiosDetalleImpuestoInven=isPermiso;
		this.isPermisoConsultaDetalleImpuestoInven=isPermiso;
		this.isPermisoBusquedaDetalleImpuestoInven=isPermiso;
		this.isPermisoReporteDetalleImpuestoInven=isPermiso;
		this.isPermisoOrdenDetalleImpuestoInven=isPermiso;		
		this.isPermisoPaginacionMedioDetalleImpuestoInven=isPermiso;		
		this.isPermisoPaginacionAltoDetalleImpuestoInven=isPermiso;		
		this.isPermisoPaginacionTodoDetalleImpuestoInven=isPermiso;		
		this.isPermisoCopiarDetalleImpuestoInven=isPermiso;		
		this.isPermisoVerFormDetalleImpuestoInven=isPermiso;		
		this.isPermisoDuplicarDetalleImpuestoInven=isPermiso;
		this.isPermisoOrdenDetalleImpuestoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleImpuestoInven(Boolean isPermiso) {
		//this.isPermisoTodoDetalleImpuestoInven=isPermiso;
		this.isPermisoNuevoDetalleImpuestoInven=isPermiso;
		this.isPermisoActualizarDetalleImpuestoInven=isPermiso;
		this.isPermisoActualizarOriginalDetalleImpuestoInven=isPermiso;
		this.isPermisoEliminarDetalleImpuestoInven=isPermiso;
		this.isPermisoGuardarCambiosDetalleImpuestoInven=isPermiso;
		//this.isPermisoConsultaDetalleImpuestoInven=isPermiso;
		//this.isPermisoBusquedaDetalleImpuestoInven=isPermiso;
		//this.isPermisoReporteDetalleImpuestoInven=isPermiso;
		//this.isPermisoOrdenDetalleImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleImpuestoInven=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleImpuestoInven=isPermiso;		
		//this.isPermisoCopiarDetalleImpuestoInven=isPermiso;		
		//this.isPermisoDuplicarDetalleImpuestoInven=isPermiso;
		//this.isPermisoOrdenDetalleImpuestoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleImpuestoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleImpuestoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleImpuestoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleImpuestoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleImpuestoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleImpuestoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleImpuestoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleImpuestoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleImpuestoInven=this.isPermisoActualizarDetalleImpuestoInven;
			this.isPermisoEliminarDetalleImpuestoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleImpuestoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleImpuestoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleImpuestoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleImpuestoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleImpuestoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleImpuestoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleImpuestoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleImpuestoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleImpuestoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleImpuestoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleImpuestoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleImpuestoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleImpuestoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleImpuestoInven.setToolTipText(this.jTableDatosDetalleImpuestoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleImpuestoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleImpuestoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleImpuestoInven() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleImpuestoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.productosForeignKey=new ArrayList();
				this.impuestoinvensForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleImpuestoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleImpuestoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleImpuestoInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyImpuestoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyImpuestoInvenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.impuestoinvensForeignKey==null||this.impuestoinvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesImpuestoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ImpuestoInvenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ImpuestoInvenConstantesFunciones.SFINALQUERY;

				this.cargarCombosImpuestoInvensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleImpuestoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenReturnGeneral=new DetalleImpuestoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleimpuestoinvenConstantesFunciones.cargarid_empresaDetalleImpuestoInven)
					 || (this.esRecargarFks && this.detalleimpuestoinvenConstantesFunciones.cargarid_empresaDetalleImpuestoInven)) {

					if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleimpuestoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleimpuestoinvenConstantesFunciones.cargarid_sucursalDetalleImpuestoInven)
					 || (this.esRecargarFks && this.detalleimpuestoinvenConstantesFunciones.cargarid_sucursalDetalleImpuestoInven)) {

					if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleimpuestoinvenSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.detalleimpuestoinvenConstantesFunciones.cargarid_bodegaDetalleImpuestoInven)
					 || (this.esRecargarFks && this.detalleimpuestoinvenConstantesFunciones.cargarid_bodegaDetalleImpuestoInven)) {

					if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+detalleimpuestoinvenSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalProducto="";

				if(((this.productosForeignKey==null||this.productosForeignKey.size()<=0) && this.detalleimpuestoinvenConstantesFunciones.cargarid_productoDetalleImpuestoInven)
					 || (this.esRecargarFks && this.detalleimpuestoinvenConstantesFunciones.cargarid_productoDetalleImpuestoInven)) {

					if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProductoConstantesFunciones.getArrayColumnasGlobalesProducto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProducto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProductoConstantesFunciones.TABLENAME);

						finalQueryGlobalProducto=Funciones.GetFinalQueryAppend(finalQueryGlobalProducto, "");
						finalQueryGlobalProducto+=ProductoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProductosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProducto=" WHERE " + ConstantesSql.ID + "="+detalleimpuestoinvenSessionBean.getlidProductoActual();
					}
				} else {
					finalQueryGlobalProducto="NONE";
				}


				String finalQueryGlobalImpuestoInven="";

				if(((this.impuestoinvensForeignKey==null||this.impuestoinvensForeignKey.size()<=0) && this.detalleimpuestoinvenConstantesFunciones.cargarid_impuesto_invenDetalleImpuestoInven)
					 || (this.esRecargarFks && this.detalleimpuestoinvenConstantesFunciones.cargarid_impuesto_invenDetalleImpuestoInven)) {

					if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ImpuestoInvenConstantesFunciones.getArrayColumnasGlobalesImpuestoInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalImpuestoInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ImpuestoInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalImpuestoInven=Funciones.GetFinalQueryAppend(finalQueryGlobalImpuestoInven, "");
						finalQueryGlobalImpuestoInven+=ImpuestoInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosImpuestoInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalImpuestoInven=" WHERE " + ConstantesSql.ID + "="+detalleimpuestoinvenSessionBean.getlidImpuestoInvenActual();
					}
				} else {
					finalQueryGlobalImpuestoInven="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.cargarCombosLoteForeignKeyDetalleImpuestoInven(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalProducto,finalQueryGlobalImpuestoInven);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleimpuestoinvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleimpuestoinvenReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=detalleimpuestoinvenReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalProducto.equals("NONE")) {
				this.productosForeignKey=detalleimpuestoinvenReturnGeneral.getproductosForeignKey();
			}

			if(!finalQueryGlobalImpuestoInven.equals("NONE")) {
				this.impuestoinvensForeignKey=detalleimpuestoinvenReturnGeneral.getimpuestoinvensForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleImpuestoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyImpuestoInven();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleimpuestoinvenSessionBean==null) {
				this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyImpuestoInven()throws Exception {
		try {

			if(!this.detalleimpuestoinvenSessionBean.getisBusquedaDesdeForeignKeySesionImpuestoInven()) {
				ImpuestoInven impuestoinven=new ImpuestoInven();
				ImpuestoInvenConstantesFunciones.setImpuestoInvenDescripcion(impuestoinven,Constantes.SMENSAJE_ESCOJA_OPCION);
				impuestoinven.setId(null);

				if(!ImpuestoInvenConstantesFunciones.ExisteEnLista(this.impuestoinvensForeignKey,impuestoinven,true)) {

					this.impuestoinvensForeignKey.add(0,impuestoinven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleImpuestoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleImpuestoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleImpuestoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleImpuestoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(detalleimpuestoinven.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(detalleimpuestoinven.getid_producto(),false,"Formulario");
			this.setActualImpuestoInvenForeignKey(detalleimpuestoinven.getid_impuesto_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,String sTipoEvento)throws Exception {	
		try {
			
			

				if(detalleimpuestoinven.getProducto()!=null && !sTipoEvento.equals("id_productoDetalleImpuestoInven")) { //sTipoEvento Evita Bucle Infinito

					this.productosForeignKey=new ArrayList<Producto>();
					this.productosForeignKey.add(detalleimpuestoinven.getProducto());

					this.addItemDefectoCombosForeignKeyProducto();
					this.cargarCombosFrameProductosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleImpuestoInven()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.detalleimpuestoinvenConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualProductoForeignKey(this.detalleimpuestoinvenConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualImpuestoInvenForeignKey(this.detalleimpuestoinvenConstantesFunciones.getid_impuesto_inven(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleImpuestoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleImpuestoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleImpuestoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleImpuestoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleImpuestoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameImpuestoInvensForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleImpuestoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameImpuestoInvensForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleImpuestoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public DetalleImpuestoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleImpuestoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleImpuestoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean(); 
		this.detalleimpuestoinvenConstantesFunciones=new DetalleImpuestoInvenConstantesFunciones(); 
		this.detalleimpuestoinvenBean=new DetalleImpuestoInven();//(this.detalleimpuestoinvenConstantesFunciones); 		
		this.detalleimpuestoinvenReturnGeneral=new DetalleImpuestoInvenParameterReturnGeneral(); 
		
		this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleImpuestoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleImpuestoInven(true);
			
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
			
			this.detalleimpuestoinvenConstantesFunciones=new DetalleImpuestoInvenConstantesFunciones(); 
			this.detalleimpuestoinvenBean=new DetalleImpuestoInven();//this.detalleimpuestoinvenConstantesFunciones); 			
			this.detalleimpuestoinvenReturnGeneral=new DetalleImpuestoInvenParameterReturnGeneral(); 
		
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Impuesto Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleimpuestoinven=new DetalleImpuestoInven();
			this.detalleimpuestoinvens = new ArrayList<DetalleImpuestoInven>();
			this.detalleimpuestoinvensAux = new ArrayList<DetalleImpuestoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic=new DetalleImpuestoInvenLogic();
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleimpuestoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleimpuestoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleImpuestoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleImpuestoInven);	
					}
					
					if(this.jInternalFrameImportacionDetalleImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleImpuestoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleImpuestoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleImpuestoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleImpuestoInven);
				this.jInternalFrameDetalleFormDetalleImpuestoInven.setVisible(false);
				this.jInternalFrameDetalleFormDetalleImpuestoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleImpuestoInven);
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleImpuestoInven);
					this.jInternalFrameImportacionDetalleImpuestoInven.setVisible(false);
					this.jInternalFrameImportacionDetalleImpuestoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleImpuestoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleImpuestoInven);
					this.jInternalFrameOrderByDetalleImpuestoInven.setVisible(false);
					this.jInternalFrameOrderByDetalleImpuestoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleImpuestoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleimpuestoinvenReturnGeneral=new DetalleImpuestoInvenParameterReturnGeneral();
			
			this.detalleimpuestoinvenParameterGeneral=new DetalleImpuestoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleimpuestoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleImpuestoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaDuplicarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaCopiarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaVerFormDetalleImpuestoInven=true;
			this.isVisibilidadCeldaOrdenDetalleImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdImpuestoInven=true;
			this.isVisibilidadFK_IdProducto=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleImpuestoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleImpuestoInven(false);
			
			this.setPermisosUsuarioDetalleImpuestoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado() && this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleImpuestoInvenClasesRelacionadas();
			}
			
			if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleImpuestoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleImpuestoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleImpuestoInven();
			}
			
			if(!this.isPermisoBusquedaDetalleImpuestoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleImpuestoInven,this.isPermisoPaginacionMedioDetalleImpuestoInven,this.isPermisoPaginacionTodoDetalleImpuestoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleImpuestoInvenConstantesFunciones.getTiposSeleccionarDetalleImpuestoInven());
				
				this.tiposColumnasSelect=DetalleImpuestoInvenConstantesFunciones.getTiposSeleccionarDetalleImpuestoInven(true);
				
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
			//if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleImpuestoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioDetalleImpuestoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioDetalleImpuestoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleImpuestoInven() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			this.productoLogic=new ProductoLogic();
			this.impuestoinvenLogic=new ImpuestoInvenLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleimpuestoinvenImplementable= (DetalleImpuestoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleImpuestoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleimpuestoinvenImplementableHome= (DetalleImpuestoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleImpuestoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleimpuestoinvens= new ArrayList<DetalleImpuestoInven>();
			this.detalleimpuestoinvensEliminados= new ArrayList<DetalleImpuestoInven>();
						
			this.isEsNuevoDetalleImpuestoInven=false;
			this.esParaAccionDesdeFormularioDetalleImpuestoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idProductoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleImpuestoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleImpuestoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleImpuestoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleImpuestoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleImpuestoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleImpuestoInven();
			}
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleImpuestoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleImpuestoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleImpuestoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleImpuestoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleImpuestoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleImpuestoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleImpuestoInven")) {
				iIndex=this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleImpuestoInven();	
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
	
	public void cargarCombosForeignKeyDetalleImpuestoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleImpuestoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleImpuestoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleImpuestoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleImpuestoInven();
		
		this.cargarCombosFrameForeignKeyDetalleImpuestoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleImpuestoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleImpuestoInven();
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

	public void cargarCombosForeignKeyImpuestoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyImpuestoInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyImpuestoInven();
				this.cargarCombosFrameImpuestoInvensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaImpuestoInven(this.impuestoinvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleImpuestoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			
			if(jTableDatosDetalleImpuestoInven.getRowCount()>=1) {
				jTableDatosDetalleImpuestoInven.removeRowSelectionInterval(0, jTableDatosDetalleImpuestoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleImpuestoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleImpuestoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleImpuestoInven(true);			
			//this.detalleimpuestoinven=new DetalleImpuestoInven();
			//this.detalleimpuestoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven() ;
			
			if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleImpuestoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleimpuestoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);				
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleImpuestoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleImpuestoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleImpuestoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleImpuestoInven.getSelectedRows().length;			
			}
			
			detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleImpuestoInven--;			
				//DetalleImpuestoInven detalleimpuestoinvenAux= new DetalleImpuestoInven();			
				//detalleimpuestoinvenAux.setId(this.iIdNuevoDetalleImpuestoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleImpuestoInven detalleimpuestoinvenOrigen=new DetalleImpuestoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleImpuestoInven detalleimpuestoinvenOrigen : detalleimpuestoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleimpuestoinvenOrigen =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleimpuestoinvenOrigen =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleImpuestoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleimpuestoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleImpuestoInven(detalleimpuestoinvenOrigen,this.detalleimpuestoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().add(this.detalleimpuestoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinvens.add(this.detalleimpuestoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
				
				this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleImpuestoInven(), this.getIndiceNuevoDetalleImpuestoInven());
				
				int iLastRow =  this.jTableDatosDetalleImpuestoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleImpuestoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleImpuestoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();									
		
			DetalleImpuestoInven detalleimpuestoinvenOrigen=new DetalleImpuestoInven();
			DetalleImpuestoInven detalleimpuestoinvenDestino=new DetalleImpuestoInven();
				
			detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleImpuestoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleimpuestoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleImpuestoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenOrigen =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleimpuestoinvenOrigen =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleimpuestoinvenDestino =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleimpuestoinvenDestino =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleimpuestoinvenOrigen =detalleimpuestoinvensSeleccionados.get(0);
				detalleimpuestoinvenDestino =detalleimpuestoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleImpuestoInven(detalleimpuestoinvenOrigen,detalleimpuestoinvenDestino,true,false);
				
				detalleimpuestoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleimpuestoinvenDestino,detalleimpuestoinvenLogic.getDetalleImpuestoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleimpuestoinvenDestino,detalleimpuestoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
				
				//this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleImpuestoInven(), this.getIndiceNuevoDetalleImpuestoInven());
				
				int iLastRow =  this.jTableDatosDetalleImpuestoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleImpuestoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleImpuestoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleImpuestoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(!isVisible);
			this.jPanelPaginacionDetalleImpuestoInven.setVisible(!isVisible);
			this.jPanelAccionesDetalleImpuestoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleImpuestoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleImpuestoInven();
			
			this.abrirFrameOrderByDetalleImpuestoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleImpuestoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleImpuestoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleImpuestoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleImpuestoInven.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleImpuestoInven.setSize(this.jInternalFrameDetalleFormDetalleImpuestoInven.iWidthFormulario,this.jInternalFrameDetalleFormDetalleImpuestoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleImpuestoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleImpuestoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleImpuestoInven.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jContentPaneDetalleDetalleImpuestoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleImpuestoInven.jContentPaneDetalleDetalleImpuestoInven.getWidth(),DetalleImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleImpuestoInven.jContentPaneDetalleDetalleImpuestoInven.getWidth(),DetalleImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleImpuestoInven.jContentPaneDetalleDetalleImpuestoInven.getWidth(),DetalleImpuestoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleImpuestoInven.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleImpuestoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleImpuestoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleImpuestoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleImpuestoInven,false,this);
				} else {
					this.jInternalFrameOrderByDetalleImpuestoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleImpuestoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleImpuestoInven);
				this.jInternalFrameOrderByDetalleImpuestoInven.setVisible(false);
				this.jInternalFrameOrderByDetalleImpuestoInven.setSelected(false);
				
				this.jInternalFrameOrderByDetalleImpuestoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleImpuestoInven"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleImpuestoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleImpuestoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleImpuestoInven==null) {
				
				this.jInternalFrameImportacionDetalleImpuestoInven=new ImportacionJInternalFrame(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleImpuestoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleImpuestoInven);
				this.jInternalFrameImportacionDetalleImpuestoInven.setVisible(false);
				this.jInternalFrameImportacionDetalleImpuestoInven.setSelected(false);


				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleImpuestoInven"));
				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleImpuestoInven"));
				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleImpuestoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleImpuestoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven==null) {
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven=new ReporteDinamicoJInternalFrame(DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleImpuestoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleImpuestoInven);
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleImpuestoInven"));
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleImpuestoInven"));
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleImpuestoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleImpuestoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleImpuestoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleImpuestoInven);
			
	       	this.jInternalFrameDetalleFormDetalleImpuestoInven.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleImpuestoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleImpuestoInven.dispose();
			//this.jInternalFrameDetalleFormDetalleImpuestoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleImpuestoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleImpuestoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleImpuestoInven.setVisible(true);
	        this.jInternalFrameImportacionDetalleImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleImpuestoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleImpuestoInven.setVisible(true);
	        this.jInternalFrameOrderByDetalleImpuestoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleImpuestoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleImpuestoInven.setVisible(false);
	        this.jInternalFrameOrderByDetalleImpuestoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleImpuestoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleImpuestoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleImpuestoInven.setVisible(false);
	        this.jInternalFrameImportacionDetalleImpuestoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleImpuestoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleImpuestoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleImpuestoInven(true);
			//this.isEsNuevoDetalleImpuestoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false) ;
			
			if(detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleImpuestoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleImpuestoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleImpuestoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleImpuestoInven(true);
			//this.isEsNuevoDetalleImpuestoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleimpuestoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false) ;
			
			if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleImpuestoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Producto")) {
				if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_productoDetalleImpuestoInven) {
					this.cargarCombosProductosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
					this.cargarCombosFrameProductosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_producto (id);

				this.recargarComboTablaProducto(this.productosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleImpuestoInven.getSelectedRow();

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
		TableColumn tableColumnProducto=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleImpuestoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//productoTableCellFk.setRowActual(intSelectedRow);
			//productoTableCellFk.setproductosForeignKeyActual(productosForeignKey);
		//}


		if(productoTableCellFk!=null) {
			productoTableCellFk.RecargarProductosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaImpuestoInven(List<ImpuestoInven> impuestoinvensForeignKey)throws Exception{
		TableColumn tableColumnImpuestoInven=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN));
		TableCellEditor tableCellEditorImpuestoInven =tableColumnImpuestoInven.getCellEditor();

		ImpuestoInvenTableCell impuestoinvenTableCellFk=(ImpuestoInvenTableCell)tableCellEditorImpuestoInven;

		if(impuestoinvenTableCellFk!=null) {
			impuestoinvenTableCellFk.setimpuestoinvensForeignKey(impuestoinvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleImpuestoInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//impuestoinvenTableCellFk.setRowActual(intSelectedRow);
			//impuestoinvenTableCellFk.setimpuestoinvensForeignKeyActual(impuestoinvensForeignKey);
		//}


		if(impuestoinvenTableCellFk!=null) {
			impuestoinvenTableCellFk.RecargarImpuestoInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_producto (Long id) throws Exception {
		this.setActualProductoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleImpuestoInven(false);
			
			//if(!this.isEsNuevoDetalleImpuestoInven) {								
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				
			}
			
			if(this.permiteMantenimiento(this.detalleimpuestoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleImpuestoInven=true;
					this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
					this.isEsNuevoDetalleImpuestoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleImpuestoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleImpuestoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(false);
				
				this.habilitarDeshabilitarControlesDetalleImpuestoInven(false);
			
												
				
				if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleImpuestoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,detalleimpuestoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleImpuestoInven(this.detalleimpuestoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleimpuestoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				this.detalleimpuestoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				this.detalleimpuestoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleimpuestoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleImpuestoInvenModel) this.jTableDatosDetalleImpuestoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleImpuestoInven=true;
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
				this.isEsNuevoDetalleImpuestoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(false);
				
				this.habilitarDeshabilitarControlesDetalleImpuestoInven(false);
				
				
				
				if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleImpuestoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleImpuestoInven.getRowCount()>=1) {
				jTableDatosDetalleImpuestoInven.removeRowSelectionInterval(0, jTableDatosDetalleImpuestoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleImpuestoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(false) ;
			
			this.isEsNuevoDetalleImpuestoInven=false;
			
			if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleImpuestoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleImpuestoInven(false);
				
				//SI ES MANUAL
				if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleImpuestoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleImpuestoInven--;			
			//DetalleImpuestoInven detalleimpuestoinvenAux= new DetalleImpuestoInven();			
			//detalleimpuestoinvenAux.setId(this.iIdNuevoDetalleImpuestoInven);
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleImpuestoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
			
			this.detalleimpuestoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().add(this.detalleimpuestoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleimpuestoinvens.add(this.detalleimpuestoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			
			this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(this.getIndiceNuevoDetalleImpuestoInven(), this.getIndiceNuevoDetalleImpuestoInven());
			
			int iLastRow =  this.jTableDatosDetalleImpuestoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleImpuestoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleImpuestoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
			
			//SI ES MANUAL
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleImpuestoInven();
			}
			
			//this.abrirFrameTreeDetalleImpuestoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Impuesto InvenES ?", "MANTENIMIENTO DE Detalle Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleImpuestoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleImpuestoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.procesarImportacionDetalleImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleimpuestoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleImpuestoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleImpuestoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleImpuestoInven.setFileImportacion(this.jInternalFrameImportacionDetalleImpuestoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleImpuestoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleImpuestoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleImpuestoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleImpuestoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		

		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleImpuestoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleImpuestoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ImpuestoInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ImpuestoInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ImpuestoInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ImpuestoInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					sNombreCampoCategoria="id_impuesto_inven";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					sNombreCampoCategoriaValor="id_impuesto_inven";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Impuesto Inven",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_impuesto_inven");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleImpuestoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getimpuestoinven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(DetalleImpuestoInven detalleimpuestoinven:detalleimpuestoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleimpuestoinven.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelDetalleImpuestoInven(row);				
			//	iRow++;
			//}				
			
			//for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleImpuestoInven(detalleimpuestoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
			
			//SI ES MANUAL
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleImpuestoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
			
			//SI ES MANUAL
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleImpuestoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
			
			//SI ES MANUAL
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleImpuestoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleImpuestoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleImpuestoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleImpuestoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleImpuestoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleImpuestoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleImpuestoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleImpuestoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleImpuestoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleImpuestoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleImpuestoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleImpuestoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleImpuestoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleImpuestoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleImpuestoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleImpuestoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleImpuestoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleImpuestoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleImpuestoInven();
		
		this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleImpuestoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleImpuestoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleImpuestoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleImpuestoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleImpuestoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleImpuestoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionNuevoDetalleImpuestoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleImpuestoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleImpuestoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionNuevoDetalleImpuestoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionSinCerrarDetalleImpuestoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jCheckBoxPostAccionSinMensajeDetalleImpuestoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleImpuestoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleImpuestoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleImpuestoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleImpuestoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleImpuestoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleImpuestoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleImpuestoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleImpuestoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleImpuestoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleImpuestoInven() throws Exception {
		try	{
			if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleImpuestoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleImpuestoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleImpuestoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleImpuestoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleImpuestoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleImpuestoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleImpuestoInven.addItem(reporte);
			}
			
			
			if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleImpuestoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleImpuestoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleImpuestoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleImpuestoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleImpuestoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleImpuestoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleImpuestoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleImpuestoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleImpuestoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetalleImpuestoInvenConstantesFunciones.getTiposSeleccionarDetalleImpuestoInven(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetalleImpuestoInvenConstantesFunciones.getTiposSeleccionarDetalleImpuestoInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetalleImpuestoInvenConstantesFunciones.getTiposSeleccionarDetalleImpuestoInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleImpuestoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaDetalleImpuestoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.getSelectedItem()!=null){this.id_impuesto_invenFK_IdImpuestoInven=((ImpuestoInven)this.jComboBoxid_impuesto_invenFK_IdImpuestoInvenDetalleImpuestoInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.getSelectedItem()!=null){this.id_productoFK_IdProducto=((Producto)this.jComboBoxid_productoFK_IdProductoDetalleImpuestoInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleImpuestoInven(Boolean esInicializar) throws Exception {				
		if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleImpuestoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleImpuestoInven() throws Exception {
		this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleImpuestoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleImpuestoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleImpuestoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleimpuestoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleImpuestoInven.setModel(new DetalleImpuestoInvenModel(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleImpuestoInven.setModel(new DetalleImpuestoInvenModel(this.detalleimpuestoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleImpuestoInven!=null && this.jInternalFrameOrderByDetalleImpuestoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleImpuestoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,detalleimpuestoinvenConstantesFunciones.resaltarSeleccionarDetalleImpuestoInven,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleImpuestoInvenConstantesFunciones.SCLASSWEBTITULO,detalleimpuestoinvenConstantesFunciones.resaltarSeleccionarDetalleImpuestoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_ID));

		if(this.detalleimpuestoinvenConstantesFunciones.mostraridDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltaridDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activaridDetalleImpuestoInven,iSizeTabla,this,true,"idDetalleImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltaridDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activaridDetalleImpuestoInven,this,true,"idDetalleImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarid_empresaDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_empresaDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_empresaDetalleImpuestoInven,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_empresaDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_empresaDetalleImpuestoInven,false,"id_empresaDetalleImpuestoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarid_sucursalDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_sucursalDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_sucursalDetalleImpuestoInven,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_sucursalDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_sucursalDetalleImpuestoInven,false,"id_sucursalDetalleImpuestoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarid_bodegaDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_bodegaDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_bodegaDetalleImpuestoInven,iSizeTabla));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_bodegaDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_bodegaDetalleImpuestoInven,true,"id_bodegaDetalleImpuestoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarid_productoDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_productoDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_productoDetalleImpuestoInven,iSizeTabla));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_productoDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_productoDetalleImpuestoInven,true,"id_productoDetalleImpuestoInven","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarid_impuesto_invenDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ImpuestoInvenTableCell(this.impuestoinvensForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_impuesto_invenDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_impuesto_invenDetalleImpuestoInven,iSizeTabla));
			tableColumn.setCellEditor(new ImpuestoInvenTableCell(this.impuestoinvensForeignKey,this.detalleimpuestoinvenConstantesFunciones.resaltarid_impuesto_invenDetalleImpuestoInven,this,this.detalleimpuestoinvenConstantesFunciones.activarid_impuesto_invenDetalleImpuestoInven,true,"id_impuesto_invenDetalleImpuestoInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarporcentajeDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltarporcentajeDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activarporcentajeDetalleImpuestoInven,iSizeTabla,this,true,"porcentajeDetalleImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltarporcentajeDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activarporcentajeDetalleImpuestoInven,this,true,"porcentajeDetalleImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrarvalorDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltarvalorDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activarvalorDetalleImpuestoInven,iSizeTabla,this,true,"valorDetalleImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltarvalorDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activarvalorDetalleImpuestoInven,this,true,"valorDetalleImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION));

		if(this.detalleimpuestoinvenConstantesFunciones.mostrardescripcionDetalleImpuestoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltardescripcionDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activardescripcionDetalleImpuestoInven,iSizeTabla,this,true,"descripcionDetalleImpuestoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleimpuestoinvenConstantesFunciones.resaltardescripcionDetalleImpuestoInven,this.detalleimpuestoinvenConstantesFunciones.activardescripcionDetalleImpuestoInven,this,true,"descripcionDetalleImpuestoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleImpuestoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleImpuestoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleImpuestoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleImpuestoInven.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleImpuestoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleImpuestoInven.moveColumn(this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleImpuestoInven.moveColumn(this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleImpuestoInven.moveColumn(this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleImpuestoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleImpuestoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleImpuestoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleImpuestoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleImpuestoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleImpuestoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleimpuestoinvenLogic.getDetalleImpuestoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleimpuestoinvens.size()-1;
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
		//this.jTableDatosDetalleImpuestoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleImpuestoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleImpuestoInven();
			
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
				
				//this.isEsNuevoDetalleImpuestoInven=false;
					
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
				if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleImpuestoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleImpuestoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleimpuestoinven.getsType().equals("DUPLICADO")
				   || this.detalleimpuestoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleImpuestoInven=true;
				
				} else {
					this.isEsNuevoDetalleImpuestoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleimpuestoinven.getId()>=0 && !this.detalleimpuestoinven.getIsNew()) {						
						this.isEsNuevoDetalleImpuestoInven=false;
						
					} else {
						this.isEsNuevoDetalleImpuestoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleImpuestoInven(esRelaciones);						
				
				this.seleccionarDetalleImpuestoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleimpuestoinven.getId()<0) {
					this.isEsNuevoDetalleImpuestoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleImpuestoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleImpuestoInven(evt,rowIndex);
				}	
				
				if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleImpuestoInven: " + this.dDif); 
					}
				}								
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleImpuestoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleimpuestoinven)) {
					if(this.detalleimpuestoinven.getId()>0) {
						this.detalleimpuestoinven.setIsDeleted(true);
						
						this.detalleimpuestoinvensEliminados.add(this.detalleimpuestoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().remove(this.detalleimpuestoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinvens.remove(this.detalleimpuestoinven);				
					}
					
					
					((DetalleImpuestoInvenModel) this.jTableDatosDetalleImpuestoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleImpuestoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleImpuestoInven) {
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleImpuestoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleImpuestoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_empresaDetalleImpuestoInven || this.detalleimpuestoinvenConstantesFunciones.event_dependid_empresaDetalleImpuestoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleimpuestoinven.getid_empresa());
									//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleimpuestoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleimpuestoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleimpuestoinven.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_sucursalDetalleImpuestoInven || this.detalleimpuestoinvenConstantesFunciones.event_dependid_sucursalDetalleImpuestoInven) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleimpuestoinven.getid_sucursal());
									//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleimpuestoinven.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleimpuestoinven.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleimpuestoinven.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_bodegaDetalleImpuestoInven || this.detalleimpuestoinvenConstantesFunciones.event_dependid_bodegaDetalleImpuestoInven) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.detalleimpuestoinven.getid_bodega());
									//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(detalleimpuestoinven.getBodega()!=null) {
							this.bodegasForeignKey.add(detalleimpuestoinven.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.detalleimpuestoinven.getid_bodega(),false,"Formulario");

					//Producto
					if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_productoDetalleImpuestoInven || this.detalleimpuestoinvenConstantesFunciones.event_dependid_productoDetalleImpuestoInven) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.detalleimpuestoinven.getid_producto());
									//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(detalleimpuestoinven.getProducto()!=null) {
							this.productosForeignKey.add(detalleimpuestoinven.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.detalleimpuestoinven.getid_producto(),false,"Formulario");

					//ImpuestoInven
					if(!this.detalleimpuestoinvenConstantesFunciones.cargarid_impuesto_invenDetalleImpuestoInven || this.detalleimpuestoinvenConstantesFunciones.event_dependid_impuesto_invenDetalleImpuestoInven) {
						//this.cargarCombosImpuestoInvensForeignKeyLista(" where id="+this.detalleimpuestoinven.getid_impuesto_inven());
									//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
						this.impuestoinvensForeignKey=new ArrayList<ImpuestoInven>();

						if(detalleimpuestoinven.getImpuestoInven()!=null) {
							this.impuestoinvensForeignKey.add(detalleimpuestoinven.getImpuestoInven());
						}

						this.addItemDefectoCombosForeignKeyImpuestoInven();
						this.cargarCombosFrameImpuestoInvensForeignKey("Todos");
					}
					this.setActualImpuestoInvenForeignKey(this.detalleimpuestoinven.getid_impuesto_inven(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleImpuestoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleImpuestoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleImpuestoInven(detalleimpuestoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleImpuestoInven(detalleimpuestoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleImpuestoInven(detalleimpuestoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleImpuestoInven(detalleimpuestoinven);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setText(detalleimpuestoinven.getId().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setText(detalleimpuestoinven.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setText(detalleimpuestoinven.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setText(detalleimpuestoinven.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleImpuestoInven detalleimpuestoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleimpuestoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleImpuestoInven detalleimpuestoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleimpuestoinvenLocal=this.detalleimpuestoinven;
			} else {
				detalleimpuestoinvenLocal=this.detalleimpuestoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleimpuestoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleImpuestoInven(detalleimpuestoinvenLocal,true);
					
					if(detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleimpuestoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleimpuestoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(detalleimpuestoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(detalleimpuestoinven);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(detalleimpuestoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.getText()==null || this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.getText()=="" || this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setText("0");
			}

			if(conColumnasBase) {detalleimpuestoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleImpuestoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelIdDetalleImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleimpuestoinven.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelporcentajeDetalleImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleimpuestoinven.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelvalorDetalleImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleimpuestoinven.setdescripcion(this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabeldescripcionDetalleImpuestoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinvenBean,DetalleImpuestoInven detalleimpuestoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleimpuestoinvenBean.getid_bodega()!=null && !detalleimpuestoinvenBean.getid_bodega().equals(-1L))) {detalleimpuestoinven.setid_bodega(detalleimpuestoinvenBean.getid_bodega());}
			if(conDefault || (!conDefault && detalleimpuestoinvenBean.getid_producto()!=null && !detalleimpuestoinvenBean.getid_producto().equals(-1L))) {detalleimpuestoinven.setid_producto(detalleimpuestoinvenBean.getid_producto());}
			if(conDefault || (!conDefault && detalleimpuestoinvenBean.getid_impuesto_inven()!=null && !detalleimpuestoinvenBean.getid_impuesto_inven().equals(-1L))) {detalleimpuestoinven.setid_impuesto_inven(detalleimpuestoinvenBean.getid_impuesto_inven());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinvenOrigen,DetalleImpuestoInven detalleimpuestoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getId()!=null && !detalleimpuestoinvenOrigen.getId().equals(0L))) {detalleimpuestoinven.setId(detalleimpuestoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getid_bodega()!=null && !detalleimpuestoinvenOrigen.getid_bodega().equals(-1L))) {detalleimpuestoinven.setid_bodega(detalleimpuestoinvenOrigen.getid_bodega());}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getid_producto()!=null && !detalleimpuestoinvenOrigen.getid_producto().equals(-1L))) {detalleimpuestoinven.setid_producto(detalleimpuestoinvenOrigen.getid_producto());}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getid_impuesto_inven()!=null && !detalleimpuestoinvenOrigen.getid_impuesto_inven().equals(-1L))) {detalleimpuestoinven.setid_impuesto_inven(detalleimpuestoinvenOrigen.getid_impuesto_inven());}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getporcentaje()!=null && !detalleimpuestoinvenOrigen.getporcentaje().equals(0.0))) {detalleimpuestoinven.setporcentaje(detalleimpuestoinvenOrigen.getporcentaje());}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getvalor()!=null && !detalleimpuestoinvenOrigen.getvalor().equals(0.0))) {detalleimpuestoinven.setvalor(detalleimpuestoinvenOrigen.getvalor());}
			if(conDefault || (!conDefault && detalleimpuestoinvenOrigen.getdescripcion()!=null && !detalleimpuestoinvenOrigen.getdescripcion().equals(""))) {detalleimpuestoinven.setdescripcion(detalleimpuestoinvenOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setText(detalleimpuestoinven.getId().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setText(detalleimpuestoinven.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setText(detalleimpuestoinven.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setText(detalleimpuestoinven.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleImpuestoInven(DetalleImpuestoInvenBean detalleimpuestoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setText(detalleimpuestoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setText(detalleimpuestoinvenBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setText(detalleimpuestoinvenBean.getvalor().toString());
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setText(detalleimpuestoinvenBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleImpuestoInven(DetalleImpuestoInvenParameterReturnGeneral detalleimpuestoinvenReturnGeneral,DetalleImpuestoInvenBean detalleimpuestoinvenBean,Boolean conDefault) throws Exception { 
		try {
			DetalleImpuestoInven detalleimpuestoinvenLocal=new DetalleImpuestoInven();
			
			detalleimpuestoinvenLocal=detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getId()!=null && !detalleimpuestoinvenLocal.getId().equals(0L))) {detalleimpuestoinvenBean.setId(detalleimpuestoinvenLocal.getId());}}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getid_bodega()!=null && !detalleimpuestoinvenLocal.getid_bodega().equals(-1L))) {detalleimpuestoinvenBean.setid_bodega(detalleimpuestoinvenLocal.getid_bodega());}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getid_producto()!=null && !detalleimpuestoinvenLocal.getid_producto().equals(-1L))) {detalleimpuestoinvenBean.setid_producto(detalleimpuestoinvenLocal.getid_producto());}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getid_impuesto_inven()!=null && !detalleimpuestoinvenLocal.getid_impuesto_inven().equals(-1L))) {detalleimpuestoinvenBean.setid_impuesto_inven(detalleimpuestoinvenLocal.getid_impuesto_inven());}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getporcentaje()!=null && !detalleimpuestoinvenLocal.getporcentaje().equals(0.0))) {detalleimpuestoinvenBean.setporcentaje(detalleimpuestoinvenLocal.getporcentaje());}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getvalor()!=null && !detalleimpuestoinvenLocal.getvalor().equals(0.0))) {detalleimpuestoinvenBean.setvalor(detalleimpuestoinvenLocal.getvalor());}
			if(conDefault || (!conDefault && detalleimpuestoinvenLocal.getdescripcion()!=null && !detalleimpuestoinvenLocal.getdescripcion().equals(""))) {detalleimpuestoinvenBean.setdescripcion(detalleimpuestoinvenLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleImpuestoInvenGenerico(Long idDetalleImpuestoInvenSeleccionado,JComboBox jComboBoxDetalleImpuestoInven,List<DetalleImpuestoInven> detalleimpuestoinvensLocal)throws Exception {
		try {
			DetalleImpuestoInven  detalleimpuestoinvenTemp=null;

			for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensLocal) {
				if(detalleimpuestoinvenAux.getId()!=null && detalleimpuestoinvenAux.getId().equals(idDetalleImpuestoInvenSeleccionado)) {
					detalleimpuestoinvenTemp=detalleimpuestoinvenAux;
					break;
				}
			}

			jComboBoxDetalleImpuestoInven.setSelectedItem(detalleimpuestoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleImpuestoInvenGenerico(JComboBox jComboBoxDetalleImpuestoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleImpuestoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleImpuestoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleImpuestoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleImpuestoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleImpuestoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleImpuestoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleimpuestoinven=(DetalleImpuestoInven) detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleimpuestoinven =(DetalleImpuestoInven) detalleimpuestoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleimpuestoinven.getIsNew() && !detalleimpuestoinven.getIsChanged() && !detalleimpuestoinven.getIsDeleted()) {
				sDescripcion=detalleimpuestoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleimpuestoinven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleimpuestoinven.getIsNew() && !detalleimpuestoinven.getIsChanged() && !detalleimpuestoinven.getIsDeleted()) {
				sDescripcion=detalleimpuestoinven.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleimpuestoinven.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!detalleimpuestoinven.getIsNew() && !detalleimpuestoinven.getIsChanged() && !detalleimpuestoinven.getIsDeleted()) {
				sDescripcion=detalleimpuestoinven.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleimpuestoinven.getbodega_descripcion();
			}
		}

		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!detalleimpuestoinven.getIsNew() && !detalleimpuestoinven.getIsChanged() && !detalleimpuestoinven.getIsDeleted()) {
				sDescripcion=detalleimpuestoinven.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=detalleimpuestoinven.getproducto_descripcion();
			}
		}

		if(sTipo.equals("ImpuestoInven")) {
			//sDescripcion=this.getActualImpuestoInvenForeignKeyDescripcion((Long)value);
			if(!detalleimpuestoinven.getIsNew() && !detalleimpuestoinven.getIsChanged() && !detalleimpuestoinven.getIsDeleted()) {
				sDescripcion=detalleimpuestoinven.getimpuestoinven_descripcion();
			} else {
				//sDescripcion=this.getActualImpuestoInvenForeignKeyDescripcion((Long)value);
				sDescripcion=detalleimpuestoinven.getimpuestoinven_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleImpuestoInven detalleimpuestoinvenRow=new DetalleImpuestoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleimpuestoinvenRow=(DetalleImpuestoInven) detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleimpuestoinvenRow=(DetalleImpuestoInven) detalleimpuestoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleImpuestoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));			
			this.jButtonDuplicarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleImpuestoInven && this.isPermisoDuplicarDetalleImpuestoInven));			
			this.jButtonCopiarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleImpuestoInven && this.isPermisoCopiarDetalleImpuestoInven));
			this.jButtonVerFormDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleImpuestoInven && this.isPermisoVerFormDetalleImpuestoInven));
			
			this.jButtonAbrirOrderByDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));			
			
			this.jButtonNuevoRelacionesDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));			
			this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaModificarDetalleImpuestoInven && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleImpuestoInven && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleImpuestoInven && this.isPermisoEliminarDetalleImpuestoInven));
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleImpuestoInven);							
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));						
			this.jButtonDuplicarToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleImpuestoInven && this.isPermisoDuplicarDetalleImpuestoInven));						
			this.jButtonCopiarToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleImpuestoInven && this.isPermisoCopiarDetalleImpuestoInven));			
			this.jButtonVerFormToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleImpuestoInven && this.isPermisoVerFormDetalleImpuestoInven));			
			this.jButtonAbrirOrderByToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));
			this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));			
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaModificarDetalleImpuestoInven && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleImpuestoInven  && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleImpuestoInven && this.isPermisoEliminarDetalleImpuestoInven));
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarToolBarDetalleImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleImpuestoInven);				
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));			
			this.jMenuItemDuplicarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaDuplicarDetalleImpuestoInven && this.isPermisoDuplicarDetalleImpuestoInven));			
			this.jMenuItemCopiarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaCopiarDetalleImpuestoInven && this.isPermisoCopiarDetalleImpuestoInven));			
			this.jMenuItemVerFormDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaVerFormDetalleImpuestoInven && this.isPermisoVerFormDetalleImpuestoInven));			
			this.jMenuItemAbrirOrderByDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));			
			//this.jMenuItemMostrarOcultarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));
			this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));			
			//this.jMenuItemDetalleMostrarOcultarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaOrdenDetalleImpuestoInven && this.isPermisoOrdenDetalleImpuestoInven));			
			this.jMenuItemNuevoRelacionesDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven));			
			this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaNuevoDetalleImpuestoInven && this.isPermisoNuevoDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));									
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemModificarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaModificarDetalleImpuestoInven && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemActualizarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaActualizarDetalleImpuestoInven && this.isPermisoActualizarDetalleImpuestoInven));	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemEliminarDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaEliminarDetalleImpuestoInven && this.isPermisoEliminarDetalleImpuestoInven));
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemCancelarDetalleImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleImpuestoInven);				
			}
			
			this.jMenuItemGuardarCambiosDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));						
			this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=this.jButtonNuevoDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleImpuestoInven=this.jButtonDuplicarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaCopiarDetalleImpuestoInven=this.jButtonCopiarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaVerFormDetalleImpuestoInven=this.jButtonVerFormDetalleImpuestoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleImpuestoInven=this.jButtonAbrirOrderByDetalleImpuestoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=this.jButtonNuevoRelacionesDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=this.jButtonModificarDetalleImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=this.jButtonGuardarCambiosTablaDetalleImpuestoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=this.jButtonNuevoToolBarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarToolBarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarToolBarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarToolBarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarToolBarDetalleImpuestoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleImpuestoInven=this.jButtonGuardarCambiosToolBarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=this.jMenuItemNuevoDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=this.jMenuItemNuevoRelacionesDetalleImpuestoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemModificarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemActualizarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemEliminarDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemCancelarDetalleImpuestoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleImpuestoInven=this.jMenuItemGuardarCambiosDetalleImpuestoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleImpuestoInven(Boolean esInicializar) {
		if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleImpuestoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleImpuestoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleImpuestoInven() {
		this.jButtonNuevoDetalleImpuestoInven.setVisible(this.isPermisoNuevoDetalleImpuestoInven);			
		this.jButtonDuplicarDetalleImpuestoInven.setVisible(this.isPermisoDuplicarDetalleImpuestoInven);			
		this.jButtonCopiarDetalleImpuestoInven.setVisible(this.isPermisoCopiarDetalleImpuestoInven);			
		this.jButtonVerFormDetalleImpuestoInven.setVisible(this.isPermisoVerFormDetalleImpuestoInven);			
		
		this.jButtonAbrirOrderByDetalleImpuestoInven.setVisible(this.isPermisoOrdenDetalleImpuestoInven);					
		
		this.jButtonNuevoRelacionesDetalleImpuestoInven.setVisible(this.isPermisoNuevoDetalleImpuestoInven);			
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarDetalleImpuestoInven.setVisible(this.isPermisoActualizarDetalleImpuestoInven);	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.setVisible(this.isPermisoActualizarDetalleImpuestoInven);	
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.setVisible(this.isPermisoEliminarDetalleImpuestoInven);
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleImpuestoInven);						
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.setVisible(this.isPermisoGuardarCambiosDetalleImpuestoInven);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.setVisible(this.isPermisoActualizarDetalleImpuestoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleImpuestoInven() {
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarDetalleImpuestoInven.setVisible(this.isPermisoActualizarDetalleImpuestoInven);	
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.setVisible(this.isPermisoActualizarDetalleImpuestoInven);	
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.setVisible(this.isPermisoEliminarDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.setVisible(this.isVisibilidadCeldaCancelarDetalleImpuestoInven);							
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.setVisible((this.isVisibilidadCeldaGuardarDetalleImpuestoInven && this.isPermisoGuardarCambiosDetalleImpuestoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleImpuestoInven() {
		if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleImpuestoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleImpuestoInven() {
	}
	
	public void jTableDatosDetalleImpuestoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleImpuestoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleimpuestoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleimpuestoinvenLogic.getConnexion());

				if(this.detalleimpuestoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleimpuestoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleimpuestoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleimpuestoinvenLogic.getConnexion());

				if(this.detalleimpuestoinven.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleimpuestoinven.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleimpuestoinven.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaDetalleImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.detalleimpuestoinvenLogic.getConnexion());

				if(this.detalleimpuestoinven.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.detalleimpuestoinven.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.detalleimpuestoinven.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoDetalleImpuestoInvenActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.productoBeanSwingJInternalFrame.sTipoBusqueda="Producto";

			if(!this.sFinalQueryGeneral_producto.equals("")) {
				this.productoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_producto);
				this.productoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.productoBeanSwingJInternalFrame.procesarBusqueda(this.productoBeanSwingJInternalFrame.sAccionBusqueda);
				this.productoBeanSwingJInternalFrame.inicializarActualizarBindingProducto(false);
			}

			if(!this.sFinalQueryComboProducto.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderDetalleImpuestoInven=null;
			TitledBorder titledBorderproducto=null;

			if(!this.jScrollPanelDatosDetalleImpuestoInven.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Producto");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_productoDetalleImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.detalleimpuestoinvenLogic.getConnexion());

				if(this.detalleimpuestoinven.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.detalleimpuestoinven.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.detalleimpuestoinven.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_impuesto_invenDetalleImpuestoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoimpuestoinven=true;

			idTienePermisoimpuestoinven=this.tienePermisosUsuarioEnPaginaWebDetalleImpuestoInven(ImpuestoInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisoimpuestoinven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleImpuestoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleImpuestoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);

				this.impuestoinvenBeanSwingJInternalFrame=new ImpuestoInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.impuestoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.impuestoinvenBeanSwingJInternalFrame.getImpuestoInvenLogic().setConnexion(this.detalleimpuestoinvenLogic.getConnexion());

				if(this.detalleimpuestoinven.getid_impuesto_inven()!=null) {
					this.impuestoinvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.impuestoinvenBeanSwingJInternalFrame.setIdActual(this.detalleimpuestoinven.getid_impuesto_inven());
					this.impuestoinvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.impuestoinvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.impuestoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaImpuestoInven();
				}

				JInternalFrameBase jinternalFrame =this.impuestoinvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleImpuestoInven=(TitledBorder)this.jScrollPanelDatosDetalleImpuestoInven.getBorder();
				TitledBorder titledBorderimpuestoinven=(TitledBorder)this.impuestoinvenBeanSwingJInternalFrame.jScrollPanelDatosImpuestoInven.getBorder();

				titledBorderimpuestoinven.setTitle(titledBorderDetalleImpuestoInven.getTitle() + " -> Impuesto Inven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_impuesto_invenDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getid_impuesto_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_impuesto_inven = "+this.detalleimpuestoinven.getid_impuesto_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.detalleimpuestoinven.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.detalleimpuestoinven.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionDetalleImpuestoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.getdetalleimpuestoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleimpuestoinven==null) {
						this.detalleimpuestoinven = new DetalleImpuestoInven();
					}

					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);
				}

				if(this.detalleimpuestoinven.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.detalleimpuestoinven.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleImpuestoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);

			this.getDetalleImpuestoInvensFK_IdBodega();

			this.inicializarActualizarBindingDetalleImpuestoInven(false);

			//if(DetalleImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);

			this.getDetalleImpuestoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleImpuestoInven(false);

			//if(DetalleImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdImpuestoInvenDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);

			this.getDetalleImpuestoInvensFK_IdImpuestoInven();

			this.inicializarActualizarBindingDetalleImpuestoInven(false);

			//if(DetalleImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);

			this.getDetalleImpuestoInvensFK_IdProducto();

			this.inicializarActualizarBindingDetalleImpuestoInven(false);

			//if(DetalleImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleImpuestoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);

			this.getDetalleImpuestoInvensFK_IdSucursal();

			this.inicializarActualizarBindingDetalleImpuestoInven(false);

			//if(DetalleImpuestoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleimpuestoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleImpuestoInven() {
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.dispose();
			this.jInternalFrameDetalleFormDetalleImpuestoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
			this.jInternalFrameReporteDinamicoDetalleImpuestoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleImpuestoInven.dispose();
			this.jInternalFrameReporteDinamicoDetalleImpuestoInven=null;
		}
		
		if(this.jInternalFrameImportacionDetalleImpuestoInven!=null) {
			this.jInternalFrameImportacionDetalleImpuestoInven.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleImpuestoInven.dispose();
			this.jInternalFrameImportacionDetalleImpuestoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleImpuestoInven();
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleImpuestoInven")) {
				jButtonDuplicarDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleImpuestoInven")) {
				jButtonCopiarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleImpuestoInven")) {
				jButtonVerFormDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleImpuestoInven")) {
				jButtonDuplicarDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleImpuestoInven")) {
				jButtonDuplicarDetalleImpuestoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleImpuestoInven")) {
				jButtonModificarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleImpuestoInven")) {
				jButtonModificarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleImpuestoInven")) {
				jButtonModificarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleImpuestoInven")) {
				jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleImpuestoInven")) {
				jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleImpuestoInven")) {
				jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleImpuestoInven")) {
				jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleImpuestoInven")) {
				jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleImpuestoInven")) {
				jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleImpuestoInven")) {
				jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleImpuestoInven")) {
				jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleImpuestoInven")) {
				jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleImpuestoInven")) {
				jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleImpuestoInven")) {
				jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleImpuestoInven")) {
				jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleImpuestoInven")) {
				jButtonMostrarOcultarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleImpuestoInven")) {
				jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleImpuestoInven")) {
				jButtonCopiarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleImpuestoInven")) {
				jButtonVerFormDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleImpuestoInven")) {
				jButtonCopiarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleImpuestoInven")) {
				jButtonVerFormDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleImpuestoInven")) {
				jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleImpuestoInven")) {
				jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleImpuestoInven")) {
				jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleImpuestoInven")) {
				jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleImpuestoInven")) {
				jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleImpuestoInven")) {
				jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleImpuestoInven")) {
				jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleImpuestoInven")) {
				jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleImpuestoInven")) {
				jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleImpuestoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleImpuestoInven")) {
				jButtonAbrirOrderByDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleImpuestoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleImpuestoInven")) {
				jButtonMostrarOcultarDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleImpuestoInven")) {
				jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleImpuestoInven")) {
				jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleImpuestoInven")) {
				jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleImpuestoInven")) {
				jButtonCerrarReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleImpuestoInven")) {
				jButtonGenerarReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleImpuestoInven")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleImpuestoInven")) {
				jButtonCerrarImportacionDetalleImpuestoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleImpuestoInven")) {
				
				jButtonGenerarImportacionDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleImpuestoInven")) {
				
				jButtonAbrirImportacionDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleImpuestoInven")) {
				jComboBoxTiposAccionesDetalleImpuestoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleImpuestoInven")) {
				jComboBoxTiposRelacionesDetalleImpuestoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleImpuestoInven")) {
				jComboBoxTiposAccionesDetalleImpuestoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleImpuestoInven")) {
				
				jComboBoxTiposSeleccionarDetalleImpuestoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleImpuestoInven")) {
				jTextFieldValorCampoGeneralDetalleImpuestoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleImpuestoInven")) {
				jButtonAbrirOrderByDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleImpuestoInven")) {
				jButtonAbrirOrderByDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleImpuestoInven")) {
				jButtonCerrarOrderByDetalleImpuestoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleImpuestoInvenBusqueda")) {
				this.jButtonidDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleImpuestoInvenUpdate")) {
				this.jButtonid_empresaDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_empresaDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleImpuestoInvenUpdate")) {
				this.jButtonid_sucursalDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_sucursalDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleImpuestoInvenUpdate")) {
				this.jButtonid_bodegaDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_bodegaDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInven")) {
				this.jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInvenUpdate")) {
				this.jButtonid_productoDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_productoDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_impuesto_invenDetalleImpuestoInvenUpdate")) {
				this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_impuesto_invenDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_impuesto_invenDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDetalleImpuestoInvenBusqueda")) {
				this.jButtonporcentajeDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleImpuestoInvenBusqueda")) {
				this.jButtonvalorDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleImpuestoInvenBusqueda")) {
				this.jButtondescripcionDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_productoDetalleImpuestoInven")) {
				this.jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaDetalleImpuestoInven")) {
				this.jButtonFK_IdBodegaDetalleImpuestoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdImpuestoInvenDetalleImpuestoInven")) {
				this.jButtonFK_IdImpuestoInvenDetalleImpuestoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProductoDetalleImpuestoInven")) {
				this.jButtonFK_IdProductoDetalleImpuestoInvenActionPerformed(evt);
			}
			
			;
			
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleImpuestoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleImpuestoInven detalleimpuestoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleimpuestoinvenLocal=this.detalleimpuestoinven;
			} else {
				detalleimpuestoinvenLocal=this.detalleimpuestoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
							
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
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
			
			


			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
								
						
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
								
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
							
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
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
			
			


			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
								
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleImpuestoInven")) {
					jCheckBoxSeleccionarTodosDetalleImpuestoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleImpuestoInven")) {
					jCheckBoxSeleccionadosDetalleImpuestoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleImpuestoInven")) {
					
				}
				
				


				
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
												
				
				


				
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
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
			
			


			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleimpuestoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleimpuestoinven);
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
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
				
				


				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleImpuestoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleImpuestoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleImpuestoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleimpuestoinvenAnterior =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleImpuestoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleImpuestoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleImpuestoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleimpuestoinven =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleimpuestoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleImpuestoInven")) {
				
				}
				
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleImpuestoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleImpuestoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleImpuestoInven")) {
			
			}
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleImpuestoInven();
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleImpuestoInven")) {
				jButtonDuplicarDetalleImpuestoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleImpuestoInven")) {
				jButtonCopiarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleImpuestoInven")) {
				jButtonVerFormDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleImpuestoInven")) {
				jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleImpuestoInven")) {
				jButtonModificarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleImpuestoInven")) {
				jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleImpuestoInven")) {
				jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleImpuestoInven")) {
				jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleImpuestoInven")) {
				jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleImpuestoInven")) {
				jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleImpuestoInven")) {
				jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleImpuestoInven")) {
				jButtonAbrirOrderByDetalleImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleImpuestoInven")) {
				jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleImpuestoInven")) {
				jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleImpuestoInven")) {
				jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleImpuestoInvenBusqueda")) {
				this.jButtonidDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleImpuestoInvenUpdate")) {
				this.jButtonid_empresaDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_empresaDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleImpuestoInvenUpdate")) {
				this.jButtonid_sucursalDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_sucursalDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaDetalleImpuestoInvenUpdate")) {
				this.jButtonid_bodegaDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_bodegaDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInven")) {
				this.jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInvenUpdate")) {
				this.jButtonid_productoDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_productoDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_impuesto_invenDetalleImpuestoInvenUpdate")) {
				this.jButtonid_impuesto_invenDetalleImpuestoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_impuesto_invenDetalleImpuestoInvenBusqueda")) {
				this.jButtonid_impuesto_invenDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeDetalleImpuestoInvenBusqueda")) {
				this.jButtonporcentajeDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorDetalleImpuestoInvenBusqueda")) {
				this.jButtonvalorDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionDetalleImpuestoInvenBusqueda")) {
				this.jButtondescripcionDetalleImpuestoInvenBusquedaActionPerformed(evt);
			}
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleImpuestoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleImpuestoInven")) {
				closingInternalFrameDetalleImpuestoInven();
				
			} else if(sTipo.equals("jButtonCancelarDetalleImpuestoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleImpuestoInven = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleImpuestoInvenBeanSwingJInternalFrame jInternalFrameParent=(DetalleImpuestoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleImpuestoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleImpuestoInvenActionPerformed(null);
			}
			
			DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleimpuestoinven,new Object(),this.detalleimpuestoinvenParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleImpuestoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleImpuestoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleImpuestoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleimpuestoinven)) {
			if(!esControlTabla) {
				if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);			
				}
				
				if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.procesarEventosDetalleImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this.detalleimpuestoinven,this.detalleimpuestoinvenParameterGeneral,this.isEsNuevoDetalleImpuestoInven,classes);//this.detalleimpuestoinvenLogic.getDetalleImpuestoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral,this.detalleimpuestoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleImpuestoInven(classes,this.detalleimpuestoinvenReturnGeneral,this.detalleimpuestoinvenBean,false);
					}
						
					if(this.detalleimpuestoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven());	
					}
						
					if(this.detalleimpuestoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven(),classes);//this.detalleimpuestoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleImpuestoInven(this.detalleimpuestoinven,classes);//this.detalleimpuestoinvenBean);									
				}
			
				if(DetalleImpuestoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleImpuestoInven(this.detalleimpuestoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleImpuestoInven(this.detalleimpuestoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleimpuestoinvenAnterior!=null) {
						this.detalleimpuestoinven=this.detalleimpuestoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.procesarEventosDetalleImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this.detalleimpuestoinven,this.detalleimpuestoinvenParameterGeneral,this.isEsNuevoDetalleImpuestoInven,classes);//this.detalleimpuestoinvenLogic.getDetalleImpuestoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleimpuestoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven(),detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven(),this.detalleimpuestoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleImpuestoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleImpuestoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleImpuestoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleImpuestoInven() throws Exception {
		
		DetalleImpuestoInvenModel detalleimpuestoinvenModel=(DetalleImpuestoInvenModel)this.jTableDatosDetalleImpuestoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleimpuestoinvenModel.detalleimpuestoinvens=this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleimpuestoinvenModel.detalleimpuestoinvens=this.detalleimpuestoinvens;
		}
		
		
		((DetalleImpuestoInvenModel) this.jTableDatosDetalleImpuestoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleImpuestoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleimpuestoinvenAnterior(),this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleimpuestoinvenAnterior(),this.detalleimpuestoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleImpuestoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
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
										
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleimpuestoinven,new Object(),generalEntityParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleImpuestoInvenConstantesFunciones.getClassesRelationshipsOfDetalleImpuestoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleImpuestoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleImpuestoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleImpuestoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleimpuestoinven,new Object(),generalEntityParameterGeneral,this.detalleimpuestoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleImpuestoInven(DetalleImpuestoInvenBean detalleimpuestoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleImpuestoInven(ArrayList<Classe> classes,DetalleImpuestoInvenReturnGeneral detalleimpuestoinvenReturnGeneral,DetalleImpuestoInvenBean detalleimpuestoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleimpuestoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven = new DetalleImpuestoInvenDetalleFormJInternalFrame(jDesktopPane,this.detalleimpuestoinvenSessionBean.getConGuardarRelaciones(),this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.setVisible(false);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.detalleimpuestoinvenLogic=this.detalleimpuestoinvenLogic;
		
		this.cargarCombosFrameForeignKeyDetalleImpuestoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleImpuestoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleImpuestoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleImpuestoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleImpuestoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleImpuestoInven"));
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarDetalleImpuestoInven"));

		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleImpuestoInven"));
					
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemModificarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"ActualizarDetalleImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleImpuestoInven"));
						
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemActualizarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarDetalleImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleImpuestoInven"));
								
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemEliminarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarDetalleImpuestoInven"));
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleImpuestoInven"));
					
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemCancelarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleImpuestoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemDetalleCerrarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleImpuestoInven"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleImpuestoInven"));
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleImpuestoInven"));
		
		
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleImpuestoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonidDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenBusqueda"));
		//jButtonid_productoDetalleImpuestoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInven"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonporcentajeDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonvalorDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtondescripcionDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleImpuestoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleImpuestoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleImpuestoInven"));
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleImpuestoInven"));
		}
		
		this.jTableDatosDetalleImpuestoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleImpuestoInven"));
		
		this.jTableDatosDetalleImpuestoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleImpuestoInven"));
		
		this.jButtonNuevoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoDetalleImpuestoInven"));
		
		this.jButtonDuplicarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"DuplicarDetalleImpuestoInven"));
		
		this.jButtonCopiarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"CopiarDetalleImpuestoInven"));
		
		this.jButtonVerFormDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"VerFormDetalleImpuestoInven"));
		
		
		this.jButtonNuevoToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleImpuestoInven"));
			
		this.jButtonDuplicarToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleImpuestoInven"));
			
		this.jMenuItemNuevoDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleImpuestoInven"));
			
		this.jMenuItemDuplicarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleImpuestoInven"));		
		
		
		this.jButtonNuevoRelacionesDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleImpuestoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleImpuestoInven"));
			
		this.jMenuItemNuevoRelacionesDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleImpuestoInven"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarDetalleImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonModificarToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleImpuestoInven"));
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemModificarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"ActualizarDetalleImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonActualizarToolBarDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleImpuestoInven"));
				
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemActualizarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarDetalleImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonEliminarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleImpuestoInven"));
						
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemEliminarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarDetalleImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonCancelarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleImpuestoInven"));
			
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemCancelarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleImpuestoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleImpuestoInven"));		
		
		
		this.jButtonCerrarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarDetalleImpuestoInven"));
		
		
		this.jButtonCerrarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleImpuestoInven"));
			
		this.jMenuItemCerrarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleImpuestoInven"));
			
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jMenuItemDetalleCerrarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleImpuestoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleImpuestoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleImpuestoInven"));
		}
		
		this.jButtonCopiarToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleImpuestoInven"));
			
		this.jButtonVerFormToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleImpuestoInven"));
		
		this.jMenuItemGuardarCambiosDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleImpuestoInven"));
			
		this.jMenuItemCopiarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleImpuestoInven"));		
		
		this.jMenuItemVerFormDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleImpuestoInven"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleImpuestoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleImpuestoInven"));
			
		this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleImpuestoInven"));		
		
		
		
		this.jButtonRecargarInformacionDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleImpuestoInven"));
					
		this.jButtonRecargarInformacionToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleImpuestoInven"));
		
		this.jMenuItemRecargarInformacionDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleImpuestoInven"));		
		
		
		
		this.jButtonAnterioresDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"AnterioresDetalleImpuestoInven"));
		
		
		this.jButtonAnterioresToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleImpuestoInven"));
		
		this.jMenuItemAnterioresDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleImpuestoInven"));		
		
		
		this.jButtonSiguientesDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"SiguientesDetalleImpuestoInven"));
		
		
		this.jButtonSiguientesToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleImpuestoInven"));
			
		this.jMenuItemSiguientesDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleImpuestoInven"));
			
		this.jMenuItemAbrirOrderByDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleImpuestoInven"));
			
		this.jMenuItemMostrarOcultarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleImpuestoInven"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleImpuestoInven"));
			
		this.jMenuItemDetalleMostarOcultarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleImpuestoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleImpuestoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleImpuestoInven"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleImpuestoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleImpuestoInven"));

		this.jCheckBoxSeleccionadosDetalleImpuestoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleImpuestoInven"));
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleImpuestoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleImpuestoInven"));
			
		this.jComboBoxTiposAccionesDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleImpuestoInven"));
					
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleImpuestoInven"));
			
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleImpuestoInven"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonidDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenBusqueda"));
		//jButtonid_productoDetalleImpuestoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInven"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonporcentajeDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonvalorDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtondescripcionDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleImpuestoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleImpuestoInven"));

			this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdImpuestoInvenDetalleImpuestoInven"));

			this.jButtonFK_IdProductoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleImpuestoInven"));

			this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleImpuestoInven!=null) {
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleImpuestoInven"));
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleImpuestoInven"));
				this.jInternalFrameReporteDinamicoDetalleImpuestoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleImpuestoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleImpuestoInven"));				
			//this.jButtonGenerarReporteDinamicoDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleImpuestoInven"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleImpuestoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleImpuestoInven!=null) {
				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleImpuestoInven"));
				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleImpuestoInven"));
				this.jInternalFrameImportacionDetalleImpuestoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleImpuestoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleImpuestoInven"));
			
			this.jButtonAbrirOrderByToolBarDetalleImpuestoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleImpuestoInven"));			
			
			if(this.jInternalFrameOrderByDetalleImpuestoInven!=null) {
				this.jInternalFrameOrderByDetalleImpuestoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleImpuestoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jTabbedPaneRelacionesDetalleImpuestoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleImpuestoInven"));
		
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
            		closingInternalFrameDetalleImpuestoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleImpuestoInven = (JInternalFrameBase)event.getSource();
	            	
	            DetalleImpuestoInvenBeanSwingJInternalFrame jInternalFrameParent=(DetalleImpuestoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleImpuestoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleImpuestoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleImpuestoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleImpuestoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleImpuestoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleImpuestoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleImpuestoInven";
		inputMap = this.jButtonNuevoDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleImpuestoInven";
		inputMap = this.jButtonNuevoRelacionesDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleImpuestoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleImpuestoInven";
		inputMap = this.jButtonModificarDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleImpuestoInven";
		inputMap = this.jButtonActualizarDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleImpuestoInven";
		inputMap = this.jButtonEliminarDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleImpuestoInven";
		inputMap = this.jButtonCancelarDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleImpuestoInven";
		inputMap = this.jButtonCerrarDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleImpuestoInven";
		inputMap = this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonGuardarCambiosDetalleImpuestoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleImpuestoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleImpuestoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleImpuestoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleImpuestoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonidDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_empresaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_sucursalDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_bodegaDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaDetalleImpuestoInvenBusqueda"));
		//jButtonid_productoDetalleImpuestoInven.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_productoDetalleImpuestoInvenActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInven"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_impuesto_invenDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_impuesto_invenDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonporcentajeDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonvalorDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorDetalleImpuestoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtondescripcionDetalleImpuestoInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionDetalleImpuestoInvenBusqueda"));
		
		
		this.jButtonFK_IdBodegaDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdBodegaDetalleImpuestoInven"));

		this.jButtonFK_IdImpuestoInvenDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdImpuestoInvenDetalleImpuestoInven"));

		this.jButtonFK_IdProductoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"FK_IdProductoDetalleImpuestoInven"));

		this.jButtonBuscarFK_IdProductoid_productoDetalleImpuestoInven.addActionListener(new ButtonActionListener(this,"id_productoDetalleImpuestoInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleImpuestoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleImpuestoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleImpuestoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleImpuestoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleImpuestoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
					detalleimpuestoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvens) {
					detalleimpuestoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleImpuestoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
						detalleimpuestoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvens) {
						detalleimpuestoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleImpuestoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleImpuestoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleImpuestoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleImpuestoInven.getSelectedRows();
			
			DetalleImpuestoInven detalleimpuestoinvenLocal=new DetalleImpuestoInven();
			
			//this.seleccionarTodosDetalleImpuestoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleimpuestoinvenLocal =(DetalleImpuestoInven) this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens().toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleimpuestoinvenLocal =(DetalleImpuestoInven) this.detalleimpuestoinvens.toArray()[this.jTableDatosDetalleImpuestoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleimpuestoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
						detalleimpuestoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvens) {
						detalleimpuestoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleImpuestoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleImpuestoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleImpuestoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleImpuestoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleImpuestoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleImpuestoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleImpuestoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
				
						if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							detalleimpuestoinvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleimpuestoinvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleimpuestoinvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvens) {
					
						if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							detalleimpuestoinvenAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							detalleimpuestoinvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							detalleimpuestoinvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleImpuestoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleImpuestoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleImpuestoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleImpuestoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleImpuestoInven(conSplash);
				
					this.generarReporteDetalleImpuestoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleImpuestoInvensSeleccionados();
				//this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleImpuestoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleImpuestoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleImpuestoInven();
				
				this.exportarDetalleImpuestoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleImpuestoInvens();
				//this.importarDetalleImpuestoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleImpuestoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleImpuestoInvensSeleccionados();
				//this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleImpuestoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleImpuestoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleImpuestoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleImpuestoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleImpuestoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleImpuestoInven(conSplash);
					
						//this.actualizarParametrosGeneralDetalleImpuestoInven();
						
						this.generarReporteProcesoAccionDetalleImpuestoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Impuesto InvenES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Impuesto Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleImpuestoInven();
				
						this.actualizarParametrosGeneralDetalleImpuestoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleimpuestoinvenReturnGeneral=detalleimpuestoinvenLogic.procesarAccionDetalleImpuestoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens(),this.detalleimpuestoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleImpuestoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleImpuestoInven();
					
					DetalleImpuestoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleImpuestoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleImpuestoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxTiposAccionesFormularioDetalleImpuestoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleImpuestoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleImpuestoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleImpuestoInven();
			
			if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
			DetalleImpuestoInven detalleimpuestoinven=new DetalleImpuestoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleImpuestoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleImpuestoInven.getSelectedItem();
			
			
			
			
			detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleimpuestoinvensSeleccionados.size()==1) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
					detalleimpuestoinven=detalleimpuestoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleImpuestoInven();
			
      		//this.finishProcessDetalleImpuestoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleImpuestoInvenReturnGeneral() throws Exception {
		if(this.detalleimpuestoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleimpuestoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleimpuestoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleimpuestoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleimpuestoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleimpuestoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
		}
		
		if(this.detalleimpuestoinvenReturnGeneral.getConRetornoLista() || this.detalleimpuestoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleimpuestoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleimpuestoinvenLogic.setDetalleImpuestoInvens(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleimpuestoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleimpuestoinvenLogic.setDetalleImpuestoInven(this.detalleimpuestoinvenReturnGeneral.getDetalleImpuestoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleImpuestoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleImpuestoInven() throws Exception {
		
		
	}
	
	public ArrayList<DetalleImpuestoInven> getDetalleImpuestoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleImpuestoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvenLogic.getDetalleImpuestoInvens()) {
					if(detalleimpuestoinvenAux.getIsSelected()) {
						detalleimpuestoinvensSeleccionados.add(detalleimpuestoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleImpuestoInven detalleimpuestoinvenAux:this.detalleimpuestoinvens) {
					if(detalleimpuestoinvenAux.getIsSelected()) {
						detalleimpuestoinvensSeleccionados.add(detalleimpuestoinvenAux);				
					}
				}
			}
			
			if(detalleimpuestoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleimpuestoinvensSeleccionados.addAll(this.detalleimpuestoinvenLogic.getDetalleImpuestoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleimpuestoinvensSeleccionados.addAll(this.detalleimpuestoinvens);				
					}
				}
			}
		} else {
			detalleimpuestoinvensSeleccionados.add(this.detalleimpuestoinven);
		}
		
		return detalleimpuestoinvensSeleccionados;
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
	
	public void generarReporteDetalleImpuestoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleImpuestoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleImpuestoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleImpuestoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleImpuestoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Impuesto Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleImpuestoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleImpuestoInven();
		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleImpuestoInven();
		
		
		//this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados ,detalleimpuestoinvenImplementable,detalleimpuestoinvenImplementableHome);
	}
	
	public void mostrarImportacionDetalleImpuestoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleImpuestoInven();
		
		this.abrirFrameImportacionDetalleImpuestoInven();		
		
			
		//this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados ,detalleimpuestoinvenImplementable,detalleimpuestoinvenImplementableHome);
	}
	
	public void importarDetalleImpuestoInvens() throws Exception {		
	
	}
	
	public void exportarDetalleImpuestoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleImpuestoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleImpuestoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleImpuestoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Impuesto Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleImpuestoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleImpuestoInven(detalleimpuestoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleimpuestoinvenAux.setsDetalleGeneralEntityReporte(detalleimpuestoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleImpuestoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleimpuestoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getimpuestoinven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleimpuestoinven.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleImpuestoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleImpuestoInven(row);				
				iRow++;
			}				
			
			for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleImpuestoInven(detalleimpuestoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleImpuestoInvensSeleccionados() throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();		
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleimpuestoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleimpuestoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleimpuestoinven");
			//elementRoot.appendChild(element);
		
			for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
				element = document.createElement("detalleimpuestoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleImpuestoInven(detalleimpuestoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Impuesto Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleImpuestoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getimpuestoinven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleimpuestoinven.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlDetalleImpuestoInven(DetalleImpuestoInven detalleimpuestoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleImpuestoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleimpuestoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleImpuestoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleimpuestoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleimpuestoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleimpuestoinven.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(detalleimpuestoinven.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementproducto_descripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(detalleimpuestoinven.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementimpuestoinven_descripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.IDIMPUESTOINVEN);
		elementimpuestoinven_descripcion.appendChild(document.createTextNode(detalleimpuestoinven.getimpuestoinven_descripcion()));
		element.appendChild(elementimpuestoinven_descripcion);

		Element elementporcentaje = document.createElement(DetalleImpuestoInvenConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(detalleimpuestoinven.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(DetalleImpuestoInvenConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(detalleimpuestoinven.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(DetalleImpuestoInvenConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(detalleimpuestoinven.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoDetalleImpuestoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados=new ArrayList<DetalleImpuestoInven>();
		
		detalleimpuestoinvensSeleccionados=this.getDetalleImpuestoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleImpuestoInven(detalleimpuestoinvensSeleccionados);
		
		this.generarReporteDetalleImpuestoInvens("Todos",detalleimpuestoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleImpuestoInven(ArrayList<DetalleImpuestoInven> detalleimpuestoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleImpuestoInven detalleimpuestoinvenAux:detalleimpuestoinvensSeleccionados) {
				detalleimpuestoinvenAux.setsDetalleGeneralEntityReporte(detalleimpuestoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_IDIMPUESTOINVEN)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getimpuestoinven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleImpuestoInvenConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					detalleimpuestoinvenAux.setsDescripcionGeneralEntityReporte1(detalleimpuestoinvenAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleImpuestoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleImpuestoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleImpuestoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=true;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
			this.isVisibilidadCeldaModificarDetalleImpuestoInven=true;
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaCancelarDetalleImpuestoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleImpuestoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleImpuestoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=true;
		} else {
			this.actualizarEstadoPanelsDetalleImpuestoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleImpuestoInven=false;
			//this.isVisibilidadCeldaVerFormDetalleImpuestoInven=false;
			this.isVisibilidadCeldaDuplicarDetalleImpuestoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleImpuestoInven=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleImpuestoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!detalleimpuestoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;												
			}
			
			this.jButtonCerrarDetalleImpuestoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleImpuestoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleimpuestoinven)) {
			this.isVisibilidadCeldaActualizarDetalleImpuestoInven=false;
			this.isVisibilidadCeldaEliminarDetalleImpuestoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleImpuestoInven() {
	}
	
	public void actualizarEstadoPanelsDetalleImpuestoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosEdicionDetalleImpuestoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleImpuestoInven!=null) {
				this.jScrollPanelDatosDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleImpuestoInven!=null) {
				this.jPanelPaginacionDetalleImpuestoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
					this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleimpuestoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleImpuestoInven!=null) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleImpuestoInven!=null) {
				this.jPanelParametrosReportesDetalleImpuestoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdBodegaDetalleImpuestoInven);}

			this.isVisibilidadFK_IdImpuestoInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdImpuestoInvenDetalleImpuestoInven);}

			this.isVisibilidadFK_IdProducto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdProductoDetalleImpuestoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdBodegaDetalleImpuestoInven);}

			this.isVisibilidadFK_IdImpuestoInven=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdImpuestoInvenDetalleImpuestoInven);}

			this.isVisibilidadFK_IdProducto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdProductoDetalleImpuestoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdBodegaDetalleImpuestoInven);}

			this.isVisibilidadFK_IdImpuestoInven=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdImpuestoInvenDetalleImpuestoInven);}

			this.isVisibilidadFK_IdProducto=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdProductoDetalleImpuestoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadFK_IdBodega=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdBodegaDetalleImpuestoInven);}

			this.isVisibilidadFK_IdImpuestoInven=isParaProductoNegation;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdImpuestoInvenDetalleImpuestoInven);}

			this.isVisibilidadFK_IdProducto=isParaProducto;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdProductoDetalleImpuestoInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaImpuestoInven(Boolean isParaImpuestoInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaImpuestoInvenNegation=!isParaImpuestoInven;

			this.isVisibilidadFK_IdBodega=isParaImpuestoInvenNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdBodegaDetalleImpuestoInven);}

			this.isVisibilidadFK_IdImpuestoInven=isParaImpuestoInven;
			if(!this.isVisibilidadFK_IdImpuestoInven) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdImpuestoInvenDetalleImpuestoInven);}

			this.isVisibilidadFK_IdProducto=isParaImpuestoInvenNegation;
			if(!this.isVisibilidadFK_IdProducto) {this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(jPanelFK_IdProductoDetalleImpuestoInven);}
		}
		
	}
	
	
	
	

	public String registrarSesionDetalleImpuestoInvenParaBusquedaProductos() throws Exception {
		Boolean isPaginaPopupProducto=false;

		try {

			if(detalleimpuestoinvenSessionBean==null) {
				detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
			}

			if(productoSessionBean==null) {
				productoSessionBean=new ProductoSessionBean();
			}

			productoSessionBean.setsPathNavegacionActual(detalleimpuestoinvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProductoConstantesFunciones.SCLASSWEBTITULO);
			productoSessionBean.setisPermiteRecargarInformacion(false);
			productoSessionBean.setisPaginaPopup(true);
			isPaginaPopupProducto=productoSessionBean.getisPaginaPopup();
			productoSessionBean.setisPaginaPopup(false);
			productoSessionBean.setEstaModoBusqueda(true);
			productoSessionBean.setsFuncionBusquedaRapida("window.opener.detalleimpuestoinvenFuncionGeneral.setCombosCodigoDesdeBusquedaid_producto(TO_REPLACE);");
			productoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProducto(true);
			productoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProducto(DetalleImpuestoInvenConstantesFunciones.SNOMBREOPCION);
			//productoSessionBean.setisBusquedaDesdeForeignKeySesionDetalleImpuestoInven(true);
			//productoSessionBean.setlidDetalleImpuestoInvenActual(this.idDetalleImpuestoInvenActual);

			detalleimpuestoinvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyDetalleImpuestoInven(true);
			detalleimpuestoinvenSessionBean.setlIdDetalleImpuestoInvenActualForeignKey(this.idDetalleImpuestoInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		
		if(this.detalleimpuestoinvenSessionBean==null) {
			this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		}
		
		this.detalleimpuestoinvenSessionBean.setsUltimaBusquedaDetalleImpuestoInven(this.getsAccionBusqueda());
		this.detalleimpuestoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleimpuestoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			detalleimpuestoinvenSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleimpuestoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdImpuestoInven")) {
			detalleimpuestoinvenSessionBean.setid_impuesto_inven(this.getid_impuesto_invenFK_IdImpuestoInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
			detalleimpuestoinvenSessionBean.setid_producto(this.getid_productoFK_IdProducto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleimpuestoinvenSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleImpuestoInvenSessionBean detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		
		if(this.detalleimpuestoinvenSessionBean==null) {
			this.detalleimpuestoinvenSessionBean=new DetalleImpuestoInvenSessionBean();
		}
		
		if(this.detalleimpuestoinvenSessionBean.getsUltimaBusquedaDetalleImpuestoInven()!=null&&!this.detalleimpuestoinvenSessionBean.getsUltimaBusquedaDetalleImpuestoInven().equals("")) {
			this.setsAccionBusqueda(detalleimpuestoinvenSessionBean.getsUltimaBusquedaDetalleImpuestoInven());
			this.setiNumeroPaginacion(detalleimpuestoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleimpuestoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(detalleimpuestoinvenSessionBean.getid_bodega());
				detalleimpuestoinvenSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleimpuestoinvenSessionBean.getid_empresa());
				detalleimpuestoinvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdImpuestoInven")) {
				this.setid_impuesto_invenFK_IdImpuestoInven(detalleimpuestoinvenSessionBean.getid_impuesto_inven());
				detalleimpuestoinvenSessionBean.setid_impuesto_inven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProducto")) {
				this.setid_productoFK_IdProducto(detalleimpuestoinvenSessionBean.getid_producto());
				detalleimpuestoinvenSessionBean.setid_producto(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleimpuestoinvenSessionBean.getid_sucursal());
				detalleimpuestoinvenSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.detalleimpuestoinvenSessionBean.setsUltimaBusquedaDetalleImpuestoInven("");
		this.detalleimpuestoinvenSessionBean.setiNumeroPaginacion(DetalleImpuestoInvenConstantesFunciones.INUMEROPAGINACION);
		this.detalleimpuestoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleImpuestoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleImpuestoInven() {
		this.updateBorderResaltarBusquedasFormularioDetalleImpuestoInven();
		this.updateVisibilidadBusquedasFormularioDetalleImpuestoInven();
		this.updateHabilitarBusquedasFormularioDetalleImpuestoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleImpuestoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponents().length>0) {
	

		if(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdBodegaDetalleImpuestoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdBodegaDetalleImpuestoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdBodegaDetalleImpuestoInven);
			}
		}

		if(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdImpuestoInvenDetalleImpuestoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdImpuestoInvenDetalleImpuestoInven);
			}
		}

		if(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdProductoDetalleImpuestoInven!=null) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdProductoDetalleImpuestoInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdProductoDetalleImpuestoInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleImpuestoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdBodegaDetalleImpuestoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdBodegaDetalleImpuestoInven);
			if(!this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdBodegaDetalleImpuestoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdImpuestoInvenDetalleImpuestoInven);
			if(!this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdImpuestoInvenDetalleImpuestoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdProductoDetalleImpuestoInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdProductoDetalleImpuestoInven);
			if(!this.detalleimpuestoinvenConstantesFunciones.mostrarFK_IdProductoDetalleImpuestoInven && index>-1) {
				this.jTabbedPaneBusquedasDetalleImpuestoInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleImpuestoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdBodegaDetalleImpuestoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarFK_IdBodegaDetalleImpuestoInven);
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setEnabledAt(index,this.detalleimpuestoinvenConstantesFunciones.activarFK_IdBodegaDetalleImpuestoInven);
			}

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarFK_IdImpuestoInvenDetalleImpuestoInven);
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setEnabledAt(index,this.detalleimpuestoinvenConstantesFunciones.activarFK_IdImpuestoInvenDetalleImpuestoInven);
			}

			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdProductoDetalleImpuestoInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarFK_IdProductoDetalleImpuestoInven);
				this.jTabbedPaneBusquedasDetalleImpuestoInven.setEnabledAt(index,this.detalleimpuestoinvenConstantesFunciones.activarFK_IdProductoDetalleImpuestoInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleImpuestoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdBodegaDetalleImpuestoInven);

			this.jTabbedPaneBusquedasDetalleImpuestoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);

			this.detalleimpuestoinvenConstantesFunciones.setResaltarFK_IdBodegaDetalleImpuestoInven(resaltar);

			jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdBodegaDetalleImpuestoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdImpuestoInven")) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdImpuestoInvenDetalleImpuestoInven);

			this.jTabbedPaneBusquedasDetalleImpuestoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);

			this.detalleimpuestoinvenConstantesFunciones.setResaltarFK_IdImpuestoInvenDetalleImpuestoInven(resaltar);

			jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdImpuestoInvenDetalleImpuestoInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProducto")) {
			index= this.jTabbedPaneBusquedasDetalleImpuestoInven.indexOfComponent(this.jPanelFK_IdProductoDetalleImpuestoInven);

			this.jTabbedPaneBusquedasDetalleImpuestoInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleImpuestoInven.getComponent(index);

			this.detalleimpuestoinvenConstantesFunciones.setResaltarFK_IdProductoDetalleImpuestoInven(resaltar);

			jPanel.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarFK_IdProductoDetalleImpuestoInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleImpuestoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleImpuestoInven() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleImpuestoInven();
		this.updateVisibilidadResaltarControlesFormularioDetalleImpuestoInven();
		this.updateHabilitarResaltarControlesFormularioDetalleImpuestoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleImpuestoInven() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleimpuestoinvenConstantesFunciones.resaltaridDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltaridDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarid_empresaDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarid_empresaDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarid_sucursalDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarid_sucursalDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarid_bodegaDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarid_bodegaDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarid_productoDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarid_productoDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarid_impuesto_invenDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarid_impuesto_invenDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarporcentajeDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarporcentajeDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltarvalorDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltarvalorDetalleImpuestoInven);}
		if(this.detalleimpuestoinvenConstantesFunciones.resaltardescripcionDetalleImpuestoInven!=null && this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setBorder(this.detalleimpuestoinvenConstantesFunciones.resaltardescripcionDetalleImpuestoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleImpuestoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
	
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostraridDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelidDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostraridDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_empresaDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelid_empresaDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_empresaDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_sucursalDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelid_sucursalDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_sucursalDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_bodegaDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelid_bodegaDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_bodegaDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_productoDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelid_productoDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_productoDetalleImpuestoInven);
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_productoDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_impuesto_invenDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelid_impuesto_invenDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarid_impuesto_invenDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarporcentajeDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelporcentajeDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarporcentajeDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarvalorDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPanelvalorDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrarvalorDetalleImpuestoInven);
		//this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrardescripcionDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jPaneldescripcionDetalleImpuestoInven.setVisible(this.detalleimpuestoinvenConstantesFunciones.mostrardescripcionDetalleImpuestoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleImpuestoInven() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleImpuestoInven!=null) {
	
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jLabelidDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activaridDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_empresaDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_empresaDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_sucursalDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_sucursalDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_bodegaDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_bodegaDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_productoDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_productoDetalleImpuestoInven);
			this.jInternalFrameDetalleFormDetalleImpuestoInven.jButtonid_productoDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_productoDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jComboBoxid_impuesto_invenDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarid_impuesto_invenDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldporcentajeDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarporcentajeDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFieldvalorDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activarvalorDetalleImpuestoInven);
		this.jInternalFrameDetalleFormDetalleImpuestoInven.jTextFielddescripcionDetalleImpuestoInven.setEnabled(this.detalleimpuestoinvenConstantesFunciones.activardescripcionDetalleImpuestoInven);
		}
	}
	
		
}