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

//import com.bydan.erp.inventario.util.MovimientosDetalladosConstantesFunciones;
import com.bydan.erp.inventario.util.report.MovimientosDetalladosParameterReturnGeneral;
//import com.bydan.erp.inventario.util.report.MovimientosDetalladosParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.report.MovimientosDetalladosBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class MovimientosDetalladosBeanSwingJInternalFrame extends MovimientosDetalladosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MovimientosDetalladosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<MovimientosDetallados> movimientosdetalladosValidator = new ClassValidator<MovimientosDetallados>(MovimientosDetallados.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public MovimientosDetallados movimientosdetallados;	
	public MovimientosDetallados movimientosdetalladosAux;
	public MovimientosDetallados movimientosdetalladosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public MovimientosDetallados movimientosdetalladosTotales;
	public Long idMovimientosDetalladosActual;
	public Long iIdNuevoMovimientosDetallados=0L;
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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
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
	
	public Boolean isPermisoTodoMovimientosDetallados;
	public Boolean isPermisoNuevoMovimientosDetallados;
	public Boolean isPermisoActualizarMovimientosDetallados;
	public Boolean isPermisoActualizarOriginalMovimientosDetallados;
	public Boolean isPermisoEliminarMovimientosDetallados;
	public Boolean isPermisoGuardarCambiosMovimientosDetallados;
	public Boolean isPermisoConsultaMovimientosDetallados;
	public Boolean isPermisoBusquedaMovimientosDetallados;
	public Boolean isPermisoReporteMovimientosDetallados;
	public Boolean isPermisoPaginacionMedioMovimientosDetallados;
	public Boolean isPermisoPaginacionAltoMovimientosDetallados;
	public Boolean isPermisoPaginacionTodoMovimientosDetallados;
	public Boolean isPermisoCopiarMovimientosDetallados;
	public Boolean isPermisoVerFormMovimientosDetallados;
	public Boolean isPermisoDuplicarMovimientosDetallados;
	public Boolean isPermisoOrdenMovimientosDetallados;
	
	
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
	
	public MovimientosDetalladosParameterReturnGeneral movimientosdetalladosReturnGeneral;
	public MovimientosDetalladosParameterReturnGeneral movimientosdetalladosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMovimientosDetallados=false;
	public Boolean esParaAccionDesdeFormularioMovimientosDetallados=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected MovimientosDetalladosSessionBeanAdditional movimientosdetalladosSessionBeanAdditional=null;
	
	public MovimientosDetalladosSessionBeanAdditional getMovimientosDetalladosSessionBeanAdditional() {
		return this.movimientosdetalladosSessionBeanAdditional;
	}
	
	public void setMovimientosDetalladosSessionBeanAdditional(MovimientosDetalladosSessionBeanAdditional movimientosdetalladosSessionBeanAdditional) {
		try {
			this.movimientosdetalladosSessionBeanAdditional=movimientosdetalladosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected MovimientosDetalladosBeanSwingJInternalFrameAdditional movimientosdetalladosBeanSwingJInternalFrameAdditional=null;
	//public class MovimientosDetalladosBeanSwingJInternalFrame
	
	public MovimientosDetalladosBeanSwingJInternalFrameAdditional getMovimientosDetalladosBeanSwingJInternalFrameAdditional() {
		return this.movimientosdetalladosBeanSwingJInternalFrameAdditional;
	}
	
	public void setMovimientosDetalladosBeanSwingJInternalFrameAdditional(MovimientosDetalladosBeanSwingJInternalFrameAdditional movimientosdetalladosBeanSwingJInternalFrameAdditional) {
		try {
			this.movimientosdetalladosBeanSwingJInternalFrameAdditional=movimientosdetalladosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public MovimientosDetalladosLogic movimientosdetalladosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public MovimientosDetallados movimientosdetalladosBean;
	public MovimientosDetalladosConstantesFunciones movimientosdetalladosConstantesFunciones;
	//public MovimientosDetalladosParameterReturnGeneral movimientosdetalladosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public TransaccionLogic transaccionLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	
	//PARAMETROS
	
	
	//public List<MovimientosDetallados> movimientosdetalladoss;	
	//public List<MovimientosDetallados> movimientosdetalladossEliminados;
	//public List<MovimientosDetallados> movimientosdetalladossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaDuplicarMovimientosDetallados=true;
	public Boolean isVisibilidadCeldaCopiarMovimientosDetallados=true;
	public Boolean isVisibilidadCeldaVerFormMovimientosDetallados=true;
	public Boolean isVisibilidadCeldaOrdenMovimientosDetallados=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaModificarMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaActualizarMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaEliminarMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaCancelarMovimientosDetallados=false;
	public Boolean isVisibilidadCeldaGuardarMovimientosDetallados=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;	
	
	
	public Boolean isVisibilidadBusquedaMovimientosDetallados=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	
	public Long getiIdNuevoMovimientosDetallados() {
		return this.iIdNuevoMovimientosDetallados;
	}

	public void setiIdNuevoMovimientosDetallados(Long iIdNuevoMovimientosDetallados) {
		this.iIdNuevoMovimientosDetallados = iIdNuevoMovimientosDetallados;
	}
	
	public Long getidMovimientosDetalladosActual() {
		return this.idMovimientosDetalladosActual;
	}

	public void setidMovimientosDetalladosActual(Long idMovimientosDetalladosActual) {
		this.idMovimientosDetalladosActual = idMovimientosDetalladosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public MovimientosDetallados getmovimientosdetallados() {
		return this.movimientosdetallados;
	}

	public void setmovimientosdetallados(MovimientosDetallados movimientosdetallados) {
		this.movimientosdetallados = movimientosdetallados;
	}
	
	public MovimientosDetallados getmovimientosdetalladosAux() {
		return this.movimientosdetalladosAux;
	}

	public void setmovimientosdetalladosAux(MovimientosDetallados movimientosdetalladosAux) {
		this.movimientosdetalladosAux = movimientosdetalladosAux;
	}				
	
	public MovimientosDetallados getmovimientosdetalladosAnterior() {
		return this.movimientosdetalladosAnterior;
	}

	public void setmovimientosdetalladosAnterior(MovimientosDetallados movimientosdetalladosAnterior) {
		this.movimientosdetalladosAnterior = movimientosdetalladosAnterior;
	}	
	
	public MovimientosDetallados getmovimientosdetalladosTotales() {
		return this.movimientosdetalladosTotales;
	}

	public void setmovimientosdetalladosTotales(MovimientosDetallados movimientosdetalladosTotales) {
		this.movimientosdetalladosTotales = movimientosdetalladosTotales;
	}	
	
	public MovimientosDetallados getmovimientosdetalladosBean() {
		return this.movimientosdetalladosBean;
	}

	public void setmovimientosdetalladosBean(MovimientosDetallados movimientosdetalladosBean) {
		this.movimientosdetalladosBean = movimientosdetalladosBean;
	}	
	
	public MovimientosDetalladosParameterReturnGeneral getmovimientosdetalladosReturnGeneral() {
		return this.movimientosdetalladosReturnGeneral;
	}

	public void setmovimientosdetalladosReturnGeneral(MovimientosDetalladosParameterReturnGeneral movimientosdetalladosReturnGeneral) {
		this.movimientosdetalladosReturnGeneral = movimientosdetalladosReturnGeneral;
	}	
	
	
	public Long id_clienteBusquedaMovimientosDetallados=-1L;

	public Long getid_clienteBusquedaMovimientosDetallados() {
		return this.id_clienteBusquedaMovimientosDetallados;
	}

	public void setid_clienteBusquedaMovimientosDetallados(Long id_clienteBusquedaMovimientosDetallados) {
		this.id_clienteBusquedaMovimientosDetallados = id_clienteBusquedaMovimientosDetallados;
	}

;
	public Long id_transaccionBusquedaMovimientosDetallados=-1L;

	public Long getid_transaccionBusquedaMovimientosDetallados() {
		return this.id_transaccionBusquedaMovimientosDetallados;
	}

	public void setid_transaccionBusquedaMovimientosDetallados(Long id_transaccionBusquedaMovimientosDetallados) {
		this.id_transaccionBusquedaMovimientosDetallados = id_transaccionBusquedaMovimientosDetallados;
	}

;
	public Long id_lineaBusquedaMovimientosDetallados=-1L;

	public Long getid_lineaBusquedaMovimientosDetallados() {
		return this.id_lineaBusquedaMovimientosDetallados;
	}

	public void setid_lineaBusquedaMovimientosDetallados(Long id_lineaBusquedaMovimientosDetallados) {
		this.id_lineaBusquedaMovimientosDetallados = id_lineaBusquedaMovimientosDetallados;
	}

;
	public Long id_linea_grupoBusquedaMovimientosDetallados=-1L;

	public Long getid_linea_grupoBusquedaMovimientosDetallados() {
		return this.id_linea_grupoBusquedaMovimientosDetallados;
	}

	public void setid_linea_grupoBusquedaMovimientosDetallados(Long id_linea_grupoBusquedaMovimientosDetallados) {
		this.id_linea_grupoBusquedaMovimientosDetallados = id_linea_grupoBusquedaMovimientosDetallados;
	}

;
	public Long id_linea_categoriaBusquedaMovimientosDetallados=-1L;

	public Long getid_linea_categoriaBusquedaMovimientosDetallados() {
		return this.id_linea_categoriaBusquedaMovimientosDetallados;
	}

	public void setid_linea_categoriaBusquedaMovimientosDetallados(Long id_linea_categoriaBusquedaMovimientosDetallados) {
		this.id_linea_categoriaBusquedaMovimientosDetallados = id_linea_categoriaBusquedaMovimientosDetallados;
	}

;
	public Long id_linea_marcaBusquedaMovimientosDetallados=-1L;

	public Long getid_linea_marcaBusquedaMovimientosDetallados() {
		return this.id_linea_marcaBusquedaMovimientosDetallados;
	}

	public void setid_linea_marcaBusquedaMovimientosDetallados(Long id_linea_marcaBusquedaMovimientosDetallados) {
		this.id_linea_marcaBusquedaMovimientosDetallados = id_linea_marcaBusquedaMovimientosDetallados;
	}

;
	public Date fecha_emision_desdeBusquedaMovimientosDetallados=new Date();

	public Date getfecha_emision_desdeBusquedaMovimientosDetallados() {
		return this.fecha_emision_desdeBusquedaMovimientosDetallados;
	}

	public void setfecha_emision_desdeBusquedaMovimientosDetallados(Date fecha_emision_desdeBusquedaMovimientosDetallados) {
		this.fecha_emision_desdeBusquedaMovimientosDetallados = fecha_emision_desdeBusquedaMovimientosDetallados;
	}

;
	public Date fecha_emision_hastaBusquedaMovimientosDetallados=new Date();

	public Date getfecha_emision_hastaBusquedaMovimientosDetallados() {
		return this.fecha_emision_hastaBusquedaMovimientosDetallados;
	}

	public void setfecha_emision_hastaBusquedaMovimientosDetallados(Date fecha_emision_hastaBusquedaMovimientosDetallados) {
		this.fecha_emision_hastaBusquedaMovimientosDetallados = fecha_emision_hastaBusquedaMovimientosDetallados;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MovimientosDetalladosLogic getMovimientosDetalladosLogic()	{		
		return movimientosdetalladosLogic;
	}

	public void setMovimientosDetalladosLogic(MovimientosDetalladosLogic movimientosdetalladosLogic) {
		this.movimientosdetalladosLogic = movimientosdetalladosLogic;
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
	
	public Boolean getIsEsNuevoMovimientosDetallados() {
		return isEsNuevoMovimientosDetallados;
	}

	public void setIsEsNuevoMovimientosDetallados(Boolean isEsNuevoMovimientosDetallados) {
		this.isEsNuevoMovimientosDetallados = isEsNuevoMovimientosDetallados;
	}

	public Boolean getEsParaAccionDesdeFormularioMovimientosDetallados() {
		return esParaAccionDesdeFormularioMovimientosDetallados;
	}
	
	public void setEsParaAccionDesdeFormularioMovimientosDetallados(Boolean esParaAccionDesdeFormularioMovimientosDetallados) {
		this.esParaAccionDesdeFormularioMovimientosDetallados = esParaAccionDesdeFormularioMovimientosDetallados;
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidEmpresaActual());
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidLineaActual());
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidLineaGrupoActual());
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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
					lineaLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidLineaCategoriaActual());
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

			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
					lineaLogic.getEntityWithConnection(movimientosdetalladosSessionBean.getlidLineaMarcaActual());
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaMovimientosDetallados.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_empresaMovimientosDetalladosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaMovimientosDetalladosGenerico!=null && jComboBoxid_empresaMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_empresaMovimientosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalMovimientosDetallados.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_sucursalMovimientosDetalladosGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalMovimientosDetalladosGenerico!=null && jComboBoxid_sucursalMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_sucursalMovimientosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteMovimientosDetallados.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteMovimientosDetalladosGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteMovimientosDetalladosGenerico!=null && jComboBoxid_clienteMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_clienteMovimientosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionMovimientosDetallados.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionMovimientosDetalladosGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionMovimientosDetalladosGenerico!=null && jComboBoxid_transaccionMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_transaccionMovimientosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaMovimientosDetallados.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineaTemp!=null && jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineaTemp);
					} else {
						if(jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineaTemp);
							if(jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_lineaMovimientosDetalladosGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaMovimientosDetalladosGenerico!=null && jComboBoxid_lineaMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_lineaMovimientosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoMovimientosDetallados.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineagrupoTemp!=null && jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineagrupoTemp);
					} else {
						if(jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineagrupoTemp);
							if(jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_linea_grupoMovimientosDetalladosGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoMovimientosDetalladosGenerico!=null && jComboBoxid_linea_grupoMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoMovimientosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineacategoriaTemp!=null && jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineacategoriaTemp);
					} else {
						if(jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineacategoriaTemp);
							if(jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_linea_categoriaMovimientosDetalladosGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaMovimientosDetalladosGenerico!=null && jComboBoxid_linea_categoriaMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaMovimientosDetalladosGenerico.setSelectedIndex(0);
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

					if(this.movimientosdetallados!=null) {
						this.movimientosdetallados.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaMovimientosDetallados.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.getItemCount()>0) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){
					if(lineamarcaTemp!=null && jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
						jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineamarcaTemp);
					} else {
						if(jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
							//jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineamarcaTemp);
							if(jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.getItemCount()>0) {
								jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(0);
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
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaMovimientosDetalladosGenerico)throws Exception
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
				jComboBoxid_linea_marcaMovimientosDetalladosGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaMovimientosDetalladosGenerico!=null && jComboBoxid_linea_marcaMovimientosDetalladosGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaMovimientosDetalladosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_empresaMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaMovimientosDetalladosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				movimientosdetallados.setid_empresa(empresaAux.getId());
				movimientosdetallados.setempresa_descripcion(MovimientosDetalladosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				movimientosdetallados.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_sucursalMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalMovimientosDetalladosGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				movimientosdetallados.setid_sucursal(sucursalAux.getId());
				movimientosdetallados.setsucursal_descripcion(MovimientosDetalladosConstantesFunciones.getSucursalDescripcion(sucursalAux));
				movimientosdetallados.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_clienteMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteMovimientosDetalladosGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				movimientosdetallados.setid_cliente(clienteAux.getId());
				movimientosdetallados.setcliente_descripcion(MovimientosDetalladosConstantesFunciones.getClienteDescripcion(clienteAux));
				movimientosdetallados.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_transaccionMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionMovimientosDetalladosGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				movimientosdetallados.setid_transaccion(transaccionAux.getId());
				movimientosdetallados.settransaccion_descripcion(MovimientosDetalladosConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				movimientosdetallados.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_lineaMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaMovimientosDetalladosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				movimientosdetallados.setid_linea(lineaAux.getId());
				movimientosdetallados.setlinea_descripcion(MovimientosDetalladosConstantesFunciones.getLineaDescripcion(lineaAux));
				movimientosdetallados.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_linea_grupoMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoMovimientosDetalladosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				movimientosdetallados.setid_linea_grupo(lineaAux.getId());
				movimientosdetallados.setlineagrupo_descripcion(MovimientosDetalladosConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				movimientosdetallados.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_linea_categoriaMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaMovimientosDetalladosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				movimientosdetallados.setid_linea_categoria(lineaAux.getId());
				movimientosdetallados.setlineacategoria_descripcion(MovimientosDetalladosConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				movimientosdetallados.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(MovimientosDetallados movimientosdetallados,JComboBox jComboBoxid_linea_marcaMovimientosDetalladosGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaMovimientosDetalladosGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaMovimientosDetalladosGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				movimientosdetallados.setid_linea_marca(lineaAux.getId());
				movimientosdetallados.setlineamarca_descripcion(MovimientosDetalladosConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				movimientosdetallados.setLineaMarca(lineaAux);			}
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.addItem(cliente);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.addItem(transaccion);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.addItem(linea);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.addItem(lineagrupo);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.addItem(lineacategoria);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { 
					}

					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaMovimientosDetallados") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.addItem(lineamarca);
							}
						}

						if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(linea);
						} else {
							this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineagrupo);
						} else {
							this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineacategoria);
						} else {
							this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedItem(lineamarca);
						} else {
							this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesMovimientosDetallados() throws Exception {
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
		
	public MovimientosDetalladosParameterReturnGeneral getMovimientosDetalladosParameterGeneral() {
		return this.movimientosdetalladosParameterGeneral;
	}
	
	public void setMovimientosDetalladosParameterGeneral(MovimientosDetalladosParameterReturnGeneral movimientosdetalladosParameterGeneral) {
		this.movimientosdetalladosParameterGeneral = movimientosdetalladosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMovimientosDetallados() {
		return isPermisoTodoMovimientosDetallados;
	}

	public void setIsPermisoTodoMovimientosDetallados(Boolean isPermisoTodoMovimientosDetallados) {
		this.isPermisoTodoMovimientosDetallados = isPermisoTodoMovimientosDetallados;
	}

	public Boolean getIsPermisoNuevoMovimientosDetallados() {
		return isPermisoNuevoMovimientosDetallados;
	}

	public void setIsPermisoNuevoMovimientosDetallados(Boolean isPermisoNuevoMovimientosDetallados) {
		this.isPermisoNuevoMovimientosDetallados = isPermisoNuevoMovimientosDetallados;
	}

	public Boolean getIsPermisoActualizarMovimientosDetallados() {
		return isPermisoActualizarMovimientosDetallados;
	}

	public void setIsPermisoActualizarMovimientosDetallados(Boolean isPermisoActualizarMovimientosDetallados) {
		this.isPermisoActualizarMovimientosDetallados = isPermisoActualizarMovimientosDetallados;
	}

	public Boolean getIsPermisoEliminarMovimientosDetallados() {
		return isPermisoEliminarMovimientosDetallados;
	}

	public void setIsPermisoEliminarMovimientosDetallados(Boolean isPermisoEliminarMovimientosDetallados) {
		this.isPermisoEliminarMovimientosDetallados = isPermisoEliminarMovimientosDetallados;
	}

	public Boolean getIsPermisoGuardarCambiosMovimientosDetallados() {
		return isPermisoGuardarCambiosMovimientosDetallados;
	}

	public void setIsPermisoGuardarCambiosMovimientosDetallados(Boolean isPermisoGuardarCambiosMovimientosDetallados) {
		this.isPermisoGuardarCambiosMovimientosDetallados = isPermisoGuardarCambiosMovimientosDetallados;
	}
	
	public Boolean getIsPermisoConsultaMovimientosDetallados() {
		return isPermisoConsultaMovimientosDetallados;
	}

	public void setIsPermisoConsultaMovimientosDetallados(Boolean isPermisoConsultaMovimientosDetallados) {
		this.isPermisoConsultaMovimientosDetallados = isPermisoConsultaMovimientosDetallados;
	}

	public Boolean getIsPermisoBusquedaMovimientosDetallados() {
		return isPermisoBusquedaMovimientosDetallados;
	}

	public void setIsPermisoBusquedaMovimientosDetallados(Boolean isPermisoBusquedaMovimientosDetallados) {
		this.isPermisoBusquedaMovimientosDetallados = isPermisoBusquedaMovimientosDetallados;
	}

	public Boolean getIsPermisoReporteMovimientosDetallados() {
		return isPermisoReporteMovimientosDetallados;
	}

	public void setIsPermisoReporteMovimientosDetallados(Boolean isPermisoReporteMovimientosDetallados) {
		this.isPermisoReporteMovimientosDetallados = isPermisoReporteMovimientosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionMedioMovimientosDetallados() {
		return isPermisoPaginacionMedioMovimientosDetallados;
	}

	public void setIsPermisoPaginacionMedioMovimientosDetallados(Boolean isPermisoPaginacionMedioMovimientosDetallados) {
		this.isPermisoPaginacionMedioMovimientosDetallados = isPermisoPaginacionMedioMovimientosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionTodoMovimientosDetallados() {
		return isPermisoPaginacionTodoMovimientosDetallados;
	}

	public void setIsPermisoPaginacionTodoMovimientosDetallados(Boolean isPermisoPaginacionTodoMovimientosDetallados) {
		this.isPermisoPaginacionTodoMovimientosDetallados = isPermisoPaginacionTodoMovimientosDetallados;
	}
	
	public Boolean getIsPermisoPaginacionAltoMovimientosDetallados() {
		return isPermisoPaginacionAltoMovimientosDetallados;
	}

	public void setIsPermisoPaginacionAltoMovimientosDetallados(Boolean isPermisoPaginacionAltoMovimientosDetallados) {
		this.isPermisoPaginacionAltoMovimientosDetallados = isPermisoPaginacionAltoMovimientosDetallados;
	}
	
	public Boolean getIsPermisoCopiarMovimientosDetallados() {
		return isPermisoCopiarMovimientosDetallados;
	}

	public void setIsPermisoCopiarMovimientosDetallados(Boolean isPermisoCopiarMovimientosDetallados) {
		this.isPermisoCopiarMovimientosDetallados = isPermisoCopiarMovimientosDetallados;
	}
	
	public Boolean getIsPermisoVerFormMovimientosDetallados() {
		return isPermisoVerFormMovimientosDetallados;
	}

	public void setIsPermisoVerFormMovimientosDetallados(Boolean isPermisoVerFormMovimientosDetallados) {
		this.isPermisoVerFormMovimientosDetallados = isPermisoVerFormMovimientosDetallados;
	}
	
	public Boolean getIsPermisoDuplicarMovimientosDetallados() {
		return isPermisoDuplicarMovimientosDetallados;
	}

	public void setIsPermisoDuplicarMovimientosDetallados(Boolean isPermisoDuplicarMovimientosDetallados) {
		this.isPermisoDuplicarMovimientosDetallados = isPermisoDuplicarMovimientosDetallados;
	}
	
	public Boolean getIsPermisoOrdenMovimientosDetallados() {
		return isPermisoOrdenMovimientosDetallados;
	}

	public void setIsPermisoOrdenMovimientosDetallados(Boolean isPermisoOrdenMovimientosDetallados) {
		this.isPermisoOrdenMovimientosDetallados = isPermisoOrdenMovimientosDetallados;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMovimientosDetallados() {
		return isVisibilidadCeldaNuevoMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaNuevoMovimientosDetallados(Boolean isVisibilidadCeldaNuevoMovimientosDetallados) {
		this.isVisibilidadCeldaNuevoMovimientosDetallados = isVisibilidadCeldaNuevoMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMovimientosDetallados() {
		return isVisibilidadCeldaDuplicarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaDuplicarMovimientosDetallados(Boolean isVisibilidadCeldaDuplicarMovimientosDetallados) {
		this.isVisibilidadCeldaDuplicarMovimientosDetallados = isVisibilidadCeldaDuplicarMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMovimientosDetallados() {
		return isVisibilidadCeldaCopiarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaCopiarMovimientosDetallados(Boolean isVisibilidadCeldaCopiarMovimientosDetallados) {
		this.isVisibilidadCeldaCopiarMovimientosDetallados = isVisibilidadCeldaCopiarMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMovimientosDetallados() {
		return isVisibilidadCeldaVerFormMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaVerFormMovimientosDetallados(Boolean isVisibilidadCeldaVerFormMovimientosDetallados) {
		this.isVisibilidadCeldaVerFormMovimientosDetallados = isVisibilidadCeldaVerFormMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMovimientosDetallados() {
		return isVisibilidadCeldaOrdenMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaOrdenMovimientosDetallados(Boolean isVisibilidadCeldaOrdenMovimientosDetallados) {
		this.isVisibilidadCeldaOrdenMovimientosDetallados = isVisibilidadCeldaOrdenMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMovimientosDetallados() {
		return isVisibilidadCeldaNuevoRelacionesMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMovimientosDetallados(Boolean isVisibilidadCeldaNuevoRelacionesMovimientosDetallados) {
		this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados = isVisibilidadCeldaNuevoRelacionesMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMovimientosDetallados() {
		return isVisibilidadCeldaModificarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaModificarMovimientosDetallados(Boolean isVisibilidadCeldaModificarMovimientosDetallados) {
		this.isVisibilidadCeldaModificarMovimientosDetallados = isVisibilidadCeldaModificarMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMovimientosDetallados() {
		return isVisibilidadCeldaActualizarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaActualizarMovimientosDetallados(Boolean isVisibilidadCeldaActualizarMovimientosDetallados) {
		this.isVisibilidadCeldaActualizarMovimientosDetallados = isVisibilidadCeldaActualizarMovimientosDetallados;
	}

	public Boolean getIsVisibilidadCeldaEliminarMovimientosDetallados() {
		return isVisibilidadCeldaEliminarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaEliminarMovimientosDetallados(Boolean isVisibilidadCeldaEliminarMovimientosDetallados) {
		this.isVisibilidadCeldaEliminarMovimientosDetallados = isVisibilidadCeldaEliminarMovimientosDetallados;
	}

	public Boolean getIsVisibilidadCeldaCancelarMovimientosDetallados() {
		return isVisibilidadCeldaCancelarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaCancelarMovimientosDetallados(Boolean isVisibilidadCeldaCancelarMovimientosDetallados) {
		this.isVisibilidadCeldaCancelarMovimientosDetallados = isVisibilidadCeldaCancelarMovimientosDetallados;
	}

	public Boolean getIsVisibilidadCeldaGuardarMovimientosDetallados() {
		return isVisibilidadCeldaGuardarMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaGuardarMovimientosDetallados(Boolean isVisibilidadCeldaGuardarMovimientosDetallados) {
		this.isVisibilidadCeldaGuardarMovimientosDetallados = isVisibilidadCeldaGuardarMovimientosDetallados;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMovimientosDetallados() {
		return isVisibilidadCeldaGuardarCambiosMovimientosDetallados;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMovimientosDetallados(Boolean isVisibilidadCeldaGuardarCambiosMovimientosDetallados) {
		this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados = isVisibilidadCeldaGuardarCambiosMovimientosDetallados;
	}
		
	public MovimientosDetalladosSessionBean getmovimientosdetalladosSessionBean() {
		return this.movimientosdetalladosSessionBean;
	}
	
	public void setmovimientosdetalladosSessionBean(MovimientosDetalladosSessionBean movimientosdetalladosSessionBean) {
		this.movimientosdetalladosSessionBean=movimientosdetalladosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaMovimientosDetallados() {
		return this.isVisibilidadBusquedaMovimientosDetallados;
	}

	public void setisVisibilidadBusquedaMovimientosDetallados(Boolean isVisibilidadBusquedaMovimientosDetallados) {
		this.isVisibilidadBusquedaMovimientosDetallados=isVisibilidadBusquedaMovimientosDetallados;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
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

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(MovimientosDetallados movimientosdetallados)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarSucursalForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarClienteForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarTransaccionForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarLineaForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarLineaGrupoForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(movimientosdetallados,null);
				this.setActualParaGuardarLineaMarcaForeignKey(movimientosdetallados,null);
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
	
	public void bugActualizarReferenciaActual(MovimientosDetallados movimientosdetallados,MovimientosDetallados movimientosdetalladosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMovimientosDetallados(movimientosdetallados);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		movimientosdetalladosAux.setId(movimientosdetallados.getId());
		movimientosdetalladosAux.setVersionRow(movimientosdetallados.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(MovimientosDetallados movimientosdetalladosLocal) throws Exception {
		
		if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(MovimientosDetallados movimientosdetalladosLocal) throws Exception {	
		if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				movimientosdetalladosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				movimientosdetalladosLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				movimientosdetalladosLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				movimientosdetalladosLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				movimientosdetalladosLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				movimientosdetalladosLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				movimientosdetalladosLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				movimientosdetalladosLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarMovimientosDetalladosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = movimientosdetalladosValidator.getInvalidValues(this.movimientosdetallados);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(MovimientosDetallados movimientosdetallados,List<MovimientosDetallados> movimientosdetalladoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(MovimientosDetallados movimientosdetallados,List<MovimientosDetallados> movimientosdetalladoss) throws Exception {
		try	{			
			MovimientosDetalladosConstantesFunciones.actualizarSelectedLista(movimientosdetallados,movimientosdetalladoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<MovimientosDetallados> movimientosdetalladossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				movimientosdetalladossLocal=this.movimientosdetalladosLogic.getMovimientosDetalladoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				movimientosdetalladossLocal=this.movimientosdetalladoss;
			}
			//ARCHITECTURE
		
			for(MovimientosDetallados movimientosdetalladosLocal:movimientosdetalladossLocal) {
				if(this.permiteMantenimiento(movimientosdetalladosLocal) && movimientosdetalladosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MovimientosDetalladosConstantesFunciones.getMovimientosDetalladosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NOMBRESUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_sucursalMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_completo_clienteMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NOMBRETRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_transaccionMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_comprobanteMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_facturaMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NUMEROSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_secuencialMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelfecha_emisionMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NOMBREPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_productoMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.NOMBREUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_unidadMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcantidadMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelivaMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.COSTOUNITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_unitarioMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.COSTOTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_totalMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabeliceMovimientosDetallados,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(MovimientosDetalladosConstantesFunciones.CODIGOPRODUCTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcodigo_productoMovimientosDetallados,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_sucursalMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_completo_clienteMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_transaccionMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_comprobanteMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_facturaMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_secuencialMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelfecha_emisionMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_productoMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_unidadMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcantidadMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelivaMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_unitarioMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_totalMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabeliceMovimientosDetallados,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcodigo_productoMovimientosDetallados,"");
		
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
		this.iIdNuevoMovimientosDetallados--;	
		
		
		this.movimientosdetalladosAux=new MovimientosDetallados();
		
		this.movimientosdetalladosAux.setId(this.iIdNuevoMovimientosDetallados);
		this.movimientosdetalladosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.movimientosdetalladosLogic.getMovimientosDetalladoss().add(this.movimientosdetalladosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.movimientosdetalladoss.add(this.movimientosdetalladosAux);
		}
		//ARCHITECTURE
		
		this.movimientosdetallados=this.movimientosdetalladosAux;
		
		if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetallados);
			this.setVariablesObjetoActualToFormularioForeignKeyMovimientosDetallados(this.movimientosdetallados);
		}
				
		//this.setDefaultControlesMovimientosDetallados();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMovimientosDetallados();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMovimientosDetallados();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosDetallados();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMovimientosDetallados(this.movimientosdetalladosBean,this.movimientosdetallados,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMovimientosDetallados(this.movimientosdetalladosReturnGeneral,this.movimientosdetalladosBean,false);
		
		if(this.movimientosdetalladosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados());
		}
		
		if(this.movimientosdetalladosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados(),classes);//this.movimientosdetalladosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMovimientosDetallados();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMovimientosDetallados();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.RecargarFormMovimientosDetallados(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMovimientosDetallados(false);
						
			if(movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosDetallados();
			}
			
			this.actualizarVisualTableDatosMovimientosDetallados();
			
			this.jTableDatosMovimientosDetallados.setRowSelectionInterval(this.getIndiceNuevoMovimientosDetallados(), this.getIndiceNuevoMovimientosDetallados());
			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
						
			this.actualizarEstadoCeldasBotonesMovimientosDetallados("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMovimientosDetallados(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_desdeMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarfecha_emision_desdeMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_hastaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarfecha_emision_hastaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnombre_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnombre_completo_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnombre_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnumero_comprobanteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnumero_facturaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnumero_secuencialMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarfecha_emisionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnombre_productoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarnombre_unidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarcantidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarivaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarcosto_unitarioMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarcosto_totalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activariceMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarcodigo_productoMovimientosDetallados);	
		//
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_empresaMovimientosDetallados);//
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_lineaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_linea_grupoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_linea_categoriaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setEnabled(isHabilitar && this.movimientosdetalladosConstantesFunciones.activarid_linea_marcaMovimientosDetallados);
	};
	
	public void setDefaultControlesMovimientosDetallados() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMovimientosDetallados(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.movimientosdetalladosSessionBean.setConGuardarRelaciones(true);			
			this.movimientosdetalladosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.setVisible(true);
			
					
		} else {
			//this.movimientosdetalladosSessionBean.setConGuardarRelaciones(false);			
			this.movimientosdetalladosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMovimientosDetallados() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				if(movimientosdetalladosAux.getId().equals(this.iIdNuevoMovimientosDetallados)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladoss) {
				if(movimientosdetalladosAux.getId().equals(this.iIdNuevoMovimientosDetallados)) {
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
	
	public int getIndiceActualMovimientosDetallados(MovimientosDetallados movimientosdetallados,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				if(movimientosdetalladosAux.getId().equals(movimientosdetallados.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladoss) {
				if(movimientosdetalladosAux.getId().equals(movimientosdetallados.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMovimientosDetallados(MovimientosDetallados movimientosdetalladosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				if(movimientosdetalladosAux.getMovimientosDetalladosOriginal().getId().equals(movimientosdetalladosOriginal.getId())) {
					existe=true;
					movimientosdetalladosOriginal.setId(movimientosdetalladosAux.getId());
					movimientosdetalladosOriginal.setVersionRow(movimientosdetalladosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladoss) {
				if(movimientosdetalladosAux.getMovimientosDetalladosOriginal().getId().equals(movimientosdetalladosOriginal.getId())) {
					existe=true;
					movimientosdetalladosOriginal.setId(movimientosdetalladosAux.getId());
					movimientosdetalladosOriginal.setVersionRow(movimientosdetalladosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMovimientosDetallados(Boolean esParaCancelar) throws Exception {
		movimientosdetalladossAux=new ArrayList<MovimientosDetallados>();
		movimientosdetalladosAux=new MovimientosDetallados();
		
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
					if(movimientosdetalladosAux.getId()<0) {
						movimientosdetalladossAux.add(movimientosdetalladosAux);
					}		
				}
				this.iIdNuevoMovimientosDetallados=0L;
				this.movimientosdetalladosLogic.getMovimientosDetalladoss().removeAll(movimientosdetalladossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladoss) {
					if(movimientosdetalladosAux.getId()<0) {
						movimientosdetalladossAux.add(movimientosdetalladosAux);
					}		
				}
				this.iIdNuevoMovimientosDetallados=0L;
				this.movimientosdetalladoss.removeAll(movimientosdetalladossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMovimientosDetallados 
					&& this.movimientosdetalladosLogic.getMovimientosDetalladoss().size()>0
					) {
					movimientosdetalladosAux=this.movimientosdetalladosLogic.getMovimientosDetalladoss().get(this.movimientosdetalladosLogic.getMovimientosDetalladoss().size() - 1);
				
					if(movimientosdetalladosAux.getId()<0) {
						this.movimientosdetalladosLogic.getMovimientosDetalladoss().remove(movimientosdetalladosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMovimientosDetallados && this.movimientosdetalladoss.size()>0) {
					movimientosdetalladosAux=this.movimientosdetalladoss.get(this.movimientosdetalladoss.size() - 1);
				
					if(movimientosdetalladosAux.getId()<0) {
						this.movimientosdetalladoss.remove(movimientosdetalladosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMovimientosDetallados(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(movimientosdetallados.getId()<0) {
				this.movimientosdetalladosLogic.getMovimientosDetalladoss().remove(this.movimientosdetallados);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(movimientosdetallados.getId()<0) {
				this.movimientosdetalladoss.remove(this.movimientosdetallados);
			}
		}			
	}
	
	public void setEstadosInicialesMovimientosDetallados(List<MovimientosDetallados> movimientosdetalladossAux) throws Exception {
		MovimientosDetalladosConstantesFunciones.setEstadosInicialesMovimientosDetallados(movimientosdetalladossAux);
	}
	
	public void setEstadosInicialesMovimientosDetallados(MovimientosDetallados movimientosdetalladosAux) throws Exception {
		MovimientosDetalladosConstantesFunciones.setEstadosInicialesMovimientosDetallados(movimientosdetalladosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMovimientosDetalladosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMovimientosDetalladosActual()) {
				if(!this.isEsNuevoMovimientosDetallados) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMovimientosDetallados=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMovimientosDetalladosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Movimientos Detallados ?", "MANTENIMIENTO DE Movimientos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(MovimientosDetallados movimientosdetallados) throws Exception {
		MovimientosDetalladosConstantesFunciones.seleccionarAsignar(this.movimientosdetallados,movimientosdetallados);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMovimientosDetallados=this.isPermisoActualizarOriginalMovimientosDetallados;
			
			
			this.seleccionarAsignar(movimientosdetallados);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesMovimientosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.movimientosdetalladosSessionBean.setsFuncionBusquedaRapida(this.movimientosdetalladosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMovimientosDetallados) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMovimientosDetallados(esParaCancelar);				
				this.cancelarNuevoMovimientosDetallados(esParaCancelar);								
			}
			
			this.movimientosdetallados=new MovimientosDetallados();
			
			this.inicializarMovimientosDetallados();
			
			this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMovimientosDetallados() throws Exception {
		try {
			MovimientosDetalladosConstantesFunciones.inicializarMovimientosDetallados(this.movimientosdetallados);
			
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
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.movimientosdetalladosLogic.getMovimientosDetalladoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMovimientosDetalladoss(String sAccionBusqueda,List<MovimientosDetallados> movimientosdetalladossParaReportes) throws Exception {
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
					sPathReporteFinal="MovimientosDetallados"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MovimientosDetalladosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MovimientosDetalladosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="MovimientosDetallados"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Movimientos Detalladoses");		
		parameters.put("busquedapor", MovimientosDetalladosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMovimientosDetallados=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MovimientosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MovimientosDetalladosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMovimientosDetallados=new JRBeanArrayDataSource(MovimientosDetalladosJInternalFrame.TraerMovimientosDetalladosBeans(movimientosdetalladossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMovimientosDetallados);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MovimientosDetalladosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MovimientosDetalladosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MovimientosDetalladosBean.TraerMovimientosDetalladosBeans(movimientosdetalladossParaReportes).toArray()));
							
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
				this.generarExcelReporteMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMovimientosDetalladosActionPerformed(null);
					//this.generarExcelReporteMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMovimientosDetalladoss(sAccionBusqueda,sTipoArchivoReporte,movimientosdetalladossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMovimientosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosDetallados> movimientosdetalladossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosDetalladoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMovimientosDetallados("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(MovimientosDetallados movimientosdetallados : movimientosdetalladossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MovimientosDetalladosConstantesFunciones.generarExcelReporteDataMovimientosDetallados("NORMAL",row,workbook,movimientosdetallados,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMovimientosDetallados(String sTipo,Row row,Workbook workbook) {
		
		MovimientosDetalladosConstantesFunciones.generarExcelReporteHeaderMovimientosDetallados(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMovimientosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosDetallados> movimientosdetalladossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(MovimientosDetallados movimientosdetallados : movimientosdetalladossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MovimientosDetalladosConstantesFunciones.getMovimientosDetalladosDescripcion(movimientosdetallados));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnombre_sucursal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnombre_transaccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnumero_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnombre_producto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getnombre_unidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getcosto_unitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getcosto_total());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(movimientosdetallados.getcodigo_producto());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMovimientosDetalladoss(String sAccionBusqueda,String sTipoArchivoReporte,List<MovimientosDetallados> movimientosdetalladossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<MovimientosDetallados> movimientosdetalladossRespaldo=null;
		
		classes=MovimientosDetalladosConstantesFunciones.getClassesRelationshipsOfMovimientosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.movimientosdetalladosLogic.setDatosCliente(this.datosCliente);
		this.movimientosdetalladosLogic.setDatosDeep(this.datosDeep);
		this.movimientosdetalladosLogic.setIsConDeep(true);
		
		movimientosdetalladossRespaldo=this.movimientosdetalladosLogic.getMovimientosDetalladoss();
		
		this.movimientosdetalladosLogic.setMovimientosDetalladoss(movimientosdetalladossParaReportes);	
		this.movimientosdetalladosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		movimientosdetalladossParaReportes=this.movimientosdetalladosLogic.getMovimientosDetalladoss();
		this.movimientosdetalladosLogic.setMovimientosDetalladoss(movimientosdetalladossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("MovimientosDetalladoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMovimientosDetallados("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(MovimientosDetallados movimientosdetallados : movimientosdetalladossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMovimientosDetallados("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MovimientosDetalladosConstantesFunciones.generarExcelReporteDataMovimientosDetallados("NORMAL",row,workbook,movimientosdetallados,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MovimientosDetalladosConstantesFunciones.getMovimientosDetalladosDescripcion(movimientosdetallados));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMovimientosDetallados() throws Exception {		
		this.startProcessMovimientosDetallados(true);
	}
	
	public void startProcessMovimientosDetallados(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasMovimientosDetallados ,this.jPanelParametrosReportesMovimientosDetallados, this.jScrollPanelDatosMovimientosDetallados,this.jPanelPaginacionMovimientosDetallados, this.jScrollPanelDatosEdicionMovimientosDetallados, this.jPanelAccionesMovimientosDetallados,this.jPanelAccionesFormularioMovimientosDetallados,this.jmenuBarMovimientosDetallados,this.jmenuBarDetalleMovimientosDetallados,this.jTtoolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasMovimientosDetallados=this.jTabbedPaneBusquedasMovimientosDetallados; 
		
		final JPanel jPanelParametrosReportesMovimientosDetallados=this.jPanelParametrosReportesMovimientosDetallados;
		//final JScrollPane jScrollPanelDatosMovimientosDetallados=this.jScrollPanelDatosMovimientosDetallados;
		final JTable jTableDatosMovimientosDetallados=this.jTableDatosMovimientosDetallados;		
		final JPanel jPanelPaginacionMovimientosDetallados=this.jPanelPaginacionMovimientosDetallados;
		//final JScrollPane jScrollPanelDatosEdicionMovimientosDetallados=this.jScrollPanelDatosEdicionMovimientosDetallados;
		final JPanel jPanelAccionesMovimientosDetallados=this.jPanelAccionesMovimientosDetallados;
		
		JPanel jPanelCamposAuxiliarMovimientosDetallados=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMovimientosDetallados=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			jPanelCamposAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jPanelCamposMovimientosDetallados;
			jPanelAccionesFormularioAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jPanelAccionesFormularioMovimientosDetallados;
		}
		
		final JPanel jPanelCamposMovimientosDetallados=jPanelCamposAuxiliarMovimientosDetallados;
		final JPanel jPanelAccionesFormularioMovimientosDetallados=jPanelAccionesFormularioAuxiliarMovimientosDetallados;
		
		
		final JMenuBar jmenuBarMovimientosDetallados=this.jmenuBarMovimientosDetallados;
		final JToolBar jTtoolBarMovimientosDetallados=this.jTtoolBarMovimientosDetallados;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMovimientosDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMovimientosDetallados=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			jmenuBarDetalleAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jmenuBarDetalleMovimientosDetallados;
			jTtoolBarDetalleAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jTtoolBarDetalleMovimientosDetallados;
		}
		
		final JMenuBar jmenuBarDetalleMovimientosDetallados=jmenuBarDetalleAuxiliarMovimientosDetallados;
		final JToolBar jTtoolBarDetalleMovimientosDetallados=jTtoolBarDetalleAuxiliarMovimientosDetallados;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMovimientosDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMovimientosDetallados;
			processRunnable.jTableDatos=jTableDatosMovimientosDetallados;
			processRunnable.jPanelCampos=jPanelCamposMovimientosDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionMovimientosDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesMovimientosDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMovimientosDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarMovimientosDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMovimientosDetallados;
			processRunnable.jTtoolBar=jTtoolBarMovimientosDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMovimientosDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMovimientosDetallados ,jPanelParametrosReportesMovimientosDetallados,jTableDatosMovimientosDetallados, /*jScrollPanelDatosMovimientosDetallados,*/jPanelCamposMovimientosDetallados,jPanelPaginacionMovimientosDetallados, /*jScrollPanelDatosEdicionMovimientosDetallados,*/ jPanelAccionesMovimientosDetallados,jPanelAccionesFormularioMovimientosDetallados,jmenuBarMovimientosDetallados,jmenuBarDetalleMovimientosDetallados,jTtoolBarMovimientosDetallados,jTtoolBarDetalleMovimientosDetallados);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMovimientosDetallados ,jPanelParametrosReportesMovimientosDetallados, jScrollPanelDatosMovimientosDetallados,jPanelPaginacionMovimientosDetallados, jScrollPanelDatosEdicionMovimientosDetallados, jPanelAccionesMovimientosDetallados,jPanelAccionesFormularioMovimientosDetallados,jmenuBarMovimientosDetallados,jmenuBarDetalleMovimientosDetallados,jTtoolBarMovimientosDetallados,jTtoolBarDetalleMovimientosDetallados);
						
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
	
	public void finishProcessMovimientosDetallados() {// throws Exception 
		this.finishProcessMovimientosDetallados(true);
	}
	
	public void finishProcessMovimientosDetallados(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasMovimientosDetallados ,this.jPanelParametrosReportesMovimientosDetallados, this.jScrollPanelDatosMovimientosDetallados,this.jPanelPaginacionMovimientosDetallados, this.jScrollPanelDatosEdicionMovimientosDetallados, this.jPanelAccionesMovimientosDetallados,this.jPanelAccionesFormularioMovimientosDetallados,this.jmenuBarMovimientosDetallados,this.jmenuBarDetalleMovimientosDetallados,this.jTtoolBarMovimientosDetallados,this.jTtoolBarDetalleMovimientosDetallados);		
		
		final JTabbedPane jTabbedPaneBusquedasMovimientosDetallados=this.jTabbedPaneBusquedasMovimientosDetallados; 
		
		final JPanel jPanelParametrosReportesMovimientosDetallados=this.jPanelParametrosReportesMovimientosDetallados;
		//final JScrollPane jScrollPanelDatosMovimientosDetallados=this.jScrollPanelDatosMovimientosDetallados;
		final JTable jTableDatosMovimientosDetallados=this.jTableDatosMovimientosDetallados;		
		final JPanel jPanelPaginacionMovimientosDetallados=this.jPanelPaginacionMovimientosDetallados;
		//final JScrollPane jScrollPanelDatosEdicionMovimientosDetallados=this.jScrollPanelDatosEdicionMovimientosDetallados;
		final JPanel jPanelAccionesMovimientosDetallados=this.jPanelAccionesMovimientosDetallados;
		
		JPanel jPanelCamposAuxiliarMovimientosDetallados=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMovimientosDetallados=new JPanel();
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			jPanelCamposAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jPanelCamposMovimientosDetallados;
			jPanelAccionesFormularioAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jPanelAccionesFormularioMovimientosDetallados;
		}
		
		final JPanel jPanelCamposMovimientosDetallados=jPanelCamposAuxiliarMovimientosDetallados;
		final JPanel jPanelAccionesFormularioMovimientosDetallados=jPanelAccionesFormularioAuxiliarMovimientosDetallados;
		
		
		final JMenuBar jmenuBarMovimientosDetallados=this.jmenuBarMovimientosDetallados;		
		final JToolBar jTtoolBarMovimientosDetallados=this.jTtoolBarMovimientosDetallados;
				
		JMenuBar jmenuBarDetalleAuxiliarMovimientosDetallados=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMovimientosDetallados=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			jmenuBarDetalleAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jmenuBarDetalleMovimientosDetallados;
			jTtoolBarDetalleAuxiliarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jTtoolBarDetalleMovimientosDetallados;		
		}
		
		final JMenuBar jmenuBarDetalleMovimientosDetallados=jmenuBarDetalleAuxiliarMovimientosDetallados;
		final JToolBar jTtoolBarDetalleMovimientosDetallados=jTtoolBarDetalleAuxiliarMovimientosDetallados;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMovimientosDetallados;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMovimientosDetallados;
			processRunnable.jTableDatos=jTableDatosMovimientosDetallados;
			processRunnable.jPanelCampos=jPanelCamposMovimientosDetallados;
			processRunnable.jPanelPaginacion=jPanelPaginacionMovimientosDetallados;
			processRunnable.jPanelAcciones=jPanelAccionesMovimientosDetallados;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMovimientosDetallados;
			
			
			processRunnable.jmenuBar=jmenuBarMovimientosDetallados;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMovimientosDetallados;
			processRunnable.jTtoolBar=jTtoolBarMovimientosDetallados;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMovimientosDetallados;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMovimientosDetallados ,jPanelParametrosReportesMovimientosDetallados, jTableDatosMovimientosDetallados,/*jScrollPanelDatosMovimientosDetallados,*/jPanelCamposMovimientosDetallados,jPanelPaginacionMovimientosDetallados, /*jScrollPanelDatosEdicionMovimientosDetallados,*/ jPanelAccionesMovimientosDetallados,jPanelAccionesFormularioMovimientosDetallados,jmenuBarMovimientosDetallados,jmenuBarDetalleMovimientosDetallados,jTtoolBarMovimientosDetallados,jTtoolBarDetalleMovimientosDetallados));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMovimientosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMovimientosDetallados(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMovimientosDetallados(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMovimientosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMovimientosDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMovimientosDetallados,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMovimientosDetallados(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMovimientosDetallados,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMovimientosDetallados,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.movimientosdetalladosConstantesFunciones.getsFinalQueryMovimientosDetallados();
		String  finalQueryPaginacionTodos=this.movimientosdetalladosConstantesFunciones.getsFinalQueryMovimientosDetallados();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MovimientosDetalladosConstantesFunciones.getArrayColumnasGlobalesNoMovimientosDetallados(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MovimientosDetalladosConstantesFunciones.getArrayColumnasGlobalesMovimientosDetallados(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MovimientosDetalladosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.movimientosdetalladossEliminados= new ArrayList<MovimientosDetallados>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMovimientosDetallados();
		
				///*MovimientosDetalladosSessionBean*/this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			
			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
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
					this.iNumeroPaginacion=MovimientosDetalladosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MovimientosDetalladosConstantesFunciones.getClassesForeignKeysOfMovimientosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/movimientosdetallados."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			movimientosdetalladossAux= new ArrayList<MovimientosDetallados>();
			
				
			movimientosdetalladosLogic.setDatosCliente(this.datosCliente);
			movimientosdetalladosLogic.setDatosDeep(this.datosDeep);
			movimientosdetalladosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaMovimientosDetallados")) {
				this.sDetalleReporte=MovimientosDetalladosConstantesFunciones.getDetalleIndiceBusquedaMovimientosDetallados(id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					movimientosdetalladosLogic.getMovimientosDetalladossBusquedaMovimientosDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MovimientosDetalladosConstantesFunciones.getDetalleIndiceBusquedaMovimientosDetallados(id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MovimientosDetalladosConstantesFunciones.getDetalleIndiceBusquedaMovimientosDetallados(id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=movimientosdetalladosLogic.getMovimientosDetalladoss()==null||movimientosdetalladosLogic.getMovimientosDetalladoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=movimientosdetalladoss==null|| movimientosdetalladoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosdetalladossAux=new ArrayList<MovimientosDetallados>();
						movimientosdetalladossAux.addAll(movimientosdetalladosLogic.getMovimientosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosdetalladossAux=new ArrayList<MovimientosDetallados>();
							movimientosdetalladossAux.addAll(movimientosdetalladoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							movimientosdetalladosLogic.getMovimientosDetalladossBusquedaMovimientosDetallados(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=MovimientosDetalladosConstantesFunciones.getDetalleIndiceBusquedaMovimientosDetallados(id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=MovimientosDetalladosConstantesFunciones.getDetalleIndiceBusquedaMovimientosDetallados(id_clienteBusquedaMovimientosDetallados,id_transaccionBusquedaMovimientosDetallados,id_lineaBusquedaMovimientosDetallados,id_linea_grupoBusquedaMovimientosDetallados,id_linea_categoriaBusquedaMovimientosDetallados,id_linea_marcaBusquedaMovimientosDetallados,fecha_emision_desdeBusquedaMovimientosDetallados,fecha_emision_hastaBusquedaMovimientosDetallados);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteMovimientosDetalladoss("BusquedaMovimientosDetallados",movimientosdetalladosLogic.getMovimientosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteMovimientosDetalladoss("BusquedaMovimientosDetallados",movimientosdetalladoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosdetalladosLogic.setMovimientosDetalladoss(new ArrayList<MovimientosDetallados>());
						movimientosdetalladosLogic.getMovimientosDetalladoss().addAll(movimientosdetalladossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosdetalladoss=new ArrayList<MovimientosDetallados>();
							movimientosdetalladoss.addAll(movimientosdetalladossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMovimientosDetallados();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMovimientosDetallados();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=movimientosdetalladosLogic.getMovimientosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosdetalladoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=movimientosdetalladosLogic.getMovimientosDetalladoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=movimientosdetalladoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(MovimientosDetallados movimientosdetallados) {
		Boolean permite=true;
		
		if(this.movimientosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MovimientosDetalladosConstantesFunciones.getOrderByListaMovimientosDetallados();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MovimientosDetalladosConstantesFunciones.getOrderByListaMovimientosDetallados();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosDetallados movimientosdetallados:movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				if(movimientosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosdetalladosTotales=movimientosdetallados;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosDetallados movimientosdetallados:this.movimientosdetalladoss) {
				if(movimientosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosdetalladosTotales=movimientosdetallados;
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
			this.movimientosdetalladosAux=new MovimientosDetallados();
			this.movimientosdetalladosAux.setsType(Constantes2.S_TOTALES);
			this.movimientosdetalladosAux.setIsNew(false);
			this.movimientosdetalladosAux.setIsChanged(false);
			this.movimientosdetalladosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//MovimientosDetalladosConstantesFunciones.TotalizarValoresFilaMovimientosDetallados(this.movimientosdetalladosLogic.getMovimientosDetalladoss(),this.movimientosdetalladosAux);
				
				//this.movimientosdetalladosLogic.getMovimientosDetalladoss().add(this.movimientosdetalladosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MovimientosDetalladosConstantesFunciones.TotalizarValoresFilaMovimientosDetallados(this.movimientosdetalladoss,this.movimientosdetalladosAux);
				
				this.movimientosdetalladoss.add(this.movimientosdetalladosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		movimientosdetalladosTotales=new MovimientosDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.movimientosdetalladosLogic.getMovimientosDetalladoss().remove(movimientosdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.movimientosdetalladoss.remove(movimientosdetalladosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		movimientosdetalladosTotales=new MovimientosDetallados();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(MovimientosDetallados movimientosdetallados:movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				if(movimientosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosdetalladosTotales=movimientosdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MovimientosDetalladosConstantesFunciones.TotalizarValoresFilaMovimientosDetallados(this.movimientosdetalladosLogic.getMovimientosDetalladoss(),movimientosdetalladosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(MovimientosDetallados movimientosdetallados:this.movimientosdetalladoss) {
				if(movimientosdetallados.getsType().equals(Constantes2.S_TOTALES)) {
					movimientosdetalladosTotales=movimientosdetallados;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MovimientosDetalladosConstantesFunciones.TotalizarValoresFilaMovimientosDetallados(this.movimientosdetalladoss,movimientosdetalladosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMovimientosDetalladossBusquedaMovimientosDetallados()throws Exception {
		try {
			sAccionBusqueda="BusquedaMovimientosDetallados";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getMovimientosDetalladossFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getMovimientosDetalladossBusquedaMovimientosDetallados(String sFinalQuery,Long id_cliente,Long id_transaccion,Long id_linea,Long id_linea_grupo,Long id_linea_categoria,Long id_linea_marca,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossBusquedaMovimientosDetallados(sFinalQuery,this.pagination,id_cliente,id_transaccion,id_linea,id_linea_grupo,id_linea_categoria,id_linea_marca,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getMovimientosDetalladossFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//movimientosdetalladosLogic.getMovimientosDetalladossFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
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
	
	public void inicializarPermisosMovimientosDetallados() {
		this.isPermisoTodoMovimientosDetallados=false;
		this.isPermisoNuevoMovimientosDetallados=false;
		this.isPermisoActualizarMovimientosDetallados=false;
		this.isPermisoActualizarOriginalMovimientosDetallados=false;
		this.isPermisoEliminarMovimientosDetallados=false;
		this.isPermisoGuardarCambiosMovimientosDetallados=false;
		this.isPermisoConsultaMovimientosDetallados=true;
		this.isPermisoBusquedaMovimientosDetallados=true;
		this.isPermisoReporteMovimientosDetallados=true;
		this.isPermisoOrdenMovimientosDetallados=false;		
		this.isPermisoPaginacionMedioMovimientosDetallados=false;		
		this.isPermisoPaginacionAltoMovimientosDetallados=false;		
		this.isPermisoPaginacionTodoMovimientosDetallados=false;		
		this.isPermisoCopiarMovimientosDetallados=false;		
		this.isPermisoVerFormMovimientosDetallados=false;		
		this.isPermisoDuplicarMovimientosDetallados=false;
		this.isPermisoOrdenMovimientosDetallados=false;
	}
	
	public void setPermisosUsuarioMovimientosDetallados(Boolean isPermiso) {
		this.isPermisoTodoMovimientosDetallados=isPermiso;
		this.isPermisoNuevoMovimientosDetallados=isPermiso;
		this.isPermisoActualizarMovimientosDetallados=isPermiso;
		this.isPermisoActualizarOriginalMovimientosDetallados=isPermiso;
		this.isPermisoEliminarMovimientosDetallados=isPermiso;
		this.isPermisoGuardarCambiosMovimientosDetallados=isPermiso;
		this.isPermisoConsultaMovimientosDetallados=isPermiso;
		this.isPermisoBusquedaMovimientosDetallados=isPermiso;
		this.isPermisoReporteMovimientosDetallados=isPermiso;
		this.isPermisoOrdenMovimientosDetallados=isPermiso;		
		this.isPermisoPaginacionMedioMovimientosDetallados=isPermiso;		
		this.isPermisoPaginacionAltoMovimientosDetallados=isPermiso;		
		this.isPermisoPaginacionTodoMovimientosDetallados=isPermiso;		
		this.isPermisoCopiarMovimientosDetallados=isPermiso;		
		this.isPermisoVerFormMovimientosDetallados=isPermiso;		
		this.isPermisoDuplicarMovimientosDetallados=isPermiso;
		this.isPermisoOrdenMovimientosDetallados=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMovimientosDetallados(Boolean isPermiso) {
		//this.isPermisoTodoMovimientosDetallados=isPermiso;
		this.isPermisoNuevoMovimientosDetallados=isPermiso;
		this.isPermisoActualizarMovimientosDetallados=isPermiso;
		this.isPermisoActualizarOriginalMovimientosDetallados=isPermiso;
		this.isPermisoEliminarMovimientosDetallados=isPermiso;
		this.isPermisoGuardarCambiosMovimientosDetallados=isPermiso;
		//this.isPermisoConsultaMovimientosDetallados=isPermiso;
		//this.isPermisoBusquedaMovimientosDetallados=isPermiso;
		//this.isPermisoReporteMovimientosDetallados=isPermiso;
		//this.isPermisoOrdenMovimientosDetallados=isPermiso;		
		//this.isPermisoPaginacionMedioMovimientosDetallados=isPermiso;		
		//this.isPermisoPaginacionAltoMovimientosDetallados=isPermiso;		
		//this.isPermisoPaginacionTodoMovimientosDetallados=isPermiso;		
		//this.isPermisoCopiarMovimientosDetallados=isPermiso;		
		//this.isPermisoDuplicarMovimientosDetallados=isPermiso;
		//this.isPermisoOrdenMovimientosDetallados=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMovimientosDetalladosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MovimientosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMovimientosDetallados(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMovimientosDetalladosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMovimientosDetalladosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMovimientosDetalladosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMovimientosDetalladosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMovimientosDetallados() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MovimientosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MovimientosDetalladosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMovimientosDetallados=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMovimientosDetallados=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMovimientosDetallados=this.isPermisoActualizarMovimientosDetallados;
			this.isPermisoEliminarMovimientosDetallados=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMovimientosDetallados=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMovimientosDetallados=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMovimientosDetallados=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMovimientosDetallados=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMovimientosDetallados=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMovimientosDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMovimientosDetallados=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMovimientosDetallados=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMovimientosDetallados=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMovimientosDetallados=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMovimientosDetallados=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMovimientosDetallados=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMovimientosDetallados=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMovimientosDetallados.setToolTipText(this.jTableDatosMovimientosDetallados.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMovimientosDetallados(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMovimientosDetallados(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MovimientosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MovimientosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMovimientosDetallados() throws Exception {
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
	public void inicializarCombosForeignKeyMovimientosDetalladosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMovimientosDetalladosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MovimientosDetalladosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyMovimientosDetallados()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTransaccion();
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
			if(this.movimientosdetalladosSessionBean==null) {
				this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean();
			}

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
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

			if(!this.movimientosdetalladosSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
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
	
	public void initActionsCombosTodosForeignKeyMovimientosDetallados()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMovimientosDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMovimientosDetallados()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosDetallados();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMovimientosDetallados(MovimientosDetallados movimientosdetallados)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMovimientosDetallados(MovimientosDetallados movimientosdetallados,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMovimientosDetallados()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMovimientosDetallados()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMovimientosDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMovimientosDetallados()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMovimientosDetallados()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMovimientosDetallados()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMovimientosDetallados(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMovimientosDetallados()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.getItemCount()>0) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
















	
	

	public MovimientosDetalladosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MovimientosDetalladosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MovimientosDetalladosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.movimientosdetalladosSessionBean=new MovimientosDetalladosSessionBean(); 
		this.movimientosdetalladosConstantesFunciones=new MovimientosDetalladosConstantesFunciones(); 
		this.movimientosdetalladosBean=new MovimientosDetallados();//(this.movimientosdetalladosConstantesFunciones); 		
		this.movimientosdetalladosReturnGeneral=new MovimientosDetalladosParameterReturnGeneral(); 
		
		this.movimientosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MovimientosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MovimientosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MovimientosDetalladosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMovimientosDetallados(true);
			
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
			
			this.movimientosdetalladosConstantesFunciones=new MovimientosDetalladosConstantesFunciones(); 
			this.movimientosdetalladosBean=new MovimientosDetallados();//this.movimientosdetalladosConstantesFunciones); 			
			this.movimientosdetalladosReturnGeneral=new MovimientosDetalladosParameterReturnGeneral(); 
		
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimientos Detallados Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.movimientosdetallados=new MovimientosDetallados();
			this.movimientosdetalladoss = new ArrayList<MovimientosDetallados>();
			this.movimientosdetalladossAux = new ArrayList<MovimientosDetallados>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic=new MovimientosDetalladosLogic();
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.movimientosdetalladosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.movimientosdetalladosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMovimientosDetallados);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMovimientosDetallados);	
					}
					
					if(this.jInternalFrameImportacionMovimientosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMovimientosDetallados);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMovimientosDetallados!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMovimientosDetallados);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMovimientosDetallados);
				this.jInternalFrameDetalleFormMovimientosDetallados.setVisible(false);
				this.jInternalFrameDetalleFormMovimientosDetallados.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMovimientosDetallados);
					this.jInternalFrameReporteDinamicoMovimientosDetallados.setVisible(false);
					this.jInternalFrameReporteDinamicoMovimientosDetallados.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMovimientosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMovimientosDetallados);
					this.jInternalFrameImportacionMovimientosDetallados.setVisible(false);
					this.jInternalFrameImportacionMovimientosDetallados.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMovimientosDetallados!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMovimientosDetallados);
					this.jInternalFrameOrderByMovimientosDetallados.setVisible(false);
					this.jInternalFrameOrderByMovimientosDetallados.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMovimientosDetalladosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MovimientosDetalladosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.movimientosdetalladosReturnGeneral=new MovimientosDetalladosParameterReturnGeneral();
			
			this.movimientosdetalladosParameterGeneral=new MovimientosDetalladosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.movimientosdetalladosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MovimientosDetalladosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MovimientosDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),this.movimientosdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MovimientosDetalladosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),this.movimientosdetalladosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaDuplicarMovimientosDetallados=true;
			this.isVisibilidadCeldaCopiarMovimientosDetallados=true;
			this.isVisibilidadCeldaVerFormMovimientosDetallados=true;
			this.isVisibilidadCeldaOrdenMovimientosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			
			
			this.isVisibilidadBusquedaMovimientosDetallados=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMovimientosDetallados();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMovimientosDetallados(false);
			
			this.setPermisosUsuarioMovimientosDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() 
				|| (this.movimientosdetalladosSessionBean.getEsGuardarRelacionado() && this.movimientosdetalladosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMovimientosDetalladosClasesRelacionadas();
			}
			
			if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMovimientosDetalladosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMovimientosDetallados();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMovimientosDetallados();
			}
			
			if(!this.isPermisoBusquedaMovimientosDetallados) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MovimientosDetalladosConstantesFunciones.getTiposSeleccionarMovimientosDetallados());
				
				this.tiposColumnasSelect=MovimientosDetalladosConstantesFunciones.getTiposSeleccionarMovimientosDetallados(true);
				
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
			//if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMovimientosDetallados();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioMovimientosDetallados(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioMovimientosDetallados(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosDetallados() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.transaccionLogic=new TransaccionLogic();
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
				movimientosdetalladosImplementable= (MovimientosDetalladosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MovimientosDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				movimientosdetalladosImplementableHome= (MovimientosDetalladosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MovimientosDetalladosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.movimientosdetalladoss= new ArrayList<MovimientosDetallados>();
			this.movimientosdetalladossEliminados= new ArrayList<MovimientosDetallados>();
						
			this.isEsNuevoMovimientosDetallados=false;
			this.esParaAccionDesdeFormularioMovimientosDetallados=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMovimientosDetallados(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMovimientosDetallados();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MovimientosDetalladosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMovimientosDetallados("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMovimientosDetallados(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMovimientosDetallados();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMovimientosDetallados();
			}
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasMovimientosDetallados.getTabCount(); i++) {
					this.jTabbedPaneBusquedasMovimientosDetallados.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasMovimientosDetallados.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMovimientosDetallados(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga MovimientosDetallados: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMovimientosDetallados() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMovimientosDetallados")) {
				iIndex=this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMovimientosDetallados();	
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
	
	public void cargarCombosForeignKeyMovimientosDetallados(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMovimientosDetallados(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMovimientosDetallados(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMovimientosDetalladosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMovimientosDetallados();
		
		this.cargarCombosFrameForeignKeyMovimientosDetallados();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMovimientosDetallados();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMovimientosDetallados();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

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
	
	public void jButtonNuevoMovimientosDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			
			if(jTableDatosMovimientosDetallados.getRowCount()>=1) {
				jTableDatosMovimientosDetallados.removeRowSelectionInterval(0, jTableDatosMovimientosDetallados.getRowCount()-1);						
			}
			
			this.isEsNuevoMovimientosDetallados=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMovimientosDetallados(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMovimientosDetallados(true);			
			//this.movimientosdetallados=new MovimientosDetallados();
			//this.movimientosdetallados.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosDetallados(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosDetallados() ;
			
			if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosDetallados(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.movimientosdetallados);	
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);				
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar MovimientosDetallados: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMovimientosDetalladosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMovimientosDetallados.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMovimientosDetallados.getSelectedRows().length;			
			}
			
			movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMovimientosDetallados--;			
				//MovimientosDetallados movimientosdetalladosAux= new MovimientosDetallados();			
				//movimientosdetalladosAux.setId(this.iIdNuevoMovimientosDetallados);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//MovimientosDetallados movimientosdetalladosOrigen=new MovimientosDetallados();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(MovimientosDetallados movimientosdetalladosOrigen : movimientosdetalladossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							movimientosdetalladosOrigen =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							movimientosdetalladosOrigen =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMovimientosDetallados();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.movimientosdetallados.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMovimientosDetallados(movimientosdetalladosOrigen,this.movimientosdetallados,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.movimientosdetalladosLogic.getMovimientosDetalladoss().add(this.movimientosdetalladosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.movimientosdetalladoss.add(this.movimientosdetalladosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
				
				this.jTableDatosMovimientosDetallados.setRowSelectionInterval(this.getIndiceNuevoMovimientosDetallados(), this.getIndiceNuevoMovimientosDetallados());
				
				int iLastRow =  this.jTableDatosMovimientosDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMovimientosDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMovimientosDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosDetallados(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();									
		
			MovimientosDetallados movimientosdetalladosOrigen=new MovimientosDetallados();
			MovimientosDetallados movimientosdetalladosDestino=new MovimientosDetallados();
				
			movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMovimientosDetallados.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || movimientosdetalladossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMovimientosDetallados.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosdetalladosOrigen =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						movimientosdetalladosOrigen =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						movimientosdetalladosDestino =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						movimientosdetalladosDestino =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				movimientosdetalladosOrigen =movimientosdetalladossSeleccionados.get(0);
				movimientosdetalladosDestino =movimientosdetalladossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMovimientosDetallados(movimientosdetalladosOrigen,movimientosdetalladosDestino,true,false);
				
				movimientosdetalladosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(movimientosdetalladosDestino,movimientosdetalladosLogic.getMovimientosDetalladoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(movimientosdetalladosDestino,movimientosdetalladoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
				
				//this.jTableDatosMovimientosDetallados.setRowSelectionInterval(this.getIndiceNuevoMovimientosDetallados(), this.getIndiceNuevoMovimientosDetallados());
				
				int iLastRow =  this.jTableDatosMovimientosDetallados.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMovimientosDetallados.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMovimientosDetallados.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosDetallados(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMovimientosDetallados.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMovimientosDetallados.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesMovimientosDetallados.setVisible(!isVisible);
			this.jPanelPaginacionMovimientosDetallados.setVisible(!isVisible);
			this.jPanelAccionesMovimientosDetallados.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMovimientosDetallados();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMovimientosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMovimientosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMovimientosDetallados();
			
			this.abrirFrameOrderByMovimientosDetallados();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMovimientosDetallados();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMovimientosDetallados(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMovimientosDetallados);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMovimientosDetallados.isMaximum()) {
					this.jInternalFrameDetalleFormMovimientosDetallados.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMovimientosDetallados.setSize(this.jInternalFrameDetalleFormMovimientosDetallados.iWidthFormulario,this.jInternalFrameDetalleFormMovimientosDetallados.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMovimientosDetallados.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMovimientosDetallados.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMovimientosDetallados.isMaximum()) {
						this.jInternalFrameDetalleFormMovimientosDetallados.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMovimientosDetallados.jContentPaneDetalleMovimientosDetallados.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMovimientosDetallados.jContentPaneDetalleMovimientosDetallados.getWidth(),MovimientosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMovimientosDetallados.jContentPaneDetalleMovimientosDetallados.getWidth(),MovimientosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMovimientosDetallados.jContentPaneDetalleMovimientosDetallados.getWidth(),MovimientosDetalladosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMovimientosDetallados.setVisible(true);
	        this.jInternalFrameDetalleFormMovimientosDetallados.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMovimientosDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMovimientosDetallados==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMovimientosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosDetallados,false,this);
				} else {
					this.jInternalFrameOrderByMovimientosDetallados=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMovimientosDetallados,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMovimientosDetallados);
				this.jInternalFrameOrderByMovimientosDetallados.setVisible(false);
				this.jInternalFrameOrderByMovimientosDetallados.setSelected(false);
				
				this.jInternalFrameOrderByMovimientosDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMovimientosDetallados"));
				
				this.inicializarActualizarBindingTablaOrderByMovimientosDetallados();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMovimientosDetallados() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMovimientosDetallados==null) {
				
				this.jInternalFrameImportacionMovimientosDetallados=new ImportacionJInternalFrame(MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMovimientosDetallados);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMovimientosDetallados);
				this.jInternalFrameImportacionMovimientosDetallados.setVisible(false);
				this.jInternalFrameImportacionMovimientosDetallados.setSelected(false);


				this.jInternalFrameImportacionMovimientosDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMovimientosDetallados"));
				this.jInternalFrameImportacionMovimientosDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMovimientosDetallados"));
				this.jInternalFrameImportacionMovimientosDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMovimientosDetallados"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMovimientosDetallados() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMovimientosDetallados==null) {
				this.jInternalFrameReporteDinamicoMovimientosDetallados=new ReporteDinamicoJInternalFrame(MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMovimientosDetallados);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMovimientosDetallados);
				this.jInternalFrameReporteDinamicoMovimientosDetallados.setVisible(false);
				this.jInternalFrameReporteDinamicoMovimientosDetallados.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosDetallados"));
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosDetallados"));
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosDetallados"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosDetallados();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleMovimientosDetallados() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMovimientosDetallados);
			
	       	this.jInternalFrameDetalleFormMovimientosDetallados.setVisible(false);
	        this.jInternalFrameDetalleFormMovimientosDetallados.setSelected(false);
			
			//this.jInternalFrameDetalleFormMovimientosDetallados.dispose();
			//this.jInternalFrameDetalleFormMovimientosDetallados=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMovimientosDetallados() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMovimientosDetallados.setVisible(true);
	        this.jInternalFrameReporteDinamicoMovimientosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMovimientosDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMovimientosDetallados.setVisible(true);
	        this.jInternalFrameImportacionMovimientosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMovimientosDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMovimientosDetallados.setVisible(true);
	        this.jInternalFrameOrderByMovimientosDetallados.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMovimientosDetallados() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMovimientosDetallados.setVisible(false);
	        this.jInternalFrameOrderByMovimientosDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMovimientosDetallados() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMovimientosDetallados.setVisible(false);
	        this.jInternalFrameReporteDinamicoMovimientosDetallados.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMovimientosDetallados() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMovimientosDetallados.setVisible(false);
	        this.jInternalFrameImportacionMovimientosDetallados.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMovimientosDetallados(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMovimientosDetallados(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMovimientosDetallados(true);
			//this.isEsNuevoMovimientosDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMovimientosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosDetallados(false) ;
			
			if(movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosDetallados(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMovimientosDetalladosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMovimientosDetallados(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMovimientosDetallados(true);
			//this.isEsNuevoMovimientosDetallados=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.movimientosdetallados.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMovimientosDetallados("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMovimientosDetallados(false) ;
			
			if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMovimientosDetallados(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosDetallados(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

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
		TableColumn tableColumnLineaCategoria=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

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
		TableColumn tableColumnLineaMarca=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMovimientosDetallados(false);
			
			//if(!this.isEsNuevoMovimientosDetallados) {								
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				
			}
			
			if(this.permiteMantenimiento(this.movimientosdetallados)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMovimientosDetallados=true;
					this.inicializarActualizarBindingTablaMovimientosDetallados(false);
					this.isEsNuevoMovimientosDetallados=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMovimientosDetallados=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMovimientosDetallados=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMovimientosDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosDetallados(false);
				
				this.habilitarDeshabilitarControlesMovimientosDetallados(false);
			
												
				
				if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMovimientosDetallados();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMovimientosDetalladosActionPerformed(evt,movimientosdetalladosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMovimientosDetallados(this.movimientosdetallados,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,movimientosdetalladosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.movimientosdetallados.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				this.movimientosdetallados.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				this.movimientosdetallados.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.movimientosdetallados)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MovimientosDetalladosModel) this.jTableDatosMovimientosDetallados.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMovimientosDetallados=true;
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
				this.isEsNuevoMovimientosDetallados=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMovimientosDetallados(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosDetallados(false);
				
				this.habilitarDeshabilitarControlesMovimientosDetallados(false);
				
				
				
				if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMovimientosDetallados();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMovimientosDetallados.getRowCount()>=1) {
				jTableDatosMovimientosDetallados.removeRowSelectionInterval(0, jTableDatosMovimientosDetallados.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMovimientosDetallados(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMovimientosDetallados(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMovimientosDetallados(false) ;
			
			this.isEsNuevoMovimientosDetallados=false;
			
			if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMovimientosDetallados();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMovimientosDetallados(false);
				
				//SI ES MANUAL
				if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMovimientosDetallados();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMovimientosDetallados--;			
			//MovimientosDetallados movimientosdetalladosAux= new MovimientosDetallados();			
			//movimientosdetalladosAux.setId(this.iIdNuevoMovimientosDetallados);
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMovimientosDetallados();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
			
			this.movimientosdetallados.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.movimientosdetalladosLogic.getMovimientosDetalladoss().add(this.movimientosdetalladosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.movimientosdetalladoss.add(this.movimientosdetalladosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			
			this.jTableDatosMovimientosDetallados.setRowSelectionInterval(this.getIndiceNuevoMovimientosDetallados(), this.getIndiceNuevoMovimientosDetallados());
			
			int iLastRow =  this.jTableDatosMovimientosDetallados.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMovimientosDetallados.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMovimientosDetallados.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosDetallados(false);
			
			//SI ES MANUAL
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosDetallados();
			}
			
			//this.abrirFrameTreeMovimientosDetallados();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMovimientosDetallados.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMovimientosDetallados.setFileImportacion(this.jInternalFrameImportacionMovimientosDetallados.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMovimientosDetallados.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMovimientosDetallados.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMovimientosDetallados.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMovimientosDetallados.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		

		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MovimientosDetalladosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MovimientosDetalladosBaseDesign.jrxml";
			
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
			
			this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTransaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTransaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTransaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTransaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreProducto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreUnidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreUnidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreUnidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreUnidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoUnitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoUnitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoUnitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoUnitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoTotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoTotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoTotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoTotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoProducto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoProducto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoProducto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoProducto_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoria="nombre_sucursal";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoria="nombre_transaccion";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoria="numero_secuencial";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoria="nombre_producto";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoria="nombre_unidad";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoria="costo_unitario";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoria="costo_total";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoria="codigo_producto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					sNombreCampoCategoriaValor="nombre_sucursal";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					sNombreCampoCategoriaValor="nombre_transaccion";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoriaValor="numero_secuencial";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					sNombreCampoCategoriaValor="nombre_producto";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD:
					sNombreCampoCategoriaValor="nombre_unidad";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO:
					sNombreCampoCategoriaValor="costo_unitario";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL:
					sNombreCampoCategoriaValor="costo_total";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					sNombreCampoCategoriaValor="codigo_producto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sucursal");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_transaccion");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuencial");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_producto");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Unad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_unidad");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Unitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_unitario");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_total");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Producto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_producto");
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
	
	public void jButtonGenerarExcelReporteDinamicoMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("MovimientosDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnombre_sucursal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnombre_transaccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnumero_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnombre_producto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getnombre_unidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IVA);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getcosto_unitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getcosto_total());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_ICE);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO);
					iRow++;

					for(MovimientosDetallados movimientosdetallados:movimientosdetalladossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(movimientosdetallados.getcodigo_producto());
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
			//	this.getFilaCabeceraExportarExcelMovimientosDetallados(row);				
			//	iRow++;
			//}				
			
			//for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMovimientosDetallados(movimientosdetalladosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
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
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosDetallados(false);
			
			//SI ES MANUAL
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMovimientosDetallados();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosDetallados(false);
			
			//SI ES MANUAL
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMovimientosDetallados();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMovimientosDetallados(false);
			
			//SI ES MANUAL
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMovimientosDetallados();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMovimientosDetallados() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMovimientosDetallados.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMovimientosDetallados.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMovimientosDetallados.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMovimientosDetallados.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMovimientosDetallados.setMinimumSize(dimensionMinimum);
		this.jTableDatosMovimientosDetallados.setMaximumSize(dimensionMaximum);
		this.jTableDatosMovimientosDetallados.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMovimientosDetallados(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMovimientosDetallados(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMovimientosDetallados(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMovimientosDetallados(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMovimientosDetallados(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMovimientosDetallados(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosDetallados(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMovimientosDetallados(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMovimientosDetallados() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMovimientosDetallados();
		
		this.inicializarActualizarBindingBotonesManualMovimientosDetallados(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMovimientosDetallados();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosDetallados() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosDetallados(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosDetallados(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMovimientosDetallados.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMovimientosDetallados.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMovimientosDetallados.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionNuevoMovimientosDetallados.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionSinCerrarMovimientosDetallados.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionSinMensajeMovimientosDetallados.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMovimientosDetallados.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMovimientosDetallados.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMovimientosDetallados.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionNuevoMovimientosDetallados.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionSinCerrarMovimientosDetallados.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMovimientosDetallados.jCheckBoxPostAccionSinMensajeMovimientosDetallados.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMovimientosDetallados.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMovimientosDetallados.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMovimientosDetallados.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMovimientosDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMovimientosDetallados.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMovimientosDetallados.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMovimientosDetallados.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMovimientosDetallados.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMovimientosDetallados.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMovimientosDetallados(Boolean esInicializar) throws Exception {
		try	{	
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMovimientosDetallados(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMovimientosDetallados() throws Exception {
		try	{
			if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMovimientosDetallados();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMovimientosDetallados() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMovimientosDetallados() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMovimientosDetallados.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMovimientosDetallados.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMovimientosDetallados.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMovimientosDetallados.addItem(reporte);
			}
			
			
			if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMovimientosDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMovimientosDetallados.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMovimientosDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMovimientosDetallados.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMovimientosDetallados.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMovimientosDetallados.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMovimientosDetallados.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosDetallados();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMovimientosDetallados() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
				
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=MovimientosDetalladosConstantesFunciones.getTiposSeleccionarMovimientosDetallados(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=MovimientosDetalladosConstantesFunciones.getTiposSeleccionarMovimientosDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=MovimientosDetalladosConstantesFunciones.getTiposSeleccionarMovimientosDetallados(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoMovimientosDetallados.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMovimientosDetallados()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_clienteBusquedaMovimientosDetallados=((Cliente)this.jComboBoxid_clienteBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_transaccionBusquedaMovimientosDetallados=((Transaccion)this.jComboBoxid_transaccionBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_lineaBusquedaMovimientosDetallados=((Linea)this.jComboBoxid_lineaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_linea_grupoBusquedaMovimientosDetallados=((Linea)this.jComboBoxid_linea_grupoBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_linea_categoriaBusquedaMovimientosDetallados=((Linea)this.jComboBoxid_linea_categoriaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		if(this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()!=null){this.id_linea_marcaBusquedaMovimientosDetallados=((Linea)this.jComboBoxid_linea_marcaBusquedaMovimientosDetalladosMovimientosDetallados.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaMovimientosDetallados=new Date(this.jDateChooserfecha_emision_desdeBusquedaMovimientosDetalladosMovimientosDetallados.getDate().getTime());
		this.fecha_emision_hastaBusquedaMovimientosDetallados=new Date(this.jDateChooserfecha_emision_hastaBusquedaMovimientosDetalladosMovimientosDetallados.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMovimientosDetallados(Boolean esInicializar) throws Exception {				
		if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMovimientosDetallados();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMovimientosDetallados() throws Exception {
		this.inicializarActualizarBindingTablaMovimientosDetallados(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMovimientosDetallados() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMovimientosDetalladosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetalladosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMovimientosDetallados(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=movimientosdetalladosLogic.getMovimientosDetalladoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=movimientosdetalladoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMovimientosDetallados.setModel(new MovimientosDetalladosModel(this.movimientosdetalladosLogic.getMovimientosDetalladoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMovimientosDetallados.setModel(new MovimientosDetalladosModel(this.movimientosdetalladoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMovimientosDetallados!=null && this.jInternalFrameOrderByMovimientosDetallados.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMovimientosDetallados();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,movimientosdetalladosConstantesFunciones.resaltarSeleccionarMovimientosDetallados,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MovimientosDetalladosConstantesFunciones.SCLASSWEBTITULO,movimientosdetalladosConstantesFunciones.resaltarSeleccionarMovimientosDetallados,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_ID));

		if(this.movimientosdetalladosConstantesFunciones.mostraridMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltaridMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activaridMovimientosDetallados,iSizeTabla,this,true,"idMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltaridMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activaridMovimientosDetallados,this,true,"idMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnombre_sucursalMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_sucursalMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_sucursalMovimientosDetallados,iSizeTabla,this,true,"nombre_sucursalMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_sucursalMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_sucursalMovimientosDetallados,this,true,"nombre_sucursalMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnombre_completo_clienteMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_completo_clienteMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_completo_clienteMovimientosDetallados,iSizeTabla,this,true,"nombre_completo_clienteMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_completo_clienteMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_completo_clienteMovimientosDetallados,this,true,"nombre_completo_clienteMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnombre_transaccionMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_transaccionMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_transaccionMovimientosDetallados,iSizeTabla,this,true,"nombre_transaccionMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_transaccionMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_transaccionMovimientosDetallados,this,true,"nombre_transaccionMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnumero_comprobanteMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_comprobanteMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_comprobanteMovimientosDetallados,iSizeTabla,this,true,"numero_comprobanteMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_comprobanteMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_comprobanteMovimientosDetallados,this,true,"numero_comprobanteMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnumero_facturaMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_facturaMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_facturaMovimientosDetallados,iSizeTabla,this,true,"numero_facturaMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_facturaMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_facturaMovimientosDetallados,this,true,"numero_facturaMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnumero_secuencialMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_secuencialMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_secuencialMovimientosDetallados,iSizeTabla,this,true,"numero_secuencialMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnumero_secuencialMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnumero_secuencialMovimientosDetallados,this,true,"numero_secuencialMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION));

		if(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emisionMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emisionMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarfecha_emisionMovimientosDetallados,iSizeTabla,this,true,"fecha_emisionMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emisionMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarfecha_emisionMovimientosDetallados,this,true,"fecha_emisionMovimientosDetallados","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnombre_productoMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_productoMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_productoMovimientosDetallados,iSizeTabla,this,true,"nombre_productoMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_productoMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_productoMovimientosDetallados,this,true,"nombre_productoMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD));

		if(this.movimientosdetalladosConstantesFunciones.mostrarnombre_unidadMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_unidadMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_unidadMovimientosDetallados,iSizeTabla,this,true,"nombre_unidadMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarnombre_unidadMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarnombre_unidadMovimientosDetallados,this,true,"nombre_unidadMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD));

		if(this.movimientosdetalladosConstantesFunciones.mostrarcantidadMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcantidadMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcantidadMovimientosDetallados,iSizeTabla,this,true,"cantidadMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcantidadMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcantidadMovimientosDetallados,this,true,"cantidadMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_IVA));

		if(this.movimientosdetalladosConstantesFunciones.mostrarivaMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltarivaMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarivaMovimientosDetallados,iSizeTabla,this,true,"ivaMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarivaMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarivaMovimientosDetallados,this,true,"ivaMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO));

		if(this.movimientosdetalladosConstantesFunciones.mostrarcosto_unitarioMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcosto_unitarioMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcosto_unitarioMovimientosDetallados,iSizeTabla,this,true,"costo_unitarioMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcosto_unitarioMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcosto_unitarioMovimientosDetallados,this,true,"costo_unitarioMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL));

		if(this.movimientosdetalladosConstantesFunciones.mostrarcosto_totalMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcosto_totalMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcosto_totalMovimientosDetallados,iSizeTabla,this,true,"costo_totalMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcosto_totalMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcosto_totalMovimientosDetallados,this,true,"costo_totalMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_ICE));

		if(this.movimientosdetalladosConstantesFunciones.mostrariceMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.movimientosdetalladosConstantesFunciones.resaltariceMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activariceMovimientosDetallados,iSizeTabla,this,true,"iceMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltariceMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activariceMovimientosDetallados,this,true,"iceMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO));

		if(this.movimientosdetalladosConstantesFunciones.mostrarcodigo_productoMovimientosDetallados && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcodigo_productoMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcodigo_productoMovimientosDetallados,iSizeTabla,this,true,"codigo_productoMovimientosDetallados","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.movimientosdetalladosConstantesFunciones.resaltarcodigo_productoMovimientosDetallados,this.movimientosdetalladosConstantesFunciones.activarcodigo_productoMovimientosDetallados,this,true,"codigo_productoMovimientosDetallados","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MovimientosDetalladosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMovimientosDetallados.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMovimientosDetallados.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMovimientosDetallados.addColumn(tableColumn);
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
			
			this.jTableDatosMovimientosDetallados.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMovimientosDetallados.moveColumn(this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMovimientosDetallados.moveColumn(this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMovimientosDetallados.moveColumn(this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMovimientosDetallados.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMovimientosDetallados.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMovimientosDetallados,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMovimientosDetallados.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMovimientosDetallados.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMovimientosDetallados.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMovimientosDetallados.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=movimientosdetalladosLogic.getMovimientosDetalladoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=movimientosdetalladoss.size()-1;
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
		//this.jTableDatosMovimientosDetallados.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMovimientosDetallados.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMovimientosDetallados();
			
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
				
				//this.isEsNuevoMovimientosDetallados=false;
					
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
				if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMovimientosDetallados==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMovimientosDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.movimientosdetallados.getsType().equals("DUPLICADO")
				   || this.movimientosdetallados.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMovimientosDetallados=true;
				
				} else {
					this.isEsNuevoMovimientosDetallados=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
					if(this.movimientosdetallados.getId()>=0 && !this.movimientosdetallados.getIsNew()) {						
						this.isEsNuevoMovimientosDetallados=false;
						
					} else {
						this.isEsNuevoMovimientosDetallados=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMovimientosDetallados(esRelaciones);						
				
				this.seleccionarMovimientosDetallados(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.movimientosdetallados.getId()<0) {
					this.isEsNuevoMovimientosDetallados=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMovimientosDetallados(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMovimientosDetallados(evt,rowIndex);
				}	
				
				if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion MovimientosDetallados: " + this.dDif); 
					}
				}								
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMovimientosDetallados(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.movimientosdetallados)) {
					if(this.movimientosdetallados.getId()>0) {
						this.movimientosdetallados.setIsDeleted(true);
						
						this.movimientosdetalladossEliminados.add(this.movimientosdetallados);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.movimientosdetalladosLogic.getMovimientosDetalladoss().remove(this.movimientosdetallados);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.movimientosdetalladoss.remove(this.movimientosdetallados);				
					}
					
					
					((MovimientosDetalladosModel) this.jTableDatosMovimientosDetallados.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMovimientosDetallados(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMovimientosDetallados(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMovimientosDetallados) {
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMovimientosDetallados.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMovimientosDetallados.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetallados);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMovimientosDetallados("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMovimientosDetallados(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMovimientosDetallados() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMovimientosDetallados(MovimientosDetallados movimientosdetallados) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMovimientosDetallados(movimientosdetallados,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMovimientosDetallados(MovimientosDetallados movimientosdetallados,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMovimientosDetallados(movimientosdetallados);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMovimientosDetallados(movimientosdetallados,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMovimientosDetallados(movimientosdetallados);
	}
	
	public void setVariablesObjetoActualToFormularioMovimientosDetallados(MovimientosDetallados movimientosdetallados) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setText(movimientosdetallados.getId().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setText(movimientosdetallados.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setText(movimientosdetallados.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setText(movimientosdetallados.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setText(movimientosdetallados.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setText(movimientosdetallados.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setText(movimientosdetallados.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setDate(movimientosdetallados.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setText(movimientosdetallados.getnombre_producto());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setText(movimientosdetallados.getnombre_unidad());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setText(movimientosdetallados.getcantidad().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setText(movimientosdetallados.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setText(movimientosdetallados.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setText(movimientosdetallados.getcosto_total().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setText(movimientosdetallados.getice().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setText(movimientosdetallados.getcodigo_producto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,MovimientosDetallados movimientosdetalladosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,movimientosdetalladosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,MovimientosDetallados movimientosdetalladosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				movimientosdetalladosLocal=this.movimientosdetallados;
			} else {
				movimientosdetalladosLocal=this.movimientosdetalladosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(movimientosdetalladosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMovimientosDetallados(movimientosdetalladosLocal,true);
					
					if(movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(movimientosdetalladosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(movimientosdetalladosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMovimientosDetallados(MovimientosDetallados movimientosdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMovimientosDetallados(movimientosdetallados,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(movimientosdetallados);
	}
	
	public void setVariablesFormularioToObjetoActualMovimientosDetallados(MovimientosDetallados movimientosdetallados,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMovimientosDetallados(movimientosdetallados,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMovimientosDetallados(MovimientosDetallados movimientosdetallados,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.getText()==null || this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.getText()=="" || this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.getText()=="Id") {
				this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setText("0");
			}

			if(conColumnasBase) {movimientosdetallados.setId(Long.parseLong(this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelIdMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnombre_sucursal(this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_sucursalMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnombre_completo_cliente(this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_completo_clienteMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnombre_transaccion(this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_transaccionMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnumero_comprobante(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_comprobanteMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnumero_factura(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_facturaMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnumero_secuencial(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnumero_secuencialMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setfecha_emision(this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelfecha_emisionMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnombre_producto(this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_productoMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setnombre_unidad(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelnombre_unidadMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcantidadMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setiva(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelivaMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setcosto_unitario(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_unitarioMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setcosto_total(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcosto_totalMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setice(Double.parseDouble(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabeliceMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			movimientosdetallados.setcodigo_producto(this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMovimientosDetallados.jLabelcodigo_productoMovimientosDetallados,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMovimientosDetallados(MovimientosDetallados movimientosdetalladosBean,MovimientosDetallados movimientosdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMovimientosDetallados(MovimientosDetallados movimientosdetalladosOrigen,MovimientosDetallados movimientosdetallados,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && movimientosdetalladosOrigen.getId()!=null && !movimientosdetalladosOrigen.getId().equals(0L))) {movimientosdetallados.setId(movimientosdetalladosOrigen.getId());}}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getfecha_emision_desde()!=null && !movimientosdetalladosOrigen.getfecha_emision_desde().equals(new Date()))) {movimientosdetallados.setfecha_emision_desde(movimientosdetalladosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getfecha_emision_hasta()!=null && !movimientosdetalladosOrigen.getfecha_emision_hasta().equals(new Date()))) {movimientosdetallados.setfecha_emision_hasta(movimientosdetalladosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnombre_sucursal()!=null && !movimientosdetalladosOrigen.getnombre_sucursal().equals(""))) {movimientosdetallados.setnombre_sucursal(movimientosdetalladosOrigen.getnombre_sucursal());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnombre_completo_cliente()!=null && !movimientosdetalladosOrigen.getnombre_completo_cliente().equals(""))) {movimientosdetallados.setnombre_completo_cliente(movimientosdetalladosOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnombre_transaccion()!=null && !movimientosdetalladosOrigen.getnombre_transaccion().equals(""))) {movimientosdetallados.setnombre_transaccion(movimientosdetalladosOrigen.getnombre_transaccion());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnumero_comprobante()!=null && !movimientosdetalladosOrigen.getnumero_comprobante().equals(""))) {movimientosdetallados.setnumero_comprobante(movimientosdetalladosOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnumero_factura()!=null && !movimientosdetalladosOrigen.getnumero_factura().equals(""))) {movimientosdetallados.setnumero_factura(movimientosdetalladosOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnumero_secuencial()!=null && !movimientosdetalladosOrigen.getnumero_secuencial().equals(""))) {movimientosdetallados.setnumero_secuencial(movimientosdetalladosOrigen.getnumero_secuencial());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getfecha_emision()!=null && !movimientosdetalladosOrigen.getfecha_emision().equals(new Date()))) {movimientosdetallados.setfecha_emision(movimientosdetalladosOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnombre_producto()!=null && !movimientosdetalladosOrigen.getnombre_producto().equals(""))) {movimientosdetallados.setnombre_producto(movimientosdetalladosOrigen.getnombre_producto());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getnombre_unidad()!=null && !movimientosdetalladosOrigen.getnombre_unidad().equals(""))) {movimientosdetallados.setnombre_unidad(movimientosdetalladosOrigen.getnombre_unidad());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getcantidad()!=null && !movimientosdetalladosOrigen.getcantidad().equals(0))) {movimientosdetallados.setcantidad(movimientosdetalladosOrigen.getcantidad());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getiva()!=null && !movimientosdetalladosOrigen.getiva().equals(0.0))) {movimientosdetallados.setiva(movimientosdetalladosOrigen.getiva());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getcosto_unitario()!=null && !movimientosdetalladosOrigen.getcosto_unitario().equals(0.0))) {movimientosdetallados.setcosto_unitario(movimientosdetalladosOrigen.getcosto_unitario());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getcosto_total()!=null && !movimientosdetalladosOrigen.getcosto_total().equals(0.0))) {movimientosdetallados.setcosto_total(movimientosdetalladosOrigen.getcosto_total());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getice()!=null && !movimientosdetalladosOrigen.getice().equals(0.0))) {movimientosdetallados.setice(movimientosdetalladosOrigen.getice());}
			if(conDefault || (!conDefault && movimientosdetalladosOrigen.getcodigo_producto()!=null && !movimientosdetalladosOrigen.getcodigo_producto().equals(""))) {movimientosdetallados.setcodigo_producto(movimientosdetalladosOrigen.getcodigo_producto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMovimientosDetallados(MovimientosDetallados movimientosdetallados) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setText(movimientosdetallados.getId().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setText(movimientosdetallados.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setText(movimientosdetallados.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setText(movimientosdetallados.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setText(movimientosdetallados.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setText(movimientosdetallados.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setText(movimientosdetallados.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setDate(movimientosdetallados.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setText(movimientosdetallados.getnombre_producto());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setText(movimientosdetallados.getnombre_unidad());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setText(movimientosdetallados.getcantidad().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setText(movimientosdetallados.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setText(movimientosdetallados.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setText(movimientosdetallados.getcosto_total().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setText(movimientosdetallados.getice().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setText(movimientosdetallados.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMovimientosDetallados(MovimientosDetalladosBean movimientosdetalladosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setText(movimientosdetalladosBean.getId().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setText(movimientosdetalladosBean.getnombre_sucursal());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setText(movimientosdetalladosBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setText(movimientosdetalladosBean.getnombre_transaccion());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setText(movimientosdetalladosBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setText(movimientosdetalladosBean.getnumero_factura());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setText(movimientosdetalladosBean.getnumero_secuencial());
			this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setDate(movimientosdetalladosBean.getfecha_emision());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setText(movimientosdetalladosBean.getnombre_producto());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setText(movimientosdetalladosBean.getnombre_unidad());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setText(movimientosdetalladosBean.getcantidad().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setText(movimientosdetalladosBean.getiva().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setText(movimientosdetalladosBean.getcosto_unitario().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setText(movimientosdetalladosBean.getcosto_total().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setText(movimientosdetalladosBean.getice().toString());
			this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setText(movimientosdetalladosBean.getcodigo_producto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMovimientosDetallados(MovimientosDetalladosParameterReturnGeneral movimientosdetalladosReturnGeneral,MovimientosDetalladosBean movimientosdetalladosBean,Boolean conDefault) throws Exception { 
		try {
			MovimientosDetallados movimientosdetalladosLocal=new MovimientosDetallados();
			
			movimientosdetalladosLocal=movimientosdetalladosReturnGeneral.getMovimientosDetallados();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && movimientosdetalladosLocal.getId()!=null && !movimientosdetalladosLocal.getId().equals(0L))) {movimientosdetalladosBean.setId(movimientosdetalladosLocal.getId());}}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnombre_sucursal()!=null && !movimientosdetalladosLocal.getnombre_sucursal().equals(""))) {movimientosdetalladosBean.setnombre_sucursal(movimientosdetalladosLocal.getnombre_sucursal());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnombre_completo_cliente()!=null && !movimientosdetalladosLocal.getnombre_completo_cliente().equals(""))) {movimientosdetalladosBean.setnombre_completo_cliente(movimientosdetalladosLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnombre_transaccion()!=null && !movimientosdetalladosLocal.getnombre_transaccion().equals(""))) {movimientosdetalladosBean.setnombre_transaccion(movimientosdetalladosLocal.getnombre_transaccion());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnumero_comprobante()!=null && !movimientosdetalladosLocal.getnumero_comprobante().equals(""))) {movimientosdetalladosBean.setnumero_comprobante(movimientosdetalladosLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnumero_factura()!=null && !movimientosdetalladosLocal.getnumero_factura().equals(""))) {movimientosdetalladosBean.setnumero_factura(movimientosdetalladosLocal.getnumero_factura());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnumero_secuencial()!=null && !movimientosdetalladosLocal.getnumero_secuencial().equals(""))) {movimientosdetalladosBean.setnumero_secuencial(movimientosdetalladosLocal.getnumero_secuencial());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getfecha_emision()!=null && !movimientosdetalladosLocal.getfecha_emision().equals(new Date()))) {movimientosdetalladosBean.setfecha_emision(movimientosdetalladosLocal.getfecha_emision());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnombre_producto()!=null && !movimientosdetalladosLocal.getnombre_producto().equals(""))) {movimientosdetalladosBean.setnombre_producto(movimientosdetalladosLocal.getnombre_producto());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getnombre_unidad()!=null && !movimientosdetalladosLocal.getnombre_unidad().equals(""))) {movimientosdetalladosBean.setnombre_unidad(movimientosdetalladosLocal.getnombre_unidad());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getcantidad()!=null && !movimientosdetalladosLocal.getcantidad().equals(0))) {movimientosdetalladosBean.setcantidad(movimientosdetalladosLocal.getcantidad());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getiva()!=null && !movimientosdetalladosLocal.getiva().equals(0.0))) {movimientosdetalladosBean.setiva(movimientosdetalladosLocal.getiva());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getcosto_unitario()!=null && !movimientosdetalladosLocal.getcosto_unitario().equals(0.0))) {movimientosdetalladosBean.setcosto_unitario(movimientosdetalladosLocal.getcosto_unitario());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getcosto_total()!=null && !movimientosdetalladosLocal.getcosto_total().equals(0.0))) {movimientosdetalladosBean.setcosto_total(movimientosdetalladosLocal.getcosto_total());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getice()!=null && !movimientosdetalladosLocal.getice().equals(0.0))) {movimientosdetalladosBean.setice(movimientosdetalladosLocal.getice());}
			if(conDefault || (!conDefault && movimientosdetalladosLocal.getcodigo_producto()!=null && !movimientosdetalladosLocal.getcodigo_producto().equals(""))) {movimientosdetalladosBean.setcodigo_producto(movimientosdetalladosLocal.getcodigo_producto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMovimientosDetalladosGenerico(Long idMovimientosDetalladosSeleccionado,JComboBox jComboBoxMovimientosDetallados,List<MovimientosDetallados> movimientosdetalladossLocal)throws Exception {
		try {
			MovimientosDetallados  movimientosdetalladosTemp=null;

			for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossLocal) {
				if(movimientosdetalladosAux.getId()!=null && movimientosdetalladosAux.getId().equals(idMovimientosDetalladosSeleccionado)) {
					movimientosdetalladosTemp=movimientosdetalladosAux;
					break;
				}
			}

			jComboBoxMovimientosDetallados.setSelectedItem(movimientosdetalladosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMovimientosDetalladosGenerico(JComboBox jComboBoxMovimientosDetallados,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMovimientosDetallados.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMovimientosDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMovimientosDetallados.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMovimientosDetallados.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMovimientosDetallados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMovimientosDetallados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosdetallados=(MovimientosDetallados) movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			movimientosdetallados =(MovimientosDetallados) movimientosdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getlineagrupo_descripcion();
			} else {
				//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getlineacategoria_descripcion();
			} else {
				//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!movimientosdetallados.getIsNew() && !movimientosdetallados.getIsChanged() && !movimientosdetallados.getIsDeleted()) {
				sDescripcion=movimientosdetallados.getlineamarca_descripcion();
			} else {
				//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
				sDescripcion=movimientosdetallados.getlineamarca_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		MovimientosDetallados movimientosdetalladosRow=new MovimientosDetallados();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosdetalladosRow=(MovimientosDetallados) movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			movimientosdetalladosRow=(MovimientosDetallados) movimientosdetalladoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMovimientosDetallados(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));			
			this.jButtonDuplicarMovimientosDetallados.setVisible((this.isVisibilidadCeldaDuplicarMovimientosDetallados && this.isPermisoDuplicarMovimientosDetallados));			
			this.jButtonCopiarMovimientosDetallados.setVisible((this.isVisibilidadCeldaCopiarMovimientosDetallados && this.isPermisoCopiarMovimientosDetallados));
			this.jButtonVerFormMovimientosDetallados.setVisible((this.isVisibilidadCeldaVerFormMovimientosDetallados && this.isPermisoVerFormMovimientosDetallados));
			
			this.jButtonAbrirOrderByMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));			
			
			this.jButtonNuevoRelacionesMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));			
			this.jButtonNuevoGuardarCambiosMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarMovimientosDetallados.setVisible((this.isVisibilidadCeldaModificarMovimientosDetallados && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.setVisible((this.isVisibilidadCeldaActualizarMovimientosDetallados && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.setVisible((this.isVisibilidadCeldaEliminarMovimientosDetallados && this.isPermisoEliminarMovimientosDetallados));
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.setVisible(this.isVisibilidadCeldaCancelarMovimientosDetallados);							
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));			
			
			}
						
			this.jButtonGuardarCambiosTablaMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));						
			this.jButtonDuplicarToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaDuplicarMovimientosDetallados && this.isPermisoDuplicarMovimientosDetallados));						
			this.jButtonCopiarToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaCopiarMovimientosDetallados && this.isPermisoCopiarMovimientosDetallados));			
			this.jButtonVerFormToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaVerFormMovimientosDetallados && this.isPermisoVerFormMovimientosDetallados));			
			this.jButtonAbrirOrderByToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));
			this.jButtonNuevoRelacionesToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));			
			this.jButtonNuevoGuardarCambiosToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));			
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaModificarMovimientosDetallados && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaActualizarMovimientosDetallados  && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaEliminarMovimientosDetallados && this.isPermisoEliminarMovimientosDetallados));
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarToolBarMovimientosDetallados.setVisible(this.isVisibilidadCeldaCancelarMovimientosDetallados);				
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));			
			this.jMenuItemDuplicarMovimientosDetallados.setVisible((this.isVisibilidadCeldaDuplicarMovimientosDetallados && this.isPermisoDuplicarMovimientosDetallados));			
			this.jMenuItemCopiarMovimientosDetallados.setVisible((this.isVisibilidadCeldaCopiarMovimientosDetallados && this.isPermisoCopiarMovimientosDetallados));			
			this.jMenuItemVerFormMovimientosDetallados.setVisible((this.isVisibilidadCeldaVerFormMovimientosDetallados && this.isPermisoVerFormMovimientosDetallados));			
			this.jMenuItemAbrirOrderByMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));			
			//this.jMenuItemMostrarOcultarMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));
			this.jMenuItemDetalleAbrirOrderByMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));			
			//this.jMenuItemDetalleMostrarOcultarMovimientosDetallados.setVisible((this.isVisibilidadCeldaOrdenMovimientosDetallados && this.isPermisoOrdenMovimientosDetallados));			
			this.jMenuItemNuevoRelacionesMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados));			
			this.jMenuItemNuevoGuardarCambiosMovimientosDetallados.setVisible((this.isVisibilidadCeldaNuevoMovimientosDetallados && this.isPermisoNuevoMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));									
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemModificarMovimientosDetallados.setVisible((this.isVisibilidadCeldaModificarMovimientosDetallados && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemActualizarMovimientosDetallados.setVisible((this.isVisibilidadCeldaActualizarMovimientosDetallados && this.isPermisoActualizarMovimientosDetallados));	
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemEliminarMovimientosDetallados.setVisible((this.isVisibilidadCeldaEliminarMovimientosDetallados && this.isPermisoEliminarMovimientosDetallados));
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemCancelarMovimientosDetallados.setVisible(this.isVisibilidadCeldaCancelarMovimientosDetallados);				
			}
			
			this.jMenuItemGuardarCambiosMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));						
			this.jMenuItemGuardarCambiosTablaMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=this.jButtonNuevoMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaDuplicarMovimientosDetallados=this.jButtonDuplicarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaCopiarMovimientosDetallados=this.jButtonCopiarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaVerFormMovimientosDetallados=this.jButtonVerFormMovimientosDetallados.isVisible();
			
			this.isVisibilidadCeldaOrdenMovimientosDetallados=this.jButtonAbrirOrderByMovimientosDetallados.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=this.jButtonNuevoRelacionesMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaModificarMovimientosDetallados=this.jButtonModificarMovimientosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.isVisibilidadCeldaActualizarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=this.jButtonGuardarCambiosTablaMovimientosDetallados.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMovimientosDetallados=this.jButtonNuevoToolBarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=this.jButtonNuevoRelacionesToolBarMovimientosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.isVisibilidadCeldaModificarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarToolBarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaActualizarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarToolBarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarToolBarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarToolBarMovimientosDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMovimientosDetallados=this.jButtonGuardarCambiosToolBarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMovimientosDetallados=this.jMenuItemNuevoMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=this.jMenuItemNuevoRelacionesMovimientosDetallados.isVisible();
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.isVisibilidadCeldaModificarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemModificarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaActualizarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemActualizarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaEliminarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemEliminarMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaCancelarMovimientosDetallados=this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemCancelarMovimientosDetallados.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMovimientosDetallados=this.jMenuItemGuardarCambiosMovimientosDetallados.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=this.jMenuItemGuardarCambiosTablaMovimientosDetallados.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMovimientosDetallados(Boolean esInicializar) {
		if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
				//if(this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMovimientosDetallados();
			}
			
			this.inicializarActualizarBindingBotonesManualMovimientosDetallados(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMovimientosDetallados() {
		this.jButtonNuevoMovimientosDetallados.setVisible(this.isPermisoNuevoMovimientosDetallados);			
		this.jButtonDuplicarMovimientosDetallados.setVisible(this.isPermisoDuplicarMovimientosDetallados);			
		this.jButtonCopiarMovimientosDetallados.setVisible(this.isPermisoCopiarMovimientosDetallados);			
		this.jButtonVerFormMovimientosDetallados.setVisible(this.isPermisoVerFormMovimientosDetallados);			
		
		this.jButtonAbrirOrderByMovimientosDetallados.setVisible(this.isPermisoOrdenMovimientosDetallados);					
		
		this.jButtonNuevoRelacionesMovimientosDetallados.setVisible(this.isPermisoNuevoMovimientosDetallados);			
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarMovimientosDetallados.setVisible(this.isPermisoActualizarMovimientosDetallados);	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.setVisible(this.isPermisoActualizarMovimientosDetallados);	
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.setVisible(this.isPermisoEliminarMovimientosDetallados);
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.setVisible(this.isVisibilidadCeldaCancelarMovimientosDetallados);						
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.setVisible(this.isPermisoGuardarCambiosMovimientosDetallados);							
		}
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.setVisible(this.isPermisoActualizarMovimientosDetallados);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMovimientosDetallados() {
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarMovimientosDetallados.setVisible(this.isPermisoActualizarMovimientosDetallados);	
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.setVisible(this.isPermisoActualizarMovimientosDetallados);	
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.setVisible(this.isPermisoEliminarMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.setVisible(this.isVisibilidadCeldaCancelarMovimientosDetallados);							
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.setVisible((this.isVisibilidadCeldaGuardarMovimientosDetallados && this.isPermisoGuardarCambiosMovimientosDetallados));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMovimientosDetallados() {
		if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMovimientosDetallados();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMovimientosDetallados() {
	}
	
	public void jTableDatosMovimientosDetalladosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMovimientosDetallados(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.movimientosdetallados.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.movimientosdetallados.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.movimientosdetallados.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.movimientosdetallados.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> TRANSACCION");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.movimientosdetallados.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.movimientosdetallados.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.movimientosdetallados.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.movimientosdetallados.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaMovimientosDetalladosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebMovimientosDetallados(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosMovimientosDetallados.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosMovimientosDetallados.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.movimientosdetalladosLogic.getConnexion());

				if(this.movimientosdetallados.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.movimientosdetallados.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderMovimientosDetallados=(TitledBorder)this.jScrollPanelDatosMovimientosDetallados.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderMovimientosDetallados.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.movimientosdetallados.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.movimientosdetallados.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.movimientosdetallados.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sucursalMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnombre_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sucursal like '%"+this.movimientosdetallados.getnombre_sucursal()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.movimientosdetallados.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_transaccionMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnombre_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_transaccion like '%"+this.movimientosdetallados.getnombre_transaccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.movimientosdetallados.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.movimientosdetallados.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnumero_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuencial like '%"+this.movimientosdetallados.getnumero_secuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.movimientosdetallados.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_productoMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnombre_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_producto like '%"+this.movimientosdetallados.getnombre_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_unidadMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getnombre_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_unidad like '%"+this.movimientosdetallados.getnombre_unidad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.movimientosdetallados.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.movimientosdetallados.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_unitarioMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getcosto_unitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_unitario = "+this.movimientosdetallados.getcosto_unitario().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_totalMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getcosto_total()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_total = "+this.movimientosdetallados.getcosto_total().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.movimientosdetallados.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_productoMovimientosDetalladosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.getmovimientosdetallados(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.movimientosdetallados==null) {
						this.movimientosdetallados = new MovimientosDetallados();
					}

					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);
				}

				if(this.movimientosdetallados.getcodigo_producto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_producto like '%"+this.movimientosdetallados.getcodigo_producto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMovimientosDetallados(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaMovimientosDetalladosMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossBusquedaMovimientosDetallados();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdCliente();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdEmpresa();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdLinea();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdLineaCategoria();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdLineaGrupo();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdLineaMarca();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdSucursal();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionMovimientosDetalladosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingMovimientosDetallados(false,false);

			this.getMovimientosDetalladossFK_IdTransaccion();

			this.inicializarActualizarBindingMovimientosDetallados(false);

			//if(MovimientosDetalladosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingMovimientosDetallados(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.movimientosdetalladosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameMovimientosDetallados() {
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
			this.jInternalFrameDetalleFormMovimientosDetallados.setVisible(false);	    			
			this.jInternalFrameDetalleFormMovimientosDetallados.dispose();
			this.jInternalFrameDetalleFormMovimientosDetallados=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
			this.jInternalFrameReporteDinamicoMovimientosDetallados.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMovimientosDetallados.dispose();
			this.jInternalFrameReporteDinamicoMovimientosDetallados=null;
		}
		
		if(this.jInternalFrameImportacionMovimientosDetallados!=null) {
			this.jInternalFrameImportacionMovimientosDetallados.setVisible(false);	    			
			this.jInternalFrameImportacionMovimientosDetallados.dispose();
			this.jInternalFrameImportacionMovimientosDetallados=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMovimientosDetallados();
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			
			if(sTipo.equals("NuevoMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMovimientosDetallados")) {
				jButtonDuplicarMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMovimientosDetallados")) {
				jButtonCopiarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormMovimientosDetallados")) {
				jButtonVerFormMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMovimientosDetallados")) {
				jButtonDuplicarMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMovimientosDetallados")) {
				jButtonDuplicarMovimientosDetalladosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMovimientosDetallados")) {
				jButtonModificarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMovimientosDetallados")) {
				jButtonModificarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMovimientosDetallados")) {
				jButtonModificarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMovimientosDetallados")) {
				jButtonActualizarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMovimientosDetallados")) {
				jButtonActualizarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMovimientosDetallados")) {
				jButtonActualizarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarMovimientosDetallados")) {
				jButtonEliminarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMovimientosDetallados")) {
				jButtonEliminarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMovimientosDetallados")) {
				jButtonEliminarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarMovimientosDetallados")) {
				jButtonCancelarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMovimientosDetallados")) {
				jButtonCancelarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMovimientosDetallados")) {
				jButtonCancelarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarMovimientosDetallados")) {
				jButtonCerrarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMovimientosDetallados")) {
				jButtonCerrarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMovimientosDetallados")) {
				jButtonCerrarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMovimientosDetallados")) {
				jButtonMostrarOcultarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMovimientosDetallados")) {
				jButtonCancelarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMovimientosDetallados")) {
				jButtonCopiarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMovimientosDetallados")) {
				jButtonVerFormMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMovimientosDetallados")) {
				jButtonCopiarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMovimientosDetallados")) {
				jButtonVerFormMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMovimientosDetallados")) {
				jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMovimientosDetallados")) {
				jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMovimientosDetallados")) {
				jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMovimientosDetallados")) {
				jButtonAnterioresMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMovimientosDetallados")) {
				jButtonAnterioresMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMovimientosDetallados")) {
				jButtonAnterioresMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMovimientosDetallados")) {
				jButtonSiguientesMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMovimientosDetallados")) {
				jButtonSiguientesMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMovimientosDetallados")) {
				jButtonSiguientesMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMovimientosDetallados") || sTipo.equals("MenuItemDetalleAbrirOrderByMovimientosDetallados")) {
				jButtonAbrirOrderByMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMovimientosDetallados") || sTipo.equals("MenuItemDetalleMostrarOcultarMovimientosDetallados")) {
				jButtonMostrarOcultarMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMovimientosDetallados")) {
				jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMovimientosDetallados")) {
				jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMovimientosDetallados")) {
				jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMovimientosDetallados")) {
				jButtonCerrarReporteDinamicoMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMovimientosDetallados")) {
				jButtonGenerarReporteDinamicoMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMovimientosDetallados")) {
				
				jButtonGenerarExcelReporteDinamicoMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMovimientosDetallados")) {
				jButtonCerrarImportacionMovimientosDetalladosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMovimientosDetallados")) {
				
				jButtonGenerarImportacionMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMovimientosDetallados")) {
				
				jButtonAbrirImportacionMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMovimientosDetallados")) {
				jComboBoxTiposAccionesMovimientosDetalladosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMovimientosDetallados")) {
				jComboBoxTiposRelacionesMovimientosDetalladosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMovimientosDetallados")) {
				jComboBoxTiposAccionesMovimientosDetalladosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMovimientosDetallados")) {
				
				jComboBoxTiposSeleccionarMovimientosDetalladosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMovimientosDetallados")) {
				jTextFieldValorCampoGeneralMovimientosDetalladosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMovimientosDetallados")) {
				jButtonAbrirOrderByMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMovimientosDetallados")) {
				jButtonAbrirOrderByMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMovimientosDetallados")) {
				jButtonCerrarOrderByMovimientosDetalladosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMovimientosDetalladosBusqueda")) {
				this.jButtonidMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMovimientosDetalladosUpdate")) {
				this.jButtonid_empresaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMovimientosDetalladosBusqueda")) {
				this.jButtonid_empresaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMovimientosDetalladosUpdate")) {
				this.jButtonid_sucursalMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMovimientosDetalladosBusqueda")) {
				this.jButtonid_sucursalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteMovimientosDetalladosUpdate")) {
				this.jButtonid_clienteMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteMovimientosDetalladosBusqueda")) {
				this.jButtonid_clienteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionMovimientosDetalladosUpdate")) {
				this.jButtonid_transaccionMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionMovimientosDetalladosBusqueda")) {
				this.jButtonid_transaccionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaMovimientosDetalladosUpdate")) {
				this.jButtonid_lineaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaMovimientosDetalladosBusqueda")) {
				this.jButtonid_lineaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_grupoMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_grupoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_categoriaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_categoriaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_marcaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_marcaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emision_desdeMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emision_hastaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_sucursalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_completo_clienteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_transaccionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_comprobanteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_facturaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_secuencialMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emisionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_productoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_unidadMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadMovimientosDetalladosBusqueda")) {
				this.jButtoncantidadMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaMovimientosDetalladosBusqueda")) {
				this.jButtonivaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioMovimientosDetalladosBusqueda")) {
				this.jButtoncosto_unitarioMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalMovimientosDetalladosBusqueda")) {
				this.jButtoncosto_totalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceMovimientosDetalladosBusqueda")) {
				this.jButtoniceMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoMovimientosDetalladosBusqueda")) {
				this.jButtoncodigo_productoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaMovimientosDetalladosMovimientosDetallados")) {
				this.jButtonBusquedaMovimientosDetalladosMovimientosDetalladosActionPerformed(evt);
			}
			
			;
			
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMovimientosDetallados();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			MovimientosDetallados movimientosdetalladosLocal=null;
			
			if(!this.getEsControlTabla()) {
				movimientosdetalladosLocal=this.movimientosdetallados;
			} else {
				movimientosdetalladosLocal=this.movimientosdetalladosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
							
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
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
			
			


			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
								
						
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
								
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
							
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
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
			
			


			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
								
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
			
			this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMovimientosDetallados")) {
					jCheckBoxSeleccionarTodosMovimientosDetalladosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMovimientosDetallados")) {
					jCheckBoxSeleccionadosMovimientosDetalladosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMovimientosDetallados")) {
					
				}
				
				


				
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
												
				
				


				
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
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
			
			


			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMovimientosDetalladosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.movimientosdetallados);
				
				this.actualizarInformacion("INFO_PADRE",false,this.movimientosdetallados);
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
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
				
				


				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(MovimientosDetallados.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",MovimientosDetallados.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMovimientosDetalladosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.movimientosdetalladosAnterior =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMovimientosDetallados")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMovimientosDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMovimientosDetallados.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.movimientosdetallados =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.movimientosdetallados);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMovimientosDetallados")) {
				
				}
				
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMovimientosDetallados")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMovimientosDetallados.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMovimientosDetallados")) {
			
			}
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMovimientosDetallados();
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			if(sTipo.equals("NuevoMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMovimientosDetallados")) {
				jButtonDuplicarMovimientosDetalladosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMovimientosDetallados")) {
				jButtonCopiarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMovimientosDetallados")) {
				jButtonVerFormMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMovimientosDetallados")) {
				jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMovimientosDetallados")) {
				jButtonModificarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMovimientosDetallados")) {
				jButtonActualizarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMovimientosDetallados")) {
				jButtonEliminarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMovimientosDetallados")) {
				jButtonCancelarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMovimientosDetallados")) {
				jButtonCerrarMovimientosDetalladosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMovimientosDetallados")) {
				jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMovimientosDetallados")) {
				jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMovimientosDetallados")) {
				jButtonAbrirOrderByMovimientosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMovimientosDetallados")) {
				jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMovimientosDetallados")) {
				jButtonAnterioresMovimientosDetalladosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMovimientosDetallados")) {
				jButtonSiguientesMovimientosDetalladosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMovimientosDetalladosBusqueda")) {
				this.jButtonidMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaMovimientosDetalladosUpdate")) {
				this.jButtonid_empresaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaMovimientosDetalladosBusqueda")) {
				this.jButtonid_empresaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalMovimientosDetalladosUpdate")) {
				this.jButtonid_sucursalMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalMovimientosDetalladosBusqueda")) {
				this.jButtonid_sucursalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteMovimientosDetalladosUpdate")) {
				this.jButtonid_clienteMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteMovimientosDetalladosBusqueda")) {
				this.jButtonid_clienteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionMovimientosDetalladosUpdate")) {
				this.jButtonid_transaccionMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionMovimientosDetalladosBusqueda")) {
				this.jButtonid_transaccionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaMovimientosDetalladosUpdate")) {
				this.jButtonid_lineaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaMovimientosDetalladosBusqueda")) {
				this.jButtonid_lineaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_grupoMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_grupoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_categoriaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_categoriaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaMovimientosDetalladosUpdate")) {
				this.jButtonid_linea_marcaMovimientosDetalladosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaMovimientosDetalladosBusqueda")) {
				this.jButtonid_linea_marcaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emision_desdeMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emision_hastaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sucursalMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_sucursalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_completo_clienteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_transaccionMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_transaccionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_comprobanteMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_facturaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialMovimientosDetalladosBusqueda")) {
				this.jButtonnumero_secuencialMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionMovimientosDetalladosBusqueda")) {
				this.jButtonfecha_emisionMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_productoMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_productoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_unidadMovimientosDetalladosBusqueda")) {
				this.jButtonnombre_unidadMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadMovimientosDetalladosBusqueda")) {
				this.jButtoncantidadMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaMovimientosDetalladosBusqueda")) {
				this.jButtonivaMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_unitarioMovimientosDetalladosBusqueda")) {
				this.jButtoncosto_unitarioMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_totalMovimientosDetalladosBusqueda")) {
				this.jButtoncosto_totalMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceMovimientosDetalladosBusqueda")) {
				this.jButtoniceMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_productoMovimientosDetalladosBusqueda")) {
				this.jButtoncodigo_productoMovimientosDetalladosBusquedaActionPerformed(evt);
			}
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMovimientosDetallados();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMovimientosDetallados")) {
				closingInternalFrameMovimientosDetallados();
				
			} else if(sTipo.equals("jButtonCancelarMovimientosDetallados")) {
				JInternalFrameBase jInternalFrameDetalleFormMovimientosDetallados = (JInternalFrameBase)evt.getSource();
	            	
	            MovimientosDetalladosBeanSwingJInternalFrame jInternalFrameParent=(MovimientosDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormMovimientosDetallados.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMovimientosDetalladosActionPerformed(null);
			}
			
			MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.movimientosdetallados,new Object(),this.movimientosdetalladosParameterGeneral,this.movimientosdetalladosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMovimientosDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMovimientosDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMovimientosDetallados(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.movimientosdetallados)) {
			if(!esControlTabla) {
				if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);			
				}
				
				if(this.movimientosdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMovimientosDetallados(this.movimientosdetallados,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMovimientosDetallados(this.movimientosdetalladosReturnGeneral,this.movimientosdetalladosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.movimientosdetalladosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMovimientosDetallados(classes,this.movimientosdetalladosReturnGeneral,this.movimientosdetalladosBean,false);
					}
						
					if(this.movimientosdetalladosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados());	
					}
						
					if(this.movimientosdetalladosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados(),classes);//this.movimientosdetalladosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMovimientosDetallados(this.movimientosdetallados,classes);//this.movimientosdetalladosBean);									
				}
			
				if(MovimientosDetalladosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMovimientosDetallados(this.movimientosdetallados,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMovimientosDetallados(this.movimientosdetallados);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.movimientosdetalladosAnterior!=null) {
						this.movimientosdetallados=this.movimientosdetalladosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.movimientosdetalladosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.movimientosdetalladosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados(),movimientosdetalladosLogic.getMovimientosDetalladoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.movimientosdetalladosReturnGeneral.getMovimientosDetallados(),this.movimientosdetalladoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMovimientosDetallados.repaint();
				
				//((AbstractTableModel) this.jTableDatosMovimientosDetallados.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMovimientosDetallados();
			}
		}
	}
	
	public void actualizarVisualTableDatosMovimientosDetallados() throws Exception {
		
		MovimientosDetalladosModel movimientosdetalladosModel=(MovimientosDetalladosModel)this.jTableDatosMovimientosDetallados.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			movimientosdetalladosModel.movimientosdetalladoss=this.movimientosdetalladosLogic.getMovimientosDetalladoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			movimientosdetalladosModel.movimientosdetalladoss=this.movimientosdetalladoss;
		}
		
		
		((MovimientosDetalladosModel) this.jTableDatosMovimientosDetallados.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMovimientosDetallados() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmovimientosdetalladosAnterior(),this.movimientosdetalladosLogic.getMovimientosDetalladoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmovimientosdetalladosAnterior(),this.movimientosdetalladoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMovimientosDetallados();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMovimientosDetallados(MovimientosDetallados movimientosdetallados,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
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
										
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.movimientosdetallados,new Object(),generalEntityParameterGeneral,this.movimientosdetalladosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MovimientosDetalladosConstantesFunciones.getClassesRelationshipsOfMovimientosDetallados(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MovimientosDetalladosConstantesFunciones.getClassesRelationshipsFromStringsOfMovimientosDetallados(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMovimientosDetallados(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MovimientosDetalladosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.movimientosdetallados,new Object(),generalEntityParameterGeneral,this.movimientosdetalladosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMovimientosDetallados(MovimientosDetalladosBean movimientosdetalladosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMovimientosDetallados(ArrayList<Classe> classes,MovimientosDetalladosReturnGeneral movimientosdetalladosReturnGeneral,MovimientosDetalladosBean movimientosdetalladosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMovimientosDetallados(MovimientosDetallados movimientosdetallados,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.movimientosdetallados)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMovimientosDetallados = new MovimientosDetalladosDetalleFormJInternalFrame(jDesktopPane,this.movimientosdetalladosSessionBean.getConGuardarRelaciones(),this.movimientosdetalladosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.setVisible(false);
		this.jInternalFrameDetalleFormMovimientosDetallados.setSelected(false);						
		
		this.jInternalFrameDetalleFormMovimientosDetallados.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMovimientosDetallados.movimientosdetalladosLogic=this.movimientosdetalladosLogic;
		
		this.cargarCombosFrameForeignKeyMovimientosDetallados("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMovimientosDetallados();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMovimientosDetallados();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMovimientosDetallados("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMovimientosDetallados();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMovimientosDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMovimientosDetallados"));
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ModificarMovimientosDetallados"));

		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarMovimientosDetallados"));
					
		this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemModificarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarMovimientosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"ActualizarMovimientosDetallados"));
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMovimientosDetallados"));
						
		this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemActualizarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMovimientosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"EliminarMovimientosDetallados"));
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarMovimientosDetallados"));
								
		this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemEliminarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMovimientosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CancelarMovimientosDetallados"));
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarMovimientosDetallados"));
					
		this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemCancelarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMovimientosDetallados"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemDetalleCerrarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMovimientosDetallados"));		
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosDetallados"));
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosDetallados"));
		
		
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMovimientosDetallados"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonidMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_facturaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_secuencialMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emisionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_unidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncantidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonivaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_unitarioMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_totalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoniceMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncodigo_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoMovimientosDetalladosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMovimientosDetallados"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMovimientosDetallados"));
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMovimientosDetallados"));
		}
		
		this.jTableDatosMovimientosDetallados.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMovimientosDetallados"));
		
		this.jTableDatosMovimientosDetallados.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMovimientosDetallados"));
		
		this.jButtonNuevoMovimientosDetallados.addActionListener(new ButtonActionListener(this,"NuevoMovimientosDetallados"));
		
		this.jButtonDuplicarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"DuplicarMovimientosDetallados"));
		
		this.jButtonCopiarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"CopiarMovimientosDetallados"));
		
		this.jButtonVerFormMovimientosDetallados.addActionListener(new ButtonActionListener(this,"VerFormMovimientosDetallados"));
		
		
		this.jButtonNuevoToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"NuevoToolBarMovimientosDetallados"));
			
		this.jButtonDuplicarToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMovimientosDetallados"));
			
		this.jMenuItemNuevoMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMovimientosDetallados"));
			
		this.jMenuItemDuplicarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMovimientosDetallados"));		
		
		
		this.jButtonNuevoRelacionesMovimientosDetallados.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMovimientosDetallados"));
		
		
		this.jButtonNuevoRelacionesToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMovimientosDetallados"));
			
		this.jMenuItemNuevoRelacionesMovimientosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMovimientosDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ModificarMovimientosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonModificarToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ModificarToolBarMovimientosDetallados"));
			
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemModificarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"MenuItemModificarMovimientosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"ActualizarMovimientosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonActualizarToolBarMovimientosDetallados.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMovimientosDetallados"));
				
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemActualizarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMovimientosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"EliminarMovimientosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonEliminarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"EliminarToolBarMovimientosDetallados"));
						
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemEliminarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMovimientosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CancelarMovimientosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonCancelarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CancelarToolBarMovimientosDetallados"));
			
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemCancelarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMovimientosDetallados"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMovimientosDetallados"));		
		
		
		this.jButtonCerrarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CerrarMovimientosDetallados"));
		
		
		this.jButtonCerrarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CerrarToolBarMovimientosDetallados"));
			
		this.jMenuItemCerrarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMovimientosDetallados"));
			
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jMenuItemDetalleCerrarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMovimientosDetallados"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosMovimientosDetallados"));
		}
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMovimientosDetallados"));
		}
		
		this.jButtonCopiarToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CopiarToolBarMovimientosDetallados"));
			
		this.jButtonVerFormToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"VerFormToolBarMovimientosDetallados"));
		
		this.jMenuItemGuardarCambiosMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMovimientosDetallados"));
			
		this.jMenuItemCopiarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMovimientosDetallados"));		
		
		this.jMenuItemVerFormMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMovimientosDetallados"));		
		
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMovimientosDetallados"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMovimientosDetallados"));
			
		this.jMenuItemGuardarCambiosTablaMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMovimientosDetallados"));		
		
		
		
		this.jButtonRecargarInformacionMovimientosDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionMovimientosDetallados"));
					
		this.jButtonRecargarInformacionToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMovimientosDetallados"));
		
		this.jMenuItemRecargarInformacionMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMovimientosDetallados"));		
		
		
		
		this.jButtonAnterioresMovimientosDetallados.addActionListener (new ButtonActionListener(this,"AnterioresMovimientosDetallados"));
		
		
		this.jButtonAnterioresToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMovimientosDetallados"));
		
		this.jMenuItemAnterioresMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMovimientosDetallados"));		
		
		
		this.jButtonSiguientesMovimientosDetallados.addActionListener (new ButtonActionListener(this,"SiguientesMovimientosDetallados"));
		
		
		this.jButtonSiguientesToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMovimientosDetallados"));
			
		this.jMenuItemSiguientesMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMovimientosDetallados"));
			
		this.jMenuItemAbrirOrderByMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMovimientosDetallados"));
			
		this.jMenuItemMostrarOcultarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMovimientosDetallados"));
			
		this.jMenuItemDetalleAbrirOrderByMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMovimientosDetallados"));
			
		this.jMenuItemDetalleMostarOcultarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMovimientosDetallados"));		
		
		
		this.jButtonNuevoGuardarCambiosMovimientosDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMovimientosDetallados"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMovimientosDetallados"));
			
		this.jMenuItemNuevoGuardarCambiosMovimientosDetallados.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMovimientosDetallados"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMovimientosDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMovimientosDetallados"));

		this.jCheckBoxSeleccionadosMovimientosDetallados.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMovimientosDetallados"));
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMovimientosDetallados"));
		}
		
		
		this.jComboBoxTiposRelacionesMovimientosDetallados.addActionListener (new ButtonActionListener(this,"TiposRelacionesMovimientosDetallados"));
			
		this.jComboBoxTiposAccionesMovimientosDetallados.addActionListener (new ButtonActionListener(this,"TiposAccionesMovimientosDetallados"));
					
		this.jComboBoxTiposSeleccionarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMovimientosDetallados"));
			
		this.jTextFieldValorCampoGeneralMovimientosDetallados.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMovimientosDetallados"));		
		
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonidMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_facturaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_secuencialMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emisionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_unidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncantidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonivaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_unitarioMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_totalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoniceMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncodigo_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoMovimientosDetalladosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados.addActionListener(new ButtonActionListener(this,"BusquedaMovimientosDetalladosMovimientosDetallados"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMovimientosDetallados!=null) {
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosDetallados"));
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosDetallados"));
				this.jInternalFrameReporteDinamicoMovimientosDetallados.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosDetallados"));
			}
			
			//this.jButtonCerrarReporteDinamicoMovimientosDetallados.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMovimientosDetallados"));				
			//this.jButtonGenerarReporteDinamicoMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMovimientosDetallados"));
			//this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMovimientosDetallados"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMovimientosDetallados!=null) {
				this.jInternalFrameImportacionMovimientosDetallados.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMovimientosDetallados"));
				this.jInternalFrameImportacionMovimientosDetallados.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMovimientosDetallados"));
				this.jInternalFrameImportacionMovimientosDetallados.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMovimientosDetallados"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMovimientosDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByMovimientosDetallados"));
			
			this.jButtonAbrirOrderByToolBarMovimientosDetallados.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMovimientosDetallados"));			
			
			if(this.jInternalFrameOrderByMovimientosDetallados!=null) {
				this.jInternalFrameOrderByMovimientosDetallados.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMovimientosDetallados"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMovimientosDetallados.jTabbedPaneRelacionesMovimientosDetallados.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMovimientosDetallados"));
		
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
            		closingInternalFrameMovimientosDetallados();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMovimientosDetallados.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMovimientosDetallados = (JInternalFrameBase)event.getSource();
	            	
	            MovimientosDetalladosBeanSwingJInternalFrame jInternalFrameParent=(MovimientosDetalladosBeanSwingJInternalFrame)jInternalFrameDetalleFormMovimientosDetallados.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMovimientosDetalladosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMovimientosDetallados.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMovimientosDetalladosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMovimientosDetallados.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMovimientosDetallados.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMovimientosDetallados";
		inputMap = this.jButtonNuevoMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMovimientosDetallados";
		inputMap = this.jButtonNuevoRelacionesMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMovimientosDetalladosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMovimientosDetallados";
		inputMap = this.jButtonModificarMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMovimientosDetallados";
		inputMap = this.jButtonActualizarMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMovimientosDetallados";
		inputMap = this.jButtonEliminarMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMovimientosDetallados";
		inputMap = this.jButtonCancelarMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMovimientosDetallados";
		inputMap = this.jButtonCerrarMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMovimientosDetallados";
		inputMap = this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonGuardarCambiosMovimientosDetallados.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMovimientosDetalladosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMovimientosDetallados.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMovimientosDetalladosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMovimientosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMovimientosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMovimientosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMovimientosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMovimientosDetallados.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMovimientosDetalladosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonidMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"idMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_empresaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_lineaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_grupoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_categoriaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaMovimientosDetalladosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonid_linea_marcaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_desdeMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emision_hastaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_sucursalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sucursalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_completo_clienteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_transaccionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_transaccionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_comprobanteMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_facturaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnumero_secuencialMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonfecha_emisionMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_productoMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonnombre_unidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_unidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncantidadMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"cantidadMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtonivaMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"ivaMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_unitarioMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_unitarioMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncosto_totalMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"costo_totalMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoniceMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"iceMovimientosDetalladosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMovimientosDetallados.jButtoncodigo_productoMovimientosDetalladosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_productoMovimientosDetalladosBusqueda"));
		
		
		this.jButtonBusquedaMovimientosDetalladosMovimientosDetallados.addActionListener(new ButtonActionListener(this,"BusquedaMovimientosDetalladosMovimientosDetallados"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMovimientosDetallados.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMovimientosDetalladosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMovimientosDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMovimientosDetallados.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMovimientosDetallados(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
					movimientosdetalladosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladoss) {
					movimientosdetalladosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMovimientosDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
						movimientosdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladoss) {
						movimientosdetalladosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMovimientosDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMovimientosDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMovimientosDetalladosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMovimientosDetallados.getSelectedRows();
			
			MovimientosDetallados movimientosdetalladosLocal=new MovimientosDetallados();
			
			//this.seleccionarTodosMovimientosDetallados(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					movimientosdetalladosLocal =(MovimientosDetallados) this.movimientosdetalladosLogic.getMovimientosDetalladoss().toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					movimientosdetalladosLocal =(MovimientosDetallados) this.movimientosdetalladoss.toArray()[this.jTableDatosMovimientosDetallados.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				movimientosdetalladosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
						movimientosdetalladosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladoss) {
						movimientosdetalladosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMovimientosDetallados.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMovimientosDetallados.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMovimientosDetallados,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMovimientosDetalladosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMovimientosDetalladosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMovimientosDetalladosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMovimientosDetallados.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladosLogic.getMovimientosDetalladoss()) {
				
						if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							movimientosdetalladosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							movimientosdetalladosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							movimientosdetalladosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							movimientosdetalladosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							movimientosdetalladosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							movimientosdetalladosAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							movimientosdetalladosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							movimientosdetalladosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							movimientosdetalladosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							movimientosdetalladosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							movimientosdetalladosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							movimientosdetalladosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_ICE)) {
							existe=true;
							movimientosdetalladosAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							movimientosdetalladosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladoss) {
					
						if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
							existe=true;
							movimientosdetalladosAux.setnombre_sucursal(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							movimientosdetalladosAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
							existe=true;
							movimientosdetalladosAux.setnombre_transaccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							movimientosdetalladosAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							movimientosdetalladosAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							movimientosdetalladosAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							movimientosdetalladosAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
							existe=true;
							movimientosdetalladosAux.setnombre_producto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
							existe=true;
							movimientosdetalladosAux.setnombre_unidad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							movimientosdetalladosAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IVA)) {
							existe=true;
							movimientosdetalladosAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO)) {
							existe=true;
							movimientosdetalladosAux.setcosto_unitario(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL)) {
							existe=true;
							movimientosdetalladosAux.setcosto_total(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_ICE)) {
							existe=true;
							movimientosdetalladosAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
							existe=true;
							movimientosdetalladosAux.setcodigo_producto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMovimientosDetalladosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMovimientosDetallados=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMovimientosDetallados.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMovimientosDetallados) {				
					conSplash=true;//false;										
					
					//this.startProcessMovimientosDetallados(conSplash);
				
					this.generarReporteMovimientosDetalladossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMovimientosDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMovimientosDetalladossSeleccionados(false);
				//this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMovimientosDetalladossSeleccionados(true);
				//this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMovimientosDetallados();
				
				this.exportarMovimientosDetalladossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMovimientosDetalladoss();
				//this.importarMovimientosDetalladoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMovimientosDetallados();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMovimientosDetalladossSeleccionados();
				//this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Movimientos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMovimientosDetallados();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMovimientosDetallados)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMovimientosDetallados(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
				}	
			} 			
			else if(MovimientosDetalladosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteMovimientosDetallados) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessMovimientosDetallados(conSplash);
					
						//this.actualizarParametrosGeneralMovimientosDetallados();
						
						this.generarReporteProcesoAccionMovimientosDetalladossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(MovimientosDetalladosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Movimientos DetalladosES SELECCIONADOS?", "MANTENIMIENTO DE Movimientos Detallados", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessMovimientosDetallados();
				
						this.actualizarParametrosGeneralMovimientosDetallados();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.movimientosdetalladosReturnGeneral=movimientosdetalladosLogic.procesarAccionMovimientosDetalladossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.movimientosdetalladosLogic.getMovimientosDetalladoss(),this.movimientosdetalladosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarMovimientosDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMovimientosDetallados();
					
					MovimientosDetalladosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarMovimientosDetalladosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesMovimientosDetallados.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxTiposAccionesFormularioMovimientosDetallados.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMovimientosDetallados(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMovimientosDetalladosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMovimientosDetallados();
			
			if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
			MovimientosDetallados movimientosdetallados=new MovimientosDetallados();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMovimientosDetallados(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMovimientosDetallados.getSelectedItem();
			
			
			
			
			movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
			//this.sTipoAccion;
			
			if(movimientosdetalladossSeleccionados.size()==1) {
				for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
					movimientosdetallados=movimientosdetalladosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMovimientosDetallados();
			
      		//this.finishProcessMovimientosDetallados(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMovimientosDetalladosReturnGeneral() throws Exception {
		if(this.movimientosdetalladosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.movimientosdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.movimientosdetalladosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.movimientosdetalladosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.movimientosdetalladosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.movimientosdetalladosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMovimientosDetallados(false);
		}
		
		if(this.movimientosdetalladosReturnGeneral.getConRetornoLista() || this.movimientosdetalladosReturnGeneral.getConRetornoObjeto()) {
			if(this.movimientosdetalladosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.movimientosdetalladosLogic.setMovimientosDetalladoss(this.movimientosdetalladosReturnGeneral.getMovimientosDetalladoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingMovimientosDetallados(false);
		}
	}
	
	public void actualizarParametrosGeneralMovimientosDetallados() throws Exception {
		
		
	}
	
	public ArrayList<MovimientosDetallados> getMovimientosDetalladossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMovimientosDetallados) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladosLogic.getMovimientosDetalladoss()) {
					if(movimientosdetalladosAux.getIsSelected()) {
						movimientosdetalladossSeleccionados.add(movimientosdetalladosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(MovimientosDetallados movimientosdetalladosAux:this.movimientosdetalladoss) {
					if(movimientosdetalladosAux.getIsSelected()) {
						movimientosdetalladossSeleccionados.add(movimientosdetalladosAux);				
					}
				}
			}
			
			if(movimientosdetalladossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						movimientosdetalladossSeleccionados.addAll(this.movimientosdetalladosLogic.getMovimientosDetalladoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						movimientosdetalladossSeleccionados.addAll(this.movimientosdetalladoss);				
					}
				}
			}
		} else {
			movimientosdetalladossSeleccionados.add(this.movimientosdetallados);
		}
		
		return movimientosdetalladossSeleccionados;
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
	
	public void generarReporteMovimientosDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMovimientosDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMovimientosDetalladossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMovimientosDetalladossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMovimientosDetalladossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Movimientos Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados);
		
	}	
	
	public void generarReporteNormalMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMovimientosDetalladossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMovimientosDetallados();
		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMovimientosDetallados();
		
		
		//this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados ,movimientosdetalladosImplementable,movimientosdetalladosImplementableHome);
	}
	
	public void mostrarImportacionMovimientosDetalladoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMovimientosDetallados();
		
		this.abrirFrameImportacionMovimientosDetallados();		
		
			
		//this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados ,movimientosdetalladosImplementable,movimientosdetalladosImplementableHome);
	}
	
	public void importarMovimientosDetalladoss() throws Exception {		
	
	}
	
	public void exportarMovimientosDetalladossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMovimientosDetalladossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMovimientosDetalladossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMovimientosDetalladossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Movimientos Detallados",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMovimientosDetallados(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMovimientosDetallados(movimientosdetalladosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//movimientosdetalladosAux.setsDetalleGeneralEntityReporte(movimientosdetalladosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMovimientosDetallados(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMovimientosDetallados(MovimientosDetallados movimientosdetallados,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=movimientosdetallados.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnombre_sucursal();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnombre_transaccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnumero_secuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnombre_producto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getnombre_unidad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getcosto_unitario().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getcosto_total().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=movimientosdetallados.getcodigo_producto();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("MovimientosDetalladoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMovimientosDetallados(row);				
				iRow++;
			}				
			
			for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMovimientosDetallados(movimientosdetalladosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMovimientosDetalladossSeleccionados() throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();		
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"movimientosdetallados.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("movimientosdetalladoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("movimientosdetallados");
			//elementRoot.appendChild(element);
		
			for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
				element = document.createElement("movimientosdetallados");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMovimientosDetallados(movimientosdetalladosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Movimientos Detallados",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMovimientosDetallados(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOUNITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_COSTOTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMovimientosDetallados(MovimientosDetallados movimientosdetallados,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnombre_sucursal());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnombre_transaccion());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnumero_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnombre_producto());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getnombre_unidad());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getcosto_unitario());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getcosto_total());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(movimientosdetallados.getcodigo_producto());				
	}
	
	public void setFilaDatosExportarXmlMovimientosDetallados(MovimientosDetallados movimientosdetallados,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MovimientosDetalladosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(movimientosdetallados.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MovimientosDetalladosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(movimientosdetallados.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(movimientosdetallados.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(movimientosdetallados.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(movimientosdetallados.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtransaccion_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(movimientosdetallados.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementlinea_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(movimientosdetallados.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(movimientosdetallados.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(movimientosdetallados.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(MovimientosDetalladosConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(movimientosdetallados.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementfecha_emision_desde = document.createElement(MovimientosDetalladosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(movimientosdetallados.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(MovimientosDetalladosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(movimientosdetallados.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_sucursal = document.createElement(MovimientosDetalladosConstantesFunciones.NOMBRESUCURSAL);
		elementnombre_sucursal.appendChild(document.createTextNode(movimientosdetallados.getnombre_sucursal().trim()));
		element.appendChild(elementnombre_sucursal);

		Element elementnombre_completo_cliente = document.createElement(MovimientosDetalladosConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(movimientosdetallados.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_transaccion = document.createElement(MovimientosDetalladosConstantesFunciones.NOMBRETRANSACCION);
		elementnombre_transaccion.appendChild(document.createTextNode(movimientosdetallados.getnombre_transaccion().trim()));
		element.appendChild(elementnombre_transaccion);

		Element elementnumero_comprobante = document.createElement(MovimientosDetalladosConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(movimientosdetallados.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementnumero_factura = document.createElement(MovimientosDetalladosConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(movimientosdetallados.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementnumero_secuencial = document.createElement(MovimientosDetalladosConstantesFunciones.NUMEROSECUENCIAL);
		elementnumero_secuencial.appendChild(document.createTextNode(movimientosdetallados.getnumero_secuencial().trim()));
		element.appendChild(elementnumero_secuencial);

		Element elementfecha_emision = document.createElement(MovimientosDetalladosConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(movimientosdetallados.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnombre_producto = document.createElement(MovimientosDetalladosConstantesFunciones.NOMBREPRODUCTO);
		elementnombre_producto.appendChild(document.createTextNode(movimientosdetallados.getnombre_producto().trim()));
		element.appendChild(elementnombre_producto);

		Element elementnombre_unidad = document.createElement(MovimientosDetalladosConstantesFunciones.NOMBREUNIDAD);
		elementnombre_unidad.appendChild(document.createTextNode(movimientosdetallados.getnombre_unidad().trim()));
		element.appendChild(elementnombre_unidad);

		Element elementcantidad = document.createElement(MovimientosDetalladosConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(movimientosdetallados.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementiva = document.createElement(MovimientosDetalladosConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(movimientosdetallados.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementcosto_unitario = document.createElement(MovimientosDetalladosConstantesFunciones.COSTOUNITARIO);
		elementcosto_unitario.appendChild(document.createTextNode(movimientosdetallados.getcosto_unitario().toString().trim()));
		element.appendChild(elementcosto_unitario);

		Element elementcosto_total = document.createElement(MovimientosDetalladosConstantesFunciones.COSTOTOTAL);
		elementcosto_total.appendChild(document.createTextNode(movimientosdetallados.getcosto_total().toString().trim()));
		element.appendChild(elementcosto_total);

		Element elementice = document.createElement(MovimientosDetalladosConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(movimientosdetallados.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementcodigo_producto = document.createElement(MovimientosDetalladosConstantesFunciones.CODIGOPRODUCTO);
		elementcodigo_producto.appendChild(document.createTextNode(movimientosdetallados.getcodigo_producto().trim()));
		element.appendChild(elementcodigo_producto);
	}
	
	public void generarReporteGroupGenericoMovimientosDetalladossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados=new ArrayList<MovimientosDetallados>();
		
		movimientosdetalladossSeleccionados=this.getMovimientosDetalladossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMovimientosDetallados(movimientosdetalladossSeleccionados);
		
		this.generarReporteMovimientosDetalladoss("Todos",movimientosdetalladossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMovimientosDetallados(ArrayList<MovimientosDetallados> movimientosdetalladossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(MovimientosDetallados movimientosdetalladosAux:movimientosdetalladossSeleccionados) {
				movimientosdetalladosAux.setsDetalleGeneralEntityReporte(movimientosdetalladosAux.toString());
			
				if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosdetalladosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosdetalladosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRESUCURSAL)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnombre_sucursal());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBRETRANSACCION)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnombre_transaccion());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnumero_secuencial());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(movimientosdetalladosAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREPRODUCTO)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnombre_producto());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_NOMBREUNIDAD)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getnombre_unidad());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(MovimientosDetalladosConstantesFunciones.LABEL_CODIGOPRODUCTO)) {
					existe=true;
					movimientosdetalladosAux.setsDescripcionGeneralEntityReporte1(movimientosdetalladosAux.getcodigo_producto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MovimientosDetalladosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMovimientosDetallados(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMovimientosDetallados=true;
				this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=true;
				this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=true;
			}
			
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=true;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=true;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=true;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=true;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=true;
			this.isVisibilidadCeldaModificarMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=true;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
			this.isVisibilidadCeldaModificarMovimientosDetallados=true;
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
			this.isVisibilidadCeldaCancelarMovimientosDetallados=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				} else {
					this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MovimientosDetalladosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMovimientosDetallados=true;
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=true;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=true;
		} else {
			this.actualizarEstadoPanelsMovimientosDetallados(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMovimientosDetallados=false;
			//this.isVisibilidadCeldaVerFormMovimientosDetallados=false;
			this.isVisibilidadCeldaDuplicarMovimientosDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!movimientosdetalladosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
		} else {
			this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
			this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!movimientosdetalladosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;												
			}
			
			this.jButtonCerrarMovimientosDetallados.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
		}
		
		if(!this.permiteMantenimiento(this.movimientosdetallados)) {
			this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
			this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoMovimientosDetallados=false;
		this.isVisibilidadCeldaNuevoRelacionesMovimientosDetallados=false;
		this.isVisibilidadCeldaGuardarCambiosMovimientosDetallados=false;
		//this.isVisibilidadCeldaModificarMovimientosDetallados=true;
		this.isVisibilidadCeldaActualizarMovimientosDetallados=false;
		this.isVisibilidadCeldaEliminarMovimientosDetallados=false;
		//this.isVisibilidadCeldaCancelarMovimientosDetallados=true;			
		this.isVisibilidadCeldaGuardarMovimientosDetallados=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMovimientosDetallados() {
	}
	
	public void actualizarEstadoPanelsMovimientosDetallados(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMovimientosDetallados!=null) {
				this.jScrollPanelDatosEdicionMovimientosDetallados.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMovimientosDetallados!=null) {
				this.jScrollPanelDatosMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelPaginacionMovimientosDetallados!=null) {
				this.jPanelPaginacionMovimientosDetallados.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
					this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.movimientosdetalladosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasMovimientosDetallados!=null) {
				this.jTabbedPaneBusquedasMovimientosDetallados.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesMovimientosDetallados!=null) {
				this.jPanelParametrosReportesMovimientosDetallados.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaCliente;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaTransaccion;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaLinea;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaLineaGrupo;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaLineaCategoria;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadBusquedaMovimientosDetallados=isParaLineaMarca;
			if(!this.isVisibilidadBusquedaMovimientosDetallados) {this.jTabbedPaneBusquedasMovimientosDetallados.remove(jPanelBusquedaMovimientosDetalladosMovimientosDetallados);}
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
			
			this.inicializarActualizarBindingTablaMovimientosDetallados(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMovimientosDetallados() {
		this.updateBorderResaltarBusquedasFormularioMovimientosDetallados();
		this.updateVisibilidadBusquedasFormularioMovimientosDetallados();
		this.updateHabilitarBusquedasFormularioMovimientosDetallados();
	}
	
	public void updateBorderResaltarBusquedasFormularioMovimientosDetallados() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasMovimientosDetallados.getComponents().length>0) {
	

		if(this.movimientosdetalladosConstantesFunciones.resaltarBusquedaMovimientosDetalladosMovimientosDetallados!=null) {
			index= this.jTabbedPaneBusquedasMovimientosDetallados.indexOfComponent(this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosDetallados.getComponent(index);
				jPanel.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarBusquedaMovimientosDetalladosMovimientosDetallados);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioMovimientosDetallados() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasMovimientosDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMovimientosDetallados.indexOfComponent(this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados);
			jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosDetallados.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarBusquedaMovimientosDetalladosMovimientosDetallados);
			if(!this.movimientosdetalladosConstantesFunciones.mostrarBusquedaMovimientosDetalladosMovimientosDetallados && index>-1) {
				this.jTabbedPaneBusquedasMovimientosDetallados.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioMovimientosDetallados() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasMovimientosDetallados.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasMovimientosDetallados.indexOfComponent(this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosDetallados.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.movimientosdetalladosConstantesFunciones.activarBusquedaMovimientosDetalladosMovimientosDetallados);
				this.jTabbedPaneBusquedasMovimientosDetallados.setEnabledAt(index,this.movimientosdetalladosConstantesFunciones.activarBusquedaMovimientosDetalladosMovimientosDetallados);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaMovimientosDetallados(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaMovimientosDetallados")) {
			index= this.jTabbedPaneBusquedasMovimientosDetallados.indexOfComponent(this.jPanelBusquedaMovimientosDetalladosMovimientosDetallados);

			this.jTabbedPaneBusquedasMovimientosDetallados.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasMovimientosDetallados.getComponent(index);

			this.movimientosdetalladosConstantesFunciones.setResaltarBusquedaMovimientosDetalladosMovimientosDetallados(resaltar);

			jPanel.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarBusquedaMovimientosDetalladosMovimientosDetallados);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarMovimientosDetallados.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioMovimientosDetallados() throws Exception {

		if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMovimientosDetallados();
		this.updateVisibilidadResaltarControlesFormularioMovimientosDetallados();
		this.updateHabilitarResaltarControlesFormularioMovimientosDetallados();
		
	}
	
	public void updateBorderResaltarControlesFormularioMovimientosDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.movimientosdetalladosConstantesFunciones.resaltaridMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltaridMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_empresaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_empresaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_sucursalMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_sucursalMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_clienteMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_clienteMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_transaccionMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_transaccionMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_lineaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_lineaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_grupoMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_grupoMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_categoriaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_categoriaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_marcaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarid_linea_marcaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emision_desdeMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_desdeMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emision_desdeMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emision_hastaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_hastaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emision_hastaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnombre_sucursalMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnombre_sucursalMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnombre_completo_clienteMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnombre_completo_clienteMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnombre_transaccionMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnombre_transaccionMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnumero_comprobanteMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnumero_comprobanteMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnumero_facturaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnumero_facturaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnumero_secuencialMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnumero_secuencialMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emisionMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarfecha_emisionMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnombre_productoMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnombre_productoMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarnombre_unidadMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarnombre_unidadMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarcantidadMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarcantidadMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarivaMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarivaMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarcosto_unitarioMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarcosto_unitarioMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarcosto_totalMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarcosto_totalMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltariceMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltariceMovimientosDetallados);}
		if(this.movimientosdetalladosConstantesFunciones.resaltarcodigo_productoMovimientosDetallados!=null && this.jInternalFrameDetalleFormMovimientosDetallados!=null) {this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setBorder(this.movimientosdetalladosConstantesFunciones.resaltarcodigo_productoMovimientosDetallados);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMovimientosDetallados() throws Exception {		
		if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
	
		//this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostraridMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelidMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostraridMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_empresaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_empresaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_empresaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_sucursalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_sucursalMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_clienteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_clienteMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_transaccionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_transaccionMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_lineaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_lineaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_lineaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_grupoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_linea_grupoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_grupoMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_categoriaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_linea_categoriaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_categoriaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_marcaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelid_linea_marcaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarid_linea_marcaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_desdeMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emision_desdeMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelfecha_emision_desdeMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emision_desdeMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_hastaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emision_hastaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelfecha_emision_hastaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emision_hastaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnombre_sucursalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_sucursalMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_completo_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnombre_completo_clienteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_completo_clienteMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnombre_transaccionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_transaccionMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_comprobanteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnumero_comprobanteMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_comprobanteMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_facturaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnumero_facturaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_facturaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_secuencialMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnumero_secuencialMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnumero_secuencialMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emisionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelfecha_emisionMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarfecha_emisionMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_productoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnombre_productoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_productoMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_unidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelnombre_unidadMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarnombre_unidadMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcantidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelcantidadMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcantidadMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarivaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelivaMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarivaMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcosto_unitarioMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelcosto_unitarioMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcosto_unitarioMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcosto_totalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelcosto_totalMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcosto_totalMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrariceMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPaneliceMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrariceMovimientosDetallados);
		//this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcodigo_productoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jPanelcodigo_productoMovimientosDetallados.setVisible(this.movimientosdetalladosConstantesFunciones.mostrarcodigo_productoMovimientosDetallados);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMovimientosDetallados() throws Exception {
		if(this.jInternalFrameDetalleFormMovimientosDetallados==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMovimientosDetallados!=null) {
	
		this.jInternalFrameDetalleFormMovimientosDetallados.jLabelidMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activaridMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_empresaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_empresaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_sucursalMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_clienteMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_transaccionMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_lineaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_lineaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_grupoMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_linea_grupoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_categoriaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_linea_categoriaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jComboBoxid_linea_marcaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarid_linea_marcaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_desdeMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarfecha_emision_desdeMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emision_hastaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarfecha_emision_hastaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_sucursalMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnombre_sucursalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_completo_clienteMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnombre_completo_clienteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_transaccionMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnombre_transaccionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_comprobanteMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnumero_comprobanteMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_facturaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnumero_facturaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnumero_secuencialMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnumero_secuencialMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jDateChooserfecha_emisionMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarfecha_emisionMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextAreanombre_productoMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnombre_productoMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldnombre_unidadMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarnombre_unidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcantidadMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarcantidadMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldivaMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarivaMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_unitarioMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarcosto_unitarioMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcosto_totalMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarcosto_totalMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldiceMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activariceMovimientosDetallados);
		this.jInternalFrameDetalleFormMovimientosDetallados.jTextFieldcodigo_productoMovimientosDetallados.setEnabled(this.movimientosdetalladosConstantesFunciones.activarcodigo_productoMovimientosDetallados);
		}
	}
	
		
}