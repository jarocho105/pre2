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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.LineaPuntoVentaConstantesFunciones;
import com.bydan.erp.puntoventa.util.LineaPuntoVentaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.LineaPuntoVentaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.LineaPuntoVentaBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class LineaPuntoVentaBeanSwingJInternalFrame extends LineaPuntoVentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LineaPuntoVentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LineaPuntoVenta> lineapuntoventaValidator = new ClassValidator<LineaPuntoVenta>(LineaPuntoVenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LineaPuntoVenta lineapuntoventa;	
	public LineaPuntoVenta lineapuntoventaAux;
	public LineaPuntoVenta lineapuntoventaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LineaPuntoVenta lineapuntoventaTotales;
	public Long idLineaPuntoVentaActual;
	public Long iIdNuevoLineaPuntoVenta=0L;
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
	
	public Boolean isPermisoTodoLineaPuntoVenta;
	public Boolean isPermisoNuevoLineaPuntoVenta;
	public Boolean isPermisoActualizarLineaPuntoVenta;
	public Boolean isPermisoActualizarOriginalLineaPuntoVenta;
	public Boolean isPermisoEliminarLineaPuntoVenta;
	public Boolean isPermisoGuardarCambiosLineaPuntoVenta;
	public Boolean isPermisoConsultaLineaPuntoVenta;
	public Boolean isPermisoBusquedaLineaPuntoVenta;
	public Boolean isPermisoReporteLineaPuntoVenta;
	public Boolean isPermisoPaginacionMedioLineaPuntoVenta;
	public Boolean isPermisoPaginacionAltoLineaPuntoVenta;
	public Boolean isPermisoPaginacionTodoLineaPuntoVenta;
	public Boolean isPermisoCopiarLineaPuntoVenta;
	public Boolean isPermisoVerFormLineaPuntoVenta;
	public Boolean isPermisoDuplicarLineaPuntoVenta;
	public Boolean isPermisoOrdenLineaPuntoVenta;
	
	
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
	
	public LineaPuntoVentaParameterReturnGeneral lineapuntoventaReturnGeneral;
	public LineaPuntoVentaParameterReturnGeneral lineapuntoventaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLineaPuntoVenta=false;
	public Boolean esParaAccionDesdeFormularioLineaPuntoVenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LineaPuntoVentaSessionBeanAdditional lineapuntoventaSessionBeanAdditional=null;
	
	public LineaPuntoVentaSessionBeanAdditional getLineaPuntoVentaSessionBeanAdditional() {
		return this.lineapuntoventaSessionBeanAdditional;
	}
	
	public void setLineaPuntoVentaSessionBeanAdditional(LineaPuntoVentaSessionBeanAdditional lineapuntoventaSessionBeanAdditional) {
		try {
			this.lineapuntoventaSessionBeanAdditional=lineapuntoventaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LineaPuntoVentaBeanSwingJInternalFrameAdditional lineapuntoventaBeanSwingJInternalFrameAdditional=null;
	//public class LineaPuntoVentaBeanSwingJInternalFrame
	
	public LineaPuntoVentaBeanSwingJInternalFrameAdditional getLineaPuntoVentaBeanSwingJInternalFrameAdditional() {
		return this.lineapuntoventaBeanSwingJInternalFrameAdditional;
	}
	
	public void setLineaPuntoVentaBeanSwingJInternalFrameAdditional(LineaPuntoVentaBeanSwingJInternalFrameAdditional lineapuntoventaBeanSwingJInternalFrameAdditional) {
		try {
			this.lineapuntoventaBeanSwingJInternalFrameAdditional=lineapuntoventaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LineaPuntoVentaLogic lineapuntoventaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LineaPuntoVenta lineapuntoventaBean;
	public LineaPuntoVentaConstantesFunciones lineapuntoventaConstantesFunciones;
	//public LineaPuntoVentaParameterReturnGeneral lineapuntoventaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<LineaPuntoVenta> lineapuntoventas;	
	//public List<LineaPuntoVenta> lineapuntoventasEliminados;
	//public List<LineaPuntoVenta> lineapuntoventasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaDuplicarLineaPuntoVenta=true;
	public Boolean isVisibilidadCeldaCopiarLineaPuntoVenta=true;
	public Boolean isVisibilidadCeldaVerFormLineaPuntoVenta=true;
	public Boolean isVisibilidadCeldaOrdenLineaPuntoVenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaModificarLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaActualizarLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaEliminarLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaCancelarLineaPuntoVenta=false;
	public Boolean isVisibilidadCeldaGuardarLineaPuntoVenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoLineaPuntoVenta() {
		return this.iIdNuevoLineaPuntoVenta;
	}

	public void setiIdNuevoLineaPuntoVenta(Long iIdNuevoLineaPuntoVenta) {
		this.iIdNuevoLineaPuntoVenta = iIdNuevoLineaPuntoVenta;
	}
	
	public Long getidLineaPuntoVentaActual() {
		return this.idLineaPuntoVentaActual;
	}

	public void setidLineaPuntoVentaActual(Long idLineaPuntoVentaActual) {
		this.idLineaPuntoVentaActual = idLineaPuntoVentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LineaPuntoVenta getlineapuntoventa() {
		return this.lineapuntoventa;
	}

	public void setlineapuntoventa(LineaPuntoVenta lineapuntoventa) {
		this.lineapuntoventa = lineapuntoventa;
	}
	
	public LineaPuntoVenta getlineapuntoventaAux() {
		return this.lineapuntoventaAux;
	}

	public void setlineapuntoventaAux(LineaPuntoVenta lineapuntoventaAux) {
		this.lineapuntoventaAux = lineapuntoventaAux;
	}				
	
	public LineaPuntoVenta getlineapuntoventaAnterior() {
		return this.lineapuntoventaAnterior;
	}

	public void setlineapuntoventaAnterior(LineaPuntoVenta lineapuntoventaAnterior) {
		this.lineapuntoventaAnterior = lineapuntoventaAnterior;
	}	
	
	public LineaPuntoVenta getlineapuntoventaTotales() {
		return this.lineapuntoventaTotales;
	}

	public void setlineapuntoventaTotales(LineaPuntoVenta lineapuntoventaTotales) {
		this.lineapuntoventaTotales = lineapuntoventaTotales;
	}	
	
	public LineaPuntoVenta getlineapuntoventaBean() {
		return this.lineapuntoventaBean;
	}

	public void setlineapuntoventaBean(LineaPuntoVenta lineapuntoventaBean) {
		this.lineapuntoventaBean = lineapuntoventaBean;
	}	
	
	public LineaPuntoVentaParameterReturnGeneral getlineapuntoventaReturnGeneral() {
		return this.lineapuntoventaReturnGeneral;
	}

	public void setlineapuntoventaReturnGeneral(LineaPuntoVentaParameterReturnGeneral lineapuntoventaReturnGeneral) {
		this.lineapuntoventaReturnGeneral = lineapuntoventaReturnGeneral;
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

	public Long id_linea_categoriaFK_IdLineaCategoria=null;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=null;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=null;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
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
	
	
	public LineaPuntoVentaLogic getLineaPuntoVentaLogic()	{		
		return lineapuntoventaLogic;
	}

	public void setLineaPuntoVentaLogic(LineaPuntoVentaLogic lineapuntoventaLogic) {
		this.lineapuntoventaLogic = lineapuntoventaLogic;
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
	
	public Boolean getIsEsNuevoLineaPuntoVenta() {
		return isEsNuevoLineaPuntoVenta;
	}

	public void setIsEsNuevoLineaPuntoVenta(Boolean isEsNuevoLineaPuntoVenta) {
		this.isEsNuevoLineaPuntoVenta = isEsNuevoLineaPuntoVenta;
	}

	public Boolean getEsParaAccionDesdeFormularioLineaPuntoVenta() {
		return esParaAccionDesdeFormularioLineaPuntoVenta;
	}
	
	public void setEsParaAccionDesdeFormularioLineaPuntoVenta(Boolean esParaAccionDesdeFormularioLineaPuntoVenta) {
		this.esParaAccionDesdeFormularioLineaPuntoVenta = esParaAccionDesdeFormularioLineaPuntoVenta;
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

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidEmpresaActual());
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

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidSucursalActual());
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

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidLineaActual());
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

			Linea lineagrupoNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineagruposForeignKey.add(0, lineagrupoNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidLineaGrupoActual());
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

			Linea lineacategoriaNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineacategoriasForeignKey.add(0, lineacategoriaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidLineaCategoriaActual());
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

			Linea lineamarcaNulo = new Linea();

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.lineamarcasForeignKey.add(0, lineamarcaNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(lineapuntoventaSessionBean.getlidLineaMarcaActual());
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLineaPuntoVenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_empresaLineaPuntoVentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLineaPuntoVentaGenerico!=null && jComboBoxid_empresaLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaLineaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalLineaPuntoVenta.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_sucursalLineaPuntoVentaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalLineaPuntoVentaGenerico!=null && jComboBoxid_sucursalLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalLineaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaLineaPuntoVenta.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaFK_IdLineaLineaPuntoVenta!=null) {
						jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaFK_IdLineaLineaPuntoVenta!=null) {
							//jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.getItemCount()>0) {
								jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_lineaLineaPuntoVentaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaLineaPuntoVentaGenerico!=null && jComboBoxid_lineaLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_lineaLineaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta!=null) {
						jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta!=null) {
							//jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_linea_grupoLineaPuntoVentaGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoLineaPuntoVentaGenerico!=null && jComboBoxid_linea_grupoLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoLineaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaCategoria") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta!=null) {
						jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta!=null) {
							//jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_linea_categoriaLineaPuntoVentaGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaLineaPuntoVentaGenerico!=null && jComboBoxid_linea_categoriaLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaLineaPuntoVentaGenerico.setSelectedIndex(0);
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

					if(this.lineapuntoventa!=null) {
						this.lineapuntoventa.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdLineaMarca") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta!=null) {
						jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta!=null) {
							//jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.getItemCount()>0) {
								jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaLineaPuntoVentaGenerico)throws Exception
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
				jComboBoxid_linea_marcaLineaPuntoVentaGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaLineaPuntoVentaGenerico!=null && jComboBoxid_linea_marcaLineaPuntoVentaGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaLineaPuntoVentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_empresaLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLineaPuntoVentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				lineapuntoventa.setid_empresa(empresaAux.getId());
				lineapuntoventa.setempresa_descripcion(LineaPuntoVentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				lineapuntoventa.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_sucursalLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalLineaPuntoVentaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				lineapuntoventa.setid_sucursal(sucursalAux.getId());
				lineapuntoventa.setsucursal_descripcion(LineaPuntoVentaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				lineapuntoventa.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_lineaLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaLineaPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				lineapuntoventa.setid_linea(lineaAux.getId());
				lineapuntoventa.setlinea_descripcion(LineaPuntoVentaConstantesFunciones.getLineaDescripcion(lineaAux));
				lineapuntoventa.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_linea_grupoLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoLineaPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				lineapuntoventa.setid_linea_grupo(lineaAux.getId());
				lineapuntoventa.setlineagrupo_descripcion(LineaPuntoVentaConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				lineapuntoventa.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_linea_categoriaLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaLineaPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				lineapuntoventa.setid_linea_categoria(lineaAux.getId());
				lineapuntoventa.setlineacategoria_descripcion(LineaPuntoVentaConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				lineapuntoventa.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(LineaPuntoVenta lineapuntoventa,JComboBox jComboBoxid_linea_marcaLineaPuntoVentaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaLineaPuntoVentaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaLineaPuntoVentaGenerico.getSelectedItem();
			}

			if(lineaAux!=null) {
				lineapuntoventa.setid_linea_marca(lineaAux.getId());
				lineapuntoventa.setlineamarca_descripcion(LineaPuntoVentaConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				lineapuntoventa.setLineaMarca(lineaAux);			}
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLinea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.addItem(linea);
							}
						}

						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.addItem(lineagrupo);
							}
						}

						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaCategoria") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.addItem(lineacategoria);
							}
						}

						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { 
					}

					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdLineaMarca") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.addItem(lineamarca);
							}
						}

						if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLineaPuntoVenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LineaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesLineaPuntoVenta(this.lineapuntoventaLogic.getLineaPuntoVentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LineaPuntoVentaConstantesFunciones.refrescarForeignKeysDescripcionesLineaPuntoVenta(this.lineapuntoventas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Linea.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//lineapuntoventaLogic.setLineaPuntoVentas(this.lineapuntoventas);
			lineapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LineaPuntoVentaParameterReturnGeneral getLineaPuntoVentaParameterGeneral() {
		return this.lineapuntoventaParameterGeneral;
	}
	
	public void setLineaPuntoVentaParameterGeneral(LineaPuntoVentaParameterReturnGeneral lineapuntoventaParameterGeneral) {
		this.lineapuntoventaParameterGeneral = lineapuntoventaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLineaPuntoVenta() {
		return isPermisoTodoLineaPuntoVenta;
	}

	public void setIsPermisoTodoLineaPuntoVenta(Boolean isPermisoTodoLineaPuntoVenta) {
		this.isPermisoTodoLineaPuntoVenta = isPermisoTodoLineaPuntoVenta;
	}

	public Boolean getIsPermisoNuevoLineaPuntoVenta() {
		return isPermisoNuevoLineaPuntoVenta;
	}

	public void setIsPermisoNuevoLineaPuntoVenta(Boolean isPermisoNuevoLineaPuntoVenta) {
		this.isPermisoNuevoLineaPuntoVenta = isPermisoNuevoLineaPuntoVenta;
	}

	public Boolean getIsPermisoActualizarLineaPuntoVenta() {
		return isPermisoActualizarLineaPuntoVenta;
	}

	public void setIsPermisoActualizarLineaPuntoVenta(Boolean isPermisoActualizarLineaPuntoVenta) {
		this.isPermisoActualizarLineaPuntoVenta = isPermisoActualizarLineaPuntoVenta;
	}

	public Boolean getIsPermisoEliminarLineaPuntoVenta() {
		return isPermisoEliminarLineaPuntoVenta;
	}

	public void setIsPermisoEliminarLineaPuntoVenta(Boolean isPermisoEliminarLineaPuntoVenta) {
		this.isPermisoEliminarLineaPuntoVenta = isPermisoEliminarLineaPuntoVenta;
	}

	public Boolean getIsPermisoGuardarCambiosLineaPuntoVenta() {
		return isPermisoGuardarCambiosLineaPuntoVenta;
	}

	public void setIsPermisoGuardarCambiosLineaPuntoVenta(Boolean isPermisoGuardarCambiosLineaPuntoVenta) {
		this.isPermisoGuardarCambiosLineaPuntoVenta = isPermisoGuardarCambiosLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoConsultaLineaPuntoVenta() {
		return isPermisoConsultaLineaPuntoVenta;
	}

	public void setIsPermisoConsultaLineaPuntoVenta(Boolean isPermisoConsultaLineaPuntoVenta) {
		this.isPermisoConsultaLineaPuntoVenta = isPermisoConsultaLineaPuntoVenta;
	}

	public Boolean getIsPermisoBusquedaLineaPuntoVenta() {
		return isPermisoBusquedaLineaPuntoVenta;
	}

	public void setIsPermisoBusquedaLineaPuntoVenta(Boolean isPermisoBusquedaLineaPuntoVenta) {
		this.isPermisoBusquedaLineaPuntoVenta = isPermisoBusquedaLineaPuntoVenta;
	}

	public Boolean getIsPermisoReporteLineaPuntoVenta() {
		return isPermisoReporteLineaPuntoVenta;
	}

	public void setIsPermisoReporteLineaPuntoVenta(Boolean isPermisoReporteLineaPuntoVenta) {
		this.isPermisoReporteLineaPuntoVenta = isPermisoReporteLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioLineaPuntoVenta() {
		return isPermisoPaginacionMedioLineaPuntoVenta;
	}

	public void setIsPermisoPaginacionMedioLineaPuntoVenta(Boolean isPermisoPaginacionMedioLineaPuntoVenta) {
		this.isPermisoPaginacionMedioLineaPuntoVenta = isPermisoPaginacionMedioLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoLineaPuntoVenta() {
		return isPermisoPaginacionTodoLineaPuntoVenta;
	}

	public void setIsPermisoPaginacionTodoLineaPuntoVenta(Boolean isPermisoPaginacionTodoLineaPuntoVenta) {
		this.isPermisoPaginacionTodoLineaPuntoVenta = isPermisoPaginacionTodoLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoLineaPuntoVenta() {
		return isPermisoPaginacionAltoLineaPuntoVenta;
	}

	public void setIsPermisoPaginacionAltoLineaPuntoVenta(Boolean isPermisoPaginacionAltoLineaPuntoVenta) {
		this.isPermisoPaginacionAltoLineaPuntoVenta = isPermisoPaginacionAltoLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoCopiarLineaPuntoVenta() {
		return isPermisoCopiarLineaPuntoVenta;
	}

	public void setIsPermisoCopiarLineaPuntoVenta(Boolean isPermisoCopiarLineaPuntoVenta) {
		this.isPermisoCopiarLineaPuntoVenta = isPermisoCopiarLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoVerFormLineaPuntoVenta() {
		return isPermisoVerFormLineaPuntoVenta;
	}

	public void setIsPermisoVerFormLineaPuntoVenta(Boolean isPermisoVerFormLineaPuntoVenta) {
		this.isPermisoVerFormLineaPuntoVenta = isPermisoVerFormLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoDuplicarLineaPuntoVenta() {
		return isPermisoDuplicarLineaPuntoVenta;
	}

	public void setIsPermisoDuplicarLineaPuntoVenta(Boolean isPermisoDuplicarLineaPuntoVenta) {
		this.isPermisoDuplicarLineaPuntoVenta = isPermisoDuplicarLineaPuntoVenta;
	}
	
	public Boolean getIsPermisoOrdenLineaPuntoVenta() {
		return isPermisoOrdenLineaPuntoVenta;
	}

	public void setIsPermisoOrdenLineaPuntoVenta(Boolean isPermisoOrdenLineaPuntoVenta) {
		this.isPermisoOrdenLineaPuntoVenta = isPermisoOrdenLineaPuntoVenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLineaPuntoVenta() {
		return isVisibilidadCeldaNuevoLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoLineaPuntoVenta(Boolean isVisibilidadCeldaNuevoLineaPuntoVenta) {
		this.isVisibilidadCeldaNuevoLineaPuntoVenta = isVisibilidadCeldaNuevoLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLineaPuntoVenta() {
		return isVisibilidadCeldaDuplicarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaDuplicarLineaPuntoVenta(Boolean isVisibilidadCeldaDuplicarLineaPuntoVenta) {
		this.isVisibilidadCeldaDuplicarLineaPuntoVenta = isVisibilidadCeldaDuplicarLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLineaPuntoVenta() {
		return isVisibilidadCeldaCopiarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCopiarLineaPuntoVenta(Boolean isVisibilidadCeldaCopiarLineaPuntoVenta) {
		this.isVisibilidadCeldaCopiarLineaPuntoVenta = isVisibilidadCeldaCopiarLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLineaPuntoVenta() {
		return isVisibilidadCeldaVerFormLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaVerFormLineaPuntoVenta(Boolean isVisibilidadCeldaVerFormLineaPuntoVenta) {
		this.isVisibilidadCeldaVerFormLineaPuntoVenta = isVisibilidadCeldaVerFormLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLineaPuntoVenta() {
		return isVisibilidadCeldaOrdenLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaOrdenLineaPuntoVenta(Boolean isVisibilidadCeldaOrdenLineaPuntoVenta) {
		this.isVisibilidadCeldaOrdenLineaPuntoVenta = isVisibilidadCeldaOrdenLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLineaPuntoVenta() {
		return isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLineaPuntoVenta(Boolean isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta) {
		this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta = isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLineaPuntoVenta() {
		return isVisibilidadCeldaModificarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaModificarLineaPuntoVenta(Boolean isVisibilidadCeldaModificarLineaPuntoVenta) {
		this.isVisibilidadCeldaModificarLineaPuntoVenta = isVisibilidadCeldaModificarLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLineaPuntoVenta() {
		return isVisibilidadCeldaActualizarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaActualizarLineaPuntoVenta(Boolean isVisibilidadCeldaActualizarLineaPuntoVenta) {
		this.isVisibilidadCeldaActualizarLineaPuntoVenta = isVisibilidadCeldaActualizarLineaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarLineaPuntoVenta() {
		return isVisibilidadCeldaEliminarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaEliminarLineaPuntoVenta(Boolean isVisibilidadCeldaEliminarLineaPuntoVenta) {
		this.isVisibilidadCeldaEliminarLineaPuntoVenta = isVisibilidadCeldaEliminarLineaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarLineaPuntoVenta() {
		return isVisibilidadCeldaCancelarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaCancelarLineaPuntoVenta(Boolean isVisibilidadCeldaCancelarLineaPuntoVenta) {
		this.isVisibilidadCeldaCancelarLineaPuntoVenta = isVisibilidadCeldaCancelarLineaPuntoVenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarLineaPuntoVenta() {
		return isVisibilidadCeldaGuardarLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarLineaPuntoVenta(Boolean isVisibilidadCeldaGuardarLineaPuntoVenta) {
		this.isVisibilidadCeldaGuardarLineaPuntoVenta = isVisibilidadCeldaGuardarLineaPuntoVenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLineaPuntoVenta() {
		return isVisibilidadCeldaGuardarCambiosLineaPuntoVenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLineaPuntoVenta(Boolean isVisibilidadCeldaGuardarCambiosLineaPuntoVenta) {
		this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta = isVisibilidadCeldaGuardarCambiosLineaPuntoVenta;
	}
		
	public LineaPuntoVentaSessionBean getlineapuntoventaSessionBean() {
		return this.lineapuntoventaSessionBean;
	}
	
	public void setlineapuntoventaSessionBean(LineaPuntoVentaSessionBean lineapuntoventaSessionBean) {
		this.lineapuntoventaSessionBean=lineapuntoventaSessionBean;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(LineaPuntoVenta lineapuntoventa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(lineapuntoventa,null);
				this.setActualParaGuardarSucursalForeignKey(lineapuntoventa,null);
				this.setActualParaGuardarLineaForeignKey(lineapuntoventa,null);
				this.setActualParaGuardarLineaGrupoForeignKey(lineapuntoventa,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(lineapuntoventa,null);
				this.setActualParaGuardarLineaMarcaForeignKey(lineapuntoventa,null);
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
	
	public void bugActualizarReferenciaActual(LineaPuntoVenta lineapuntoventa,LineaPuntoVenta lineapuntoventaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLineaPuntoVenta(lineapuntoventa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		lineapuntoventaAux.setId(lineapuntoventa.getId());
		lineapuntoventaAux.setVersionRow(lineapuntoventa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLineaPuntoVenta();
		
			int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = lineapuntoventaValidator.getInvalidValues(this.lineapuntoventa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			lineapuntoventaLogic.setDatosCliente(datosCliente);
			lineapuntoventaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				lineapuntoventaAux=new  LineaPuntoVenta();
				
				lineapuntoventaAux.setIsNew(true);
				lineapuntoventaAux.setIsChanged(true);
				
				lineapuntoventaAux.setLineaPuntoVentaOriginal(this.lineapuntoventa);
				
				lineapuntoventaAux.setId(this.lineapuntoventa.getId());	
				lineapuntoventaAux.setVersionRow(this.lineapuntoventa.getVersionRow());	
				lineapuntoventaAux.setid_empresa(this.lineapuntoventa.getid_empresa());	
				lineapuntoventaAux.setid_sucursal(this.lineapuntoventa.getid_sucursal());	
				lineapuntoventaAux.setid_linea(this.lineapuntoventa.getid_linea());	
				
				if(this.lineapuntoventa.getid_linea_grupo()!=null && this.lineapuntoventa.getid_linea_grupo()>0L) {
					lineapuntoventaAux.setid_linea_grupo(this.lineapuntoventa.getid_linea_grupo());
				} else {
					lineapuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_categoria()!=null && this.lineapuntoventa.getid_linea_categoria()>0L) {
					lineapuntoventaAux.setid_linea_categoria(this.lineapuntoventa.getid_linea_categoria());
				} else {
					lineapuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_marca()!=null && this.lineapuntoventa.getid_linea_marca()>0L) {
					lineapuntoventaAux.setid_linea_marca(this.lineapuntoventa.getid_linea_marca());
				} else {
					lineapuntoventaAux.setid_linea_marca(null);
				}	
				lineapuntoventaAux.setesta_activo(this.lineapuntoventa.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineapuntoventaAux,lineapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.saveLineaPuntoVentas();//WithConnection
						//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesLineaPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineapuntoventaLogic.saveLineaPuntoVentaRelaciones(lineapuntoventaAux);//WithConnection
								//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineapuntoventaAux,lineapuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				lineapuntoventaAux=new  LineaPuntoVenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado() 
					|| (this.lineapuntoventaSessionBean.getEsGuardarRelacionado() && this.lineapuntoventa.getId()>=0)) {
						
					lineapuntoventaAux.setIsNew(false);
				}
				
				lineapuntoventaAux.setIsDeleted(false);
			
				lineapuntoventaAux.setId(this.lineapuntoventa.getId());	
				lineapuntoventaAux.setVersionRow(this.lineapuntoventa.getVersionRow());	
				lineapuntoventaAux.setid_empresa(this.lineapuntoventa.getid_empresa());	
				lineapuntoventaAux.setid_sucursal(this.lineapuntoventa.getid_sucursal());	
				lineapuntoventaAux.setid_linea(this.lineapuntoventa.getid_linea());	
				
				if(this.lineapuntoventa.getid_linea_grupo()!=null && this.lineapuntoventa.getid_linea_grupo()>0L) {
					lineapuntoventaAux.setid_linea_grupo(this.lineapuntoventa.getid_linea_grupo());
				} else {
					lineapuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_categoria()!=null && this.lineapuntoventa.getid_linea_categoria()>0L) {
					lineapuntoventaAux.setid_linea_categoria(this.lineapuntoventa.getid_linea_categoria());
				} else {
					lineapuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_marca()!=null && this.lineapuntoventa.getid_linea_marca()>0L) {
					lineapuntoventaAux.setid_linea_marca(this.lineapuntoventa.getid_linea_marca());
				} else {
					lineapuntoventaAux.setid_linea_marca(null);
				}	
				lineapuntoventaAux.setesta_activo(this.lineapuntoventa.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineapuntoventaAux,lineapuntoventas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.saveLineaPuntoVentas();//WithConnection
						//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);
					
					this.refrescarForeignKeysDescripcionesLineaPuntoVenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineapuntoventaLogic.saveLineaPuntoVentaRelaciones(lineapuntoventaAux);//WithConnection
								//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineapuntoventaAux,lineapuntoventas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.lineapuntoventa,lineapuntoventaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				lineapuntoventaAux=new  LineaPuntoVenta();
				
				lineapuntoventaAux.setIsNew(false);
				lineapuntoventaAux.setIsChanged(false);
				
				lineapuntoventaAux.setIsDeleted(true);
				
				lineapuntoventaAux.setId(this.lineapuntoventa.getId());	
				lineapuntoventaAux.setVersionRow(this.lineapuntoventa.getVersionRow());	
				lineapuntoventaAux.setid_empresa(this.lineapuntoventa.getid_empresa());	
				lineapuntoventaAux.setid_sucursal(this.lineapuntoventa.getid_sucursal());	
				lineapuntoventaAux.setid_linea(this.lineapuntoventa.getid_linea());	
				
				if(this.lineapuntoventa.getid_linea_grupo()!=null && this.lineapuntoventa.getid_linea_grupo()>0L) {
					lineapuntoventaAux.setid_linea_grupo(this.lineapuntoventa.getid_linea_grupo());
				} else {
					lineapuntoventaAux.setid_linea_grupo(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_categoria()!=null && this.lineapuntoventa.getid_linea_categoria()>0L) {
					lineapuntoventaAux.setid_linea_categoria(this.lineapuntoventa.getid_linea_categoria());
				} else {
					lineapuntoventaAux.setid_linea_categoria(null);
				}	
				
				if(this.lineapuntoventa.getid_linea_marca()!=null && this.lineapuntoventa.getid_linea_marca()>0L) {
					lineapuntoventaAux.setid_linea_marca(this.lineapuntoventa.getid_linea_marca());
				} else {
					lineapuntoventaAux.setid_linea_marca(null);
				}	
				lineapuntoventaAux.setesta_activo(this.lineapuntoventa.getesta_activo());	
				
				if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.lineapuntoventaAux.getId()>=0) {	
						this.lineapuntoventasEliminados.add(lineapuntoventaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineapuntoventaAux,lineapuntoventas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.saveLineaPuntoVentas();//WithConnection
						//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineapuntoventaLogic.saveLineaPuntoVentaRelaciones(lineapuntoventaAux);//WithConnection
								//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
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
							if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(lineapuntoventaAux,lineapuntoventaLogic.getLineaPuntoVentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(lineapuntoventaAux,lineapuntoventas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getLineaPuntoVentas().addAll(this.lineapuntoventasEliminados);
					
					lineapuntoventaLogic.saveLineaPuntoVentas();//WithConnection
					//lineapuntoventaLogic.getSetVersionRowLineaPuntoVentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLineaPuntoVenta();
				
				this.lineapuntoventasEliminados= new ArrayList<LineaPuntoVenta>();		
			}
			
			if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Linea Punto Venta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.lineapuntoventa=lineapuntoventaAux;
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
      		//this.finishProcessLineaPuntoVenta();
      	}
		
	}	
	
	public void actualizarRelaciones(LineaPuntoVenta lineapuntoventaLocal) throws Exception {
		
		if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LineaPuntoVenta lineapuntoventaLocal) throws Exception {	
		if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				lineapuntoventaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				lineapuntoventaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				lineapuntoventaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				lineapuntoventaLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				lineapuntoventaLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				lineapuntoventaLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLineaPuntoVentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = lineapuntoventaValidator.getInvalidValues(this.lineapuntoventa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LineaPuntoVenta lineapuntoventa,List<LineaPuntoVenta> lineapuntoventas) throws Exception {
		try	{		
			LineaPuntoVentaConstantesFunciones.actualizarLista(lineapuntoventa,lineapuntoventas,this.lineapuntoventaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LineaPuntoVenta lineapuntoventa,List<LineaPuntoVenta> lineapuntoventas) throws Exception {
		try	{			
			LineaPuntoVentaConstantesFunciones.actualizarSelectedLista(lineapuntoventa,lineapuntoventas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LineaPuntoVenta> lineapuntoventasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				lineapuntoventasLocal=this.lineapuntoventaLogic.getLineaPuntoVentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				lineapuntoventasLocal=this.lineapuntoventas;
			}
			//ARCHITECTURE
		
			for(LineaPuntoVenta lineapuntoventaLocal:lineapuntoventasLocal) {
				if(this.permiteMantenimiento(lineapuntoventaLocal) && lineapuntoventaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LineaPuntoVentaConstantesFunciones.getLineaPuntoVentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_empresaLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_sucursalLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_lineaLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_grupoLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_categoriaLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_marcaLineaPuntoVenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaPuntoVentaConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelesta_activoLineaPuntoVenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_empresaLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_sucursalLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_lineaLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_grupoLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_categoriaLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelid_linea_marcaLineaPuntoVenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelesta_activoLineaPuntoVenta,"");
		
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
		this.iIdNuevoLineaPuntoVenta--;	
		
		
		this.lineapuntoventaAux=new LineaPuntoVenta();
		
		this.lineapuntoventaAux.setId(this.iIdNuevoLineaPuntoVenta);
		this.lineapuntoventaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineapuntoventaLogic.getLineaPuntoVentas().add(this.lineapuntoventaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.lineapuntoventas.add(this.lineapuntoventaAux);
		}
		//ARCHITECTURE
		
		this.lineapuntoventa=this.lineapuntoventaAux;
		
		if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventa);
			this.setVariablesObjetoActualToFormularioForeignKeyLineaPuntoVenta(this.lineapuntoventa);
		}
				
		//this.setDefaultControlesLineaPuntoVenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLineaPuntoVenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLineaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaPuntoVenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaPuntoVenta(this.lineapuntoventaBean,this.lineapuntoventa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
			classes=LineaPuntoVentaConstantesFunciones.getClassesRelationshipsOfLineaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.lineapuntoventaReturnGeneral=lineapuntoventaLogic.procesarEventosLineaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineapuntoventaLogic.getLineaPuntoVentas(),this.lineapuntoventa,this.lineapuntoventaParameterGeneral,this.isEsNuevoLineaPuntoVenta,classes);//this.lineapuntoventaLogic.getLineaPuntoVenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLineaPuntoVenta(this.lineapuntoventaReturnGeneral,this.lineapuntoventaBean,false);
		
		if(this.lineapuntoventaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta());
		}
		
		if(this.lineapuntoventaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta(),classes);//this.lineapuntoventaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLineaPuntoVenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLineaPuntoVenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.RecargarFormLineaPuntoVenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLineaPuntoVenta(false);
						
			if(lineapuntoventaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaPuntoVenta();
			}
			
			this.actualizarVisualTableDatosLineaPuntoVenta();
			
			this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoLineaPuntoVenta(), this.getIndiceNuevoLineaPuntoVenta());
			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
						
			this.actualizarEstadoCeldasBotonesLineaPuntoVenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLineaPuntoVenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activaresta_activoLineaPuntoVenta);	
		//
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_empresaLineaPuntoVenta);//
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_sucursalLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_lineaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_linea_grupoLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_linea_categoriaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setEnabled(isHabilitar && this.lineapuntoventaConstantesFunciones.activarid_linea_marcaLineaPuntoVenta);
	};
	
	public void setDefaultControlesLineaPuntoVenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLineaPuntoVenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.lineapuntoventaSessionBean.setConGuardarRelaciones(true);			
			this.lineapuntoventaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.setVisible(true);
			
					
		} else {
			//this.lineapuntoventaSessionBean.setConGuardarRelaciones(false);			
			this.lineapuntoventaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoLineaPuntoVenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
				if(lineapuntoventaAux.getId().equals(this.iIdNuevoLineaPuntoVenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventas) {
				if(lineapuntoventaAux.getId().equals(this.iIdNuevoLineaPuntoVenta)) {
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
	
	public int getIndiceActualLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
				if(lineapuntoventaAux.getId().equals(lineapuntoventa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventas) {
				if(lineapuntoventaAux.getId().equals(lineapuntoventa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLineaPuntoVenta(LineaPuntoVenta lineapuntoventaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
				if(lineapuntoventaAux.getLineaPuntoVentaOriginal().getId().equals(lineapuntoventaOriginal.getId())) {
					existe=true;
					lineapuntoventaOriginal.setId(lineapuntoventaAux.getId());
					lineapuntoventaOriginal.setVersionRow(lineapuntoventaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventas) {
				if(lineapuntoventaAux.getLineaPuntoVentaOriginal().getId().equals(lineapuntoventaOriginal.getId())) {
					existe=true;
					lineapuntoventaOriginal.setId(lineapuntoventaAux.getId());
					lineapuntoventaOriginal.setVersionRow(lineapuntoventaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLineaPuntoVenta(Boolean esParaCancelar) throws Exception {
		lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
		lineapuntoventaAux=new LineaPuntoVenta();
		
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
					if(lineapuntoventaAux.getId()<0) {
						lineapuntoventasAux.add(lineapuntoventaAux);
					}		
				}
				this.iIdNuevoLineaPuntoVenta=0L;
				this.lineapuntoventaLogic.getLineaPuntoVentas().removeAll(lineapuntoventasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventas) {
					if(lineapuntoventaAux.getId()<0) {
						lineapuntoventasAux.add(lineapuntoventaAux);
					}		
				}
				this.iIdNuevoLineaPuntoVenta=0L;
				this.lineapuntoventas.removeAll(lineapuntoventasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLineaPuntoVenta 
					&& this.lineapuntoventaLogic.getLineaPuntoVentas().size()>0
					) {
					lineapuntoventaAux=this.lineapuntoventaLogic.getLineaPuntoVentas().get(this.lineapuntoventaLogic.getLineaPuntoVentas().size() - 1);
				
					if(lineapuntoventaAux.getId()<0) {
						this.lineapuntoventaLogic.getLineaPuntoVentas().remove(lineapuntoventaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLineaPuntoVenta && this.lineapuntoventas.size()>0) {
					lineapuntoventaAux=this.lineapuntoventas.get(this.lineapuntoventas.size() - 1);
				
					if(lineapuntoventaAux.getId()<0) {
						this.lineapuntoventas.remove(lineapuntoventaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLineaPuntoVenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(lineapuntoventa.getId()<0) {
				this.lineapuntoventaLogic.getLineaPuntoVentas().remove(this.lineapuntoventa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(lineapuntoventa.getId()<0) {
				this.lineapuntoventas.remove(this.lineapuntoventa);
			}
		}			
	}
	
	public void setEstadosInicialesLineaPuntoVenta(List<LineaPuntoVenta> lineapuntoventasAux) throws Exception {
		LineaPuntoVentaConstantesFunciones.setEstadosInicialesLineaPuntoVenta(lineapuntoventasAux);
	}
	
	public void setEstadosInicialesLineaPuntoVenta(LineaPuntoVenta lineapuntoventaAux) throws Exception {
		LineaPuntoVentaConstantesFunciones.setEstadosInicialesLineaPuntoVenta(lineapuntoventaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLineaPuntoVentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLineaPuntoVentaActual()) {
				if(!this.isEsNuevoLineaPuntoVenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLineaPuntoVenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLineaPuntoVentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Linea Punto Venta ?", "MANTENIMIENTO DE Linea Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LineaPuntoVenta lineapuntoventa) throws Exception {
		LineaPuntoVentaConstantesFunciones.seleccionarAsignar(this.lineapuntoventa,lineapuntoventa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLineaPuntoVenta=this.isPermisoActualizarOriginalLineaPuntoVenta;
			
			
			this.seleccionarAsignar(lineapuntoventa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaPuntoVentaConstantesFunciones.quitarEspaciosLineaPuntoVenta(this.lineapuntoventa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLineaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.lineapuntoventaSessionBean.setsFuncionBusquedaRapida(this.lineapuntoventaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLineaPuntoVenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLineaPuntoVenta(esParaCancelar);				
				this.cancelarNuevoLineaPuntoVenta(esParaCancelar);								
			}
			
			this.lineapuntoventa=new LineaPuntoVenta();
			
			this.inicializarLineaPuntoVenta();
			
			this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLineaPuntoVenta() throws Exception {
		try {
			LineaPuntoVentaConstantesFunciones.inicializarLineaPuntoVenta(this.lineapuntoventa);
			
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
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.lineapuntoventaLogic.getLineaPuntoVentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLineaPuntoVentas(String sAccionBusqueda,List<LineaPuntoVenta> lineapuntoventasParaReportes) throws Exception {
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
					sPathReporteFinal="LineaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LineaPuntoVentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LineaPuntoVentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LineaPuntoVenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Linea Punto Ventas");		
		parameters.put("busquedapor", LineaPuntoVentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLineaPuntoVenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LineaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LineaPuntoVentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLineaPuntoVenta=new JRBeanArrayDataSource(LineaPuntoVentaJInternalFrame.TraerLineaPuntoVentaBeans(lineapuntoventasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLineaPuntoVenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LineaPuntoVentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LineaPuntoVentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LineaPuntoVentaBean.TraerLineaPuntoVentaBeans(lineapuntoventasParaReportes).toArray()));
							
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
				this.generarExcelReporteLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLineaPuntoVentaActionPerformed(null);
					//this.generarExcelReporteLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLineaPuntoVentas(sAccionBusqueda,sTipoArchivoReporte,lineapuntoventasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLineaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaPuntoVenta> lineapuntoventasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaPuntoVentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaPuntoVenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LineaPuntoVenta lineapuntoventa : lineapuntoventasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LineaPuntoVentaConstantesFunciones.generarExcelReporteDataLineaPuntoVenta("NORMAL",row,workbook,lineapuntoventa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLineaPuntoVenta(String sTipo,Row row,Workbook workbook) {
		
		LineaPuntoVentaConstantesFunciones.generarExcelReporteHeaderLineaPuntoVenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLineaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaPuntoVenta> lineapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LineaPuntoVenta lineapuntoventa : lineapuntoventasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LineaPuntoVentaConstantesFunciones.getLineaPuntoVentaDescripcion(lineapuntoventa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineapuntoventa.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(lineapuntoventa.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLineaPuntoVentas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaPuntoVenta> lineapuntoventasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LineaPuntoVenta> lineapuntoventasRespaldo=null;
		
		classes=LineaPuntoVentaConstantesFunciones.getClassesRelationshipsOfLineaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.lineapuntoventaLogic.setDatosCliente(this.datosCliente);
		this.lineapuntoventaLogic.setDatosDeep(this.datosDeep);
		this.lineapuntoventaLogic.setIsConDeep(true);
		
		lineapuntoventasRespaldo=this.lineapuntoventaLogic.getLineaPuntoVentas();
		
		this.lineapuntoventaLogic.setLineaPuntoVentas(lineapuntoventasParaReportes);	
		this.lineapuntoventaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		lineapuntoventasParaReportes=this.lineapuntoventaLogic.getLineaPuntoVentas();
		this.lineapuntoventaLogic.setLineaPuntoVentas(lineapuntoventasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaPuntoVentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaPuntoVenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LineaPuntoVenta lineapuntoventa : lineapuntoventasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLineaPuntoVenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LineaPuntoVentaConstantesFunciones.generarExcelReporteDataLineaPuntoVenta("NORMAL",row,workbook,lineapuntoventa,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LineaPuntoVentaConstantesFunciones.getLineaPuntoVentaDescripcion(lineapuntoventa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLineaPuntoVenta() throws Exception {		
		this.startProcessLineaPuntoVenta(true);
	}
	
	public void startProcessLineaPuntoVenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLineaPuntoVenta ,this.jPanelParametrosReportesLineaPuntoVenta, this.jScrollPanelDatosLineaPuntoVenta,this.jPanelPaginacionLineaPuntoVenta, this.jScrollPanelDatosEdicionLineaPuntoVenta, this.jPanelAccionesLineaPuntoVenta,this.jPanelAccionesFormularioLineaPuntoVenta,this.jmenuBarLineaPuntoVenta,this.jmenuBarDetalleLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaPuntoVenta=this.jTabbedPaneBusquedasLineaPuntoVenta; 
		
		final JPanel jPanelParametrosReportesLineaPuntoVenta=this.jPanelParametrosReportesLineaPuntoVenta;
		//final JScrollPane jScrollPanelDatosLineaPuntoVenta=this.jScrollPanelDatosLineaPuntoVenta;
		final JTable jTableDatosLineaPuntoVenta=this.jTableDatosLineaPuntoVenta;		
		final JPanel jPanelPaginacionLineaPuntoVenta=this.jPanelPaginacionLineaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionLineaPuntoVenta=this.jScrollPanelDatosEdicionLineaPuntoVenta;
		final JPanel jPanelAccionesLineaPuntoVenta=this.jPanelAccionesLineaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarLineaPuntoVenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLineaPuntoVenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			jPanelCamposAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelCamposLineaPuntoVenta;
			jPanelAccionesFormularioAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelAccionesFormularioLineaPuntoVenta;
		}
		
		final JPanel jPanelCamposLineaPuntoVenta=jPanelCamposAuxiliarLineaPuntoVenta;
		final JPanel jPanelAccionesFormularioLineaPuntoVenta=jPanelAccionesFormularioAuxiliarLineaPuntoVenta;
		
		
		final JMenuBar jmenuBarLineaPuntoVenta=this.jmenuBarLineaPuntoVenta;
		final JToolBar jTtoolBarLineaPuntoVenta=this.jTtoolBarLineaPuntoVenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLineaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaPuntoVenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jmenuBarDetalleLineaPuntoVenta;
			jTtoolBarDetalleAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jTtoolBarDetalleLineaPuntoVenta;
		}
		
		final JMenuBar jmenuBarDetalleLineaPuntoVenta=jmenuBarDetalleAuxiliarLineaPuntoVenta;
		final JToolBar jTtoolBarDetalleLineaPuntoVenta=jTtoolBarDetalleAuxiliarLineaPuntoVenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosLineaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposLineaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesLineaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarLineaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarLineaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaPuntoVenta ,jPanelParametrosReportesLineaPuntoVenta,jTableDatosLineaPuntoVenta, /*jScrollPanelDatosLineaPuntoVenta,*/jPanelCamposLineaPuntoVenta,jPanelPaginacionLineaPuntoVenta, /*jScrollPanelDatosEdicionLineaPuntoVenta,*/ jPanelAccionesLineaPuntoVenta,jPanelAccionesFormularioLineaPuntoVenta,jmenuBarLineaPuntoVenta,jmenuBarDetalleLineaPuntoVenta,jTtoolBarLineaPuntoVenta,jTtoolBarDetalleLineaPuntoVenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaPuntoVenta ,jPanelParametrosReportesLineaPuntoVenta, jScrollPanelDatosLineaPuntoVenta,jPanelPaginacionLineaPuntoVenta, jScrollPanelDatosEdicionLineaPuntoVenta, jPanelAccionesLineaPuntoVenta,jPanelAccionesFormularioLineaPuntoVenta,jmenuBarLineaPuntoVenta,jmenuBarDetalleLineaPuntoVenta,jTtoolBarLineaPuntoVenta,jTtoolBarDetalleLineaPuntoVenta);
						
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
	
	public void finishProcessLineaPuntoVenta() {// throws Exception 
		this.finishProcessLineaPuntoVenta(true);
	}
	
	public void finishProcessLineaPuntoVenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLineaPuntoVenta ,this.jPanelParametrosReportesLineaPuntoVenta, this.jScrollPanelDatosLineaPuntoVenta,this.jPanelPaginacionLineaPuntoVenta, this.jScrollPanelDatosEdicionLineaPuntoVenta, this.jPanelAccionesLineaPuntoVenta,this.jPanelAccionesFormularioLineaPuntoVenta,this.jmenuBarLineaPuntoVenta,this.jmenuBarDetalleLineaPuntoVenta,this.jTtoolBarLineaPuntoVenta,this.jTtoolBarDetalleLineaPuntoVenta);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaPuntoVenta=this.jTabbedPaneBusquedasLineaPuntoVenta; 
		
		final JPanel jPanelParametrosReportesLineaPuntoVenta=this.jPanelParametrosReportesLineaPuntoVenta;
		//final JScrollPane jScrollPanelDatosLineaPuntoVenta=this.jScrollPanelDatosLineaPuntoVenta;
		final JTable jTableDatosLineaPuntoVenta=this.jTableDatosLineaPuntoVenta;		
		final JPanel jPanelPaginacionLineaPuntoVenta=this.jPanelPaginacionLineaPuntoVenta;
		//final JScrollPane jScrollPanelDatosEdicionLineaPuntoVenta=this.jScrollPanelDatosEdicionLineaPuntoVenta;
		final JPanel jPanelAccionesLineaPuntoVenta=this.jPanelAccionesLineaPuntoVenta;
		
		JPanel jPanelCamposAuxiliarLineaPuntoVenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLineaPuntoVenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			jPanelCamposAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelCamposLineaPuntoVenta;
			jPanelAccionesFormularioAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelAccionesFormularioLineaPuntoVenta;
		}
		
		final JPanel jPanelCamposLineaPuntoVenta=jPanelCamposAuxiliarLineaPuntoVenta;
		final JPanel jPanelAccionesFormularioLineaPuntoVenta=jPanelAccionesFormularioAuxiliarLineaPuntoVenta;
		
		
		final JMenuBar jmenuBarLineaPuntoVenta=this.jmenuBarLineaPuntoVenta;		
		final JToolBar jTtoolBarLineaPuntoVenta=this.jTtoolBarLineaPuntoVenta;
				
		JMenuBar jmenuBarDetalleAuxiliarLineaPuntoVenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaPuntoVenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			jmenuBarDetalleAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jmenuBarDetalleLineaPuntoVenta;
			jTtoolBarDetalleAuxiliarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jTtoolBarDetalleLineaPuntoVenta;		
		}
		
		final JMenuBar jmenuBarDetalleLineaPuntoVenta=jmenuBarDetalleAuxiliarLineaPuntoVenta;
		final JToolBar jTtoolBarDetalleLineaPuntoVenta=jTtoolBarDetalleAuxiliarLineaPuntoVenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaPuntoVenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaPuntoVenta;
			processRunnable.jTableDatos=jTableDatosLineaPuntoVenta;
			processRunnable.jPanelCampos=jPanelCamposLineaPuntoVenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaPuntoVenta;
			processRunnable.jPanelAcciones=jPanelAccionesLineaPuntoVenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaPuntoVenta;
			
			
			processRunnable.jmenuBar=jmenuBarLineaPuntoVenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaPuntoVenta;
			processRunnable.jTtoolBar=jTtoolBarLineaPuntoVenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaPuntoVenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLineaPuntoVenta ,jPanelParametrosReportesLineaPuntoVenta, jTableDatosLineaPuntoVenta,/*jScrollPanelDatosLineaPuntoVenta,*/jPanelCamposLineaPuntoVenta,jPanelPaginacionLineaPuntoVenta, /*jScrollPanelDatosEdicionLineaPuntoVenta,*/ jPanelAccionesLineaPuntoVenta,jPanelAccionesFormularioLineaPuntoVenta,jmenuBarLineaPuntoVenta,jmenuBarDetalleLineaPuntoVenta,jTtoolBarLineaPuntoVenta,jTtoolBarDetalleLineaPuntoVenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLineaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLineaPuntoVenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLineaPuntoVenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLineaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLineaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLineaPuntoVenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLineaPuntoVenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLineaPuntoVenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLineaPuntoVenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.lineapuntoventaConstantesFunciones.getsFinalQueryLineaPuntoVenta();
		String  finalQueryPaginacionTodos=this.lineapuntoventaConstantesFunciones.getsFinalQueryLineaPuntoVenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LineaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesNoLineaPuntoVenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LineaPuntoVentaConstantesFunciones.getArrayColumnasGlobalesLineaPuntoVenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LineaPuntoVentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.lineapuntoventasEliminados= new ArrayList<LineaPuntoVenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLineaPuntoVenta();
		
				///*LineaPuntoVentaSessionBean*/this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			
			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
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
					this.iNumeroPaginacion=LineaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LineaPuntoVentaConstantesFunciones.getClassesForeignKeysOfLineaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/lineapuntoventa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			lineapuntoventasAux= new ArrayList<LineaPuntoVenta>();
			
				
			lineapuntoventaLogic.setDatosCliente(this.datosCliente);
			lineapuntoventaLogic.setDatosDeep(this.datosDeep);
			lineapuntoventaLogic.setIsConDeep(true);
			
			
			lineapuntoventaLogic.getLineaPuntoVentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					lineapuntoventaLogic.getTodosLineaPuntoVentas(finalQueryGlobal,pagination);
					
					//lineapuntoventaLogic.getTodosLineaPuntoVentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(lineapuntoventaLogic.getLineaPuntoVentas()==null|| lineapuntoventaLogic.getLineaPuntoVentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineapuntoventasAux= new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux= new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineapuntoventaLogic.getTodosLineaPuntoVentas(finalQueryGlobal+"",this.pagination);												
							
							//lineapuntoventaLogic.getTodosLineaPuntoVentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLineaPuntoVentas("Todos",lineapuntoventaLogic.getLineaPuntoVentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());					
							lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLineaPuntoVenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLineaPuntoVenta=this.idActual;
				
				} else if(this.idLineaPuntoVentaActual!=null && this.idLineaPuntoVentaActual!=0L) {
					idLineaPuntoVenta=idLineaPuntoVentaActual;
				}
				
					
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndicePorId(idLineaPuntoVenta);
				
				this.lineapuntoventas=new ArrayList<LineaPuntoVenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					lineapuntoventaLogic.getEntity(idLineaPuntoVenta);
					
					//lineapuntoventaLogic.getEntityWithConnection(idLineaPuntoVenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
					lineapuntoventaLogic.getLineaPuntoVentas().add(lineapuntoventaLogic.getLineaPuntoVenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventas=new ArrayList<LineaPuntoVenta>();
					this.lineapuntoventas.add(lineapuntoventa);
				}
				
				if(lineapuntoventaLogic.getLineaPuntoVenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdEmpresa",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdEmpresa",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLinea")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdLinea(finalQueryGlobal,pagination,id_lineaFK_IdLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLinea(id_lineaFK_IdLinea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdLinea",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdLinea",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaCategoria")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaCategoria(finalQueryGlobal,pagination,id_linea_categoriaFK_IdLineaCategoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaCategoria(finalQueryGlobal,pagination,id_linea_categoriaFK_IdLineaCategoria);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaCategoria(id_linea_categoriaFK_IdLineaCategoria);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdLineaCategoria",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdLineaCategoria",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaGrupo")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaGrupo(finalQueryGlobal,pagination,id_linea_grupoFK_IdLineaGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaGrupo(finalQueryGlobal,pagination,id_linea_grupoFK_IdLineaGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaGrupo(id_linea_grupoFK_IdLineaGrupo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdLineaGrupo",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdLineaGrupo",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdLineaMarca")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaMarca(finalQueryGlobal,pagination,id_linea_marcaFK_IdLineaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaMarca(finalQueryGlobal,pagination,id_linea_marcaFK_IdLineaMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdLineaMarca(id_linea_marcaFK_IdLineaMarca);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdLineaMarca",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdLineaMarca",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineapuntoventaLogic.getLineaPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas()==null||lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineapuntoventas==null|| lineapuntoventas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
						lineapuntoventasAux.addAll(lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventasAux=new ArrayList<LineaPuntoVenta>();
							lineapuntoventasAux.addAll(lineapuntoventas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineapuntoventaLogic.getLineaPuntoVentasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaPuntoVentaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaPuntoVentas("FK_IdSucursal",lineapuntoventaLogic.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaPuntoVentas("FK_IdSucursal",lineapuntoventas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaLogic.setLineaPuntoVentas(new ArrayList<LineaPuntoVenta>());
						lineapuntoventaLogic.getLineaPuntoVentas().addAll(lineapuntoventasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventas=new ArrayList<LineaPuntoVenta>();
							lineapuntoventas.addAll(lineapuntoventasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLineaPuntoVenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLineaPuntoVenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineapuntoventaLogic.getLineaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineapuntoventas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineapuntoventaLogic.getLineaPuntoVentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineapuntoventas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LineaPuntoVenta lineapuntoventa) {
		Boolean permite=true;
		
		if(this.lineapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LineaPuntoVentaConstantesFunciones.getOrderByListaLineaPuntoVenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LineaPuntoVentaConstantesFunciones.getOrderByListaLineaPuntoVenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaPuntoVenta lineapuntoventa:lineapuntoventaLogic.getLineaPuntoVentas()) {
				if(lineapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					lineapuntoventaTotales=lineapuntoventa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaPuntoVenta lineapuntoventa:this.lineapuntoventas) {
				if(lineapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					lineapuntoventaTotales=lineapuntoventa;
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
			this.lineapuntoventaAux=new LineaPuntoVenta();
			this.lineapuntoventaAux.setsType(Constantes2.S_TOTALES);
			this.lineapuntoventaAux.setIsNew(false);
			this.lineapuntoventaAux.setIsChanged(false);
			this.lineapuntoventaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LineaPuntoVentaConstantesFunciones.TotalizarValoresFilaLineaPuntoVenta(this.lineapuntoventaLogic.getLineaPuntoVentas(),this.lineapuntoventaAux);
				
				this.lineapuntoventaLogic.getLineaPuntoVentas().add(this.lineapuntoventaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LineaPuntoVentaConstantesFunciones.TotalizarValoresFilaLineaPuntoVenta(this.lineapuntoventas,this.lineapuntoventaAux);
				
				this.lineapuntoventas.add(this.lineapuntoventaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		lineapuntoventaTotales=new LineaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineapuntoventaLogic.getLineaPuntoVentas().remove(lineapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineapuntoventas.remove(lineapuntoventaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		lineapuntoventaTotales=new LineaPuntoVenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaPuntoVenta lineapuntoventa:lineapuntoventaLogic.getLineaPuntoVentas()) {
				if(lineapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					lineapuntoventaTotales=lineapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaPuntoVentaConstantesFunciones.TotalizarValoresFilaLineaPuntoVenta(this.lineapuntoventaLogic.getLineaPuntoVentas(),lineapuntoventaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaPuntoVenta lineapuntoventa:this.lineapuntoventas) {
				if(lineapuntoventa.getsType().equals(Constantes2.S_TOTALES)) {
					lineapuntoventaTotales=lineapuntoventa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaPuntoVentaConstantesFunciones.TotalizarValoresFilaLineaPuntoVenta(this.lineapuntoventas,lineapuntoventaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLineaPuntoVentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaPuntoVentasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaPuntoVentasFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaPuntoVentasFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaPuntoVentasFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaPuntoVentasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getLineaPuntoVentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaPuntoVentasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaPuntoVentasFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaPuntoVentasFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaPuntoVentasFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaPuntoVentasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLogic.getLineaPuntoVentasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosLineaPuntoVenta() {
		this.isPermisoTodoLineaPuntoVenta=false;
		this.isPermisoNuevoLineaPuntoVenta=false;
		this.isPermisoActualizarLineaPuntoVenta=false;
		this.isPermisoActualizarOriginalLineaPuntoVenta=false;
		this.isPermisoEliminarLineaPuntoVenta=false;
		this.isPermisoGuardarCambiosLineaPuntoVenta=false;
		this.isPermisoConsultaLineaPuntoVenta=false;
		this.isPermisoBusquedaLineaPuntoVenta=false;
		this.isPermisoReporteLineaPuntoVenta=false;		
		this.isPermisoOrdenLineaPuntoVenta=false;		
		this.isPermisoPaginacionMedioLineaPuntoVenta=false;		
		this.isPermisoPaginacionAltoLineaPuntoVenta=false;
		this.isPermisoPaginacionTodoLineaPuntoVenta=false;
		this.isPermisoCopiarLineaPuntoVenta=false;		
		this.isPermisoVerFormLineaPuntoVenta=false;		
		this.isPermisoDuplicarLineaPuntoVenta=false;		
		this.isPermisoOrdenLineaPuntoVenta=false;		
	}
	
	public void setPermisosUsuarioLineaPuntoVenta(Boolean isPermiso) {
		this.isPermisoTodoLineaPuntoVenta=isPermiso;
		this.isPermisoNuevoLineaPuntoVenta=isPermiso;
		this.isPermisoActualizarLineaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalLineaPuntoVenta=isPermiso;
		this.isPermisoEliminarLineaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosLineaPuntoVenta=isPermiso;
		this.isPermisoConsultaLineaPuntoVenta=isPermiso;
		this.isPermisoBusquedaLineaPuntoVenta=isPermiso;
		this.isPermisoReporteLineaPuntoVenta=isPermiso;
		this.isPermisoOrdenLineaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionMedioLineaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionAltoLineaPuntoVenta=isPermiso;		
		this.isPermisoPaginacionTodoLineaPuntoVenta=isPermiso;		
		this.isPermisoCopiarLineaPuntoVenta=isPermiso;		
		this.isPermisoVerFormLineaPuntoVenta=isPermiso;		
		this.isPermisoDuplicarLineaPuntoVenta=isPermiso;
		this.isPermisoOrdenLineaPuntoVenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLineaPuntoVenta(Boolean isPermiso) {
		//this.isPermisoTodoLineaPuntoVenta=isPermiso;
		this.isPermisoNuevoLineaPuntoVenta=isPermiso;
		this.isPermisoActualizarLineaPuntoVenta=isPermiso;
		this.isPermisoActualizarOriginalLineaPuntoVenta=isPermiso;
		this.isPermisoEliminarLineaPuntoVenta=isPermiso;
		this.isPermisoGuardarCambiosLineaPuntoVenta=isPermiso;
		//this.isPermisoConsultaLineaPuntoVenta=isPermiso;
		//this.isPermisoBusquedaLineaPuntoVenta=isPermiso;
		//this.isPermisoReporteLineaPuntoVenta=isPermiso;
		//this.isPermisoOrdenLineaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionMedioLineaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionAltoLineaPuntoVenta=isPermiso;		
		//this.isPermisoPaginacionTodoLineaPuntoVenta=isPermiso;		
		//this.isPermisoCopiarLineaPuntoVenta=isPermiso;		
		//this.isPermisoDuplicarLineaPuntoVenta=isPermiso;
		//this.isPermisoOrdenLineaPuntoVenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLineaPuntoVentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(LineaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLineaPuntoVentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioLineaPuntoVentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLineaPuntoVentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLineaPuntoVentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioLineaPuntoVenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LineaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LineaPuntoVentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLineaPuntoVenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLineaPuntoVenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLineaPuntoVenta=this.isPermisoActualizarLineaPuntoVenta;
			this.isPermisoEliminarLineaPuntoVenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLineaPuntoVenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLineaPuntoVenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLineaPuntoVenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLineaPuntoVenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLineaPuntoVenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLineaPuntoVenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLineaPuntoVenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLineaPuntoVenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLineaPuntoVenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLineaPuntoVenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLineaPuntoVenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaPuntoVenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLineaPuntoVenta.setToolTipText(this.jTableDatosLineaPuntoVenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLineaPuntoVenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLineaPuntoVenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LineaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LineaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLineaPuntoVenta() throws Exception {
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
	public void inicializarCombosForeignKeyLineaPuntoVentaListas()throws Exception {
		try	{						
			
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
	
	public void cargarCombosTodosForeignKeyLineaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LineaPuntoVentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLineaPuntoVentaListas(false);
			} else {
			
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
	
	public void cargarCombosLoteForeignKeyLineaPuntoVentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LineaPuntoVentaParameterReturnGeneral lineapuntoventaReturnGeneral=new LineaPuntoVentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_empresaLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_empresaLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_sucursalLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_sucursalLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_lineaLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_lineaLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_linea_grupoLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_linea_grupoLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalLineaCategoria="";

				if(((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_linea_categoriaLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_linea_categoriaLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaCategoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaCategoria=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaCategoria, "");
						finalQueryGlobalLineaCategoria+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaCategoria=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidLineaCategoriaActual();
					}
				} else {
					finalQueryGlobalLineaCategoria="NONE";
				}


				String finalQueryGlobalLineaMarca="";

				if(((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0) && this.lineapuntoventaConstantesFunciones.cargarid_linea_marcaLineaPuntoVenta)
					 || (this.esRecargarFks && this.lineapuntoventaConstantesFunciones.cargarid_linea_marcaLineaPuntoVenta)) {

					if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaMarca=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaMarca=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaMarca, "");
						finalQueryGlobalLineaMarca+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaMarca=" WHERE " + ConstantesSql.ID + "="+lineapuntoventaSessionBean.getlidLineaMarcaActual();
					}
				} else {
					finalQueryGlobalLineaMarca="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				lineapuntoventaReturnGeneral=lineapuntoventaLogic.cargarCombosLoteForeignKeyLineaPuntoVenta(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalLineaCategoria,finalQueryGlobalLineaMarca);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=lineapuntoventaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=lineapuntoventaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=lineapuntoventaReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=lineapuntoventaReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalLineaCategoria.equals("NONE")) {
				this.lineacategoriasForeignKey=lineapuntoventaReturnGeneral.getlineacategoriasForeignKey();
			}

			if(!finalQueryGlobalLineaMarca.equals("NONE")) {
				this.lineamarcasForeignKey=lineapuntoventaReturnGeneral.getlineamarcasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLineaPuntoVenta()throws Exception {
		try {
			
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
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.lineapuntoventaSessionBean==null) {
				this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
			}

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.lineapuntoventaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyLineaPuntoVenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLineaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLineaPuntoVenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaPuntoVenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLineaPuntoVenta(LineaPuntoVenta lineapuntoventa)throws Exception {	
		try {
			
			this.setActualLineaForeignKey(lineapuntoventa.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(lineapuntoventa.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(lineapuntoventa.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(lineapuntoventa.getid_linea_marca(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLineaPuntoVenta()throws Exception {	
		try {
			
			this.setActualLineaForeignKey(this.lineapuntoventaConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.lineapuntoventaConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.lineapuntoventaConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.lineapuntoventaConstantesFunciones.getid_linea_marca(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLineaPuntoVenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLineaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLineaPuntoVenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLineaPuntoVenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLineaPuntoVenta()throws Exception {
		try {
			

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
	
	public void cargarCombosFrameForeignKeyLineaPuntoVenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

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
	
	public void setItemDefectoCombosForeignKeyLineaPuntoVenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public LineaPuntoVentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LineaPuntoVentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LineaPuntoVentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean(); 
		this.lineapuntoventaConstantesFunciones=new LineaPuntoVentaConstantesFunciones(); 
		this.lineapuntoventaBean=new LineaPuntoVenta();//(this.lineapuntoventaConstantesFunciones); 		
		this.lineapuntoventaReturnGeneral=new LineaPuntoVentaParameterReturnGeneral(); 
		
		this.lineapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LineaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LineaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LineaPuntoVentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLineaPuntoVenta(true);
			
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
			
			this.lineapuntoventaConstantesFunciones=new LineaPuntoVentaConstantesFunciones(); 
			this.lineapuntoventaBean=new LineaPuntoVenta();//this.lineapuntoventaConstantesFunciones); 			
			this.lineapuntoventaReturnGeneral=new LineaPuntoVentaParameterReturnGeneral(); 
		
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Punto Venta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.lineapuntoventa=new LineaPuntoVenta();
			this.lineapuntoventas = new ArrayList<LineaPuntoVenta>();
			this.lineapuntoventasAux = new ArrayList<LineaPuntoVenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic=new LineaPuntoVentaLogic();
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.lineapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.lineapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLineaPuntoVenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaPuntoVenta);	
					}
					
					if(this.jInternalFrameImportacionLineaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaPuntoVenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLineaPuntoVenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLineaPuntoVenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaPuntoVenta);
				this.jInternalFrameDetalleFormLineaPuntoVenta.setVisible(false);
				this.jInternalFrameDetalleFormLineaPuntoVenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaPuntoVenta);
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.setVisible(false);
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLineaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLineaPuntoVenta);
					this.jInternalFrameImportacionLineaPuntoVenta.setVisible(false);
					this.jInternalFrameImportacionLineaPuntoVenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLineaPuntoVenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLineaPuntoVenta);
					this.jInternalFrameOrderByLineaPuntoVenta.setVisible(false);
					this.jInternalFrameOrderByLineaPuntoVenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLineaPuntoVentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LineaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.lineapuntoventaReturnGeneral=new LineaPuntoVentaParameterReturnGeneral();
			
			this.lineapuntoventaParameterGeneral=new LineaPuntoVentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.lineapuntoventaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LineaPuntoVentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineapuntoventaSessionBean.getEsGuardarRelacionado(),this.lineapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaPuntoVentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineapuntoventaSessionBean.getEsGuardarRelacionado(),this.lineapuntoventaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarLineaPuntoVenta=true;
			this.isVisibilidadCeldaCopiarLineaPuntoVenta=true;
			this.isVisibilidadCeldaVerFormLineaPuntoVenta=true;
			this.isVisibilidadCeldaOrdenLineaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLineaPuntoVenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLineaPuntoVenta(false);
			
			this.setPermisosUsuarioLineaPuntoVenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado() 
				|| (this.lineapuntoventaSessionBean.getEsGuardarRelacionado() && this.lineapuntoventaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLineaPuntoVentaClasesRelacionadas();
			}
			
			if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLineaPuntoVentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLineaPuntoVenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLineaPuntoVenta();
			}
			
			if(!this.isPermisoBusquedaLineaPuntoVenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLineaPuntoVenta,this.isPermisoPaginacionMedioLineaPuntoVenta,this.isPermisoPaginacionTodoLineaPuntoVenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LineaPuntoVentaConstantesFunciones.getTiposSeleccionarLineaPuntoVenta());
				
				this.tiposColumnasSelect=LineaPuntoVentaConstantesFunciones.getTiposSeleccionarLineaPuntoVenta(true);
				
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
			//if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLineaPuntoVenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLineaPuntoVenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLineaPuntoVenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaPuntoVenta() ;
			
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
				lineapuntoventaImplementable= (LineaPuntoVentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				lineapuntoventaImplementableHome= (LineaPuntoVentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaPuntoVentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.lineapuntoventas= new ArrayList<LineaPuntoVenta>();
			this.lineapuntoventasEliminados= new ArrayList<LineaPuntoVenta>();
						
			this.isEsNuevoLineaPuntoVenta=false;
			this.esParaAccionDesdeFormularioLineaPuntoVenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLineaPuntoVenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLineaPuntoVenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LineaPuntoVentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLineaPuntoVenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLineaPuntoVenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLineaPuntoVenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLineaPuntoVenta();
			}
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLineaPuntoVenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLineaPuntoVenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LineaPuntoVenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLineaPuntoVenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLineaPuntoVenta")) {
				iIndex=this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLineaPuntoVenta();	
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
	
	public void cargarCombosForeignKeyLineaPuntoVenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLineaPuntoVenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLineaPuntoVenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLineaPuntoVentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLineaPuntoVenta();
		
		this.cargarCombosFrameForeignKeyLineaPuntoVenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLineaPuntoVenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLineaPuntoVenta();
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
	
	public void jButtonNuevoLineaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			
			if(jTableDatosLineaPuntoVenta.getRowCount()>=1) {
				jTableDatosLineaPuntoVenta.removeRowSelectionInterval(0, jTableDatosLineaPuntoVenta.getRowCount()-1);						
			}
			
			this.isEsNuevoLineaPuntoVenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLineaPuntoVenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLineaPuntoVenta(true);			
			//this.lineapuntoventa=new LineaPuntoVenta();
			//this.lineapuntoventa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaPuntoVenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta() ;
			
			if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaPuntoVenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.lineapuntoventa);	
			this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);				
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LineaPuntoVenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLineaPuntoVentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLineaPuntoVenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLineaPuntoVenta.getSelectedRows().length;			
			}
			
			lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLineaPuntoVenta--;			
				//LineaPuntoVenta lineapuntoventaAux= new LineaPuntoVenta();			
				//lineapuntoventaAux.setId(this.iIdNuevoLineaPuntoVenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LineaPuntoVenta lineapuntoventaOrigen=new LineaPuntoVenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LineaPuntoVenta lineapuntoventaOrigen : lineapuntoventasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							lineapuntoventaOrigen =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineapuntoventaOrigen =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLineaPuntoVenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.lineapuntoventa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLineaPuntoVenta(lineapuntoventaOrigen,this.lineapuntoventa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineapuntoventaLogic.getLineaPuntoVentas().add(this.lineapuntoventaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineapuntoventas.add(this.lineapuntoventaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
				
				this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoLineaPuntoVenta(), this.getIndiceNuevoLineaPuntoVenta());
				
				int iLastRow =  this.jTableDatosLineaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();									
		
			LineaPuntoVenta lineapuntoventaOrigen=new LineaPuntoVenta();
			LineaPuntoVenta lineapuntoventaDestino=new LineaPuntoVenta();
				
			lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLineaPuntoVenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || lineapuntoventasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLineaPuntoVenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaOrigen =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineapuntoventaOrigen =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineapuntoventaDestino =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineapuntoventaDestino =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				lineapuntoventaOrigen =lineapuntoventasSeleccionados.get(0);
				lineapuntoventaDestino =lineapuntoventasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLineaPuntoVenta(lineapuntoventaOrigen,lineapuntoventaDestino,true,false);
				
				lineapuntoventaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineapuntoventaDestino,lineapuntoventaLogic.getLineaPuntoVentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineapuntoventaDestino,lineapuntoventas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
				
				//this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoLineaPuntoVenta(), this.getIndiceNuevoLineaPuntoVenta());
				
				int iLastRow =  this.jTableDatosLineaPuntoVenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaPuntoVenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaPuntoVenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLineaPuntoVenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLineaPuntoVenta.setVisible(!isVisible);
			this.jPanelPaginacionLineaPuntoVenta.setVisible(!isVisible);
			this.jPanelAccionesLineaPuntoVenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLineaPuntoVenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLineaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLineaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLineaPuntoVenta();
			
			this.abrirFrameOrderByLineaPuntoVenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLineaPuntoVenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLineaPuntoVenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaPuntoVenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLineaPuntoVenta.isMaximum()) {
					this.jInternalFrameDetalleFormLineaPuntoVenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLineaPuntoVenta.setSize(this.jInternalFrameDetalleFormLineaPuntoVenta.iWidthFormulario,this.jInternalFrameDetalleFormLineaPuntoVenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLineaPuntoVenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLineaPuntoVenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLineaPuntoVenta.isMaximum()) {
						this.jInternalFrameDetalleFormLineaPuntoVenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLineaPuntoVenta.jContentPaneDetalleLineaPuntoVenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLineaPuntoVenta.jContentPaneDetalleLineaPuntoVenta.getWidth(),LineaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLineaPuntoVenta.jContentPaneDetalleLineaPuntoVenta.getWidth(),LineaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLineaPuntoVenta.jContentPaneDetalleLineaPuntoVenta.getWidth(),LineaPuntoVentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLineaPuntoVenta.setVisible(true);
	        this.jInternalFrameDetalleFormLineaPuntoVenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLineaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLineaPuntoVenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLineaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaPuntoVenta,false,this);
				} else {
					this.jInternalFrameOrderByLineaPuntoVenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaPuntoVenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLineaPuntoVenta);
				this.jInternalFrameOrderByLineaPuntoVenta.setVisible(false);
				this.jInternalFrameOrderByLineaPuntoVenta.setSelected(false);
				
				this.jInternalFrameOrderByLineaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaPuntoVenta"));
				
				this.inicializarActualizarBindingTablaOrderByLineaPuntoVenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLineaPuntoVenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLineaPuntoVenta==null) {
				
				this.jInternalFrameImportacionLineaPuntoVenta=new ImportacionJInternalFrame(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaPuntoVenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLineaPuntoVenta);
				this.jInternalFrameImportacionLineaPuntoVenta.setVisible(false);
				this.jInternalFrameImportacionLineaPuntoVenta.setSelected(false);


				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaPuntoVenta"));
				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaPuntoVenta"));
				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaPuntoVenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLineaPuntoVenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLineaPuntoVenta==null) {
				this.jInternalFrameReporteDinamicoLineaPuntoVenta=new ReporteDinamicoJInternalFrame(LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaPuntoVenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaPuntoVenta);
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.setVisible(false);
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaPuntoVenta"));
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaPuntoVenta"));
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaPuntoVenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaPuntoVenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleLineaPuntoVenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaPuntoVenta);
			
	       	this.jInternalFrameDetalleFormLineaPuntoVenta.setVisible(false);
	        this.jInternalFrameDetalleFormLineaPuntoVenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormLineaPuntoVenta.dispose();
			//this.jInternalFrameDetalleFormLineaPuntoVenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLineaPuntoVenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLineaPuntoVenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoLineaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLineaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLineaPuntoVenta.setVisible(true);
	        this.jInternalFrameImportacionLineaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLineaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLineaPuntoVenta.setVisible(true);
	        this.jInternalFrameOrderByLineaPuntoVenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLineaPuntoVenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLineaPuntoVenta.setVisible(false);
	        this.jInternalFrameOrderByLineaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLineaPuntoVenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLineaPuntoVenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoLineaPuntoVenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLineaPuntoVenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLineaPuntoVenta.setVisible(false);
	        this.jInternalFrameImportacionLineaPuntoVenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLinea(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaGrupo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaGrupo";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaGrupo(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaCategoria(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaCategoria";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
						TitledBorder titledBorderLineaCategoria=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaCategoria.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaCategoria(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLineaMarca(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaMarca";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
						TitledBorder titledBorderLineaMarca=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaMarca.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaMarca(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLineaPuntoVenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLineaPuntoVenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLineaPuntoVenta(true);
			//this.isEsNuevoLineaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLineaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaPuntoVenta(false) ;
			
			if(lineapuntoventaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaPuntoVenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLineaPuntoVentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLineaPuntoVenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLineaPuntoVenta(true);
			//this.isEsNuevoLineaPuntoVenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.lineapuntoventa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLineaPuntoVenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLineaPuntoVenta(false) ;
			
			if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaPuntoVenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLineaPuntoVenta(false);
			
			//if(!this.isEsNuevoLineaPuntoVenta) {								
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				
			}
			
			if(this.permiteMantenimiento(this.lineapuntoventa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLineaPuntoVenta=true;
					this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
					this.isEsNuevoLineaPuntoVenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLineaPuntoVenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLineaPuntoVenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesLineaPuntoVenta(false);
			
												
				
				if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLineaPuntoVenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLineaPuntoVentaActionPerformed(evt,lineapuntoventaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLineaPuntoVenta(this.lineapuntoventa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,lineapuntoventaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.lineapuntoventa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.lineapuntoventa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				this.lineapuntoventa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.lineapuntoventa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LineaPuntoVentaModel) this.jTableDatosLineaPuntoVenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLineaPuntoVenta=true;
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
				this.isEsNuevoLineaPuntoVenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaPuntoVenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(false);
				
				this.habilitarDeshabilitarControlesLineaPuntoVenta(false);
				
				
				
				if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLineaPuntoVenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLineaPuntoVenta.getRowCount()>=1) {
				jTableDatosLineaPuntoVenta.removeRowSelectionInterval(0, jTableDatosLineaPuntoVenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLineaPuntoVenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaPuntoVenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(false) ;
			
			this.isEsNuevoLineaPuntoVenta=false;
			
			if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLineaPuntoVenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLineaPuntoVenta(false);
				
				//SI ES MANUAL
				if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLineaPuntoVenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLineaPuntoVenta--;			
			//LineaPuntoVenta lineapuntoventaAux= new LineaPuntoVenta();			
			//lineapuntoventaAux.setId(this.iIdNuevoLineaPuntoVenta);
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLineaPuntoVenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
			
			this.lineapuntoventa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.lineapuntoventaLogic.getLineaPuntoVentas().add(this.lineapuntoventaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.lineapuntoventas.add(this.lineapuntoventaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			
			this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(this.getIndiceNuevoLineaPuntoVenta(), this.getIndiceNuevoLineaPuntoVenta());
			
			int iLastRow =  this.jTableDatosLineaPuntoVenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLineaPuntoVenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLineaPuntoVenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaPuntoVenta(false);
			
			//SI ES MANUAL
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaPuntoVenta();
			}
			
			//this.abrirFrameTreeLineaPuntoVenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Linea Punto VentaS ?", "MANTENIMIENTO DE Linea Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLineaPuntoVenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLineaPuntoVenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.lineapuntoventaReturnGeneral=lineapuntoventaLogic.procesarImportacionLineaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.lineapuntoventaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLineaPuntoVentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLineaPuntoVenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLineaPuntoVenta.setFileImportacion(this.jInternalFrameImportacionLineaPuntoVenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLineaPuntoVenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLineaPuntoVenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLineaPuntoVenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLineaPuntoVenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		

		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LineaPuntoVentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LineaPuntoVentaBaseDesign.jrxml";
			
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
			
			this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LineaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(LineaPuntoVenta lineapuntoventa:lineapuntoventasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineapuntoventa.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelLineaPuntoVenta(row);				
			//	iRow++;
			//}				
			
			//for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLineaPuntoVenta(lineapuntoventaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
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
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaPuntoVenta(false);
			
			//SI ES MANUAL
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaPuntoVenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaPuntoVenta(false);
			
			//SI ES MANUAL
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaPuntoVenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaPuntoVenta(false);
			
			//SI ES MANUAL
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaPuntoVenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLineaPuntoVenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLineaPuntoVenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLineaPuntoVenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLineaPuntoVenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLineaPuntoVenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLineaPuntoVenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosLineaPuntoVenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosLineaPuntoVenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLineaPuntoVenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLineaPuntoVenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLineaPuntoVenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLineaPuntoVenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLineaPuntoVenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLineaPuntoVenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaPuntoVenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLineaPuntoVenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLineaPuntoVenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLineaPuntoVenta();
		
		this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLineaPuntoVenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaPuntoVenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLineaPuntoVenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLineaPuntoVenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLineaPuntoVenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLineaPuntoVenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLineaPuntoVenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionNuevoLineaPuntoVenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionSinCerrarLineaPuntoVenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionSinMensajeLineaPuntoVenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLineaPuntoVenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLineaPuntoVenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLineaPuntoVenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionNuevoLineaPuntoVenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionSinCerrarLineaPuntoVenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxPostAccionSinMensajeLineaPuntoVenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLineaPuntoVenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLineaPuntoVenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLineaPuntoVenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLineaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLineaPuntoVenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLineaPuntoVenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLineaPuntoVenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLineaPuntoVenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLineaPuntoVenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLineaPuntoVenta(Boolean esInicializar) throws Exception {
		try	{	
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLineaPuntoVenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLineaPuntoVenta() throws Exception {
		try	{
			if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaPuntoVenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaPuntoVenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaPuntoVenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLineaPuntoVenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLineaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLineaPuntoVenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLineaPuntoVenta.addItem(reporte);
			}
			
			
			if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLineaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLineaPuntoVenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLineaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLineaPuntoVenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLineaPuntoVenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLineaPuntoVenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLineaPuntoVenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaPuntoVenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaPuntoVenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLineaPuntoVenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.getSelectedItem()!=null){this.id_lineaFK_IdLinea=((Linea)this.jComboBoxid_lineaFK_IdLineaLineaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.getSelectedItem()!=null){this.id_linea_categoriaFK_IdLineaCategoria=((Linea)this.jComboBoxid_linea_categoriaFK_IdLineaCategoriaLineaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.getSelectedItem()!=null){this.id_linea_grupoFK_IdLineaGrupo=((Linea)this.jComboBoxid_linea_grupoFK_IdLineaGrupoLineaPuntoVenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.getSelectedItem()!=null){this.id_linea_marcaFK_IdLineaMarca=((Linea)this.jComboBoxid_linea_marcaFK_IdLineaMarcaLineaPuntoVenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLineaPuntoVenta(Boolean esInicializar) throws Exception {				
		if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLineaPuntoVenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLineaPuntoVenta() throws Exception {
		this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLineaPuntoVenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLineaPuntoVentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLineaPuntoVenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=lineapuntoventaLogic.getLineaPuntoVentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=lineapuntoventas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLineaPuntoVenta.setModel(new LineaPuntoVentaModel(this.lineapuntoventaLogic.getLineaPuntoVentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLineaPuntoVenta.setModel(new LineaPuntoVentaModel(this.lineapuntoventas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLineaPuntoVenta!=null && this.jInternalFrameOrderByLineaPuntoVenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLineaPuntoVenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,lineapuntoventaConstantesFunciones.resaltarSeleccionarLineaPuntoVenta,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LineaPuntoVentaConstantesFunciones.SCLASSWEBTITULO,lineapuntoventaConstantesFunciones.resaltarSeleccionarLineaPuntoVenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_ID));

		if(this.lineapuntoventaConstantesFunciones.mostraridLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.lineapuntoventaConstantesFunciones.resaltaridLineaPuntoVenta,this.lineapuntoventaConstantesFunciones.activaridLineaPuntoVenta,this,true,"idLineaPuntoVenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineapuntoventaConstantesFunciones.resaltaridLineaPuntoVenta,this.lineapuntoventaConstantesFunciones.activaridLineaPuntoVenta,this,true,"idLineaPuntoVenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_empresaLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_empresaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_empresaLineaPuntoVenta));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_empresaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_empresaLineaPuntoVenta,false,"id_empresaLineaPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_sucursalLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_sucursalLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_sucursalLineaPuntoVenta));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_sucursalLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_sucursalLineaPuntoVenta,false,"id_sucursalLineaPuntoVenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_lineaLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_lineaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_lineaLineaPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_lineaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_lineaLineaPuntoVenta,true,"id_lineaLineaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_linea_grupoLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_grupoLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_grupoLineaPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_grupoLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_grupoLineaPuntoVenta,true,"id_linea_grupoLineaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_linea_categoriaLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_categoriaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_categoriaLineaPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_categoriaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_categoriaLineaPuntoVenta,true,"id_linea_categoriaLineaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA));

		if(this.lineapuntoventaConstantesFunciones.mostrarid_linea_marcaLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_marcaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_marcaLineaPuntoVenta));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcasForeignKey,this.lineapuntoventaConstantesFunciones.resaltarid_linea_marcaLineaPuntoVenta,this,this.lineapuntoventaConstantesFunciones.activarid_linea_marcaLineaPuntoVenta,true,"id_linea_marcaLineaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.lineapuntoventaConstantesFunciones.mostraresta_activoLineaPuntoVenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.lineapuntoventaConstantesFunciones.resaltaresta_activoLineaPuntoVenta,this.lineapuntoventaConstantesFunciones.activaresta_activoLineaPuntoVenta));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.lineapuntoventaConstantesFunciones.resaltaresta_activoLineaPuntoVenta,this.lineapuntoventaConstantesFunciones.activaresta_activoLineaPuntoVenta,this,true,"esta_activoLineaPuntoVenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LineaPuntoVentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaPuntoVenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaPuntoVenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.lineapuntoventaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLineaPuntoVenta.addColumn(tableColumn);
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
			
			this.jTableDatosLineaPuntoVenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLineaPuntoVenta.moveColumn(this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLineaPuntoVenta.moveColumn(this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLineaPuntoVenta.moveColumn(this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLineaPuntoVenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLineaPuntoVenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLineaPuntoVenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLineaPuntoVenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLineaPuntoVenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLineaPuntoVenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLineaPuntoVenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=lineapuntoventaLogic.getLineaPuntoVentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=lineapuntoventas.size()-1;
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
		//this.jTableDatosLineaPuntoVenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLineaPuntoVenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLineaPuntoVenta();
			
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
				
				//this.isEsNuevoLineaPuntoVenta=false;
					
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
				if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.lineapuntoventa.getsType().equals("DUPLICADO")
				   || this.lineapuntoventa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLineaPuntoVenta=true;
				
				} else {
					this.isEsNuevoLineaPuntoVenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					if(this.lineapuntoventa.getId()>=0 && !this.lineapuntoventa.getIsNew()) {						
						this.isEsNuevoLineaPuntoVenta=false;
						
					} else {
						this.isEsNuevoLineaPuntoVenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLineaPuntoVenta(esRelaciones);						
				
				this.seleccionarLineaPuntoVenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.lineapuntoventa.getId()<0) {
					this.isEsNuevoLineaPuntoVenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLineaPuntoVenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLineaPuntoVenta(evt,rowIndex);
				}	
				
				if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LineaPuntoVenta: " + this.dDif); 
					}
				}								
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLineaPuntoVenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.lineapuntoventa)) {
					if(this.lineapuntoventa.getId()>0) {
						this.lineapuntoventa.setIsDeleted(true);
						
						this.lineapuntoventasEliminados.add(this.lineapuntoventa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineapuntoventaLogic.getLineaPuntoVentas().remove(this.lineapuntoventa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineapuntoventas.remove(this.lineapuntoventa);				
					}
					
					
					((LineaPuntoVentaModel) this.jTableDatosLineaPuntoVenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaPuntoVenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLineaPuntoVenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLineaPuntoVenta) {
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaPuntoVenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaPuntoVenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.lineapuntoventaConstantesFunciones.cargarid_empresaLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_empresaLineaPuntoVenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.lineapuntoventa.getid_empresa());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(lineapuntoventa.getEmpresa()!=null) {
							this.empresasForeignKey.add(lineapuntoventa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.lineapuntoventa.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.lineapuntoventaConstantesFunciones.cargarid_sucursalLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_sucursalLineaPuntoVenta) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.lineapuntoventa.getid_sucursal());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(lineapuntoventa.getSucursal()!=null) {
							this.sucursalsForeignKey.add(lineapuntoventa.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.lineapuntoventa.getid_sucursal(),false,"Formulario");

					//Linea
					if(!this.lineapuntoventaConstantesFunciones.cargarid_lineaLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_lineaLineaPuntoVenta) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.lineapuntoventa.getid_linea());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(lineapuntoventa.getLinea()!=null) {
							this.lineasForeignKey.add(lineapuntoventa.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.lineapuntoventa.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.lineapuntoventaConstantesFunciones.cargarid_linea_grupoLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_linea_grupoLineaPuntoVenta) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.lineapuntoventa.getid_linea_grupo());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(lineapuntoventa.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(lineapuntoventa.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.lineapuntoventa.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.lineapuntoventaConstantesFunciones.cargarid_linea_categoriaLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_linea_categoriaLineaPuntoVenta) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.lineapuntoventa.getid_linea_categoria());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(lineapuntoventa.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(lineapuntoventa.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.lineapuntoventa.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.lineapuntoventaConstantesFunciones.cargarid_linea_marcaLineaPuntoVenta || this.lineapuntoventaConstantesFunciones.event_dependid_linea_marcaLineaPuntoVenta) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.lineapuntoventa.getid_linea_marca());
									//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(lineapuntoventa.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(lineapuntoventa.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.lineapuntoventa.getid_linea_marca(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLineaPuntoVenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLineaPuntoVenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaPuntoVenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaPuntoVenta(LineaPuntoVenta lineapuntoventa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLineaPuntoVenta(lineapuntoventa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLineaPuntoVenta(lineapuntoventa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLineaPuntoVenta(lineapuntoventa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLineaPuntoVenta(lineapuntoventa);
	}
	
	public void setVariablesObjetoActualToFormularioLineaPuntoVenta(LineaPuntoVenta lineapuntoventa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setText(lineapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setSelected(lineapuntoventa.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LineaPuntoVenta lineapuntoventaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,lineapuntoventaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LineaPuntoVenta lineapuntoventaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				lineapuntoventaLocal=this.lineapuntoventa;
			} else {
				lineapuntoventaLocal=this.lineapuntoventaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(lineapuntoventaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLineaPuntoVenta(lineapuntoventaLocal,true);
					
					if(lineapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(lineapuntoventaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(lineapuntoventaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaPuntoVenta(lineapuntoventa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(lineapuntoventa);
	}
	
	public void setVariablesFormularioToObjetoActualLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaPuntoVenta(lineapuntoventa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.getText()==null || this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.getText()=="" || this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.getText()=="Id") {
				this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setText("0");
			}

			if(conColumnasBase) {lineapuntoventa.setId(Long.parseLong(this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaPuntoVentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelIdLineaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineapuntoventa.setesta_activo(this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelesta_activoLineaPuntoVenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaPuntoVenta(LineaPuntoVenta lineapuntoventaBean,LineaPuntoVenta lineapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && lineapuntoventaBean.getid_linea()!=null && !lineapuntoventaBean.getid_linea().equals(-1L))) {lineapuntoventa.setid_linea(lineapuntoventaBean.getid_linea());}
			if(conDefault || (!conDefault && lineapuntoventaBean.getid_linea_grupo()!=null && !lineapuntoventaBean.getid_linea_grupo().equals(null))) {lineapuntoventa.setid_linea_grupo(lineapuntoventaBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && lineapuntoventaBean.getid_linea_categoria()!=null && !lineapuntoventaBean.getid_linea_categoria().equals(null))) {lineapuntoventa.setid_linea_categoria(lineapuntoventaBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && lineapuntoventaBean.getid_linea_marca()!=null && !lineapuntoventaBean.getid_linea_marca().equals(null))) {lineapuntoventa.setid_linea_marca(lineapuntoventaBean.getid_linea_marca());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLineaPuntoVenta(LineaPuntoVenta lineapuntoventaOrigen,LineaPuntoVenta lineapuntoventa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineapuntoventaOrigen.getId()!=null && !lineapuntoventaOrigen.getId().equals(0L))) {lineapuntoventa.setId(lineapuntoventaOrigen.getId());}}
			if(conDefault || (!conDefault && lineapuntoventaOrigen.getid_linea()!=null && !lineapuntoventaOrigen.getid_linea().equals(-1L))) {lineapuntoventa.setid_linea(lineapuntoventaOrigen.getid_linea());}
			if(conDefault || (!conDefault && lineapuntoventaOrigen.getid_linea_grupo()!=null && !lineapuntoventaOrigen.getid_linea_grupo().equals(null))) {lineapuntoventa.setid_linea_grupo(lineapuntoventaOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && lineapuntoventaOrigen.getid_linea_categoria()!=null && !lineapuntoventaOrigen.getid_linea_categoria().equals(null))) {lineapuntoventa.setid_linea_categoria(lineapuntoventaOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && lineapuntoventaOrigen.getid_linea_marca()!=null && !lineapuntoventaOrigen.getid_linea_marca().equals(null))) {lineapuntoventa.setid_linea_marca(lineapuntoventaOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && lineapuntoventaOrigen.getesta_activo()!=null && !lineapuntoventaOrigen.getesta_activo().equals(false))) {lineapuntoventa.setesta_activo(lineapuntoventaOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaPuntoVenta(LineaPuntoVenta lineapuntoventa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setText(lineapuntoventa.getId().toString());
			this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setSelected(lineapuntoventa.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaPuntoVenta(LineaPuntoVentaBean lineapuntoventaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setText(lineapuntoventaBean.getId().toString());
			this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setSelected(lineapuntoventaBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLineaPuntoVenta(LineaPuntoVentaParameterReturnGeneral lineapuntoventaReturnGeneral,LineaPuntoVentaBean lineapuntoventaBean,Boolean conDefault) throws Exception { 
		try {
			LineaPuntoVenta lineapuntoventaLocal=new LineaPuntoVenta();
			
			lineapuntoventaLocal=lineapuntoventaReturnGeneral.getLineaPuntoVenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineapuntoventaLocal.getId()!=null && !lineapuntoventaLocal.getId().equals(0L))) {lineapuntoventaBean.setId(lineapuntoventaLocal.getId());}}
			if(conDefault || (!conDefault && lineapuntoventaLocal.getid_linea()!=null && !lineapuntoventaLocal.getid_linea().equals(-1L))) {lineapuntoventaBean.setid_linea(lineapuntoventaLocal.getid_linea());}
			if(conDefault || (!conDefault && lineapuntoventaLocal.getid_linea_grupo()!=null && !lineapuntoventaLocal.getid_linea_grupo().equals(null))) {lineapuntoventaBean.setid_linea_grupo(lineapuntoventaLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && lineapuntoventaLocal.getid_linea_categoria()!=null && !lineapuntoventaLocal.getid_linea_categoria().equals(null))) {lineapuntoventaBean.setid_linea_categoria(lineapuntoventaLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && lineapuntoventaLocal.getid_linea_marca()!=null && !lineapuntoventaLocal.getid_linea_marca().equals(null))) {lineapuntoventaBean.setid_linea_marca(lineapuntoventaLocal.getid_linea_marca());}
			if(conDefault || (!conDefault && lineapuntoventaLocal.getesta_activo()!=null && !lineapuntoventaLocal.getesta_activo().equals(false))) {lineapuntoventaBean.setesta_activo(lineapuntoventaLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLineaPuntoVentaGenerico(Long idLineaPuntoVentaSeleccionado,JComboBox jComboBoxLineaPuntoVenta,List<LineaPuntoVenta> lineapuntoventasLocal)throws Exception {
		try {
			LineaPuntoVenta  lineapuntoventaTemp=null;

			for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasLocal) {
				if(lineapuntoventaAux.getId()!=null && lineapuntoventaAux.getId().equals(idLineaPuntoVentaSeleccionado)) {
					lineapuntoventaTemp=lineapuntoventaAux;
					break;
				}
			}

			jComboBoxLineaPuntoVenta.setSelectedItem(lineapuntoventaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLineaPuntoVentaGenerico(JComboBox jComboBoxLineaPuntoVenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaPuntoVenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLineaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaPuntoVenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLineaPuntoVenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLineaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLineaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineapuntoventa=(LineaPuntoVenta) lineapuntoventaLogic.getLineaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineapuntoventa =(LineaPuntoVenta) lineapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!lineapuntoventa.getIsNew() && !lineapuntoventa.getIsChanged() && !lineapuntoventa.getIsDeleted()) {
				sDescripcion=lineapuntoventa.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=lineapuntoventa.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LineaPuntoVenta lineapuntoventaRow=new LineaPuntoVenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineapuntoventaRow=(LineaPuntoVenta) lineapuntoventaLogic.getLineaPuntoVentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineapuntoventaRow=(LineaPuntoVenta) lineapuntoventas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLineaPuntoVenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));			
			this.jButtonDuplicarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarLineaPuntoVenta && this.isPermisoDuplicarLineaPuntoVenta));			
			this.jButtonCopiarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarLineaPuntoVenta && this.isPermisoCopiarLineaPuntoVenta));
			this.jButtonVerFormLineaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormLineaPuntoVenta && this.isPermisoVerFormLineaPuntoVenta));
			
			this.jButtonAbrirOrderByLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));			
			
			this.jButtonNuevoRelacionesLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarLineaPuntoVenta && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarLineaPuntoVenta && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarLineaPuntoVenta && this.isPermisoEliminarLineaPuntoVenta));
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarLineaPuntoVenta);							
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));						
			this.jButtonDuplicarToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarLineaPuntoVenta && this.isPermisoDuplicarLineaPuntoVenta));						
			this.jButtonCopiarToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarLineaPuntoVenta && this.isPermisoCopiarLineaPuntoVenta));			
			this.jButtonVerFormToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormLineaPuntoVenta && this.isPermisoVerFormLineaPuntoVenta));			
			this.jButtonAbrirOrderByToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));
			this.jButtonNuevoRelacionesToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));			
			this.jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));			
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarLineaPuntoVenta && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarLineaPuntoVenta  && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarLineaPuntoVenta && this.isPermisoEliminarLineaPuntoVenta));
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarToolBarLineaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarLineaPuntoVenta);				
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));			
			this.jMenuItemDuplicarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaDuplicarLineaPuntoVenta && this.isPermisoDuplicarLineaPuntoVenta));			
			this.jMenuItemCopiarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaCopiarLineaPuntoVenta && this.isPermisoCopiarLineaPuntoVenta));			
			this.jMenuItemVerFormLineaPuntoVenta.setVisible((this.isVisibilidadCeldaVerFormLineaPuntoVenta && this.isPermisoVerFormLineaPuntoVenta));			
			this.jMenuItemAbrirOrderByLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));			
			//this.jMenuItemMostrarOcultarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));
			this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));			
			//this.jMenuItemDetalleMostrarOcultarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaOrdenLineaPuntoVenta && this.isPermisoOrdenLineaPuntoVenta));			
			this.jMenuItemNuevoRelacionesLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta));			
			this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta.setVisible((this.isVisibilidadCeldaNuevoLineaPuntoVenta && this.isPermisoNuevoLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));									
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemModificarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaModificarLineaPuntoVenta && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemActualizarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaActualizarLineaPuntoVenta && this.isPermisoActualizarLineaPuntoVenta));	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemEliminarLineaPuntoVenta.setVisible((this.isVisibilidadCeldaEliminarLineaPuntoVenta && this.isPermisoEliminarLineaPuntoVenta));
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemCancelarLineaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarLineaPuntoVenta);				
			}
			
			this.jMenuItemGuardarCambiosLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));						
			this.jMenuItemGuardarCambiosTablaLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=this.jButtonNuevoLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaDuplicarLineaPuntoVenta=this.jButtonDuplicarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCopiarLineaPuntoVenta=this.jButtonCopiarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaVerFormLineaPuntoVenta=this.jButtonVerFormLineaPuntoVenta.isVisible();
			
			this.isVisibilidadCeldaOrdenLineaPuntoVenta=this.jButtonAbrirOrderByLineaPuntoVenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=this.jButtonNuevoRelacionesLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaModificarLineaPuntoVenta=this.jButtonModificarLineaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=this.jButtonGuardarCambiosTablaLineaPuntoVenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=this.jButtonNuevoToolBarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=this.jButtonNuevoRelacionesToolBarLineaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarToolBarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarToolBarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarToolBarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarToolBarLineaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaPuntoVenta=this.jButtonGuardarCambiosToolBarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=this.jMenuItemNuevoLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=this.jMenuItemNuevoRelacionesLineaPuntoVenta.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.isVisibilidadCeldaModificarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemModificarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemActualizarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemEliminarLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemCancelarLineaPuntoVenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaPuntoVenta=this.jMenuItemGuardarCambiosLineaPuntoVenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=this.jMenuItemGuardarCambiosTablaLineaPuntoVenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLineaPuntoVenta(Boolean esInicializar) {
		if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
				//if(this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLineaPuntoVenta();
			}
			
			this.inicializarActualizarBindingBotonesManualLineaPuntoVenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLineaPuntoVenta() {
		this.jButtonNuevoLineaPuntoVenta.setVisible(this.isPermisoNuevoLineaPuntoVenta);			
		this.jButtonDuplicarLineaPuntoVenta.setVisible(this.isPermisoDuplicarLineaPuntoVenta);			
		this.jButtonCopiarLineaPuntoVenta.setVisible(this.isPermisoCopiarLineaPuntoVenta);			
		this.jButtonVerFormLineaPuntoVenta.setVisible(this.isPermisoVerFormLineaPuntoVenta);			
		
		this.jButtonAbrirOrderByLineaPuntoVenta.setVisible(this.isPermisoOrdenLineaPuntoVenta);					
		
		this.jButtonNuevoRelacionesLineaPuntoVenta.setVisible(this.isPermisoNuevoLineaPuntoVenta);			
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarLineaPuntoVenta.setVisible(this.isPermisoActualizarLineaPuntoVenta);	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.setVisible(this.isPermisoActualizarLineaPuntoVenta);	
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.setVisible(this.isPermisoEliminarLineaPuntoVenta);
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarLineaPuntoVenta);						
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.setVisible(this.isPermisoGuardarCambiosLineaPuntoVenta);							
		}
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.setVisible(this.isPermisoActualizarLineaPuntoVenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaPuntoVenta() {
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarLineaPuntoVenta.setVisible(this.isPermisoActualizarLineaPuntoVenta);	
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.setVisible(this.isPermisoActualizarLineaPuntoVenta);	
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.setVisible(this.isPermisoEliminarLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.setVisible(this.isVisibilidadCeldaCancelarLineaPuntoVenta);							
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.setVisible((this.isVisibilidadCeldaGuardarLineaPuntoVenta && this.isPermisoGuardarCambiosLineaPuntoVenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLineaPuntoVenta() {
		if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLineaPuntoVenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLineaPuntoVenta() {
	}
	
	public void jTableDatosLineaPuntoVentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLineaPuntoVenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.lineapuntoventa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.lineapuntoventa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.lineapuntoventa.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.lineapuntoventa.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.lineapuntoventa.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.lineapuntoventa.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaLineaPuntoVentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebLineaPuntoVenta(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaPuntoVenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaPuntoVenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.lineapuntoventaLogic.getConnexion());

				if(this.lineapuntoventa.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.lineapuntoventa.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaPuntoVenta=(TitledBorder)this.jScrollPanelDatosLineaPuntoVenta.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderLineaPuntoVenta.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.lineapuntoventa.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoLineaPuntoVentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.getlineapuntoventa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineapuntoventa==null) {
						this.lineapuntoventa = new LineaPuntoVenta();
					}

					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);
				}

				if(this.lineapuntoventa.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.lineapuntoventa.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaPuntoVenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdEmpresa();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdLinea();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdLineaCategoria();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdLineaGrupo();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdLineaMarca();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalLineaPuntoVentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);

			this.getLineaPuntoVentasFK_IdSucursal();

			this.inicializarActualizarBindingLineaPuntoVenta(false);

			//if(LineaPuntoVentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineapuntoventaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLineaPuntoVenta() {
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormLineaPuntoVenta.dispose();
			this.jInternalFrameDetalleFormLineaPuntoVenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
			this.jInternalFrameReporteDinamicoLineaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLineaPuntoVenta.dispose();
			this.jInternalFrameReporteDinamicoLineaPuntoVenta=null;
		}
		
		if(this.jInternalFrameImportacionLineaPuntoVenta!=null) {
			this.jInternalFrameImportacionLineaPuntoVenta.setVisible(false);	    			
			this.jInternalFrameImportacionLineaPuntoVenta.dispose();
			this.jInternalFrameImportacionLineaPuntoVenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLineaPuntoVenta();
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			
			if(sTipo.equals("NuevoLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLineaPuntoVenta")) {
				jButtonDuplicarLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLineaPuntoVenta")) {
				jButtonCopiarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormLineaPuntoVenta")) {
				jButtonVerFormLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLineaPuntoVenta")) {
				jButtonDuplicarLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLineaPuntoVenta")) {
				jButtonDuplicarLineaPuntoVentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLineaPuntoVenta")) {
				jButtonModificarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLineaPuntoVenta")) {
				jButtonModificarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLineaPuntoVenta")) {
				jButtonModificarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLineaPuntoVenta")) {
				jButtonActualizarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLineaPuntoVenta")) {
				jButtonActualizarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLineaPuntoVenta")) {
				jButtonActualizarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarLineaPuntoVenta")) {
				jButtonEliminarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLineaPuntoVenta")) {
				jButtonEliminarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLineaPuntoVenta")) {
				jButtonEliminarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarLineaPuntoVenta")) {
				jButtonCancelarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLineaPuntoVenta")) {
				jButtonCancelarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLineaPuntoVenta")) {
				jButtonCancelarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarLineaPuntoVenta")) {
				jButtonCerrarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLineaPuntoVenta")) {
				jButtonCerrarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLineaPuntoVenta")) {
				jButtonCerrarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLineaPuntoVenta")) {
				jButtonMostrarOcultarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLineaPuntoVenta")) {
				jButtonCancelarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLineaPuntoVenta")) {
				jButtonCopiarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLineaPuntoVenta")) {
				jButtonVerFormLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLineaPuntoVenta")) {
				jButtonCopiarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLineaPuntoVenta")) {
				jButtonVerFormLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLineaPuntoVenta")) {
				jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLineaPuntoVenta")) {
				jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLineaPuntoVenta")) {
				jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLineaPuntoVenta")) {
				jButtonAnterioresLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLineaPuntoVenta")) {
				jButtonAnterioresLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLineaPuntoVenta")) {
				jButtonAnterioresLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLineaPuntoVenta")) {
				jButtonSiguientesLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLineaPuntoVenta")) {
				jButtonSiguientesLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLineaPuntoVenta")) {
				jButtonSiguientesLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLineaPuntoVenta") || sTipo.equals("MenuItemDetalleAbrirOrderByLineaPuntoVenta")) {
				jButtonAbrirOrderByLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLineaPuntoVenta") || sTipo.equals("MenuItemDetalleMostrarOcultarLineaPuntoVenta")) {
				jButtonMostrarOcultarLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLineaPuntoVenta")) {
				jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLineaPuntoVenta")) {
				jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLineaPuntoVenta")) {
				jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLineaPuntoVenta")) {
				jButtonCerrarReporteDinamicoLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLineaPuntoVenta")) {
				jButtonGenerarReporteDinamicoLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLineaPuntoVenta")) {
				
				jButtonGenerarExcelReporteDinamicoLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLineaPuntoVenta")) {
				jButtonCerrarImportacionLineaPuntoVentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLineaPuntoVenta")) {
				
				jButtonGenerarImportacionLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLineaPuntoVenta")) {
				
				jButtonAbrirImportacionLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLineaPuntoVenta")) {
				jComboBoxTiposAccionesLineaPuntoVentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLineaPuntoVenta")) {
				jComboBoxTiposRelacionesLineaPuntoVentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLineaPuntoVenta")) {
				jComboBoxTiposAccionesLineaPuntoVentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLineaPuntoVenta")) {
				
				jComboBoxTiposSeleccionarLineaPuntoVentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLineaPuntoVenta")) {
				jTextFieldValorCampoGeneralLineaPuntoVentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLineaPuntoVenta")) {
				jButtonAbrirOrderByLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLineaPuntoVenta")) {
				jButtonAbrirOrderByLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLineaPuntoVenta")) {
				jButtonCerrarOrderByLineaPuntoVentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaPuntoVentaBusqueda")) {
				this.jButtonidLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaPuntoVentaUpdate")) {
				this.jButtonid_empresaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaPuntoVentaBusqueda")) {
				this.jButtonid_empresaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLineaPuntoVentaUpdate")) {
				this.jButtonid_sucursalLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLineaPuntoVentaBusqueda")) {
				this.jButtonid_sucursalLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaLineaPuntoVentaUpdate")) {
				this.jButtonid_lineaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaLineaPuntoVentaBusqueda")) {
				this.jButtonid_lineaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_grupoLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_grupoLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_categoriaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_categoriaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_marcaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_marcaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoLineaPuntoVentaBusqueda")) {
				this.jButtonesta_activoLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdLineaLineaPuntoVenta")) {
				this.jButtonFK_IdLineaLineaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaCategoriaLineaPuntoVenta")) {
				this.jButtonFK_IdLineaCategoriaLineaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaGrupoLineaPuntoVenta")) {
				this.jButtonFK_IdLineaGrupoLineaPuntoVentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdLineaMarcaLineaPuntoVenta")) {
				this.jButtonFK_IdLineaMarcaLineaPuntoVentaActionPerformed(evt);
			}
			
			;
			
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLineaPuntoVenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LineaPuntoVenta lineapuntoventaLocal=null;
			
			if(!this.getEsControlTabla()) {
				lineapuntoventaLocal=this.lineapuntoventa;
			} else {
				lineapuntoventaLocal=this.lineapuntoventaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
							
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
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
			
			


			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
								
						
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
								
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
							
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
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
			
			


			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
								
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLineaPuntoVenta")) {
					jCheckBoxSeleccionarTodosLineaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLineaPuntoVenta")) {
					jCheckBoxSeleccionadosLineaPuntoVentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLineaPuntoVenta")) {
					
				}
				
				


				
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
												
				
				


				
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
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
			
			


			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaPuntoVentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineapuntoventa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineapuntoventa);
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
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
				
				


				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaPuntoVenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaPuntoVenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaPuntoVentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineapuntoventaAnterior =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLineaPuntoVenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLineaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLineaPuntoVenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.lineapuntoventa =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.lineapuntoventa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLineaPuntoVenta")) {
				
				}
				
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLineaPuntoVenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLineaPuntoVenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLineaPuntoVenta")) {
			
			}
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLineaPuntoVenta();
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			if(sTipo.equals("NuevoLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLineaPuntoVenta")) {
				jButtonDuplicarLineaPuntoVentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLineaPuntoVenta")) {
				jButtonCopiarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLineaPuntoVenta")) {
				jButtonVerFormLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLineaPuntoVenta")) {
				jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLineaPuntoVenta")) {
				jButtonModificarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLineaPuntoVenta")) {
				jButtonActualizarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLineaPuntoVenta")) {
				jButtonEliminarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLineaPuntoVenta")) {
				jButtonCancelarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLineaPuntoVenta")) {
				jButtonCerrarLineaPuntoVentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLineaPuntoVenta")) {
				jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLineaPuntoVenta")) {
				jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLineaPuntoVenta")) {
				jButtonAbrirOrderByLineaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLineaPuntoVenta")) {
				jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLineaPuntoVenta")) {
				jButtonAnterioresLineaPuntoVentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLineaPuntoVenta")) {
				jButtonSiguientesLineaPuntoVentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaPuntoVentaBusqueda")) {
				this.jButtonidLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaPuntoVentaUpdate")) {
				this.jButtonid_empresaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaPuntoVentaBusqueda")) {
				this.jButtonid_empresaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalLineaPuntoVentaUpdate")) {
				this.jButtonid_sucursalLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalLineaPuntoVentaBusqueda")) {
				this.jButtonid_sucursalLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaLineaPuntoVentaUpdate")) {
				this.jButtonid_lineaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaLineaPuntoVentaBusqueda")) {
				this.jButtonid_lineaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_grupoLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_grupoLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_categoriaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_categoriaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaLineaPuntoVentaUpdate")) {
				this.jButtonid_linea_marcaLineaPuntoVentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaLineaPuntoVentaBusqueda")) {
				this.jButtonid_linea_marcaLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoLineaPuntoVentaBusqueda")) {
				this.jButtonesta_activoLineaPuntoVentaBusquedaActionPerformed(evt);
			}
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLineaPuntoVenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLineaPuntoVenta")) {
				closingInternalFrameLineaPuntoVenta();
				
			} else if(sTipo.equals("jButtonCancelarLineaPuntoVenta")) {
				JInternalFrameBase jInternalFrameDetalleFormLineaPuntoVenta = (JInternalFrameBase)evt.getSource();
	            	
	            LineaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(LineaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaPuntoVenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLineaPuntoVentaActionPerformed(null);
			}
			
			LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineapuntoventa,new Object(),this.lineapuntoventaParameterGeneral,this.lineapuntoventaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLineaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLineaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLineaPuntoVenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.lineapuntoventa)) {
			if(!esControlTabla) {
				if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);			
				}
				
				if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLineaPuntoVenta(this.lineapuntoventa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineapuntoventaReturnGeneral=lineapuntoventaLogic.procesarEventosLineaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineapuntoventaLogic.getLineaPuntoVentas(),this.lineapuntoventa,this.lineapuntoventaParameterGeneral,this.isEsNuevoLineaPuntoVenta,classes);//this.lineapuntoventaLogic.getLineaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLineaPuntoVenta(this.lineapuntoventaReturnGeneral,this.lineapuntoventaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLineaPuntoVenta(classes,this.lineapuntoventaReturnGeneral,this.lineapuntoventaBean,false);
					}
						
					if(this.lineapuntoventaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta());	
					}
						
					if(this.lineapuntoventaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta(),classes);//this.lineapuntoventaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLineaPuntoVenta(this.lineapuntoventa,classes);//this.lineapuntoventaBean);									
				}
			
				if(LineaPuntoVentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLineaPuntoVenta(this.lineapuntoventa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaPuntoVenta(this.lineapuntoventa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.lineapuntoventaAnterior!=null) {
						this.lineapuntoventa=this.lineapuntoventaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineapuntoventaReturnGeneral=lineapuntoventaLogic.procesarEventosLineaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineapuntoventaLogic.getLineaPuntoVentas(),this.lineapuntoventa,this.lineapuntoventaParameterGeneral,this.isEsNuevoLineaPuntoVenta,classes);//this.lineapuntoventaLogic.getLineaPuntoVenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineapuntoventaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineapuntoventaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta(),lineapuntoventaLogic.getLineaPuntoVentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta(),this.lineapuntoventas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLineaPuntoVenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosLineaPuntoVenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLineaPuntoVenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosLineaPuntoVenta() throws Exception {
		
		LineaPuntoVentaModel lineapuntoventaModel=(LineaPuntoVentaModel)this.jTableDatosLineaPuntoVenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineapuntoventaModel.lineapuntoventas=this.lineapuntoventaLogic.getLineaPuntoVentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			lineapuntoventaModel.lineapuntoventas=this.lineapuntoventas;
		}
		
		
		((LineaPuntoVentaModel) this.jTableDatosLineaPuntoVenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLineaPuntoVenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlineapuntoventaAnterior(),this.lineapuntoventaLogic.getLineaPuntoVentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlineapuntoventaAnterior(),this.lineapuntoventas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLineaPuntoVenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
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
										
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineapuntoventa,new Object(),generalEntityParameterGeneral,this.lineapuntoventaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.lineapuntoventaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LineaPuntoVentaConstantesFunciones.getClassesRelationshipsOfLineaPuntoVenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LineaPuntoVentaConstantesFunciones.getClassesRelationshipsFromStringsOfLineaPuntoVenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLineaPuntoVenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LineaPuntoVentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineapuntoventa,new Object(),generalEntityParameterGeneral,this.lineapuntoventaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLineaPuntoVenta(LineaPuntoVentaBean lineapuntoventaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLineaPuntoVenta(ArrayList<Classe> classes,LineaPuntoVentaReturnGeneral lineapuntoventaReturnGeneral,LineaPuntoVentaBean lineapuntoventaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.lineapuntoventa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLineaPuntoVenta = new LineaPuntoVentaDetalleFormJInternalFrame(jDesktopPane,this.lineapuntoventaSessionBean.getConGuardarRelaciones(),this.lineapuntoventaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.setVisible(false);
		this.jInternalFrameDetalleFormLineaPuntoVenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.lineapuntoventaLogic=this.lineapuntoventaLogic;
		
		this.cargarCombosFrameForeignKeyLineaPuntoVenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaPuntoVenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaPuntoVenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLineaPuntoVenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLineaPuntoVenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaPuntoVenta"));
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarLineaPuntoVenta"));

		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaPuntoVenta"));
					
		this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemModificarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarLineaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaPuntoVenta"));
						
		this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemActualizarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarLineaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaPuntoVenta"));
								
		this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemEliminarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarLineaPuntoVenta"));
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaPuntoVenta"));
					
		this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemCancelarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaPuntoVenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemDetalleCerrarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaPuntoVenta"));		
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaPuntoVenta"));
		
		
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaPuntoVenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonidLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonesta_activoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoLineaPuntoVentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaPuntoVenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLineaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaPuntoVenta"));
		}
		
		this.jTableDatosLineaPuntoVenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLineaPuntoVenta"));
		
		this.jTableDatosLineaPuntoVenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLineaPuntoVenta"));
		
		this.jButtonNuevoLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoLineaPuntoVenta"));
		
		this.jButtonDuplicarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarLineaPuntoVenta"));
		
		this.jButtonCopiarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"CopiarLineaPuntoVenta"));
		
		this.jButtonVerFormLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"VerFormLineaPuntoVenta"));
		
		
		this.jButtonNuevoToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarLineaPuntoVenta"));
			
		this.jButtonDuplicarToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLineaPuntoVenta"));
			
		this.jMenuItemNuevoLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLineaPuntoVenta"));
			
		this.jMenuItemDuplicarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLineaPuntoVenta"));		
		
		
		this.jButtonNuevoRelacionesLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLineaPuntoVenta"));
		
		
		this.jButtonNuevoRelacionesToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLineaPuntoVenta"));
			
		this.jMenuItemNuevoRelacionesLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLineaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarLineaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonModificarToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaPuntoVenta"));
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemModificarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"ActualizarLineaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonActualizarToolBarLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaPuntoVenta"));
				
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemActualizarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarLineaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonEliminarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaPuntoVenta"));
						
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemEliminarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarLineaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonCancelarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaPuntoVenta"));
			
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemCancelarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaPuntoVenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLineaPuntoVenta"));		
		
		
		this.jButtonCerrarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarLineaPuntoVenta"));
		
		
		this.jButtonCerrarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarLineaPuntoVenta"));
			
		this.jMenuItemCerrarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLineaPuntoVenta"));
			
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jMenuItemDetalleCerrarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaPuntoVenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosLineaPuntoVenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaPuntoVenta"));
		}
		
		this.jButtonCopiarToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarLineaPuntoVenta"));
			
		this.jButtonVerFormToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarLineaPuntoVenta"));
		
		this.jMenuItemGuardarCambiosLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLineaPuntoVenta"));
			
		this.jMenuItemCopiarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLineaPuntoVenta"));		
		
		this.jMenuItemVerFormLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLineaPuntoVenta"));		
		
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaPuntoVenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLineaPuntoVenta"));
			
		this.jMenuItemGuardarCambiosTablaLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaPuntoVenta"));		
		
		
		
		this.jButtonRecargarInformacionLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionLineaPuntoVenta"));
					
		this.jButtonRecargarInformacionToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLineaPuntoVenta"));
		
		this.jMenuItemRecargarInformacionLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLineaPuntoVenta"));		
		
		
		
		this.jButtonAnterioresLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresLineaPuntoVenta"));
		
		
		this.jButtonAnterioresToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLineaPuntoVenta"));
		
		this.jMenuItemAnterioresLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLineaPuntoVenta"));		
		
		
		this.jButtonSiguientesLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesLineaPuntoVenta"));
		
		
		this.jButtonSiguientesToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLineaPuntoVenta"));
			
		this.jMenuItemSiguientesLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLineaPuntoVenta"));
			
		this.jMenuItemAbrirOrderByLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLineaPuntoVenta"));
			
		this.jMenuItemMostrarOcultarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLineaPuntoVenta"));
			
		this.jMenuItemDetalleAbrirOrderByLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLineaPuntoVenta"));
			
		this.jMenuItemDetalleMostarOcultarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLineaPuntoVenta"));		
		
		
		this.jButtonNuevoGuardarCambiosLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLineaPuntoVenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLineaPuntoVenta"));
			
		this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLineaPuntoVenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLineaPuntoVenta"));

		this.jCheckBoxSeleccionadosLineaPuntoVenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLineaPuntoVenta"));
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaPuntoVenta"));
		}
		
		
		this.jComboBoxTiposRelacionesLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesLineaPuntoVenta"));
			
		this.jComboBoxTiposAccionesLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposAccionesLineaPuntoVenta"));
					
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLineaPuntoVenta"));
			
		this.jTextFieldValorCampoGeneralLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLineaPuntoVenta"));		
		
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonidLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonesta_activoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoLineaPuntoVentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdLineaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaLineaPuntoVenta"));

			this.jButtonFK_IdLineaCategoriaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaCategoriaLineaPuntoVenta"));

			this.jButtonFK_IdLineaGrupoLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaGrupoLineaPuntoVenta"));

			this.jButtonFK_IdLineaMarcaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaMarcaLineaPuntoVenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLineaPuntoVenta!=null) {
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaPuntoVenta"));
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaPuntoVenta"));
				this.jInternalFrameReporteDinamicoLineaPuntoVenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaPuntoVenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaPuntoVenta"));				
			//this.jButtonGenerarReporteDinamicoLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaPuntoVenta"));
			//this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaPuntoVenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLineaPuntoVenta!=null) {
				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaPuntoVenta"));
				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaPuntoVenta"));
				this.jInternalFrameImportacionLineaPuntoVenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaPuntoVenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByLineaPuntoVenta"));
			
			this.jButtonAbrirOrderByToolBarLineaPuntoVenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLineaPuntoVenta"));			
			
			if(this.jInternalFrameOrderByLineaPuntoVenta!=null) {
				this.jInternalFrameOrderByLineaPuntoVenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaPuntoVenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaPuntoVenta.jTabbedPaneRelacionesLineaPuntoVenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaPuntoVenta"));
		
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
            		closingInternalFrameLineaPuntoVenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLineaPuntoVenta = (JInternalFrameBase)event.getSource();
	            	
	            LineaPuntoVentaBeanSwingJInternalFrame jInternalFrameParent=(LineaPuntoVentaBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaPuntoVenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLineaPuntoVentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLineaPuntoVenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLineaPuntoVentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLineaPuntoVenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLineaPuntoVenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLineaPuntoVenta";
		inputMap = this.jButtonNuevoLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLineaPuntoVenta";
		inputMap = this.jButtonNuevoRelacionesLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaPuntoVentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLineaPuntoVenta";
		inputMap = this.jButtonModificarLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLineaPuntoVenta";
		inputMap = this.jButtonActualizarLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLineaPuntoVenta";
		inputMap = this.jButtonEliminarLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLineaPuntoVenta";
		inputMap = this.jButtonCancelarLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLineaPuntoVenta";
		inputMap = this.jButtonCerrarLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLineaPuntoVenta";
		inputMap = this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonGuardarCambiosLineaPuntoVenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLineaPuntoVentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLineaPuntoVenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLineaPuntoVentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLineaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLineaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLineaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLineaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLineaPuntoVenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLineaPuntoVentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonidLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_empresaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_sucursalLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_lineaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_grupoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_categoriaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaLineaPuntoVentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonid_linea_marcaLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaLineaPuntoVentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaPuntoVenta.jButtonesta_activoLineaPuntoVentaBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoLineaPuntoVentaBusqueda"));
		
		
		this.jButtonFK_IdLineaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaLineaPuntoVenta"));

		this.jButtonFK_IdLineaCategoriaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaCategoriaLineaPuntoVenta"));

		this.jButtonFK_IdLineaGrupoLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaGrupoLineaPuntoVenta"));

		this.jButtonFK_IdLineaMarcaLineaPuntoVenta.addActionListener(new ButtonActionListener(this,"FK_IdLineaMarcaLineaPuntoVenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLineaPuntoVenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLineaPuntoVentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLineaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLineaPuntoVenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLineaPuntoVenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
					lineapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventas) {
					lineapuntoventaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLineaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
						lineapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventas) {
						lineapuntoventaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
					
						if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							lineapuntoventaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventas) {
						
						if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							lineapuntoventaAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLineaPuntoVentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLineaPuntoVenta.getSelectedRows();
			
			LineaPuntoVenta lineapuntoventaLocal=new LineaPuntoVenta();
			
			//this.seleccionarTodosLineaPuntoVenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineapuntoventaLocal =(LineaPuntoVenta) this.lineapuntoventaLogic.getLineaPuntoVentas().toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					lineapuntoventaLocal =(LineaPuntoVenta) this.lineapuntoventas.toArray()[this.jTableDatosLineaPuntoVenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				lineapuntoventaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
						lineapuntoventaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventas) {
						lineapuntoventaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaPuntoVenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaPuntoVenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaPuntoVenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLineaPuntoVentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLineaPuntoVentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLineaPuntoVentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLineaPuntoVenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventaLogic.getLineaPuntoVentas()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventas) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLineaPuntoVentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLineaPuntoVenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLineaPuntoVenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLineaPuntoVenta) {				
					conSplash=true;//false;										
					
					//this.startProcessLineaPuntoVenta(conSplash);
				
					this.generarReporteLineaPuntoVentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLineaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaPuntoVentasSeleccionados(false);
				//this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaPuntoVentasSeleccionados(true);
				//this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaPuntoVenta();
				
				this.exportarLineaPuntoVentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLineaPuntoVentas();
				//this.importarLineaPuntoVentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaPuntoVenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLineaPuntoVentasSeleccionados();
				//this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Linea Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLineaPuntoVenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLineaPuntoVenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLineaPuntoVenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
				}	
			} 			
			else if(LineaPuntoVentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLineaPuntoVenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLineaPuntoVenta(conSplash);
					
						//this.actualizarParametrosGeneralLineaPuntoVenta();
						
						this.generarReporteProcesoAccionLineaPuntoVentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LineaPuntoVentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Linea Punto VentaS SELECCIONADOS?", "MANTENIMIENTO DE Linea Punto Venta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLineaPuntoVenta();
				
						this.actualizarParametrosGeneralLineaPuntoVenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.lineapuntoventaReturnGeneral=lineapuntoventaLogic.procesarAccionLineaPuntoVentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.lineapuntoventaLogic.getLineaPuntoVentas(),this.lineapuntoventaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLineaPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLineaPuntoVenta();
					
					LineaPuntoVentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLineaPuntoVentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLineaPuntoVenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxTiposAccionesFormularioLineaPuntoVenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLineaPuntoVenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLineaPuntoVentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLineaPuntoVenta();
			
			if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
			LineaPuntoVenta lineapuntoventa=new LineaPuntoVenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLineaPuntoVenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLineaPuntoVenta.getSelectedItem();
			
			
			
			
			lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(lineapuntoventasSeleccionados.size()==1) {
				for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
					lineapuntoventa=lineapuntoventaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLineaPuntoVenta();
			
      		//this.finishProcessLineaPuntoVenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLineaPuntoVentaReturnGeneral() throws Exception {
		if(this.lineapuntoventaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.lineapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.lineapuntoventaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.lineapuntoventaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.lineapuntoventaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.lineapuntoventaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLineaPuntoVenta(false);
		}
		
		if(this.lineapuntoventaReturnGeneral.getConRetornoLista() || this.lineapuntoventaReturnGeneral.getConRetornoObjeto()) {
			if(this.lineapuntoventaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineapuntoventaLogic.setLineaPuntoVentas(this.lineapuntoventaReturnGeneral.getLineaPuntoVentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.lineapuntoventaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineapuntoventaLogic.setLineaPuntoVenta(this.lineapuntoventaReturnGeneral.getLineaPuntoVenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLineaPuntoVenta(false);
		}
	}
	
	public void actualizarParametrosGeneralLineaPuntoVenta() throws Exception {
		
		
	}
	
	public ArrayList<LineaPuntoVenta> getLineaPuntoVentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLineaPuntoVenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventaLogic.getLineaPuntoVentas()) {
					if(lineapuntoventaAux.getIsSelected()) {
						lineapuntoventasSeleccionados.add(lineapuntoventaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaPuntoVenta lineapuntoventaAux:this.lineapuntoventas) {
					if(lineapuntoventaAux.getIsSelected()) {
						lineapuntoventasSeleccionados.add(lineapuntoventaAux);				
					}
				}
			}
			
			if(lineapuntoventasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						lineapuntoventasSeleccionados.addAll(this.lineapuntoventaLogic.getLineaPuntoVentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						lineapuntoventasSeleccionados.addAll(this.lineapuntoventas);				
					}
				}
			}
		} else {
			lineapuntoventasSeleccionados.add(this.lineapuntoventa);
		}
		
		return lineapuntoventasSeleccionados;
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
	
	public void generarReporteLineaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLineaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLineaPuntoVentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaPuntoVentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaPuntoVentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Linea Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados);
		
	}	
	
	public void generarReporteNormalLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLineaPuntoVentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLineaPuntoVenta();
		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLineaPuntoVenta();
		
		
		//this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados ,lineapuntoventaImplementable,lineapuntoventaImplementableHome);
	}
	
	public void mostrarImportacionLineaPuntoVentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLineaPuntoVenta();
		
		this.abrirFrameImportacionLineaPuntoVenta();		
		
			
		//this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados ,lineapuntoventaImplementable,lineapuntoventaImplementableHome);
	}
	
	public void importarLineaPuntoVentas() throws Exception {		
	
	}
	
	public void exportarLineaPuntoVentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLineaPuntoVentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLineaPuntoVentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLineaPuntoVentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Linea Punto Venta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLineaPuntoVenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLineaPuntoVenta(lineapuntoventaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//lineapuntoventaAux.setsDetalleGeneralEntityReporte(lineapuntoventaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLineaPuntoVenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=lineapuntoventa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineapuntoventa.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LineaPuntoVentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLineaPuntoVenta(row);				
				iRow++;
			}				
			
			for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLineaPuntoVenta(lineapuntoventaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLineaPuntoVentasSeleccionados() throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();		
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineapuntoventa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("lineapuntoventas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("lineapuntoventa");
			//elementRoot.appendChild(element);
		
			for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
				element = document.createElement("lineapuntoventa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLineaPuntoVenta(lineapuntoventaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Punto Venta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLineaPuntoVenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineapuntoventa.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlLineaPuntoVenta(LineaPuntoVenta lineapuntoventa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LineaPuntoVentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(lineapuntoventa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LineaPuntoVentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(lineapuntoventa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(lineapuntoventa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(lineapuntoventa.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementlinea_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(lineapuntoventa.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(lineapuntoventa.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(lineapuntoventa.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(LineaPuntoVentaConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(lineapuntoventa.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementesta_activo = document.createElement(LineaPuntoVentaConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(lineapuntoventa.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoLineaPuntoVentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados=new ArrayList<LineaPuntoVenta>();
		
		lineapuntoventasSeleccionados=this.getLineaPuntoVentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLineaPuntoVenta(lineapuntoventasSeleccionados);
		
		this.generarReporteLineaPuntoVentas("Todos",lineapuntoventasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLineaPuntoVenta(ArrayList<LineaPuntoVenta> lineapuntoventasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LineaPuntoVenta lineapuntoventaAux:lineapuntoventasSeleccionados) {
				lineapuntoventaAux.setsDetalleGeneralEntityReporte(lineapuntoventaAux.toString());
			
				if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(lineapuntoventaAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaPuntoVentaConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					lineapuntoventaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(lineapuntoventaAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaPuntoVentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLineaPuntoVenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLineaPuntoVenta=true;
				this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=true;
				this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=true;
			}
			
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=true;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=true;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=true;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
			this.isVisibilidadCeldaModificarLineaPuntoVenta=true;
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
			this.isVisibilidadCeldaCancelarLineaPuntoVenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaPuntoVenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LineaPuntoVentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=true;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=true;
		} else {
			this.actualizarEstadoPanelsLineaPuntoVenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLineaPuntoVenta=false;
			//this.isVisibilidadCeldaVerFormLineaPuntoVenta=false;
			this.isVisibilidadCeldaDuplicarLineaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!lineapuntoventaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
		} else {
			this.isVisibilidadCeldaNuevoLineaPuntoVenta=false;
			this.isVisibilidadCeldaGuardarCambiosLineaPuntoVenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!lineapuntoventaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;												
			}
			
			this.jButtonCerrarLineaPuntoVenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLineaPuntoVenta=false;
		}
		
		if(!this.permiteMantenimiento(this.lineapuntoventa)) {
			this.isVisibilidadCeldaActualizarLineaPuntoVenta=false;
			this.isVisibilidadCeldaEliminarLineaPuntoVenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLineaPuntoVenta() {
	}
	
	public void actualizarEstadoPanelsLineaPuntoVenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLineaPuntoVenta!=null) {
				this.jScrollPanelDatosEdicionLineaPuntoVenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaPuntoVenta!=null) {
				this.jScrollPanelDatosLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaPuntoVenta!=null) {
				this.jPanelPaginacionLineaPuntoVenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
					this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.lineapuntoventaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaPuntoVenta!=null) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLineaPuntoVenta!=null) {
				this.jPanelParametrosReportesLineaPuntoVenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdLinea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdLinea=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdLinea=isParaLinea;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadFK_IdLinea=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaGrupo;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadFK_IdLinea=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaCategoria;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadFK_IdLinea=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLinea) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaCategoria=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLineaCategoria) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaCategoriaLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaGrupo=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdLineaGrupo) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaGrupoLineaPuntoVenta);}

			this.isVisibilidadFK_IdLineaMarca=isParaLineaMarca;
			if(!this.isVisibilidadFK_IdLineaMarca) {this.jTabbedPaneBusquedasLineaPuntoVenta.remove(jPanelFK_IdLineaMarcaLineaPuntoVenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LineaPuntoVentaSessionBean lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		
		if(this.lineapuntoventaSessionBean==null) {
			this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		}
		
		this.lineapuntoventaSessionBean.setsUltimaBusquedaLineaPuntoVenta(this.getsAccionBusqueda());
		this.lineapuntoventaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.lineapuntoventaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			lineapuntoventaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
			lineapuntoventaSessionBean.setid_linea(this.getid_lineaFK_IdLinea());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaCategoria")) {
			lineapuntoventaSessionBean.setid_linea_categoria(this.getid_linea_categoriaFK_IdLineaCategoria());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaGrupo")) {
			lineapuntoventaSessionBean.setid_linea_grupo(this.getid_linea_grupoFK_IdLineaGrupo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdLineaMarca")) {
			lineapuntoventaSessionBean.setid_linea_marca(this.getid_linea_marcaFK_IdLineaMarca());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			lineapuntoventaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LineaPuntoVentaSessionBean lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		
		if(this.lineapuntoventaSessionBean==null) {
			this.lineapuntoventaSessionBean=new LineaPuntoVentaSessionBean();
		}
		
		if(this.lineapuntoventaSessionBean.getsUltimaBusquedaLineaPuntoVenta()!=null&&!this.lineapuntoventaSessionBean.getsUltimaBusquedaLineaPuntoVenta().equals("")) {
			this.setsAccionBusqueda(lineapuntoventaSessionBean.getsUltimaBusquedaLineaPuntoVenta());
			this.setiNumeroPaginacion(lineapuntoventaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(lineapuntoventaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(lineapuntoventaSessionBean.getid_empresa());
				lineapuntoventaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLinea")) {
				this.setid_lineaFK_IdLinea(lineapuntoventaSessionBean.getid_linea());
				lineapuntoventaSessionBean.setid_linea(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaCategoria")) {
				this.setid_linea_categoriaFK_IdLineaCategoria(lineapuntoventaSessionBean.getid_linea_categoria());
				lineapuntoventaSessionBean.setid_linea_categoria(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaGrupo")) {
				this.setid_linea_grupoFK_IdLineaGrupo(lineapuntoventaSessionBean.getid_linea_grupo());
				lineapuntoventaSessionBean.setid_linea_grupo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdLineaMarca")) {
				this.setid_linea_marcaFK_IdLineaMarca(lineapuntoventaSessionBean.getid_linea_marca());
				lineapuntoventaSessionBean.setid_linea_marca(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(lineapuntoventaSessionBean.getid_sucursal());
				lineapuntoventaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.lineapuntoventaSessionBean.setsUltimaBusquedaLineaPuntoVenta("");
		this.lineapuntoventaSessionBean.setiNumeroPaginacion(LineaPuntoVentaConstantesFunciones.INUMEROPAGINACION);
		this.lineapuntoventaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLineaPuntoVenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLineaPuntoVenta() {
		this.updateBorderResaltarBusquedasFormularioLineaPuntoVenta();
		this.updateVisibilidadBusquedasFormularioLineaPuntoVenta();
		this.updateHabilitarBusquedasFormularioLineaPuntoVenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioLineaPuntoVenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLineaPuntoVenta.getComponents().length>0) {
	

		if(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaLineaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaLineaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaLineaPuntoVenta);
			}
		}

		if(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaLineaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaLineaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaLineaPuntoVenta);
			}
		}

		if(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoLineaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoLineaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoLineaPuntoVenta);
			}
		}

		if(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaLineaPuntoVenta!=null) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaLineaPuntoVenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaLineaPuntoVenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLineaPuntoVenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLineaPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaLineaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaLineaPuntoVenta);
			if(!this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaLineaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaLineaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaCategoriaLineaPuntoVenta);
			if(!this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaCategoriaLineaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoLineaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaGrupoLineaPuntoVenta);
			if(!this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaGrupoLineaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaLineaPuntoVenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaMarcaLineaPuntoVenta);
			if(!this.lineapuntoventaConstantesFunciones.mostrarFK_IdLineaMarcaLineaPuntoVenta && index>-1) {
				this.jTabbedPaneBusquedasLineaPuntoVenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLineaPuntoVenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLineaPuntoVenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaLineaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineapuntoventaConstantesFunciones.activarFK_IdLineaLineaPuntoVenta);
				this.jTabbedPaneBusquedasLineaPuntoVenta.setEnabledAt(index,this.lineapuntoventaConstantesFunciones.activarFK_IdLineaLineaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaLineaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineapuntoventaConstantesFunciones.activarFK_IdLineaCategoriaLineaPuntoVenta);
				this.jTabbedPaneBusquedasLineaPuntoVenta.setEnabledAt(index,this.lineapuntoventaConstantesFunciones.activarFK_IdLineaCategoriaLineaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoLineaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineapuntoventaConstantesFunciones.activarFK_IdLineaGrupoLineaPuntoVenta);
				this.jTabbedPaneBusquedasLineaPuntoVenta.setEnabledAt(index,this.lineapuntoventaConstantesFunciones.activarFK_IdLineaGrupoLineaPuntoVenta);
			}

			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaLineaPuntoVenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineapuntoventaConstantesFunciones.activarFK_IdLineaMarcaLineaPuntoVenta);
				this.jTabbedPaneBusquedasLineaPuntoVenta.setEnabledAt(index,this.lineapuntoventaConstantesFunciones.activarFK_IdLineaMarcaLineaPuntoVenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLineaPuntoVenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdLinea")) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaLineaPuntoVenta);

			this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);

			this.lineapuntoventaConstantesFunciones.setResaltarFK_IdLineaLineaPuntoVenta(resaltar);

			jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaLineaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaCategoria")) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaCategoriaLineaPuntoVenta);

			this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);

			this.lineapuntoventaConstantesFunciones.setResaltarFK_IdLineaCategoriaLineaPuntoVenta(resaltar);

			jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaCategoriaLineaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaGrupo")) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaGrupoLineaPuntoVenta);

			this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);

			this.lineapuntoventaConstantesFunciones.setResaltarFK_IdLineaGrupoLineaPuntoVenta(resaltar);

			jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaGrupoLineaPuntoVenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdLineaMarca")) {
			index= this.jTabbedPaneBusquedasLineaPuntoVenta.indexOfComponent(this.jPanelFK_IdLineaMarcaLineaPuntoVenta);

			this.jTabbedPaneBusquedasLineaPuntoVenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaPuntoVenta.getComponent(index);

			this.lineapuntoventaConstantesFunciones.setResaltarFK_IdLineaMarcaLineaPuntoVenta(resaltar);

			jPanel.setBorder(this.lineapuntoventaConstantesFunciones.resaltarFK_IdLineaMarcaLineaPuntoVenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLineaPuntoVenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLineaPuntoVenta() throws Exception {

		if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLineaPuntoVenta();
		this.updateVisibilidadResaltarControlesFormularioLineaPuntoVenta();
		this.updateHabilitarResaltarControlesFormularioLineaPuntoVenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioLineaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.lineapuntoventaConstantesFunciones.resaltaridLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltaridLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_empresaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_empresaLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_sucursalLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_sucursalLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_lineaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_lineaLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_linea_grupoLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_linea_grupoLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_linea_categoriaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_linea_categoriaLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltarid_linea_marcaLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltarid_linea_marcaLineaPuntoVenta);}
		if(this.lineapuntoventaConstantesFunciones.resaltaresta_activoLineaPuntoVenta!=null && this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setBorderPainted(true);this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setBorder(this.lineapuntoventaConstantesFunciones.resaltaresta_activoLineaPuntoVenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLineaPuntoVenta() throws Exception {		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
	
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostraridLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelidLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostraridLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_empresaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_empresaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_empresaLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_sucursalLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_sucursalLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_sucursalLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_lineaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_lineaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_lineaLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_grupoLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_linea_grupoLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_grupoLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_categoriaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_linea_categoriaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_categoriaLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_marcaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelid_linea_marcaLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostrarid_linea_marcaLineaPuntoVenta);
		//this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostraresta_activoLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jPanelesta_activoLineaPuntoVenta.setVisible(this.lineapuntoventaConstantesFunciones.mostraresta_activoLineaPuntoVenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLineaPuntoVenta() throws Exception {
		if(this.jInternalFrameDetalleFormLineaPuntoVenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaPuntoVenta!=null) {
	
		this.jInternalFrameDetalleFormLineaPuntoVenta.jLabelidLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activaridLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_empresaLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_empresaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_sucursalLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_sucursalLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_lineaLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_lineaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_grupoLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_linea_grupoLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_categoriaLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_linea_categoriaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jComboBoxid_linea_marcaLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activarid_linea_marcaLineaPuntoVenta);
		this.jInternalFrameDetalleFormLineaPuntoVenta.jCheckBoxesta_activoLineaPuntoVenta.setEnabled(this.lineapuntoventaConstantesFunciones.activaresta_activoLineaPuntoVenta);
		}
	}
	
		
}