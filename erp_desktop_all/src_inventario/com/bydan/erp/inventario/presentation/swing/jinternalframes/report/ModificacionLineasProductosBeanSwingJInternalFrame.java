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

//import com.bydan.erp.inventario.util.ModificacionLineasProductosConstantesFunciones;
import com.bydan.erp.inventario.util.report.ModificacionLineasProductosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.ModificacionLineasProductosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.ModificacionLineasProductosBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ModificacionLineasProductosBeanSwingJInternalFrame extends ModificacionLineasProductosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ModificacionLineasProductosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ModificacionLineasProductos> modificacionlineasproductosValidator = new ClassValidator<ModificacionLineasProductos>(ModificacionLineasProductos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ModificacionLineasProductos modificacionlineasproductos;	
	public ModificacionLineasProductos modificacionlineasproductosAux;
	public ModificacionLineasProductos modificacionlineasproductosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ModificacionLineasProductos modificacionlineasproductosTotales;
	public Long idModificacionLineasProductosActual;
	public Long iIdNuevoModificacionLineasProductos=0L;
	public int rowIndexActual=0;
	
	
	
	
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

	public String sFinalQueryComboLineaDestino="";

	public List<Linea> lineadestinosForeignKey;

	public List<Linea> getlineadestinosForeignKey() {
		return lineadestinosForeignKey;
	}

	public void setlineadestinosForeignKey(List<Linea> lineadestinosForeignKey) {
		this.lineadestinosForeignKey = lineadestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineadestinoForeignKey;

	public Linea getlineadestinoForeignKey() {
		return lineadestinoForeignKey;
	}

	public void setlineadestinoForeignKey(Linea lineadestinoForeignKey) {
		this.lineadestinoForeignKey = lineadestinoForeignKey;
	}

	public String sFinalQueryComboLineaGrupoDestino="";

	public List<Linea> lineagrupodestinosForeignKey;

	public List<Linea> getlineagrupodestinosForeignKey() {
		return lineagrupodestinosForeignKey;
	}

	public void setlineagrupodestinosForeignKey(List<Linea> lineagrupodestinosForeignKey) {
		this.lineagrupodestinosForeignKey = lineagrupodestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupodestinoForeignKey;

	public Linea getlineagrupodestinoForeignKey() {
		return lineagrupodestinoForeignKey;
	}

	public void setlineagrupodestinoForeignKey(Linea lineagrupodestinoForeignKey) {
		this.lineagrupodestinoForeignKey = lineagrupodestinoForeignKey;
	}

	public String sFinalQueryComboLineaCategoriaDestino="";

	public List<Linea> lineacategoriadestinosForeignKey;

	public List<Linea> getlineacategoriadestinosForeignKey() {
		return lineacategoriadestinosForeignKey;
	}

	public void setlineacategoriadestinosForeignKey(List<Linea> lineacategoriadestinosForeignKey) {
		this.lineacategoriadestinosForeignKey = lineacategoriadestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriadestinoForeignKey;

	public Linea getlineacategoriadestinoForeignKey() {
		return lineacategoriadestinoForeignKey;
	}

	public void setlineacategoriadestinoForeignKey(Linea lineacategoriadestinoForeignKey) {
		this.lineacategoriadestinoForeignKey = lineacategoriadestinoForeignKey;
	}

	public String sFinalQueryComboLineaMarcaDestino="";

	public List<Linea> lineamarcadestinosForeignKey;

	public List<Linea> getlineamarcadestinosForeignKey() {
		return lineamarcadestinosForeignKey;
	}

	public void setlineamarcadestinosForeignKey(List<Linea> lineamarcadestinosForeignKey) {
		this.lineamarcadestinosForeignKey = lineamarcadestinosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcadestinoForeignKey;

	public Linea getlineamarcadestinoForeignKey() {
		return lineamarcadestinoForeignKey;
	}

	public void setlineamarcadestinoForeignKey(Linea lineamarcadestinoForeignKey) {
		this.lineamarcadestinoForeignKey = lineamarcadestinoForeignKey;
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
	
	public Boolean isPermisoTodoModificacionLineasProductos;
	public Boolean isPermisoNuevoModificacionLineasProductos;
	public Boolean isPermisoActualizarModificacionLineasProductos;
	public Boolean isPermisoActualizarOriginalModificacionLineasProductos;
	public Boolean isPermisoEliminarModificacionLineasProductos;
	public Boolean isPermisoGuardarCambiosModificacionLineasProductos;
	public Boolean isPermisoConsultaModificacionLineasProductos;
	public Boolean isPermisoBusquedaModificacionLineasProductos;
	public Boolean isPermisoReporteModificacionLineasProductos;
	public Boolean isPermisoPaginacionMedioModificacionLineasProductos;
	public Boolean isPermisoPaginacionAltoModificacionLineasProductos;
	public Boolean isPermisoPaginacionTodoModificacionLineasProductos;
	public Boolean isPermisoCopiarModificacionLineasProductos;
	public Boolean isPermisoVerFormModificacionLineasProductos;
	public Boolean isPermisoDuplicarModificacionLineasProductos;
	public Boolean isPermisoOrdenModificacionLineasProductos;
	
	
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
	
	public ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosReturnGeneral;
	public ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoModificacionLineasProductos=false;
	public Boolean esParaAccionDesdeFormularioModificacionLineasProductos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ModificacionLineasProductosSessionBeanAdditional modificacionlineasproductosSessionBeanAdditional=null;
	
	public ModificacionLineasProductosSessionBeanAdditional getModificacionLineasProductosSessionBeanAdditional() {
		return this.modificacionlineasproductosSessionBeanAdditional;
	}
	
	public void setModificacionLineasProductosSessionBeanAdditional(ModificacionLineasProductosSessionBeanAdditional modificacionlineasproductosSessionBeanAdditional) {
		try {
			this.modificacionlineasproductosSessionBeanAdditional=modificacionlineasproductosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ModificacionLineasProductosBeanSwingJInternalFrameAdditional modificacionlineasproductosBeanSwingJInternalFrameAdditional=null;
	//public class ModificacionLineasProductosBeanSwingJInternalFrame
	
	public ModificacionLineasProductosBeanSwingJInternalFrameAdditional getModificacionLineasProductosBeanSwingJInternalFrameAdditional() {
		return this.modificacionlineasproductosBeanSwingJInternalFrameAdditional;
	}
	
	public void setModificacionLineasProductosBeanSwingJInternalFrameAdditional(ModificacionLineasProductosBeanSwingJInternalFrameAdditional modificacionlineasproductosBeanSwingJInternalFrameAdditional) {
		try {
			this.modificacionlineasproductosBeanSwingJInternalFrameAdditional=modificacionlineasproductosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ModificacionLineasProductosLogic modificacionlineasproductosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ModificacionLineasProductos modificacionlineasproductosBean;
	public ModificacionLineasProductosConstantesFunciones modificacionlineasproductosConstantesFunciones;
	//public ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosReturnGeneral;
	
	//FK
	
	public ProductoLogic productoLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public LineaLogic lineadestinoLogic;
	public LineaLogic lineagrupodestinoLogic;
	public LineaLogic lineacategoriadestinoLogic;
	public LineaLogic lineamarcadestinoLogic;
	
	//PARAMETROS
	
	
	//public List<ModificacionLineasProductos> modificacionlineasproductoss;	
	//public List<ModificacionLineasProductos> modificacionlineasproductossEliminados;
	//public List<ModificacionLineasProductos> modificacionlineasproductossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaDuplicarModificacionLineasProductos=true;
	public Boolean isVisibilidadCeldaCopiarModificacionLineasProductos=true;
	public Boolean isVisibilidadCeldaVerFormModificacionLineasProductos=true;
	public Boolean isVisibilidadCeldaOrdenModificacionLineasProductos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaModificarModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaActualizarModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaEliminarModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaCancelarModificacionLineasProductos=false;
	public Boolean isVisibilidadCeldaGuardarModificacionLineasProductos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;	
	
	
	public Boolean isVisibilidadBusquedaModificacionLineasProductos=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaCategoriaDestino=false;
	public Boolean isVisibilidadFK_IdLineaDestino=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaGrupoDestino=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdLineaMarcaDestino=false;
	public Boolean isVisibilidadFK_IdProducto=false;
	
	public Long getiIdNuevoModificacionLineasProductos() {
		return this.iIdNuevoModificacionLineasProductos;
	}

	public void setiIdNuevoModificacionLineasProductos(Long iIdNuevoModificacionLineasProductos) {
		this.iIdNuevoModificacionLineasProductos = iIdNuevoModificacionLineasProductos;
	}
	
	public Long getidModificacionLineasProductosActual() {
		return this.idModificacionLineasProductosActual;
	}

	public void setidModificacionLineasProductosActual(Long idModificacionLineasProductosActual) {
		this.idModificacionLineasProductosActual = idModificacionLineasProductosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ModificacionLineasProductos getmodificacionlineasproductos() {
		return this.modificacionlineasproductos;
	}

	public void setmodificacionlineasproductos(ModificacionLineasProductos modificacionlineasproductos) {
		this.modificacionlineasproductos = modificacionlineasproductos;
	}
	
	public ModificacionLineasProductos getmodificacionlineasproductosAux() {
		return this.modificacionlineasproductosAux;
	}

	public void setmodificacionlineasproductosAux(ModificacionLineasProductos modificacionlineasproductosAux) {
		this.modificacionlineasproductosAux = modificacionlineasproductosAux;
	}				
	
	public ModificacionLineasProductos getmodificacionlineasproductosAnterior() {
		return this.modificacionlineasproductosAnterior;
	}

	public void setmodificacionlineasproductosAnterior(ModificacionLineasProductos modificacionlineasproductosAnterior) {
		this.modificacionlineasproductosAnterior = modificacionlineasproductosAnterior;
	}	
	
	public ModificacionLineasProductos getmodificacionlineasproductosTotales() {
		return this.modificacionlineasproductosTotales;
	}

	public void setmodificacionlineasproductosTotales(ModificacionLineasProductos modificacionlineasproductosTotales) {
		this.modificacionlineasproductosTotales = modificacionlineasproductosTotales;
	}	
	
	public ModificacionLineasProductos getmodificacionlineasproductosBean() {
		return this.modificacionlineasproductosBean;
	}

	public void setmodificacionlineasproductosBean(ModificacionLineasProductos modificacionlineasproductosBean) {
		this.modificacionlineasproductosBean = modificacionlineasproductosBean;
	}	
	
	public ModificacionLineasProductosParameterReturnGeneral getmodificacionlineasproductosReturnGeneral() {
		return this.modificacionlineasproductosReturnGeneral;
	}

	public void setmodificacionlineasproductosReturnGeneral(ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosReturnGeneral) {
		this.modificacionlineasproductosReturnGeneral = modificacionlineasproductosReturnGeneral;
	}	
	
	
	public Long id_productoBusquedaModificacionLineasProductos=-1L;

	public Long getid_productoBusquedaModificacionLineasProductos() {
		return this.id_productoBusquedaModificacionLineasProductos;
	}

	public void setid_productoBusquedaModificacionLineasProductos(Long id_productoBusquedaModificacionLineasProductos) {
		this.id_productoBusquedaModificacionLineasProductos = id_productoBusquedaModificacionLineasProductos;
	}

;
	public Long id_lineaBusquedaModificacionLineasProductos=-1L;

	public Long getid_lineaBusquedaModificacionLineasProductos() {
		return this.id_lineaBusquedaModificacionLineasProductos;
	}

	public void setid_lineaBusquedaModificacionLineasProductos(Long id_lineaBusquedaModificacionLineasProductos) {
		this.id_lineaBusquedaModificacionLineasProductos = id_lineaBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_grupoBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_grupoBusquedaModificacionLineasProductos() {
		return this.id_linea_grupoBusquedaModificacionLineasProductos;
	}

	public void setid_linea_grupoBusquedaModificacionLineasProductos(Long id_linea_grupoBusquedaModificacionLineasProductos) {
		this.id_linea_grupoBusquedaModificacionLineasProductos = id_linea_grupoBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_categoriaBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_categoriaBusquedaModificacionLineasProductos() {
		return this.id_linea_categoriaBusquedaModificacionLineasProductos;
	}

	public void setid_linea_categoriaBusquedaModificacionLineasProductos(Long id_linea_categoriaBusquedaModificacionLineasProductos) {
		this.id_linea_categoriaBusquedaModificacionLineasProductos = id_linea_categoriaBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_marcaBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_marcaBusquedaModificacionLineasProductos() {
		return this.id_linea_marcaBusquedaModificacionLineasProductos;
	}

	public void setid_linea_marcaBusquedaModificacionLineasProductos(Long id_linea_marcaBusquedaModificacionLineasProductos) {
		this.id_linea_marcaBusquedaModificacionLineasProductos = id_linea_marcaBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_destinoBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_destinoBusquedaModificacionLineasProductos() {
		return this.id_linea_destinoBusquedaModificacionLineasProductos;
	}

	public void setid_linea_destinoBusquedaModificacionLineasProductos(Long id_linea_destinoBusquedaModificacionLineasProductos) {
		this.id_linea_destinoBusquedaModificacionLineasProductos = id_linea_destinoBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_grupo_destinoBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_grupo_destinoBusquedaModificacionLineasProductos() {
		return this.id_linea_grupo_destinoBusquedaModificacionLineasProductos;
	}

	public void setid_linea_grupo_destinoBusquedaModificacionLineasProductos(Long id_linea_grupo_destinoBusquedaModificacionLineasProductos) {
		this.id_linea_grupo_destinoBusquedaModificacionLineasProductos = id_linea_grupo_destinoBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_categoria_destinoBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_categoria_destinoBusquedaModificacionLineasProductos() {
		return this.id_linea_categoria_destinoBusquedaModificacionLineasProductos;
	}

	public void setid_linea_categoria_destinoBusquedaModificacionLineasProductos(Long id_linea_categoria_destinoBusquedaModificacionLineasProductos) {
		this.id_linea_categoria_destinoBusquedaModificacionLineasProductos = id_linea_categoria_destinoBusquedaModificacionLineasProductos;
	}

;
	public Long id_linea_marca_destinoBusquedaModificacionLineasProductos=-1L;

	public Long getid_linea_marca_destinoBusquedaModificacionLineasProductos() {
		return this.id_linea_marca_destinoBusquedaModificacionLineasProductos;
	}

	public void setid_linea_marca_destinoBusquedaModificacionLineasProductos(Long id_linea_marca_destinoBusquedaModificacionLineasProductos) {
		this.id_linea_marca_destinoBusquedaModificacionLineasProductos = id_linea_marca_destinoBusquedaModificacionLineasProductos;
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

	public Long id_linea_categoria_destinoFK_IdLineaCategoriaDestino=-1L;

	public Long getid_linea_categoria_destinoFK_IdLineaCategoriaDestino() {
		return this.id_linea_categoria_destinoFK_IdLineaCategoriaDestino;
	}

	public void setid_linea_categoria_destinoFK_IdLineaCategoriaDestino(Long id_linea_categoria_destinoFK_IdLineaCategoriaDestino) {
		this.id_linea_categoria_destinoFK_IdLineaCategoriaDestino = id_linea_categoria_destinoFK_IdLineaCategoriaDestino;
	}

	public Long id_linea_destinoFK_IdLineaDestino=-1L;

	public Long getid_linea_destinoFK_IdLineaDestino() {
		return this.id_linea_destinoFK_IdLineaDestino;
	}

	public void setid_linea_destinoFK_IdLineaDestino(Long id_linea_destinoFK_IdLineaDestino) {
		this.id_linea_destinoFK_IdLineaDestino = id_linea_destinoFK_IdLineaDestino;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_grupo_destinoFK_IdLineaGrupoDestino=-1L;

	public Long getid_linea_grupo_destinoFK_IdLineaGrupoDestino() {
		return this.id_linea_grupo_destinoFK_IdLineaGrupoDestino;
	}

	public void setid_linea_grupo_destinoFK_IdLineaGrupoDestino(Long id_linea_grupo_destinoFK_IdLineaGrupoDestino) {
		this.id_linea_grupo_destinoFK_IdLineaGrupoDestino = id_linea_grupo_destinoFK_IdLineaGrupoDestino;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
	}

	public Long id_linea_marca_destinoFK_IdLineaMarcaDestino=-1L;

	public Long getid_linea_marca_destinoFK_IdLineaMarcaDestino() {
		return this.id_linea_marca_destinoFK_IdLineaMarcaDestino;
	}

	public void setid_linea_marca_destinoFK_IdLineaMarcaDestino(Long id_linea_marca_destinoFK_IdLineaMarcaDestino) {
		this.id_linea_marca_destinoFK_IdLineaMarcaDestino = id_linea_marca_destinoFK_IdLineaMarcaDestino;
	}

	public Long id_productoFK_IdProducto=-1L;

	public Long getid_productoFK_IdProducto() {
		return this.id_productoFK_IdProducto;
	}

	public void setid_productoFK_IdProducto(Long id_productoFK_IdProducto) {
		this.id_productoFK_IdProducto = id_productoFK_IdProducto;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ModificacionLineasProductosLogic getModificacionLineasProductosLogic()	{		
		return modificacionlineasproductosLogic;
	}

	public void setModificacionLineasProductosLogic(ModificacionLineasProductosLogic modificacionlineasproductosLogic) {
		this.modificacionlineasproductosLogic = modificacionlineasproductosLogic;
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
	
	public Boolean getIsEsNuevoModificacionLineasProductos() {
		return isEsNuevoModificacionLineasProductos;
	}

	public void setIsEsNuevoModificacionLineasProductos(Boolean isEsNuevoModificacionLineasProductos) {
		this.isEsNuevoModificacionLineasProductos = isEsNuevoModificacionLineasProductos;
	}

	public Boolean getEsParaAccionDesdeFormularioModificacionLineasProductos() {
		return esParaAccionDesdeFormularioModificacionLineasProductos;
	}
	
	public void setEsParaAccionDesdeFormularioModificacionLineasProductos(Boolean esParaAccionDesdeFormularioModificacionLineasProductos) {
		this.esParaAccionDesdeFormularioModificacionLineasProductos = esParaAccionDesdeFormularioModificacionLineasProductos;
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

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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
					productoLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidProductoActual());
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

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

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
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaActual());
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

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

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
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaGrupoActual());
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

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

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
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaCategoriaActual());
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

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

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
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaMarcaActual());
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

	public void cargarCombosLineaDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineadestinosForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineadestinoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineadestinosForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaDestinoActual());
					this.lineadestinosForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaGrupoDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagrupodestinosForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupoDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineagrupodestinoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagrupodestinosForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupoDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaGrupoDestinoActual());
					this.lineagrupodestinosForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriaDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriadestinosForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoriaDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineacategoriadestinoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriadestinosForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoriaDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaCategoriaDestinoActual());
					this.lineacategoriadestinosForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcaDestinosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcadestinosForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarcaDestino()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineamarcadestinoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcadestinosForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarcaDestino(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(modificacionlineasproductosSessionBean.getlidLineaMarcaDestinoActual());
					this.lineamarcadestinosForeignKey.add(lineaLogic.getLinea());
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

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setProducto(productoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setSelectedItem(productoTemp);
					}
				} else {
					//jComboBoxid_productoModificacionLineasProductos.setSelectedItem(productoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(productoTemp!=null && jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(productoTemp);
					} else {
						if(jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(productoTemp);
							if(jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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
	public void setActualProductoForeignKeyGenerico(Long idProductoSeleccionado,JComboBox jComboBoxid_productoModificacionLineasProductosGenerico)throws Exception
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
				jComboBoxid_productoModificacionLineasProductosGenerico.setSelectedItem(productoTemp);
			} else {
				if(jComboBoxid_productoModificacionLineasProductosGenerico!=null && jComboBoxid_productoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_productoModificacionLineasProductosGenerico.setSelectedIndex(0);
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

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaModificacionLineasProductos.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaModificacionLineasProductosGenerico)throws Exception
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
				jComboBoxid_lineaModificacionLineasProductosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaModificacionLineasProductosGenerico!=null && jComboBoxid_lineaModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_lineaModificacionLineasProductosGenerico.setSelectedIndex(0);
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

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoModificacionLineasProductosGenerico)throws Exception
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
				jComboBoxid_linea_grupoModificacionLineasProductosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoModificacionLineasProductosGenerico!=null && jComboBoxid_linea_grupoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoModificacionLineasProductosGenerico.setSelectedIndex(0);
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

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaModificacionLineasProductosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaModificacionLineasProductosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaModificacionLineasProductosGenerico!=null && jComboBoxid_linea_categoriaModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaModificacionLineasProductosGenerico.setSelectedIndex(0);
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

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaModificacionLineasProductosGenerico)throws Exception
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
				jComboBoxid_linea_marcaModificacionLineasProductosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaModificacionLineasProductosGenerico!=null && jComboBoxid_linea_marcaModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaModificacionLineasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaDestinoForeignKey(Long idLineaDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineadestinoTemp=null;

			for(Linea lineadestinoAux:lineadestinosForeignKey) {
				if(lineadestinoAux.getId()!=null && lineadestinoAux.getId().equals(idLineaDestinoSeleccionado)) {
					lineadestinoTemp=lineadestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineadestinoTemp!=null) {

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaDestino(lineadestinoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedItem(lineadestinoTemp);
					}
				} else {
					//jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedItem(lineadestinoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineadestinoTemp!=null && jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineadestinoTemp);
					} else {
						if(jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineadestinoTemp);
							if(jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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

	public String getActualLineaDestinoForeignKeyDescripcion(Long idLineaDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineadestinoTemp=null;

			for(Linea lineadestinoAux:lineadestinosForeignKey) {
				if(lineadestinoAux.getId()!=null && lineadestinoAux.getId().equals(idLineaDestinoSeleccionado)) {
					lineadestinoTemp=lineadestinoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineadestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaDestinoForeignKeyGenerico(Long idLineaDestinoSeleccionado,JComboBox jComboBoxid_linea_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineadestinoTemp=null;

			for(Linea lineadestinoAux:lineadestinosForeignKey) {
				if(lineadestinoAux.getId()!=null && lineadestinoAux.getId().equals(idLineaDestinoSeleccionado)) {
					lineadestinoTemp=lineadestinoAux;
					break;
				}
			}

			if(lineadestinoTemp!=null) {
				jComboBoxid_linea_destinoModificacionLineasProductosGenerico.setSelectedItem(lineadestinoTemp);
			} else {
				if(jComboBoxid_linea_destinoModificacionLineasProductosGenerico!=null && jComboBoxid_linea_destinoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_destinoModificacionLineasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoDestinoForeignKey(Long idLineaGrupoDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupodestinoTemp=null;

			for(Linea lineagrupodestinoAux:lineagrupodestinosForeignKey) {
				if(lineagrupodestinoAux.getId()!=null && lineagrupodestinoAux.getId().equals(idLineaGrupoDestinoSeleccionado)) {
					lineagrupodestinoTemp=lineagrupodestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupodestinoTemp!=null) {

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaGrupoDestino(lineagrupodestinoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedItem(lineagrupodestinoTemp);
					}
				} else {
					//jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedItem(lineagrupodestinoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupodestinoTemp!=null && jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupodestinoTemp);
					} else {
						if(jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupodestinoTemp);
							if(jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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

	public String getActualLineaGrupoDestinoForeignKeyDescripcion(Long idLineaGrupoDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupodestinoTemp=null;

			for(Linea lineagrupodestinoAux:lineagrupodestinosForeignKey) {
				if(lineagrupodestinoAux.getId()!=null && lineagrupodestinoAux.getId().equals(idLineaGrupoDestinoSeleccionado)) {
					lineagrupodestinoTemp=lineagrupodestinoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupodestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoDestinoForeignKeyGenerico(Long idLineaGrupoDestinoSeleccionado,JComboBox jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupodestinoTemp=null;

			for(Linea lineagrupodestinoAux:lineagrupodestinosForeignKey) {
				if(lineagrupodestinoAux.getId()!=null && lineagrupodestinoAux.getId().equals(idLineaGrupoDestinoSeleccionado)) {
					lineagrupodestinoTemp=lineagrupodestinoAux;
					break;
				}
			}

			if(lineagrupodestinoTemp!=null) {
				jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico.setSelectedItem(lineagrupodestinoTemp);
			} else {
				if(jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico!=null && jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaDestinoForeignKey(Long idLineaCategoriaDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriadestinoTemp=null;

			for(Linea lineacategoriadestinoAux:lineacategoriadestinosForeignKey) {
				if(lineacategoriadestinoAux.getId()!=null && lineacategoriadestinoAux.getId().equals(idLineaCategoriaDestinoSeleccionado)) {
					lineacategoriadestinoTemp=lineacategoriadestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriadestinoTemp!=null) {

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaCategoriaDestino(lineacategoriadestinoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedItem(lineacategoriadestinoTemp);
					}
				} else {
					//jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedItem(lineacategoriadestinoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriadestinoTemp!=null && jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoriadestinoTemp);
					} else {
						if(jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoriadestinoTemp);
							if(jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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

	public String getActualLineaCategoriaDestinoForeignKeyDescripcion(Long idLineaCategoriaDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriadestinoTemp=null;

			for(Linea lineacategoriadestinoAux:lineacategoriadestinosForeignKey) {
				if(lineacategoriadestinoAux.getId()!=null && lineacategoriadestinoAux.getId().equals(idLineaCategoriaDestinoSeleccionado)) {
					lineacategoriadestinoTemp=lineacategoriadestinoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriadestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaDestinoForeignKeyGenerico(Long idLineaCategoriaDestinoSeleccionado,JComboBox jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriadestinoTemp=null;

			for(Linea lineacategoriadestinoAux:lineacategoriadestinosForeignKey) {
				if(lineacategoriadestinoAux.getId()!=null && lineacategoriadestinoAux.getId().equals(idLineaCategoriaDestinoSeleccionado)) {
					lineacategoriadestinoTemp=lineacategoriadestinoAux;
					break;
				}
			}

			if(lineacategoriadestinoTemp!=null) {
				jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico.setSelectedItem(lineacategoriadestinoTemp);
			} else {
				if(jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico!=null && jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaDestinoForeignKey(Long idLineaMarcaDestinoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcadestinoTemp=null;

			for(Linea lineamarcadestinoAux:lineamarcadestinosForeignKey) {
				if(lineamarcadestinoAux.getId()!=null && lineamarcadestinoAux.getId().equals(idLineaMarcaDestinoSeleccionado)) {
					lineamarcadestinoTemp=lineamarcadestinoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcadestinoTemp!=null) {

					if(this.modificacionlineasproductos!=null) {
						this.modificacionlineasproductos.setLineaMarcaDestino(lineamarcadestinoTemp);
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedItem(lineamarcadestinoTemp);
					}
				} else {
					//jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedItem(lineamarcadestinoTemp);
					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.getItemCount()>0) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcadestinoTemp!=null && jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
						jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarcadestinoTemp);
					} else {
						if(jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
							//jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarcadestinoTemp);
							if(jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getItemCount()>0) {
								jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(0);
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

	public String getActualLineaMarcaDestinoForeignKeyDescripcion(Long idLineaMarcaDestinoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcadestinoTemp=null;

			for(Linea lineamarcadestinoAux:lineamarcadestinosForeignKey) {
				if(lineamarcadestinoAux.getId()!=null && lineamarcadestinoAux.getId().equals(idLineaMarcaDestinoSeleccionado)) {
					lineamarcadestinoTemp=lineamarcadestinoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcadestinoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaDestinoForeignKeyGenerico(Long idLineaMarcaDestinoSeleccionado,JComboBox jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcadestinoTemp=null;

			for(Linea lineamarcadestinoAux:lineamarcadestinosForeignKey) {
				if(lineamarcadestinoAux.getId()!=null && lineamarcadestinoAux.getId().equals(idLineaMarcaDestinoSeleccionado)) {
					lineamarcadestinoTemp=lineamarcadestinoAux;
					break;
				}
			}

			if(lineamarcadestinoTemp!=null) {
				jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico.setSelectedItem(lineamarcadestinoTemp);
			} else {
				if(jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico!=null && jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProductoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_productoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Producto  productoAux=new Producto();

			if(jComboBoxid_productoModificacionLineasProductosGenerico==null) {
				productoAux=(Producto)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.getSelectedItem();
			} else {
				productoAux=(Producto)jComboBoxid_productoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(productoAux!=null && productoAux.getId()!=null) {
				modificacionlineasproductos.setid_producto(productoAux.getId());
				modificacionlineasproductos.setproducto_descripcion(ModificacionLineasProductosConstantesFunciones.getProductoDescripcion(productoAux));
				modificacionlineasproductos.setProducto(productoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_lineaModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea(lineaAux.getId());
				modificacionlineasproductos.setlinea_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaDescripcion(lineaAux));
				modificacionlineasproductos.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_grupoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_grupo(lineaAux.getId());
				modificacionlineasproductos.setlineagrupo_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				modificacionlineasproductos.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_categoriaModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_categoria(lineaAux.getId());
				modificacionlineasproductos.setlineacategoria_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				modificacionlineasproductos.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_marcaModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_marca(lineaAux.getId());
				modificacionlineasproductos.setlineamarca_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				modificacionlineasproductos.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaDestinoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_destinoModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_destinoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_destino(lineaAux.getId());
				modificacionlineasproductos.setlineadestino_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaDestinoDescripcion(lineaAux));
				modificacionlineasproductos.setLineaDestino(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoDestinoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupo_destinoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_grupo_destino(lineaAux.getId());
				modificacionlineasproductos.setlineagrupodestino_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaGrupoDestinoDescripcion(lineaAux));
				modificacionlineasproductos.setLineaGrupoDestino(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaDestinoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoria_destinoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_categoria_destino(lineaAux.getId());
				modificacionlineasproductos.setlineacategoriadestino_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaCategoriaDestinoDescripcion(lineaAux));
				modificacionlineasproductos.setLineaCategoriaDestino(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaDestinoForeignKey(ModificacionLineasProductos modificacionlineasproductos,JComboBox jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marca_destinoModificacionLineasProductosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				modificacionlineasproductos.setid_linea_marca_destino(lineaAux.getId());
				modificacionlineasproductos.setlineamarcadestino_descripcion(ModificacionLineasProductosConstantesFunciones.getLineaMarcaDestinoDescripcion(lineaAux));
				modificacionlineasproductos.setLineaMarcaDestino(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProductosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProducto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.addItem(producto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Producto producto:this.productosForeignKey) {
								this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(producto);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(linea);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineagrupo);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineacategoria);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineamarca);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.removeAllItems();

							for(Linea lineadestino:this.lineadestinosForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.addItem(lineadestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineadestino:this.lineadestinosForeignKey) {
								this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineadestino);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGrupoDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.removeAllItems();

							for(Linea lineagrupodestino:this.lineagrupodestinosForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.addItem(lineagrupodestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineagrupodestino:this.lineagrupodestinosForeignKey) {
								this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineagrupodestino);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriaDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.removeAllItems();

							for(Linea lineacategoriadestino:this.lineacategoriadestinosForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.addItem(lineacategoriadestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineacategoriadestino:this.lineacategoriadestinosForeignKey) {
								this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineacategoriadestino);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcaDestinosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.removeAllItems();

							for(Linea lineamarcadestino:this.lineamarcadestinosForeignKey) {
								this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.addItem(lineamarcadestino);
							}
						}
					}

					if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { 
					}

					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaModificacionLineasProductos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.removeAllItems();

							for(Linea lineamarcadestino:this.lineamarcadestinosForeignKey) {
								this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.addItem(lineamarcadestino);
							}
						}

						if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameProductoForeignKey(Producto producto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setSelectedItem(producto);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(producto);
						} else {
							this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaDestinoForeignKey(Linea lineadestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedItem(lineadestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineadestino);
						} else {
							this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaGrupoDestinoForeignKey(Linea lineagrupodestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedItem(lineagrupodestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineagrupodestino);
						} else {
							this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaCategoriaDestinoForeignKey(Linea lineacategoriadestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedItem(lineacategoriadestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineacategoriadestino);
						} else {
							this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameLineaMarcaDestinoForeignKey(Linea lineamarcadestino,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedItem(lineamarcadestino);
						}
					} else {
						if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedItem(lineamarcadestino);
						} else {
							this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesModificacionLineasProductos() throws Exception {
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
		
	public ModificacionLineasProductosParameterReturnGeneral getModificacionLineasProductosParameterGeneral() {
		return this.modificacionlineasproductosParameterGeneral;
	}
	
	public void setModificacionLineasProductosParameterGeneral(ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosParameterGeneral) {
		this.modificacionlineasproductosParameterGeneral = modificacionlineasproductosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoModificacionLineasProductos() {
		return isPermisoTodoModificacionLineasProductos;
	}

	public void setIsPermisoTodoModificacionLineasProductos(Boolean isPermisoTodoModificacionLineasProductos) {
		this.isPermisoTodoModificacionLineasProductos = isPermisoTodoModificacionLineasProductos;
	}

	public Boolean getIsPermisoNuevoModificacionLineasProductos() {
		return isPermisoNuevoModificacionLineasProductos;
	}

	public void setIsPermisoNuevoModificacionLineasProductos(Boolean isPermisoNuevoModificacionLineasProductos) {
		this.isPermisoNuevoModificacionLineasProductos = isPermisoNuevoModificacionLineasProductos;
	}

	public Boolean getIsPermisoActualizarModificacionLineasProductos() {
		return isPermisoActualizarModificacionLineasProductos;
	}

	public void setIsPermisoActualizarModificacionLineasProductos(Boolean isPermisoActualizarModificacionLineasProductos) {
		this.isPermisoActualizarModificacionLineasProductos = isPermisoActualizarModificacionLineasProductos;
	}

	public Boolean getIsPermisoEliminarModificacionLineasProductos() {
		return isPermisoEliminarModificacionLineasProductos;
	}

	public void setIsPermisoEliminarModificacionLineasProductos(Boolean isPermisoEliminarModificacionLineasProductos) {
		this.isPermisoEliminarModificacionLineasProductos = isPermisoEliminarModificacionLineasProductos;
	}

	public Boolean getIsPermisoGuardarCambiosModificacionLineasProductos() {
		return isPermisoGuardarCambiosModificacionLineasProductos;
	}

	public void setIsPermisoGuardarCambiosModificacionLineasProductos(Boolean isPermisoGuardarCambiosModificacionLineasProductos) {
		this.isPermisoGuardarCambiosModificacionLineasProductos = isPermisoGuardarCambiosModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoConsultaModificacionLineasProductos() {
		return isPermisoConsultaModificacionLineasProductos;
	}

	public void setIsPermisoConsultaModificacionLineasProductos(Boolean isPermisoConsultaModificacionLineasProductos) {
		this.isPermisoConsultaModificacionLineasProductos = isPermisoConsultaModificacionLineasProductos;
	}

	public Boolean getIsPermisoBusquedaModificacionLineasProductos() {
		return isPermisoBusquedaModificacionLineasProductos;
	}

	public void setIsPermisoBusquedaModificacionLineasProductos(Boolean isPermisoBusquedaModificacionLineasProductos) {
		this.isPermisoBusquedaModificacionLineasProductos = isPermisoBusquedaModificacionLineasProductos;
	}

	public Boolean getIsPermisoReporteModificacionLineasProductos() {
		return isPermisoReporteModificacionLineasProductos;
	}

	public void setIsPermisoReporteModificacionLineasProductos(Boolean isPermisoReporteModificacionLineasProductos) {
		this.isPermisoReporteModificacionLineasProductos = isPermisoReporteModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoPaginacionMedioModificacionLineasProductos() {
		return isPermisoPaginacionMedioModificacionLineasProductos;
	}

	public void setIsPermisoPaginacionMedioModificacionLineasProductos(Boolean isPermisoPaginacionMedioModificacionLineasProductos) {
		this.isPermisoPaginacionMedioModificacionLineasProductos = isPermisoPaginacionMedioModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoPaginacionTodoModificacionLineasProductos() {
		return isPermisoPaginacionTodoModificacionLineasProductos;
	}

	public void setIsPermisoPaginacionTodoModificacionLineasProductos(Boolean isPermisoPaginacionTodoModificacionLineasProductos) {
		this.isPermisoPaginacionTodoModificacionLineasProductos = isPermisoPaginacionTodoModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoPaginacionAltoModificacionLineasProductos() {
		return isPermisoPaginacionAltoModificacionLineasProductos;
	}

	public void setIsPermisoPaginacionAltoModificacionLineasProductos(Boolean isPermisoPaginacionAltoModificacionLineasProductos) {
		this.isPermisoPaginacionAltoModificacionLineasProductos = isPermisoPaginacionAltoModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoCopiarModificacionLineasProductos() {
		return isPermisoCopiarModificacionLineasProductos;
	}

	public void setIsPermisoCopiarModificacionLineasProductos(Boolean isPermisoCopiarModificacionLineasProductos) {
		this.isPermisoCopiarModificacionLineasProductos = isPermisoCopiarModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoVerFormModificacionLineasProductos() {
		return isPermisoVerFormModificacionLineasProductos;
	}

	public void setIsPermisoVerFormModificacionLineasProductos(Boolean isPermisoVerFormModificacionLineasProductos) {
		this.isPermisoVerFormModificacionLineasProductos = isPermisoVerFormModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoDuplicarModificacionLineasProductos() {
		return isPermisoDuplicarModificacionLineasProductos;
	}

	public void setIsPermisoDuplicarModificacionLineasProductos(Boolean isPermisoDuplicarModificacionLineasProductos) {
		this.isPermisoDuplicarModificacionLineasProductos = isPermisoDuplicarModificacionLineasProductos;
	}
	
	public Boolean getIsPermisoOrdenModificacionLineasProductos() {
		return isPermisoOrdenModificacionLineasProductos;
	}

	public void setIsPermisoOrdenModificacionLineasProductos(Boolean isPermisoOrdenModificacionLineasProductos) {
		this.isPermisoOrdenModificacionLineasProductos = isPermisoOrdenModificacionLineasProductos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoModificacionLineasProductos() {
		return isVisibilidadCeldaNuevoModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaNuevoModificacionLineasProductos(Boolean isVisibilidadCeldaNuevoModificacionLineasProductos) {
		this.isVisibilidadCeldaNuevoModificacionLineasProductos = isVisibilidadCeldaNuevoModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarModificacionLineasProductos() {
		return isVisibilidadCeldaDuplicarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaDuplicarModificacionLineasProductos(Boolean isVisibilidadCeldaDuplicarModificacionLineasProductos) {
		this.isVisibilidadCeldaDuplicarModificacionLineasProductos = isVisibilidadCeldaDuplicarModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarModificacionLineasProductos() {
		return isVisibilidadCeldaCopiarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaCopiarModificacionLineasProductos(Boolean isVisibilidadCeldaCopiarModificacionLineasProductos) {
		this.isVisibilidadCeldaCopiarModificacionLineasProductos = isVisibilidadCeldaCopiarModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormModificacionLineasProductos() {
		return isVisibilidadCeldaVerFormModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaVerFormModificacionLineasProductos(Boolean isVisibilidadCeldaVerFormModificacionLineasProductos) {
		this.isVisibilidadCeldaVerFormModificacionLineasProductos = isVisibilidadCeldaVerFormModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenModificacionLineasProductos() {
		return isVisibilidadCeldaOrdenModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaOrdenModificacionLineasProductos(Boolean isVisibilidadCeldaOrdenModificacionLineasProductos) {
		this.isVisibilidadCeldaOrdenModificacionLineasProductos = isVisibilidadCeldaOrdenModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesModificacionLineasProductos() {
		return isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesModificacionLineasProductos(Boolean isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos) {
		this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos = isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarModificacionLineasProductos() {
		return isVisibilidadCeldaModificarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaModificarModificacionLineasProductos(Boolean isVisibilidadCeldaModificarModificacionLineasProductos) {
		this.isVisibilidadCeldaModificarModificacionLineasProductos = isVisibilidadCeldaModificarModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarModificacionLineasProductos() {
		return isVisibilidadCeldaActualizarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaActualizarModificacionLineasProductos(Boolean isVisibilidadCeldaActualizarModificacionLineasProductos) {
		this.isVisibilidadCeldaActualizarModificacionLineasProductos = isVisibilidadCeldaActualizarModificacionLineasProductos;
	}

	public Boolean getIsVisibilidadCeldaEliminarModificacionLineasProductos() {
		return isVisibilidadCeldaEliminarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaEliminarModificacionLineasProductos(Boolean isVisibilidadCeldaEliminarModificacionLineasProductos) {
		this.isVisibilidadCeldaEliminarModificacionLineasProductos = isVisibilidadCeldaEliminarModificacionLineasProductos;
	}

	public Boolean getIsVisibilidadCeldaCancelarModificacionLineasProductos() {
		return isVisibilidadCeldaCancelarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaCancelarModificacionLineasProductos(Boolean isVisibilidadCeldaCancelarModificacionLineasProductos) {
		this.isVisibilidadCeldaCancelarModificacionLineasProductos = isVisibilidadCeldaCancelarModificacionLineasProductos;
	}

	public Boolean getIsVisibilidadCeldaGuardarModificacionLineasProductos() {
		return isVisibilidadCeldaGuardarModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaGuardarModificacionLineasProductos(Boolean isVisibilidadCeldaGuardarModificacionLineasProductos) {
		this.isVisibilidadCeldaGuardarModificacionLineasProductos = isVisibilidadCeldaGuardarModificacionLineasProductos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosModificacionLineasProductos() {
		return isVisibilidadCeldaGuardarCambiosModificacionLineasProductos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosModificacionLineasProductos(Boolean isVisibilidadCeldaGuardarCambiosModificacionLineasProductos) {
		this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos = isVisibilidadCeldaGuardarCambiosModificacionLineasProductos;
	}
		
	public ModificacionLineasProductosSessionBean getmodificacionlineasproductosSessionBean() {
		return this.modificacionlineasproductosSessionBean;
	}
	
	public void setmodificacionlineasproductosSessionBean(ModificacionLineasProductosSessionBean modificacionlineasproductosSessionBean) {
		this.modificacionlineasproductosSessionBean=modificacionlineasproductosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaModificacionLineasProductos() {
		return this.isVisibilidadBusquedaModificacionLineasProductos;
	}

	public void setisVisibilidadBusquedaModificacionLineasProductos(Boolean isVisibilidadBusquedaModificacionLineasProductos) {
		this.isVisibilidadBusquedaModificacionLineasProductos=isVisibilidadBusquedaModificacionLineasProductos;
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

	public Boolean getisVisibilidadFK_IdLineaCategoriaDestino() {
		return this.isVisibilidadFK_IdLineaCategoriaDestino;
	}

	public void setisVisibilidadFK_IdLineaCategoriaDestino(Boolean isVisibilidadFK_IdLineaCategoriaDestino) {
		this.isVisibilidadFK_IdLineaCategoriaDestino=isVisibilidadFK_IdLineaCategoriaDestino;
	}

	public Boolean getisVisibilidadFK_IdLineaDestino() {
		return this.isVisibilidadFK_IdLineaDestino;
	}

	public void setisVisibilidadFK_IdLineaDestino(Boolean isVisibilidadFK_IdLineaDestino) {
		this.isVisibilidadFK_IdLineaDestino=isVisibilidadFK_IdLineaDestino;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupoDestino() {
		return this.isVisibilidadFK_IdLineaGrupoDestino;
	}

	public void setisVisibilidadFK_IdLineaGrupoDestino(Boolean isVisibilidadFK_IdLineaGrupoDestino) {
		this.isVisibilidadFK_IdLineaGrupoDestino=isVisibilidadFK_IdLineaGrupoDestino;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdLineaMarcaDestino() {
		return this.isVisibilidadFK_IdLineaMarcaDestino;
	}

	public void setisVisibilidadFK_IdLineaMarcaDestino(Boolean isVisibilidadFK_IdLineaMarcaDestino) {
		this.isVisibilidadFK_IdLineaMarcaDestino=isVisibilidadFK_IdLineaMarcaDestino;
	}

	public Boolean getisVisibilidadFK_IdProducto() {
		return this.isVisibilidadFK_IdProducto;
	}

	public void setisVisibilidadFK_IdProducto(Boolean isVisibilidadFK_IdProducto) {
		this.isVisibilidadFK_IdProducto=isVisibilidadFK_IdProducto;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos)throws Exception {
		try {
			
				this.setActualParaGuardarProductoForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaGrupoForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaMarcaForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaDestinoForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaGrupoDestinoForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaCategoriaDestinoForeignKey(modificacionlineasproductos,null);
				this.setActualParaGuardarLineaMarcaDestinoForeignKey(modificacionlineasproductos,null);
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
	
	public void bugActualizarReferenciaActual(ModificacionLineasProductos modificacionlineasproductos,ModificacionLineasProductos modificacionlineasproductosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalModificacionLineasProductos(modificacionlineasproductos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		modificacionlineasproductosAux.setId(modificacionlineasproductos.getId());
		modificacionlineasproductosAux.setVersionRow(modificacionlineasproductos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ModificacionLineasProductos modificacionlineasproductosLocal) throws Exception {
		
		if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ModificacionLineasProductos modificacionlineasproductosLocal) throws Exception {	
		if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ProductoDetalleFormJInternalFrame.class)) {
				ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrameLocal=(ProductoBeanSwingJInternalFrame) ((ProductoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				productoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProducto(productoBeanSwingJInternalFrameLocal.getproducto(),true);
				productoBeanSwingJInternalFrameLocal.actualizarLista(productoBeanSwingJInternalFrameLocal.producto,this.productosForeignKey);

				productoBeanSwingJInternalFrameLocal.actualizarRelaciones(productoBeanSwingJInternalFrameLocal.producto);

				modificacionlineasproductosLocal.setProducto(productoBeanSwingJInternalFrameLocal.producto);

				this.addItemDefectoCombosForeignKeyProducto();
				this.cargarCombosFrameProductosForeignKey("Formulario");
				this.setActualProductoForeignKey(productoBeanSwingJInternalFrameLocal.producto.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineadestinoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineadestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineadestinoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineadestinoBeanSwingJInternalFrameLocal.actualizarLista(lineadestinoBeanSwingJInternalFrameLocal.linea,this.lineadestinosForeignKey);

				lineadestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineadestinoBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaDestino(lineadestinoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaDestino();
				this.cargarCombosFrameLineaDestinosForeignKey("Formulario");
				this.setActualLineaDestinoForeignKey(lineadestinoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupodestinoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupodestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupodestinoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupodestinoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupodestinoBeanSwingJInternalFrameLocal.linea,this.lineagrupodestinosForeignKey);

				lineagrupodestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupodestinoBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaGrupoDestino(lineagrupodestinoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupoDestino();
				this.cargarCombosFrameLineaGrupoDestinosForeignKey("Formulario");
				this.setActualLineaGrupoDestinoForeignKey(lineagrupodestinoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriadestinoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriadestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriadestinoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriadestinoBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriadestinoBeanSwingJInternalFrameLocal.linea,this.lineacategoriadestinosForeignKey);

				lineacategoriadestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriadestinoBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaCategoriaDestino(lineacategoriadestinoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoriaDestino();
				this.cargarCombosFrameLineaCategoriaDestinosForeignKey("Formulario");
				this.setActualLineaCategoriaDestinoForeignKey(lineacategoriadestinoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcadestinoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcadestinoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcadestinoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcadestinoBeanSwingJInternalFrameLocal.actualizarLista(lineamarcadestinoBeanSwingJInternalFrameLocal.linea,this.lineamarcadestinosForeignKey);

				lineamarcadestinoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcadestinoBeanSwingJInternalFrameLocal.linea);

				modificacionlineasproductosLocal.setLineaMarcaDestino(lineamarcadestinoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarcaDestino();
				this.cargarCombosFrameLineaMarcaDestinosForeignKey("Formulario");
				this.setActualLineaMarcaDestinoForeignKey(lineamarcadestinoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarModificacionLineasProductosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = modificacionlineasproductosValidator.getInvalidValues(this.modificacionlineasproductos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ModificacionLineasProductos modificacionlineasproductos,List<ModificacionLineasProductos> modificacionlineasproductoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(ModificacionLineasProductos modificacionlineasproductos,List<ModificacionLineasProductos> modificacionlineasproductoss) throws Exception {
		try	{			
			ModificacionLineasProductosConstantesFunciones.actualizarSelectedLista(modificacionlineasproductos,modificacionlineasproductoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ModificacionLineasProductos> modificacionlineasproductossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				modificacionlineasproductossLocal=this.modificacionlineasproductosLogic.getModificacionLineasProductoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				modificacionlineasproductossLocal=this.modificacionlineasproductoss;
			}
			//ARCHITECTURE
		
			for(ModificacionLineasProductos modificacionlineasproductosLocal:modificacionlineasproductossLocal) {
				if(this.permiteMantenimiento(modificacionlineasproductosLocal) && modificacionlineasproductosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ModificacionLineasProductosConstantesFunciones.getModificacionLineasProductosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_productoModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_lineaModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_grupoModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_categoriaModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_marcaModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_destinoModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEAGRUPODESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_grupo_destinoModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEACATEGORIADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_categoria_destinoModificacionLineasProductos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ModificacionLineasProductosConstantesFunciones.IDLINEAMARCADESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_marca_destinoModificacionLineasProductos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_productoModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_lineaModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_grupoModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_categoriaModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_marcaModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_destinoModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_grupo_destinoModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_categoria_destinoModificacionLineasProductos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelid_linea_marca_destinoModificacionLineasProductos,"");
		
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
		this.iIdNuevoModificacionLineasProductos--;	
		
		
		this.modificacionlineasproductosAux=new ModificacionLineasProductos();
		
		this.modificacionlineasproductosAux.setId(this.iIdNuevoModificacionLineasProductos);
		this.modificacionlineasproductosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.modificacionlineasproductosLogic.getModificacionLineasProductoss().add(this.modificacionlineasproductosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.modificacionlineasproductoss.add(this.modificacionlineasproductosAux);
		}
		//ARCHITECTURE
		
		this.modificacionlineasproductos=this.modificacionlineasproductosAux;
		
		if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductos);
			this.setVariablesObjetoActualToFormularioForeignKeyModificacionLineasProductos(this.modificacionlineasproductos);
		}
				
		//this.setDefaultControlesModificacionLineasProductos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyModificacionLineasProductos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyModificacionLineasProductos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyModificacionLineasProductos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModificacionLineasProductos(this.modificacionlineasproductosBean,this.modificacionlineasproductos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral,this.modificacionlineasproductosBean,false);
		
		if(this.modificacionlineasproductosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos());
		}
		
		if(this.modificacionlineasproductosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos(),classes);//this.modificacionlineasproductosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyModificacionLineasProductos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyModificacionLineasProductos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.RecargarFormModificacionLineasProductos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingModificacionLineasProductos(false);
						
			if(modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModificacionLineasProductos();
			}
			
			this.actualizarVisualTableDatosModificacionLineasProductos();
			
			this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(this.getIndiceNuevoModificacionLineasProductos(), this.getIndiceNuevoModificacionLineasProductos());
			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
						
			this.actualizarEstadoCeldasBotonesModificacionLineasProductos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesModificacionLineasProductos(Boolean isHabilitar) throws Exception {
			
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_productoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_lineaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoriaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_marcaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupo_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoria_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setEnabled(isHabilitar && this.modificacionlineasproductosConstantesFunciones.activarid_linea_marca_destinoModificacionLineasProductos);
	};
	
	public void setDefaultControlesModificacionLineasProductos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoModificacionLineasProductos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(true);			
			this.modificacionlineasproductosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.setVisible(true);
			
					
		} else {
			//this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(false);			
			this.modificacionlineasproductosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoModificacionLineasProductos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				if(modificacionlineasproductosAux.getId().equals(this.iIdNuevoModificacionLineasProductos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductoss) {
				if(modificacionlineasproductosAux.getId().equals(this.iIdNuevoModificacionLineasProductos)) {
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
	
	public int getIndiceActualModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				if(modificacionlineasproductosAux.getId().equals(modificacionlineasproductos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductoss) {
				if(modificacionlineasproductosAux.getId().equals(modificacionlineasproductos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				if(modificacionlineasproductosAux.getModificacionLineasProductosOriginal().getId().equals(modificacionlineasproductosOriginal.getId())) {
					existe=true;
					modificacionlineasproductosOriginal.setId(modificacionlineasproductosAux.getId());
					modificacionlineasproductosOriginal.setVersionRow(modificacionlineasproductosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductoss) {
				if(modificacionlineasproductosAux.getModificacionLineasProductosOriginal().getId().equals(modificacionlineasproductosOriginal.getId())) {
					existe=true;
					modificacionlineasproductosOriginal.setId(modificacionlineasproductosAux.getId());
					modificacionlineasproductosOriginal.setVersionRow(modificacionlineasproductosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosModificacionLineasProductos(Boolean esParaCancelar) throws Exception {
		modificacionlineasproductossAux=new ArrayList<ModificacionLineasProductos>();
		modificacionlineasproductosAux=new ModificacionLineasProductos();
		
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
					if(modificacionlineasproductosAux.getId()<0) {
						modificacionlineasproductossAux.add(modificacionlineasproductosAux);
					}		
				}
				this.iIdNuevoModificacionLineasProductos=0L;
				this.modificacionlineasproductosLogic.getModificacionLineasProductoss().removeAll(modificacionlineasproductossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductoss) {
					if(modificacionlineasproductosAux.getId()<0) {
						modificacionlineasproductossAux.add(modificacionlineasproductosAux);
					}		
				}
				this.iIdNuevoModificacionLineasProductos=0L;
				this.modificacionlineasproductoss.removeAll(modificacionlineasproductossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoModificacionLineasProductos 
					&& this.modificacionlineasproductosLogic.getModificacionLineasProductoss().size()>0
					) {
					modificacionlineasproductosAux=this.modificacionlineasproductosLogic.getModificacionLineasProductoss().get(this.modificacionlineasproductosLogic.getModificacionLineasProductoss().size() - 1);
				
					if(modificacionlineasproductosAux.getId()<0) {
						this.modificacionlineasproductosLogic.getModificacionLineasProductoss().remove(modificacionlineasproductosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoModificacionLineasProductos && this.modificacionlineasproductoss.size()>0) {
					modificacionlineasproductosAux=this.modificacionlineasproductoss.get(this.modificacionlineasproductoss.size() - 1);
				
					if(modificacionlineasproductosAux.getId()<0) {
						this.modificacionlineasproductoss.remove(modificacionlineasproductosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoModificacionLineasProductos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(modificacionlineasproductos.getId()<0) {
				this.modificacionlineasproductosLogic.getModificacionLineasProductoss().remove(this.modificacionlineasproductos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(modificacionlineasproductos.getId()<0) {
				this.modificacionlineasproductoss.remove(this.modificacionlineasproductos);
			}
		}			
	}
	
	public void setEstadosInicialesModificacionLineasProductos(List<ModificacionLineasProductos> modificacionlineasproductossAux) throws Exception {
		ModificacionLineasProductosConstantesFunciones.setEstadosInicialesModificacionLineasProductos(modificacionlineasproductossAux);
	}
	
	public void setEstadosInicialesModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductosAux) throws Exception {
		ModificacionLineasProductosConstantesFunciones.setEstadosInicialesModificacionLineasProductos(modificacionlineasproductosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarModificacionLineasProductosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarModificacionLineasProductosActual()) {
				if(!this.isEsNuevoModificacionLineasProductos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoModificacionLineasProductos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarModificacionLineasProductosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Modificacion Lineas Productos ?", "MANTENIMIENTO DE Modificacion Lineas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ModificacionLineasProductos modificacionlineasproductos) throws Exception {
		ModificacionLineasProductosConstantesFunciones.seleccionarAsignar(this.modificacionlineasproductos,modificacionlineasproductos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarModificacionLineasProductos=this.isPermisoActualizarOriginalModificacionLineasProductos;
			
			
			this.seleccionarAsignar(modificacionlineasproductos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesModificacionLineasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.modificacionlineasproductosSessionBean.setsFuncionBusquedaRapida(this.modificacionlineasproductosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoModificacionLineasProductos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosModificacionLineasProductos(esParaCancelar);				
				this.cancelarNuevoModificacionLineasProductos(esParaCancelar);								
			}
			
			this.modificacionlineasproductos=new ModificacionLineasProductos();
			
			this.inicializarModificacionLineasProductos();
			
			this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarModificacionLineasProductos() throws Exception {
		try {
			ModificacionLineasProductosConstantesFunciones.inicializarModificacionLineasProductos(this.modificacionlineasproductos);
			
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
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.modificacionlineasproductosLogic.getModificacionLineasProductoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteModificacionLineasProductoss(String sAccionBusqueda,List<ModificacionLineasProductos> modificacionlineasproductossParaReportes) throws Exception {
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
					sPathReporteFinal="ModificacionLineasProductos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ModificacionLineasProductosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ModificacionLineasProductosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ModificacionLineasProductos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Modificacion Lineas Productoses");		
		parameters.put("busquedapor", ModificacionLineasProductosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceModificacionLineasProductos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
		} else {
		}
		
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceModificacionLineasProductos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ModificacionLineasProductosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ModificacionLineasProductosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ModificacionLineasProductosBean.TraerModificacionLineasProductosBeans(modificacionlineasproductossParaReportes).toArray()));
							
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
				this.generarExcelReporteModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductosActionPerformed(null);
					//this.generarExcelReporteModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesModificacionLineasProductoss(sAccionBusqueda,sTipoArchivoReporte,modificacionlineasproductossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteModificacionLineasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ModificacionLineasProductos> modificacionlineasproductossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModificacionLineasProductoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModificacionLineasProductos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ModificacionLineasProductos modificacionlineasproductos : modificacionlineasproductossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ModificacionLineasProductosConstantesFunciones.generarExcelReporteDataModificacionLineasProductos("NORMAL",row,workbook,modificacionlineasproductos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderModificacionLineasProductos(String sTipo,Row row,Workbook workbook) {
		
		ModificacionLineasProductosConstantesFunciones.generarExcelReporteHeaderModificacionLineasProductos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalModificacionLineasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ModificacionLineasProductos> modificacionlineasproductossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModificacionLineasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ModificacionLineasProductos modificacionlineasproductos : modificacionlineasproductossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ModificacionLineasProductosConstantesFunciones.getModificacionLineasProductosDescripcion(modificacionlineasproductos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getproducto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineadestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineagrupodestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineacategoriadestino_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(modificacionlineasproductos.getlineamarcadestino_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesModificacionLineasProductoss(String sAccionBusqueda,String sTipoArchivoReporte,List<ModificacionLineasProductos> modificacionlineasproductossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ModificacionLineasProductos> modificacionlineasproductossRespaldo=null;
		
		classes=ModificacionLineasProductosConstantesFunciones.getClassesRelationshipsOfModificacionLineasProductos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.modificacionlineasproductosLogic.setDatosCliente(this.datosCliente);
		this.modificacionlineasproductosLogic.setDatosDeep(this.datosDeep);
		this.modificacionlineasproductosLogic.setIsConDeep(true);
		
		modificacionlineasproductossRespaldo=this.modificacionlineasproductosLogic.getModificacionLineasProductoss();
		
		this.modificacionlineasproductosLogic.setModificacionLineasProductoss(modificacionlineasproductossParaReportes);	
		this.modificacionlineasproductosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		modificacionlineasproductossParaReportes=this.modificacionlineasproductosLogic.getModificacionLineasProductoss();
		this.modificacionlineasproductosLogic.setModificacionLineasProductoss(modificacionlineasproductossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ModificacionLineasProductoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderModificacionLineasProductos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ModificacionLineasProductos modificacionlineasproductos : modificacionlineasproductossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderModificacionLineasProductos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ModificacionLineasProductosConstantesFunciones.generarExcelReporteDataModificacionLineasProductos("NORMAL",row,workbook,modificacionlineasproductos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ModificacionLineasProductosConstantesFunciones.getModificacionLineasProductosDescripcion(modificacionlineasproductos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessModificacionLineasProductos() throws Exception {		
		this.startProcessModificacionLineasProductos(true);
	}
	
	public void startProcessModificacionLineasProductos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasModificacionLineasProductos ,this.jPanelParametrosReportesModificacionLineasProductos, this.jScrollPanelDatosModificacionLineasProductos,this.jPanelPaginacionModificacionLineasProductos, this.jScrollPanelDatosEdicionModificacionLineasProductos, this.jPanelAccionesModificacionLineasProductos,this.jPanelAccionesFormularioModificacionLineasProductos,this.jmenuBarModificacionLineasProductos,this.jmenuBarDetalleModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasModificacionLineasProductos=this.jTabbedPaneBusquedasModificacionLineasProductos; 
		
		final JPanel jPanelParametrosReportesModificacionLineasProductos=this.jPanelParametrosReportesModificacionLineasProductos;
		//final JScrollPane jScrollPanelDatosModificacionLineasProductos=this.jScrollPanelDatosModificacionLineasProductos;
		final JTable jTableDatosModificacionLineasProductos=this.jTableDatosModificacionLineasProductos;		
		final JPanel jPanelPaginacionModificacionLineasProductos=this.jPanelPaginacionModificacionLineasProductos;
		//final JScrollPane jScrollPanelDatosEdicionModificacionLineasProductos=this.jScrollPanelDatosEdicionModificacionLineasProductos;
		final JPanel jPanelAccionesModificacionLineasProductos=this.jPanelAccionesModificacionLineasProductos;
		
		JPanel jPanelCamposAuxiliarModificacionLineasProductos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarModificacionLineasProductos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			jPanelCamposAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelCamposModificacionLineasProductos;
			jPanelAccionesFormularioAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelAccionesFormularioModificacionLineasProductos;
		}
		
		final JPanel jPanelCamposModificacionLineasProductos=jPanelCamposAuxiliarModificacionLineasProductos;
		final JPanel jPanelAccionesFormularioModificacionLineasProductos=jPanelAccionesFormularioAuxiliarModificacionLineasProductos;
		
		
		final JMenuBar jmenuBarModificacionLineasProductos=this.jmenuBarModificacionLineasProductos;
		final JToolBar jTtoolBarModificacionLineasProductos=this.jTtoolBarModificacionLineasProductos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarModificacionLineasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModificacionLineasProductos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			jmenuBarDetalleAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jmenuBarDetalleModificacionLineasProductos;
			jTtoolBarDetalleAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jTtoolBarDetalleModificacionLineasProductos;
		}
		
		final JMenuBar jmenuBarDetalleModificacionLineasProductos=jmenuBarDetalleAuxiliarModificacionLineasProductos;
		final JToolBar jTtoolBarDetalleModificacionLineasProductos=jTtoolBarDetalleAuxiliarModificacionLineasProductos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModificacionLineasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModificacionLineasProductos;
			processRunnable.jTableDatos=jTableDatosModificacionLineasProductos;
			processRunnable.jPanelCampos=jPanelCamposModificacionLineasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionModificacionLineasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesModificacionLineasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModificacionLineasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarModificacionLineasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModificacionLineasProductos;
			processRunnable.jTtoolBar=jTtoolBarModificacionLineasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModificacionLineasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModificacionLineasProductos ,jPanelParametrosReportesModificacionLineasProductos,jTableDatosModificacionLineasProductos, /*jScrollPanelDatosModificacionLineasProductos,*/jPanelCamposModificacionLineasProductos,jPanelPaginacionModificacionLineasProductos, /*jScrollPanelDatosEdicionModificacionLineasProductos,*/ jPanelAccionesModificacionLineasProductos,jPanelAccionesFormularioModificacionLineasProductos,jmenuBarModificacionLineasProductos,jmenuBarDetalleModificacionLineasProductos,jTtoolBarModificacionLineasProductos,jTtoolBarDetalleModificacionLineasProductos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasModificacionLineasProductos ,jPanelParametrosReportesModificacionLineasProductos, jScrollPanelDatosModificacionLineasProductos,jPanelPaginacionModificacionLineasProductos, jScrollPanelDatosEdicionModificacionLineasProductos, jPanelAccionesModificacionLineasProductos,jPanelAccionesFormularioModificacionLineasProductos,jmenuBarModificacionLineasProductos,jmenuBarDetalleModificacionLineasProductos,jTtoolBarModificacionLineasProductos,jTtoolBarDetalleModificacionLineasProductos);
						
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
	
	public void finishProcessModificacionLineasProductos() {// throws Exception 
		this.finishProcessModificacionLineasProductos(true);
	}
	
	public void finishProcessModificacionLineasProductos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasModificacionLineasProductos ,this.jPanelParametrosReportesModificacionLineasProductos, this.jScrollPanelDatosModificacionLineasProductos,this.jPanelPaginacionModificacionLineasProductos, this.jScrollPanelDatosEdicionModificacionLineasProductos, this.jPanelAccionesModificacionLineasProductos,this.jPanelAccionesFormularioModificacionLineasProductos,this.jmenuBarModificacionLineasProductos,this.jmenuBarDetalleModificacionLineasProductos,this.jTtoolBarModificacionLineasProductos,this.jTtoolBarDetalleModificacionLineasProductos);		
		
		final JTabbedPane jTabbedPaneBusquedasModificacionLineasProductos=this.jTabbedPaneBusquedasModificacionLineasProductos; 
		
		final JPanel jPanelParametrosReportesModificacionLineasProductos=this.jPanelParametrosReportesModificacionLineasProductos;
		//final JScrollPane jScrollPanelDatosModificacionLineasProductos=this.jScrollPanelDatosModificacionLineasProductos;
		final JTable jTableDatosModificacionLineasProductos=this.jTableDatosModificacionLineasProductos;		
		final JPanel jPanelPaginacionModificacionLineasProductos=this.jPanelPaginacionModificacionLineasProductos;
		//final JScrollPane jScrollPanelDatosEdicionModificacionLineasProductos=this.jScrollPanelDatosEdicionModificacionLineasProductos;
		final JPanel jPanelAccionesModificacionLineasProductos=this.jPanelAccionesModificacionLineasProductos;
		
		JPanel jPanelCamposAuxiliarModificacionLineasProductos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarModificacionLineasProductos=new JPanel();
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			jPanelCamposAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelCamposModificacionLineasProductos;
			jPanelAccionesFormularioAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelAccionesFormularioModificacionLineasProductos;
		}
		
		final JPanel jPanelCamposModificacionLineasProductos=jPanelCamposAuxiliarModificacionLineasProductos;
		final JPanel jPanelAccionesFormularioModificacionLineasProductos=jPanelAccionesFormularioAuxiliarModificacionLineasProductos;
		
		
		final JMenuBar jmenuBarModificacionLineasProductos=this.jmenuBarModificacionLineasProductos;		
		final JToolBar jTtoolBarModificacionLineasProductos=this.jTtoolBarModificacionLineasProductos;
				
		JMenuBar jmenuBarDetalleAuxiliarModificacionLineasProductos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarModificacionLineasProductos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			jmenuBarDetalleAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jmenuBarDetalleModificacionLineasProductos;
			jTtoolBarDetalleAuxiliarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jTtoolBarDetalleModificacionLineasProductos;		
		}
		
		final JMenuBar jmenuBarDetalleModificacionLineasProductos=jmenuBarDetalleAuxiliarModificacionLineasProductos;
		final JToolBar jTtoolBarDetalleModificacionLineasProductos=jTtoolBarDetalleAuxiliarModificacionLineasProductos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasModificacionLineasProductos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesModificacionLineasProductos;
			processRunnable.jTableDatos=jTableDatosModificacionLineasProductos;
			processRunnable.jPanelCampos=jPanelCamposModificacionLineasProductos;
			processRunnable.jPanelPaginacion=jPanelPaginacionModificacionLineasProductos;
			processRunnable.jPanelAcciones=jPanelAccionesModificacionLineasProductos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioModificacionLineasProductos;
			
			
			processRunnable.jmenuBar=jmenuBarModificacionLineasProductos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleModificacionLineasProductos;
			processRunnable.jTtoolBar=jTtoolBarModificacionLineasProductos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleModificacionLineasProductos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasModificacionLineasProductos ,jPanelParametrosReportesModificacionLineasProductos, jTableDatosModificacionLineasProductos,/*jScrollPanelDatosModificacionLineasProductos,*/jPanelCamposModificacionLineasProductos,jPanelPaginacionModificacionLineasProductos, /*jScrollPanelDatosEdicionModificacionLineasProductos,*/ jPanelAccionesModificacionLineasProductos,jPanelAccionesFormularioModificacionLineasProductos,jmenuBarModificacionLineasProductos,jmenuBarDetalleModificacionLineasProductos,jTtoolBarModificacionLineasProductos,jTtoolBarDetalleModificacionLineasProductos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesModificacionLineasProductos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarModificacionLineasProductos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuModificacionLineasProductos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarModificacionLineasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarModificacionLineasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleModificacionLineasProductos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuModificacionLineasProductos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarModificacionLineasProductos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleModificacionLineasProductos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.modificacionlineasproductosConstantesFunciones.getsFinalQueryModificacionLineasProductos();
		String  finalQueryPaginacionTodos=this.modificacionlineasproductosConstantesFunciones.getsFinalQueryModificacionLineasProductos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ModificacionLineasProductosConstantesFunciones.getArrayColumnasGlobalesNoModificacionLineasProductos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ModificacionLineasProductosConstantesFunciones.getArrayColumnasGlobalesModificacionLineasProductos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ModificacionLineasProductosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.modificacionlineasproductossEliminados= new ArrayList<ModificacionLineasProductos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessModificacionLineasProductos();
		
				///*ModificacionLineasProductosSessionBean*/this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			
			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
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
					this.iNumeroPaginacion=ModificacionLineasProductosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ModificacionLineasProductosConstantesFunciones.getClassesForeignKeysOfModificacionLineasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/modificacionlineasproductos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			modificacionlineasproductossAux= new ArrayList<ModificacionLineasProductos>();
			
				
			modificacionlineasproductosLogic.setDatosCliente(this.datosCliente);
			modificacionlineasproductosLogic.setDatosDeep(this.datosDeep);
			modificacionlineasproductosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaModificacionLineasProductos")) {
				this.sDetalleReporte=ModificacionLineasProductosConstantesFunciones.getDetalleIndiceBusquedaModificacionLineasProductos(id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					modificacionlineasproductosLogic.getModificacionLineasProductossBusquedaModificacionLineasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModificacionLineasProductosConstantesFunciones.getDetalleIndiceBusquedaModificacionLineasProductos(id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModificacionLineasProductosConstantesFunciones.getDetalleIndiceBusquedaModificacionLineasProductos(id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=modificacionlineasproductosLogic.getModificacionLineasProductoss()==null||modificacionlineasproductosLogic.getModificacionLineasProductoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=modificacionlineasproductoss==null|| modificacionlineasproductoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						modificacionlineasproductossAux=new ArrayList<ModificacionLineasProductos>();
						modificacionlineasproductossAux.addAll(modificacionlineasproductosLogic.getModificacionLineasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modificacionlineasproductossAux=new ArrayList<ModificacionLineasProductos>();
							modificacionlineasproductossAux.addAll(modificacionlineasproductoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							modificacionlineasproductosLogic.getModificacionLineasProductossBusquedaModificacionLineasProductos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ModificacionLineasProductosConstantesFunciones.getDetalleIndiceBusquedaModificacionLineasProductos(id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ModificacionLineasProductosConstantesFunciones.getDetalleIndiceBusquedaModificacionLineasProductos(id_productoBusquedaModificacionLineasProductos,id_lineaBusquedaModificacionLineasProductos,id_linea_grupoBusquedaModificacionLineasProductos,id_linea_categoriaBusquedaModificacionLineasProductos,id_linea_marcaBusquedaModificacionLineasProductos,id_linea_destinoBusquedaModificacionLineasProductos,id_linea_grupo_destinoBusquedaModificacionLineasProductos,id_linea_categoria_destinoBusquedaModificacionLineasProductos,id_linea_marca_destinoBusquedaModificacionLineasProductos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteModificacionLineasProductoss("BusquedaModificacionLineasProductos",modificacionlineasproductosLogic.getModificacionLineasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteModificacionLineasProductoss("BusquedaModificacionLineasProductos",modificacionlineasproductoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						modificacionlineasproductosLogic.setModificacionLineasProductoss(new ArrayList<ModificacionLineasProductos>());
						modificacionlineasproductosLogic.getModificacionLineasProductoss().addAll(modificacionlineasproductossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modificacionlineasproductoss=new ArrayList<ModificacionLineasProductos>();
							modificacionlineasproductoss.addAll(modificacionlineasproductossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesModificacionLineasProductos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","PROCESOS",JOptionPane.INFORMATION_MESSAGE);
		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessModificacionLineasProductos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=modificacionlineasproductosLogic.getModificacionLineasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modificacionlineasproductoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=modificacionlineasproductosLogic.getModificacionLineasProductoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=modificacionlineasproductoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ModificacionLineasProductos modificacionlineasproductos) {
		Boolean permite=true;
		
		if(this.modificacionlineasproductos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ModificacionLineasProductosConstantesFunciones.getOrderByListaModificacionLineasProductos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ModificacionLineasProductosConstantesFunciones.getOrderByListaModificacionLineasProductos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				if(modificacionlineasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					modificacionlineasproductosTotales=modificacionlineasproductos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModificacionLineasProductos modificacionlineasproductos:this.modificacionlineasproductoss) {
				if(modificacionlineasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					modificacionlineasproductosTotales=modificacionlineasproductos;
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
			this.modificacionlineasproductosAux=new ModificacionLineasProductos();
			this.modificacionlineasproductosAux.setsType(Constantes2.S_TOTALES);
			this.modificacionlineasproductosAux.setIsNew(false);
			this.modificacionlineasproductosAux.setIsChanged(false);
			this.modificacionlineasproductosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ModificacionLineasProductosConstantesFunciones.TotalizarValoresFilaModificacionLineasProductos(this.modificacionlineasproductosLogic.getModificacionLineasProductoss(),this.modificacionlineasproductosAux);
				
				//this.modificacionlineasproductosLogic.getModificacionLineasProductoss().add(this.modificacionlineasproductosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ModificacionLineasProductosConstantesFunciones.TotalizarValoresFilaModificacionLineasProductos(this.modificacionlineasproductoss,this.modificacionlineasproductosAux);
				
				this.modificacionlineasproductoss.add(this.modificacionlineasproductosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		modificacionlineasproductosTotales=new ModificacionLineasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modificacionlineasproductosLogic.getModificacionLineasProductoss().remove(modificacionlineasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.modificacionlineasproductoss.remove(modificacionlineasproductosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		modificacionlineasproductosTotales=new ModificacionLineasProductos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				if(modificacionlineasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					modificacionlineasproductosTotales=modificacionlineasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModificacionLineasProductosConstantesFunciones.TotalizarValoresFilaModificacionLineasProductos(this.modificacionlineasproductosLogic.getModificacionLineasProductoss(),modificacionlineasproductosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ModificacionLineasProductos modificacionlineasproductos:this.modificacionlineasproductoss) {
				if(modificacionlineasproductos.getsType().equals(Constantes2.S_TOTALES)) {
					modificacionlineasproductosTotales=modificacionlineasproductos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ModificacionLineasProductosConstantesFunciones.TotalizarValoresFilaModificacionLineasProductos(this.modificacionlineasproductoss,modificacionlineasproductosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getModificacionLineasProductossBusquedaModificacionLineasProductos()throws Exception {
		try {
			sAccionBusqueda="BusquedaModificacionLineasProductos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaCategoriaDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoriaDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaGrupoDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupoDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdLineaMarcaDestino()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarcaDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getModificacionLineasProductossFK_IdProducto()throws Exception {
		try {
			sAccionBusqueda="FK_IdProducto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getModificacionLineasProductossBusquedaModificacionLineasProductos(String sFinalQuery,Long id_producto,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Long id_linea_destino,Long id_linea_grupo_destino,Long id_linea_categoria_destino,Long id_linea_marca_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossBusquedaModificacionLineasProductos(sFinalQuery,this.pagination,id_producto,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,id_linea_destino,id_linea_grupo_destino,id_linea_categoria_destino,id_linea_marca_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaCategoriaDestino(String sFinalQuery,Long id_linea_categoria_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaCategoriaDestino(sFinalQuery,this.pagination,id_linea_categoria_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaDestino(String sFinalQuery,Long id_linea_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaDestino(sFinalQuery,this.pagination,id_linea_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaGrupoDestino(String sFinalQuery,Long id_linea_grupo_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaGrupoDestino(sFinalQuery,this.pagination,id_linea_grupo_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdLineaMarcaDestino(String sFinalQuery,Long id_linea_marca_destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdLineaMarcaDestino(sFinalQuery,this.pagination,id_linea_marca_destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getModificacionLineasProductossFK_IdProducto(String sFinalQuery,Long id_producto)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//modificacionlineasproductosLogic.getModificacionLineasProductossFK_IdProducto(sFinalQuery,this.pagination,id_producto);
				
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
	
	public void inicializarPermisosModificacionLineasProductos() {
		this.isPermisoTodoModificacionLineasProductos=false;
		this.isPermisoNuevoModificacionLineasProductos=false;
		this.isPermisoActualizarModificacionLineasProductos=false;
		this.isPermisoActualizarOriginalModificacionLineasProductos=false;
		this.isPermisoEliminarModificacionLineasProductos=false;
		this.isPermisoGuardarCambiosModificacionLineasProductos=false;
		this.isPermisoConsultaModificacionLineasProductos=true;
		this.isPermisoBusquedaModificacionLineasProductos=true;
		this.isPermisoReporteModificacionLineasProductos=true;
		this.isPermisoOrdenModificacionLineasProductos=false;		
		this.isPermisoPaginacionMedioModificacionLineasProductos=false;		
		this.isPermisoPaginacionAltoModificacionLineasProductos=false;		
		this.isPermisoPaginacionTodoModificacionLineasProductos=false;		
		this.isPermisoCopiarModificacionLineasProductos=false;		
		this.isPermisoVerFormModificacionLineasProductos=false;		
		this.isPermisoDuplicarModificacionLineasProductos=false;
		this.isPermisoOrdenModificacionLineasProductos=false;
	}
	
	public void setPermisosUsuarioModificacionLineasProductos(Boolean isPermiso) {
		this.isPermisoTodoModificacionLineasProductos=isPermiso;
		this.isPermisoNuevoModificacionLineasProductos=isPermiso;
		this.isPermisoActualizarModificacionLineasProductos=isPermiso;
		this.isPermisoActualizarOriginalModificacionLineasProductos=isPermiso;
		this.isPermisoEliminarModificacionLineasProductos=isPermiso;
		this.isPermisoGuardarCambiosModificacionLineasProductos=isPermiso;
		this.isPermisoConsultaModificacionLineasProductos=isPermiso;
		this.isPermisoBusquedaModificacionLineasProductos=isPermiso;
		this.isPermisoReporteModificacionLineasProductos=isPermiso;
		this.isPermisoOrdenModificacionLineasProductos=isPermiso;		
		this.isPermisoPaginacionMedioModificacionLineasProductos=isPermiso;		
		this.isPermisoPaginacionAltoModificacionLineasProductos=isPermiso;		
		this.isPermisoPaginacionTodoModificacionLineasProductos=isPermiso;		
		this.isPermisoCopiarModificacionLineasProductos=isPermiso;		
		this.isPermisoVerFormModificacionLineasProductos=isPermiso;		
		this.isPermisoDuplicarModificacionLineasProductos=isPermiso;
		this.isPermisoOrdenModificacionLineasProductos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioModificacionLineasProductos(Boolean isPermiso) {
		//this.isPermisoTodoModificacionLineasProductos=isPermiso;
		this.isPermisoNuevoModificacionLineasProductos=isPermiso;
		this.isPermisoActualizarModificacionLineasProductos=isPermiso;
		this.isPermisoActualizarOriginalModificacionLineasProductos=isPermiso;
		this.isPermisoEliminarModificacionLineasProductos=isPermiso;
		this.isPermisoGuardarCambiosModificacionLineasProductos=isPermiso;
		//this.isPermisoConsultaModificacionLineasProductos=isPermiso;
		//this.isPermisoBusquedaModificacionLineasProductos=isPermiso;
		//this.isPermisoReporteModificacionLineasProductos=isPermiso;
		//this.isPermisoOrdenModificacionLineasProductos=isPermiso;		
		//this.isPermisoPaginacionMedioModificacionLineasProductos=isPermiso;		
		//this.isPermisoPaginacionAltoModificacionLineasProductos=isPermiso;		
		//this.isPermisoPaginacionTodoModificacionLineasProductos=isPermiso;		
		//this.isPermisoCopiarModificacionLineasProductos=isPermiso;		
		//this.isPermisoDuplicarModificacionLineasProductos=isPermiso;
		//this.isPermisoOrdenModificacionLineasProductos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioModificacionLineasProductosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ModificacionLineasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioModificacionLineasProductosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioModificacionLineasProductosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionModificacionLineasProductosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioModificacionLineasProductosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioModificacionLineasProductos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ModificacionLineasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ModificacionLineasProductosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoModificacionLineasProductos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarModificacionLineasProductos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalModificacionLineasProductos=this.isPermisoActualizarModificacionLineasProductos;
			this.isPermisoEliminarModificacionLineasProductos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosModificacionLineasProductos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaModificacionLineasProductos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaModificacionLineasProductos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoModificacionLineasProductos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteModificacionLineasProductos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModificacionLineasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioModificacionLineasProductos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoModificacionLineasProductos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoModificacionLineasProductos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarModificacionLineasProductos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormModificacionLineasProductos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarModificacionLineasProductos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenModificacionLineasProductos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosModificacionLineasProductos.setToolTipText(this.jTableDatosModificacionLineasProductos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioModificacionLineasProductos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioModificacionLineasProductos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ModificacionLineasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ModificacionLineasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioModificacionLineasProductos() throws Exception {
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
	public void inicializarCombosForeignKeyModificacionLineasProductosListas()throws Exception {
		try	{						
			
				this.productosForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.lineadestinosForeignKey=new ArrayList();
				this.lineagrupodestinosForeignKey=new ArrayList();
				this.lineacategoriadestinosForeignKey=new ArrayList();
				this.lineamarcadestinosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyModificacionLineasProductosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ModificacionLineasProductosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyProductoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyLineaDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineadestinosForeignKey==null||this.lineadestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineagrupodestinosForeignKey==null||this.lineagrupodestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGrupoDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineacategoriadestinosForeignKey==null||this.lineacategoriadestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriaDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaDestinoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineamarcadestinosForeignKey==null||this.lineamarcadestinosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcaDestinosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyModificacionLineasProductos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyProducto();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyLineaDestino();
			this.addItemDefectoCombosForeignKeyLineaGrupoDestino();
			this.addItemDefectoCombosForeignKeyLineaCategoriaDestino();
			this.addItemDefectoCombosForeignKeyLineaMarcaDestino();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyProducto()throws Exception {
		try {
			if(this.modificacionlineasproductosSessionBean==null) {
				this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean();
			}

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionProducto()) {
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

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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

	public void addItemDefectoCombosForeignKeyLineaDestino()throws Exception {
		try {

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaDestino()) {
				Linea lineadestino=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineadestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineadestino.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineadestinosForeignKey,lineadestino,true)) {

					this.lineadestinosForeignKey.add(0,lineadestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaGrupoDestino()throws Exception {
		try {

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupoDestino()) {
				Linea lineagrupodestino=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupodestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupodestino.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagrupodestinosForeignKey,lineagrupodestino,true)) {

					this.lineagrupodestinosForeignKey.add(0,lineagrupodestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoriaDestino()throws Exception {
		try {

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoriaDestino()) {
				Linea lineacategoriadestino=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoriadestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoriadestino.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriadestinosForeignKey,lineacategoriadestino,true)) {

					this.lineacategoriadestinosForeignKey.add(0,lineacategoriadestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarcaDestino()throws Exception {
		try {

			if(!this.modificacionlineasproductosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarcaDestino()) {
				Linea lineamarcadestino=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarcadestino,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarcadestino.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcadestinosForeignKey,lineamarcadestino,true)) {

					this.lineamarcadestinosForeignKey.add(0,lineamarcadestino);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyModificacionLineasProductos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyModificacionLineasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyModificacionLineasProductos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyModificacionLineasProductos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos)throws Exception {	
		try {
			
			this.setActualProductoForeignKey(modificacionlineasproductos.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(modificacionlineasproductos.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(modificacionlineasproductos.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(modificacionlineasproductos.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(modificacionlineasproductos.getid_linea_marca(),false,"Formulario");
			this.setActualLineaDestinoForeignKey(modificacionlineasproductos.getid_linea_destino(),false,"Formulario");
			this.setActualLineaGrupoDestinoForeignKey(modificacionlineasproductos.getid_linea_grupo_destino(),false,"Formulario");
			this.setActualLineaCategoriaDestinoForeignKey(modificacionlineasproductos.getid_linea_categoria_destino(),false,"Formulario");
			this.setActualLineaMarcaDestinoForeignKey(modificacionlineasproductos.getid_linea_marca_destino(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyModificacionLineasProductos()throws Exception {	
		try {
			
			this.setActualProductoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_producto(),false,"Formulario");
			this.setActualLineaForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_marca(),false,"Formulario");
			this.setActualLineaDestinoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_destino(),false,"Formulario");
			this.setActualLineaGrupoDestinoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_grupo_destino(),false,"Formulario");
			this.setActualLineaCategoriaDestinoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_categoria_destino(),false,"Formulario");
			this.setActualLineaMarcaDestinoForeignKey(this.modificacionlineasproductosConstantesFunciones.getid_linea_marca_destino(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyModificacionLineasProductos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyModificacionLineasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyModificacionLineasProductos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroModificacionLineasProductos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyModificacionLineasProductos()throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameLineaDestinosForeignKey("Todos");
			this.cargarCombosFrameLineaGrupoDestinosForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriaDestinosForeignKey("Todos");
			this.cargarCombosFrameLineaMarcaDestinosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyModificacionLineasProductos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameProductosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGrupoDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriaDestinosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcaDestinosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyModificacionLineasProductos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.getItemCount()>0) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public ModificacionLineasProductosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ModificacionLineasProductosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ModificacionLineasProductosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.modificacionlineasproductosSessionBean=new ModificacionLineasProductosSessionBean(); 
		this.modificacionlineasproductosConstantesFunciones=new ModificacionLineasProductosConstantesFunciones(); 
		this.modificacionlineasproductosBean=new ModificacionLineasProductos();//(this.modificacionlineasproductosConstantesFunciones); 		
		this.modificacionlineasproductosReturnGeneral=new ModificacionLineasProductosParameterReturnGeneral(); 
		
		this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.modificacionlineasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ModificacionLineasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ModificacionLineasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ModificacionLineasProductosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessModificacionLineasProductos(true);
			
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
			
			this.modificacionlineasproductosConstantesFunciones=new ModificacionLineasProductosConstantesFunciones(); 
			this.modificacionlineasproductosBean=new ModificacionLineasProductos();//this.modificacionlineasproductosConstantesFunciones); 			
			this.modificacionlineasproductosReturnGeneral=new ModificacionLineasProductosParameterReturnGeneral(); 
		
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Modificacion Lineas Productos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.modificacionlineasproductos=new ModificacionLineasProductos();
			this.modificacionlineasproductoss = new ArrayList<ModificacionLineasProductos>();
			this.modificacionlineasproductossAux = new ArrayList<ModificacionLineasProductos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic=new ModificacionLineasProductosLogic();
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.modificacionlineasproductosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.modificacionlineasproductosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormModificacionLineasProductos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModificacionLineasProductos);	
					}
					
					if(this.jInternalFrameImportacionModificacionLineasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModificacionLineasProductos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByModificacionLineasProductos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByModificacionLineasProductos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormModificacionLineasProductos);
				this.jInternalFrameDetalleFormModificacionLineasProductos.setVisible(false);
				this.jInternalFrameDetalleFormModificacionLineasProductos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModificacionLineasProductos);
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.setVisible(false);
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionModificacionLineasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionModificacionLineasProductos);
					this.jInternalFrameImportacionModificacionLineasProductos.setVisible(false);
					this.jInternalFrameImportacionModificacionLineasProductos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByModificacionLineasProductos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByModificacionLineasProductos);
					this.jInternalFrameOrderByModificacionLineasProductos.setVisible(false);
					this.jInternalFrameOrderByModificacionLineasProductos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idModificacionLineasProductosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ModificacionLineasProductosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.modificacionlineasproductosReturnGeneral=new ModificacionLineasProductosParameterReturnGeneral();
			
			this.modificacionlineasproductosParameterGeneral=new ModificacionLineasProductosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.modificacionlineasproductosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ModificacionLineasProductosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModificacionLineasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado(),this.modificacionlineasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ModificacionLineasProductosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado(),this.modificacionlineasproductosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaDuplicarModificacionLineasProductos=true;
			this.isVisibilidadCeldaCopiarModificacionLineasProductos=true;
			this.isVisibilidadCeldaVerFormModificacionLineasProductos=true;
			this.isVisibilidadCeldaOrdenModificacionLineasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			
			
			this.isVisibilidadBusquedaModificacionLineasProductos=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaCategoriaDestino=true;
			this.isVisibilidadFK_IdLineaDestino=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaGrupoDestino=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdLineaMarcaDestino=true;
			this.isVisibilidadFK_IdProducto=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosModificacionLineasProductos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioModificacionLineasProductos(false);
			
			this.setPermisosUsuarioModificacionLineasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() 
				|| (this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado() && this.modificacionlineasproductosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioModificacionLineasProductosClasesRelacionadas();
			}
			
			if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioModificacionLineasProductosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosModificacionLineasProductos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualModificacionLineasProductos();
			}
			
			if(!this.isPermisoBusquedaModificacionLineasProductos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ModificacionLineasProductosConstantesFunciones.getTiposSeleccionarModificacionLineasProductos());
				
				this.tiposColumnasSelect=ModificacionLineasProductosConstantesFunciones.getTiposSeleccionarModificacionLineasProductos(true);
				
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
			//if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioModificacionLineasProductos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioModificacionLineasProductos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioModificacionLineasProductos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesModificacionLineasProductos() ;
			
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
			
			this.productoLogic=new ProductoLogic();
			this.lineaLogic=new LineaLogic();
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
			this.lineadestinoLogic=new LineaLogic();
			this.lineagrupodestinoLogic=new LineaLogic();
			this.lineacategoriadestinoLogic=new LineaLogic();
			this.lineamarcadestinoLogic=new LineaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				modificacionlineasproductosImplementable= (ModificacionLineasProductosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModificacionLineasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				modificacionlineasproductosImplementableHome= (ModificacionLineasProductosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ModificacionLineasProductosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.modificacionlineasproductoss= new ArrayList<ModificacionLineasProductos>();
			this.modificacionlineasproductossEliminados= new ArrayList<ModificacionLineasProductos>();
						
			this.isEsNuevoModificacionLineasProductos=false;
			this.esParaAccionDesdeFormularioModificacionLineasProductos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.productosForeignKey=new ArrayList<Producto>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.lineadestinosForeignKey=new ArrayList<Linea>() ;
			this.lineagrupodestinosForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriadestinosForeignKey=new ArrayList<Linea>() ;
			this.lineamarcadestinosForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyModificacionLineasProductos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroModificacionLineasProductos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ModificacionLineasProductosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesModificacionLineasProductos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingModificacionLineasProductos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioModificacionLineasProductos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioModificacionLineasProductos();
			}
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasModificacionLineasProductos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasModificacionLineasProductos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasModificacionLineasProductos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessModificacionLineasProductos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ModificacionLineasProductos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectModificacionLineasProductos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesModificacionLineasProductos")) {
				iIndex=this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessModificacionLineasProductos();	
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
	
	public void cargarCombosForeignKeyModificacionLineasProductos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyModificacionLineasProductos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyModificacionLineasProductos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyModificacionLineasProductosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyModificacionLineasProductos();
		
		this.cargarCombosFrameForeignKeyModificacionLineasProductos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyModificacionLineasProductos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyModificacionLineasProductos();
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

	public void cargarCombosForeignKeyLineaDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaDestino();
				this.cargarCombosFrameLineaDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaDestino(this.lineadestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupoDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupoDestino();
				this.cargarCombosFrameLineaGrupoDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaGrupoDestino(this.lineagrupodestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoriaDestino();
				this.cargarCombosFrameLineaCategoriaDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaCategoriaDestino(this.lineacategoriadestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaDestino(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaDestinoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarcaDestino();
				this.cargarCombosFrameLineaMarcaDestinosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLineaMarcaDestino(this.lineamarcadestinosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoModificacionLineasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			
			if(jTableDatosModificacionLineasProductos.getRowCount()>=1) {
				jTableDatosModificacionLineasProductos.removeRowSelectionInterval(0, jTableDatosModificacionLineasProductos.getRowCount()-1);						
			}
			
			this.isEsNuevoModificacionLineasProductos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoModificacionLineasProductos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesModificacionLineasProductos(true);			
			//this.modificacionlineasproductos=new ModificacionLineasProductos();
			//this.modificacionlineasproductos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModificacionLineasProductos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos() ;
			
			if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModificacionLineasProductos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.modificacionlineasproductos);	
			this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);				
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ModificacionLineasProductos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarModificacionLineasProductosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosModificacionLineasProductos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosModificacionLineasProductos.getSelectedRows().length;			
			}
			
			modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoModificacionLineasProductos--;			
				//ModificacionLineasProductos modificacionlineasproductosAux= new ModificacionLineasProductos();			
				//modificacionlineasproductosAux.setId(this.iIdNuevoModificacionLineasProductos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ModificacionLineasProductos modificacionlineasproductosOrigen=new ModificacionLineasProductos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ModificacionLineasProductos modificacionlineasproductosOrigen : modificacionlineasproductossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							modificacionlineasproductosOrigen =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							modificacionlineasproductosOrigen =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaModificacionLineasProductos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.modificacionlineasproductos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosModificacionLineasProductos(modificacionlineasproductosOrigen,this.modificacionlineasproductos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.modificacionlineasproductosLogic.getModificacionLineasProductoss().add(this.modificacionlineasproductosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductoss.add(this.modificacionlineasproductosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
				
				this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(this.getIndiceNuevoModificacionLineasProductos(), this.getIndiceNuevoModificacionLineasProductos());
				
				int iLastRow =  this.jTableDatosModificacionLineasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModificacionLineasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModificacionLineasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();									
		
			ModificacionLineasProductos modificacionlineasproductosOrigen=new ModificacionLineasProductos();
			ModificacionLineasProductos modificacionlineasproductosDestino=new ModificacionLineasProductos();
				
			modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosModificacionLineasProductos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || modificacionlineasproductossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosModificacionLineasProductos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modificacionlineasproductosOrigen =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						modificacionlineasproductosOrigen =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						modificacionlineasproductosDestino =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						modificacionlineasproductosDestino =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				modificacionlineasproductosOrigen =modificacionlineasproductossSeleccionados.get(0);
				modificacionlineasproductosDestino =modificacionlineasproductossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosModificacionLineasProductos(modificacionlineasproductosOrigen,modificacionlineasproductosDestino,true,false);
				
				modificacionlineasproductosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(modificacionlineasproductosDestino,modificacionlineasproductosLogic.getModificacionLineasProductoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(modificacionlineasproductosDestino,modificacionlineasproductoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
				
				//this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(this.getIndiceNuevoModificacionLineasProductos(), this.getIndiceNuevoModificacionLineasProductos());
				
				int iLastRow =  this.jTableDatosModificacionLineasProductos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosModificacionLineasProductos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosModificacionLineasProductos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesModificacionLineasProductos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesModificacionLineasProductos.setVisible(!isVisible);
			this.jPanelPaginacionModificacionLineasProductos.setVisible(!isVisible);
			this.jPanelAccionesModificacionLineasProductos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameModificacionLineasProductos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoModificacionLineasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionModificacionLineasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByModificacionLineasProductos();
			
			this.abrirFrameOrderByModificacionLineasProductos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByModificacionLineasProductos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleModificacionLineasProductos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormModificacionLineasProductos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormModificacionLineasProductos.isMaximum()) {
					this.jInternalFrameDetalleFormModificacionLineasProductos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormModificacionLineasProductos.setSize(this.jInternalFrameDetalleFormModificacionLineasProductos.iWidthFormulario,this.jInternalFrameDetalleFormModificacionLineasProductos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormModificacionLineasProductos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormModificacionLineasProductos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormModificacionLineasProductos.isMaximum()) {
						this.jInternalFrameDetalleFormModificacionLineasProductos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormModificacionLineasProductos.jContentPaneDetalleModificacionLineasProductos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormModificacionLineasProductos.jContentPaneDetalleModificacionLineasProductos.getWidth(),ModificacionLineasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormModificacionLineasProductos.jContentPaneDetalleModificacionLineasProductos.getWidth(),ModificacionLineasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormModificacionLineasProductos.jContentPaneDetalleModificacionLineasProductos.getWidth(),ModificacionLineasProductosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormModificacionLineasProductos.setVisible(true);
	        this.jInternalFrameDetalleFormModificacionLineasProductos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByModificacionLineasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByModificacionLineasProductos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByModificacionLineasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModificacionLineasProductos,false,this);
				} else {
					this.jInternalFrameOrderByModificacionLineasProductos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByModificacionLineasProductos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByModificacionLineasProductos);
				this.jInternalFrameOrderByModificacionLineasProductos.setVisible(false);
				this.jInternalFrameOrderByModificacionLineasProductos.setSelected(false);
				
				this.jInternalFrameOrderByModificacionLineasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModificacionLineasProductos"));
				
				this.inicializarActualizarBindingTablaOrderByModificacionLineasProductos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionModificacionLineasProductos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionModificacionLineasProductos==null) {
				
				this.jInternalFrameImportacionModificacionLineasProductos=new ImportacionJInternalFrame(ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionModificacionLineasProductos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionModificacionLineasProductos);
				this.jInternalFrameImportacionModificacionLineasProductos.setVisible(false);
				this.jInternalFrameImportacionModificacionLineasProductos.setSelected(false);


				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModificacionLineasProductos"));
				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModificacionLineasProductos"));
				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModificacionLineasProductos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoModificacionLineasProductos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoModificacionLineasProductos==null) {
				this.jInternalFrameReporteDinamicoModificacionLineasProductos=new ReporteDinamicoJInternalFrame(ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoModificacionLineasProductos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoModificacionLineasProductos);
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.setVisible(false);
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModificacionLineasProductos"));
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModificacionLineasProductos"));
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModificacionLineasProductos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModificacionLineasProductos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleModificacionLineasProductos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormModificacionLineasProductos);
			
	       	this.jInternalFrameDetalleFormModificacionLineasProductos.setVisible(false);
	        this.jInternalFrameDetalleFormModificacionLineasProductos.setSelected(false);
			
			//this.jInternalFrameDetalleFormModificacionLineasProductos.dispose();
			//this.jInternalFrameDetalleFormModificacionLineasProductos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoModificacionLineasProductos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoModificacionLineasProductos.setVisible(true);
	        this.jInternalFrameReporteDinamicoModificacionLineasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionModificacionLineasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionModificacionLineasProductos.setVisible(true);
	        this.jInternalFrameImportacionModificacionLineasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByModificacionLineasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByModificacionLineasProductos.setVisible(true);
	        this.jInternalFrameOrderByModificacionLineasProductos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByModificacionLineasProductos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByModificacionLineasProductos.setVisible(false);
	        this.jInternalFrameOrderByModificacionLineasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoModificacionLineasProductos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoModificacionLineasProductos.setVisible(false);
	        this.jInternalFrameReporteDinamicoModificacionLineasProductos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionModificacionLineasProductos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionModificacionLineasProductos.setVisible(false);
	        this.jInternalFrameImportacionModificacionLineasProductos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarModificacionLineasProductos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarModificacionLineasProductos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesModificacionLineasProductos(true);
			//this.isEsNuevoModificacionLineasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesModificacionLineasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModificacionLineasProductos(false) ;
			
			if(modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModificacionLineasProductos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaModificacionLineasProductosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarModificacionLineasProductos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesModificacionLineasProductos(true);
			//this.isEsNuevoModificacionLineasProductos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.modificacionlineasproductos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesModificacionLineasProductos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesModificacionLineasProductos(false) ;
			
			if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleModificacionLineasProductos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaProducto(List<Producto> productosForeignKey)throws Exception{
		TableColumn tableColumnProducto=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO));
		TableCellEditor tableCellEditorProducto =tableColumnProducto.getCellEditor();

		ProductoTableCell productoTableCellFk=(ProductoTableCell)tableCellEditorProducto;

		if(productoTableCellFk!=null) {
			productoTableCellFk.setproductosForeignKey(productosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaDestino(List<Linea> lineadestinosForeignKey)throws Exception{
		TableColumn tableColumnLineaDestino=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO));
		TableCellEditor tableCellEditorLineaDestino =tableColumnLineaDestino.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaDestino;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineadestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineadestinosForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupoDestino(List<Linea> lineagrupodestinosForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupoDestino=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO));
		TableCellEditor tableCellEditorLineaGrupoDestino =tableColumnLineaGrupoDestino.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupoDestino;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagrupodestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagrupodestinosForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoriaDestino(List<Linea> lineacategoriadestinosForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoriaDestino=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO));
		TableCellEditor tableCellEditorLineaCategoriaDestino =tableColumnLineaCategoriaDestino.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoriaDestino;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriadestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriadestinosForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarcaDestino(List<Linea> lineamarcadestinosForeignKey)throws Exception{
		TableColumn tableColumnLineaMarcaDestino=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO));
		TableCellEditor tableCellEditorLineaMarcaDestino =tableColumnLineaMarcaDestino.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarcaDestino;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcadestinosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcadestinosForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesModificacionLineasProductos(false);
			
			//if(!this.isEsNuevoModificacionLineasProductos) {								
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				
			}
			
			if(this.permiteMantenimiento(this.modificacionlineasproductos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoModificacionLineasProductos=true;
					this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
					this.isEsNuevoModificacionLineasProductos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoModificacionLineasProductos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoModificacionLineasProductos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModificacionLineasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(false);
				
				this.habilitarDeshabilitarControlesModificacionLineasProductos(false);
			
												
				
				if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleModificacionLineasProductos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoModificacionLineasProductosActionPerformed(evt,modificacionlineasproductosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualModificacionLineasProductos(this.modificacionlineasproductos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,modificacionlineasproductosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.modificacionlineasproductos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				this.modificacionlineasproductos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				this.modificacionlineasproductos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.modificacionlineasproductos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ModificacionLineasProductosModel) this.jTableDatosModificacionLineasProductos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoModificacionLineasProductos=true;
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
				this.isEsNuevoModificacionLineasProductos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesModificacionLineasProductos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(false);
				
				this.habilitarDeshabilitarControlesModificacionLineasProductos(false);
				
				
				
				if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleModificacionLineasProductos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosModificacionLineasProductos.getRowCount()>=1) {
				jTableDatosModificacionLineasProductos.removeRowSelectionInterval(0, jTableDatosModificacionLineasProductos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesModificacionLineasProductos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesModificacionLineasProductos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(false) ;
			
			this.isEsNuevoModificacionLineasProductos=false;
			
			if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleModificacionLineasProductos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingModificacionLineasProductos(false);
				
				//SI ES MANUAL
				if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualModificacionLineasProductos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoModificacionLineasProductos--;			
			//ModificacionLineasProductos modificacionlineasproductosAux= new ModificacionLineasProductos();			
			//modificacionlineasproductosAux.setId(this.iIdNuevoModificacionLineasProductos);
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaModificacionLineasProductos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
			
			this.modificacionlineasproductos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.modificacionlineasproductosLogic.getModificacionLineasProductoss().add(this.modificacionlineasproductosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.modificacionlineasproductoss.add(this.modificacionlineasproductosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			
			this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(this.getIndiceNuevoModificacionLineasProductos(), this.getIndiceNuevoModificacionLineasProductos());
			
			int iLastRow =  this.jTableDatosModificacionLineasProductos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosModificacionLineasProductos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosModificacionLineasProductos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModificacionLineasProductos(false);
			
			//SI ES MANUAL
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModificacionLineasProductos();
			}
			
			//this.abrirFrameTreeModificacionLineasProductos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionModificacionLineasProductos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionModificacionLineasProductos.setFileImportacion(this.jInternalFrameImportacionModificacionLineasProductos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionModificacionLineasProductos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionModificacionLineasProductos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionModificacionLineasProductos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionModificacionLineasProductos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		

		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ModificacionLineasProductosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ModificacionLineasProductosBaseDesign.jrxml";
			
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
			
			this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Producto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Producto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Producto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Producto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupoDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupoDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupoDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupoDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoriaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoriaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoriaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoriaDestino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarcaDestino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarcaDestino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarcaDestino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarcaDestino_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoria="id_producto";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO:
					sNombreCampoCategoria="id_linea_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO:
					sNombreCampoCategoria="id_linea_grupo_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO:
					sNombreCampoCategoria="id_linea_categoria_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO:
					sNombreCampoCategoria="id_linea_marca_destino";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					sNombreCampoCategoriaValor="id_producto";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO:
					sNombreCampoCategoriaValor="id_linea_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO:
					sNombreCampoCategoriaValor="id_linea_grupo_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO:
					sNombreCampoCategoriaValor="id_linea_categoria_destino";
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO:
					sNombreCampoCategoriaValor="id_linea_marca_destino";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_producto");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_destino");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo_destino");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria_destino");
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca_destino");
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
	
	public void jButtonGenerarExcelReporteDinamicoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ModificacionLineasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getproducto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineadestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineagrupodestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineacategoriadestino_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO);
					iRow++;

					for(ModificacionLineasProductos modificacionlineasproductos:modificacionlineasproductossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(modificacionlineasproductos.getlineamarcadestino_descripcion());
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
			//	this.getFilaCabeceraExportarExcelModificacionLineasProductos(row);				
			//	iRow++;
			//}				
			
			//for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelModificacionLineasProductos(modificacionlineasproductosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	public void jButtonProcesarInformacionModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.ProcesarInformacionModificacionLineasProductos(this);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModificacionLineasProductos(false);
			
			//SI ES MANUAL
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualModificacionLineasProductos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModificacionLineasProductos(false);
			
			//SI ES MANUAL
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModificacionLineasProductos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingModificacionLineasProductos(false);
			
			//SI ES MANUAL
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualModificacionLineasProductos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaModificacionLineasProductos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosModificacionLineasProductos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosModificacionLineasProductos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosModificacionLineasProductos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosModificacionLineasProductos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosModificacionLineasProductos.setMinimumSize(dimensionMinimum);
		this.jTableDatosModificacionLineasProductos.setMaximumSize(dimensionMaximum);
		this.jTableDatosModificacionLineasProductos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingModificacionLineasProductos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingModificacionLineasProductos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingModificacionLineasProductos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaModificacionLineasProductos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesModificacionLineasProductos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasModificacionLineasProductos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModificacionLineasProductos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesModificacionLineasProductos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualModificacionLineasProductos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaModificacionLineasProductos();
		
		this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualModificacionLineasProductos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesModificacionLineasProductos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualModificacionLineasProductos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualModificacionLineasProductos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosModificacionLineasProductos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosModificacionLineasProductos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteModificacionLineasProductos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionNuevoModificacionLineasProductos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionSinCerrarModificacionLineasProductos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionSinMensajeModificacionLineasProductos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosModificacionLineasProductos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosModificacionLineasProductos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteModificacionLineasProductos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionNuevoModificacionLineasProductos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionSinCerrarModificacionLineasProductos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormModificacionLineasProductos.jCheckBoxPostAccionSinMensajeModificacionLineasProductos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionModificacionLineasProductos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionModificacionLineasProductos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesModificacionLineasProductos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesModificacionLineasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesModificacionLineasProductos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarModificacionLineasProductos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesModificacionLineasProductos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesModificacionLineasProductos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralModificacionLineasProductos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesModificacionLineasProductos(Boolean esInicializar) throws Exception {
		try	{	
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualModificacionLineasProductos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesModificacionLineasProductos() throws Exception {
		try	{
			if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualModificacionLineasProductos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModificacionLineasProductos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualModificacionLineasProductos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesModificacionLineasProductos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesModificacionLineasProductos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesModificacionLineasProductos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionModificacionLineasProductos.addItem(reporte);
			}
			
			
			if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionModificacionLineasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionModificacionLineasProductos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesModificacionLineasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesModificacionLineasProductos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarModificacionLineasProductos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarModificacionLineasProductos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarModificacionLineasProductos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModificacionLineasProductos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualModificacionLineasProductos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
				
				if(this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualModificacionLineasProductos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_productoBusquedaModificacionLineasProductos=((Producto)this.jComboBoxid_productoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_lineaBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_lineaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_grupoBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_grupoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_categoriaBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_categoriaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_marcaBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_marcaBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_destinoBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_grupo_destinoBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_grupo_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_categoria_destinoBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_categoria_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()!=null){this.id_linea_marca_destinoBusquedaModificacionLineasProductos=((Linea)this.jComboBoxid_linea_marca_destinoBusquedaModificacionLineasProductosModificacionLineasProductos.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasModificacionLineasProductos(Boolean esInicializar) throws Exception {				
		if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualModificacionLineasProductos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaModificacionLineasProductos() throws Exception {
		this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByModificacionLineasProductos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosModificacionLineasProductosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaModificacionLineasProductos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=modificacionlineasproductosLogic.getModificacionLineasProductoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=modificacionlineasproductoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosModificacionLineasProductos.setModel(new ModificacionLineasProductosModel(this.modificacionlineasproductosLogic.getModificacionLineasProductoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosModificacionLineasProductos.setModel(new ModificacionLineasProductosModel(this.modificacionlineasproductoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByModificacionLineasProductos!=null && this.jInternalFrameOrderByModificacionLineasProductos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByModificacionLineasProductos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,modificacionlineasproductosConstantesFunciones.resaltarSeleccionarModificacionLineasProductos,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ModificacionLineasProductosConstantesFunciones.SCLASSWEBTITULO,modificacionlineasproductosConstantesFunciones.resaltarSeleccionarModificacionLineasProductos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_ID));

		if(this.modificacionlineasproductosConstantesFunciones.mostraridModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.modificacionlineasproductosConstantesFunciones.resaltaridModificacionLineasProductos,this.modificacionlineasproductosConstantesFunciones.activaridModificacionLineasProductos,this,true,"idModificacionLineasProductos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.modificacionlineasproductosConstantesFunciones.resaltaridModificacionLineasProductos,this.modificacionlineasproductosConstantesFunciones.activaridModificacionLineasProductos,this,true,"idModificacionLineasProductos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_productoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProductoTableCell(this.productosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_productoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_productoModificacionLineasProductos));
			tableColumn.setCellEditor(new ProductoTableCell(this.productosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_productoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_productoModificacionLineasProductos,true,"id_productoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_lineaModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_lineaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_lineaModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_lineaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_lineaModificacionLineasProductos,true,"id_lineaModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupoModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupoModificacionLineasProductos,true,"id_linea_grupoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoriaModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoriaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoriaModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoriaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoriaModificacionLineasProductos,true,"id_linea_categoriaModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marcaModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marcaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_marcaModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcasForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marcaModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_marcaModificacionLineasProductos,true,"id_linea_marcaModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_destinoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_destinoModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_destinoModificacionLineasProductos,true,"id_linea_destinoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupo_destinoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagrupodestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupo_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupo_destinoModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagrupodestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupo_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupo_destinoModificacionLineasProductos,true,"id_linea_grupo_destinoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoria_destinoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoria_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoria_destinoModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoria_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoria_destinoModificacionLineasProductos,true,"id_linea_categoria_destinoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO));

		if(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marca_destinoModificacionLineasProductos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marca_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_marca_destinoModificacionLineasProductos));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcadestinosForeignKey,this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marca_destinoModificacionLineasProductos,this,this.modificacionlineasproductosConstantesFunciones.activarid_linea_marca_destinoModificacionLineasProductos,true,"id_linea_marca_destinoModificacionLineasProductos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ModificacionLineasProductosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModificacionLineasProductos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosModificacionLineasProductos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosModificacionLineasProductos.addColumn(tableColumn);
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
			
			this.jTableDatosModificacionLineasProductos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosModificacionLineasProductos.moveColumn(this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosModificacionLineasProductos.moveColumn(this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosModificacionLineasProductos.moveColumn(this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosModificacionLineasProductos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosModificacionLineasProductos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosModificacionLineasProductos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosModificacionLineasProductos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosModificacionLineasProductos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosModificacionLineasProductos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosModificacionLineasProductos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=modificacionlineasproductosLogic.getModificacionLineasProductoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=modificacionlineasproductoss.size()-1;
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
		//this.jTableDatosModificacionLineasProductos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosModificacionLineasProductos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosModificacionLineasProductos();
			
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
				
				//this.isEsNuevoModificacionLineasProductos=false;
					
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
				if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModificacionLineasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.modificacionlineasproductos.getsType().equals("DUPLICADO")
				   || this.modificacionlineasproductos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoModificacionLineasProductos=true;
				
				} else {
					this.isEsNuevoModificacionLineasProductos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
					if(this.modificacionlineasproductos.getId()>=0 && !this.modificacionlineasproductos.getIsNew()) {						
						this.isEsNuevoModificacionLineasProductos=false;
						
					} else {
						this.isEsNuevoModificacionLineasProductos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoModificacionLineasProductos(esRelaciones);						
				
				this.seleccionarModificacionLineasProductos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.modificacionlineasproductos.getId()<0) {
					this.isEsNuevoModificacionLineasProductos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarModificacionLineasProductos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarModificacionLineasProductos(evt,rowIndex);
				}	
				
				if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ModificacionLineasProductos: " + this.dDif); 
					}
				}								
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarModificacionLineasProductos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.modificacionlineasproductos)) {
					if(this.modificacionlineasproductos.getId()>0) {
						this.modificacionlineasproductos.setIsDeleted(true);
						
						this.modificacionlineasproductossEliminados.add(this.modificacionlineasproductos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.modificacionlineasproductosLogic.getModificacionLineasProductoss().remove(this.modificacionlineasproductos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductoss.remove(this.modificacionlineasproductos);				
					}
					
					
					((ModificacionLineasProductosModel) this.jTableDatosModificacionLineasProductos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaModificacionLineasProductos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarModificacionLineasProductos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoModificacionLineasProductos) {
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosModificacionLineasProductos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosModificacionLineasProductos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductos);
				}
				
				//ARCHITECTURE
				try {
					

					//Producto
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_productoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_productoModificacionLineasProductos) {
						//this.cargarCombosProductosForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_producto());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.productosForeignKey=new ArrayList<Producto>();

						if(modificacionlineasproductos.getProducto()!=null) {
							this.productosForeignKey.add(modificacionlineasproductos.getProducto());
						}

						this.addItemDefectoCombosForeignKeyProducto();
						this.cargarCombosFrameProductosForeignKey("Todos");
					}
					this.setActualProductoForeignKey(this.modificacionlineasproductos.getid_producto(),false,"Formulario");

					//Linea
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_lineaModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_lineaModificacionLineasProductos) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLinea()!=null) {
							this.lineasForeignKey.add(modificacionlineasproductos.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.modificacionlineasproductos.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_grupoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_grupoModificacionLineasProductos) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_grupo());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(modificacionlineasproductos.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.modificacionlineasproductos.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_categoriaModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_categoriaModificacionLineasProductos) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_categoria());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(modificacionlineasproductos.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.modificacionlineasproductos.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_marcaModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_marcaModificacionLineasProductos) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_marca());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(modificacionlineasproductos.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.modificacionlineasproductos.getid_linea_marca(),false,"Formulario");

					//LineaDestino
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_destinoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_destinoModificacionLineasProductos) {
						//this.cargarCombosLineaDestinosForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_destino());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineadestinosForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaDestino()!=null) {
							this.lineadestinosForeignKey.add(modificacionlineasproductos.getLineaDestino());
						}

						this.addItemDefectoCombosForeignKeyLineaDestino();
						this.cargarCombosFrameLineaDestinosForeignKey("Todos");
					}
					this.setActualLineaDestinoForeignKey(this.modificacionlineasproductos.getid_linea_destino(),false,"Formulario");

					//LineaGrupoDestino
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_grupo_destinoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_grupo_destinoModificacionLineasProductos) {
						//this.cargarCombosLineaGrupoDestinosForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_grupo_destino());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineagrupodestinosForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaGrupoDestino()!=null) {
							this.lineagrupodestinosForeignKey.add(modificacionlineasproductos.getLineaGrupoDestino());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupoDestino();
						this.cargarCombosFrameLineaGrupoDestinosForeignKey("Todos");
					}
					this.setActualLineaGrupoDestinoForeignKey(this.modificacionlineasproductos.getid_linea_grupo_destino(),false,"Formulario");

					//LineaCategoriaDestino
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_categoria_destinoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_categoria_destinoModificacionLineasProductos) {
						//this.cargarCombosLineaCategoriaDestinosForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_categoria_destino());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineacategoriadestinosForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaCategoriaDestino()!=null) {
							this.lineacategoriadestinosForeignKey.add(modificacionlineasproductos.getLineaCategoriaDestino());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoriaDestino();
						this.cargarCombosFrameLineaCategoriaDestinosForeignKey("Todos");
					}
					this.setActualLineaCategoriaDestinoForeignKey(this.modificacionlineasproductos.getid_linea_categoria_destino(),false,"Formulario");

					//LineaMarcaDestino
					if(!this.modificacionlineasproductosConstantesFunciones.cargarid_linea_marca_destinoModificacionLineasProductos || this.modificacionlineasproductosConstantesFunciones.event_dependid_linea_marca_destinoModificacionLineasProductos) {
						//this.cargarCombosLineaMarcaDestinosForeignKeyLista(" where id="+this.modificacionlineasproductos.getid_linea_marca_destino());
									//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
						this.lineamarcadestinosForeignKey=new ArrayList<Linea>();

						if(modificacionlineasproductos.getLineaMarcaDestino()!=null) {
							this.lineamarcadestinosForeignKey.add(modificacionlineasproductos.getLineaMarcaDestino());
						}

						this.addItemDefectoCombosForeignKeyLineaMarcaDestino();
						this.cargarCombosFrameLineaMarcaDestinosForeignKey("Todos");
					}
					this.setActualLineaMarcaDestinoForeignKey(this.modificacionlineasproductos.getid_linea_marca_destino(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesModificacionLineasProductos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesModificacionLineasProductos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualModificacionLineasProductos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoModificacionLineasProductos(modificacionlineasproductos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioModificacionLineasProductos(modificacionlineasproductos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyModificacionLineasProductos(modificacionlineasproductos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyModificacionLineasProductos(modificacionlineasproductos);
	}
	
	public void setVariablesObjetoActualToFormularioModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setText(modificacionlineasproductos.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ModificacionLineasProductos modificacionlineasproductosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,modificacionlineasproductosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ModificacionLineasProductos modificacionlineasproductosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				modificacionlineasproductosLocal=this.modificacionlineasproductos;
			} else {
				modificacionlineasproductosLocal=this.modificacionlineasproductosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(modificacionlineasproductosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoModificacionLineasProductos(modificacionlineasproductosLocal,true);
					
					if(modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(modificacionlineasproductosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(modificacionlineasproductosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModificacionLineasProductos(modificacionlineasproductos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(modificacionlineasproductos);
	}
	
	public void setVariablesFormularioToObjetoActualModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualModificacionLineasProductos(modificacionlineasproductos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.getText()==null || this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.getText()=="" || this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.getText()=="Id") {
				this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setText("0");
			}

			if(conColumnasBase) {modificacionlineasproductos.setId(Long.parseLong(this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ModificacionLineasProductosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelIdModificacionLineasProductos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductosBean,ModificacionLineasProductos modificacionlineasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_producto()!=null && !modificacionlineasproductosBean.getid_producto().equals(-1L))) {modificacionlineasproductos.setid_producto(modificacionlineasproductosBean.getid_producto());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea()!=null && !modificacionlineasproductosBean.getid_linea().equals(-1L))) {modificacionlineasproductos.setid_linea(modificacionlineasproductosBean.getid_linea());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_grupo()!=null && !modificacionlineasproductosBean.getid_linea_grupo().equals(-1L))) {modificacionlineasproductos.setid_linea_grupo(modificacionlineasproductosBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_categoria()!=null && !modificacionlineasproductosBean.getid_linea_categoria().equals(-1L))) {modificacionlineasproductos.setid_linea_categoria(modificacionlineasproductosBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_marca()!=null && !modificacionlineasproductosBean.getid_linea_marca().equals(-1L))) {modificacionlineasproductos.setid_linea_marca(modificacionlineasproductosBean.getid_linea_marca());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_destino()!=null && !modificacionlineasproductosBean.getid_linea_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_destino(modificacionlineasproductosBean.getid_linea_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_grupo_destino()!=null && !modificacionlineasproductosBean.getid_linea_grupo_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_grupo_destino(modificacionlineasproductosBean.getid_linea_grupo_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_categoria_destino()!=null && !modificacionlineasproductosBean.getid_linea_categoria_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_categoria_destino(modificacionlineasproductosBean.getid_linea_categoria_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosBean.getid_linea_marca_destino()!=null && !modificacionlineasproductosBean.getid_linea_marca_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_marca_destino(modificacionlineasproductosBean.getid_linea_marca_destino());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductosOrigen,ModificacionLineasProductos modificacionlineasproductos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getId()!=null && !modificacionlineasproductosOrigen.getId().equals(0L))) {modificacionlineasproductos.setId(modificacionlineasproductosOrigen.getId());}}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_producto()!=null && !modificacionlineasproductosOrigen.getid_producto().equals(-1L))) {modificacionlineasproductos.setid_producto(modificacionlineasproductosOrigen.getid_producto());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea()!=null && !modificacionlineasproductosOrigen.getid_linea().equals(-1L))) {modificacionlineasproductos.setid_linea(modificacionlineasproductosOrigen.getid_linea());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_grupo()!=null && !modificacionlineasproductosOrigen.getid_linea_grupo().equals(-1L))) {modificacionlineasproductos.setid_linea_grupo(modificacionlineasproductosOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_categoria()!=null && !modificacionlineasproductosOrigen.getid_linea_categoria().equals(-1L))) {modificacionlineasproductos.setid_linea_categoria(modificacionlineasproductosOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_marca()!=null && !modificacionlineasproductosOrigen.getid_linea_marca().equals(-1L))) {modificacionlineasproductos.setid_linea_marca(modificacionlineasproductosOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_destino()!=null && !modificacionlineasproductosOrigen.getid_linea_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_destino(modificacionlineasproductosOrigen.getid_linea_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_grupo_destino()!=null && !modificacionlineasproductosOrigen.getid_linea_grupo_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_grupo_destino(modificacionlineasproductosOrigen.getid_linea_grupo_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_categoria_destino()!=null && !modificacionlineasproductosOrigen.getid_linea_categoria_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_categoria_destino(modificacionlineasproductosOrigen.getid_linea_categoria_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosOrigen.getid_linea_marca_destino()!=null && !modificacionlineasproductosOrigen.getid_linea_marca_destino().equals(-1L))) {modificacionlineasproductos.setid_linea_marca_destino(modificacionlineasproductosOrigen.getid_linea_marca_destino());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setText(modificacionlineasproductos.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioModificacionLineasProductos(ModificacionLineasProductosBean modificacionlineasproductosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setText(modificacionlineasproductosBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanModificacionLineasProductos(ModificacionLineasProductosParameterReturnGeneral modificacionlineasproductosReturnGeneral,ModificacionLineasProductosBean modificacionlineasproductosBean,Boolean conDefault) throws Exception { 
		try {
			ModificacionLineasProductos modificacionlineasproductosLocal=new ModificacionLineasProductos();
			
			modificacionlineasproductosLocal=modificacionlineasproductosReturnGeneral.getModificacionLineasProductos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && modificacionlineasproductosLocal.getId()!=null && !modificacionlineasproductosLocal.getId().equals(0L))) {modificacionlineasproductosBean.setId(modificacionlineasproductosLocal.getId());}}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_producto()!=null && !modificacionlineasproductosLocal.getid_producto().equals(-1L))) {modificacionlineasproductosBean.setid_producto(modificacionlineasproductosLocal.getid_producto());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea()!=null && !modificacionlineasproductosLocal.getid_linea().equals(-1L))) {modificacionlineasproductosBean.setid_linea(modificacionlineasproductosLocal.getid_linea());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_grupo()!=null && !modificacionlineasproductosLocal.getid_linea_grupo().equals(-1L))) {modificacionlineasproductosBean.setid_linea_grupo(modificacionlineasproductosLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_categoria()!=null && !modificacionlineasproductosLocal.getid_linea_categoria().equals(-1L))) {modificacionlineasproductosBean.setid_linea_categoria(modificacionlineasproductosLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_marca()!=null && !modificacionlineasproductosLocal.getid_linea_marca().equals(-1L))) {modificacionlineasproductosBean.setid_linea_marca(modificacionlineasproductosLocal.getid_linea_marca());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_destino()!=null && !modificacionlineasproductosLocal.getid_linea_destino().equals(-1L))) {modificacionlineasproductosBean.setid_linea_destino(modificacionlineasproductosLocal.getid_linea_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_grupo_destino()!=null && !modificacionlineasproductosLocal.getid_linea_grupo_destino().equals(-1L))) {modificacionlineasproductosBean.setid_linea_grupo_destino(modificacionlineasproductosLocal.getid_linea_grupo_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_categoria_destino()!=null && !modificacionlineasproductosLocal.getid_linea_categoria_destino().equals(-1L))) {modificacionlineasproductosBean.setid_linea_categoria_destino(modificacionlineasproductosLocal.getid_linea_categoria_destino());}
			if(conDefault || (!conDefault && modificacionlineasproductosLocal.getid_linea_marca_destino()!=null && !modificacionlineasproductosLocal.getid_linea_marca_destino().equals(-1L))) {modificacionlineasproductosBean.setid_linea_marca_destino(modificacionlineasproductosLocal.getid_linea_marca_destino());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxModificacionLineasProductosGenerico(Long idModificacionLineasProductosSeleccionado,JComboBox jComboBoxModificacionLineasProductos,List<ModificacionLineasProductos> modificacionlineasproductossLocal)throws Exception {
		try {
			ModificacionLineasProductos  modificacionlineasproductosTemp=null;

			for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossLocal) {
				if(modificacionlineasproductosAux.getId()!=null && modificacionlineasproductosAux.getId().equals(idModificacionLineasProductosSeleccionado)) {
					modificacionlineasproductosTemp=modificacionlineasproductosAux;
					break;
				}
			}

			jComboBoxModificacionLineasProductos.setSelectedItem(modificacionlineasproductosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxModificacionLineasProductosGenerico(JComboBox jComboBoxModificacionLineasProductos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModificacionLineasProductos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxModificacionLineasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxModificacionLineasProductos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxModificacionLineasProductos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxModificacionLineasProductos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxModificacionLineasProductos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modificacionlineasproductos=(ModificacionLineasProductos) modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			modificacionlineasproductos =(ModificacionLineasProductos) modificacionlineasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Producto")) {
			//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getproducto_descripcion();
			} else {
				//sDescripcion=this.getActualProductoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getproducto_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("LineaDestino")) {
			//sDescripcion=this.getActualLineaDestinoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineadestino_descripcion();
			} else {
				//sDescripcion=this.getActualLineaDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineadestino_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupoDestino")) {
			//sDescripcion=this.getActualLineaGrupoDestinoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineagrupodestino_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineagrupodestino_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoriaDestino")) {
			//sDescripcion=this.getActualLineaCategoriaDestinoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineacategoriadestino_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineacategoriadestino_descripcion();
			}
		}

		if(sTipo.equals("LineaMarcaDestino")) {
			//sDescripcion=this.getActualLineaMarcaDestinoForeignKeyDescripcion((Long)value);
			if(!modificacionlineasproductos.getIsNew() && !modificacionlineasproductos.getIsChanged() && !modificacionlineasproductos.getIsDeleted()) {
				sDescripcion=modificacionlineasproductos.getlineamarcadestino_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaDestinoForeignKeyDescripcion((Long)value);
				sDescripcion=modificacionlineasproductos.getlineamarcadestino_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ModificacionLineasProductos modificacionlineasproductosRow=new ModificacionLineasProductos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modificacionlineasproductosRow=(ModificacionLineasProductos) modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			modificacionlineasproductosRow=(ModificacionLineasProductos) modificacionlineasproductoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualModificacionLineasProductos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));			
			this.jButtonDuplicarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaDuplicarModificacionLineasProductos && this.isPermisoDuplicarModificacionLineasProductos));			
			this.jButtonCopiarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaCopiarModificacionLineasProductos && this.isPermisoCopiarModificacionLineasProductos));
			this.jButtonVerFormModificacionLineasProductos.setVisible((this.isVisibilidadCeldaVerFormModificacionLineasProductos && this.isPermisoVerFormModificacionLineasProductos));
			
			this.jButtonAbrirOrderByModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));			
			
			this.jButtonNuevoRelacionesModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));			
			this.jButtonNuevoGuardarCambiosModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaModificarModificacionLineasProductos && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaActualizarModificacionLineasProductos && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaEliminarModificacionLineasProductos && this.isPermisoEliminarModificacionLineasProductos));
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.setVisible(this.isVisibilidadCeldaCancelarModificacionLineasProductos);							
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));			
			
			}
						
			this.jButtonGuardarCambiosTablaModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));						
			this.jButtonDuplicarToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaDuplicarModificacionLineasProductos && this.isPermisoDuplicarModificacionLineasProductos));						
			this.jButtonCopiarToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaCopiarModificacionLineasProductos && this.isPermisoCopiarModificacionLineasProductos));			
			this.jButtonVerFormToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaVerFormModificacionLineasProductos && this.isPermisoVerFormModificacionLineasProductos));			
			this.jButtonAbrirOrderByToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));
			this.jButtonNuevoRelacionesToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));			
			this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));			
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaModificarModificacionLineasProductos && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaActualizarModificacionLineasProductos  && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaEliminarModificacionLineasProductos && this.isPermisoEliminarModificacionLineasProductos));
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarToolBarModificacionLineasProductos.setVisible(this.isVisibilidadCeldaCancelarModificacionLineasProductos);				
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));			
			this.jMenuItemDuplicarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaDuplicarModificacionLineasProductos && this.isPermisoDuplicarModificacionLineasProductos));			
			this.jMenuItemCopiarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaCopiarModificacionLineasProductos && this.isPermisoCopiarModificacionLineasProductos));			
			this.jMenuItemVerFormModificacionLineasProductos.setVisible((this.isVisibilidadCeldaVerFormModificacionLineasProductos && this.isPermisoVerFormModificacionLineasProductos));			
			this.jMenuItemAbrirOrderByModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));			
			//this.jMenuItemMostrarOcultarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));
			this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));			
			//this.jMenuItemDetalleMostrarOcultarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaOrdenModificacionLineasProductos && this.isPermisoOrdenModificacionLineasProductos));			
			this.jMenuItemNuevoRelacionesModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos));			
			this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos.setVisible((this.isVisibilidadCeldaNuevoModificacionLineasProductos && this.isPermisoNuevoModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));									
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemModificarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaModificarModificacionLineasProductos && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemActualizarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaActualizarModificacionLineasProductos && this.isPermisoActualizarModificacionLineasProductos));	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemEliminarModificacionLineasProductos.setVisible((this.isVisibilidadCeldaEliminarModificacionLineasProductos && this.isPermisoEliminarModificacionLineasProductos));
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemCancelarModificacionLineasProductos.setVisible(this.isVisibilidadCeldaCancelarModificacionLineasProductos);				
			}
			
			this.jMenuItemGuardarCambiosModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));						
			this.jMenuItemGuardarCambiosTablaModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=this.jButtonNuevoModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaDuplicarModificacionLineasProductos=this.jButtonDuplicarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaCopiarModificacionLineasProductos=this.jButtonCopiarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaVerFormModificacionLineasProductos=this.jButtonVerFormModificacionLineasProductos.isVisible();
			
			this.isVisibilidadCeldaOrdenModificacionLineasProductos=this.jButtonAbrirOrderByModificacionLineasProductos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=this.jButtonNuevoRelacionesModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaModificarModificacionLineasProductos=this.jButtonModificarModificacionLineasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaGuardarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=this.jButtonGuardarCambiosTablaModificacionLineasProductos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=this.jButtonNuevoToolBarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=this.jButtonNuevoRelacionesToolBarModificacionLineasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.isVisibilidadCeldaModificarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarToolBarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarToolBarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarToolBarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarToolBarModificacionLineasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModificacionLineasProductos=this.jButtonGuardarCambiosToolBarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=this.jMenuItemNuevoModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=this.jMenuItemNuevoRelacionesModificacionLineasProductos.isVisible();
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.isVisibilidadCeldaModificarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemModificarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemActualizarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemEliminarModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemCancelarModificacionLineasProductos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarModificacionLineasProductos=this.jMenuItemGuardarCambiosModificacionLineasProductos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=this.jMenuItemGuardarCambiosTablaModificacionLineasProductos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesModificacionLineasProductos(Boolean esInicializar) {
		if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
				//if(this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesModificacionLineasProductos();
			}
			
			this.inicializarActualizarBindingBotonesManualModificacionLineasProductos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualModificacionLineasProductos() {
		this.jButtonNuevoModificacionLineasProductos.setVisible(this.isPermisoNuevoModificacionLineasProductos);			
		this.jButtonDuplicarModificacionLineasProductos.setVisible(this.isPermisoDuplicarModificacionLineasProductos);			
		this.jButtonCopiarModificacionLineasProductos.setVisible(this.isPermisoCopiarModificacionLineasProductos);			
		this.jButtonVerFormModificacionLineasProductos.setVisible(this.isPermisoVerFormModificacionLineasProductos);			
		
		this.jButtonAbrirOrderByModificacionLineasProductos.setVisible(this.isPermisoOrdenModificacionLineasProductos);					
		
		this.jButtonNuevoRelacionesModificacionLineasProductos.setVisible(this.isPermisoNuevoModificacionLineasProductos);			
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarModificacionLineasProductos.setVisible(this.isPermisoActualizarModificacionLineasProductos);	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.setVisible(this.isPermisoActualizarModificacionLineasProductos);	
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.setVisible(this.isPermisoEliminarModificacionLineasProductos);
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.setVisible(this.isVisibilidadCeldaCancelarModificacionLineasProductos);						
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.setVisible(this.isPermisoGuardarCambiosModificacionLineasProductos);							
		}
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.setVisible(this.isPermisoActualizarModificacionLineasProductos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleModificacionLineasProductos() {
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarModificacionLineasProductos.setVisible(this.isPermisoActualizarModificacionLineasProductos);	
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.setVisible(this.isPermisoActualizarModificacionLineasProductos);	
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.setVisible(this.isPermisoEliminarModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.setVisible(this.isVisibilidadCeldaCancelarModificacionLineasProductos);							
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.setVisible((this.isVisibilidadCeldaGuardarModificacionLineasProductos && this.isPermisoGuardarCambiosModificacionLineasProductos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosModificacionLineasProductos() {
		if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualModificacionLineasProductos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesModificacionLineasProductos() {
	}
	
	public void jTableDatosModificacionLineasProductosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarModificacionLineasProductos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.modificacionlineasproductos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_productoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproducto=true;

			idTienePermisoproducto=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(ProductoConstantesFunciones.CLASSNAME);

			if(idTienePermisoproducto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.productoBeanSwingJInternalFrame=new ProductoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.productoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.productoBeanSwingJInternalFrame.getProductoLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_producto()!=null) {
					this.productoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.productoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_producto());
					this.productoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.productoBeanSwingJInternalFrame.inicializarActualizarBindingTablaProducto();
				}

				JInternalFrameBase jinternalFrame =this.productoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderproducto=(TitledBorder)this.productoBeanSwingJInternalFrame.jScrollPanelDatosProducto.getBorder();

				titledBorderproducto.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Producto");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_productoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_producto = "+this.modificacionlineasproductos.getid_producto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.modificacionlineasproductos.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.modificacionlineasproductos.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.modificacionlineasproductos.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.modificacionlineasproductos.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_destinoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineadestino=true;

			idTienePermisolineadestino=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineadestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineadestinoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineadestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineadestinoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_destino()!=null) {
					this.lineadestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineadestinoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_destino());
					this.lineadestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineadestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineadestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineadestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineadestino=(TitledBorder)this.lineadestinoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineadestino.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_destinoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_destino = "+this.modificacionlineasproductos.getid_linea_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupo_destinoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupodestino=true;

			idTienePermisolineagrupodestino=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupodestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineagrupodestinoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupodestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupodestinoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_grupo_destino()!=null) {
					this.lineagrupodestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupodestinoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_grupo_destino());
					this.lineagrupodestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupodestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupodestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupodestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineagrupodestino=(TitledBorder)this.lineagrupodestinoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupodestino.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupo_destinoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_grupo_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo_destino = "+this.modificacionlineasproductos.getid_linea_grupo_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoria_destinoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoriadestino=true;

			idTienePermisolineacategoriadestino=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoriadestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineacategoriadestinoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriadestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriadestinoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_categoria_destino()!=null) {
					this.lineacategoriadestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriadestinoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_categoria_destino());
					this.lineacategoriadestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriadestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriadestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriadestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineacategoriadestino=(TitledBorder)this.lineacategoriadestinoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoriadestino.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoria_destinoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_categoria_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria_destino = "+this.modificacionlineasproductos.getid_linea_categoria_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marca_destinoModificacionLineasProductosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarcadestino=true;

			idTienePermisolineamarcadestino=this.tienePermisosUsuarioEnPaginaWebModificacionLineasProductos(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarcadestino) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosModificacionLineasProductos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosModificacionLineasProductos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);

				this.lineamarcadestinoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcadestinoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcadestinoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.modificacionlineasproductosLogic.getConnexion());

				if(this.modificacionlineasproductos.getid_linea_marca_destino()!=null) {
					this.lineamarcadestinoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcadestinoBeanSwingJInternalFrame.setIdActual(this.modificacionlineasproductos.getid_linea_marca_destino());
					this.lineamarcadestinoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcadestinoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcadestinoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcadestinoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderModificacionLineasProductos=(TitledBorder)this.jScrollPanelDatosModificacionLineasProductos.getBorder();
				TitledBorder titledBorderlineamarcadestino=(TitledBorder)this.lineamarcadestinoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarcadestino.setTitle(titledBorderModificacionLineasProductos.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marca_destinoModificacionLineasProductosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.getmodificacionlineasproductos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.modificacionlineasproductos==null) {
						this.modificacionlineasproductos = new ModificacionLineasProductos();
					}

					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);
				}

				if(this.modificacionlineasproductos.getid_linea_marca_destino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca_destino = "+this.modificacionlineasproductos.getid_linea_marca_destino().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingModificacionLineasProductos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaModificacionLineasProductosModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossBusquedaModificacionLineasProductos();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLinea();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaCategoria();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaDestinoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaCategoriaDestino();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaDestinoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaDestino();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaGrupo();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoDestinoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaGrupoDestino();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaMarca();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaDestinoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdLineaMarcaDestino();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProductoModificacionLineasProductosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);

			this.getModificacionLineasProductossFK_IdProducto();

			this.inicializarActualizarBindingModificacionLineasProductos(false);

			//if(ModificacionLineasProductosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.modificacionlineasproductosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameModificacionLineasProductos() {
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.setVisible(false);	    			
			this.jInternalFrameDetalleFormModificacionLineasProductos.dispose();
			this.jInternalFrameDetalleFormModificacionLineasProductos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
			this.jInternalFrameReporteDinamicoModificacionLineasProductos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoModificacionLineasProductos.dispose();
			this.jInternalFrameReporteDinamicoModificacionLineasProductos=null;
		}
		
		if(this.jInternalFrameImportacionModificacionLineasProductos!=null) {
			this.jInternalFrameImportacionModificacionLineasProductos.setVisible(false);	    			
			this.jInternalFrameImportacionModificacionLineasProductos.dispose();
			this.jInternalFrameImportacionModificacionLineasProductos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessModificacionLineasProductos();
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			
			if(sTipo.equals("NuevoModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarModificacionLineasProductos")) {
				jButtonDuplicarModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarModificacionLineasProductos")) {
				jButtonCopiarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormModificacionLineasProductos")) {
				jButtonVerFormModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarModificacionLineasProductos")) {
				jButtonDuplicarModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarModificacionLineasProductos")) {
				jButtonDuplicarModificacionLineasProductosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarModificacionLineasProductos")) {
				jButtonModificarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarModificacionLineasProductos")) {
				jButtonModificarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarModificacionLineasProductos")) {
				jButtonModificarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarModificacionLineasProductos")) {
				jButtonActualizarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarModificacionLineasProductos")) {
				jButtonActualizarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarModificacionLineasProductos")) {
				jButtonActualizarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarModificacionLineasProductos")) {
				jButtonEliminarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarModificacionLineasProductos")) {
				jButtonEliminarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarModificacionLineasProductos")) {
				jButtonEliminarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarModificacionLineasProductos")) {
				jButtonCancelarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarModificacionLineasProductos")) {
				jButtonCancelarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarModificacionLineasProductos")) {
				jButtonCancelarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarModificacionLineasProductos")) {
				jButtonCerrarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarModificacionLineasProductos")) {
				jButtonCerrarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarModificacionLineasProductos")) {
				jButtonCerrarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarModificacionLineasProductos")) {
				jButtonMostrarOcultarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarModificacionLineasProductos")) {
				jButtonCancelarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarModificacionLineasProductos")) {
				jButtonCopiarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarModificacionLineasProductos")) {
				jButtonVerFormModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarModificacionLineasProductos")) {
				jButtonCopiarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormModificacionLineasProductos")) {
				jButtonVerFormModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionModificacionLineasProductos")) {
				jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarModificacionLineasProductos")) {
				jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionModificacionLineasProductos")) {
				jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresModificacionLineasProductos")) {
				jButtonAnterioresModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarModificacionLineasProductos")) {
				jButtonAnterioresModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreModificacionLineasProductos")) {
				jButtonAnterioresModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesModificacionLineasProductos")) {
				jButtonSiguientesModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarModificacionLineasProductos")) {
				jButtonSiguientesModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesModificacionLineasProductos")) {
				jButtonSiguientesModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByModificacionLineasProductos") || sTipo.equals("MenuItemDetalleAbrirOrderByModificacionLineasProductos")) {
				jButtonAbrirOrderByModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarModificacionLineasProductos") || sTipo.equals("MenuItemDetalleMostrarOcultarModificacionLineasProductos")) {
				jButtonMostrarOcultarModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosModificacionLineasProductos")) {
				jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarModificacionLineasProductos")) {
				jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosModificacionLineasProductos")) {
				jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("ProcesarInformacionModificacionLineasProductos")) {
				jButtonProcesarInformacionModificacionLineasProductosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoModificacionLineasProductos")) {
				jButtonCerrarReporteDinamicoModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoModificacionLineasProductos")) {
				jButtonGenerarReporteDinamicoModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoModificacionLineasProductos")) {
				
				jButtonGenerarExcelReporteDinamicoModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionModificacionLineasProductos")) {
				jButtonCerrarImportacionModificacionLineasProductosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionModificacionLineasProductos")) {
				
				jButtonGenerarImportacionModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionModificacionLineasProductos")) {
				
				jButtonAbrirImportacionModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesModificacionLineasProductos")) {
				jComboBoxTiposAccionesModificacionLineasProductosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesModificacionLineasProductos")) {
				jComboBoxTiposRelacionesModificacionLineasProductosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioModificacionLineasProductos")) {
				jComboBoxTiposAccionesModificacionLineasProductosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarModificacionLineasProductos")) {
				
				jComboBoxTiposSeleccionarModificacionLineasProductosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralModificacionLineasProductos")) {
				jTextFieldValorCampoGeneralModificacionLineasProductosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByModificacionLineasProductos")) {
				jButtonAbrirOrderByModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarModificacionLineasProductos")) {
				jButtonAbrirOrderByModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByModificacionLineasProductos")) {
				jButtonCerrarOrderByModificacionLineasProductosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModificacionLineasProductosBusqueda")) {
				this.jButtonidModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoModificacionLineasProductosUpdate")) {
				this.jButtonid_productoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoModificacionLineasProductosBusqueda")) {
				this.jButtonid_productoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaModificacionLineasProductosUpdate")) {
				this.jButtonid_lineaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaModificacionLineasProductosBusqueda")) {
				this.jButtonid_lineaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_grupoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_grupoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_categoriaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_categoriaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_marcaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_marcaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupo_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupo_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoria_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoria_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marca_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marca_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_marca_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaModificacionLineasProductosModificacionLineasProductos")) {
				this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductosActionPerformed(evt);
			}
			
			;
			
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessModificacionLineasProductos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ModificacionLineasProductos modificacionlineasproductosLocal=null;
			
			if(!this.getEsControlTabla()) {
				modificacionlineasproductosLocal=this.modificacionlineasproductos;
			} else {
				modificacionlineasproductosLocal=this.modificacionlineasproductosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
							
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
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
			
			


			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
								
						
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
								
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
							
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
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
			
			


			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
								
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosModificacionLineasProductos")) {
					jCheckBoxSeleccionarTodosModificacionLineasProductosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosModificacionLineasProductos")) {
					jCheckBoxSeleccionadosModificacionLineasProductosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarModificacionLineasProductos")) {
					
				}
				
				


				
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
												
				
				


				
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
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
			
			


			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaModificacionLineasProductosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.modificacionlineasproductos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.modificacionlineasproductos);
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
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
				
				


				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ModificacionLineasProductos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ModificacionLineasProductos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaModificacionLineasProductosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.modificacionlineasproductosAnterior =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarModificacionLineasProductos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosModificacionLineasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosModificacionLineasProductos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.modificacionlineasproductos =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.modificacionlineasproductos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarModificacionLineasProductos")) {
				
				}
				
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarModificacionLineasProductos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosModificacionLineasProductos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarModificacionLineasProductos")) {
			
			}
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessModificacionLineasProductos();
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			if(sTipo.equals("NuevoModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarModificacionLineasProductos")) {
				jButtonDuplicarModificacionLineasProductosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarModificacionLineasProductos")) {
				jButtonCopiarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormModificacionLineasProductos")) {
				jButtonVerFormModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesModificacionLineasProductos")) {
				jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarModificacionLineasProductos")) {
				jButtonModificarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarModificacionLineasProductos")) {
				jButtonActualizarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarModificacionLineasProductos")) {
				jButtonEliminarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarModificacionLineasProductos")) {
				jButtonCancelarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarModificacionLineasProductos")) {
				jButtonCerrarModificacionLineasProductosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosModificacionLineasProductos")) {
				jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosModificacionLineasProductos")) {
				jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByModificacionLineasProductos")) {
				jButtonAbrirOrderByModificacionLineasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionModificacionLineasProductos")) {
				jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresModificacionLineasProductos")) {
				jButtonAnterioresModificacionLineasProductosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesModificacionLineasProductos")) {
				jButtonSiguientesModificacionLineasProductosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idModificacionLineasProductosBusqueda")) {
				this.jButtonidModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_productoModificacionLineasProductosUpdate")) {
				this.jButtonid_productoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_productoModificacionLineasProductosBusqueda")) {
				this.jButtonid_productoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaModificacionLineasProductosUpdate")) {
				this.jButtonid_lineaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaModificacionLineasProductosBusqueda")) {
				this.jButtonid_lineaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_grupoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_grupoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_categoriaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_categoriaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_marcaModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_marcaModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupo_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupo_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_grupo_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoria_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoria_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_categoria_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marca_destinoModificacionLineasProductosUpdate")) {
				this.jButtonid_linea_marca_destinoModificacionLineasProductosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marca_destinoModificacionLineasProductosBusqueda")) {
				this.jButtonid_linea_marca_destinoModificacionLineasProductosBusquedaActionPerformed(evt);
			}
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessModificacionLineasProductos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameModificacionLineasProductos")) {
				closingInternalFrameModificacionLineasProductos();
				
			} else if(sTipo.equals("jButtonCancelarModificacionLineasProductos")) {
				JInternalFrameBase jInternalFrameDetalleFormModificacionLineasProductos = (JInternalFrameBase)evt.getSource();
	            	
	            ModificacionLineasProductosBeanSwingJInternalFrame jInternalFrameParent=(ModificacionLineasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormModificacionLineasProductos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarModificacionLineasProductosActionPerformed(null);
			}
			
			ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.modificacionlineasproductos,new Object(),this.modificacionlineasproductosParameterGeneral,this.modificacionlineasproductosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormModificacionLineasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormModificacionLineasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormModificacionLineasProductos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.modificacionlineasproductos)) {
			if(!esControlTabla) {
				if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);			
				}
				
				if(this.modificacionlineasproductosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral,this.modificacionlineasproductosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.modificacionlineasproductosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanModificacionLineasProductos(classes,this.modificacionlineasproductosReturnGeneral,this.modificacionlineasproductosBean,false);
					}
						
					if(this.modificacionlineasproductosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos());	
					}
						
					if(this.modificacionlineasproductosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos(),classes);//this.modificacionlineasproductosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioModificacionLineasProductos(this.modificacionlineasproductos,classes);//this.modificacionlineasproductosBean);									
				}
			
				if(ModificacionLineasProductosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualModificacionLineasProductos(this.modificacionlineasproductos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysModificacionLineasProductos(this.modificacionlineasproductos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.modificacionlineasproductosAnterior!=null) {
						this.modificacionlineasproductos=this.modificacionlineasproductosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.modificacionlineasproductosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos(),modificacionlineasproductosLogic.getModificacionLineasProductoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductos(),this.modificacionlineasproductoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosModificacionLineasProductos.repaint();
				
				//((AbstractTableModel) this.jTableDatosModificacionLineasProductos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosModificacionLineasProductos();
			}
		}
	}
	
	public void actualizarVisualTableDatosModificacionLineasProductos() throws Exception {
		
		ModificacionLineasProductosModel modificacionlineasproductosModel=(ModificacionLineasProductosModel)this.jTableDatosModificacionLineasProductos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			modificacionlineasproductosModel.modificacionlineasproductoss=this.modificacionlineasproductosLogic.getModificacionLineasProductoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			modificacionlineasproductosModel.modificacionlineasproductoss=this.modificacionlineasproductoss;
		}
		
		
		((ModificacionLineasProductosModel) this.jTableDatosModificacionLineasProductos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaModificacionLineasProductos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmodificacionlineasproductosAnterior(),this.modificacionlineasproductosLogic.getModificacionLineasProductoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmodificacionlineasproductosAnterior(),this.modificacionlineasproductoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosModificacionLineasProductos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
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
										
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modificacionlineasproductos,new Object(),generalEntityParameterGeneral,this.modificacionlineasproductosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ModificacionLineasProductosConstantesFunciones.getClassesRelationshipsOfModificacionLineasProductos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ModificacionLineasProductosConstantesFunciones.getClassesRelationshipsFromStringsOfModificacionLineasProductos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormModificacionLineasProductos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ModificacionLineasProductosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.modificacionlineasproductos,new Object(),generalEntityParameterGeneral,this.modificacionlineasproductosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioModificacionLineasProductos(ModificacionLineasProductosBean modificacionlineasproductosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanModificacionLineasProductos(ArrayList<Classe> classes,ModificacionLineasProductosReturnGeneral modificacionlineasproductosReturnGeneral,ModificacionLineasProductosBean modificacionlineasproductosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.modificacionlineasproductos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormModificacionLineasProductos = new ModificacionLineasProductosDetalleFormJInternalFrame(jDesktopPane,this.modificacionlineasproductosSessionBean.getConGuardarRelaciones(),this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.setVisible(false);
		this.jInternalFrameDetalleFormModificacionLineasProductos.setSelected(false);						
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.modificacionlineasproductosLogic=this.modificacionlineasproductosLogic;
		
		this.cargarCombosFrameForeignKeyModificacionLineasProductos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleModificacionLineasProductos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleModificacionLineasProductos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyModificacionLineasProductos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyModificacionLineasProductos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModificacionLineasProductos"));
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ModificarModificacionLineasProductos"));

		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarModificacionLineasProductos"));
					
		this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemModificarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarModificacionLineasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"ActualizarModificacionLineasProductos"));
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModificacionLineasProductos"));
						
		this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemActualizarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModificacionLineasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"EliminarModificacionLineasProductos"));
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarModificacionLineasProductos"));
								
		this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemEliminarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModificacionLineasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CancelarModificacionLineasProductos"));
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarModificacionLineasProductos"));
					
		this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemCancelarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModificacionLineasProductos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemDetalleCerrarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModificacionLineasProductos"));		
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModificacionLineasProductos"));
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModificacionLineasProductos"));
		
		
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModificacionLineasProductos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonidModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModificacionLineasProductos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameModificacionLineasProductos"));
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarModificacionLineasProductos"));
		}
		
		this.jTableDatosModificacionLineasProductos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarModificacionLineasProductos"));
		
		this.jTableDatosModificacionLineasProductos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarModificacionLineasProductos"));
		
		this.jButtonNuevoModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"NuevoModificacionLineasProductos"));
		
		this.jButtonDuplicarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"DuplicarModificacionLineasProductos"));
		
		this.jButtonCopiarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"CopiarModificacionLineasProductos"));
		
		this.jButtonVerFormModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"VerFormModificacionLineasProductos"));
		
		
		this.jButtonNuevoToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"NuevoToolBarModificacionLineasProductos"));
			
		this.jButtonDuplicarToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarModificacionLineasProductos"));
			
		this.jMenuItemNuevoModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoModificacionLineasProductos"));
			
		this.jMenuItemDuplicarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarModificacionLineasProductos"));		
		
		
		this.jButtonNuevoRelacionesModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesModificacionLineasProductos"));
		
		
		this.jButtonNuevoRelacionesToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarModificacionLineasProductos"));
			
		this.jMenuItemNuevoRelacionesModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesModificacionLineasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ModificarModificacionLineasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonModificarToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ModificarToolBarModificacionLineasProductos"));
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemModificarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"MenuItemModificarModificacionLineasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"ActualizarModificacionLineasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonActualizarToolBarModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarModificacionLineasProductos"));
				
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemActualizarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarModificacionLineasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"EliminarModificacionLineasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonEliminarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"EliminarToolBarModificacionLineasProductos"));
						
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemEliminarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarModificacionLineasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CancelarModificacionLineasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonCancelarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CancelarToolBarModificacionLineasProductos"));
			
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemCancelarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarModificacionLineasProductos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarModificacionLineasProductos"));		
		
		
		this.jButtonCerrarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CerrarModificacionLineasProductos"));
		
		
		this.jButtonCerrarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CerrarToolBarModificacionLineasProductos"));
			
		this.jMenuItemCerrarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarModificacionLineasProductos"));
			
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jMenuItemDetalleCerrarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarModificacionLineasProductos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosModificacionLineasProductos"));
		}
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarModificacionLineasProductos"));
		}
		
		this.jButtonCopiarToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CopiarToolBarModificacionLineasProductos"));
			
		this.jButtonVerFormToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"VerFormToolBarModificacionLineasProductos"));
		
		this.jMenuItemGuardarCambiosModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosModificacionLineasProductos"));
			
		this.jMenuItemCopiarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarModificacionLineasProductos"));		
		
		this.jMenuItemVerFormModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormModificacionLineasProductos"));		
		
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModificacionLineasProductos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarModificacionLineasProductos"));
			
		this.jMenuItemGuardarCambiosTablaModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaModificacionLineasProductos"));		
		
		
		
		this.jButtonRecargarInformacionModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionModificacionLineasProductos"));
					
		this.jButtonRecargarInformacionToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarModificacionLineasProductos"));
		
		this.jMenuItemRecargarInformacionModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionModificacionLineasProductos"));		
		
		
		
		this.jButtonAnterioresModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"AnterioresModificacionLineasProductos"));
		
		
		this.jButtonAnterioresToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarModificacionLineasProductos"));
		
		this.jMenuItemAnterioresModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresModificacionLineasProductos"));		
		
		
		this.jButtonSiguientesModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"SiguientesModificacionLineasProductos"));
		
		
		this.jButtonSiguientesToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarModificacionLineasProductos"));
			
		this.jMenuItemSiguientesModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesModificacionLineasProductos"));
			
		this.jMenuItemAbrirOrderByModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByModificacionLineasProductos"));
			
		this.jMenuItemMostrarOcultarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarModificacionLineasProductos"));
			
		this.jMenuItemDetalleAbrirOrderByModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByModificacionLineasProductos"));
			
		this.jMenuItemDetalleMostarOcultarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarModificacionLineasProductos"));		
		
		
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosModificacionLineasProductos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarModificacionLineasProductos"));
			
		this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosModificacionLineasProductos"));		
		
		
		this.jButtonProcesarInformacionModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"ProcesarInformacionModificacionLineasProductos"));
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosModificacionLineasProductos"));

		this.jCheckBoxSeleccionadosModificacionLineasProductos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosModificacionLineasProductos"));
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioModificacionLineasProductos"));
		}
		
		
		this.jComboBoxTiposRelacionesModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"TiposRelacionesModificacionLineasProductos"));
			
		this.jComboBoxTiposAccionesModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"TiposAccionesModificacionLineasProductos"));
					
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarModificacionLineasProductos"));
			
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralModificacionLineasProductos"));		
		
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonidModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"BusquedaModificacionLineasProductosModificacionLineasProductos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoModificacionLineasProductos!=null) {
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModificacionLineasProductos"));
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModificacionLineasProductos"));
				this.jInternalFrameReporteDinamicoModificacionLineasProductos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModificacionLineasProductos"));
			}
			
			//this.jButtonCerrarReporteDinamicoModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoModificacionLineasProductos"));				
			//this.jButtonGenerarReporteDinamicoModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoModificacionLineasProductos"));
			//this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoModificacionLineasProductos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionModificacionLineasProductos!=null) {
				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionModificacionLineasProductos"));
				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionModificacionLineasProductos"));
				this.jInternalFrameImportacionModificacionLineasProductos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionModificacionLineasProductos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByModificacionLineasProductos"));
			
			this.jButtonAbrirOrderByToolBarModificacionLineasProductos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarModificacionLineasProductos"));			
			
			if(this.jInternalFrameOrderByModificacionLineasProductos!=null) {
				this.jInternalFrameOrderByModificacionLineasProductos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByModificacionLineasProductos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormModificacionLineasProductos.jTabbedPaneRelacionesModificacionLineasProductos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesModificacionLineasProductos"));
		
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
            		closingInternalFrameModificacionLineasProductos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormModificacionLineasProductos = (JInternalFrameBase)event.getSource();
	            	
	            ModificacionLineasProductosBeanSwingJInternalFrame jInternalFrameParent=(ModificacionLineasProductosBeanSwingJInternalFrame)jInternalFrameDetalleFormModificacionLineasProductos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarModificacionLineasProductosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosModificacionLineasProductos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosModificacionLineasProductosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosModificacionLineasProductos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosModificacionLineasProductos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoModificacionLineasProductos";
		inputMap = this.jButtonNuevoModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesModificacionLineasProductos";
		inputMap = this.jButtonNuevoRelacionesModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoModificacionLineasProductosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarModificacionLineasProductos";
		inputMap = this.jButtonModificarModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarModificacionLineasProductos";
		inputMap = this.jButtonActualizarModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarModificacionLineasProductos";
		inputMap = this.jButtonEliminarModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarModificacionLineasProductos";
		inputMap = this.jButtonCancelarModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarModificacionLineasProductos";
		inputMap = this.jButtonCerrarModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosModificacionLineasProductos";
		inputMap = this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonGuardarCambiosModificacionLineasProductos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosModificacionLineasProductosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonProcesarInformacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonProcesarInformacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosModificacionLineasProductos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosModificacionLineasProductosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesModificacionLineasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesModificacionLineasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarModificacionLineasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarModificacionLineasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralModificacionLineasProductos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralModificacionLineasProductosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonidModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"idModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_productoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_productoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_lineaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoriaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marcaModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_grupo_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupo_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_categoria_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoria_destinoModificacionLineasProductosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormModificacionLineasProductos.jButtonid_linea_marca_destinoModificacionLineasProductosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marca_destinoModificacionLineasProductosBusqueda"));
		
		
		this.jButtonBusquedaModificacionLineasProductosModificacionLineasProductos.addActionListener(new ButtonActionListener(this,"BusquedaModificacionLineasProductosModificacionLineasProductos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionModificacionLineasProductos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionModificacionLineasProductosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarModificacionLineasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarModificacionLineasProductos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosModificacionLineasProductos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
					modificacionlineasproductosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductoss) {
					modificacionlineasproductosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosModificacionLineasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
						modificacionlineasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductoss) {
						modificacionlineasproductosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModificacionLineasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModificacionLineasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosModificacionLineasProductosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosModificacionLineasProductos.getSelectedRows();
			
			ModificacionLineasProductos modificacionlineasproductosLocal=new ModificacionLineasProductos();
			
			//this.seleccionarTodosModificacionLineasProductos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					modificacionlineasproductosLocal =(ModificacionLineasProductos) this.modificacionlineasproductosLogic.getModificacionLineasProductoss().toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					modificacionlineasproductosLocal =(ModificacionLineasProductos) this.modificacionlineasproductoss.toArray()[this.jTableDatosModificacionLineasProductos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				modificacionlineasproductosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
						modificacionlineasproductosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductoss) {
						modificacionlineasproductosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosModificacionLineasProductos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosModificacionLineasProductos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosModificacionLineasProductos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualModificacionLineasProductosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarModificacionLineasProductosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralModificacionLineasProductosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralModificacionLineasProductos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductoss) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesModificacionLineasProductosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioModificacionLineasProductos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesModificacionLineasProductos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteModificacionLineasProductos) {				
					conSplash=true;//false;										
					
					//this.startProcessModificacionLineasProductos(conSplash);
				
					this.generarReporteModificacionLineasProductossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoModificacionLineasProductossSeleccionados();
				//this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModificacionLineasProductossSeleccionados(false);
				//this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoModificacionLineasProductossSeleccionados(true);
				//this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModificacionLineasProductos();
				
				this.exportarModificacionLineasProductossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionModificacionLineasProductoss();
				//this.importarModificacionLineasProductoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessModificacionLineasProductos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelModificacionLineasProductossSeleccionados();
				//this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Modificacion Lineas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessModificacionLineasProductos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoModificacionLineasProductos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyModificacionLineasProductos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
				}	
			} 			
			else if(ModificacionLineasProductosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteModificacionLineasProductos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessModificacionLineasProductos(conSplash);
					
						//this.actualizarParametrosGeneralModificacionLineasProductos();
						
						this.generarReporteProcesoAccionModificacionLineasProductossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ModificacionLineasProductosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Modificacion Lineas ProductosES SELECCIONADOS?", "MANTENIMIENTO DE Modificacion Lineas Productos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessModificacionLineasProductos();
				
						this.actualizarParametrosGeneralModificacionLineasProductos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.modificacionlineasproductosReturnGeneral=modificacionlineasproductosLogic.procesarAccionModificacionLineasProductossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.modificacionlineasproductosLogic.getModificacionLineasProductoss(),this.modificacionlineasproductosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarModificacionLineasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralModificacionLineasProductos();
					
					ModificacionLineasProductosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarModificacionLineasProductosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesModificacionLineasProductos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxTiposAccionesFormularioModificacionLineasProductos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessModificacionLineasProductos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesModificacionLineasProductosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessModificacionLineasProductos();
			
			if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
			ModificacionLineasProductos modificacionlineasproductos=new ModificacionLineasProductos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingModificacionLineasProductos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesModificacionLineasProductos.getSelectedItem();
			
			
			
			
			modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
			//this.sTipoAccion;
			
			if(modificacionlineasproductossSeleccionados.size()==1) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
					modificacionlineasproductos=modificacionlineasproductosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessModificacionLineasProductos();
			
      		//this.finishProcessModificacionLineasProductos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarModificacionLineasProductosReturnGeneral() throws Exception {
		if(this.modificacionlineasproductosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.modificacionlineasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.modificacionlineasproductosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.modificacionlineasproductosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.modificacionlineasproductosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.modificacionlineasproductosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingModificacionLineasProductos(false);
		}
		
		if(this.modificacionlineasproductosReturnGeneral.getConRetornoLista() || this.modificacionlineasproductosReturnGeneral.getConRetornoObjeto()) {
			if(this.modificacionlineasproductosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.modificacionlineasproductosLogic.setModificacionLineasProductoss(this.modificacionlineasproductosReturnGeneral.getModificacionLineasProductoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingModificacionLineasProductos(false);
		}
	}
	
	public void actualizarParametrosGeneralModificacionLineasProductos() throws Exception {
		
		
	}
	
	public ArrayList<ModificacionLineasProductos> getModificacionLineasProductossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioModificacionLineasProductos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductosLogic.getModificacionLineasProductoss()) {
					if(modificacionlineasproductosAux.getIsSelected()) {
						modificacionlineasproductossSeleccionados.add(modificacionlineasproductosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ModificacionLineasProductos modificacionlineasproductosAux:this.modificacionlineasproductoss) {
					if(modificacionlineasproductosAux.getIsSelected()) {
						modificacionlineasproductossSeleccionados.add(modificacionlineasproductosAux);				
					}
				}
			}
			
			if(modificacionlineasproductossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						modificacionlineasproductossSeleccionados.addAll(this.modificacionlineasproductosLogic.getModificacionLineasProductoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						modificacionlineasproductossSeleccionados.addAll(this.modificacionlineasproductoss);				
					}
				}
			}
		} else {
			modificacionlineasproductossSeleccionados.add(this.modificacionlineasproductos);
		}
		
		return modificacionlineasproductossSeleccionados;
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
	
	public void generarReporteModificacionLineasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalModificacionLineasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoModificacionLineasProductossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModificacionLineasProductossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoModificacionLineasProductossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Modificacion Lineas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados);
		
	}	
	
	public void generarReporteNormalModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionModificacionLineasProductossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoModificacionLineasProductos();
		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoModificacionLineasProductos();
		
		
		//this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados ,modificacionlineasproductosImplementable,modificacionlineasproductosImplementableHome);
	}
	
	public void mostrarImportacionModificacionLineasProductoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionModificacionLineasProductos();
		
		this.abrirFrameImportacionModificacionLineasProductos();		
		
			
		//this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados ,modificacionlineasproductosImplementable,modificacionlineasproductosImplementableHome);
	}
	
	public void importarModificacionLineasProductoss() throws Exception {		
	
	}
	
	public void exportarModificacionLineasProductossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelModificacionLineasProductossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoModificacionLineasProductossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlModificacionLineasProductossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Modificacion Lineas Productos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarModificacionLineasProductos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarModificacionLineasProductos(modificacionlineasproductosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//modificacionlineasproductosAux.setsDetalleGeneralEntityReporte(modificacionlineasproductosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarModificacionLineasProductos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=modificacionlineasproductos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getproducto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineadestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineagrupodestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineacategoriadestino_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=modificacionlineasproductos.getlineamarcadestino_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ModificacionLineasProductoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelModificacionLineasProductos(row);				
				iRow++;
			}				
			
			for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelModificacionLineasProductos(modificacionlineasproductosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlModificacionLineasProductossSeleccionados() throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();		
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"modificacionlineasproductos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("modificacionlineasproductoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("modificacionlineasproductos");
			//elementRoot.appendChild(element);
		
			for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
				element = document.createElement("modificacionlineasproductos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlModificacionLineasProductos(modificacionlineasproductosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Modificacion Lineas Productos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelModificacionLineasProductos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getproducto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineadestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineagrupodestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineacategoriadestino_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(modificacionlineasproductos.getlineamarcadestino_descripcion());				
	}
	
	public void setFilaDatosExportarXmlModificacionLineasProductos(ModificacionLineasProductos modificacionlineasproductos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ModificacionLineasProductosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(modificacionlineasproductos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ModificacionLineasProductosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(modificacionlineasproductos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementproducto_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDPRODUCTO);
		elementproducto_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getproducto_descripcion()));
		element.appendChild(elementproducto_descripcion);

		Element elementlinea_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementlineadestino_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEADESTINO);
		elementlineadestino_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineadestino_descripcion()));
		element.appendChild(elementlineadestino_descripcion);

		Element elementlineagrupodestino_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEAGRUPODESTINO);
		elementlineagrupodestino_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineagrupodestino_descripcion()));
		element.appendChild(elementlineagrupodestino_descripcion);

		Element elementlineacategoriadestino_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEACATEGORIADESTINO);
		elementlineacategoriadestino_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineacategoriadestino_descripcion()));
		element.appendChild(elementlineacategoriadestino_descripcion);

		Element elementlineamarcadestino_descripcion = document.createElement(ModificacionLineasProductosConstantesFunciones.IDLINEAMARCADESTINO);
		elementlineamarcadestino_descripcion.appendChild(document.createTextNode(modificacionlineasproductos.getlineamarcadestino_descripcion()));
		element.appendChild(elementlineamarcadestino_descripcion);
	}
	
	public void generarReporteGroupGenericoModificacionLineasProductossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados=new ArrayList<ModificacionLineasProductos>();
		
		modificacionlineasproductossSeleccionados=this.getModificacionLineasProductossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoModificacionLineasProductos(modificacionlineasproductossSeleccionados);
		
		this.generarReporteModificacionLineasProductoss("Todos",modificacionlineasproductossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoModificacionLineasProductos(ArrayList<ModificacionLineasProductos> modificacionlineasproductossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ModificacionLineasProductos modificacionlineasproductosAux:modificacionlineasproductossSeleccionados) {
				modificacionlineasproductosAux.setsDetalleGeneralEntityReporte(modificacionlineasproductosAux.toString());
			
				if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDPRODUCTO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getproducto_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEADESTINO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineadestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAGRUPODESTINO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineagrupodestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEACATEGORIADESTINO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineacategoriadestino_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ModificacionLineasProductosConstantesFunciones.LABEL_IDLINEAMARCADESTINO)) {
					existe=true;
					modificacionlineasproductosAux.setsDescripcionGeneralEntityReporte1(modificacionlineasproductosAux.getlineamarcadestino_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ModificacionLineasProductosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesModificacionLineasProductos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoModificacionLineasProductos=true;
				this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=true;
				this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=true;
			}
			
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=true;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=true;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=true;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=true;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=true;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=true;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
			this.isVisibilidadCeldaModificarModificacionLineasProductos=true;
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
			this.isVisibilidadCeldaCancelarModificacionLineasProductos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				} else {
					this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ModificacionLineasProductosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=true;
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=true;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=true;
		} else {
			this.actualizarEstadoPanelsModificacionLineasProductos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarModificacionLineasProductos=false;
			//this.isVisibilidadCeldaVerFormModificacionLineasProductos=false;
			this.isVisibilidadCeldaDuplicarModificacionLineasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
		} else {
			this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
			this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!modificacionlineasproductosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;												
			}
			
			this.jButtonCerrarModificacionLineasProductos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
		}
		
		if(!this.permiteMantenimiento(this.modificacionlineasproductos)) {
			this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
			this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoModificacionLineasProductos=false;
		this.isVisibilidadCeldaNuevoRelacionesModificacionLineasProductos=false;
		this.isVisibilidadCeldaGuardarCambiosModificacionLineasProductos=false;
		//this.isVisibilidadCeldaModificarModificacionLineasProductos=true;
		this.isVisibilidadCeldaActualizarModificacionLineasProductos=false;
		this.isVisibilidadCeldaEliminarModificacionLineasProductos=false;
		//this.isVisibilidadCeldaCancelarModificacionLineasProductos=true;			
		this.isVisibilidadCeldaGuardarModificacionLineasProductos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesModificacionLineasProductos() {
	}
	
	public void actualizarEstadoPanelsModificacionLineasProductos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionModificacionLineasProductos!=null) {
				this.jScrollPanelDatosEdicionModificacionLineasProductos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosModificacionLineasProductos!=null) {
				this.jScrollPanelDatosModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelPaginacionModificacionLineasProductos!=null) {
				this.jPanelPaginacionModificacionLineasProductos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
					this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.modificacionlineasproductosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasModificacionLineasProductos!=null) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesModificacionLineasProductos!=null) {
				this.jPanelParametrosReportesModificacionLineasProductos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaProducto(Boolean isParaProducto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProductoNegation=!isParaProducto;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaProducto;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLinea;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaDestino(Boolean isParaLineaDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaDestinoNegation=!isParaLineaDestino;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaDestino;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupoDestino(Boolean isParaLineaGrupoDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoDestinoNegation=!isParaLineaGrupoDestino;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaGrupoDestino;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoriaDestino(Boolean isParaLineaCategoriaDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaDestinoNegation=!isParaLineaCategoriaDestino;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaCategoriaDestino;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarcaDestino(Boolean isParaLineaMarcaDestino){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaDestinoNegation=!isParaLineaMarcaDestino;

			this.isVisibilidadBusquedaModificacionLineasProductos=isParaLineaMarcaDestino;
			if(!this.isVisibilidadBusquedaModificacionLineasProductos) {this.jTabbedPaneBusquedasModificacionLineasProductos.remove(jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);}
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
			
			this.inicializarActualizarBindingTablaModificacionLineasProductos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioModificacionLineasProductos() {
		this.updateBorderResaltarBusquedasFormularioModificacionLineasProductos();
		this.updateVisibilidadBusquedasFormularioModificacionLineasProductos();
		this.updateHabilitarBusquedasFormularioModificacionLineasProductos();
	}
	
	public void updateBorderResaltarBusquedasFormularioModificacionLineasProductos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasModificacionLineasProductos.getComponents().length>0) {
	

		if(this.modificacionlineasproductosConstantesFunciones.resaltarBusquedaModificacionLineasProductosModificacionLineasProductos!=null) {
			index= this.jTabbedPaneBusquedasModificacionLineasProductos.indexOfComponent(this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModificacionLineasProductos.getComponent(index);
				jPanel.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarBusquedaModificacionLineasProductosModificacionLineasProductos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioModificacionLineasProductos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasModificacionLineasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModificacionLineasProductos.indexOfComponent(this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasModificacionLineasProductos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarBusquedaModificacionLineasProductosModificacionLineasProductos);
			if(!this.modificacionlineasproductosConstantesFunciones.mostrarBusquedaModificacionLineasProductosModificacionLineasProductos && index>-1) {
				this.jTabbedPaneBusquedasModificacionLineasProductos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioModificacionLineasProductos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasModificacionLineasProductos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasModificacionLineasProductos.indexOfComponent(this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasModificacionLineasProductos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarBusquedaModificacionLineasProductosModificacionLineasProductos);
				this.jTabbedPaneBusquedasModificacionLineasProductos.setEnabledAt(index,this.modificacionlineasproductosConstantesFunciones.activarBusquedaModificacionLineasProductosModificacionLineasProductos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaModificacionLineasProductos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaModificacionLineasProductos")) {
			index= this.jTabbedPaneBusquedasModificacionLineasProductos.indexOfComponent(this.jPanelBusquedaModificacionLineasProductosModificacionLineasProductos);

			this.jTabbedPaneBusquedasModificacionLineasProductos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasModificacionLineasProductos.getComponent(index);

			this.modificacionlineasproductosConstantesFunciones.setResaltarBusquedaModificacionLineasProductosModificacionLineasProductos(resaltar);

			jPanel.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarBusquedaModificacionLineasProductosModificacionLineasProductos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarModificacionLineasProductos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioModificacionLineasProductos() throws Exception {

		if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioModificacionLineasProductos();
		this.updateVisibilidadResaltarControlesFormularioModificacionLineasProductos();
		this.updateHabilitarResaltarControlesFormularioModificacionLineasProductos();
		
	}
	
	public void updateBorderResaltarControlesFormularioModificacionLineasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.modificacionlineasproductosConstantesFunciones.resaltaridModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltaridModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_productoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_productoModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_lineaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_lineaModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupoModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoriaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoriaModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marcaModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marcaModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_destinoModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupo_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_grupo_destinoModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoria_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_categoria_destinoModificacionLineasProductos);}
		if(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marca_destinoModificacionLineasProductos!=null && this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setBorder(this.modificacionlineasproductosConstantesFunciones.resaltarid_linea_marca_destinoModificacionLineasProductos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioModificacionLineasProductos() throws Exception {		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
	
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostraridModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelidModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostraridModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_productoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_productoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_productoModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_lineaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_lineaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_lineaModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_grupoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupoModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoriaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_categoriaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoriaModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marcaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_marcaModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marcaModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_destinoModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupo_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_grupo_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_grupo_destinoModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoria_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_categoria_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_categoria_destinoModificacionLineasProductos);
		//this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marca_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jPanelid_linea_marca_destinoModificacionLineasProductos.setVisible(this.modificacionlineasproductosConstantesFunciones.mostrarid_linea_marca_destinoModificacionLineasProductos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioModificacionLineasProductos() throws Exception {
		if(this.jInternalFrameDetalleFormModificacionLineasProductos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormModificacionLineasProductos!=null) {
	
		this.jInternalFrameDetalleFormModificacionLineasProductos.jLabelidModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activaridModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_productoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_productoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_lineaModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_lineaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoriaModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoriaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marcaModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_marcaModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_destinoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_grupo_destinoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_grupo_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_categoria_destinoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_categoria_destinoModificacionLineasProductos);
		this.jInternalFrameDetalleFormModificacionLineasProductos.jComboBoxid_linea_marca_destinoModificacionLineasProductos.setEnabled(this.modificacionlineasproductosConstantesFunciones.activarid_linea_marca_destinoModificacionLineasProductos);
		}
	}
	
		
}